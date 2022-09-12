import com.jagruti.DockerOp
def call (map confi =[]) {
    def dop = new DockerOp(config.script)
    dop.dockerBuild()
    dop.dockerPush()
    dop.dockerDeploy()
    println("done")
}
