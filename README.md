First time git (bash) setup on windows 11 machine
- download git bash installer (from here: https://git-scm.com/downloads)
- install on your local (choose sensible options while installation)
- Configure git global configs
```
git config --global user.email "you@example.com"
git config --global user.name "Your Name"
git config --global core.autocrlf true
```
- check the global configs
```
git config --global --list
```
- note 1: if you hit list command before configuring any property you might get error -- fatal: unable to read config file 'C:/Users/kanad/.gitconfig': No such file or directory
- note 2: you can also choose to manually create above mentioned empty .gitconfig file on above mentioned location. And then execute commands to set properties

------------------------------------

- create an empty repository on git hub
- create a directory with same name on your local machine
- put some code or test files in that directory
- execute below git command
```
git init
git status
git add .
git commit -m 'first commit'
git branch -M master
git remote add origin https://github.com/simpleDev24/user.git
git push -u origin master
```

------------------------------------

Service discovery

- Consul Service discovery
-- service advertisement/registration in consul
-- discovery and calling of service using RestTemplate
-- discovery and calling of service using OpenFeign
-- Only discovery but no own service advertisement/registration

- Externalization of configurations using consul KV
-- override from consul
-- auto reload/refresh from consul
-- Git 2 consul -- this software works only on linux machine (or using docker). However I dont have docker right now, so could not test this.