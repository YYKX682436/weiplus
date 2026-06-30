package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class ya extends dm.gb {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f196388v = dm.gb.initAutoDBInfo(com.tencent.mm.storage.ya.class);

    public ya(java.lang.String str) {
        this();
        this.field_conRemark = "";
        this.field_encryptUsername = str == null ? "" : str;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // dm.gb, l75.f0
    public l75.e0 getDBInfo() {
        return f196388v;
    }

    public void u0(java.lang.String str) {
        this.field_conRemark = str;
    }

    public void v0(java.lang.String str) {
        this.field_encryptUsername = str;
    }

    public ya(java.lang.String str, java.lang.String str2) {
        this();
        this.field_encryptUsername = str == null ? "" : str;
        this.field_conRemark = str2 == null ? "" : str2;
    }

    public ya() {
        this.field_encryptUsername = "";
        this.field_conRemark = "";
    }
}
