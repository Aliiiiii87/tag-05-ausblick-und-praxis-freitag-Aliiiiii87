fun main(){

    /* Die Aufgabe wurde mit einer Interaktion gelöst ! Der User geht zu einem Flugterminal!
       Dort gibt es eine Ticket abfrage ! Anzahl und Preis ! Bitte befolge die Anweisungen !
       Anzahl der tickets kann Variert werden ! Bitte trage die Flugnummer ein die das Terminal
       printed ! In der Interaktion kauft der User Tickets und zahlt sie auch gleich bekommt
       dann den Boarding Pass gedruckt ! Benutze ruhig deinen Namen und befolge die Anweisungen
       und hab viel Spass :-)
     */

    println("\t\t\t-----\u001B[1m\u001B[32m\u001B[7mHerrzlick Willkommen beim Flugticketkauf\u001B[0m-----")
    println("\n\u001B[36m\u001B[1mWie wiele Tickets benötigen Sie?\u001B[0m")
    var tickeTs = readln()
    var ticket1 = 125
    var ticketAlle = ticket1 * tickeTs.toDouble()
    println("\u001B[36m\u001B[1mSie zahlen:\u001B[0m \n\n\u001B[1mpro Flugticket:\t\u001B[31m\t\u001B[7m$ticket1€\u001B[0m \n\nfür 4 Flugtickets: \u001B[7m\u001B[31m\t\u001B[1m$ticketAlle€\u001B[0m ")
    println("\n\u001B[36m\u001B[1mTragen Sie Ihren Vor und Nachnamen Ein\u001B[0m")
    var vorNach = readln()
    println("\u001B[36m\u001B[1mTargen Sie ihr Geburtsdatum ein\u001B[0m")
    var birthDay = readln()
    println("\u001B[36m\u001B[1mSchreiben Sie kaufen um die Tickets zu Buchen\u001B[0m")
    var kaufen = readln()
    println("\u001B[36m\u001B[1mWählen Sie ihr Zahlungmittel :EC/MASTER CARD/ VISA / American Express\u001B[0m")
    var  card =  readln()
    var cardType = "EC or MASTER CARD or VISA or American Express"
    val mwst1 = 0.19
    var preisMwst = ticketAlle * mwst1
    var mwst2 = ticketAlle+preisMwst
    print("\nEs werden Insgesamt:______\u001B[1m\u001B[7m\u001B[31m$mwst2€\u001B[0m \nvon ihrem Guthaben abgezogen")
    print("\n\nMöchten Sie ein Beleg ?\n\n(Mit OK Bestätigen)")
    var bestätigen = readln()
    print("\n\t\u001B[7m----------\u001B[1mBELEG-------------\u001B[0m")
    print("\n\t\u001B[7m4 Flugtickets a \u001B[1m$ticket1€\t\t\u001B[0m\u001B[0m\u001B[0m\n\t\u001B[7mInsgesamt: \t\t\u001B[1m$ticketAlle€\t\t\u001B[0m\u001B[0m\n\t\u001B[1m\u001B[7mMwst : \t\t\t19%\t\t\t\u001B[0m")
    println("\n\t\u001B[7mTotal:\t\t\t\u001B[1m$mwst2€\t\t\u001B[0m")
    println("\nIhre Flugnummer lautet \u001B[32mADDE123\u001B[0m")
    var passengerName = "Ali Onur Aksoy"
    val flightNo = "ABCD123"
    var from = "Stuttgart"
    var to = "Paris"
    var date = "17.03.2023"
    var departTime = "16:30"
    var seat = "28A"
    var classS= "M"
    println("\n\n-----Herrzlich Willkommen bei ihrem Flugterminal ALI AIRLINES\n\nBitte geben sie ihre Flugnummer ein:")
    var flugnummer = readln()
    println("Hallo $vorNach\n\nDrucken eintippen um Boarding Pass zu drucken !")
    var weiter= readln()
    println("\u001B[7m--------------BOARDING PASS   ALI AIRLINES---------------\u001B[0m")
    println("NAME OF PASSENGER---------$vorNach\nFLIGHTNO------------------$flugnummer")
    println("From:$from------------To:$to")
    println("DATE:\u001B[32m\n$date\u001B[0m\nDEPARTURE TIME:\u001B[31m\n16:30\u001B[0m")
    println("Seat:\u001B[32m\n28A\u001B[0m\nClASS:\u001B[32m\n$classS\u001B[0m")
    println("\u001B[7mBitte entnehmen sie ihr Boardingpass\u001B[0m \nGood Flight :-)")

}
