package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class URIActionRequest extends com.qq.taf.jce.JceStruct {
    public java.lang.String uri;

    public URIActionRequest() {
        this.uri = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.uri = jceInputStream.readString(0, true);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.uri, 0);
    }

    public URIActionRequest(java.lang.String str) {
        this.uri = str;
    }
}
