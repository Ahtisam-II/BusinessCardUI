This app displays a business card <br>
uploaded using git <br> 
some useful git commads <br> 


Some basic Git commands for cloning a repository from remote to local, 
committing changes, and initializing a repository locally before uploading to a remote repository.
Cloning from Remote to Local and Committing Changes<br>
Clone a repository:
```PowerShell
git clone <repository-url>
```
Example:
```PowerShell
git clone https://github.com/user/repository.git
```

Check the status of the repository:
```PowerShell
git status
```
Add changes to the staging area:
```PowerShell
git add <file>
```
Add all changes:
```PowerShell
git add --all
```
Commit changes:
```PowerShell
git commit -m "Your commit message"
```
Push changes to the remote repository:
```PowerShell
git push origin <branch-name>
```
Example:
```PowerShell
git push origin main
```
Initializing Locally and Uploading to Remote
Initialize a new Git repository:
```PowerShell
git init
```
Add a remote repository:
```PowerShell
git remote add origin <repository-url>
```
Example:
```PowerShell
git remote add origin https://github.com/user/repository.git
```
Check the status of the repository:
```PowerShell
git status
```
Add changes to the staging area:
```PowerShell
git add <file>
```
Add all changes:
```PowerShell
git add --all
```
Commit changes:
```PowerShell
git commit -m "Initial commit"
```
change the default branch name from master to main
```PowerShell
git branch -M main
```
Push changes to the remote repository:
```PowerShell
git push -u origin <branch-name>
```
Example:
```PowerShell
git push -u origin main
```
Other Useful Commands

Create a new branch:
```PowerShell
git branch <branch-name>
```
Switch to a branch:
```PowerShell
git checkout <branch-name>
```
Merge a branch into the current branch:
```PowerShell
git merge <branch-name>
```
Pull the latest changes from the remote repository:
```PowerShell
git pull origin <branch-name>
```
View the commit history:
```PowerShell
git log
```
Remove a file from the staging area:
```PowerShell
git reset <file>
```
Unstage everything (use with caution):
```PowerShell
git reset
```
Revert changes in the working directory:
```PowerShell
git checkout -- <file>
```
