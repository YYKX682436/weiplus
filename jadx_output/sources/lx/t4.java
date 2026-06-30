package lx;

/* loaded from: classes11.dex */
public final class t4 implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f321952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321953c;

    public t4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f321951a = flutterBizPlugin;
        this.f321952b = z17;
        this.f321953c = weakReference;
    }

    @Override // rv.e3
    public final void a(com.tencent.pigeon.biz.BizPublishResultPiegonInfo bizPublishResultPiegonInfo, org.json.JSONObject jSONObject) {
        com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi;
        com.tencent.mars.xlog.Log.i(this.f321951a.f65253d, "openPersonalCenterMiniAppPage receive publishCallback");
        if (!this.f321952b || (bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f321953c.get()) == null) {
            return;
        }
        bizPersonalCenterNativeToFlutterApi.requestAcct(true, lx.s4.f321944d);
    }
}
