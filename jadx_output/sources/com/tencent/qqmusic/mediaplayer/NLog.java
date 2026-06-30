package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class NLog {
    private static final int LEVEL_DEBUG = 1;
    private static final int LEVEL_ERROR = 4;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_WARNING = 3;
    private static final java.lang.String TAG = "NLog";
    private static volatile boolean mIsLoadSuccess;

    public static void D(java.lang.String str, java.lang.String str2) {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            d(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    public static void E(java.lang.String str, java.lang.String str2) {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            e(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    public static java.lang.String GetLogPath() {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return "";
        }
        try {
            return getLogPath();
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
            return "";
        }
    }

    public static void I(java.lang.String str, java.lang.String str2) {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            i(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    public static boolean Start(java.lang.String str, int i17) {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return false;
        }
        try {
            return start(str, i17);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
            return false;
        }
    }

    public static void Stop() {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            stop();
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    public static void W(java.lang.String str, java.lang.String str2) {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            w(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    private static void WriteLogCallback(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 1) {
            com.tencent.qqmusic.mediaplayer.util.Logger.d(str, str2);
            return;
        }
        if (i17 == 2) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(str, str2);
            return;
        }
        if (i17 == 3) {
            com.tencent.qqmusic.mediaplayer.util.Logger.w(str, str2);
        } else if (i17 != 4) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(str, str2);
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(str, str2);
        }
    }

    private static native void d(java.lang.String str, java.lang.String str2);

    private static native void e(java.lang.String str, java.lang.String str2);

    private static native java.lang.String getLogPath();

    private static native void i(java.lang.String str, java.lang.String str2);

    public static boolean init(java.lang.String str, java.lang.String str2, int i17) {
        if (!com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.getSoLibraryLoader().load(str)) {
            return false;
        }
        mIsLoadSuccess = true;
        Start(str2, i17);
        return true;
    }

    private static native void setLogWriteCallback(int i17);

    public static void setWriteCallback(boolean z17) {
        if (!mIsLoadSuccess) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            setLogWriteCallback(z17 ? 1 : 0);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    private static native boolean start(java.lang.String str, int i17);

    private static native void stop();

    private static native void w(java.lang.String str, java.lang.String str2);

    public static void D(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        d(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }

    public static void E(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        e(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }

    public static void I(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        i(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }

    public static void W(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        w(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }
}
