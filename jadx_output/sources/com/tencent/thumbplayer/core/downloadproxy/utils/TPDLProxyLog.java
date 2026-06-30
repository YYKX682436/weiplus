package com.tencent.thumbplayer.core.downloadproxy.utils;

/* loaded from: classes16.dex */
public class TPDLProxyLog {
    private static com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener mLogListener;
    private static int mServiceType;

    public static void d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.d(str, i17, str2, str3);
        }
    }

    public static void e(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.e(str, i17, str2, str3);
        }
    }

    public static void i(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.i(str, i17, str2, str3);
        }
    }

    public static void setLogListener(int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener) {
        mServiceType = i17;
        mLogListener = iTPDLProxyLogListener;
    }

    public static void w(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.w(str, i17, str2, str3);
        }
    }
}
