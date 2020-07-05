# This sample for git submodules:

1) <i>Help command</i>:
- <b>git --help</b>
- <b>git --help command</b>

2) <i>For save user credentials</i>:
- <b>git config credential.helper store</b>
- use auth command

3) <i>For check remote branches</i>:
- <b>git remote -v</b>

4) <i>For check current status</i>:
- <b>git status</b>

5) <i>For commit changes</i>:
- <b>git add <file></b> - for add to index
- <b>git rm <file></b> - for remove from index
- <b>git commit -a</b> - for auto add/remove to index
- <b>git commit -a -m "Message for commit"</b> - commit with message

6) <i>Remove submodule from repository</i>:
- <b>git config -f .gitmodules --remove-section "submodule.submodule_name"</b>
- <b>git add .gitmodules</b>
- <b>git submodule deinit -f "submodule_name"</b>
- <b>git rm --cached "path_to_submodule"</b>
- <b>rm -rf .git/modules/path_to_submodule</b>
- <b>git commit -m "Removed submodule <name>"</b>
- <b>rm -rf path_to_submodule</b>