package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class StatCfg extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "StatCfg";
    public int internal;
    public short lineNum;
    public byte netType;
    public byte type;

    public StatCfg() {
        this.type = (byte) 0;
        this.netType = (byte) 0;
        this.lineNum = (short) 0;
        this.internal = 0;
    }

    public java.lang.String className() {
        return "jce.StatCfg";
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
        jceDisplayer.display(this.type, "type");
        jceDisplayer.display(this.netType, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE);
        jceDisplayer.display(this.lineNum, "lineNum");
        jceDisplayer.display(this.internal, "internal");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.type, true);
        jceDisplayer.displaySimple(this.netType, true);
        jceDisplayer.displaySimple(this.lineNum, true);
        jceDisplayer.displaySimple(this.internal, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.StatCfg statCfg = (com.tencent.tmassistantsdk.protocol.jce.StatCfg) obj;
        return com.qq.taf.jce.JceUtil.equals(this.type, statCfg.type) && com.qq.taf.jce.JceUtil.equals(this.netType, statCfg.netType) && com.qq.taf.jce.JceUtil.equals(this.lineNum, statCfg.lineNum) && com.qq.taf.jce.JceUtil.equals(this.internal, statCfg.internal);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public int getInternal() {
        return this.internal;
    }

    public short getLineNum() {
        return this.lineNum;
    }

    public byte getNetType() {
        return this.netType;
    }

    public byte getType() {
        return this.type;
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
        this.type = jceInputStream.read(this.type, 0, true);
        this.netType = jceInputStream.read(this.netType, 1, true);
        this.lineNum = jceInputStream.read(this.lineNum, 2, false);
        this.internal = jceInputStream.read(this.internal, 3, false);
    }

    public void setInternal(int i17) {
        this.internal = i17;
    }

    public void setLineNum(short s17) {
        this.lineNum = s17;
    }

    public void setNetType(byte b17) {
        this.netType = b17;
    }

    public void setType(byte b17) {
        this.type = b17;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.type, 0);
        jceOutputStream.write(this.netType, 1);
        jceOutputStream.write(this.lineNum, 2);
        jceOutputStream.write(this.internal, 3);
    }

    public StatCfg(byte b17, byte b18, short s17, int i17) {
        this.type = b17;
        this.netType = b18;
        this.lineNum = s17;
        this.internal = i17;
    }
}
