package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPNetWorkUtils {
    public static final int NETWORK_CLASS_2_G = 1;
    public static final int NETWORK_CLASS_3_G = 2;
    public static final int NETWORK_CLASS_4_G = 3;
    public static final int NETWORK_CLASS_5_G = 4;
    public static final int NETWORK_CLASS_UNKNOWN = -1;
    public static final int NETWORK_CLASS_WIFI = 0;
    private static final java.lang.String TAG = "TPNetWorkUtils";
    private static int isNetworkAvailable = -1;
    private static boolean isNetworkChange = false;
    private static java.lang.String mAppPackageName = null;
    private static int mNetWorkClass = -1;
    private static final android.util.SparseIntArray mNetworkTypeArray;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        mNetworkTypeArray = sparseIntArray;
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(11, 1);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(8, 2);
        sparseIntArray.put(9, 2);
        sparseIntArray.put(10, 2);
        sparseIntArray.put(12, 2);
        sparseIntArray.put(14, 2);
        sparseIntArray.put(15, 2);
        sparseIntArray.put(13, 3);
    }

    private static boolean checkPermission(android.content.Context context, java.lang.String str) {
        if (!hasMarshmallow()) {
            return true;
        }
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if ("android.permission.WRITE_SETTINGS".equals(str)) {
            return android.provider.Settings.System.canWrite(context);
        }
        try {
            return context.checkSelfPermission(str) == 0;
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17.getMessage());
            return false;
        }
    }

    private static int get5GNetworkTypeIfNeed(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        int i17 = 0;
        try {
            telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        if (telephonyManager == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "get5GNetworkTypeIfNeed TelephonyManager is null");
            return 0;
        }
        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "get5GNetworkTypeIfNeed no permission");
            return 0;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "get5GNetworkTypeIfNeed less api 29");
            return 0;
        }
        int networkType = telephonyManager.getNetworkType();
        try {
        } catch (java.lang.Throwable th7) {
            i17 = networkType;
            th = th7;
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th.getMessage());
            return i17;
        }
        if (networkType != 13) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "get5GNetworkTypeIfNeed not NETWORK_TYPE_LTE");
            return networkType;
        }
        android.telephony.ServiceState serviceState = telephonyManager.getServiceState();
        if (serviceState == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "get5GNetworkTypeIfNeed serviceState is null");
            return networkType;
        }
        int intValue = ((java.lang.Integer) com.tencent.thumbplayer.utils.TPPrimaryReflectUtil.invokeMethod(serviceState, "android.telephony.ServiceState", "getNrState", new java.lang.Class[0], new java.lang.Object[0])).intValue();
        if (intValue != 2 && intValue != 3) {
            return networkType;
        }
        i17 = 20;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "get5GNetworkTypeIfNeed networkType is 20, 5G");
        return i17;
    }

    private static int getActualNetWorkClass(android.content.Context context, int i17) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? getNetWorkClassAPI29(context) : getNetWorkClassByType(context, i17);
    }

    private static android.net.ConnectivityManager getConnectivityManager(android.content.Context context) {
        if (context == null) {
            return null;
        }
        return (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    public static int getNetWorkClass(android.content.Context context) {
        int i17 = mNetWorkClass;
        if (i17 > 0 && !isNetworkChange) {
            return i17;
        }
        if (context == null) {
            return -1;
        }
        int netWorkClassByContext = getNetWorkClassByContext(context);
        mNetWorkClass = netWorkClassByContext;
        return netWorkClassByContext;
    }

    private static int getNetWorkClassAPI29(android.content.Context context) {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return getNetWorkClassByType(context, telephonyManager.getDataNetworkType());
            }
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "getNetWorkClassAPI29 fail: no phone permission");
            return -1;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6.getMessage());
            return -1;
        }
    }

    private static int getNetWorkClassByContext(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return -1;
            }
            int type = activeNetworkInfo.getType();
            return type != 0 ? type != 1 ? -1 : 0 : getActualNetWorkClass(context, activeNetworkInfo.getSubtype());
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, th6.getMessage());
            return -1;
        }
    }

    private static int getNetWorkClassByType(android.content.Context context, int i17) {
        if (get5GNetworkTypeIfNeed(context) == 20) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "get5GNetworkTypeIfNeed netWorkType==4");
            return 4;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(mNetworkTypeArray.get(i17));
        if (valueOf == null) {
            return -1;
        }
        return valueOf.intValue();
    }

    private static android.net.NetworkInfo getNetworkInfo(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    private static boolean hasMarshmallow() {
        return true;
    }

    public static boolean isNetworkAvailable(android.content.Context context) {
        int i17 = isNetworkAvailable;
        if (i17 != -1 && !isNetworkChange) {
            return i17 == 1;
        }
        if (context != null) {
            try {
                android.net.NetworkInfo networkInfo = getNetworkInfo(context);
                isNetworkAvailable = 0;
                if (networkInfo != null && networkInfo.getState() == android.net.NetworkInfo.State.CONNECTED) {
                    isNetworkAvailable = 1;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17.getMessage());
            }
        }
        return isNetworkAvailable == 1;
    }

    public static void onNetworkChange(android.content.Context context) {
        isNetworkChange = true;
        isNetworkAvailable(context);
        getNetWorkClass(context);
        isNetworkChange = false;
    }
}
