package com.tencent.tmassistantsdk.util;

/* loaded from: classes13.dex */
public final class QUABuilder {
    public java.lang.String mAdrRelease;
    public java.lang.String mBuildNo;
    public java.lang.String mChannel;
    public java.lang.String mChannelId;
    public int mDeviceHeight;
    public int mDeviceWidth;
    public int mRootStatus;
    public java.lang.String mUA;
    public java.lang.String mVersionName;

    private java.lang.String getAppSpec() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0");
        stringBuffer.append(this.mVersionName.subSequence(0, 1));
        stringBuffer.append(this.mBuildNo);
        return stringBuffer.toString();
    }

    public java.lang.String get() {
        java.lang.String appSpec = getAppSpec();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("TMASDK_");
        stringBuffer.append(this.mVersionName);
        if (!android.text.TextUtils.isEmpty(this.mChannel)) {
            stringBuffer.append("_");
            stringBuffer.append(this.mChannel);
        }
        stringBuffer.append("/");
        stringBuffer.append(appSpec);
        stringBuffer.append("&NA/");
        stringBuffer.append(appSpec);
        stringBuffer.append("&");
        stringBuffer.append(this.mAdrRelease);
        stringBuffer.append("_");
        stringBuffer.append(this.mRootStatus);
        stringBuffer.append("&");
        stringBuffer.append(this.mDeviceWidth / 16);
        stringBuffer.append("_");
        stringBuffer.append(this.mDeviceHeight / 16);
        stringBuffer.append("_14&");
        stringBuffer.append(this.mUA);
        stringBuffer.append("&");
        stringBuffer.append(this.mChannelId);
        stringBuffer.append("&NA&V3");
        return stringBuffer.toString();
    }
}
