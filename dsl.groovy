job("job2"){
    description("setup of complete encironment using terraform code ")
  
    scm {
               github('Sulekha02112001/terra','master')
       }
  
    triggers {
             scm("* * * * *")
    }

  steps {
    batchFile('Xcopy /E /I  *  C:/Users/sulek/Documents/tera/job/')
    batchFile('cd C:/Users/sulek/Documents/tera/job/')
    batchFile('terraform init')
    batchFile('terraform apply -auto-approve')
  }

}
