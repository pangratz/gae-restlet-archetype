## About

This Maven Archetype creates a GAE project, preconfigured with the [Restlet](http://www.restlet.org/) RESTful web framework.

## Usage

* create a new project using the new archetype via

		mvn archetype:generate \
		  -DarchetypeGroupId=com.pangratz \
		  -DarchetypeArtifactId=gae-restlet-archetype \
		  -DarchetypeVersion=0.0.2 \
		  -DremoteRepositories=http://pangratz.github.com/gae-restlet-archetype/repository
		
* drink beer, wine or both

## Characteristics

* GAE version 1.5.4
* Restlet version 2.0.8



-------------



# Developing

## Local installation

* checkout project via

               git clone git@github.com:pangratz/gae-restlet-archetype.git
               cd gae-restlet-archetype
               
* install as a new maven archetype

               mvn install

## Releasing

1. Release new version/snapshot

 	1.1. Release either a new snapshot ...

		mvn clean deploy -P deploy-snapshot

 	1.2. or a new version

		mvn release:clean release:prepare
		mvn release:perform		
		
	... and update the `-DarchetypeVersion` in the `Usage` section of `README.md`
	
2. Update maven repository

		git checkout gh-pages
		./update-directory-index.sh
		git add .
		git commit
		git push