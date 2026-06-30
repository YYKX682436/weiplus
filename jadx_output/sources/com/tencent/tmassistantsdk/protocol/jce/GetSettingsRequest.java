package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class GetSettingsRequest extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "GetSettingsRequest";
    public java.lang.String reserve;

    public GetSettingsRequest() {
        this.reserve = "";
    }

    public java.lang.String className() {
        return "jce.GetSettingsRequest";
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
        new com.qq.taf.jce.JceDisplayer(sb6, i17).display(this.reserve, "reserve");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        new com.qq.taf.jce.JceDisplayer(sb6, i17).displaySimple(this.reserve, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return com.qq.taf.jce.JceUtil.equals(this.reserve, ((com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest) obj).reserve);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public java.lang.String getReserve() {
        return this.reserve;
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
        this.reserve = jceInputStream.readString(0, false);
    }

    public void setReserve(java.lang.String str) {
        this.reserve = str;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        java.lang.String str = this.reserve;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
    }

    public GetSettingsRequest(java.lang.String str) {
        this.reserve = str;
    }
}
