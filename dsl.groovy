job("job2"){
    description("setup of complete encironment using terraform code ")
  
    scm {
               github('Sulekha02112001/terra','master')
       }
  
    triggers {
             scm("* * * * *")
    }

  steps {
  batchFile('Xcopy /E /I  *  C:/Users/sulek/Documents/tera/job/','cd C:/Users/sulek/Documents/tera/job/', 'terraform init','terraform apply -auto-approve')
  }

}
