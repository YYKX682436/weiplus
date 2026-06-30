package jn4;

/* loaded from: classes11.dex */
public abstract class o {
    public static void a(java.lang.Process process, java.io.BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTraceRoute", th6, "close reader failed", new java.lang.Object[0]);
            }
        }
        if (process != null) {
            try {
                process.destroy();
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTraceRoute", th7, "destroy process failed", new java.lang.Object[0]);
            }
        }
    }

    public static java.lang.String b(java.lang.String str, boolean z17) {
        int i17;
        int indexOf;
        int i18;
        int indexOf2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "output string: " + str);
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z17) {
            int indexOf3 = str.indexOf("time=");
            if (indexOf3 >= 0 && (indexOf2 = str.indexOf(" ", (i18 = indexOf3 + 5))) >= 0) {
                return str.substring(i18, indexOf2);
            }
            return null;
        }
        int indexOf4 = str.indexOf("time ");
        if (indexOf4 < 0 || (indexOf = str.indexOf("ms", (i17 = indexOf4 + 5))) < 0) {
            return null;
        }
        java.lang.String substring = str.substring(i17, indexOf);
        return substring.equalsIgnoreCase("0") ? "<1" : substring;
    }

    public static int c(java.lang.String str) {
        int i17;
        int indexOf;
        int indexOf2 = str.indexOf("ttl=");
        if (indexOf2 >= 0 && (indexOf = str.indexOf(" ", (i17 = indexOf2 + 4))) >= 0) {
            return com.tencent.mm.sdk.platformtools.t8.P(str.substring(i17, indexOf), 0);
        }
        return -1;
    }

    public static java.util.List d(java.lang.String[] strArr) {
        java.lang.String str = " ";
        for (java.lang.String str2 : strArr) {
            str = str + str2 + " ";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jn4.n nVar = new jn4.n(strArr, arrayList);
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        try {
            t0Var.k(nVar, 0L).get(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "watcher thread stopped" + str);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
        }
        return arrayList;
    }
}
