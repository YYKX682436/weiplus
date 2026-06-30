package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class m0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120741d;

    public m0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120741d = t0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120741d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = t0Var.K;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        g4Var.f(0, t0Var.f118381d.getResources().getString(com.tencent.mm.R.string.oqr));
        g4Var.d(1, t0Var.f118381d.getResources().getColor(com.tencent.mm.R.color.Red_100), t0Var.f118381d.getResources().getString(com.tencent.mm.R.string.oqq));
    }
}
