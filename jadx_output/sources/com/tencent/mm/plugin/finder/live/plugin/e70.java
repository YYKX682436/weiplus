package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e70 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f112377d;

    public e70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f112377d = v70Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f112377d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = v70Var.C;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        g4Var.d(0, v70Var.f365323d.getContext().getResources().getColor(com.tencent.mm.R.color.f479323wd), v70Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.dmy));
    }
}
