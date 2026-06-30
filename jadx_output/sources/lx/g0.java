package lx;

/* loaded from: classes11.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f321766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f321767i;

    public g0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f321762d = weakReference;
        this.f321763e = bizTLPlayerInfo;
        this.f321764f = str;
        this.f321765g = str2;
        this.f321766h = i17;
        this.f321767i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizFinderVideoPlayersCallbackApi bizFinderVideoPlayersCallbackApi;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin = (com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin) this.f321762d.get();
        if (flutterBizFinderVideoPlayerPlugin == null || (bizFinderVideoPlayersCallbackApi = flutterBizFinderVideoPlayerPlugin.f65246f) == null) {
            return;
        }
        java.lang.Long playerId = this.f321763e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f321764f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f321765g;
        if (str2 == null) {
            str2 = "";
        }
        bizFinderVideoPlayersCallbackApi.onError(longValue, str, str2, this.f321766h, this.f321767i, lx.f0.f321752d);
    }
}
