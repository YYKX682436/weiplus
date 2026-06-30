package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes3.dex */
public final class t0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158489d;

    public t0(com.tencent.mm.plugin.ringtone.uic.v0 v0Var) {
        this.f158489d = v0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        cy3.f[] fVarArr = cy3.f.f224774d;
        com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158489d;
        g4Var.f(0, v0Var.getContext().getString(com.tencent.mm.R.string.ixu));
        cy3.f[] fVarArr2 = cy3.f.f224774d;
        g4Var.d(1, v0Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), v0Var.getContext().getString(com.tencent.mm.R.string.f490367t0));
    }
}
