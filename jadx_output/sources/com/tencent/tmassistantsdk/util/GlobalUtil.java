package com.tencent.tmassistantsdk.util;

/* loaded from: classes13.dex */
public class GlobalUtil {
    static final int NET_TYPE_WIFI = 4;
    protected static final java.lang.String SharedPreferencesName = "TMAssistantSDKSharedPreference";
    private static final java.lang.String TAG = "GlobalUtil";
    protected static com.tencent.tmassistantsdk.util.GlobalUtil mInstance;
    protected static int mMemUUID;
    protected android.content.Context mContext;
    public java.util.HashMap<java.lang.Integer, java.lang.String> mJCECmdIdMap;
    public java.lang.String mQUA = "";
    public final int JCE_CMDID_Empty = 0;
    public final int JCE_CMDID_ReportLog = 1;
    public final int JCE_CMDID_GetSettings = 2;
    public final int JCE_CMDID_GetAppUpdate = 3;
    public final int JCE_CMDID_GetAuthorized = 4;
    public final int JCE_CMDID_GetAppSimpleDetail = 5;

    public GlobalUtil() {
        this.mJCECmdIdMap = null;
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = new java.util.HashMap<>();
        this.mJCECmdIdMap = hashMap;
        hashMap.put(1, "ReportLog");
        this.mJCECmdIdMap.put(2, "GetSettings");
        this.mJCECmdIdMap.put(3, "GetAppUpdate");
        this.mJCECmdIdMap.put(4, "GetAuthorized");
        this.mJCECmdIdMap.put(5, "GetAppSimpleDetail");
    }

