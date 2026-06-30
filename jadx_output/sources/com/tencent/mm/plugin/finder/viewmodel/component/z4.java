package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class z4 implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f136649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f136650c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.a1 f136651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f136652e;

    public z4(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, so2.u1 u1Var, bb2.a1 a1Var, bb2.w1 w1Var) {
        this.f136648a = s0Var;
        this.f136649b = finderBulletUIC;
        this.f136650c = u1Var;
        this.f136651d = a1Var;
        this.f136652e = w1Var;
    }

    @Override // vp.w
    public void a(boolean z17) {
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d dVar) {
        java.lang.Class cls;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        android.view.View p17;
        bb2.w1 bulletManager;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout X6;
        bb2.w1 bulletManager2;
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        kotlin.jvm.internal.o.g(touchPoint, "touchPoint");
        java.lang.Object obj = danmaku.f448354y;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
        bb2.o oVar = (bb2.o) obj;
        android.content.Context context = this.f136648a.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
        float f17 = touchPoint.f474925d + (danmaku.f448350u / 2.0f);
        float f18 = touchPoint.f474926e + danmaku.f448351v;
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.tencent.mars.xlog.Log.w("FinderBulletUIC", "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
            return;
        }
        bb2.m0 m0Var = bb2.m0.f18918a;
        android.app.Activity context2 = this.f136649b.getContext();
        pf5.u uVar = pf5.u.f353936a;
        r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(this.f136649b.getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        so2.u1 u1Var = this.f136650c;
        jSONObject.put("bs_id", pm0.v.u(oVar.f18926a.getLong(0)));
        jSONObject.put("feedid", pm0.v.u(u1Var.getItemId()));
        m0Var.a(context2, V62, "bullet_screen", true, jSONObject, this.f136649b.a7(), oVar.f18926a.getInteger(6));
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("bs_id", pm0.v.u(oVar.f18926a.getLong(0)));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(this.f136650c.getItemId()));
        java.lang.String string = oVar.f18926a.getString(2);
        if (string == null) {
            string = "";
        }
        lVarArr[2] = new jz5.l("bs_content", string);
        lVarArr[3] = new jz5.l("bs_createtime", java.lang.Long.valueOf(oVar.f18926a.getInteger(4)));
        bb2.a1 a1Var = this.f136649b.f133504q;
        long j17 = 1000;
        lVarArr[4] = new jz5.l("post_play_sec", java.lang.Integer.valueOf((int) (((a1Var == null || (bulletManager2 = a1Var.getBulletManager()) == null) ? 0L : bulletManager2.f19039d) / j17)));
        lVarArr[5] = new jz5.l("screen_type", java.lang.Integer.valueOf(this.f136649b.getContext().getResources().getConfiguration().orientation == 2 ? 1 : 2));
        lVarArr[6] = new jz5.l("bs_type", 1);
        lVarArr[7] = new jz5.l("post_play_times", java.lang.Integer.valueOf(((ey2.v2) uVar.e(c61.l7.class).a(ey2.v2.class)).O6(this.f136650c.getItemId()) + 1));
        java.lang.String a17 = hc2.k.a(kz5.c1.k(lVarArr));
        com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
        android.app.Activity context3 = this.f136649b.getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        if (context3 instanceof com.tencent.mm.ui.MMFragmentActivity) {
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(cls);
        } else {
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
            nyVar = null;
        }
        java.lang.Class cls2 = cls;
        com.tencent.mm.plugin.finder.report.l0.h(l0Var, nyVar != null ? nyVar.V6() : null, this.f136650c.getFeedObject(), 49, hc2.k.a(kz5.c1.k(new jz5.l("feedActionType", 49), new jz5.l("strValue", a17))), 0, null, 48, null);
        bb2.v2 v2Var = danmaku instanceof bb2.v2 ? (bb2.v2) danmaku : null;
        if (v2Var != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f136649b;
            in5.s0 s0Var = this.f136648a;
            bb2.a1 a1Var2 = this.f136651d;
            r45.qt2 qt2Var = V6;
            so2.u1 feed = this.f136650c;
            bb2.w1 w1Var = this.f136652e;
            com.tencent.mars.xlog.Log.i("FinderBulletUIC", "danmakuClick: xOffset=" + f17 + ", yOffset=" + f18 + ", info=" + oVar + ", touchPoint=" + touchPoint + ", feedId=" + pm0.v.u(finderBulletUIC.f133506s));
            yp.o oVar2 = v2Var.H;
            kotlin.jvm.internal.o.e(oVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.BulletViewHolder");
            bb2.b bVar = (bb2.b) oVar2;
            oVar.f18926a.getInteger(6);
            bVar.f18804d.setBackgroundResource(com.tencent.mm.R.drawable.f481564wq);
            danmaku.f448353x = true;
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
            if (finderFullSeekBarLayout == null) {
                com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar finderVideoGreenSeekBar = (com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar) s0Var.p(com.tencent.mm.R.id.frt);
                if (finderVideoGreenSeekBar != null && !finderVideoGreenSeekBar.f130702x1) {
                    cw2.ca.d(finderVideoGreenSeekBar, "bulletClick", false, 2, null);
                }
            } else if (!finderFullSeekBarLayout.isSeekMode) {
                cw2.ca.d(finderFullSeekBarLayout, "bulletClick", false, 2, null);
                finderBulletUIC.Y6(s0Var, true);
            }
            vp.x d17 = a1Var2.getBulletManager().d();
            d17.f(true);
            d17.f438852d.postInvalidate();
            com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) uVar.c(finderBulletUIC.getActivity()).e(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
            boolean Z6 = ptVar != null ? ptVar.Z6() : false;
            if (!Z6) {
                p17 = s0Var.p(com.tencent.mm.R.id.b1y);
            } else if (ptVar == null || (X6 = ptVar.X6()) == null || (p17 = X6.getBulletStubView()) == null) {
                return;
            }
            android.view.View view = p17;
            androidx.appcompat.app.AppCompatActivity activity = finderBulletUIC.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) activity;
            kotlin.jvm.internal.o.d(view);
            r45.oo bulletInfo = oVar.f18926a;
            boolean a76 = finderBulletUIC.a7();
            bb2.a1 a1Var3 = finderBulletUIC.f133504q;
            int i17 = (int) (((a1Var3 == null || (bulletManager = a1Var3.getBulletManager()) == null) ? 0L : bulletManager.f19039d) / j17);
            bb2.a1 a1Var4 = finderBulletUIC.f133504q;
            bb2.w1 bulletManager3 = a1Var4 != null ? a1Var4.getBulletManager() : null;
            com.tencent.mm.plugin.finder.viewmodel.component.x4 x4Var = new com.tencent.mm.plugin.finder.viewmodel.component.x4(bVar, oVar, danmaku, s0Var, finderBulletUIC, w1Var);
            com.tencent.mm.plugin.finder.viewmodel.component.y4 y4Var = new com.tencent.mm.plugin.finder.viewmodel.component.y4(a1Var2, danmaku);
            kotlin.jvm.internal.o.g(feed, "feed");
            kotlin.jvm.internal.o.g(bulletInfo, "bulletInfo");
            bb2.l0.f18910c = false;
            com.tencent.mm.modelbase.i iVar = bb2.l0.f18911d;
            if (iVar != null) {
                iVar.j();
            }
            az2.f fVar = bb2.l0.f18912e;
            if (fVar != null) {
                fVar.b();
            }
            bb2.l0.f18911d = null;
            bb2.l0.f18912e = null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.qt2 V63 = qt2Var == null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMFragmentActivity).a(cls2)).V6() : qt2Var;
            view.getLocationInWindow(new int[2]);
            int i18 = (int) (r4[0] + f17);
            int i19 = (int) (r4[1] + f18);
            bb2.j0 j0Var = new bb2.j0(bulletInfo, mMFragmentActivity, arrayList, feed, V63, bulletManager3, a76, Z6);
            bb2.g0 g0Var = new bb2.g0(bulletInfo, view, mMFragmentActivity, feed, s0Var, V63, a76, bulletManager3, Z6, f17, f18, i17, x4Var, y4Var);
            bb2.k0 k0Var = new bb2.k0(x4Var);
            if (i18 <= 0 || i19 <= 0) {
                return;
            }
            rl5.r rVar = bb2.l0.f18909b;
            if (rVar != null) {
                rVar.a();
            }
            rl5.r rVar2 = new rl5.r(view.getContext());
            rVar2.C = true;
            rVar2.V = true;
            rVar2.L = k0Var;
            rVar2.Y = new bb2.i0(rVar2);
            bb2.l0.f18909b = rVar2;
            rVar2.f(view, j0Var, g0Var, i18, i19);
        }
    }

    @Override // vp.w
    public void c(java.util.List list) {
    }
}
