package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class x implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.z f179109d;

    public x(com.tencent.mm.plugin.wallet.pwd.ui.z zVar) {
        this.f179109d = zVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.wallet.pwd.ui.z zVar = this.f179109d;
        g4Var.d(1, zVar.f179125d.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), zVar.f179125d.getString(com.tencent.mm.R.string.ktq));
    }
}
