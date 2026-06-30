package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class z2 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 {
    public boolean A;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f165858u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f165859v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f165860w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f165861x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f165862y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f165863z;

    public z2(android.content.Context context, ab4.u uVar, android.view.ViewGroup viewGroup) {
        super(context, uVar, viewGroup);
        this.f165863z = false;
        this.A = false;
    }

    public void U() {
        int i17;
        long j17;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        ab4.u X = X();
        android.content.Context context = this.f165049d;
        boolean z17 = context instanceof android.app.Activity;
        if (z17) {
            android.app.Activity activity = (android.app.Activity) context;
            long n17 = com.tencent.mm.plugin.sns.storage.w2.n(activity.getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
            int intExtra = activity.getIntent().getIntExtra("sns_landig_pages_from_source", 0);
            activity.getIntent().getIntExtra("sns_landing_pages_adType", 0);
            j17 = n17;
            i17 = intExtra;
        } else {
            i17 = 0;
            j17 = 0;
        }
        int i18 = X.f2826p;
        if (i18 == 4) {
            ab4.h hVar = (ab4.h) X;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_card_id", hVar.f2839z1);
            ab4.n0 u17 = u();
            java.lang.String str3 = hVar.f2839z1;
            u17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            java.lang.String str4 = (java.lang.String) ((java.util.HashMap) u17.f2879v).get(str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                ab4.n0 u18 = u();
                java.lang.String str5 = hVar.f2839z1;
                u18.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                java.lang.String str6 = (java.lang.String) ((java.util.HashMap) u18.f2879v).get(str5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanvasCardExt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                hVar.A1 = str6;
            }
            intent.putExtra("key_card_ext", hVar.A1);
            intent.putExtra("key_from_scene", 21);
            intent.putExtra("key_stastic_scene", 15);
            j45.l.j(context, "card", ".ui.CardDetailUI", intent, null);
            Z();
            this.f165386t.b("cardTpId", hVar.f2839z1);
            this.f165386t.b("cardExt", hVar.A1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 8) {
            if (X() instanceof ab4.o) {
                if (z17 && u().d() == 2) {
                    android.app.Activity activity2 = (android.app.Activity) context;
                    java.lang.String stringExtra = activity2.getIntent().getStringExtra("sns_landing_pages_sessionId");
                    str2 = activity2.getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                    str = stringExtra;
                } else {
                    str = "";
                    str2 = str;
                }
                java.lang.String format = java.lang.String.format("%s:%s:%s:%s:%d:%s:%s:%d", str, str2, ((ab4.o) X()).f2817d, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000), java.lang.Integer.valueOf(u().d()), u().o(), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
                ab4.o oVar = (ab4.o) X();
                java.lang.String d17 = ca4.m0.d(oVar.A1, com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isWeAppAppendClickTime(u().k(), i17));
                oVar.A1 = d17;
                if (oVar.f2898x1) {
                    ca4.z0.p0(this.f165049d, oVar.f2884z1, d17, "", u().c(), u().m(), format, u().o(), 1200);
                } else {
                    ca4.z0.q0(this.f165049d, oVar.f2884z1, d17, "", u().c(), u().m(), format, u().o(), 1084);
                }
                this.f165386t.b("weappUserName", oVar.f2884z1);
                this.f165386t.b("weappPath", oVar.A1);
                if (oVar.f2898x1) {
                    this.f165386t.a("isJumpInHalfScreenStyle", 1L);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 9) {
            ab4.k kVar = (ab4.k) X;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("map_view_type", 1);
            intent2.putExtra("kwebmap_slat", kVar.f2849z1.f2843a);
            ab4.j jVar = kVar.f2849z1;
            intent2.putExtra("kwebmap_lng", jVar.f2844b);
            intent2.putExtra("kwebmap_scale", jVar.f2845c);
            java.lang.String str7 = jVar.f2847e;
            intent2.putExtra("kPoiName", str7);
            intent2.putExtra("Kwebmap_locaion", jVar.f2846d);
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "locatint to slat " + jVar.f2843a + ", slong " + jVar.f2844b + ", " + str7);
            j45.l.n(context, ya.b.LOCATION, ".ui.RedirectUI", intent2, 2002);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 10) {
            com.tencent.mm.pluginsdk.ui.span.q qVar = com.tencent.mm.pluginsdk.ui.span.p.f191273a;
            if (qVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return;
            }
            ab4.n nVar = (ab4.n) X;
            int size = nVar.f2857z1.size();
            java.util.List list = nVar.f2857z1;
            if (size > 1) {
                ((ez.z0) qVar).wi(context, list, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t2(this));
                this.f165386t.b("phonenumber", (java.lang.String) list.get(0));
            } else if (list.size() > 0) {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().confirmDialPhoneNum((android.app.Activity) context, (java.lang.String) list.get(0));
                this.f165386t.b("phonenumber", (java.lang.String) list.get(0));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 == 11) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isProductActionValid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
            if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
                ((com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context).w8(X.X, X.U, X.V, X.W, X.S == 1, X.T == 1, X().R == 1);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (i18 != 12) {
            if (i18 != 16) {
                java.lang.String str8 = X.G;
                this.f165386t.b("btnJumpUrl", str8);
                if (X.f2898x1) {
                    this.f165386t.a("isJumpInHalfScreenStyle", 1L);
                }
                if (X.f2898x1) {
                    a84.a0.c(this.f165049d, str8, u(), i17, j17);
                } else {
                    a84.a0.a(this.f165049d, str8, u(), i17, j17, X().f2817d);
                }
                Z();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return;
            }
            ab4.i0 i0Var = (ab4.i0) X;
            if (i0Var.f2842z1 != null) {
                java.lang.String n18 = u().n();
                if (android.text.TextUtils.isEmpty(n18)) {
                    n18 = u().o();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "jumpScanUI, use old uxInfo=" + n18);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "jumpScanUI, use new uxInfo=" + n18);
                }
                l44.o5.a(context, i0Var.f2842z1, n18, 8);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "scanJumpInfo == null");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        ab4.r rVar = (ab4.r) X;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "openServiceChat:" + rVar);
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "openServiceChat exp:" + e17.toString());
        }
        if (!android.text.TextUtils.isEmpty(rVar.B1)) {
            if (android.text.TextUtils.isEmpty(rVar.f2890z1)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            } else if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.po3();
                lVar.f70665b = new r45.qo3();
                lVar.f70666c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
                lVar.f70667d = 1303;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                r45.po3 po3Var = (r45.po3) a17.f70710a.f70684a;
                po3Var.f383251d = rVar.f2890z1;
                po3Var.f383252e = rVar.B1;
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w2(this, rVar));
            } else {
                db5.t7.makeText(context, com.tencent.mm.R.string.j8c, 0).show();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            }
            this.f165386t.b("weappid", rVar.A1);
            this.f165386t.b("weappUserName", rVar.f2890z1);
            this.f165386t.b("businessId", rVar.B1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        }
        V(rVar, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openServiceChat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        this.f165386t.b("weappid", rVar.A1);
        this.f165386t.b("weappUserName", rVar.f2890z1);
        this.f165386t.b("businessId", rVar.B1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public final void V(ab4.r rVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask adLandingPageChattingTask = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask();
            java.lang.String str2 = rVar.f2890z1;
            if (str2 == null) {
                str2 = "";
            }
            k91.z5 z5Var = new k91.z5();
            z5Var.f305863a = rVar.A1;
            z5Var.f305866d = str2;
            z5Var.f305867e = "";
            z5Var.f305868f = "";
            z5Var.f305870h = 0;
            z5Var.f305869g = 0;
            z5Var.f305871i = "";
            z5Var.f305872j = 14;
            z5Var.f305873k = "";
            z5Var.f305874l = "";
            if (android.text.TextUtils.isEmpty(str)) {
                str = str2;
            }
            adLandingPageChattingTask.f165006g = str;
            adLandingPageChattingTask.f165007h = "";
            adLandingPageChattingTask.f165005f = rVar.C1;
            adLandingPageChattingTask.f165008i = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y2(this, adLandingPageChattingTask, z5Var, rVar);
            adLandingPageChattingTask.d();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "doEnterChatting exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public android.widget.Button W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        android.widget.Button button = this.f165859v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return button;
    }

    public ab4.u X() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        ab4.u uVar = (ab4.u) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return uVar;
    }

    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        try {
            U();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "doBtnClick exp=" + e17.toString());
        }
        P();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public void Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("overridePendingTransition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        boolean z17 = this.f165862y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInFloatJumpComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (z17) {
            android.content.Context context = this.f165049d;
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("overridePendingTransition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public void a0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f165859v == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "refreshBtnDisableUI, btn is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        try {
            g0(X().f2897x0);
            android.graphics.drawable.Drawable background = this.f165859v.getBackground();
            android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            boolean d07 = d0(gradientDrawable, X().f2894l1);
            boolean e07 = e0(gradientDrawable, X().Y);
            boolean c07 = c0(gradientDrawable, X().f2899y0);
            if (d07 || e07 || c07) {
                this.f165859v.setBackgroundDrawable(gradientDrawable);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "refreshBtnDisableUI, exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBtnDisableUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public void b0() {
        boolean z17;
        boolean z18;
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        float f17 = X().f2823m;
        int i19 = this.f165058p;
        if (f17 > 0.0f && X().f2823m <= i19) {
            i19 = ((int) X().f2822i) + ((int) X().f2823m) + ((int) X().f2821h);
        }
        this.f165858u.setBackgroundColor(this.f165051f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(X().P)) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(X().N) || X().K <= 0.0f) {
                z17 = false;
            } else {
                try {
                    i18 = android.graphics.Color.parseColor(X().N);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    i18 = 0;
                }
                gradientDrawable.setStroke((int) X().K, i18);
                if (X().Y > 0.0f) {
                    gradientDrawable.setCornerRadius(X().Y);
                }
                z17 = true;
            }
            z18 = z17;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(X().M)) {
                try {
                    i17 = android.graphics.Color.parseColor(X().M);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "parseColor exp=" + e18.toString());
                    i17 = 0;
                }
                gradientDrawable.setColor(i17);
                z17 = true;
            }
            if (z17) {
                this.f165859v.setBackgroundDrawable(gradientDrawable);
            }
        } else {
            za4.t0.b("adId", X().P, false, 0, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p2(this));
            z18 = false;
        }
        this.f165859v.setText(X().F);
        if (X().L == 1) {
            this.f165859v.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        } else if (X().L == 2) {
            this.f165859v.setTypeface(android.graphics.Typeface.defaultFromStyle(2));
        }
        android.widget.Button button = this.f165859v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        button.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s2(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickAction", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (X().f2893J > 0.0f) {
            this.f165859v.setTextSize(0, X().f2893J);
        }
        if (X().I != null && X().I.length() > 0) {
            try {
                this.f165859v.setTextColor(android.graphics.Color.parseColor(X().I));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "invalid color! %s", X().I);
            }
        }
        try {
            this.f165859v.setTextAlignment(4);
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the device has no method btn.setTextAlignment");
        }
        if (X().f2830t > 0.0f) {
            this.f165859v.setLayoutParams(new android.widget.FrameLayout.LayoutParams((i19 - ((int) X().f2821h)) - ((int) X().f2822i), (int) X().f2830t));
        } else {
            this.f165859v.setLayoutParams(new android.widget.FrameLayout.LayoutParams((i19 - ((int) X().f2821h)) - ((int) X().f2822i), this.f165859v.getLayoutParams().height));
        }
        if (X().Q == 1) {
            this.f165860w.setLayoutParams(new android.widget.FrameLayout.LayoutParams((i19 - ((int) X().f2821h)) - ((int) X().f2822i), this.f165860w.getLayoutParams().height));
            android.view.View view = this.f165860w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f165860w.setOnLongClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q2(this));
            this.f165860w.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r2(this));
        } else {
            android.view.View view2 = this.f165860w;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBtnComponent", "refreshBtnUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z18) {
            this.f165858u.setRadius(X().Y);
            float f18 = X().Y;
            if (f18 > 0.0f && com.tencent.mm.sdk.platformtools.t8.K0(X().P)) {
                android.graphics.drawable.Drawable background = this.f165859v.getBackground();
                android.graphics.drawable.GradientDrawable gradientDrawable2 = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : new android.graphics.drawable.GradientDrawable();
                gradientDrawable2.setShape(0);
                if (e0(gradientDrawable2, f18)) {
                    this.f165859v.setBackgroundDrawable(gradientDrawable2);
                }
            }
        }
        l44.f4.e(this.f165049d, X(), this.f165859v);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    public final boolean c0(android.graphics.drawable.GradientDrawable gradientDrawable, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        int i17 = 0;
        if (gradientDrawable == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBackgroundColor, drawable is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        try {
            i17 = android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBackgroundColor, parseColor exp=" + e17.toString() + " , backgroundColor is " + str);
        }
        gradientDrawable.setColor(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return true;
    }

    public final boolean d0(android.graphics.drawable.GradientDrawable gradientDrawable, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        int i17 = 0;
        if (gradientDrawable == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBorderColor, drawable is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || X().K <= 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return false;
        }
        try {
            i17 = android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnBorderColor, parseColor exp=" + e17.toString() + " , borderColor is " + str);
        }
        gradientDrawable.setStroke((int) X().K, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return true;
    }

    public final boolean e0(android.graphics.drawable.GradientDrawable gradientDrawable, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (f17 > 0.0f) {
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f165858u;
            if (roundedCornerFrameLayout != null) {
                roundedCornerFrameLayout.setRadius(f17);
            }
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(f17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnCornerRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return false;
    }

    public void g0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f165859v == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnFontColor, btn is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                this.f165859v.setTextColor(android.graphics.Color.parseColor(str));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnFontColor, parseColor exp=" + e17.toString() + " , fontColor is " + str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnFontColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        android.view.View view = this.f165056n;
        this.f165858u = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view.findViewById(com.tencent.mm.R.id.n4o);
        this.f165859v = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.n4n);
        this.f165860w = view.findViewById(com.tencent.mm.R.id.n4p);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        S(0);
        b0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (this.f165863z) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            return com.tencent.mm.R.layout.cpd;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        return com.tencent.mm.R.layout.cpc;
    }
}
