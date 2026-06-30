package zc;

/* loaded from: classes11.dex */
public final class i implements io.flutter.plugin.common.MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f471350b;

    public i(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, boolean z17) {
        this.f471349a = wxaLiteAppWidgetAdapter;
        this.f471350b = z17;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(java.lang.String errorCode, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        kd.c.b("LiteApp.WxaLiteAppWidgetAdapter", "flutter navigate back.error: " + errorCode + ", " + str + ", " + obj, new java.lang.Object[0]);
        this.f471349a.f45975q.finish();
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        kd.c.b("LiteApp.WxaLiteAppWidgetAdapter", "flutter navigate back.notImplemented", new java.lang.Object[0]);
        this.f471349a.f45975q.finish();
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(java.lang.Object obj) {
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) obj).booleanValue()) {
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "flutter navigate back.do nothing in ui navigateback method", new java.lang.Object[0]);
            return;
        }
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471349a;
        wxaLiteAppWidgetAdapter.f45974p.navigateBack(new com.tencent.pigeon.liteapp.WxaLiteAppWidgetNavigateBackMessage(wxaLiteAppWidgetAdapter.f45965d, this.f471350b), new zc.h(wxaLiteAppWidgetAdapter));
    }
}
