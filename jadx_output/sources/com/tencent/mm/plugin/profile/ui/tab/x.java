package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class x implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.b0 f154688d;

    public x(com.tencent.mm.plugin.profile.ui.tab.b0 b0Var) {
        this.f154688d = b0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.profile.ui.tab.b0 b0Var = this.f154688d;
            g4Var.d(4, b0Var.f154244m.getResources().getColor(com.tencent.mm.R.color.f478532ac), b0Var.f154244m.getResources().getString(com.tencent.mm.R.string.f491733e22));
        }
    }
}
