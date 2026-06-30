package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class eo implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132049e;

    public eo(android.view.View view, java.lang.String str) {
        this.f132048d = view;
        this.f132049e = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.d(1000, this.f132048d.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), this.f132049e);
        }
    }
}
