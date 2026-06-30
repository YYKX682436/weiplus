package com.tencent.thumbplayer.config;

/* loaded from: classes16.dex */
public class TPPlayerConfig {
    private static java.lang.String DOT = "\\.";
    public static final boolean ISOTT = false;
    private static final java.lang.String LOCAL_SERVER_BUFFER_SIZE_KEY = "key_localserver_buffer_size";
    private static final java.lang.String LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_KEY = "key_localserver_send_socket_buffer_size";
    private static final java.lang.String TAG = "TPPlayerConfig";
    public static final java.lang.String VERSION = "2.33.0.1206";
    private static java.lang.String appVersion = "";
    private static java.lang.String appVersionName = null;
    public static java.lang.String beacon_log_host = "";
    public static java.lang.String beacon_policy_host = "";
    private static long buildNum = -1;
    public static boolean enableStackTrace = false;
    private static java.lang.String host_config = "";
    public static int localserver_buffer_size = 0;
    public static int localserver_send_socket_buffer_size = 0;
    private static java.lang.String mAbUserId = "";
    private static boolean mEnableDataReport = true;
    private static boolean mEnablePlayerReport = true;
    private static java.lang.String mGuid = "";
    private static java.lang.String mOutNetIp = "";
    private static int mPlatform = -1;
    private static int mProxyServiceType = -1;
    private static boolean mUseP2P = true;
    private static boolean mUserIsVip = false;
    private static java.lang.String mUserUin = null;
    private static java.lang.String mUserUpc = "";
    private static int mUserUpcState;

    public static java.lang.String getAbUserId() {
        return android.text.TextUtils.isEmpty(mAbUserId) ? "" : mAbUserId;
    }

