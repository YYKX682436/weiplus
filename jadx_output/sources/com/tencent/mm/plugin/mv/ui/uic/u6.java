package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.x6 f151480d;

    public u6(com.tencent.mm.plugin.mv.ui.uic.x6 x6Var) {
        this.f151480d = x6Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.mv.ui.uic.x6 x6Var = this.f151480d;
        g4Var.f(x6Var.f151531e, x6Var.getContext().getResources().getString(com.tencent.mm.R.string.h4o));
        g4Var.d(x6Var.f151532f, x6Var.getColor(com.tencent.mm.R.color.f478532ac), x6Var.getContext().getResources().getString(com.tencent.mm.R.string.h4n));
    }
}
