package dc4;

/* loaded from: classes4.dex */
public class l0 extends dc4.v implements i64.k0 {
    public k84.d4 A;
    public int B;

    /* renamed from: p, reason: collision with root package name */
    public final android.app.Activity f228769p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.n f228770q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f228771r;

    /* renamed from: t, reason: collision with root package name */
    public u74.d f228773t;

    /* renamed from: v, reason: collision with root package name */
    public final fd4.l f228775v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.l f228776w;

    /* renamed from: x, reason: collision with root package name */
    public p44.z f228777x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.RelativeLayout f228778y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.FrameLayout f228779z;

    /* renamed from: s, reason: collision with root package name */
    public boolean f228772s = false;

    /* renamed from: u, reason: collision with root package name */
    public final u74.f f228774u = new u74.f();
    public final android.view.View.OnClickListener C = new dc4.i0(this);
    public boolean D = false;
    public boolean E = false;
    public final u74.e F = new dc4.k0(this);

    public l0(android.app.Activity activity, int i17, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var, android.widget.RelativeLayout relativeLayout, android.widget.FrameLayout frameLayout) {
        fd4.l fVar;
        this.f228769p = activity;
        this.f228831d = timeLineObject;
        this.f228832e = snsInfo;
        this.f228838n = iVar;
        this.f228771r = b1Var;
        this.f228778y = relativeLayout;
        this.f228779z = frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newFullCardBusinessByType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        if (i17 == 35) {
            fVar = new fd4.f();
        } else if (i17 == 39) {
            fVar = new gd4.y(1);
        } else if (i17 == 41) {
            fVar = new fd4.m();
        } else if (i17 != 47) {
            switch (i17) {
                case 28:
                    fVar = new fd4.t();
                    break;
                case 29:
                    fVar = new fd4.k();
                    break;
                case 30:
                    fVar = new fd4.o();
                    break;
                case 31:
                    fVar = new fd4.r();
                    break;
                case 32:
                    fVar = new gd4.y(0);
                    break;
                default:
                    fVar = null;
                    break;
            }
        } else {
            fVar = new gd4.y(2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newFullCardBusinessByType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        this.f228775v = fVar;
    }

    public static /* synthetic */ u74.d l(dc4.l0 l0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.d dVar = l0Var.f228773t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        return dVar;
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdDetailItemNew", "initView");
        this.f228833f = view;
        this.f228834g = view2;
        u74.d g17 = u74.f.g(view);
        this.f228773t = g17;
        boolean z17 = this.f228839o;
        u74.c cVar = g17.T;
        cVar.f425137g = z17;
        cVar.f425131a = ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) this.f228769p).G7();
        u74.d dVar = this.f228773t;
        u74.c cVar2 = dVar.T;
        fd4.l lVar = this.f228775v;
        cVar2.f425135e = lVar;
        cVar2.f425136f = new dc4.e0(this);
        dVar.f425165z = view.findViewById(com.tencent.mm.R.id.ggo);
        u74.d dVar2 = this.f228773t;
        dVar2.f425163x = this.f228836i;
        dVar2.f425164y = this.f228837m;
        this.f228835h = dVar2.f425154o;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228832e;
        if (snsInfo != null) {
            dVar2.T.f425138h = snsInfo.isSolidBreakFrameAd();
        }
        if (lVar != null) {
            lVar.i(this.f228769p, this.f228771r, this.f228838n, this.f228773t, this.f228774u);
        }
        u74.e eVar = this.F;
        u74.f fVar = this.f228774u;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar.f425175j = eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar.f(this.f228773t);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        fd4.l lVar = this.f228775v;
        if (lVar != null) {
            lVar.j();
        }
        p84.e eVar = this.f228774u.f425173h;
        if (eVar != null) {
            eVar.a();
        }
        p44.z zVar = this.f228777x;
        if (zVar != null) {
            zVar.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    @Override // dc4.v
    public void g() {
        u74.d dVar;
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdDetailItemNew", "onPause, hasPlayedVideo=" + this.D);
        this.E = true;
        try {
            if (this.D && (g9Var = (dVar = this.f228773t).f425154o) != null && g9Var.f168417g != null) {
                u74.f fVar = this.f228774u;
                boolean z17 = dVar.T.f425133c;
                fVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                fVar.h(z17, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                k84.d4 d4Var = this.A;
                if (d4Var != null && d4Var.n(this.f228832e)) {
                    k84.d4 d4Var2 = this.A;
                    d4Var2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                    com.tencent.mars.xlog.Log.i(d4Var2.j(), "onPause");
                    ((kotlinx.coroutines.flow.h3) d4Var2.O).k(java.lang.Boolean.FALSE);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                fd4.l lVar = this.f228775v;
                if (lVar != null) {
                    lVar.onVideoPause();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                i64.b1 b1Var = this.f228771r;
                if (b1Var != null && (snsInfo = this.f228832e) != null) {
                    b1Var.q(snsInfo.field_snsId);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdDetailItemNew", "onPause, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    @Override // dc4.v
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        super.i();
        fd4.l lVar = this.f228775v;
        if (lVar != null) {
            lVar.d();
        }
        p84.e eVar = this.f228774u.f425173h;
        if (eVar != null) {
            eVar.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.tencent.mm.plugin.sns.ui.g9] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context, android.app.Activity] */
    @Override // dc4.v
    public void j() {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        int i17;
        java.lang.String str;
        u74.f fVar;
        android.content.Context context;
        i64.b1 b1Var;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.content.Context context2;
        java.lang.String str5;
        java.lang.String str6;
        dc4.l0 l0Var;
        i64.b1 b1Var2;
        u74.f fVar2;
        java.lang.String str7;
        java.lang.String str8;
        boolean z17;
        ?? r37;
        u74.f fVar3;
        java.lang.String str9;
        java.lang.String str10;
        ?? r102;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        android.view.View view;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdDetailItemNew", "refreshView");
        com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.storage.l1.a(this.f228832e.getSnsId());
        this.f228832e = a17;
        this.f228770q = null;
        if (a17 == null || a17.getAdXml() == null) {
            aDXml = null;
        } else {
            aDXml = this.f228832e.getAdXml();
            this.f228770q = aDXml.adFullCardInfo;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        i64.b1 b1Var3 = this.f228771r;
        if (b1Var3 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            i17 = b1Var3.f289095j;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            i17 = 1;
        }
        boolean z18 = this.f228839o;
        ?? r86 = this.f228769p;
        this.B = ca4.m0.y("MicroMsg.FullCardAdDetailItemNew", r86, i17, z18);
        this.f228773t.T.f425133c = u74.f.m(aDXml);
        u74.d dVar = this.f228773t;
        com.tencent.mm.plugin.sns.storage.n nVar = this.f228770q;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f228832e;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228831d;
        u74.f fVar4 = this.f228774u;
        fVar4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        fVar4.f425166a = dVar;
        fVar4.f425167b = nVar;
        fVar4.f425168c = snsInfo2;
        fVar4.f425169d = r86;
        fVar4.f425170e = b1Var3;
        fVar4.f425171f = timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        k84.f4.b(this.f228773t, this.f228832e, this.f228838n, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindAdContinuousLikeComponent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        if (this.f228776w == null) {
            androidx.lifecycle.y yVar = r86 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) r86 : null;
            android.view.View view3 = this.f228836i;
            u74.d dVar2 = this.f228773t;
            b1Var = b1Var3;
            str2 = "MicroMsg.FullCardAdDetailItemNew";
            str3 = "refreshView";
            str4 = "bindAdContinuousLikeComponent";
            fVar = fVar4;
            context = r86;
            str = "initData";
            this.f228776w = new dc4.g0(this, "AdContinuousLikeComponentDetail", yVar, view3, dVar2.H, dVar2.O, dVar2.T.f425131a, this.f228771r, this.f228838n);
        } else {
            str = "initData";
            fVar = fVar4;
            context = r86;
            b1Var = b1Var3;
            str2 = "MicroMsg.FullCardAdDetailItemNew";
            str3 = "refreshView";
            str4 = "bindAdContinuousLikeComponent";
        }
        this.f228776w.f(this.f228832e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindAdFireworkCheerComponent", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        if (this.A == null) {
            androidx.lifecycle.y yVar2 = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
            android.view.View view4 = this.f228836i;
            android.widget.RelativeLayout relativeLayout = this.f228778y;
            android.widget.FrameLayout frameLayout = this.f228779z;
            u74.d dVar3 = this.f228773t;
            b1Var2 = b1Var;
            context2 = context;
            fVar2 = fVar;
            str8 = str2;
            str5 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew";
            str6 = "bindAdFireworkCheerComponent";
            str7 = str3;
            dc4.f0 f0Var = new dc4.f0(this, "AdFireworkCheerComponent", yVar2, view4, relativeLayout, frameLayout, dVar3.H, dVar3.O, dVar3.M, this.B, dVar3.T.f425131a, this.f228771r, this.f228838n, null, null);
            l0Var = this;
            l0Var.A = f0Var;
        } else {
            context2 = context;
            str5 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew";
            str6 = "bindAdFireworkCheerComponent";
            l0Var = this;
            b1Var2 = b1Var;
            fVar2 = fVar;
            str7 = str3;
            str8 = str2;
        }
        k84.d4 d4Var = l0Var.A;
        u74.d dVar4 = l0Var.f228773t;
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = dVar4.H;
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView = dVar4.M;
        d4Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (adSocialAttitudeView != null) {
            d4Var.f305000q = adSocialAttitudeView;
        }
        if (adAttitudeAttractView != null) {
            d4Var.f305001r = adAttitudeAttractView;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        l0Var.A.f(l0Var.f228832e);
        java.lang.String str11 = str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str11);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = l0Var.f228832e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
        if (snsInfo3 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
            z17 = false;
        } else {
            com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo3.getAdXml();
            z17 = (adXml != null ? adXml.randomPickCardAdInfo : null) != null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
        if (z17 && l0Var.f228777x == null && context2 != null && (view = l0Var.f228773t.f425165z) != null && (view2 = l0Var.f228836i) != null) {
            l0Var.f228777x = new p44.z(context2, 1, l0Var.B, view, view2, l0Var.f228771r);
        }
        p44.z zVar = l0Var.f228777x;
        if (zVar != null) {
            zVar.e(l0Var.f228832e);
            p44.z zVar2 = l0Var.f228777x;
            zVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "onScrollIdle");
            zVar2.f351873l.m();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic");
            l0Var.f228777x.g();
        }
        android.view.View view5 = l0Var.f228773t.f425165z;
        if (view5 instanceof com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout) {
            com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout adRoundedCornerFrameLayout = (com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout) view5;
            r37 = 1;
            adRoundedCornerFrameLayout.setIsReportTouchDownPositon(true);
            adRoundedCornerFrameLayout.c(l0Var.f228832e, 2);
        } else {
            r37 = 1;
        }
        l0Var.D = false;
        l0Var.E = false;
        if (l0Var.f228770q != null) {
            fVar3 = fVar2;
            layoutParams = fVar3.c(l0Var.B);
            str9 = str8;
        } else {
            fVar3 = fVar2;
            str9 = str8;
            com.tencent.mars.xlog.Log.e(str9, "invalid full card");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = l0Var.f228832e;
            java.lang.String t07 = snsInfo4 == null ? "" : ca4.z0.t0(snsInfo4.field_snsId);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = l0Var.f228832e;
            if (snsInfo5 != null) {
                boolean isFullCardAd = snsInfo5.isFullCardAd();
                str10 = l0Var.f228832e.getUxinfo();
                r102 = isFullCardAd;
            } else {
                str10 = "";
                r102 = 0;
            }
            ca4.e0.a("fullcard_info_null", t07, 0, r102, str10);
            layoutParams = null;
        }
        l0Var.f228773t.f425154o.a(l0Var.f228831d, 0, l0Var.f228832e.getLocalid(), r37);
        l0Var.f228773t.f425154o.f168421k.setVisibility(8);
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        r45.a90 a90Var = l0Var.f228831d.ContentObj;
        r45.jj4 jj4Var = (a90Var == null || a90Var.f369840h.size() < r37) ? null : (r45.jj4) l0Var.f228831d.ContentObj.f369840h.get(0);
        if (jj4Var != null) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView snsAdCardVideoEndView = l0Var.f228773t.f425155p;
            if (snsAdCardVideoEndView != null) {
                com.tencent.mm.plugin.sns.ui.qa qaVar = l0Var.f228770q.endCoverViewInfo;
                java.lang.String str12 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str12, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
                if (qaVar == null) {
                    snsAdCardVideoEndView.c(false);
                }
                snsAdCardVideoEndView.f170784d = qaVar;
                snsAdCardVideoEndView.f170795r = 2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str12, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
                if (l0Var.f228773t.f425155p.a(l0Var.f228832e)) {
                    l0Var.f228772s = false;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", str11);
            fd4.l lVar = l0Var.f228775v;
            if (lVar != null) {
                i64.b1 b1Var4 = b1Var2;
                if (b1Var4 != null && (snsInfo = l0Var.f228832e) != null) {
                    java.lang.String t08 = ca4.z0.t0(snsInfo.field_snsId);
                    if (!android.text.TextUtils.isEmpty(t08)) {
                        b1Var4.a(t08, l0Var);
                    }
                }
                lVar.a(0, l0Var.f228832e, l0Var.f228770q, layoutParams);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", str11);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshView, hash=");
            sb6.append(hashCode());
            sb6.append(", snsId=");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo6 = l0Var.f228832e;
            sb6.append(snsInfo6 != null ? java.lang.Long.valueOf(snsInfo6.field_snsId) : "");
            sb6.append(", useOnlineVideo=");
            sb6.append(l0Var.f228773t.T.f425133c);
            com.tencent.mars.xlog.Log.i(str9, sb6.toString());
            fVar3.e(jj4Var, hj6, 0, l0Var.f228773t.T.f425133c);
            int i18 = l0Var.f228831d.ContentObj.f369837e;
            android.view.View.OnClickListener onClickListener = l0Var.C;
            if (i18 == r37) {
                l0Var.f228773t.f425151l.setTag(l0Var);
                l0Var.f228773t.f425151l.setOnClickListener(onClickListener);
            } else if (i18 == 15 || i18 == 5) {
                l0Var.f228773t.f425154o.f168414d.setTag(l0Var);
                l0Var.f228773t.f425161v.setTag(l0Var);
                l0Var.f228773t.f425154o.f168414d.setOnClickListener(onClickListener);
                l0Var.f228773t.f425161v.setOnClickListener(onClickListener);
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo7 = l0Var.f228832e;
                if (snsInfo7 == null || !snsInfo7.isAdForbidAutoPlay()) {
                    fVar3.l(l0Var.f228773t.T.f425133c);
                } else {
                    n();
                }
                if (lVar != null) {
                    lVar.c();
                }
                k84.d4 d4Var2 = l0Var.A;
                if (d4Var2 != null && d4Var2.n(l0Var.f228832e)) {
                    k84.d4 d4Var3 = l0Var.A;
                    d4Var3.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                    com.tencent.mars.xlog.Log.i(d4Var3.j(), "onPlay");
                    ((kotlinx.coroutines.flow.h3) d4Var3.O).k(java.lang.Boolean.TRUE);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
                }
                l0Var.D = r37;
            }
        } else {
            hj6.h(l0Var.f228773t.f425154o.f168417g, -1, context2.hashCode(), 0);
            l0Var.f228773t.f425154o.f168422l.setVisibility(8);
            l0Var.f228773t.f425154o.f168417g.setVideoCallback(null);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = l0Var.f228773t.f425162w;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.setVideoCallback(null);
            }
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo8 = l0Var.f228832e;
        if (snsInfo8 != null && snsInfo8.isAdForbidAutoPlay()) {
            n();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str11);
    }

    @Override // dc4.v
    public com.tencent.mm.plugin.sns.storage.SnsInfo k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.d dVar = this.f228773t;
        if (dVar == null || (adSocialAttitudeView = dVar.H) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            return snsInfo;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (snsInfo != null && (snsInfo2 = adSocialAttitudeView.f163457u) != null) {
            snsInfo.setLikeFlag(snsInfo2.getLikeFlag());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        return snsInfo;
    }

    public u74.d m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWrapViewHolder", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.d dVar = this.f228773t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWrapViewHolder", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        return dVar;
    }

    public final void n() {
        android.app.Activity activity = this.f228769p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdDetailItemNew", "showPlayBtn");
        try {
            this.f228773t.f425154o.f168419i.setVisibility(0);
            this.f228773t.f425154o.f168420j.setVisibility(8);
            this.f228773t.f425154o.f168419i.setImageDrawable(i65.a.i(activity, com.tencent.mm.R.raw.shortvideo_play_btn));
            this.f228773t.f425154o.f168419i.setContentDescription(activity.getString(com.tencent.mm.R.string.hjf));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdDetailItemNew", "showPlayBtn, exp=" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }
}
