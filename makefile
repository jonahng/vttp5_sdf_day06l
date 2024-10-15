makefile creates commands for your command prompt to run, centralising all the commands
it can help to compile all your java files into class files, or run it.

SRC_DIR = src
PORT_NO = 3000
HOSTNAME = localhost
CLIENT_APP = sg.edu.nus.client.CLIENT_APP
SERVER_APP = sg.edu.nus.server.SERVER_APP

all: ${OUT_DIR} compile

