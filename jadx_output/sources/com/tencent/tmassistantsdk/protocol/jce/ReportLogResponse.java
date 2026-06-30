package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class ReportLogResponse extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "ReportLogResponse";
    public int ret;

    public ReportLogResponse() {
        this.ret = 0;
    }

    public java.lang.String className() {
        return "jce.ReportLogResponse";
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
        new com.qq.taf.jce.JceDisplayer(sb6, i17).display(this.ret, "ret");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        new com.qq.taf.jce.JceDisplayer(sb6, i17).displaySimple(this.ret, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return com.qq.taf.jce.JceUtil.equals(this.ret, ((com.tencent.tmassistantsdk.protocol.jce.ReportLogResponse) obj).ret);
    }

    public java.lang.String fullClassName() {
        return TAG;
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
        this.ret = jceInputStream.read(this.ret, 0, true);
    }

    public void setRet(int i17) {
        this.ret = i17;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ret, 0);
    }

    public ReportLogResponse(int i17) {
        this.ret = i17;
    }
}
