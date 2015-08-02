#!/usr/bin/env zsh

lein npm install && \
    mkdir -pv resources/cljs-nodejs-externs/externs && \
    cp additions/*.js resources/cljs-nodejs-externs/externs && \
    cp node_modules/closurecompiler-externs/**/*.js resources/cljs-nodejs-externs/externs