    public static java.lang.String getAppBigVersion(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(appVersion)) {
            return appVersion;
        }
        java.lang.String appVersionName2 = getAppVersionName(context);
        if (android.text.TextUtils.isEmpty(appVersionName2)) {
            appVersionName2 = "0.0.0";
        } else {
            java.lang.String[] split = appVersionName2.split(DOT);
            if (split != null && split.length == 4) {
                appVersionName2 = appVersionName2.substring(0, appVersionName2.lastIndexOf("."));
            }
        }
        appVersion = appVersionName2;
        return appVersionName2;
    }

    public static java.lang.String getAppVersionName(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(appVersionName)) {
            return appVersionName;
        }
        if (context == null) {
            return "";
        }
        try {
            java.lang.String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            appVersionName = str;
            return str == null ? "" : str;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static long getBuildNumber(android.content.Context context) {
        long j17 = buildNum;
        if (-1 != j17) {
            return j17;
        }
        try {
            long longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            buildNum = longVersionCode;
            return longVersionCode;
        } catch (java.lang.Throwable unused) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "getLongVersionCode less api 28");
            return buildNum;
        }
    }

    public static java.lang.String getGuid() {
        return mGuid;
    }

    public static boolean getMediaDrmReuseEnable() {
        return com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.getMediaDrmReuseEnable();
    }

    public static boolean getNewReportEnable() {
        return com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.getCoreEventProcessEnable();
    }

    public static java.lang.String getOutNetIp() {
        return mOutNetIp;
    }

    public static int getPlatform() {
        return mPlatform;
    }

    public static java.lang.String getProxyConfigDir() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(host_config)) {
                jSONObject.put(com.tencent.thumbplayer.api.TPPlayerMgr.PLYAER_HOST_KEY, new org.json.JSONObject(host_config));
            }
            int i17 = localserver_buffer_size;
            if (i17 > 0) {
                jSONObject.put(LOCAL_SERVER_BUFFER_SIZE_KEY, i17);
            }
            int i18 = localserver_send_socket_buffer_size;
            if (i18 > 0) {
                jSONObject.put(LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_KEY, i18);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
        return jSONObject.toString();
    }

    public static int getProxyServiceType() {
        int i17;
        int i18 = mProxyServiceType;
        return (i18 != -1 || (i17 = mPlatform) == -1) ? i18 : i17;
    }

    public static java.lang.String getUserUin() {
        return mUserUin;
    }

    public static java.lang.String getUserUpc() {
        return mUserUpc;
    }

    public static int getUserUpcState() {
        return mUserUpcState;
    }

    public static int getVideoMediaCodecCoexistMaxCnt() {
        return com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.getVideoMediaCodecCoexistMaxCnt();
    }

    public static java.lang.String getWidevineProvisioningServerUrl() {
        return com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.getWidevineProvisioningServerUrl();
    }

    public static boolean isDataReportEnable() {
        return mEnableDataReport;
    }

    public static boolean isPlayerReportEnable() {
        return mEnablePlayerReport;
    }

    public static boolean isUserIsVip() {
        return mUserIsVip;
    }

    public static void parseHostConfig(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "parseHostConfig, config is null.");
            return;
        }
        host_config = str;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "parseHostConfig:" + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(com.tencent.thumbplayer.api.TPPlayerMgr.PLYAER_HOST_KEY)) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.tencent.thumbplayer.api.TPPlayerMgr.PLYAER_HOST_KEY);
                if (jSONObject2.has(com.tencent.thumbplayer.api.TPPlayerMgr.BEACON_POLICY_HOST_KEY)) {
                    beacon_policy_host = jSONObject2.getString(com.tencent.thumbplayer.api.TPPlayerMgr.BEACON_POLICY_HOST_KEY);
                }
                if (jSONObject2.has(com.tencent.thumbplayer.api.TPPlayerMgr.BEACON_LOG_HOST_KEY)) {
                    beacon_log_host = jSONObject2.getString(com.tencent.thumbplayer.api.TPPlayerMgr.BEACON_LOG_HOST_KEY);
                }
            }
            if (jSONObject.has(com.tencent.thumbplayer.api.TPPlayerMgr.PROXY_HOST_KEY)) {
                com.tencent.thumbplayer.datatransport.config.TPProxyConfig.setInitConfig(com.tencent.thumbplayer.datatransport.config.TPProxyConfig.getDefaultServiceType(), jSONObject.getString(com.tencent.thumbplayer.api.TPPlayerMgr.PROXY_HOST_KEY));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.utils.TPLogUtil.w(TAG, "parseHostConfig exception: " + th6.toString());
        }
    }

    public static void setAbUserId(java.lang.String str) {
        mAbUserId = str;
    }

    public static void setDataReportEnable(boolean z17) {
        mEnableDataReport = z17;
    }

    public static void setDebugEnable(boolean z17) {
        com.tencent.thumbplayer.utils.TPLogUtil.setDebugEnable(z17);
    }

    public static void setGuid(java.lang.String str) {
        mGuid = str;
    }

    public static void setMediaDrmReuseEnable(boolean z17) {
        com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.setMediaDrmReuseEnable(z17);
    }

    public static void setNewReportEnable(boolean z17) {
        com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.setCoreEventProcessEnable(z17);
    }

    public static void setOutNetIp(java.lang.String str) {
        mOutNetIp = str;
    }

    public static void setPlatform(int i17) {
        mPlatform = i17;
    }

    public static void setPlayerReportEnable(boolean z17) {
        mEnablePlayerReport = z17;
    }

    public static void setProxyServiceType(int i17) {
        mProxyServiceType = i17;
    }

    public static void setUserIsVip(boolean z17) {
        mUserIsVip = z17;
    }

    public static void setUserUin(java.lang.String str) {
        mUserUin = str;
    }

    public static void setUserUpc(java.lang.String str) {
        mUserUpc = str;
    }

    public static void setUserUpcState(int i17) {
        mUserUpcState = i17;
    }

    public static void setVideoMediaCodecCoexistMaxCnt(int i17) {
        com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.setVideoMediaCodecCoexistMaxCnt(i17);
    }

    public static void setVideoMediaCodecStuckCheck(boolean z17) {
    }

    public static void setWidevineProvisioningServerUrl(java.lang.String str) {
        com.tencent.thumbplayer.core.config.TPPlayerCoreConfig.setWidevineProvisioningServerUrl(str);
    }
}
