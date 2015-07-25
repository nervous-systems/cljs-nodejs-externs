#!/bin/sh

lein npm install && \
    mkdir -pv resources/cljs-nodejs-externs/externs && \
    cp node_modules/nodejs-externs/externs/*.js resources/cljs-nodejs-externs/externs
