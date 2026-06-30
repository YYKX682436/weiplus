package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class Net extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "Net";
    public java.lang.String extNetworkOperator;
    public int extNetworkType;
    public byte isWap;
    public byte netType;

    public Net() {
        this.netType = (byte) 0;
        this.extNetworkOperator = "";
        this.extNetworkType = 0;
        this.isWap = (byte) 0;
    }

    public java.lang.String className() {
        return "jce.Net";
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
        jceDisplayer.display(this.netType, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE);
        jceDisplayer.display(this.extNetworkOperator, "extNetworkOperator");
        jceDisplayer.display(this.extNetworkType, "extNetworkType");
        jceDisplayer.display(this.isWap, "isWap");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.netType, true);
        jceDisplayer.displaySimple(this.extNetworkOperator, true);
        jceDisplayer.displaySimple(this.extNetworkType, true);
        jceDisplayer.displaySimple(this.isWap, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.Net net = (com.tencent.tmassistantsdk.protocol.jce.Net) obj;
        return com.qq.taf.jce.JceUtil.equals(this.netType, net.netType) && com.qq.taf.jce.JceUtil.equals(this.extNetworkOperator, net.extNetworkOperator) && com.qq.taf.jce.JceUtil.equals(this.extNetworkType, net.extNetworkType) && com.qq.taf.jce.JceUtil.equals(this.isWap, net.isWap);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public java.lang.String getExtNetworkOperator() {
        return this.extNetworkOperator;
    }

    public int getExtNetworkType() {
        return this.extNetworkType;
    }

    public byte getIsWap() {
        return this.isWap;
    }

    public byte getNetType() {
        return this.netType;
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
        this.netType = jceInputStream.read(this.netType, 0, true);
        this.extNetworkOperator = jceInputStream.readString(1, false);
        this.extNetworkType = jceInputStream.read(this.extNetworkType, 2, false);
        this.isWap = jceInputStream.read(this.isWap, 3, false);
    }

    public void setExtNetworkOperator(java.lang.String str) {
        this.extNetworkOperator = str;
    }

    public void setExtNetworkType(int i17) {
        this.extNetworkType = i17;
    }

    public void setIsWap(byte b17) {
        this.isWap = b17;
    }

    public void setNetType(byte b17) {
        this.netType = b17;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.netType, 0);
        java.lang.String str = this.extNetworkOperator;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        jceOutputStream.write(this.extNetworkType, 2);
        jceOutputStream.write(this.isWap, 3);
    }

    public Net(byte b17, java.lang.String str, int i17, byte b18) {
        this.netType = b17;
        this.extNetworkOperator = str;
        this.extNetworkType = i17;
        this.isWap = b18;
    }
}
