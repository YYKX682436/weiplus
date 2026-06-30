package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class e1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207643f;

    public e1(com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, java.lang.String str) {
        this.f207641d = pBool;
        this.f207642e = progressDialog;
        this.f207643f = str;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        return this.f207641d.value || (progressDialog = this.f207642e) == null || !progressDialog.isShowing();
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.storage.k4 k4Var = (com.tencent.mm.storage.k4) c01.d9.b().q();
        java.lang.String str = this.f207643f;
        com.tencent.mm.storage.z3 n17 = k4Var.n(str, true);
        n17.setType(n17.getType() & (-3));
        if (n17.r2()) {
            c01.e2.B0(n17.d1(), false, true);
        } else {
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, n17);
        }
        com.tencent.mm.ui.conversation.t1.e(str);
        com.tencent.mm.modelgetchatroommsg.f.d().b(str);
        android.app.ProgressDialog progressDialog = this.f207642e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
