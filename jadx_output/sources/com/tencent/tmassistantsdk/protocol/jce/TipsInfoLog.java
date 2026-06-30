package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class TipsInfoLog extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "TipsInfoLog";
    public int authorizedBtnClickCount;
    public int authorizedTipsCount;
    public int cancelBtnClickCount;
    public int downloadBtnClickCount;
    public int downloadTipsCount;
    public java.lang.String gameChannelId;
    public java.lang.String gamePackageName;
    public int gameVersionCode;
    public int installBtnClickCount;
    public int installTipsCount;
    public int networkErrorTipsCount;
    public java.lang.String userId;
    public java.lang.String userIdType;

    public TipsInfoLog() {
        this.userId = "";
        this.userIdType = "";
        this.gamePackageName = "";
        this.gameVersionCode = 0;
        this.gameChannelId = "";
        this.authorizedTipsCount = 0;
        this.downloadTipsCount = 0;
        this.installTipsCount = 0;
        this.networkErrorTipsCount = 0;
        this.cancelBtnClickCount = 0;
        this.downloadBtnClickCount = 0;
        this.installBtnClickCount = 0;
        this.authorizedBtnClickCount = 0;
    }

    public java.lang.String className() {
        return "jce.TipsInfoLog";
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
        jceDisplayer.display(this.userId, "userId");
        jceDisplayer.display(this.userIdType, "userIdType");
        jceDisplayer.display(this.gamePackageName, "gamePackageName");
        jceDisplayer.display(this.gameVersionCode, "gameVersionCode");
        jceDisplayer.display(this.gameChannelId, "gameChannelId");
        jceDisplayer.display(this.authorizedTipsCount, "authorizedTipsCount");
        jceDisplayer.display(this.downloadTipsCount, "downloadTipsCount");
        jceDisplayer.display(this.installTipsCount, "installTipsCount");
        jceDisplayer.display(this.networkErrorTipsCount, "networkErrorTipsCount");
        jceDisplayer.display(this.cancelBtnClickCount, "cancelBtnClickCount");
        jceDisplayer.display(this.downloadBtnClickCount, "downloadBtnClickCount");
        jceDisplayer.display(this.installBtnClickCount, "installBtnClickCount");
        jceDisplayer.display(this.authorizedBtnClickCount, "authorizedBtnClickCount");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.userId, true);
        jceDisplayer.displaySimple(this.userIdType, true);
        jceDisplayer.displaySimple(this.gamePackageName, true);
        jceDisplayer.displaySimple(this.gameVersionCode, true);
        jceDisplayer.displaySimple(this.gameChannelId, true);
        jceDisplayer.displaySimple(this.authorizedTipsCount, true);
        jceDisplayer.displaySimple(this.downloadTipsCount, true);
        jceDisplayer.displaySimple(this.installTipsCount, true);
        jceDisplayer.displaySimple(this.networkErrorTipsCount, true);
        jceDisplayer.displaySimple(this.cancelBtnClickCount, true);
        jceDisplayer.displaySimple(this.downloadBtnClickCount, true);
        jceDisplayer.displaySimple(this.installBtnClickCount, true);
        jceDisplayer.displaySimple(this.authorizedBtnClickCount, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog tipsInfoLog = (com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog) obj;
        return com.qq.taf.jce.JceUtil.equals(this.userId, tipsInfoLog.userId) && com.qq.taf.jce.JceUtil.equals(this.userIdType, tipsInfoLog.userIdType) && com.qq.taf.jce.JceUtil.equals(this.gamePackageName, tipsInfoLog.gamePackageName) && com.qq.taf.jce.JceUtil.equals(this.gameVersionCode, tipsInfoLog.gameVersionCode) && com.qq.taf.jce.JceUtil.equals(this.gameChannelId, tipsInfoLog.gameChannelId) && com.qq.taf.jce.JceUtil.equals(this.authorizedTipsCount, tipsInfoLog.authorizedTipsCount) && com.qq.taf.jce.JceUtil.equals(this.downloadTipsCount, tipsInfoLog.downloadTipsCount) && com.qq.taf.jce.JceUtil.equals(this.installTipsCount, tipsInfoLog.installTipsCount) && com.qq.taf.jce.JceUtil.equals(this.networkErrorTipsCount, tipsInfoLog.networkErrorTipsCount) && com.qq.taf.jce.JceUtil.equals(this.cancelBtnClickCount, tipsInfoLog.cancelBtnClickCount) && com.qq.taf.jce.JceUtil.equals(this.downloadBtnClickCount, tipsInfoLog.downloadBtnClickCount) && com.qq.taf.jce.JceUtil.equals(this.installBtnClickCount, tipsInfoLog.installBtnClickCount) && com.qq.taf.jce.JceUtil.equals(this.authorizedBtnClickCount, tipsInfoLog.authorizedBtnClickCount);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public int getAuthorizedBtnClickCount() {
        return this.authorizedBtnClickCount;
    }

    public int getAuthorizedTipsCount() {
        return this.authorizedTipsCount;
    }

    public int getCancelBtnClickCount() {
        return this.cancelBtnClickCount;
    }

    public int getDownloadBtnClickCount() {
        return this.downloadBtnClickCount;
    }

    public int getDownloadTipsCount() {
        return this.downloadTipsCount;
    }

    public java.lang.String getGameChannelId() {
        return this.gameChannelId;
    }

    public java.lang.String getGamePackageName() {
        return this.gamePackageName;
    }

    public int getGameVersionCode() {
        return this.gameVersionCode;
    }

    public int getInstallBtnClickCount() {
        return this.installBtnClickCount;
    }

    public int getInstallTipsCount() {
        return this.installTipsCount;
    }

    public int getNetworkErrorTipsCount() {
        return this.networkErrorTipsCount;
    }

    public java.lang.String getUserId() {
        return this.userId;
    }

    public java.lang.String getUserIdType() {
        return this.userIdType;
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
        this.userId = jceInputStream.readString(0, false);
        this.userIdType = jceInputStream.readString(1, false);
        this.gamePackageName = jceInputStream.readString(2, false);
        this.gameVersionCode = jceInputStream.read(this.gameVersionCode, 3, false);
        this.gameChannelId = jceInputStream.readString(4, false);
        this.authorizedTipsCount = jceInputStream.read(this.authorizedTipsCount, 5, false);
        this.downloadTipsCount = jceInputStream.read(this.downloadTipsCount, 6, false);
        this.installTipsCount = jceInputStream.read(this.installTipsCount, 7, false);
        this.networkErrorTipsCount = jceInputStream.read(this.networkErrorTipsCount, 8, false);
        this.cancelBtnClickCount = jceInputStream.read(this.cancelBtnClickCount, 9, false);
        this.downloadBtnClickCount = jceInputStream.read(this.downloadBtnClickCount, 10, false);
        this.installBtnClickCount = jceInputStream.read(this.installBtnClickCount, 11, false);
        this.authorizedBtnClickCount = jceInputStream.read(this.authorizedBtnClickCount, 12, false);
    }

    public void setAuthorizedBtnClickCount(int i17) {
        this.authorizedBtnClickCount = i17;
    }

    public void setAuthorizedTipsCount(int i17) {
        this.authorizedTipsCount = i17;
    }

    public void setCancelBtnClickCount(int i17) {
        this.cancelBtnClickCount = i17;
    }

    public void setDownloadBtnClickCount(int i17) {
        this.downloadBtnClickCount = i17;
    }

    public void setDownloadTipsCount(int i17) {
        this.downloadTipsCount = i17;
    }

    public void setGameChannelId(java.lang.String str) {
        this.gameChannelId = str;
    }

    public void setGamePackageName(java.lang.String str) {
        this.gamePackageName = str;
    }

    public void setGameVersionCode(int i17) {
        this.gameVersionCode = i17;
    }

    public void setInstallBtnClickCount(int i17) {
        this.installBtnClickCount = i17;
    }

    public void setInstallTipsCount(int i17) {
        this.installTipsCount = i17;
    }

    public void setNetworkErrorTipsCount(int i17) {
        this.networkErrorTipsCount = i17;
    }

    public void setUserId(java.lang.String str) {
        this.userId = str;
    }

    public void setUserIdType(java.lang.String str) {
        this.userIdType = str;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        java.lang.String str = this.userId;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        java.lang.String str2 = this.userIdType;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        java.lang.String str3 = this.gamePackageName;
        if (str3 != null) {
            jceOutputStream.write(str3, 2);
        }
        jceOutputStream.write(this.gameVersionCode, 3);
        java.lang.String str4 = this.gameChannelId;
        if (str4 != null) {
            jceOutputStream.write(str4, 4);
        }
        jceOutputStream.write(this.authorizedTipsCount, 5);
        jceOutputStream.write(this.downloadTipsCount, 6);
        jceOutputStream.write(this.installTipsCount, 7);
        jceOutputStream.write(this.networkErrorTipsCount, 8);
        jceOutputStream.write(this.cancelBtnClickCount, 9);
        jceOutputStream.write(this.downloadBtnClickCount, 10);
        jceOutputStream.write(this.installBtnClickCount, 11);
        jceOutputStream.write(this.authorizedBtnClickCount, 12);
    }

    public TipsInfoLog(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        this.userId = str;
        this.userIdType = str2;
        this.gamePackageName = str3;
        this.gameVersionCode = i17;
        this.gameChannelId = str4;
        this.authorizedTipsCount = i18;
        this.downloadTipsCount = i19;
        this.installTipsCount = i27;
        this.networkErrorTipsCount = i28;
        this.cancelBtnClickCount = i29;
        this.downloadBtnClickCount = i37;
        this.installBtnClickCount = i38;
        this.authorizedBtnClickCount = i39;
    }
}
