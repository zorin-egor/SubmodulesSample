# This sample for git submodules:

## Common

1) <i>Help command</i>:
- <b>git --help "command"</b>

2) <i>User credentials</i>:
- <b>git config credential.helper store</b>
- use auth command

3) <i>Remote info</i>:
- <b>git remote -v</b>
- <b>git remote show 'remote'</b>

4) <i>Current status</i>:
- <b>git status</b>

5) <i>Branch command</i>:
- <b>git branch -v</b> - show all branches
- <b>git branch --delete 'BRANCH_NAME'</b> - delete branch or current
- <b>git branch --force BRANCH_NAME HASH</b> - reset BRANCH_NAME to HASH

6) <i>Checkout branch/hash</i>:
- <b>git checkout BRANCH_NAME</b> - checkout to HEAD of branch
- <b>git checkout HASH</b> - checkout to HASH for detach HEAD
- <b>git checkout -b BRANCH_NAME</b> - create new branch

7) <i>Commit changes</i>:
- <b>git add <file></b> - for add to index
- <b>git rm <file></b> - for remove from index
- <b>git commit -a</b> - for auto add/remove to index
- <b>git commit -am "Message for commit"</b> - commit with message


## Submodules

1) <i>Add submodule to repository</i>:
- <b>git submodule add 'https://github.com/user/repository'</b>
- <b>git commit -am "Add submodule"</b>
- <b>git submodule init</b> - add submodules to gitconfig
- <b>git submodule update '--remote --merge "SUBMODULE_NAME"'</b> - analog pull for submodules

2) <i>Remove submodule from repository</i>:
- <b>git config -f .gitmodules --remove-section submodule.SUBMODULE_NAME</b>
- <b>git add .gitmodules</b>
- <b>git submodule deinit -f SUBMODULE_NAME</b>
- <b>git rm --cached SUBMODULE_PATH</b>
- <b>git config -f .git/config --remove-section "submodule.SUBMODULE_NAME"</b>
- <b>rm -rf .git/modules/SUBMODULE_PATH</b>
- <b>git commit -m "Removed submodule"</b>
- <b>rm -rf PATH_TO_SUBMODULE</b>

3) <i>Get repository with submodules</i>:
- <b>git clone --recursive 'https://github.com/user/repository'</b>

4) <i>Update submodule</i>:
- <b>git submodule update '--remote --merge "SUBMODULE_NAME"'</b>
- <b>git submodule update '--remote --rebase "SUBMODULE_NAME"'</b>

5) <i>Add branch for submodule</i>:
- <b>git config -f .gitmodules submodule.SUBMODULE_NAME.branch BRANCH_NAME</b>

6) <i>Add summary for submodules</i>:
- <b>git config status.submodulesummary 1</b>

7) <i>Foreach for submodules</i>:
- <b>git submodule foreach 'git command'</b>