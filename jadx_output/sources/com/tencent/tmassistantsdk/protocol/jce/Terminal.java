package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class Terminal extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "Terminal";
    public java.lang.String androidId;
    public java.lang.String androidIdSdCard;
    public java.lang.String imei;
    public java.lang.String imsi;
    public java.lang.String macAdress;

    public Terminal() {
        this.imei = "";
        this.macAdress = "";
        this.androidId = "";
        this.androidIdSdCard = "";
        this.imsi = "";
    }

    public java.lang.String className() {
        return "jce.Terminal";
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
        jceDisplayer.display(this.imei, "imei");
        jceDisplayer.display(this.macAdress, "macAdress");
        jceDisplayer.display(this.androidId, "androidId");
        jceDisplayer.display(this.androidIdSdCard, "androidIdSdCard");
        jceDisplayer.display(this.imsi, "imsi");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.imei, true);
        jceDisplayer.displaySimple(this.macAdress, true);
        jceDisplayer.displaySimple(this.androidId, true);
        jceDisplayer.displaySimple(this.androidIdSdCard, true);
        jceDisplayer.displaySimple(this.imsi, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.Terminal terminal = (com.tencent.tmassistantsdk.protocol.jce.Terminal) obj;
        return com.qq.taf.jce.JceUtil.equals(this.imei, terminal.imei) && com.qq.taf.jce.JceUtil.equals(this.macAdress, terminal.macAdress) && com.qq.taf.jce.JceUtil.equals(this.androidId, terminal.androidId) && com.qq.taf.jce.JceUtil.equals(this.androidIdSdCard, terminal.androidIdSdCard) && com.qq.taf.jce.JceUtil.equals(this.imsi, terminal.imsi);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public java.lang.String getAndroidId() {
        return this.androidId;
    }

    public java.lang.String getAndroidIdSdCard() {
        return this.androidIdSdCard;
    }

    public java.lang.String getImei() {
        return this.imei;
    }

    public java.lang.String getImsi() {
        return this.imsi;
    }

    public java.lang.String getMacAdress() {
        return this.macAdress;
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
        this.imei = jceInputStream.readString(0, false);
        this.macAdress = jceInputStream.readString(1, false);
        this.androidId = jceInputStream.readString(2, false);
        this.androidIdSdCard = jceInputStream.readString(3, false);
        this.imsi = jceInputStream.readString(4, false);
    }

    public void setAndroidId(java.lang.String str) {
        this.androidId = str;
    }

    public void setAndroidIdSdCard(java.lang.String str) {
        this.androidIdSdCard = str;
    }

    public void setImei(java.lang.String str) {
        this.imei = str;
    }

    public void setImsi(java.lang.String str) {
        this.imsi = str;
    }

    public void setMacAdress(java.lang.String str) {
        this.macAdress = str;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        java.lang.String str = this.imei;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        java.lang.String str2 = this.macAdress;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        java.lang.String str3 = this.androidId;
        if (str3 != null) {
            jceOutputStream.write(str3, 2);
        }
        java.lang.String str4 = this.androidIdSdCard;
        if (str4 != null) {
            jceOutputStream.write(str4, 3);
        }
        java.lang.String str5 = this.imsi;
        if (str5 != null) {
            jceOutputStream.write(str5, 4);
        }
    }

    public Terminal(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.imei = str;
        this.macAdress = str2;
        this.androidId = str3;
        this.androidIdSdCard = str4;
        this.imsi = str5;
    }
}
