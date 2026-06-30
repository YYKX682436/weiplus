package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPInitParams {
    private java.lang.String mDeviceName;
    private java.lang.String mGuid;
    private int mPlatform;

    /* loaded from: classes16.dex */
    public static class Builder {
        private java.lang.String mGuid = "";
        private int mPlatform = 0;
        private java.lang.String mDeviceName = "";

        public com.tencent.thumbplayer.api.TPInitParams build() {
            com.tencent.thumbplayer.api.TPInitParams tPInitParams = new com.tencent.thumbplayer.api.TPInitParams();
            tPInitParams.mPlatform = this.mPlatform;
            tPInitParams.mGuid = this.mGuid;
            tPInitParams.mDeviceName = this.mDeviceName;
            return tPInitParams;
        }

        public com.tencent.thumbplayer.api.TPInitParams.Builder setDeviceName(java.lang.String str) {
            this.mDeviceName = str;
            return this;
        }

        public com.tencent.thumbplayer.api.TPInitParams.Builder setGuid(java.lang.String str) {
            this.mGuid = str;
            return this;
        }

        public com.tencent.thumbplayer.api.TPInitParams.Builder setPlatform(int i17) {
            this.mPlatform = i17;
            return this;
        }
    }

    public java.lang.String getDeviceName() {
        return this.mDeviceName;
    }

    public java.lang.String getGuid() {
        return this.mGuid;
    }

    public int getPlatform() {
        return this.mPlatform;
    }

    private TPInitParams() {
        this.mGuid = "";
        this.mPlatform = 0;
        this.mDeviceName = "";
    }
}
