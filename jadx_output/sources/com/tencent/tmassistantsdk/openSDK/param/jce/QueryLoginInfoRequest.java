package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class QueryLoginInfoRequest extends com.qq.taf.jce.JceStruct {
    public java.lang.String addtion;

    public QueryLoginInfoRequest() {
        this.addtion = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.addtion = jceInputStream.readString(0, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        java.lang.String str = this.addtion;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
    }

    public QueryLoginInfoRequest(java.lang.String str) {
        this.addtion = str;
    }
}
