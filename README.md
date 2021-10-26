<br />
<div align="center">
  <a href="https://github.com/adriceniza/spongebobmerchancrud">
    <img src="images/spongebob-logo.png" alt="Logo" width="150" height="80">
  </a>

<h3 align="center">SpongeBob Clothes ORM AED</h3>

  <p align="center">
    ORM for AED
    <br />

  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        </li>
    <li><a href="#contact">Contact</a></li>
      </ul>

  </ol>
</details>

### Built With

- [Ionic](https://ionicframework.com)
- [spring.io](https://spring.io)
- [MySQL](https://www.mysql.com)
- [Angular](https://angular.io/)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- GETTING STARTED -->

## Getting Started

<br/>

<!-- PREREQUISITES -->

### Prerequisites

The database its on backend/database/spongebobdb.sql

Import the database to your system.

Open your IDE for Spring and run spring boot app.

If you didn't have installed yet , you have to go to the eclipse marketplace and install it from there .

Before start you have to go to the application.properties in the backend and change the user and password to match with your mysql credentials.

Then open the BACKEND folder in eclipse and run it.

Finally go to visual studio code , open the frontend folder , then to the next folder and in the terminal enter the following commnands :

<br/>
npm install 
<br/>
ionic serve

<br/>
Then all it's done , i hope you like it .
<br/>

##About the page

3 Tables

A table of shop products.
<br/>
A table of the basket products.
<br/>
A table of episodes.

In the frontend we can't add a product to the basket without having chosen a size before.

In the shop view we see all the products , and in the left top we see a 'Add 8 products' button , this button add the same 8 products all the time .

If we want to add a product to the basket we need to choose a size before .

All the products we add we'll be saved on the basket table and to see them we have the basket view in the top right of the screen .

In the basket view we see different things , two buttons to add and remove units of the same product , if we remove a unit and we just have one , this will be removed of the basket.

We see a button to change the size selected.

And a button to remove the product , no matter how much units we have , this button remove all of them.

In the episodes section we see different episodes of spongebob , the only interaction with this table is the like button , this button change the image to show us if we like it or not.

In the remove units button if units are 0 or less we remove the product automatically.

THANKS FOR YOUR TIME ! I HOPE YOU LIKE IT.

<!-- CONTACT -->

## Contact

Adrián Ceniza - ceniiziienta@gmail.com

Project Link: [https://github.com/adriceniza/spongebobmerchancrud](https://github.com/adriceniza/spongebobmerchancrud)

<p align="right">(<a href="#top">back to top</a>)</p>
