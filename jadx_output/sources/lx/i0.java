package lx;

/* loaded from: classes11.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f321795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f321796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f321797i;

    public i0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, java.lang.String str, int i17, int i18, int i19) {
        this.f321792d = weakReference;
        this.f321793e = bizTLPlayerInfo;
        this.f321794f = str;
        this.f321795g = i17;
        this.f321796h = i18;
        this.f321797i = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizFinderVideoPlayersCallbackApi bizFinderVideoPlayersCallbackApi;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin = (com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin) this.f321792d.get();
        if (flutterBizFinderVideoPlayerPlugin == null || (bizFinderVideoPlayersCallbackApi = flutterBizFinderVideoPlayerPlugin.f65246f) == null) {
            return;
        }
        java.lang.Long playerId = this.f321793e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f321794f;
        if (str == null) {
            str = "";
        }
        bizFinderVideoPlayersCallbackApi.onGetVideoPlayFps(longValue, str, this.f321795g, this.f321796h, this.f321797i, lx.h0.f321779d);
    }
}
