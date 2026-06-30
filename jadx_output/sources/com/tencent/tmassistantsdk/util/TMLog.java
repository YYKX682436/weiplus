package com.tencent.tmassistantsdk.util;

/* loaded from: classes9.dex */
public class TMLog {
    protected static boolean mHardDebugFlag = true;
    protected static java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> mUseTimeStringList = new java.util.HashMap<>();
    protected static java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Long>> mUseTimeLongList = new java.util.HashMap<>();
    protected static boolean mDebugFlagForSDK = true;
    protected static java.lang.String mDebugFlagForSDKTag = "";

    public static void d(java.lang.String str, java.lang.String str2) {
        isForDebug();
    }

    public static void debugE(java.lang.String str) {
        if (!mDebugFlagForSDK || android.text.TextUtils.isEmpty(mDebugFlagForSDKTag)) {
            return;
        }
        com.tencent.mars.xlog.Log.e(mDebugFlagForSDKTag, str);
    }

    public static void debugV(java.lang.String str) {
        if (mDebugFlagForSDK) {
            android.text.TextUtils.isEmpty(mDebugFlagForSDKTag);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            com.tencent.mars.xlog.Log.e(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            com.tencent.mars.xlog.Log.i(str, str2);
        }
    }

    public static boolean isForDebug() {
        return mHardDebugFlag;
    }

    public static void setDebugLog(boolean z17, java.lang.String str) {
        mDebugFlagForSDK = z17;
        mDebugFlagForSDKTag = str;
    }

    public static void time(java.lang.String str) {
        time("UseTime", str, false);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        isForDebug();
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            com.tencent.mars.xlog.Log.w(str, str2);
        }
    }

    public static void time(java.lang.String str, boolean z17) {
        time("UseTime", str, z17);
    }

    public static void time(java.lang.String str, java.lang.String str2) {
        time(str, str2, false);
    }

    public static void time(java.lang.String str, java.lang.String str2, boolean z17) {
        if (isForDebug()) {
            java.util.ArrayList<java.lang.String> arrayList = mUseTimeStringList.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                mUseTimeStringList.put(str, arrayList);
            }
            arrayList.add(str2);
            java.util.ArrayList<java.lang.Long> arrayList2 = mUseTimeLongList.get(str);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList<>();
                mUseTimeLongList.put(str, arrayList2);
            }
            arrayList2.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (z17) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("total time:");
                long longValue = arrayList2.get(0).longValue();
                stringBuffer.append(arrayList2.get(arrayList2.size() - 1).longValue() - longValue);
                stringBuffer.append(" ");
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    stringBuffer.append(arrayList2.get(i17).longValue() - longValue);
                    longValue = arrayList2.get(i17).longValue();
                    stringBuffer.append(" ");
                    stringBuffer.append(arrayList.get(i17));
                    stringBuffer.append(" ");
                }
                arrayList.clear();
                arrayList2.clear();
            }
        }
    }
}
