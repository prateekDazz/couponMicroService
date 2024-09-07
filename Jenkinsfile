pipeline
{
    agent any 
   
    environment
    {
        VERSION_NAME = "1.34"
    }

    stages
    {
        stage("compile")
        {

            steps
                {

                    sh 'javac src/main/java/com/coupon/coupon/controller/CouponController.java '
                    sh 'echo "${VERSION_NAME}"'
                }
        }
        stage("run")
        {
            steps
            {
                sh 'echo Java Run'
            }
        }

    }

    post
    {
        success
        {
            sh 'echo "build success"'
        }
        always
        {
            sh 'echo "always execute" '
        }
    }
}
