package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FollowUserEvent f113610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent, com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        super(0);
        this.f113610d = followUserEvent;
        this.f113611e = nd0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = this.f113610d;
        java.lang.String str = followUserEvent.f54346g.f8551a;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f113611e;
        boolean b17 = kotlin.jvm.internal.o.b(str, ((mm2.c1) nd0Var.P0(mm2.c1.class)).f328852o);
        am.zd zdVar = followUserEvent.f54346g;
        if (b17 || kotlin.jvm.internal.o.b(zdVar.f8551a, nd0Var.x1())) {
            int i17 = zdVar.f8552b;
            boolean z17 = true;
            if (!(i17 == 4 || i17 == 1)) {
                if (i17 != 5 && i17 != 2) {
                    z17 = false;
                }
                if (z17 && nd0Var.B.getVisibility() != 0) {
                    nd0Var.z1().sendEmptyMessageDelayed(nd0Var.K, 0L);
                }
            } else if (i17 == 4) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                android.widget.TextView view = nd0Var.f113625z;
                kotlin.jvm.internal.o.g(view, "view");
                view.performHapticFeedback(1, 3);
                nd0Var.G1(true, "#4", java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
                qo0.c.a(nd0Var.f113615p, qo0.b.P, null, 2, null);
                nd0Var.z1().sendEmptyMessageDelayed(nd0Var.L, 5000L);
            }
        }
        return jz5.f0.f302826a;
    }
}
