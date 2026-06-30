package n91;

/* loaded from: classes7.dex */
public class n extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.ui.vc {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f335890e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f335891d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.content.Context r19, final com.tencent.mm.plugin.appbrand.o6 r20) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n91.n.<init>(android.content.Context, com.tencent.mm.plugin.appbrand.o6):void");
    }

    public void b() {
        android.view.View rootView;
        com.tencent.mm.plugin.appbrand.o6 runtime = this.f335891d;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.page.d5 x07 = runtime.x0();
        android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.tencent.mm.R.id.w_);
        hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
        android.app.Activity r07 = runtime.r0();
        if (r07 == null) {
            return;
        }
        mi1.h hVar = (mi1.h) runtime.s0().a(r07, mi1.h.class);
        if (eVar == null || hVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar appBrandeEmbedSingleCloseCapsuleBar = new com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar((android.content.Context) r07, false);
        android.view.View findViewById2 = appBrandeEmbedSingleCloseCapsuleBar.findViewById(com.tencent.mm.R.id.f486857mn5);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/custom_loading/CustomLoadingSplashView", "attachHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/appbrand/custom_loading/CustomLoadingSplashView", "attachHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        appBrandeEmbedSingleCloseCapsuleBar.setTitle(runtime.u0().f77279e);
        appBrandeEmbedSingleCloseCapsuleBar.setWxaIconUrl(runtime.u0().f77280f);
        appBrandeEmbedSingleCloseCapsuleBar.setTitleClickListener(new n91.r(runtime));
        eVar.b(hVar, null);
        eVar.a(appBrandeEmbedSingleCloseCapsuleBar.getView(), null);
        eVar.setExternalHeaderAnchor(runtime.f74810s);
        eVar.setExternalHeaderVisibility(0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void k(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setAppServiceType(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setCanShowHideAnimation(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void setProgress(int i17) {
    }
}
