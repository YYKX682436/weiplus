package n54;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a */
    public final com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f335128a;

    /* renamed from: b */
    public final com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer f335129b;

    /* renamed from: c */
    public final android.view.View f335130c;

    /* renamed from: d */
    public final android.view.View f335131d;

    /* renamed from: e */
    public final int f335132e;

    /* renamed from: f */
    public final boolean f335133f;

    /* renamed from: g */
    public n54.e f335134g;

    public f(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f335133f = false;
        n54.b bVar = new n54.b(this);
        this.f335128a = snsAdNativeLandingPagesUI;
        this.f335133f = snsAdNativeLandingPagesUI.A7().u();
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = (com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer) snsAdNativeLandingPagesUI.findViewById(com.tencent.mm.R.id.gw6);
        this.f335129b = adLandingPageHalfScreenContainer;
        adLandingPageHalfScreenContainer.setBackgroundColor(-16777216);
        boolean z17 = true;
        adLandingPageHalfScreenContainer.setHalfScreenModeEnable(true);
        float b17 = i65.a.b(snsAdNativeLandingPagesUI.getApplicationContext(), 12);
        adLandingPageHalfScreenContainer.b(b17, b17, 0.0f, 0.0f);
        adLandingPageHalfScreenContainer.setHalfScreenListener(bVar);
        android.graphics.Point b18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b18.x;
        int i18 = b18.y;
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            i18 = i18 >= i17 ? i18 : i17;
        }
        int c17 = com.tencent.mm.ui.bl.c(snsAdNativeLandingPagesUI);
        boolean u17 = com.tencent.mm.ui.bk.u(snsAdNativeLandingPagesUI, false);
        int p17 = u17 ? com.tencent.mm.ui.bk.p(snsAdNativeLandingPagesUI) : 0;
        int ceil = ((int) java.lang.Math.ceil(i18 * 0.75f)) + c17;
        ab4.n0 A7 = snsAdNativeLandingPagesUI.A7();
        A7.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        int i19 = A7.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        ceil = i19 > 0 ? i19 : ceil;
        boolean r17 = snsAdNativeLandingPagesUI.A7().r();
        c(!r17);
        int i27 = (i18 - ceil) - p17;
        this.f335132e = i27;
        if (r17) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) adLandingPageHalfScreenContainer.getLayoutParams();
            marginLayoutParams.topMargin += i27;
            adLandingPageHalfScreenContainer.setLayoutParams(marginLayoutParams);
            this.f335132e = 0;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 10);
        }
        com.tencent.mars.xlog.Log.i("AdHalfScreenLandingPageHelper", "screenH=" + i18 + ", navH=" + c17 + ", hasCutOut=" + u17 + ", cutOutH=" + p17 + ", contentH=" + ceil);
        com.tencent.mm.ui.bk.u(snsAdNativeLandingPagesUI, false);
        int i28 = this.f335132e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStayPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        adLandingPageHalfScreenContainer.f163046g = i28;
        adLandingPageHalfScreenContainer.f163047h = 0;
        adLandingPageHalfScreenContainer.j(i28);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStayPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        android.view.View findViewById = snsAdNativeLandingPagesUI.findViewById(com.tencent.mm.R.id.ght);
        this.f335130c = findViewById;
        findViewById.setOnClickListener(new n54.a(this));
        this.f335131d = snsAdNativeLandingPagesUI.findViewById(com.tencent.mm.R.id.gwf);
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a(n54.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = fVar.f335128a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        return snsAdNativeLandingPagesUI;
    }

    public static void d(com.tencent.mm.ui.MMActivity mMActivity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreenForHalfMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        mMActivity.getWindow().getDecorView().setSystemUiVisibility(1280);
        mMActivity.getWindow().setStatusBarColor(0);
        mMActivity.getController().W0(mMActivity, 0);
        mMActivity.getController().O0(true);
        mMActivity.getController().E0(-16777216);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreenForHalfMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
    }

    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer adLandingPageHalfScreenContainer = this.f335129b;
        if (adLandingPageHalfScreenContainer == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            return false;
        }
        adLandingPageHalfScreenContainer.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        boolean z17 = adLandingPageHalfScreenContainer.f163052p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        return z17;
    }

    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        com.tencent.mars.xlog.Log.i("AdHalfScreenLandingPageHelper", "setEnableSlideToTop, enable=" + z17);
        this.f335129b.setEnableSlideToTop(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
    }
}
