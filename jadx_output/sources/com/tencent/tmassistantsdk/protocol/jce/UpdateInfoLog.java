package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class UpdateInfoLog extends com.qq.taf.jce.JceStruct {
    public int actionCode;
    public long appid;
    public java.lang.String extra;
    public java.lang.String packageName;
    public byte updateType;
    public byte yybExistFlag;

    public UpdateInfoLog() {
        this.updateType = (byte) 0;
        this.packageName = "";
        this.appid = 0L;
        this.actionCode = 0;
        this.yybExistFlag = (byte) 0;
        this.extra = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.updateType = jceInputStream.read(this.updateType, 0, true);
        this.packageName = jceInputStream.readString(1, true);
        this.appid = jceInputStream.read(this.appid, 2, false);
        this.actionCode = jceInputStream.read(this.actionCode, 3, true);
        this.yybExistFlag = jceInputStream.read(this.yybExistFlag, 4, false);
        this.extra = jceInputStream.readString(5, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.updateType, 0);
        jceOutputStream.write(this.packageName, 1);
        jceOutputStream.write(this.appid, 2);
        jceOutputStream.write(this.actionCode, 3);
        jceOutputStream.write(this.yybExistFlag, 4);
        java.lang.String str = this.extra;
        if (str != null) {
            jceOutputStream.write(str, 5);
        }
    }

    public UpdateInfoLog(byte b17, java.lang.String str, long j17, int i17, byte b18, java.lang.String str2) {
        this.updateType = b17;
        this.packageName = str;
        this.appid = j17;
        this.actionCode = i17;
        this.yybExistFlag = b18;
        this.extra = str2;
    }
}
