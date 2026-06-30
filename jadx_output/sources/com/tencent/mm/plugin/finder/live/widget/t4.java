package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u4 f119865d;

    public t4(com.tencent.mm.plugin.finder.live.widget.u4 u4Var) {
        this.f119865d = u4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.Q, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        com.tencent.mm.plugin.finder.live.widget.s4 s4Var = com.tencent.mm.plugin.finder.live.widget.s4.f119719d;
        com.tencent.mm.plugin.finder.live.widget.u4 u4Var = this.f119865d;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = u4Var.f119940f;
        boolean z17 = ((mm2.c1) lVar.P0(mm2.c1.class)).f328778a5;
        boolean z18 = sn0.b.f409964e2 != null;
        boolean o17 = ((mm2.e1) lVar.P0(mm2.e1.class)).a7() ? ((mm2.o2) lVar.P0(mm2.o2.class)).f329308q : gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false);
        boolean z19 = ((java.lang.Number) ae2.in.f3688a.M().r()).intValue() == 1;
        boolean z27 = o17 || z19;
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean z28 = r4Var.L(lVar.S0()) && r4Var.w1();
        qo0.c cVar = u4Var.f119939e;
        if (!z18) {
            boolean z29 = ((mm2.m6) lVar.P0(mm2.m6.class)).f329248p;
            if (z28 && z29) {
                qo0.c.a(cVar, qo0.b.f365399p2, null, 2, null);
            } else if (z29) {
                sf2.x xVar = (sf2.x) lVar.U0(sf2.x.class);
                if (xVar != null) {
                    xVar.s7(true);
                }
            } else {
                qo0.c.a(cVar, qo0.b.f365382m2, null, 2, null);
            }
        } else if (z17) {
            if (z27 && z28) {
                com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = (com.tencent.mm.plugin.finder.live.plugin.l8) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.l8.class);
                if (l8Var != null) {
                    l8Var.u1(s4Var);
                }
            } else if (z27) {
                sf2.x xVar2 = (sf2.x) lVar.U0(sf2.x.class);
                if (xVar2 != null) {
                    xVar2.s7(true);
                }
                sf2.x xVar3 = (sf2.x) lVar.U0(sf2.x.class);
                if (xVar3 != null) {
                    xVar3.c7();
                }
            } else {
                qo0.c.a(cVar, qo0.b.f365382m2, null, 2, null);
            }
        } else if (z27) {
            sf2.x xVar4 = (sf2.x) lVar.U0(sf2.x.class);
            if (xVar4 != null) {
                xVar4.s7(false);
            }
            sf2.x xVar5 = (sf2.x) lVar.U0(sf2.x.class);
            if (xVar5 != null) {
                xVar5.c7();
            }
        } else {
            com.tencent.mars.xlog.Log.i(u4Var.f119941g, "error in, checkVisible enableSingSongListFromBack: " + o17 + ", enableSwitch: " + z19 + ", isGameLive: " + z17 + ", isSecond: " + z18);
            com.tencent.mm.plugin.finder.live.plugin.l8 l8Var2 = (com.tencent.mm.plugin.finder.live.plugin.l8) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.l8.class);
            if (l8Var2 != null) {
                l8Var2.u1(s4Var);
            }
        }
        u4Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.u2[] u2VarArr = ml2.u2.f328109d;
        jSONObject.put("type", 11);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.y6((zy2.zb) c18, ml2.z4.C, jSONObject.toString(), null, 4, null);
        u4Var.getClass();
        if (u4Var.f119943i.getVisibility() == 0) {
            ll2.e.d(ll2.e.f319133a, "anchorlive.bottom.newmusic", false, false, 6, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
