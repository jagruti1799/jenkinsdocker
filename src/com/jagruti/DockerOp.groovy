package com.jagruti

class DockerOp
{
    def script;
    DockerOp(jenscript)
    {
        script=jenscript
        jenscript.echo "class init"
    }
    def dockerBuild()
    {
        jenscript.echo "class Build"
    }

    def dockerPush()
    {
        jenscript.echo "class Pushed"
    }

    def dockerDeploy()
    {
        print("hello Deploy")
    }
}