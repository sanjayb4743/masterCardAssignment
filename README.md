# masterCardAssignment
Assignment for Master Card

Code:

https://github.com/sanjayb4743/masterCardAssignment/tree/sanjayBranch/demo-1

Mastercard Challenge
Author -Sanjay Bollampally

Summary
This application is deployed as a Spring Boot App that expose the endpoint:

http://localhost:8080/connected?origin=city1&destination=city2

It responds with 'yes' if city1 is connected to city2. Otherwise it responds with 'no'.

The application loads all information from city.txt into a a hashset.

We are saving all of the connections in this hashmap in both directions. Example city.txt:

Boston, New York
Philadelphia, Newark
Newark, Boston
Trenton, Albany

Will save as this set as:

{
Boston, New York
Philadelphia, Newark
Newark, Boston
Trenton, Albany
}

Everything is saved in lowercase to compare ignoring case.


Self referenced cities
What to do if the user asks if city1 is connected to city1? And city1 is not in the hashmap at all?

For example, you have the standard city.txt:

Boston, New York
Philadelphia, Newark
Newark, Boston
Trenton, Albany
And this query comes in:




