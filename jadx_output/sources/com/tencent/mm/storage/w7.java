package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class w7 extends l75.n0 implements xg3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f196308f = {l75.n0.getCreateSQLs(com.tencent.mm.storage.u7.f196263r, "FriendUser")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f196309d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f196310e;

    public w7(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.u7.f196263r, "FriendUser", null);
        this.f196310e = new com.tencent.mm.storage.v7(this);
        this.f196309d = k0Var;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        com.tencent.mm.storage.u7 u7Var = (com.tencent.mm.storage.u7) f0Var;
        if (u7Var == null) {
            return false;
        }
        boolean insert = super.insert(u7Var);
        if (!insert) {
            return insert;
        }
        l75.v0 v0Var = this.f196310e;
        if (!v0Var.d(u7Var)) {
            return insert;
        }
        v0Var.c();
        return insert;
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        com.tencent.mm.storage.u7 u7Var = (com.tencent.mm.storage.u7) f0Var;
        iz5.a.g("FriendUser NULL !", u7Var != null);
        java.lang.String str = u7Var.field_encryptUsername;
        if (!(this.f196309d.m("FriendUser", "", u7Var.convertTo()) > 0)) {
            return false;
        }
        l75.v0 v0Var = this.f196310e;
        if (!v0Var.d(u7Var)) {
            return true;
        }
        v0Var.c();
        return true;
    }

    public com.tencent.mm.storage.u7 y0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        com.tencent.mm.storage.u7 u7Var = new com.tencent.mm.storage.u7();
        android.database.Cursor D = this.f196309d.D("FriendUser", null, "encryptUsername = ?", new java.lang.String[]{str}, null, null, null, 2);
        if (D.moveToFirst()) {
            u7Var.convertFrom(D);
        }
        D.close();
        return u7Var;
    }
}
