package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class GetDownloadStateResponse extends com.qq.taf.jce.JceStruct {
    static com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam cache_requestParam;
    public int errorCode;
    public java.lang.String errorMsg;
    public com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam requestParam;
    public int state;

    public GetDownloadStateResponse() {
        this.requestParam = null;
        this.state = 0;
        this.errorCode = 0;
        this.errorMsg = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        if (cache_requestParam == null) {
            cache_requestParam = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam();
        }
        this.requestParam = (com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam) jceInputStream.read((com.qq.taf.jce.JceStruct) cache_requestParam, 0, true);
        this.state = jceInputStream.read(this.state, 1, false);
        this.errorCode = jceInputStream.read(this.errorCode, 2, false);
        this.errorMsg = jceInputStream.readString(3, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write((com.qq.taf.jce.JceStruct) this.requestParam, 0);
        jceOutputStream.write(this.state, 1);
        jceOutputStream.write(this.errorCode, 2);
        java.lang.String str = this.errorMsg;
        if (str != null) {
            jceOutputStream.write(str, 3);
        }
    }

    public GetDownloadStateResponse(com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam iPCBaseParam, int i17, int i18, java.lang.String str) {
        this.requestParam = iPCBaseParam;
        this.state = i17;
        this.errorCode = i18;
        this.errorMsg = str;
    }
}
