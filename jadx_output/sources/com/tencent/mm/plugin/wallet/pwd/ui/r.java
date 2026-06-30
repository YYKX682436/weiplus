package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class r implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.t f179062d;

    public r(com.tencent.mm.plugin.wallet.pwd.ui.t tVar) {
        this.f179062d = tVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.wallet.pwd.ui.t tVar = this.f179062d;
        g4Var.d(1, tVar.f179071d.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), tVar.f179071d.getString(com.tencent.mm.R.string.ktq));
    }
}
