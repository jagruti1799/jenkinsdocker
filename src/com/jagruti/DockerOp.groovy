package com.jagruti

class DockerOp
{
    def script;
    DockerOp(jenscript)
    {
        script=jenscript
        script.echo "class init"
    }
    def dockerBuild()
    {
        script.echo "class Build"
    }

    def dockerPush()
    {
        script.echo "class Pushed"
    }

    def dockerDeploy()
    {
        print("hello Deploy")
    }
}