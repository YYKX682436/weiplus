package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public class OpenSDKTool4Assistant {
    public static final int ACTION_TYPE_APP_DETAIL = 2;
    public static final int ACTION_TYPE_AUTHORIZED = 3;
    public static final int ACTION_TYPE_DOWNLOAD_TASKLIST = 1;
    public static final int ACTION_TYPE_RELATE = 4;
    public static final int ACTION_TYPE_WEBVIEW = 5;
    public static final int BATCH_REQUEST_TYPE_GET_STATE = 3;
    public static final int BATCH_REQUEST_TYPE_PAUSE_ALL = 6;
    public static final int BATCH_REQUEST_TYPE_PAUSE_SPECIFIED_APPS = 8;
    public static final int BATCH_REQUEST_TYPE_RESUME_ALL = 5;
    public static final int BATCH_REQUEST_TYPE_RESUME_SPECIFIED_APPS = 7;
    public static final int BATCH_REQUEST_TYPE_SHOW_ALL = 2;
    public static final int BATCH_REQUEST_TYPE_START_ALL = 1;
    public static final int BATCH_REQUEST_TYPE_START_SPECIFIED_APPS = 4;
    protected static final java.lang.String CRYPT_KEY = "ji*9^&43U0X-~./(";
    public static final java.lang.String DOWNLOADSTATECHANGED_RECEIVERPERMISSION = "com.tencent.qqdownloader.stateChangedReceiverPermission";
    public static final java.lang.String EXTRA_ERROR_CODE = "errorCode";
    public static final java.lang.String EXTRA_ERROR_MSG = "errorMsg";
    public static final java.lang.String EXTRA_HOST_PAGECKAGENAME = "hostPackageName";
    public static final java.lang.String EXTRA_HOST_VERSION = "hostVersion";
    public static final java.lang.String EXTRA_SNGAPPID = "sngAppId";
    public static final java.lang.String EXTRA_STATE = "state";
    public static final java.lang.String EXTRA_TASK_APKID = "taskApkId";
    public static final java.lang.String EXTRA_TASK_APPID = "taskAppId";
    public static final java.lang.String EXTRA_TASK_ID = "taskId";
    public static final java.lang.String EXTRA_TASK_PACKAGENAME = "taskPackageName";
    public static final java.lang.String EXTRA_TASK_VERSION = "taskVersion";
    public static final java.lang.String EXTRA_UIN = "uin";
    public static final java.lang.String EXTRA_UINTYPE = "uinType";
    public static final java.lang.String EXTRA_VIA = "via";
    public static final java.lang.String OPENSDK_ACTION_NAME = "com.tencent.assistantOpenSDK.downloadStateChange.action";
    public static final java.lang.String STATE_CHANGED_PARAM = "stateChangedParam";

    public static java.lang.String decryptUri(java.lang.String str) {
        return new java.lang.String(com.tencent.tmassistantsdk.protocol.ProtocolPackage.decrypt(com.tencent.tmassistantsdk.util.Base64.decode(str, 0), CRYPT_KEY.getBytes()));
    }

    public static java.lang.String encryptUri(java.lang.String str) {
        return com.tencent.tmassistantsdk.util.Base64.encodeToString(com.tencent.tmassistantsdk.protocol.ProtocolPackage.encrypt(str.getBytes(), CRYPT_KEY.getBytes()), 0);
    }

    public static void sendDownloadStateChanged(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map) {
        android.content.Intent intent = new android.content.Intent(OPENSDK_ACTION_NAME);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
        context.sendBroadcast(intent);
    }
}
