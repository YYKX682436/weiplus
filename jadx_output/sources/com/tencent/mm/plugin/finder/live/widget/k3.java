package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f118803d;

    public k3(com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        this.f118803d = b4Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f118803d;
            g4Var.d(4, b4Var.f117820a.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), b4Var.f117820a.getContext().getResources().getString(com.tencent.mm.R.string.f491733e22));
        }
    }
}
