class Solution {
    fun reorderLogFiles(logs: Array<String>): Array<String> {
        val letterList = mutableListOf<String>()
        val digitList = mutableListOf<String>()

        for (log in logs) {
            if(log[log.length - 1].isDigit()) {
                digitList.add(log)
            } else {
                letterList.add(log)
            }
        }

        letterList.sortWith(Comparator { s1:String, s2:String ->
            val s1x = s1.split(" ", limit = 2)
            val s2x = s2.split(" ", limit = 2)

            if(s1x[1] == s2x[1]) {
                s1x[0].compareTo(s2x[0])
            } else {
                s1x[1].compareTo(s2x[1])
            }
        })

        letterList.addAll(digitList)

        return letterList.toTypedArray()
    }
}