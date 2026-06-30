package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class z3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124859d;

    public z3(com.tencent.mm.plugin.finder.profile.widget.e4 e4Var) {
        this.f124859d = e4Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124859d;
            g4Var.d(1, e4Var.f124530f.getResources().getColor(com.tencent.mm.R.color.f478532ac), e4Var.f124530f.getResources().getString(com.tencent.mm.R.string.nkk));
        }
    }
}
