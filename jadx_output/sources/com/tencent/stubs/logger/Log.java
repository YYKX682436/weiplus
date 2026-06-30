package com.tencent.stubs.logger;

/* loaded from: classes12.dex */
public final class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final long LOGGER_JAVA = 3;
    private static final long LOGGER_LOGCAT = 2;
    private static final long LOGGER_NOOP = 0;
    private static final long LOGGER_STDOUT = 1;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    static volatile com.tencent.stubs.logger.Log.Logger sLogger;
    static volatile long sLoggerPtr;

    /* loaded from: classes12.dex */
    public interface Logger {
        boolean isLoggable(java.lang.String str, int i17);

        void println(int i17, java.lang.String str, java.lang.String str2);
    }

    static {
        com.tencent.stubs.logger.Log.Logger logger;
        long j17;
        try {
            java.lang.Class.forName("android.util.Log");
            logger = new com.tencent.stubs.logger.AndroidLogcat();
            j17 = 2;
        } catch (java.lang.ClassNotFoundException unused) {
            logger = new com.tencent.stubs.logger.Log.Logger() { // from class: com.tencent.stubs.logger.Log.1
                @Override // com.tencent.stubs.logger.Log.Logger
                public boolean isLoggable(java.lang.String str, int i17) {
                    return true;
                }

                @Override // com.tencent.stubs.logger.Log.Logger
                public void println(int i17, java.lang.String str, java.lang.String str2) {
                    java.lang.System.out.println("[" + str + "] " + str2);
                }
            };
            j17 = 1;
        }
        sLogger = logger;
        sLoggerPtr = j17;
    }

    private Log() {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        println(3, str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        println(6, str, str2);
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        println(7, str, str2);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        println(4, str, str2);
    }

    public static void printFormat(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.stubs.logger.Log.Logger logger = sLogger;
        if (logger == null || !logger.isLoggable(str, i17)) {
            return;
        }
        logger.println(i17, str, java.lang.String.format(str2, objArr));
    }

    public static void printStack(int i17, java.lang.String str, java.lang.Throwable th6) {
        com.tencent.stubs.logger.Log.Logger logger = sLogger;
        if (logger == null || !logger.isLoggable(str, i17)) {
            return;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter(512);
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(stringWriter.toString(), "\n");
        while (stringTokenizer.hasMoreTokens()) {
            logger.println(i17, str, stringTokenizer.nextToken());
        }
    }

    public static void println(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.stubs.logger.Log.Logger logger = sLogger;
        if (logger == null) {
            return;
        }
        logger.println(i17, str, str2);
    }

    public static void setLogger(com.tencent.stubs.logger.Log.Logger logger) {
        sLogger = logger;
        sLoggerPtr = logger == null ? 0L : 3L;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        println(2, str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        println(5, str, str2);
    }

    public static void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(3, str, str2);
        }
        if (th6 != null) {
            printStack(3, str, th6);
        }
    }

    public static void e(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(6, str, str2);
        }
        if (th6 != null) {
            printStack(6, str, th6);
        }
    }

    public static void f(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(7, str, str2);
        }
        if (th6 != null) {
            printStack(7, str, th6);
        }
    }

    public static void i(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(4, str, str2);
        }
        if (th6 != null) {
            printStack(4, str, th6);
        }
    }

    public static void v(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(2, str, str2);
        }
        if (th6 != null) {
            printStack(2, str, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        if (str2 != null && !str2.isEmpty()) {
            println(5, str, str2);
        }
        if (th6 != null) {
            printStack(5, str, th6);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(3, str, str2, objArr);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(6, str, str2, objArr);
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(7, str, str2, objArr);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(4, str, str2, objArr);
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(2, str, str2, objArr);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(5, str, str2, objArr);
    }

    public static void d(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(3, str, str2, objArr);
        if (th6 != null) {
            printStack(3, str, th6);
        }
    }

    public static void e(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(6, str, str2, objArr);
        if (th6 != null) {
            printStack(6, str, th6);
        }
    }

    public static void f(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(7, str, str2, objArr);
        if (th6 != null) {
            printStack(7, str, th6);
        }
    }

    public static void i(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(4, str, str2, objArr);
        if (th6 != null) {
            printStack(4, str, th6);
        }
    }

    public static void v(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(2, str, str2, objArr);
        if (th6 != null) {
            printStack(2, str, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        printFormat(5, str, str2, objArr);
        if (th6 != null) {
            printStack(7, str, th6);
        }
    }
}
