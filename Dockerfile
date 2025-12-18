FROM mcr.microsoft.com/devcontainers/base:alpine-3.20

# Install dependencies for mise
RUN apk add --no-cache curl bash

# Install mise
RUN curl https://mise.run | sh

# Add mise to PATH for the 'vscode' user (standard in devcontainers)
USER vscode
RUN echo 'eval "$(~/.local/bin/mise activate bash)"' >> ~/.bashrc
RUN echo 'eval "$(~/.local/bin/mise activate zsh)"' >> ~/.zshrc
