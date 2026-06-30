package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class BatchDownloadActionResponse extends com.qq.taf.jce.JceStruct {
    static java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> cache_batchData;
    public java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> batchData;
    public int batchRequestType;

    public BatchDownloadActionResponse() {
        this.batchRequestType = 0;
        this.batchData = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.batchRequestType = jceInputStream.read(this.batchRequestType, 0, true);
        if (cache_batchData == null) {
            cache_batchData = new java.util.ArrayList<>();
            cache_batchData.add(new com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo());
        }
        this.batchData = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_batchData, 1, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.batchRequestType, 0);
        java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> arrayList = this.batchData;
        if (arrayList != null) {
            jceOutputStream.write((java.util.Collection) arrayList, 1);
        }
    }

    public BatchDownloadActionResponse(int i17, java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> arrayList) {
        this.batchRequestType = i17;
        this.batchData = arrayList;
    }
}
