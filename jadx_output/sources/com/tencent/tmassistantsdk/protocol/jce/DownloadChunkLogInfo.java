package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class DownloadChunkLogInfo extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "DownloadChunkLogInfo";
    public java.lang.String UUID;
    public java.lang.String appId;
    public byte currentRetryCnt;
    public long endTime;
    public int errorCode;
    public java.lang.String flag;
    public byte isWap;
    public java.lang.String networkOperator;
    public int networkType;
    public long readHeaderTime;
    public long receiveDataSize;
    public long requestRanagePosition;
    public long requestRanageSize;
    public java.lang.String requestUrl;
    public long responseContentLength;
    public int responseHttpCode;
    public long responseRangeLength;
    public long responseRangePosition;
    public int resultState;
    public long startTime;
    public byte type;
    public java.lang.String via;

    public DownloadChunkLogInfo() {
        this.UUID = "";
        this.type = (byte) 0;
        this.requestUrl = "";
        this.networkOperator = "";
        this.networkType = 0;
        this.isWap = (byte) 0;
        this.requestRanagePosition = 0L;
        this.requestRanageSize = 0L;
        this.responseRangePosition = 0L;
        this.responseRangeLength = 0L;
        this.responseContentLength = 0L;
        this.responseHttpCode = 0;
        this.receiveDataSize = 0L;
        this.startTime = 0L;
        this.readHeaderTime = 0L;
        this.endTime = 0L;
        this.errorCode = 0;
        this.resultState = 0;
        this.currentRetryCnt = (byte) 0;
        this.via = "";
        this.appId = "";
        this.flag = "";
    }

    public java.lang.String className() {
        return "jce.DownloadChunkLogInfo";
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
        jceDisplayer.display(this.UUID, "UUID");
        jceDisplayer.display(this.type, "type");
        jceDisplayer.display(this.requestUrl, "requestUrl");
        jceDisplayer.display(this.networkOperator, "networkOperator");
        jceDisplayer.display(this.networkType, "networkType");
        jceDisplayer.display(this.isWap, "isWap");
        jceDisplayer.display(this.requestRanagePosition, "requestRanagePosition");
        jceDisplayer.display(this.requestRanageSize, "requestRanageSize");
        jceDisplayer.display(this.responseRangePosition, "responseRangePosition");
        jceDisplayer.display(this.responseRangeLength, "responseRangeLength");
        jceDisplayer.display(this.responseContentLength, "responseContentLength");
        jceDisplayer.display(this.responseHttpCode, "responseHttpCode");
        jceDisplayer.display(this.receiveDataSize, "receiveDataSize");
        jceDisplayer.display(this.startTime, "startTime");
        jceDisplayer.display(this.readHeaderTime, "readHeaderTime");
        jceDisplayer.display(this.endTime, "endTime");
        jceDisplayer.display(this.errorCode, com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        jceDisplayer.display(this.resultState, "resultState");
        jceDisplayer.display(this.currentRetryCnt, "currentRetryCnt");
        jceDisplayer.display(this.via, com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_VIA);
        jceDisplayer.display(this.appId, "appId");
        jceDisplayer.display(this.flag, "flag");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.UUID, true);
        jceDisplayer.displaySimple(this.type, true);
        jceDisplayer.displaySimple(this.requestUrl, true);
        jceDisplayer.displaySimple(this.networkOperator, true);
        jceDisplayer.displaySimple(this.networkType, true);
        jceDisplayer.displaySimple(this.isWap, true);
        jceDisplayer.displaySimple(this.requestRanagePosition, true);
        jceDisplayer.displaySimple(this.requestRanageSize, true);
        jceDisplayer.displaySimple(this.responseRangePosition, true);
        jceDisplayer.displaySimple(this.responseRangeLength, true);
        jceDisplayer.displaySimple(this.responseContentLength, true);
        jceDisplayer.displaySimple(this.responseHttpCode, true);
        jceDisplayer.displaySimple(this.receiveDataSize, true);
        jceDisplayer.displaySimple(this.startTime, true);
        jceDisplayer.displaySimple(this.readHeaderTime, true);
        jceDisplayer.displaySimple(this.endTime, true);
        jceDisplayer.displaySimple(this.errorCode, true);
        jceDisplayer.displaySimple(this.resultState, true);
        jceDisplayer.displaySimple(this.currentRetryCnt, true);
        jceDisplayer.displaySimple(this.via, true);
        jceDisplayer.displaySimple(this.appId, true);
        jceDisplayer.displaySimple(this.flag, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo downloadChunkLogInfo = (com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo) obj;
        return com.qq.taf.jce.JceUtil.equals(this.UUID, downloadChunkLogInfo.UUID) && com.qq.taf.jce.JceUtil.equals(this.type, downloadChunkLogInfo.type) && com.qq.taf.jce.JceUtil.equals(this.requestUrl, downloadChunkLogInfo.requestUrl) && com.qq.taf.jce.JceUtil.equals(this.networkOperator, downloadChunkLogInfo.networkOperator) && com.qq.taf.jce.JceUtil.equals(this.networkType, downloadChunkLogInfo.networkType) && com.qq.taf.jce.JceUtil.equals(this.isWap, downloadChunkLogInfo.isWap) && com.qq.taf.jce.JceUtil.equals(this.requestRanagePosition, downloadChunkLogInfo.requestRanagePosition) && com.qq.taf.jce.JceUtil.equals(this.requestRanageSize, downloadChunkLogInfo.requestRanageSize) && com.qq.taf.jce.JceUtil.equals(this.responseRangePosition, downloadChunkLogInfo.responseRangePosition) && com.qq.taf.jce.JceUtil.equals(this.responseRangeLength, downloadChunkLogInfo.responseRangeLength) && com.qq.taf.jce.JceUtil.equals(this.responseContentLength, downloadChunkLogInfo.responseContentLength) && com.qq.taf.jce.JceUtil.equals(this.responseHttpCode, downloadChunkLogInfo.responseHttpCode) && com.qq.taf.jce.JceUtil.equals(this.receiveDataSize, downloadChunkLogInfo.receiveDataSize) && com.qq.taf.jce.JceUtil.equals(this.startTime, downloadChunkLogInfo.startTime) && com.qq.taf.jce.JceUtil.equals(this.readHeaderTime, downloadChunkLogInfo.readHeaderTime) && com.qq.taf.jce.JceUtil.equals(this.endTime, downloadChunkLogInfo.endTime) && com.qq.taf.jce.JceUtil.equals(this.errorCode, downloadChunkLogInfo.errorCode) && com.qq.taf.jce.JceUtil.equals(this.resultState, downloadChunkLogInfo.resultState) && com.qq.taf.jce.JceUtil.equals(this.currentRetryCnt, downloadChunkLogInfo.currentRetryCnt) && com.qq.taf.jce.JceUtil.equals(this.via, downloadChunkLogInfo.via) && com.qq.taf.jce.JceUtil.equals(this.appId, downloadChunkLogInfo.appId) && com.qq.taf.jce.JceUtil.equals(this.flag, downloadChunkLogInfo.flag);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public java.lang.String getAppId() {
        return this.appId;
    }

    public byte getCurrentRetryCnt() {
        return this.currentRetryCnt;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.String getFlag() {
        return this.flag;
    }

    public byte getIsWap() {
        return this.isWap;
    }

    public java.lang.String getNetworkOperator() {
        return this.networkOperator;
    }

    public int getNetworkType() {
        return this.networkType;
    }

    public long getReadHeaderTime() {
        return this.readHeaderTime;
    }

    public long getReceiveDataSize() {
        return this.receiveDataSize;
    }

    public long getRequestRanagePosition() {
        return this.requestRanagePosition;
    }

    public long getRequestRanageSize() {
        return this.requestRanageSize;
    }

    public java.lang.String getRequestUrl() {
        return this.requestUrl;
    }

    public long getResponseContentLength() {
        return this.responseContentLength;
    }

    public int getResponseHttpCode() {
        return this.responseHttpCode;
    }

    public long getResponseRangeLength() {
        return this.responseRangeLength;
    }

    public long getResponseRangePosition() {
        return this.responseRangePosition;
    }

    public int getResultState() {
        return this.resultState;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public byte getType() {
        return this.type;
    }

    public java.lang.String getUUID() {
        return this.UUID;
    }

    public java.lang.String getVia() {
        return this.via;
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
        this.UUID = jceInputStream.readString(0, false);
        this.type = jceInputStream.read(this.type, 1, false);
        this.requestUrl = jceInputStream.readString(2, false);
        this.networkOperator = jceInputStream.readString(3, false);
        this.networkType = jceInputStream.read(this.networkType, 4, false);
        this.isWap = jceInputStream.read(this.isWap, 5, false);
        this.requestRanagePosition = jceInputStream.read(this.requestRanagePosition, 6, false);
        this.requestRanageSize = jceInputStream.read(this.requestRanageSize, 7, false);
        this.responseRangePosition = jceInputStream.read(this.responseRangePosition, 9, false);
        this.responseRangeLength = jceInputStream.read(this.responseRangeLength, 10, false);
        this.responseContentLength = jceInputStream.read(this.responseContentLength, 11, false);
        this.responseHttpCode = jceInputStream.read(this.responseHttpCode, 12, false);
        this.receiveDataSize = jceInputStream.read(this.receiveDataSize, 13, false);
        this.startTime = jceInputStream.read(this.startTime, 14, false);
        this.readHeaderTime = jceInputStream.read(this.readHeaderTime, 15, false);
        this.endTime = jceInputStream.read(this.endTime, 16, false);
        this.errorCode = jceInputStream.read(this.errorCode, 17, false);
        this.resultState = jceInputStream.read(this.resultState, 18, false);
        this.currentRetryCnt = jceInputStream.read(this.currentRetryCnt, 19, false);
        this.via = jceInputStream.readString(20, false);
        this.appId = jceInputStream.readString(21, false);
        this.flag = jceInputStream.readString(22, false);
    }

    public void setAppId(java.lang.String str) {
        this.appId = str;
    }

    public void setCurrentRetryCnt(byte b17) {
        this.currentRetryCnt = b17;
    }

    public void setEndTime(long j17) {
        this.endTime = j17;
    }

    public void setErrorCode(int i17) {
        this.errorCode = i17;
    }

    public void setFlag(java.lang.String str) {
        this.flag = str;
    }

    public void setIsWap(byte b17) {
        this.isWap = b17;
    }

    public void setNetworkOperator(java.lang.String str) {
        this.networkOperator = str;
    }

    public void setNetworkType(int i17) {
        this.networkType = i17;
    }

    public void setReadHeaderTime(long j17) {
        this.readHeaderTime = j17;
    }

    public void setReceiveDataSize(long j17) {
        this.receiveDataSize = j17;
    }

    public void setRequestRanagePosition(long j17) {
        this.requestRanagePosition = j17;
    }

    public void setRequestRanageSize(long j17) {
        this.requestRanageSize = j17;
    }

    public void setRequestUrl(java.lang.String str) {
        this.requestUrl = str;
    }

    public void setResponseContentLength(long j17) {
        this.responseContentLength = j17;
    }

    public void setResponseHttpCode(int i17) {
        this.responseHttpCode = i17;
    }

    public void setResponseRangeLength(long j17) {
        this.responseRangeLength = j17;
    }

    public void setResponseRangePosition(long j17) {
        this.responseRangePosition = j17;
    }

    public void setResultState(int i17) {
        this.resultState = i17;
    }

    public void setStartTime(long j17) {
        this.startTime = j17;
    }

    public void setType(byte b17) {
        this.type = b17;
    }

    public void setUUID(java.lang.String str) {
        this.UUID = str;
    }

    public void setVia(java.lang.String str) {
        this.via = str;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        java.lang.String str = this.UUID;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        jceOutputStream.write(this.type, 1);
        java.lang.String str2 = this.requestUrl;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        java.lang.String str3 = this.networkOperator;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        jceOutputStream.write(this.networkType, 4);
        jceOutputStream.write(this.isWap, 5);
        jceOutputStream.write(this.requestRanagePosition, 6);
        jceOutputStream.write(this.requestRanageSize, 7);
        jceOutputStream.write(this.responseRangePosition, 9);
        jceOutputStream.write(this.responseRangeLength, 10);
        jceOutputStream.write(this.responseContentLength, 11);
        jceOutputStream.write(this.responseHttpCode, 12);
        jceOutputStream.write(this.receiveDataSize, 13);
        jceOutputStream.write(this.startTime, 14);
        jceOutputStream.write(this.readHeaderTime, 15);
        jceOutputStream.write(this.endTime, 16);
        jceOutputStream.write(this.errorCode, 17);
        jceOutputStream.write(this.resultState, 18);
        jceOutputStream.write(this.currentRetryCnt, 19);
        java.lang.String str4 = this.via;
        if (str4 != null) {
            jceOutputStream.write(str4, 20);
        }
        java.lang.String str5 = this.appId;
        if (str5 != null) {
            jceOutputStream.write(str5, 21);
        }
        java.lang.String str6 = this.flag;
        if (str6 != null) {
            jceOutputStream.write(str6, 22);
        }
    }

    public DownloadChunkLogInfo(java.lang.String str, byte b17, java.lang.String str2, java.lang.String str3, int i17, byte b18, long j17, long j18, long j19, long j27, long j28, int i18, long j29, long j37, long j38, long j39, int i19, int i27, byte b19, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.UUID = str;
        this.type = b17;
        this.requestUrl = str2;
        this.networkOperator = str3;
        this.networkType = i17;
        this.isWap = b18;
        this.requestRanagePosition = j17;
        this.requestRanageSize = j18;
        this.responseRangePosition = j19;
        this.responseRangeLength = j27;
        this.responseContentLength = j28;
        this.responseHttpCode = i18;
        this.receiveDataSize = j29;
        this.startTime = j37;
        this.readHeaderTime = j38;
        this.endTime = j39;
        this.errorCode = i19;
        this.resultState = i27;
        this.currentRetryCnt = b19;
        this.via = str4;
        this.appId = str5;
        this.flag = str6;
    }
}
