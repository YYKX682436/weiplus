package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class h0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f123749d;

    public h0(com.tencent.mm.plugin.finder.profile.uic.o0 o0Var) {
        this.f123749d = o0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f123749d;
            g4Var.d(1, o0Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), o0Var.getContext().getResources().getString(com.tencent.mm.R.string.f491265mg1));
        }
    }
}
