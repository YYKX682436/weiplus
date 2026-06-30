package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class IPCResponse extends com.qq.taf.jce.JceStruct {
    static byte[] cache_body;
    static com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead cache_head;
    public byte[] body;
    public com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead head;

    public IPCResponse() {
        this.head = null;
        this.body = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        if (cache_head == null) {
            cache_head = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead();
        }
        this.head = (com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead) jceInputStream.read((com.qq.taf.jce.JceStruct) cache_head, 0, true);
        if (cache_body == null) {
            cache_body = r0;
            byte[] bArr = {0};
        }
        this.body = jceInputStream.read(cache_body, 1, true);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write((com.qq.taf.jce.JceStruct) this.head, 0);
        jceOutputStream.write(this.body, 1);
    }

    public IPCResponse(com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead iPCHead, byte[] bArr) {
        this.head = iPCHead;
        this.body = bArr;
    }
}
