package lx;

/* loaded from: classes11.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f321829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f321830h;

    public k0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, java.lang.String str, int i17, int i18) {
        this.f321826d = weakReference;
        this.f321827e = bizTLPlayerInfo;
        this.f321828f = str;
        this.f321829g = i17;
        this.f321830h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizFinderVideoPlayersCallbackApi bizFinderVideoPlayersCallbackApi;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin = (com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin) this.f321826d.get();
        if (flutterBizFinderVideoPlayerPlugin == null || (bizFinderVideoPlayersCallbackApi = flutterBizFinderVideoPlayerPlugin.f65246f) == null) {
            return;
        }
        java.lang.Long playerId = this.f321827e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f321828f;
        if (str == null) {
            str = "";
        }
        bizFinderVideoPlayersCallbackApi.onGetVideoSize(longValue, str, this.f321829g, this.f321830h, lx.j0.f321812d);
    }
}