    public static java.util.ArrayList<java.lang.String> String2List(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (!android.text.TextUtils.isEmpty(str)) {
            for (java.lang.String str2 : str.split(",")) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static int assistantErrorCode2SDKErrorCode(int i17) {
        if (i17 == -1000) {
            return 604;
        }
        if (i17 == -16) {
            return 731;
        }
        if (i17 == -15) {
            return 1;
        }
        if (i17 == -1) {
            return 709;
        }
        if (i17 == 0) {
            return 0;
        }
        switch (i17) {
            case -28:
                return 701;
            case -27:
                return 606;
            case -26:
            case -24:
                return 604;
            case -25:
                return 602;
            case -23:
                return 601;
            case -22:
                return com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
            case -21:
                return 700;
            default:
                switch (i17) {
                    case -13:
                        return 703;
                    case -12:
                        return com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH;
                    case -11:
                        return 708;
                    default:
                        return 604;
                }
        }
    }

    public static int assistantState2SDKState(int i17) {
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 3;
        }
        if (i17 == 3) {
            return 5;
        }
        if (i17 == 4) {
            return 4;
        }
        if (i17 != 6) {
            return i17 != 9 ? 0 : 6;
        }
        return 1;
    }

    public static java.lang.String calcMD5AsString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bytes, 0, bytes.length);
            byte[] digest = messageDigest.digest();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b17 : digest) {
                stringBuffer.append(java.lang.Integer.toHexString(b17 & 255));
            }
            return stringBuffer.toString();
        } catch (java.security.NoSuchAlgorithmException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public static void deleteOldDB(java.lang.String str) {
        if (getInstance().getContext() != null) {
            com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(getInstance().getContext().getDatabasePath(str));
            if (j17.m()) {
                try {
                    j17.l();
                    com.tencent.tmassistantsdk.util.TMLog.i(TAG, "deleteDB");
                } catch (java.lang.Exception unused) {
                    com.tencent.tmassistantsdk.util.TMLog.i(TAG, "deleteDB failed");
                }
            }
        }
    }

    public static java.lang.String getAppPackageName(android.content.Context context) {
        return context != null ? context.getPackageName() : "";
    }

    public static int getAppVersionCode(android.content.Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    public static synchronized com.tencent.tmassistantsdk.util.GlobalUtil getInstance() {
        com.tencent.tmassistantsdk.util.GlobalUtil globalUtil;
        synchronized (com.tencent.tmassistantsdk.util.GlobalUtil.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.util.GlobalUtil();
            }
            globalUtil = mInstance;
        }
        return globalUtil;
    }

    public static synchronized int getMemUUID() {
        int i17;
        synchronized (com.tencent.tmassistantsdk.util.GlobalUtil.class) {
            i17 = mMemUUID;
            mMemUUID = i17 + 1;
        }
        return i17;
    }

    public static boolean isDBExist(java.lang.String str) {
        return getInstance().getContext() != null && com.tencent.mm.vfs.r6.j(getInstance().getContext().getDatabasePath(str)).m();
    }

    public static void updateFilePathAuthorized(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        java.lang.String r17 = r6Var.r();
        java.lang.String r18 = new com.tencent.mm.vfs.r6(r17).r();
        java.lang.String r19 = new com.tencent.mm.vfs.r6(r18).r();
        try {
            java.lang.Runtime.getRuntime().exec("chmod 777 " + r6Var.o());
            java.lang.Runtime.getRuntime().exec("chmod 777 ".concat(r17));
            java.lang.Runtime.getRuntime().exec("chmod 777 ".concat(r18));
            java.lang.Runtime.getRuntime().exec("chmod 777" + r19);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public boolean canReportValue() {
        return false;
    }

    public void destroy() {
        this.mContext = null;
        mInstance = null;
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public int getJceCmdIdByClassName(java.lang.String str) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap;
        if (str != null && (hashMap = this.mJCECmdIdMap) != null) {
            for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : hashMap.entrySet()) {
                if (entry != null) {
                    java.lang.Integer key = entry.getKey();
                    java.lang.String value = entry.getValue();
                    if (value != null && value.equals(str)) {
                        return key.intValue();
                    }
                }
            }
        }
        return 0;
    }

    public java.lang.String getNetworkOperator() {
        android.content.Context context = this.mContext;
        return context == null ? "" : ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
    }

    public int getNetworkType() {
        android.content.Context context = this.mContext;
        if (context == null) {
            return 0;
        }
        try {
            if (b3.l.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                return ((android.telephony.TelephonyManager) this.mContext.getSystemService("phone")).getNetworkType();
            }
        } catch (java.lang.Exception unused) {
        }
        return 0;
    }

    public java.lang.String getPhoneGuid() {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = this.mContext;
        return (context == null || (sharedPreferences = context.getSharedPreferences(SharedPreferencesName, 0)) == null) ? "" : sharedPreferences.getString("TMAssistantSDKPhoneGUID", "");
    }

    public int getQQDownloaderAPILevel() {
        android.os.Bundle bundle;
        android.content.Context context = this.mContext;
        if (context == null) {
            return 0;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public int getQQDownloaderVersionCode() {
        android.content.pm.PackageManager packageManager;
        android.content.Context context = this.mContext;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            try {
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0);
                if (packageInfo == null) {
                    return 0;
                }
                return packageInfo.versionCode;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    public void setContext(android.content.Context context) {
        this.mContext = context;
        this.mQUA = new com.tencent.tmassistantsdk.util.QUASetting(context).buildQUA();
    }

    public void setNetTypeValue(byte b17) {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = this.mContext;
        if (context == null || (sharedPreferences = context.getSharedPreferences(SharedPreferencesName, 0)) == null || java.lang.Byte.parseByte(sharedPreferences.getString("TMAssistantSDKNetType", "0")) == b17) {
            return;
        }
        sharedPreferences.edit().putString("TMAssistantSDKNetType", ((int) b17) + "").commit();
    }

    public void setPhoneGuid(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = this.mContext;
        if (context == null || str == null || (sharedPreferences = context.getSharedPreferences(SharedPreferencesName, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString("TMAssistantSDKPhoneGUID", str).commit();
    }
}
