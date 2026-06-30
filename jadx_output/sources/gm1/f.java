package gm1;

/* loaded from: classes7.dex */
public final class f extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.wxassistant.v f273310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantHeadlessUIC", "onDestroy");
        com.tencent.mm.plugin.appbrand.wxassistant.v vVar = this.f273310d;
        if (vVar != null) {
            vVar.E();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantHeadlessUIC", "onPause");
        com.tencent.mm.plugin.appbrand.wxassistant.v vVar = this.f273310d;
        if (vVar != null) {
            vVar.w();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantHeadlessUIC", "onResume");
        com.tencent.mm.plugin.appbrand.wxassistant.v vVar = this.f273310d;
        if (vVar != null) {
            vVar.A();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        this.f273310d = new com.tencent.mm.plugin.appbrand.wxassistant.v(getActivity());
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) getIntent().getParcelableExtra("KEY_INIT_CONFIG");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) getIntent().getParcelableExtra("KEY_STAT_OBJECT");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch appId:");
        sb6.append(appBrandInitConfigWC != null ? appBrandInitConfigWC.f77278d : null);
        sb6.append(" statObject:");
        sb6.append(appBrandStatObject != null ? java.lang.Integer.valueOf(appBrandStatObject.f87790f) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAssistantHeadlessUIC", sb6.toString());
        if (appBrandInitConfigWC != null && appBrandStatObject != null) {
            com.tencent.mm.plugin.appbrand.wxassistant.v vVar = this.f273310d;
            kotlin.jvm.internal.o.d(vVar);
            appBrandInitConfigWC.f47269b2 = appBrandStatObject;
            vVar.j(null, appBrandInitConfigWC);
        }
        com.tencent.mm.plugin.appbrand.wxassistant.v vVar2 = this.f273310d;
        kotlin.jvm.internal.o.d(vVar2);
        ym5.v6.b(contentView, vVar2.getView());
        if (appBrandInitConfigWC == null || (weAppOpenUICallbackIPCProxy = appBrandInitConfigWC.f77313z2) == null) {
            return;
        }
        weAppOpenUICallbackIPCProxy.f84476d.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
    }
}
