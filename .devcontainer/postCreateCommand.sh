#!/bin/bash
pushd ..
chown -R root:root sample-agent/
popd
mise trust
mise install