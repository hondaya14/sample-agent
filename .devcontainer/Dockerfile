FROM mcr.microsoft.com/devcontainers/base:debian

RUN sudo apt update -y && sudo apt install -y curl

RUN sudo install -dm 755 /etc/apt/keyrings
RUN curl -fSs https://mise.jdx.dev/gpg-key.pub | sudo tee /etc/apt/keyrings/mise-archive-keyring.pub 1> /dev/null
RUN echo "deb [signed-by=/etc/apt/keyrings/mise-archive-keyring.pub arch=arm64] https://mise.jdx.dev/deb stable main" | sudo tee /etc/apt/sources.list.d/mise.list
RUN sudo apt update -y
RUN sudo apt install -y mise
