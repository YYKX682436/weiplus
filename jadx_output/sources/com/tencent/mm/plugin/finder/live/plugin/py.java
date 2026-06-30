package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class py implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f113936d;

    public py(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f113936d = tyVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f113936d;
        g4Var.f(0, tyVar.A.getString(com.tencent.mm.R.string.oya));
        g4Var.f(1, tyVar.A.getString(com.tencent.mm.R.string.oyb));
    }
}
