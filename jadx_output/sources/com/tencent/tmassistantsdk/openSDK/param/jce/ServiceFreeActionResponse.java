package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class ServiceFreeActionResponse extends com.qq.taf.jce.JceStruct {
    static byte[] cache_revertField;
    public byte[] revertField;

    public ServiceFreeActionResponse() {
        this.revertField = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        if (cache_revertField == null) {
            cache_revertField = r0;
            byte[] bArr = {0};
        }
        this.revertField = jceInputStream.read(cache_revertField, 0, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        byte[] bArr = this.revertField;
        if (bArr != null) {
            jceOutputStream.write(bArr, 0);
        }
    }

    public ServiceFreeActionResponse(byte[] bArr) {
        this.revertField = bArr;
    }
}
