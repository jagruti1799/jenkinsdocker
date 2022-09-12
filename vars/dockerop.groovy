import com.jagruti.DockerOp
def call (config =[:]) {
    def dop = new DockerOp(config.script)
    dop.dockerBuild()
    dop.dockerPush()
    dop.dockerDeploy()
    println("done")
}
