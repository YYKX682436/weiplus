package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jd0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        super(2);
        this.f113085d = nd0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        xu2.u uVar;
        xu2.v vVar;
        android.view.View it = (android.view.View) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(it, "it");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "fansClubTag click " + booleanValue);
            android.os.Bundle bundle = null;
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f113085d;
            if (booleanValue) {
                qo0.c.a(nd0Var.f113615p, qo0.b.O4, null, 2, null);
            } else {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327613f, null, com.tencent.mm.plugin.finder.live.plugin.eh0.f112419i, 2, null);
                qo0.c cVar = nd0Var.f113615p;
                qo0.b bVar = qo0.b.O4;
                if (zl2.r4.f473950a.w1()) {
                    bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY", true);
                }
                cVar.statusChange(bVar, bundle);
            }
            if (((mm2.c1) nd0Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) nd0Var.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.a();
                vVar.c(2022);
            }
        }
        return jz5.f0.f302826a;
    }
}
