package com.tencent.thumbplayer.core.common;

/* loaded from: classes12.dex */
public class TPThreadUtil {
    private static final java.lang.String TAG = "PlayerCore.TPThreadUtil";

    public static void setThreadName(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.Thread.currentThread().setName(str);
    }

    public static void setThreadPriority(int i17) {
        if (i17 < -19 || i17 > 19) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "setThreadPriority error, priority range:[-19,20], priority:" + i17);
            return;
        }
        try {
            if (android.os.Process.getThreadPriority(0) != i17) {
                android.os.Process.setThreadPriority(i17);
            }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "setThreadPriority, priority:" + i17);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, e17.toString());
        }
    }
}
