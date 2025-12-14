#!/bin/bash

#today=`date '+%m-%d-%Y %H:%M:%S'`
#echo [$today]

#day=$(date +"%u")  # 1=Mon, 7=Sun

hour=$(date +"%H")
echo [$today]
hour_sound = home/pi/Chime/src/chimes/$hour.wav
echo hour_sound

#aplay /home/pi/Chime/src/chimes/chime.wav
# aplay /home/pi/Chime/src/chimes/.wav

