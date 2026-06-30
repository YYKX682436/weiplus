package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes3.dex */
public class y1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f179531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f179532e;

    public y1(com.tencent.mm.plugin.wallet_core.id_verify.z1 z1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, android.view.View view) {
        this.f179531d = k0Var;
        this.f179532e = view;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f179531d;
        k0Var.o(null);
        k0Var.o(this.f179532e);
    }
}
