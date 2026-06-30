package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class p4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124673d;

    public p4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124673d = s4Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124673d;
            g4Var.d(0, s4Var.f124748b.getResources().getColor(com.tencent.mm.R.color.f479323wd), s4Var.f124748b.getResources().getString(com.tencent.mm.R.string.f491712e03));
        }
    }
}
