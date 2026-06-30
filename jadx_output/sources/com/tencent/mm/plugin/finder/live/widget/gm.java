package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gm implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f118464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f118465e;

    public gm(com.tencent.mm.plugin.finder.live.widget.wm wmVar, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f118464d = wmVar;
        this.f118465e = roundedCornerFrameLayout;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f118464d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = wmVar.f120220u;
        if (k0Var != null) {
            k0Var.o(null);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = wmVar.f120220u;
        if (k0Var2 != null) {
            k0Var2.o(this.f118465e);
        }
    }
}
