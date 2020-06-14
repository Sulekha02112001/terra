job("job2"){
    description("setup of complete encironment using terraform code ")
  
    scm {
               github('Sulekha02112001/terra','master')
       }
  
    triggers {
             scm("* * * * *")
    }

    steps {
    batchFile(readFileFromWorkspace('terraform init'))
    batchFile(readFileFromWorkspace('terraform apply -auto-approve'))
  }

}
