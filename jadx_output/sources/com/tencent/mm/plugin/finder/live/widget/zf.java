package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gg f120572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.gg ggVar) {
        super(0);
        this.f120571d = str;
        this.f120572e = ggVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f120571d;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f120572e;
        if (z17) {
            str = ggVar.getContext().getResources().getString(com.tencent.mm.R.string.ek7);
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(ggVar.getContext());
        u1Var.r(true);
        u1Var.g(str);
        u1Var.n(ggVar.getContext().getResources().getString(com.tencent.mm.R.string.dhn));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
