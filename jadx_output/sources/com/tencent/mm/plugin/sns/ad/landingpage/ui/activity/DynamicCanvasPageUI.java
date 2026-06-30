package com.tencent.mm.plugin.sns.ad.landingpage.ui.activity;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/ui/activity/DynamicCanvasPageUI;", "Lcom/tencent/liteapp/ui/WxaLiteAppUI;", "Lx54/b;", "Lm54/x;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DynamicCanvasPageUI extends com.tencent.liteapp.ui.WxaLiteAppUI implements x54.b, m54.x {
    public final java.util.Map M1 = new java.util.LinkedHashMap();
    public final m54.l N1 = new m54.l();
    public long O1;
    public long P1;
    public long Q1;
    public com.tencent.mm.ui.tools.f5 R1;
    public android.content.res.Resources S1;
    public boolean T1;

    @Override // x54.b
    public void K3(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        this.M1.remove(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // x54.b
    public void L2(int i17, x54.a observer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.M1.put(java.lang.Integer.valueOf(i17), observer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putActivityResultObserver", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|(16:144|145|(1:147)|148|(1:150)(1:241)|(3:152|153|154)(1:240)|155|(1:157)(1:237)|(1:159)|160|(1:162)(1:236)|(1:164)|165|(1:167)(1:235)|(1:169)|170)|(23:175|(3:177|(1:179)|180)|181|(19:186|(3:188|(1:190)|191)|192|193|194|195|(12:200|(3:202|(1:204)|205)|206|(8:211|(1:213)|215|216|(1:218)(1:227)|(3:220|(1:222)(1:224)|223)|225|226)|228|(0)|215|216|(0)(0)|(0)|225|226)|229|(0)|206|(9:208|211|(0)|215|216|(0)(0)|(0)|225|226)|228|(0)|215|216|(0)(0)|(0)|225|226)|233|(0)|192|193|194|195|(13:197|200|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226)|229|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226)|234|(0)|181|(20:183|186|(0)|192|193|194|195|(0)|229|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226)|233|(0)|192|193|194|195|(0)|229|(0)|206|(0)|228|(0)|215|216|(0)(0)|(0)|225|226) */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0538, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0494 A[Catch: all -> 0x053a, TryCatch #2 {all -> 0x053a, blocks: (B:154:0x0407, B:155:0x0420, B:159:0x042b, B:160:0x0432, B:164:0x043d, B:165:0x0444, B:169:0x0477, B:170:0x047e, B:172:0x0488, B:177:0x0494, B:180:0x04a6, B:181:0x04a9, B:183:0x04b3, B:188:0x04bf, B:191:0x04d1, B:192:0x04d4), top: B:153:0x0407 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04bf A[Catch: all -> 0x053a, TryCatch #2 {all -> 0x053a, blocks: (B:154:0x0407, B:155:0x0420, B:159:0x042b, B:160:0x0432, B:164:0x043d, B:165:0x0444, B:169:0x0477, B:170:0x047e, B:172:0x0488, B:177:0x0494, B:180:0x04a6, B:181:0x04a9, B:183:0x04b3, B:188:0x04bf, B:191:0x04d1, B:192:0x04d4), top: B:153:0x0407 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04fb A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0507 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0524 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0530 A[Catch: all -> 0x0538, TRY_LEAVE, TryCatch #1 {all -> 0x0538, blocks: (B:195:0x04e1, B:197:0x04fb, B:202:0x0507, B:205:0x0517, B:206:0x051a, B:208:0x0524, B:213:0x0530), top: B:194:0x04e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7() {
        /*
            Method dump skipped, instructions count: 1485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI.g7():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResources", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            android.content.res.Resources resources2 = com.tencent.mm.sdk.platformtools.x2.f193075e;
            if (resources2 == null || getAssets() == null) {
                resources = super.getResources();
            } else {
                if (!this.T1 || this.S1 == null) {
                    this.S1 = resources2;
                    if ((resources2 instanceof j65.j) && getBaseContext().getResources() != null) {
                        android.content.res.Resources resources3 = this.S1;
                        kotlin.jvm.internal.o.e(resources3, "null cannot be cast to non-null type com.tencent.mm.resources.MMResources");
                        android.content.res.Configuration b17 = ((j65.j) resources3).f297961e.b(getBaseContext().getResources().getConfiguration());
                        j65.m.c(b17, com.tencent.mm.ui.bk.E(this.S1));
                        android.content.res.Resources resources4 = this.S1;
                        kotlin.jvm.internal.o.e(resources4, "null cannot be cast to non-null type com.tencent.mm.resources.MMResources");
                        ((j65.j) resources4).getConfiguration().updateFrom(b17);
                        this.T1 = true;
                    }
                }
                resources = this.S1;
                if (resources == null) {
                    resources = super.getResources();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResources", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
            return resources;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.DynamicCanvas", "it can't replace resource!!");
            android.content.res.Resources resources5 = super.getResources();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResources", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
            return resources5;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSystemService", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.Object systemService = super.getSystemService(name);
        if (!kotlin.jvm.internal.o.b("layout_inflater", name) || !(systemService instanceof android.view.LayoutInflater)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSystemService", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
            return systemService;
        }
        android.view.LayoutInflater c17 = com.tencent.mm.ui.id.c((android.view.LayoutInflater) systemService);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSystemService", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        return c17;
    }

    public final void h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.X7(u4().l())) {
            java.lang.String o17 = u4().o();
            if (!(o17 == null || o17.length() == 0)) {
                gm0.j1.d().g(new ib4.n(u4().o(), u4().l()));
                gm0.j1.d().a(2883, new y54.x(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean isDarkMode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDarkMode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        boolean C = com.tencent.mm.ui.bk.C();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDarkMode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        return C;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            x54.a aVar = (x54.a) ((java.util.LinkedHashMap) this.M1).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                aVar.onActivityResult(i17, i18, intent);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                super.onActivityResult(i17, i18, intent);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.DynamicCanvas", "the onActivityResult error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doActivityBackgroundTransparentLogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
            if (com.tencent.mm.sdk.platformtools.c2.b(bundleExtra, "sns_landing_page_canvas_transparent", false)) {
                if (bundleExtra != null) {
                    bundleExtra.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
                }
                setTheme(com.tencent.mm.R.style.f494760vi);
                db5.f.c(this, null);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAd.DynamicCanvas", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doActivityBackgroundTransparentLogic", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onCreate(bundle);
        try {
            g7();
            h7();
            m54.j0.f324287a.a(4003001, (int) (this.O1 > 0 ? java.lang.System.currentTimeMillis() - this.O1 : 0L), u4());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("linkToLandingPageProxy", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            try {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
                if (adLandingPagesProxy != null) {
                    if (adLandingPagesProxy.isConnected()) {
                        com.tencent.mars.xlog.Log.i("SnsAd.PageParameter", "it is linking now");
                    } else {
                        com.tencent.mars.xlog.Log.i("SnsAd.PageParameter", "it is going to link");
                        adLandingPagesProxy.connect(m54.d0.f324262d);
                    }
                }
            } catch (java.lang.Throwable th7) {
                ca4.q.c("linkToLandingPageProxy", th7);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("linkToLandingPageProxy", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
            this.R1 = m54.f0.f324266a.a(this);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.DynamicCanvas", "the activity has something error!!!");
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        try {
            long currentTimeMillis = this.O1 > 0 ? java.lang.System.currentTimeMillis() - this.O1 : 0L;
            if (currentTimeMillis > 0) {
                long j17 = this.Q1;
                if (currentTimeMillis - j17 > 0) {
                    currentTimeMillis -= j17;
                }
            }
            m54.j0.f324287a.a(4003056, (int) currentTimeMillis, u4());
            super.onDestroy();
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "the canvas ui is destroyed!!");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.DynamicCanvas", "there is an exception when destroy: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.R1;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onResume();
        com.tencent.mm.ui.tools.f5 f5Var = this.R1;
        if (f5Var != null) {
            f5Var.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onStart();
        if (this.P1 > 0) {
            this.Q1 += java.lang.System.currentTimeMillis() - this.P1;
        }
        this.P1 = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.liteapp.ui.WxaLiteAppBaseUI, com.tencent.mm.ext.ui.SwipeBackActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onStop();
        this.P1 = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppUI, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.ui.tools.f5 f5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        super.onWindowFocusChanged(z17);
        if (z17 && (f5Var = this.R1) != null) {
            f5Var.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
    }

    @Override // m54.x
    public m54.l u4() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI");
        return this.N1;
    }
}
