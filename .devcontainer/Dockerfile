FROM mcr.microsoft.com/devcontainers/base:debian

RUN apt-get update && apt-get install -y curl
RUN curl https://mise.run | sh

# Set mise in the PATH
#ENV PATH="/root/.local/share/mise/bin:/root/.local/share/mise/shims:$PATH"
