#!/bin/bash

#today=`date '+%m-%d-%Y %H:%M:%S'`
#echo [$today]

#day=$(date +"%u")  # 1=Mon, 7=Sun

hour=$(date +"%-H")
folder="/home/pi/Chime/src/chimes"
#echo $hour
hour_sound="${folder}/${hour}.wav"
#echo $hour_sound

aplay /home/pi/Chime/src/chimes/chime.wav
aplay $hour_sound
