package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class tq implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133147d;

    public tq(android.view.View view) {
        this.f133147d = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.View view = this.f133147d;
            g4Var.d(162, view.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), view.getContext().getResources().getString(com.tencent.mm.R.string.f0o));
        }
    }
}
