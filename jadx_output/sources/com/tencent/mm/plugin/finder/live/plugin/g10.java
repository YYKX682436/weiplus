package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g10 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f112621d;

    public g10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var) {
        this.f112621d = z10Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.live.plugin.z10 z10Var = this.f112621d;
            g4Var.d(4, z10Var.f115261m.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), z10Var.f115261m.getContext().getResources().getString(com.tencent.mm.R.string.f491733e22));
        }
    }
}
