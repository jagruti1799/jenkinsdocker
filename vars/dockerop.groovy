import com.jagruti.DockerOp
def call () {
    def dop = new DockerOp()
    dop.dockerBuild()
    dop.dockerPush()
    dop.dockerDeploy()
}