package com.tencent.tmassistantsdk.util;

/* loaded from: classes13.dex */
public class QUASetting {
    protected static final java.lang.String APP_VERSION = "100";
    protected static final java.lang.String BUILD_NO = "100";
    public static final int ROOT_STATUS_UNKNOWN = 0;
    protected static final java.lang.String UN_DEFINED = "NA";
    protected static java.lang.String mChannelId = "NA";
    protected android.content.Context mContext;

    public QUASetting(android.content.Context context) {
        this.mContext = context;
    }

    private java.lang.StringBuffer filter(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (android.text.TextUtils.isEmpty(str)) {
            stringBuffer.append(UN_DEFINED);
            return stringBuffer;
        }
        for (char c17 : str.toCharArray()) {
            if (c17 > ' ' && c17 != '/' && c17 != '_' && c17 != '&' && c17 != '|' && c17 != '-') {
                stringBuffer.append(c17);
            }
        }
        return stringBuffer;
    }

    private java.lang.String getAndroidVersion() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (android.text.TextUtils.isEmpty(str)) {
            stringBuffer.append(UN_DEFINED);
        } else {
            stringBuffer.append(str);
        }
        stringBuffer.append("_");
        stringBuffer.append(android.os.Build.VERSION.SDK_INT);
        return stringBuffer.toString();
    }

    public static java.lang.String getBuildNo() {
        return "100";
    }

    private int getDeviceHeight() {
        return this.mContext.getResources().getDisplayMetrics().heightPixels;
    }

    private int getDeviceWidth() {
        return this.mContext.getResources().getDisplayMetrics().widthPixels;
    }

    private int getRootStatus() {
        return 0;
    }

    private java.lang.String getUA() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(filter(android.os.Build.BRAND));
        stringBuffer.append("_");
        stringBuffer.append(filter(wo.w0.m()));
        return stringBuffer.toString();
    }

    public java.lang.String buildQUA() {
        com.tencent.tmassistantsdk.util.QUABuilder qUABuilder = new com.tencent.tmassistantsdk.util.QUABuilder();
        qUABuilder.mBuildNo = getBuildNo();
        qUABuilder.mChannel = "";
        qUABuilder.mChannelId = mChannelId;
        qUABuilder.mAdrRelease = getAndroidVersion();
        qUABuilder.mDeviceHeight = getDeviceHeight();
        qUABuilder.mDeviceWidth = getDeviceWidth();
        qUABuilder.mRootStatus = getRootStatus();
        qUABuilder.mUA = getUA();
        qUABuilder.mVersionName = "100";
        return qUABuilder.get();
    }
}
