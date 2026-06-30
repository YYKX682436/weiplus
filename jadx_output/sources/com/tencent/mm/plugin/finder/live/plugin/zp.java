package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zp implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f115372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f115373e;

    public zp(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f115372d = k0Var;
        this.f115373e = roundedCornerFrameLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f115372d;
        k0Var.o(null);
        k0Var.o(this.f115373e);
    }
}
