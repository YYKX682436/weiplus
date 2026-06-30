package lx;

/* loaded from: classes11.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f321688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f321689f;

    public a4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, int i17, java.util.List list) {
        this.f321687d = flutterBizPlugin;
        this.f321688e = i17;
        this.f321689f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin = this.f321687d;
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = flutterBizPlugin.f65254e;
        if (bizBaseCallbackApi != null) {
            int i17 = this.f321688e;
            bizBaseCallbackApi.onBizFinderLiveInfoUpdate(i17, this.f321689f, new lx.z3(flutterBizPlugin, i17));
        }
    }
}
