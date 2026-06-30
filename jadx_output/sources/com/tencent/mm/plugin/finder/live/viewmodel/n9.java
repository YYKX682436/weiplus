package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class n9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117289d;

    public n9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        this.f117289d = v9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117289d;
        g4Var.d(10001, v9Var.getContext().getResources().getColor(com.tencent.mm.R.color.Red_100), v9Var.getContext().getResources().getString(com.tencent.mm.R.string.eif));
    }
}
