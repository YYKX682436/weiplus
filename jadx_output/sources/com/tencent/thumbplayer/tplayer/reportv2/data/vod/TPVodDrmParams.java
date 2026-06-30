package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

/* loaded from: classes16.dex */
public class TPVodDrmParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "certificateetimems")
    private long mCertificateETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "certificatestimems")
    private long mCertificateSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "getkeyreqetimems")
    private long mGetKeyReqETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "getkeyreqstimems")
    private long mGetKeyReqSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "getprovisionreqetimems")
    private long mGetProvisionReqETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "getprovisionreqstimems")
    private long mGetProvisionReqSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "licenseetimems")
    private long mLicenseETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "licensestimems")
    private long mLicenseSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "opensessionetimems")
    private long mOpenSessionETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "opensessionstimems")
    private long mOpenSessionSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "providekeyrespetimems")
    private long mProvideKeyRespETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "providekeyrespstimems")
    private long mProvideKeyRespSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "provideprovisionrespetimems")
    private long mProvideProvisionRespETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "provideprovisionrespstimems")
    private long mProvideProvisionRespSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "recvkeyresptimems")
    private long mRecvKeyRespTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "recvprovisionresptimems")
    private long mRecvProvisionRespTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "sendkeyreqtimems")
    private long mSendKeyReqTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "sendprovisionreqtimems")
    private long mSendProvisionReqTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "drmtype")
    private int mDrmType = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "securelevel")
    private int mSecureLevel = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "preparestimems")
    private long mPrepareSTimeMs = 0;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "prepareetimems")
    private long mPrepareETimeMs = 0;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "supportsecuredecoder")
    private int mSupportSecureDecoder = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "supportsecuredecrypt")
    private int mSupportSecureDecrypt = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "componentname")
    private java.lang.String mComponentName = "";

    public long getCertificateETimeMs() {
        return this.mCertificateETimeMs;
    }

    public long getCertificateSTimeMs() {
        return this.mCertificateSTimeMs;
    }

    public java.lang.String getComponentName() {
        return this.mComponentName;
    }

    public int getDrmType() {
        return this.mDrmType;
    }

    public long getGetKeyReqETimeMs() {
        return this.mGetKeyReqETimeMs;
    }

    public long getGetKeyReqSTimeMs() {
        return this.mGetKeyReqSTimeMs;
    }

    public long getGetProvisionReqETimeMs() {
        return this.mGetProvisionReqETimeMs;
    }

    public long getGetProvisionReqSTimeMs() {
        return this.mGetProvisionReqSTimeMs;
    }

    public long getLicenseETimeMs() {
        return this.mLicenseETimeMs;
    }

    public long getLicenseSTimeMs() {
        return this.mLicenseSTimeMs;
    }

    public long getOpenSessionETimeMs() {
        return this.mOpenSessionETimeMs;
    }

    public long getOpenSessionSTimeMs() {
        return this.mOpenSessionSTimeMs;
    }

    public long getPrepareETimeMs() {
        return this.mPrepareETimeMs;
    }

    public long getPrepareSTimeMs() {
        return this.mPrepareSTimeMs;
    }

    public long getProvideKeyRespETimeMs() {
        return this.mProvideKeyRespETimeMs;
    }

    public long getProvideKeyRespSTimeMs() {
        return this.mProvideKeyRespSTimeMs;
    }

    public long getProvideProvisionRespETimeMs() {
        return this.mProvideProvisionRespETimeMs;
    }

    public long getProvideProvisionRespSTimeMs() {
        return this.mProvideProvisionRespSTimeMs;
    }

    public long getRecvKeyRespTimeMs() {
        return this.mRecvKeyRespTimeMs;
    }

    public long getRecvProvisionRespTimeMs() {
        return this.mRecvProvisionRespTimeMs;
    }

    public int getSecureLevel() {
        return this.mSecureLevel;
    }

    public long getSendKeyReqTimeMs() {
        return this.mSendKeyReqTimeMs;
    }

    public long getSendProvisionReqTimeMs() {
        return this.mSendProvisionReqTimeMs;
    }

    public int getSupportSecureDecoder() {
        return this.mSupportSecureDecoder;
    }

    public int getSupportSecureDecrypt() {
        return this.mSupportSecureDecrypt;
    }

    public void setCertificateETimeMs(long j17) {
        this.mCertificateETimeMs = j17;
    }

    public void setCertificateSTimeMs(long j17) {
        this.mCertificateSTimeMs = j17;
    }

    public void setComponentName(java.lang.String str) {
        this.mComponentName = str;
    }

    public void setDrmType(int i17) {
        this.mDrmType = i17;
    }

    public void setGetKeyReqETimeMs(long j17) {
        this.mGetKeyReqETimeMs = j17;
    }

    public void setGetKeyReqSTimeMs(long j17) {
        this.mGetKeyReqSTimeMs = j17;
    }

    public void setGetProvisionReqETimeMs(long j17) {
        this.mGetProvisionReqETimeMs = j17;
    }

    public void setGetProvisionReqSTimeMs(long j17) {
        this.mGetProvisionReqSTimeMs = j17;
    }

    public void setLicenseETimeMs(long j17) {
        this.mLicenseETimeMs = j17;
    }

    public void setLicenseSTimeMs(long j17) {
        this.mLicenseSTimeMs = j17;
    }

    public void setOpenSessionETimeMs(long j17) {
        this.mOpenSessionETimeMs = j17;
    }

    public void setOpenSessionSTimeMs(long j17) {
        this.mOpenSessionSTimeMs = j17;
    }

    public void setPrepareETimeMs(long j17) {
        this.mPrepareETimeMs = j17;
    }

    public void setPrepareSTimeMs(long j17) {
        this.mPrepareSTimeMs = j17;
    }

    public void setProvideKeyRespETimeMs(long j17) {
        this.mProvideKeyRespETimeMs = j17;
    }

    public void setProvideKeyRespSTimeMs(long j17) {
        this.mProvideKeyRespSTimeMs = j17;
    }

    public void setProvideProvisionRespETimeMs(long j17) {
        this.mProvideProvisionRespETimeMs = j17;
    }

    public void setProvideProvisionRespSTimeMs(long j17) {
        this.mProvideProvisionRespSTimeMs = j17;
    }

    public void setRecvKeyRespTimeMs(long j17) {
        this.mRecvKeyRespTimeMs = j17;
    }

    public void setRecvProvisionRespTimeMs(long j17) {
        this.mRecvProvisionRespTimeMs = j17;
    }

    public void setSecureLevel(int i17) {
        this.mSecureLevel = i17;
    }

    public void setSendKeyReqTimeMs(long j17) {
        this.mSendKeyReqTimeMs = j17;
    }

    public void setSendProvisionReqTimeMs(long j17) {
        this.mSendProvisionReqTimeMs = j17;
    }

    public void setSupportSecureDecoder(int i17) {
        this.mSupportSecureDecoder = i17;
    }

    public void setSupportSecureDecrypt(int i17) {
        this.mSupportSecureDecrypt = i17;
    }
}
