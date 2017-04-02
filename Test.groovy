freeStyleJob('example') {
    
    scm {
        git('https://github.com/Uthappa/Com.mybank.online.git', 'master')
    }
  
    steps {
        steps {
        shell('python script.py')
    }
    }
   
}
