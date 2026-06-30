package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f118208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cw1 f118209e;

    public e3(com.tencent.mm.plugin.finder.live.widget.h3 h3Var, r45.cw1 cw1Var) {
        this.f118208d = h3Var;
        this.f118209e = cw1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setFollowState$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.h3 h3Var = this.f118208d;
        h3Var.getClass();
        r45.cw1 infoItem = this.f118209e;
        kotlin.jvm.internal.o.g(infoItem, "infoItem");
        ya2.b2 b2Var = new ya2.b2();
        b2Var.field_nickname = java.lang.String.valueOf(infoItem.getString(1));
        b2Var.field_username = java.lang.String.valueOf(infoItem.getString(0));
        int integer = infoItem.getInteger(5);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = h3Var.f118513b;
        if (integer == 2) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f327200g, true);
            zl2.r4.f473950a.R(h3Var.f118512a, lVar.S0(), b2Var.D0(), true, 5, new com.tencent.mm.plugin.finder.live.widget.x2(h3Var));
        } else {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f327200g, false);
            boolean f17 = hc2.s.f(b2Var);
            java.lang.String D0 = b2Var.D0();
            android.content.Context context = h3Var.f118512a;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            long j17 = ((mm2.e1) lVar.P0(mm2.e1.class)).f328983m;
            dk2.xf W0 = lVar.W0();
            c61.yb.R8(ybVar, V6, D0, 1, j17, f17, null, W0 != null ? ((dk2.r4) W0).K(((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0)) : null, 10, 11, null, null, null, null, 7712, null);
        }
        boolean a17 = hc2.s.a(b2Var);
        com.tencent.mars.xlog.Log.i(h3Var.f118514c, "followBtn click, nickName:" + b2Var.w0() + ", isBlock" + a17);
        if (a17) {
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = lVar instanceof com.tencent.mm.plugin.finder.live.plugin.nd0 ? (com.tencent.mm.plugin.finder.live.plugin.nd0) lVar : null;
            if (nd0Var != null) {
                nd0Var.v1(b2Var.D0());
            }
        }
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
        java.lang.String D02 = b2Var.D0();
        am.zd zdVar = followUserEvent.f54346g;
        zdVar.f8551a = D02;
        zdVar.f8552b = 4;
        zdVar.f8553c = true;
        followUserEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setFollowState$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
