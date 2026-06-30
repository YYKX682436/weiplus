package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes13.dex */
public final class IPCHead extends com.qq.taf.jce.JceStruct {
    public int cmdId;
    public java.lang.String hostPackageName;
    public java.lang.String hostVersionCode;
    public int requestId;

    public IPCHead() {
        this.requestId = 0;
        this.cmdId = 0;
        this.hostPackageName = "";
        this.hostVersionCode = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.requestId = jceInputStream.read(this.requestId, 0, true);
        this.cmdId = jceInputStream.read(this.cmdId, 1, true);
        this.hostPackageName = jceInputStream.readString(2, true);
        this.hostVersionCode = jceInputStream.readString(3, true);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.requestId, 0);
        jceOutputStream.write(this.cmdId, 1);
        jceOutputStream.write(this.hostPackageName, 2);
        jceOutputStream.write(this.hostVersionCode, 3);
    }

    public IPCHead(int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.requestId = i17;
        this.cmdId = i18;
        this.hostPackageName = str;
        this.hostVersionCode = str2;
    }
}
