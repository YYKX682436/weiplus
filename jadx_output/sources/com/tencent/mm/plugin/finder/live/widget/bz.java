package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dz f117927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(com.tencent.mm.plugin.finder.live.widget.dz dzVar) {
        super(0);
        this.f117927d = dzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.dz dzVar = this.f117927d;
        android.view.View view = dzVar.f118169e;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context != null) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.r(true);
            u1Var.g(context.getResources().getString(com.tencent.mm.R.string.dh6));
            u1Var.n(context.getResources().getString(com.tencent.mm.R.string.ekd));
            u1Var.j(context.getResources().getString(com.tencent.mm.R.string.f490347sg));
            u1Var.l(new com.tencent.mm.plugin.finder.live.widget.az(dzVar));
            u1Var.q(false);
        }
        return jz5.f0.f302826a;
    }
}
