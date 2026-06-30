package zc;

/* loaded from: classes11.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage f471360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f471361f;

    public o(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage wxaLiteAppWidgetSetForbidRightGestureEnableMessage, boolean z17) {
        this.f471359d = wxaLiteAppWidgetAdapter;
        this.f471360e = wxaLiteAppWidgetSetForbidRightGestureEnableMessage;
        this.f471361f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471359d;
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi wxaLiteAppWidgetFlutterPluginApi = wxaLiteAppWidgetAdapter.f45974p;
        boolean z17 = this.f471361f;
        wxaLiteAppWidgetFlutterPluginApi.setForbidRightGestureEnable(this.f471360e, new zc.n(wxaLiteAppWidgetAdapter, z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(wxaLiteAppWidgetAdapter.f45965d));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        kx5.n.h().j(wxaLiteAppWidgetAdapter.f45967f, "setForbidRightGestureEnable", hashMap);
    }
}
