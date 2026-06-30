package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class l5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.n5 f157805d;

    public l5(com.tencent.mm.plugin.remittance.ui.n5 n5Var) {
        this.f157805d = n5Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.remittance.ui.n5 n5Var = this.f157805d;
            com.tencent.mm.sdk.platformtools.b0.e(n5Var.f157848d.getText().toString());
            db5.e1.W(n5Var.f157848d.getContext(), n5Var.f157848d.getContext().getString(com.tencent.mm.R.string.f490361st));
        }
    }
}
