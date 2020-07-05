# This sample for git submodules:

1) <i>Help command</i>:
- <b>git --help</b>
- <b>git --help command</b>

2) <i>For save user credentials</i>:
- <b>git config credential.helper store</b>
- use auth command

3) <i>For check remote</i>:
- <b>git remote -v</b>
- <b>git remote show 'remote'</b>

4) <i>For check current status</i>:
- <b>git status</b>

5) <i>For commit changes</i>:
- <b>git add <file></b> - for add to index
- <b>git rm <file></b> - for remove from index
- <b>git commit -a</b> - for auto add/remove to index
- <b>git commit -a -m "Message for commit"</b> - commit with message

6) <i>Add submodule to repository</i>:
- <b>git submodule add 'https://github.com/user/repository'</b>
- <b>git commit -am "Add submodule"</b>
- <b>git submodule init</b>
- <b>git submodule update</b>

7) <i>Remove submodule from repository</i>:
- <b>git config -f .gitmodules --remove-section submodule.SUBMODULE_NAME</b>
- <b>git add .gitmodules</b>
- <b>git submodule deinit -f SUBMODULE_NAME</b>
- <b>git rm --cached SUBMODULE_PATH</b>
- <b>git config -f .git/config --remove-section "submodule.SUBMODULE_NAME"</b>
- <b>rm -rf .git/modules/SUBMODULE_PATH</b>
- <b>git commit -m "Removed submodule"</b>
- <b>rm -rf PATH_TO_SUBMODULE</b>

8) <i>Get repository with submodules</i>:
- <b>git clone --recursive 'https://github.com/user/repository'</b>

9) <i>Update submodule</i>:
- <b>git submodule update --remote SUBMODULE_NAME</b>

10) <i>Add branch for submodule</i>:
- <b>git config -f .gitmodules submodule.SUBMODULE_NAME.branch BRANCH_NAME</b>

11) <i>Add summary for submodules</i>:
- <b>git config status.submodulesummary 1</b>