package lx;

/* loaded from: classes11.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f321785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f321786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321787g;

    public h3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, int i17, java.util.List list, yz5.l lVar) {
        this.f321784d = flutterBizPlugin;
        this.f321785e = i17;
        this.f321786f = list;
        this.f321787g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f321784d.f65254e;
        java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> list = this.f321786f;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onBizFinderLiveInfoUpdate(this.f321785e, list, lx.g3.f321771d);
        }
        yz5.l lVar = this.f321787g;
        if (lVar != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.n0.V0(list))));
        }
    }
}
