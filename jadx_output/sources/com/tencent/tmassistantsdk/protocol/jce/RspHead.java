package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class RspHead extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "RspHead";
    public int cmdId;
    public byte encryptWithPack;
    public java.lang.String phoneGuid;
    public int requestId;
    public int ret;

    public RspHead() {
        this.requestId = 0;
        this.cmdId = 0;
        this.ret = 0;
        this.encryptWithPack = (byte) 0;
        this.phoneGuid = "";
    }

    public java.lang.String className() {
        return "jce.RspHead";
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.display(this.requestId, "requestId");
        jceDisplayer.display(this.cmdId, "cmdId");
        jceDisplayer.display(this.ret, "ret");
        jceDisplayer.display(this.encryptWithPack, "encryptWithPack");
        jceDisplayer.display(this.phoneGuid, "phoneGuid");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.requestId, true);
        jceDisplayer.displaySimple(this.cmdId, true);
        jceDisplayer.displaySimple(this.ret, true);
        jceDisplayer.displaySimple(this.encryptWithPack, true);
        jceDisplayer.displaySimple(this.phoneGuid, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.RspHead rspHead = (com.tencent.tmassistantsdk.protocol.jce.RspHead) obj;
        return com.qq.taf.jce.JceUtil.equals(this.requestId, rspHead.requestId) && com.qq.taf.jce.JceUtil.equals(this.cmdId, rspHead.cmdId) && com.qq.taf.jce.JceUtil.equals(this.ret, rspHead.ret) && com.qq.taf.jce.JceUtil.equals(this.encryptWithPack, rspHead.encryptWithPack) && com.qq.taf.jce.JceUtil.equals(this.phoneGuid, rspHead.phoneGuid);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public int getCmdId() {
        return this.cmdId;
    }

    public byte getEncryptWithPack() {
        return this.encryptWithPack;
    }

    public java.lang.String getPhoneGuid() {
        return this.phoneGuid;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public int getRet() {
        return this.ret;
    }

    public int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.requestId = jceInputStream.read(this.requestId, 0, true);
        this.cmdId = jceInputStream.read(this.cmdId, 1, true);
        this.ret = jceInputStream.read(this.ret, 2, true);
        this.encryptWithPack = jceInputStream.read(this.encryptWithPack, 3, false);
        this.phoneGuid = jceInputStream.readString(4, false);
    }

    public void setCmdId(int i17) {
        this.cmdId = i17;
    }

    public void setEncryptWithPack(byte b17) {
        this.encryptWithPack = b17;
    }

    public void setPhoneGuid(java.lang.String str) {
        this.phoneGuid = str;
    }

    public void setRequestId(int i17) {
        this.requestId = i17;
    }

    public void setRet(int i17) {
        this.ret = i17;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.requestId, 0);
        jceOutputStream.write(this.cmdId, 1);
        jceOutputStream.write(this.ret, 2);
        jceOutputStream.write(this.encryptWithPack, 3);
        java.lang.String str = this.phoneGuid;
        if (str != null) {
            jceOutputStream.write(str, 4);
        }
    }

    public RspHead(int i17, int i18, int i19, byte b17, java.lang.String str) {
        this.requestId = i17;
        this.cmdId = i18;
        this.ret = i19;
        this.encryptWithPack = b17;
        this.phoneGuid = str;
    }
}
