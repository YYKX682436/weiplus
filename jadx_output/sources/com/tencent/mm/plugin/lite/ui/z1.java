package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class z1 implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f144505d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f144506e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f144507f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f144508g;

    public z1(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.MethodChannel methodChannel) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f144505d = methodChannel;
        this.f144506e = "WxaLiteAppPlatformView." + hashCode();
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
        java.lang.Object obj = map != null ? map.get("viewId") : null;
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        com.tencent.mars.xlog.Log.i("WxaLiteAppBaseView", "reused view viewId: " + (num != null ? num.intValue() : -1));
        java.lang.Object obj2 = map != null ? map.get("appId") : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        str = str == null ? "" : str;
        java.lang.Object obj3 = map != null ? map.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE) : null;
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        str2 = str2 == null ? "" : str2;
        java.lang.Object obj4 = map != null ? map.get("query") : null;
        java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        android.view.View oj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(context, false, false, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        bundle.putString("query", str4);
        ((com.tencent.mm.plugin.lite.ui.WxaLiteAppView) oj6).f46050q = true;
        this.f144507f = new java.lang.ref.WeakReference(oj6);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qk(oj6, bundle, true, false, new com.tencent.mm.plugin.lite.ui.x1(this));
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        if (getView() instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppView) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.lite.w.f144514q;
            android.view.View view = getView();
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.ui.WxaLiteAppView");
            hashMap.remove(java.lang.Long.valueOf(((com.tencent.mm.plugin.lite.ui.WxaLiteAppView) view).getAppUuid()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispose uuid:");
            android.view.View view2 = getView();
            kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.ui.WxaLiteAppView");
            sb6.append(((com.tencent.mm.plugin.lite.ui.WxaLiteAppView) view2).getAppUuid());
            com.tencent.mars.xlog.Log.w(this.f144506e, sb6.toString());
            android.view.View view3 = getView();
            kotlin.jvm.internal.o.e(view3, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.ui.WxaLiteAppView");
            ((com.tencent.mm.plugin.lite.ui.WxaLiteAppView) view3).a();
            this.f144508g = false;
        }
        io.flutter.plugin.common.MethodChannel methodChannel = this.f144505d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        java.lang.ref.WeakReference weakReference = this.f144507f;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewAttached(android.view.View flutterView) {
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        super.onFlutterViewAttached(flutterView);
        if (this.f144508g) {
            java.lang.ref.WeakReference weakReference = this.f144507f;
            android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
            com.tencent.mm.plugin.lite.ui.WxaLiteAppView wxaLiteAppView = view instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppView ? (com.tencent.mm.plugin.lite.ui.WxaLiteAppView) view : null;
            if (wxaLiteAppView == null) {
                return;
            }
            java.lang.Object context = flutterView.getContext();
            androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
            if (yVar == null) {
                return;
            }
            yVar.mo133getLifecycle().a(wxaLiteAppView);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewDetached() {
        super.onFlutterViewDetached();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        if (call.method.equals("onBackPressed")) {
            java.lang.ref.WeakReference weakReference = this.f144507f;
            android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppView) {
                com.tencent.mm.plugin.lite.LiteAppCenter.navigateBack(((com.tencent.mm.plugin.lite.ui.WxaLiteAppView) view).getAppUuid(), true);
            }
        }
    }
}
