package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class cb implements com.tencent.mm.plugin.finder.assist.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f128984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128985b;

    public cb(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI, java.lang.String str) {
        this.f128984a = finderModifyNameUI;
        this.f128985b = str;
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void b() {
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f128984a;
        android.app.ProgressDialog progressDialog = finderModifyNameUI.I;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        finderModifyNameUI.I = null;
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void c(com.tencent.mm.plugin.finder.assist.h9 result) {
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result.f102233a;
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f128984a;
        boolean z18 = result.f102234b;
        if (!z17) {
            if (z18) {
                return;
            }
            android.app.ProgressDialog progressDialog = finderModifyNameUI.I;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            finderModifyNameUI.I = null;
            return;
        }
        if (z18) {
            java.lang.String str = com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.Q;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(finderModifyNameUI, "", finderModifyNameUI.getString(com.tencent.mm.R.string.z_), true, false, null);
            finderModifyNameUI.I = Q;
            if (Q != null) {
                Q.show();
            }
        }
        java.lang.String str2 = com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.Q;
        finderModifyNameUI.getClass();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.s0 s0Var = hb2.s0.f280090e;
        java.lang.String str3 = finderModifyNameUI.N;
        s0Var.getClass();
        java.lang.String signature = this.f128985b;
        kotlin.jvm.internal.o.g(signature, "signature");
        r45.ri2 ri2Var = new r45.ri2();
        ri2Var.set(1, signature);
        if (str3 != null) {
            hb2.w0.a(s0Var, str3, ri2Var, finderModifyNameUI, false, false, null, 56, null);
        }
    }
}
