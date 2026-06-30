package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class oo implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f119310d;

    public oo(com.tencent.mm.plugin.finder.live.widget.hp hpVar) {
        this.f119310d = hpVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f119310d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = hpVar.V1;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        g4Var.d(0, hpVar.f118183e.getResources().getColor(com.tencent.mm.R.color.f479323wd), hpVar.f118183e.getResources().getString(com.tencent.mm.R.string.f492116f92));
    }
}
