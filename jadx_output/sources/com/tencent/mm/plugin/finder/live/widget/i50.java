package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i50 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f118641d;

    public i50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f118641d = q50Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.widget.n40 n40Var = com.tencent.mm.plugin.finder.live.widget.o40.f119250e;
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f118641d;
        g4Var.f(1, q50Var.f118183e.getString(com.tencent.mm.R.string.nwh));
        boolean z17 = pm0.v.z(q50Var.g0().f329581e, 64);
        android.content.Context context = q50Var.f118183e;
        if (!z17) {
            g4Var.f(2, context.getString(com.tencent.mm.R.string.e3i));
        }
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.J0).getValue()).r()).intValue() == 1 && q50Var.f119497l1 == com.tencent.mm.plugin.finder.live.widget.o40.f119253h) {
            g4Var.f(3, context.getString(com.tencent.mm.R.string.ouw));
        }
    }
}
