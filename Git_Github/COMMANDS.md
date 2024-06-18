## Comandos Git - Autor/Aluno Lucas E. Dickmann

Este arquivo README.md serve como guia rápido para os comandos Git mais importantes.

**Alguns Comandos:**

- **`git push`**: Envia as alterações do seu repositório local para o repositório remoto.
- **`git pull`**: Baixa as alterações mais recentes do repositório remoto e as integra com o seu repositório local.
- **`git fetch`**: Baixa as alterações mais recentes do repositório remoto, mas não as integra com o seu repositório local.
- **`git add ./README.md`**: Adiciona a modificação do arquivo README.md à área de staging.
- **`git status`**: Mostra o status do seu repositório local, incluindo arquivos modificados, adicionados e com conflito.
- **`git commit -m "Mensagem"`**: Salva as alterações da área de staging em um novo commit com a mensagem especificada.
- **`git diff`**: Mostra as diferenças entre o estado atual do seu repositório e a última versão commitada.
- **`git log`**: Mostra o histórico de commits do seu repositório.
- **`git restore --staged README.md`**: Remove o arquivo README.md da área de staging, mantendo as alterações no arquivo.
- **`git cherry-pick`**: Aplica um commit específico de outro ramo para o ramo atual.
- **`git merge --abort`**: Cancela o processo de merge iniciado, revertendo para o estado anterior.

**Explicando os Comandos:**

**`git push`**: É utilizado para compartilhar as suas alterações com outros colaboradores, enviando-as para o repositório remoto.

**`git pull`**: É utilizado para manter o seu repositório local atualizado com as últimas alterações do repositório remoto. Ele faz um fetch seguido de um merge, integrando as alterações do repositório remoto com o seu repositório local.

**`git fetch`**: É utilizado para baixar as últimas alterações do repositório remoto sem integrá-las com o seu repositório local. Isso permite que você veja as alterações mais recentes antes de decidi-los integrar com o seu trabalho.

**`git add ./README.md`**:  Adiciona o arquivo README.md à área de staging, preparando-o para ser commitado.

**`git status`**: Mostra o status do seu repositório local, informando sobre os arquivos que foram modificados, adicionados ou excluídos desde o último commit.

**`git commit -m "Mensagem"`**:  Cria um novo commit com as alterações da área de staging, incluindo a mensagem que descreve as mudanças.

**`git diff`**: Mostra as diferenças entre o estado atual do seu repositório e a última versão commitada. Isso permite que você veja quais arquivos foram modificados e quais mudanças foram feitas.

**`git log`**:  Exibe o histórico de commits do seu repositório. Isso permite que você veja as datas, autores e mensagens dos commits.

**`git restore --staged README.md`**:  Remove o arquivo README.md da área de staging, mantendo as alterações no arquivo. Isso permite que você remova um arquivo da área de staging se você não quiser commitar as alterações.

**`git cherry-pick`**: Aplica um commit específico de outro ramo para o ramo atual. Isso permite que você mova commits de um ramo para outro.

**`git merge --abort`**:  Cancela o processo de merge iniciado, revertendo para o estado anterior. Isso permite que você reverta o merge se ele causar conflitos.

**Exemplo Básico:**

```
git add ./README.md     # Adiciona as modificações no README.md à área de staging.
git commit -m "Atualiza o README.md"  # Salva as alterações no repositório local com uma mensagem.
git push                 # Envia as alterações para o repositório remoto.
```
