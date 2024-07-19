This app displays a business card <br>
uploaded using git <br> 
some useful git commads <br> 

Clone a repository:
git clone <repository-url>
Example:
git clone https://github.com/user/repository.git


Check the status of the repository:
git status
Add changes to the staging area:
git add <file>

Add all changes:
git add --all

Commit changes:
git commit -m "Your commit message"

Push changes to the remote repository:
git push origin <branch-name>
Example:
git push origin main


Initializing Locally and Uploading to Remote

Initialize a new Git repository:
git init

Add a remote repository:
git remote add origin <repository-url>
Example:
git remote add origin https://github.com/user/repository.git

Check the status of the repository:
git status

Add changes to the staging area:
git add <file>

Add all changes:
git add --all

Commit changes:
git commit -m "Initial commit"

Push changes to the remote repository:
git push -u origin <branch-name>
Example:
git push -u origin main


Other Useful Commands

Create a new branch:
git branch <branch-name>

Switch to a branch:
git checkout <branch-name>

Merge a branch into the current branch:
git merge <branch-name>

Pull the latest changes from the remote repository:
git pull origin <branch-name>

View the commit history:
git log

Remove a file from the staging area:
git reset <file>

Unstage everything (use with caution):
git reset

Revert changes in the working directory:
git checkout -- <file>

These commands cover the basics of working with Git for cloning, committing, initializing, and pushing changes.
