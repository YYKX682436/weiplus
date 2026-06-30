package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class BatchDownloadActionRequest extends com.qq.taf.jce.JceStruct {
    static java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam> cache_batchData;
    public java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam> batchData;
    public int batchRequestType;
    public java.lang.String uin;
    public java.lang.String uinType;
    public java.lang.String via;

    public BatchDownloadActionRequest() {
        this.batchRequestType = 0;
        this.batchData = null;
        this.uin = "";
        this.uinType = "";
        this.via = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.batchRequestType = jceInputStream.read(this.batchRequestType, 0, true);
        if (cache_batchData == null) {
            cache_batchData = new java.util.ArrayList<>();
            cache_batchData.add(new com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam());
        }
        this.batchData = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_batchData, 1, false);
        this.uin = jceInputStream.readString(2, false);
        this.uinType = jceInputStream.readString(3, false);
        this.via = jceInputStream.readString(4, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.batchRequestType, 0);
        java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam> arrayList = this.batchData;
        if (arrayList != null) {
            jceOutputStream.write((java.util.Collection) arrayList, 1);
        }
        java.lang.String str = this.uin;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        java.lang.String str2 = this.uinType;
        if (str2 != null) {
            jceOutputStream.write(str2, 3);
        }
        java.lang.String str3 = this.via;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
    }

    public BatchDownloadActionRequest(int i17, java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCDownloadParam> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.batchRequestType = i17;
        this.batchData = arrayList;
        this.uin = str;
        this.uinType = str2;
        this.via = str3;
    }
}
