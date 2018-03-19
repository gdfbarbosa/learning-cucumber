Feature: How a calculator sums two values

Scenario Outline: sum
Given Given <x> and <y>
When I sum <x> and <y>
Then I get <result>

Examples:
| x    |  y  | result |
| 1    |  1  |  2     |
| 1    |  2  |  3     |
| 2    |  2  |  4     |
| 3    |  2  |  5     |
| 1    |  5  |  6     |
| 3    |  7  |  10    |
| 7    |  4  |  11    |
| 7    |  6  |  13    |