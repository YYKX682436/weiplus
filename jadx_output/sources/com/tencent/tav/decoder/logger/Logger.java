package com.tencent.tav.decoder.logger;

/* loaded from: classes16.dex */
public class Logger {
    public static final int NO_LOG = Integer.MAX_VALUE;
    private static int level = 3;
    private static com.tencent.tav.decoder.logger.ILog logProxy = new com.tencent.tav.decoder.logger.Logger.DefaultLogProxy();

    /* loaded from: classes16.dex */
    public static class DefaultLogProxy implements com.tencent.tav.decoder.logger.ILog {
        private DefaultLogProxy() {
        }

        @Override // com.tencent.tav.decoder.logger.ILog
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.tav.decoder.logger.ILog
        public void e(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.tav.decoder.logger.ILog
        public void i(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.tav.decoder.logger.ILog
        public void v(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.tav.decoder.logger.ILog
        public void w(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.tav.decoder.logger.ILog
        public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface LogLevel {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.tencent.tav.decoder.logger.ILog iLog = logProxy;
        if (iLog == null || level > 3) {
            return;
        }
        iLog.d(str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.tencent.tav.decoder.logger.ILog iLog = logProxy;
        if (iLog == null || level > 6) {
            return;
        }
        iLog.e(str, str2);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.tencent.tav.decoder.logger.ILog iLog = logProxy;
        if (iLog == null || level > 4) {
            return;
        }
        iLog.i(str, str2);
    }

    public static void setLevel(int i17) {
        level = i17;
    }

    public static void setLogProxy(com.tencent.tav.decoder.logger.ILog iLog) {
        logProxy = iLog;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        com.tencent.tav.decoder.logger.ILog iLog = logProxy;
        if (iLog == null || level > 2) {
            return;
        }
        iLog.v(str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.tencent.tav.decoder.logger.ILog iLog = logProxy;
        if (iLog == null || level > 5) {
            return;
        }
        iLog.w(str, str2);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logProxy == null || level > 3) {
            return;
        }
        d(str, new java.util.Formatter().format(str2, objArr).toString());
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        e(str, new java.util.Formatter().format(str2, objArr).toString());
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logProxy == null || level > 4) {
            return;
        }
        i(str, new java.util.Formatter().format(str2, objArr).toString());
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.tencent.tav.decoder.logger.ILog iLog = logProxy;
        if (iLog == null || level > 6) {
            return;
        }
        iLog.e(str, str2, th6);
    }
}
