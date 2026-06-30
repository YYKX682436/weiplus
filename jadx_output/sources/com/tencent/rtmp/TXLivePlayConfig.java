package com.tencent.rtmp;

/* loaded from: classes10.dex */
public class TXLivePlayConfig implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    protected java.util.Map<java.lang.String, java.lang.String> mHeaders;
    float mCacheTime = 5.0f;
    float mMaxAutoAdjustCacheTime = 5.0f;
    float mMinAutoAdjustCacheTime = 1.0f;
    int mVideoBlockThreshold = 800;
    int mConnectRetryCount = 3;
    int mConnectRetryInterval = 3;
    boolean mAutoAdjustCacheTime = true;
    boolean mEnableAec = false;
    boolean mEnableMessage = false;
    boolean mEnableMetaData = false;
    java.lang.String mFlvSessionKey = "";
    boolean mEnableNearestIP = true;
    int mRtmpChannelType = 0;

    public float getCacheTime() {
        return this.mCacheTime;
    }

    public int getConnectRetryCount() {
        return this.mConnectRetryCount;
    }

    public int getConnectRetryInterval() {
        return this.mConnectRetryInterval;
    }

    public java.lang.String getFlvSessionKey() {
        return this.mFlvSessionKey;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.mHeaders;
    }

    public float getMaxAutoAdjustCacheTime() {
        return this.mMaxAutoAdjustCacheTime;
    }

    public float getMinAutoAdjustCacheTime() {
        return this.mMinAutoAdjustCacheTime;
    }

    public int getRtmpChannelType() {
        return this.mRtmpChannelType;
    }

    public int getVideoBlockThreshold() {
        return this.mVideoBlockThreshold;
    }

    public boolean isAutoAdjustCacheTime() {
        return this.mAutoAdjustCacheTime;
    }

    public boolean isEnableAec() {
        return this.mEnableAec;
    }

    public boolean isEnableMessage() {
        return this.mEnableMessage;
    }

    public boolean isEnableMetaData() {
        return this.mEnableMetaData;
    }

    public boolean isEnableNearestIP() {
        return this.mEnableNearestIP;
    }

    public void setAutoAdjustCacheTime(boolean z17) {
        this.mAutoAdjustCacheTime = z17;
    }

    public void setCacheTime(float f17) {
        this.mCacheTime = f17;
    }

    public void setConnectRetryCount(int i17) {
        this.mConnectRetryCount = i17;
    }

    public void setConnectRetryInterval(int i17) {
        this.mConnectRetryInterval = i17;
    }

    @java.lang.Deprecated
    public void setEnableAEC(boolean z17) {
        this.mEnableAec = z17;
    }

    public void setEnableMessage(boolean z17) {
        this.mEnableMessage = z17;
    }

    public void setEnableMetaData(boolean z17) {
        this.mEnableMetaData = z17;
    }

    @java.lang.Deprecated
    public void setEnableNearestIP(boolean z17) {
        this.mEnableNearestIP = z17;
    }

    public void setFlvSessionKey(java.lang.String str) {
        this.mFlvSessionKey = str;
    }

    @java.lang.Deprecated
    public void setHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mHeaders = map;
    }

    public void setMaxAutoAdjustCacheTime(float f17) {
        this.mMaxAutoAdjustCacheTime = f17;
    }

    public void setMinAutoAdjustCacheTime(float f17) {
        this.mMinAutoAdjustCacheTime = f17;
    }

    @java.lang.Deprecated
    public void setRtmpChannelType(int i17) {
        this.mRtmpChannelType = i17;
    }

    public void setVideoBlockThreshold(int i17) {
        this.mVideoBlockThreshold = i17;
    }

    public java.lang.String toString() {
        return "{mCacheTime=" + this.mCacheTime + ", mMaxAutoAdjustCacheTime=" + this.mMaxAutoAdjustCacheTime + ", mMinAutoAdjustCacheTime=" + this.mMinAutoAdjustCacheTime + ", mAutoAdjustCacheTime=" + this.mAutoAdjustCacheTime + ", mVideoBlockThreshold=" + this.mVideoBlockThreshold + ", mConnectRetryCount=" + this.mConnectRetryCount + ", mConnectRetryInterval=" + this.mConnectRetryInterval + ", mEnableAec=" + this.mEnableAec + ", mEnableMessage=" + this.mEnableMessage + ", mEnableMetaData=" + this.mEnableMetaData + '}';
    }
}
