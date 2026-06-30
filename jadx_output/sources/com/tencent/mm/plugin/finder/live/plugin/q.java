package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r f113938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.h0 f113939e;

    public q(com.tencent.mm.plugin.finder.live.plugin.r rVar, cm2.h0 h0Var) {
        this.f113938d = rVar;
        this.f113939e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.r rVar = this.f113938d;
        yz5.l lVar = rVar.f114063g;
        cm2.h0 h0Var = this.f113939e;
        if (lVar != null) {
            lVar.invoke(h0Var);
        }
        bf2.c.c(bf2.c.f19598a, rVar.f114061e, 5, 4, pm0.v.u(h0Var.f43349w), h0Var.D, null, 0, 0, null, 0, 992, null);
        if (((mm2.c1) rVar.f114061e.a(mm2.c1.class)).M7()) {
            qo0.c cVar = rVar.f114062f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.getPlugin(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.b();
            }
        }
        com.tencent.mars.xlog.Log.i(rVar.f114065i, "needJump:" + h0Var.f43388g);
        if (h0Var.f43388g) {
            mm2.e1 e1Var = (mm2.e1) rVar.f114061e.a(mm2.e1.class);
            long j17 = e1Var.f328983m;
            long j18 = e1Var.f328988r.getLong(0);
            java.lang.String e17 = xy2.c.e(rVar.f114060d);
            gk2.e eVar = rVar.f114061e;
            new ke2.v(j17, j18, 4, e17, ((mm2.e1) eVar.a(mm2.e1.class)).f328985o, h0Var.f43387f, new com.tencent.mm.protobuf.g(h0Var.f43348v.toByteArray()), zl2.r4.f473950a.f1(eVar, java.lang.Long.valueOf(h0Var.f43349w)), ((mm2.e1) eVar.a(mm2.e1.class)).f328993w, null, 512, null).l().K(new com.tencent.mm.plugin.finder.live.plugin.p(h0Var, rVar));
        } else {
            com.tencent.mm.plugin.finder.live.plugin.m mVar = com.tencent.mm.plugin.finder.live.plugin.r.f114059n;
            android.view.ViewGroup viewGroup = rVar.f114066m;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            mVar.a(context, rVar.f114061e, rVar.f114065i, h0Var);
            if (rVar.f114062f.getLiveRole() == 0) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                ml2.f4 f4Var = ml2.f4.f327432f;
                java.lang.String valueOf = java.lang.String.valueOf(h0Var.f43349w);
                r45.n3 n3Var = h0Var.f43350x;
                java.lang.String str = (n3Var == null || (string = n3Var.getString(3)) == null) ? "" : string;
                java.lang.String valueOf2 = java.lang.String.valueOf(h0Var.f43349w);
                java.lang.String str2 = h0Var.C;
                ml2.r0.Dj(r0Var, f4Var, null, valueOf, str, valueOf2, str2 == null ? "" : str2, h0Var.D, h0Var.E, null, null, null, null, false, null, 16128, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
