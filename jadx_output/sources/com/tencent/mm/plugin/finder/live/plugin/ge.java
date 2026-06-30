package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ge extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(3);
        this.f112685d = mgVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dk2.zf msg = (dk2.zf) obj;
        android.view.View likeRootView = (android.view.View) obj2;
        in5.r0 holder = (in5.r0) obj3;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(likeRootView, "likeRootView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112685d;
        mgVar.M1(false);
        if (likeRootView.getVisibility() == 0 && (msg instanceof dk2.cg)) {
            if (zl2.r4.f473950a.w1()) {
                ml2.b5 b5Var = ((dk2.cg) msg).o() ? ml2.b5.f327302x : ml2.b5.f327300v;
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.j0.Dj((ml2.j0) c17, b5Var, msg, null, 4, null);
            } else if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
                ml2.g5 g5Var = ((dk2.cg) msg).o() ? ml2.g5.M : ml2.g5.K;
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.Bj((ml2.r0) c18, g5Var, msg, 0, 4, null);
            } else {
                ml2.g5 g5Var2 = ((dk2.cg) msg).o() ? ml2.g5.f327496w : ml2.g5.f327494u;
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.Bj((ml2.r0) c19, g5Var2, msg, 0, 4, null);
            }
            se2.w wVar = se2.w.f406895a;
            kotlinx.coroutines.y0 y0Var = holder.f293120d;
            gk2.e S0 = mgVar.S0();
            android.content.Context context = mgVar.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            wVar.k(y0Var, msg, likeRootView, S0, context);
        }
        return jz5.f0.f302826a;
    }
}
