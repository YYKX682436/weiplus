package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class h1 extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public boolean f213904m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f213905n = true;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f213906o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Dialog f213907p;

    @Override // com.tencent.mm.modelbase.i
    public void k(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        android.app.Dialog dialog = this.f213907p;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f213907p.dismiss();
        this.f213907p = null;
        this.f213906o = null;
    }

    @Override // com.tencent.mm.modelbase.i
    public synchronized pq5.g l() {
        android.content.Context context;
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        if (oVar != null) {
            com.tencent.mm.wallet_core.ui.b0.g(oVar.f70713d);
        }
        if (this.f213904m && (context = this.f213906o) != null && this.f213907p == null) {
            this.f213907p = db5.e1.O(context, null, 3, com.tencent.mm.R.style.f494256i6, context.getString(com.tencent.mm.R.string.ggc), true, this.f213905n, new com.tencent.mm.wallet_core.model.g1(this));
        }
        return super.l();
    }

    @Override // com.tencent.mm.modelbase.i
    public void p(com.tencent.mm.modelbase.o oVar) {
        if (oVar.getNewDNSBusinessType() == 0) {
            oVar.setNewDNSBusinessType(2);
        }
        super.p(oVar);
    }
}
