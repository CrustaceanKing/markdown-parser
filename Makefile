markParse2.class: markParse2.java
	javac markParse2.java

MarkdownParseTest.class: MarkdownParseTest.java markParse2.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	
