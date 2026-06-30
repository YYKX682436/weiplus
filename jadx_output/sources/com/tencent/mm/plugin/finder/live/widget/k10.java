package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k10(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        super(0);
        this.f118798d = m10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f118798d.f118999a.getContext();
        if (context != null) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(context.getResources().getString(com.tencent.mm.R.string.f491545dh4));
            u1Var.n(context.getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.q(false);
        }
        return jz5.f0.f302826a;
    }
}
