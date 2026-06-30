package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class ReportLogRequest extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "ReportLogRequest";
    static byte[] cache_logData;
    public java.lang.String hostAppPackageName;
    public int hostAppVersion;
    public java.lang.String hostUserId;
    public byte[] logData;
    public int logType;

    public ReportLogRequest() {
        this.logType = 0;
        this.logData = null;
        this.hostUserId = "";
        this.hostAppPackageName = "";
        this.hostAppVersion = 0;
    }

    public java.lang.String className() {
        return "jce.ReportLogRequest";
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.display(this.logType, "logType");
        jceDisplayer.display(this.logData, "logData");
        jceDisplayer.display(this.hostUserId, "hostUserId");
        jceDisplayer.display(this.hostAppPackageName, "hostAppPackageName");
        jceDisplayer.display(this.hostAppVersion, "hostAppVersion");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.logType, true);
        jceDisplayer.displaySimple(this.logData, true);
        jceDisplayer.displaySimple(this.hostUserId, true);
        jceDisplayer.displaySimple(this.hostAppPackageName, true);
        jceDisplayer.displaySimple(this.hostAppVersion, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest reportLogRequest = (com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest) obj;
        return com.qq.taf.jce.JceUtil.equals(this.logType, reportLogRequest.logType) && com.qq.taf.jce.JceUtil.equals(this.logData, reportLogRequest.logData) && com.qq.taf.jce.JceUtil.equals(this.hostUserId, reportLogRequest.hostUserId) && com.qq.taf.jce.JceUtil.equals(this.hostAppPackageName, reportLogRequest.hostAppPackageName) && com.qq.taf.jce.JceUtil.equals(this.hostAppVersion, reportLogRequest.hostAppVersion);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public java.lang.String getHostAppPackageName() {
        return this.hostAppPackageName;
    }

    public int getHostAppVersion() {
        return this.hostAppVersion;
    }

    public java.lang.String getHostUserId() {
        return this.hostUserId;
    }

    public byte[] getLogData() {
        return this.logData;
    }

    public int getLogType() {
        return this.logType;
    }

    public int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.logType = jceInputStream.read(this.logType, 0, false);
        if (cache_logData == null) {
            cache_logData = r0;
            byte[] bArr = {0};
        }
        this.logData = jceInputStream.read(cache_logData, 1, false);
        this.hostUserId = jceInputStream.readString(2, false);
        this.hostAppPackageName = jceInputStream.readString(3, false);
        this.hostAppVersion = jceInputStream.read(this.hostAppVersion, 4, false);
    }

    public void setHostAppPackageName(java.lang.String str) {
        this.hostAppPackageName = str;
    }

    public void setHostAppVersion(int i17) {
        this.hostAppVersion = i17;
    }

    public void setHostUserId(java.lang.String str) {
        this.hostUserId = str;
    }

    public void setLogData(byte[] bArr) {
        this.logData = bArr;
    }

    public void setLogType(int i17) {
        this.logType = i17;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.logType, 0);
        byte[] bArr = this.logData;
        if (bArr != null) {
            jceOutputStream.write(bArr, 1);
        }
        java.lang.String str = this.hostUserId;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        java.lang.String str2 = this.hostAppPackageName;
        if (str2 != null) {
            jceOutputStream.write(str2, 3);
        }
        jceOutputStream.write(this.hostAppVersion, 4);
    }

    public ReportLogRequest(int i17, byte[] bArr, java.lang.String str, java.lang.String str2, int i18) {
        this.logType = i17;
        this.logData = bArr;
        this.hostUserId = str;
        this.hostAppPackageName = str2;
        this.hostAppVersion = i18;
    }
}
