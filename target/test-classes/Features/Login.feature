Feature: Verifying Adactin hotel login Details

  Scenario Outline: Verifying Adactin hotel login with valid credentials
    Given User is on the Adactin hotel page
    When User should login "<username>", "<password>"
    And User should SearchHotel "<location>", "<hotels>", "<roomType>", "<NoOfRooms>", "<checkInDate>", "<checkOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    And User should SelectHotel
    And User should BookHotel "<firstName>", "<lastName>", "<address>", "<CCNo>", "<CCType>", "<CCMonth>", "<CCYear>", "<CVVNo>"
    Then User Should print OrderId

    Examples: 
      | username   | password | location  | hotels         | roomType | NoOfRooms | checkInDate | checkOutDate | AdultPerRoom | ChildrenPerRoom | firstName | lastName | address                  | CCNo              | CCType      | CCMonth | CCYear | CVVNo |
      | greens8767 | L4R739   | Sydney    | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/10/2022   | 2 - Two      | 1 - One         | Siva      | Prasath  | OMR                      |  1234567890123456 | VISA        | May     |   2022 |   123 |
      | Greens8767 | L4R739   | Melbourne | Hotel Sunshine | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | Ram       | R        | 34, ECR road, Chennai    |  5423467891023654 | Master Card | June    |   2022 |  3456 |
      | Greens8767 | L4R739   | Brisbane  | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | Siva      | sankar   | 56, OMR road, Chennai    |  1678967891023654 | VISA        | May     |   2022 |  8333 |
      | Greens8767 | L4R739   | Sydney    | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | hari      | ram      | 77, Mount road, Chennai  |  3452167891023654 | Master Card | June    |   2022 |  5423 |
      | Greens8767 | L4R739   | Melbourne | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | Novfeel   | m        | 09, Mount road, Chennai  |  9851267891023654 | VISA        | May     |   2022 |  9823 |
      | Greens8767 | L4R739   | Sydney    | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | Sundar    | raj      | 3, Mount road, Chennai   | 58912567891023654 | Master Card | June    |   2022 |  5434 |
      | Greens8767 | L4R739   | Brisbane  | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | siva      | ram      | 123, Mount road, Chennai |  8834567891023654 | VISA        | May     |   2022 |  5789 |
      | Greens8767 | L4R739   | Melbourne | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | akash     | rajesh   | 123, Mount road, Chennai |  9112567891023654 | Master Card | May     |   2022 |  9001 |
      | Greens8767 | L4R739   | New York  | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | sathya    | DS       | 123, Mount road, Chennai | 88654567891023654 | VISA        | May     |   2022 |  5646 |
      | Greens8767 | L4R739   | Sydney    | Hotel Creek    | Double   | 2 - Two   | 30/09/2022  | 01/09/2022   | 2 - Two      | 1 - One         | Murugan   | siva     | 123, Mount road, Chennai |  2889567891023654 | VISA        | May     |   2022 |  8474 |
