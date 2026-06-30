package n44;

/* loaded from: classes8.dex */
public abstract class f1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f334930d;

    /* renamed from: e, reason: collision with root package name */
    public final i64.z f334931e;

    /* renamed from: f, reason: collision with root package name */
    public y54.c f334932f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f334933g = jz5.h.b(new n44.d1(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f334934h = jz5.h.b(new n44.c1(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f334935i = jz5.h.b(new n44.e1(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f334936m = jz5.h.b(new n44.z0(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f334937n = jz5.h.b(new n44.b1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f334938o = jz5.h.b(new n44.y0(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f334939p = jz5.h.b(new n44.a1(this));

    public f1(android.view.View view, i64.z zVar) {
        this.f334930d = view;
        this.f334931e = zVar;
    }

    public void a(y54.b contentSizeAttr, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        kotlin.jvm.internal.o.g(intent, "intent");
        i64.z zVar = this.f334931e;
        if (zVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
            return;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout d17 = d();
        if (d17 != null) {
            d17.setCanScrollToTop(zVar.a());
        }
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout d18 = d();
        if (d18 != null) {
            d18.setSpaceHolderHeight(contentSizeAttr.f());
        }
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout d19 = d();
        android.view.ViewGroup.LayoutParams layoutParams = d19 != null ? d19.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = contentSizeAttr.g() - contentSizeAttr.b();
            marginLayoutParams.height = contentSizeAttr.a(zVar.a());
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout f17 = f();
        android.view.ViewGroup.LayoutParams layoutParams2 = f17 != null ? f17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = contentSizeAttr.a(zVar.a());
        }
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout d27 = d();
        if (d27 != null) {
            d27.setContentViewHeight(contentSizeAttr.c());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("screenWidth is ");
        sb6.append(contentSizeAttr.e());
        sb6.append(", screenHeight is ");
        sb6.append(contentSizeAttr.d());
        sb6.append(", statusBarHeight is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = contentSizeAttr.f459522c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        sb6.append(i17);
        sb6.append(", actionBarHeight is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i18 = contentSizeAttr.f459523d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        sb6.append(i18);
        sb6.append(", statusBarAndActionBarHeight is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i19 = contentSizeAttr.f459524e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        sb6.append(i19);
        sb6.append(", spaceHolderHeight is ");
        sb6.append(contentSizeAttr.f());
        sb6.append(", halfScreenHeaderHeight is ");
        sb6.append(contentSizeAttr.b());
        sb6.append(", topContainerHeight is ");
        sb6.append(contentSizeAttr.g());
        sb6.append(", initVisibleHalfScreenHeight is ");
        sb6.append(contentSizeAttr.c());
        sb6.append(", contentViewHeight is ");
        sb6.append(contentSizeAttr.a(zVar.a()));
        com.tencent.mars.xlog.Log.i("IAdHalfScreenConfigUI", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
    }

    public abstract void b(android.content.Intent intent);

    public final android.widget.FrameLayout c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenBottomContainerContent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f334938o).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenBottomContainerContent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return frameLayout;
    }

    public final com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout = (com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout) ((jz5.n) this.f334936m).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return halfScreenScrollableFrameLayout;
    }

    public final android.widget.FrameLayout e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenContentContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f334939p).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenContentContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return frameLayout;
    }

    public final com.tencent.mm.ui.widget.RoundedCornerFrameLayout f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) ((jz5.n) this.f334937n).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return roundedCornerFrameLayout;
    }

    public final i64.z g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return this.f334931e;
    }

    public final android.view.View h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return this.f334930d;
    }

    public abstract int i(y54.b bVar);
}
