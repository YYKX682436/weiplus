package com.tencent.tav.report;

/* loaded from: classes10.dex */
public class TimePrinter {
    private java.lang.String TAG = "TimeDebug";
    private com.tencent.tav.coremedia.CMTime currentSyncTime;
    private long currentTimeUs;
    private static java.util.Map<java.lang.String, com.tencent.tav.report.TimePrinter> printerMap = new java.util.HashMap();
    private static java.util.Map<java.lang.String, com.tencent.tav.report.TimePrinter> constMap = new java.util.HashMap();

    public TimePrinter(java.lang.String str) {
        this.TAG += "-" + str;
    }

    public static synchronized void print(java.lang.String str, com.tencent.tav.coremedia.CMTime cMTime) {
        synchronized (com.tencent.tav.report.TimePrinter.class) {
            com.tencent.tav.report.TimePrinter timePrinter = printerMap.get(str);
            if (timePrinter == null) {
                timePrinter = new com.tencent.tav.report.TimePrinter(str);
                printerMap.put(str, timePrinter);
            }
            timePrinter.print(cMTime);
        }
    }

    public static synchronized void printCons(java.lang.String str) {
        synchronized (com.tencent.tav.report.TimePrinter.class) {
            com.tencent.tav.report.TimePrinter timePrinter = constMap.get(str);
            if (timePrinter == null) {
                constMap.put(str, new com.tencent.tav.report.TimePrinter(str, java.lang.System.nanoTime() / 1000));
            } else {
                timePrinter.printCons();
                constMap.remove(str);
            }
        }
    }

    public TimePrinter(java.lang.String str, long j17) {
        this.TAG += "-" + str;
        this.currentTimeUs = j17;
    }

    public void print(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMTime cMTime2 = this.currentSyncTime;
        if (cMTime2 == null) {
            this.currentSyncTime = cMTime;
        } else {
            cMTime.sub(cMTime2).getTimeUs();
            this.currentSyncTime = cMTime;
        }
    }

    public void printCons() {
        long nanoTime = java.lang.System.nanoTime() / 1000;
    }
}
