package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120490d;

    public z00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f120490d = m10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.protobuf.g byteString;
        android.view.ViewGroup viewGroup;
        android.view.View view2;
        com.tencent.mm.protobuf.g byteString2;
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120490d;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
        r45.fr1 fr1Var = ((mm2.c1) lVar.P0(mm2.c1.class)).M2;
        if (fr1Var != null) {
            if (fr1Var.getInteger(10) == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "teamup_gift_reddot is 0");
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "gameTeamInfo?.reddot_id is %s", fr1Var.getString(12));
                if (!android.text.TextUtils.isEmpty(fr1Var.getString(12)) && (str3 = m10Var.M) != null && r26.i0.q(str3, fr1Var.getString(12), false, 2, null)) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "reddot_id is removed");
                } else if (android.text.TextUtils.isEmpty(fr1Var.getString(12))) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "reddot_id is empty");
                } else {
                    m10Var.M = fr1Var.getString(12);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GAME_TEAM_GIFT_REDDOT_ID_STRING_SYNC, fr1Var.getString(12));
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "doFinderLiveGetTeamupGiftPrepare");
                    new db2.d4(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, fr1Var.getString(12)).l().K(com.tencent.mm.plugin.finder.live.widget.e00.f118202a);
                }
            }
        }
        android.widget.FrameLayout frameLayout = m10Var.f119017s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        r45.fr1 fr1Var2 = ((mm2.c1) m10Var.f119001c.P0(mm2.c1.class)).M2;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Tj(m10Var.i(fr1Var2 != null ? fr1Var2.getInteger(10) : 0, 20));
        com.tencent.mm.plugin.finder.live.plugin.l lVar2 = m10Var.f119001c;
        r45.fr1 fr1Var3 = ((mm2.c1) lVar2.P0(mm2.c1.class)).M2;
        if (fr1Var3 != null) {
            if (fr1Var3.getInteger(8) == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "goMiniApp teamup_gift_status is 0");
            } else if (((r45.z87) fr1Var3.getCustom(11)) == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "goMiniApp teamup_gift_jump_info is null");
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - m10Var.Q < 200) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "don't click again in 200ms");
                } else {
                    m10Var.Q = currentTimeMillis;
                    java.lang.String obj = com.tencent.mm.sdk.platformtools.t8.s0().toString();
                    l81.b1 b1Var = new l81.b1();
                    r45.z87 z87Var = (r45.z87) fr1Var3.getCustom(11);
                    java.lang.String str4 = "";
                    if (z87Var == null || (str = z87Var.getString(0)) == null) {
                        str = "";
                    }
                    b1Var.f317014b = str;
                    r45.z87 z87Var2 = (r45.z87) fr1Var3.getCustom(11);
                    if (z87Var2 == null || (str2 = z87Var2.getString(1)) == null) {
                        str2 = "";
                    }
                    b1Var.f317022f = str2;
                    com.tencent.mm.plugin.finder.live.widget.qz qzVar = new com.tencent.mm.plugin.finder.live.widget.qz();
                    r45.z87 z87Var3 = (r45.z87) fr1Var3.getCustom(11);
                    if (z87Var3 != null && (byteString2 = z87Var3.getByteString(3)) != null) {
                        str4 = byteString2.i();
                    }
                    qzVar.f119562d = str4;
                    b1Var.f317028i = qzVar;
                    b1Var.f317032k = 1177;
                    r45.z87 z87Var4 = (r45.z87) fr1Var3.getCustom(11);
                    b1Var.f317016c = z87Var4 != null ? z87Var4.getInteger(2) : 0;
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    if (r4Var.t0() != 0) {
                        b1Var.f317016c = r4Var.t0();
                    }
                    b1Var.f317034l = ":" + ((mm2.e1) lVar2.P0(mm2.e1.class)).f328988r.getLong(0) + ':' + ((mm2.c1) lVar2.P0(mm2.c1.class)).f328852o + "::" + ((mm2.c1) lVar2.P0(mm2.c1.class)).f328861p2 + ':' + obj + ':' + ((mm2.c1) lVar2.P0(mm2.c1.class)).P3 + ':' + ((mm2.c1) lVar2.P0(mm2.c1.class)).f328791d3;
                    com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
                    int i17 = -1;
                    int height = (y1Var == null || (view2 = y1Var.f212027f) == null) ? -1 : view2.getHeight();
                    com.tencent.mm.ui.widget.dialog.y1 y1Var2 = m10Var.f119013o;
                    if (y1Var2 != null && (viewGroup = y1Var2.B) != null) {
                        i17 = viewGroup.getWidth();
                    }
                    int i18 = i17;
                    k91.s2 s2Var = k91.s2.f305761e;
                    android.view.ViewGroup viewGroup2 = m10Var.f118999a;
                    b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, height, s2Var, true, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(i65.a.f(viewGroup2.getContext(), com.tencent.mm.R.dimen.f479672c9), true, true, false, false, 24, null), false, new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(viewGroup2.getContext().getClass().getName(), lVar2.x0() ? s2Var : k91.s2.f305760d), k91.t2.f305768f, false, false, null, k91.y2.f305828e, false, true, null, false, 0, null, 0, height, i18, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -9976800, 2047, null);
                    b1Var.L = new com.tencent.mm.plugin.finder.live.widget.h00(m10Var);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId:");
                    r45.z87 z87Var5 = (r45.z87) fr1Var3.getCustom(11);
                    sb6.append(z87Var5 != null ? z87Var5.getString(0) : null);
                    sb6.append(", path:");
                    r45.z87 z87Var6 = (r45.z87) fr1Var3.getCustom(11);
                    sb6.append(z87Var6 != null ? z87Var6.getString(1) : null);
                    sb6.append(", extraData:");
                    r45.z87 z87Var7 = (r45.z87) fr1Var3.getCustom(11);
                    sb6.append((z87Var7 == null || (byteString = z87Var7.getByteString(3)) == null) ? null : byteString.i());
                    sb6.append(", version:");
                    r45.z87 z87Var8 = (r45.z87) fr1Var3.getCustom(11);
                    sb6.append(z87Var8 != null ? java.lang.Integer.valueOf(z87Var8.getInteger(2)) : null);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    l81.p0 p0Var = b1Var.f317028i;
                    objArr[0] = p0Var != null ? p0Var.toString() : null;
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "open half openHalfScreenMiniProgram nativeExtraData:%s", objArr);
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(viewGroup2.getContext(), b1Var);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "open half openHalfScreenMiniProgram by launchCommon2");
                    m10Var.N = b1Var;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
