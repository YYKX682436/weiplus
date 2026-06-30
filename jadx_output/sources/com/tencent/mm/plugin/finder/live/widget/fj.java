package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gj f118357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.gj gjVar) {
        super(0);
        this.f118356d = str;
        this.f118357e = gjVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f118356d;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.finder.live.widget.gj gjVar = this.f118357e;
        if (z17) {
            str = gjVar.getContext().getResources().getString(com.tencent.mm.R.string.e_j);
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(gjVar.getContext());
        u1Var.g(str);
        u1Var.n(gjVar.getContext().getResources().getString(com.tencent.mm.R.string.f491438d34));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
