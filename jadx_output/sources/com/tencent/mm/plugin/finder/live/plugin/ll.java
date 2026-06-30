package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ll implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113410d;

    public ll(int i17, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, int i18) {
        this.f113410d = hmVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f113410d;
            g4Var.f(1, hmVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f491764e62));
            g4Var.f(2, hmVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f491763e61));
        }
    }
}
