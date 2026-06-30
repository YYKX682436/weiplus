package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes13.dex */
public class Logger {
    private static com.tencent.qqmusic.mediaplayer.ILog mILog = new com.tencent.qqmusic.mediaplayer.ILog() { // from class: com.tencent.qqmusic.mediaplayer.util.Logger.1
        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void e(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void i(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void w(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void e(java.lang.String str, java.lang.Throwable th6) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.ILog
        public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            java.lang.String.format(str2, objArr);
        }
    };

    public static void d(java.lang.String str, java.lang.String str2) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.d(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.e(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.i(str, str2);
        }
    }

    public static void setLog(com.tencent.qqmusic.mediaplayer.ILog iLog) {
        mILog = iLog;
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.w(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.Throwable th6) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.e(str, th6);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.i(str, str2, th6);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.e(str, str2, th6);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.qqmusic.mediaplayer.ILog iLog = mILog;
        if (iLog != null) {
            iLog.e(str, str2, objArr);
        }
    }
}
