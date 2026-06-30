package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class n1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124627d;

    public n1(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var) {
        this.f124627d = s1Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124627d;
            g4Var.d(1, s1Var.f124718b.getResources().getColor(com.tencent.mm.R.color.f478532ac), s1Var.f124718b.getResources().getString(com.tencent.mm.R.string.nkk));
        }
    }
}
