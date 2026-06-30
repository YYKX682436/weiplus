package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class QueryDownloadTaskRequest extends com.qq.taf.jce.JceStruct {
    static com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam cache_baseParam;
    public com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam baseParam;

    public QueryDownloadTaskRequest() {
        this.baseParam = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        if (cache_baseParam == null) {
            cache_baseParam = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam();
        }
        this.baseParam = (com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam) jceInputStream.read((com.qq.taf.jce.JceStruct) cache_baseParam, 0, true);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write((com.qq.taf.jce.JceStruct) this.baseParam, 0);
    }

    public QueryDownloadTaskRequest(com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam iPCBaseParam) {
        this.baseParam = iPCBaseParam;
    }
}
