fun main (){
    /* Die Aufgabe wurde auch mit einer Interaktion zwischen dem User
    und dem Bankterminal ! Hier wird nach der Buchung der Tickets am Bankterminal
    eine Kontoabfrage gemacht und ein Kontoauszug der Sparkasse gedruckt ! Befolge die Anwesiungen
    so gut wie möglich , Frage bitte den Kontostand ab ! Viel Spass
     */
    var konto = 1000.00
    var flugTicket    = 595.00
    var aktuellerKonto = konto - flugTicket
    println("\u001B[7m\u001B[1mWillkommen , wählen sie zwischen den folgenden Optionen\u001B[0m ")
    println("\n-\u001B[32mKontostand\u001B[0m\u001B[32m\n-Geld abheben\u001B[0m\u001B[32m\n-Geld einzahlen\u001B[0m")
    println("\n\u001B[7m\u001B[1mTrage einer dieser Option ein um weiter zukommen!\u001B[0m")
    var anliegen = readln()
    println("Aktueller Kontostand:\n\u001B[1m\u001B[32m\u001B[1m$aktuellerKonto€\u001B[0m")
    println("\n\u001B[1m\u001B[7mMöchten Sie ihren Kontostand ausdrucken ?\u001B[0m")
    var drucken = readln()
    println("\u001B[7m\nKontonummer\t987654321\t\t\t\t\t\tBankleitzahl\t\t\t100500\n\u001B[31m\u001B[7m\n\u001B[1mSparkasse Stuttgart")
    println("\u001B[7mBuTag\tWert\t\tVerwendungszweck\t\tBuchungsnummer\t\t\t")
    println("\u001B[7m\t\t\t\t\t\t\t\t\t\tAlter Kontostand EUR\t\t\u001B[1m1000.00+")
    println("\u001B[0m\u001B[7m\n\n2711\t2711\t\tRg.-Nr.86/W\t\t\t\t\t952124\t\t\t\t\u001B[1m595,00-")
    println("\t\t\t\t\t4+Flucgtickets \n\t\t\t\t\tAli Airlines")
    println("\u001B[0m\u001B[7m\u001B[31mKontostand kann Beträge mit späteren Wertstellung beinhalten, s.Rückseite")
    println("\n\t\t\t\t\t\t\t\t\t\t\t\u001B[7m\u001B[1mNeuer Kontostand EUR\t\u001B[1m405.00+")
}