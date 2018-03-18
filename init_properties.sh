#!/bin/bash -x
set -e

LOCAL_PATH=`pwd`
export CONFIG_PATH=/tmp/config-properties

if [ ! -d "$CONFIG_PATH" ] || [ "$REPLACE_CONFIG" == "true" ]; then
  git config --global user.email "richard.lopez@whatever.com"
  git config --global user.name "Richard Lopez"
  rm -rf $CONFIG_PATH
  mkdir -p $CONFIG_PATH
  cp config-properties/* $CONFIG_PATH
  cd $CONFIG_PATH
  git init .
  git add -A .
  git commit -m "Add .properties files"
  cd $LOCAL_PATH
fi
