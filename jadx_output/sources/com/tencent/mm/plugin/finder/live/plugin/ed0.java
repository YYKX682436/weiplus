package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ed0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f112401d;

    public ed0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        this.f112401d = nd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        dk2.gf gfVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nk2.l.f338021a.b(nk2.a.f337952e);
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f112401d;
        ya2.b2 b17 = gVar.b(((mm2.c1) nd0Var.P0(mm2.c1.class)).f328852o);
        jz5.f0 f0Var = null;
        if (b17 != null) {
            nd0Var.getClass();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((mm2.d) nd0Var.P0(mm2.d.class)).f328943g, true);
            java.lang.Object[] objArr = n17 != null && n17.r2();
            boolean rj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(b17.w0());
            if (nd0Var.D1()) {
                if (objArr == false) {
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    android.content.Context context = nd0Var.f113617r;
                    kotlin.jvm.internal.o.f(context, "context");
                    r4Var.Q(context, nd0Var.S0(), new com.tencent.mm.plugin.finder.live.plugin.lc0(nd0Var));
                    com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
                    java.lang.String str2 = ((mm2.d) nd0Var.P0(mm2.d.class)).f328943g;
                    am.zd zdVar = followUserEvent.f54346g;
                    zdVar.f8551a = str2;
                    zdVar.f8552b = 4;
                    zdVar.f8553c = true;
                    followUserEvent.e();
                    if (nd0Var.B.getVisibility() == 0) {
                        kotlinx.coroutines.r2 r2Var = nd0Var.H;
                        if (!(r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) && nd0Var.D1()) {
                            nd0Var.H = com.tencent.mm.plugin.finder.live.util.y.m(nd0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.mc0(nd0Var, null), 3, null);
                        }
                    }
                }
            } else if (!rj6) {
                boolean f17 = hc2.s.f(b17);
                if (((mm2.c1) nd0Var.P0(mm2.c1.class)).I7().getInteger(2) == 3) {
                    android.content.Context context2 = nd0Var.f113324f.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    str = xy2.c.e(context2);
                } else {
                    str = "";
                }
                java.lang.String str3 = str;
                com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "#followAnchor nickName:" + b17.w0() + ", isPrivate:" + f17);
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context3 = nd0Var.f365323d.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).c(zy2.ra.class))).V6();
                java.lang.String D0 = b17.D0();
                long j17 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f328983m;
                dk2.xf W0 = nd0Var.W0();
                c61.yb.R8(ybVar, V6, D0, 1, j17, f17, str3, W0 != null ? ((dk2.r4) W0).K(((mm2.e1) nd0Var.P0(mm2.e1.class)).f328988r.getLong(0)) : null, 1, null, null, null, null, null, 7936, null);
                com.tencent.mm.autogen.events.FollowUserEvent followUserEvent2 = new com.tencent.mm.autogen.events.FollowUserEvent();
                java.lang.String D02 = b17.D0();
                am.zd zdVar2 = followUserEvent2.f54346g;
                zdVar2.f8551a = D02;
                zdVar2.f8552b = 4;
                zdVar2.f8553c = true;
                followUserEvent2.e();
            }
            boolean a17 = hc2.s.a(b17);
            com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "followBtn click, nickName:" + b17.w0() + ", isBlock" + a17);
            if (a17) {
                nd0Var.v1(b17.D0());
            }
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f327199f, nd0Var.D1());
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            nd0Var.f113625z.setVisibility(8);
            com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "no anchor finder contact ");
        }
        dk2.Cif cif = dk2.Cif.f233626a;
        long j18 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f328988r.getLong(0);
        kk.l lVar = dk2.Cif.f233627b;
        if (lVar.k(java.lang.Long.valueOf(j18)) && (gfVar = (dk2.gf) lVar.get(java.lang.Long.valueOf(j18))) != null) {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.t1 t1Var = ml2.t1.f327945f;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("follow_icon_expose_condition_sessionid", gfVar.f233529b);
            zy2.zb.T8((zy2.zb) c18, t1Var, linkedHashMap, null, null, null, null, false, 124, null);
        }
        if (((mm2.c1) nd0Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) nd0Var.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
            vVar.a();
            vVar.c(2008);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
