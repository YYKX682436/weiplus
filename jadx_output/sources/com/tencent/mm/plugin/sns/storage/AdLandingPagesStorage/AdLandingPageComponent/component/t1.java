package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class t1 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public static com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r1 N;
    public static final java.lang.Runnable P = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q1();
    public final ab4.c B;
    public final java.lang.String C;
    public boolean D;
    public final java.lang.String E;
    public final java.lang.String F;
    public final java.lang.String G;
    public final java.lang.String H;
    public final java.lang.String I;

    /* renamed from: J */
    public final java.lang.String f165506J;
    public final int K;
    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s1 L;
    public final boolean M;

    public t1(android.content.Context context, ab4.c cVar, android.view.ViewGroup viewGroup) {
        super(context, cVar, viewGroup);
        java.lang.String str;
        int i17;
        this.M = false;
        this.B = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("obtainTargetApkPkg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        java.lang.String str2 = "";
        if (cVar != null) {
            android.content.Intent intent = cVar.Z1;
            str = intent != null ? intent.getStringExtra("target_app_id") : "";
            if (android.text.TextUtils.isEmpty(str)) {
                str = cVar.H1;
            }
        } else {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainTargetApkPkg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        this.C = str;
        this.D = l0(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMarketPriority", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            i17 = com.tencent.mm.sdk.platformtools.c2.g(cVar.Z1, "market_priority", 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMarketPriority", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "getMarketPriority has something wrong");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMarketPriority", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "init, pkg=" + this.C + ", priority=" + i17 + ", IsInstalled=" + this.D);
        if (i17 == 3) {
            n0(4, 1, "");
        } else {
            n0(4, 0, "");
        }
        n0(1, 0, "");
        try {
            java.lang.String o17 = u().o();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.E = o17 == null ? "" : o17;
            java.lang.String a17 = u().a();
            this.F = a17 == null ? "" : a17;
            java.lang.String c17 = u().c();
            this.G = c17 == null ? "" : c17;
            java.lang.String q17 = u().q();
            this.H = q17 == null ? "" : q17;
            this.K = u().l();
            java.lang.String m17 = u().m();
            this.I = m17 == null ? "" : m17;
            java.lang.String e17 = u().e();
            if (e17 != null) {
                str2 = e17;
            }
            this.f165506J = str2;
            this.L = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s1();
            this.M = za4.k.l();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", th6.toString());
        }
    }

    public static /* synthetic */ java.lang.String h0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1 t1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        java.lang.String str = t1Var.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        return str;
    }

    public static /* synthetic */ ab4.c i0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1 t1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        ab4.c cVar = t1Var.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        return cVar;
    }

    public static synchronized void m0() {
        synchronized (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.t1.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerPkgReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            try {
                if (N == null) {
                    N = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r1(null);
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addDataScheme("package");
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(N, intentFilter);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "the broadcast receiver register");
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "register broadcast receiver failed");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerPkgReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        }
    }

    public static void o0(ab4.n0 n0Var, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            java.lang.String k17 = n0Var.k();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = "";
            if (k17 == null) {
                k17 = "";
            }
            java.lang.String a17 = ca4.c0.a(n0Var.o());
            java.lang.String a18 = n0Var.a();
            if (a18 != null) {
                str3 = a18;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19790, k17, a17, str3, java.lang.Integer.valueOf(i17), str, str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "report19790 snsId=" + k17 + ", uxInfo=" + a17 + ", adExtInfo =" + str3 + ", actType =" + i17 + ", actValue = " + str + ", extInfo = " + str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "report19790 exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        super.K();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "viewWillAppear is called");
            if (this.M) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "viewWillAppear, but disable register installReceiver");
            } else {
                com.tencent.mm.sdk.platformtools.u3.l(P);
                m0();
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r1 r1Var = N;
                if (r1Var != null) {
                    r1Var.b(this);
                }
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "processor registerPkgReceiver error");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        super.L();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "viewWillDestroy is called");
            java.lang.Runnable runnable = P;
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 300000L);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1958L, 5L, r());
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "remove mProcessorForUnregisterPkgReceiver error");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        java.lang.String str6 = this.C;
        boolean l07 = l0(str6);
        this.D = l07;
        ab4.c cVar = this.B;
        if (l07) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTargetAppActivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            android.content.Context context = this.f165049d;
            try {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str7 = str6 == null ? "" : str6;
                java.lang.String str8 = cVar.U1;
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.String str10 = cVar.G1;
                java.lang.String str11 = str10 == null ? "" : str10;
                java.lang.String str12 = cVar.B1;
                java.lang.String str13 = str12 == null ? "" : str12;
                str = "doBtnClick";
                try {
                    str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp";
                    try {
                        str5 = "startTargetAppActivity";
                        try {
                            i64.p0 p0Var = new i64.p0(u().k(), this.E, this.F, 1, this.f165506J, this.K, this.G, this.I, this.H);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "startTargetAppActivity, pkg=" + str7 + ", appId=" + str13 + ", appName=" + str11 + ", pageUrl=" + str9);
                            ca4.m0.o0(context, str13, str7, str11, str9, 2, p0Var);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "startTargetAppActivity, exp=" + th.toString());
                            java.lang.String str14 = str4;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str14);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 4);
                            str3 = str14;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str3);
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        str5 = "startTargetAppActivity";
                        com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "startTargetAppActivity, exp=" + th.toString());
                        java.lang.String str142 = str4;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str142);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 4);
                        str3 = str142;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str3);
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp";
                    str5 = "startTargetAppActivity";
                    com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "startTargetAppActivity, exp=" + th.toString());
                    java.lang.String str1422 = str4;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str1422);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 4);
                    str3 = str1422;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str3);
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                str = "doBtnClick";
            }
            java.lang.String str14222 = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str14222);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 4);
            str3 = str14222;
        } else {
            str = "doBtnClick";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startMarketActivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            android.content.Intent intent = cVar.Z1;
            android.content.Context context2 = this.f165049d;
            try {
                if (!(context2 instanceof android.app.Activity)) {
                    intent.addFlags(268435456);
                }
                java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "market_app_name");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str15 = l17 == null ? "" : l17;
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp";
                try {
                    ca4.d dVar = new ca4.d(this.E, this.f165506J, this.K, this.F, this.G, this.I, this.H);
                    l44.z.g(dVar, 3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "startMarketActivity, appName=" + str15 + ", marketIntent=" + intent);
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.d(context2, intent.getPackage(), "", intent, str15, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p1(this, dVar), 2);
                    str3 = str2;
                    i17 = 1;
                } catch (java.lang.Throwable th10) {
                    th = th10;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "onLaunchApp, exp=" + th.toString());
                    i17 = 1;
                    n0(2, 1, "");
                    str3 = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startMarketActivity", str3);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str3);
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
                str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startMarketActivity", str3);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str3);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        super.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    public final void j0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        java.util.HashMap hashMap = new java.util.HashMap();
        ab4.c cVar = this.B;
        hashMap.put("fontNormalColor", q0(cVar.R1, "#FFFFFF"));
        hashMap.put("fontDisableColor", q0(cVar.S1, "#4CFFFFFF"));
        hashMap.put("fontPressedColor", q0(cVar.T1, "#99FFFFFF"));
        hashMap.put("NormalColor", q0(cVar.L1, "#1AAD19"));
        hashMap.put("PressedColor", q0(cVar.N1, "#179B16"));
        hashMap.put("DisableColor", q0(cVar.M1, "#661AAD19"));
        hashMap.put("borderNormalColor", q0(cVar.O1, "#179E16"));
        hashMap.put("borderPressedColor", q0(cVar.Q1, "#158E14"));
        hashMap.put("borderDisableColor", q0(cVar.P1, "#00179E16"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        int parseColor = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontNormalColor"));
        int parseColor2 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontDisableColor"));
        int parseColor3 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("fontPressedColor"));
        int parseColor4 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("NormalColor"));
        int parseColor5 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("PressedColor"));
        int parseColor6 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("DisableColor"));
        int i17 = (int) X().K;
        int parseColor7 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderNormalColor"));
        int parseColor8 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderPressedColor"));
        int parseColor9 = android.graphics.Color.parseColor((java.lang.String) hashMap.get("borderDisableColor"));
        int dimensionPixelSize = this.f165049d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479582y);
        if (X().Y > 0.0f) {
            dimensionPixelSize = (int) X().Y;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        float f17 = dimensionPixelSize;
        gradientDrawable.setCornerRadius(f17);
        gradientDrawable.setColor(parseColor6);
        gradientDrawable.setStroke(i17, parseColor9);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f17);
        gradientDrawable2.setColor(parseColor5);
        gradientDrawable2.setStroke(i17, parseColor8);
        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f17);
        gradientDrawable3.setColor(parseColor4);
        gradientDrawable3.setStroke(i17, parseColor7);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, gradientDrawable3);
        this.f165859v.setBackground(stateListDrawable);
        this.f165859v.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_enabled}}, new int[]{parseColor2, parseColor3, parseColor}));
        float f18 = cVar.f2893J;
        if (f18 > 0.0f) {
            this.f165859v.setTextSize(0, f18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        ab4.c cVar = this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            super.k();
            j0();
            if (this.D) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f2815a2)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    android.widget.Button button = this.f165859v;
                    if (button != null) {
                        button.setText(com.tencent.mm.R.string.f493174j72);
                        l44.f4.e(this.f165049d, X(), this.f165859v);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                } else {
                    p0(cVar.f2815a2);
                }
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "fill item data occur something wrong!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    public final boolean l0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isApkInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            boolean isPkgInstalled = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isPkgInstalled(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isApkInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            return isPkgInstalled;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "isApkInstalled occur something wrong!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isApkInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            return false;
        }
    }

    public final void n0(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        try {
            o0(u(), i17, java.lang.String.valueOf(i18), str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "report19790 exp:" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    public final void p0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        android.widget.Button button = this.f165859v;
        if (button != null) {
            button.setText(str);
            l44.f4.e(this.f165049d, X(), this.f165859v);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
    }

    public final java.lang.String q0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
            return str2;
        }
        if (!str.matches("#[0-9A-Fa-f]{6}([0-9A-Fa-f]{2})?")) {
            str = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
        return str;
    }
}
