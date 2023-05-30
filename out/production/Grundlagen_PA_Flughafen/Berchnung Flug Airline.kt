fun main (){
    /*Hier ging es um die Verlust Rechnung ! Ichhabe hier nochmal ein Rechenweg
    zusätzlich berechnet , wieviel das Ticket kosten muss das ein Gewinn
    erzielt  wird !
     */

    val sitzPlatz = 130
    var passenGer = 4
    var platz = sitzPlatz/passenGer
    var kontiGent = 25*4
    var verPlatz = sitzPlatz-kontiGent
    var euroProkm = 16
    val strecke = 1034.93
    var kostenFg= euroProkm*strecke
    var ticketKostet = 125
    var einahMen = sitzPlatz*ticketKostet
    var verlust = einahMen- kostenFg
    var preis = verlust/verPlatz
    preis = 10.296000000000033
    var ticketPreisNeu = ticketKostet+preis
    println("\n\t------\u001B[7m\u001B[33mFlugkosten Bericht ALI AIRLINES\u001B[0m------")
    println("\n\t\u001B[7m\u001B[32m\u001B[4mAnzahl der Familien:\t\u001B[1m$platz\u001B[0m\n\t\u001B[7m\u001B[32m\u001B[4mFreie Plätze:\t\t\t\u001B[1m\u001B[4m$verPlatz\u001B[0m")
    println("\t\u001B[7m\u001B[32m\u001B[4mEinnahmen:\t\t\t\u001B[1m\u001B[4m$einahMen€\u001B[0m")
    println("\t\u001B[7m\u001B[31mAusgaben:\t\t \u001B[1m$kostenFg€\u001B[0m")
    println("\n\t\u001B[7m\u001B[31mVerlust:\t\t\u001B[1m\u001B[1m$verlust€\u001B[0m")
    println("\n\t\u001B[31mDas Angebot von 125 € pro ticket ist ein Minus für die Flugessellschaft\u001B[0m")
    println("\n\t\u001B[32mUm ein Gewinn daraus zu erzielen müsste das Ticket pro Person $ticketPreisNeu€ kosten\u001B[0m")

}