package lx;

/* loaded from: classes11.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f321993g;

    public w0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, java.lang.String str, java.lang.Boolean bool) {
        this.f321990d = weakReference;
        this.f321991e = bizTLPlayerInfo;
        this.f321992f = str;
        this.f321993g = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizFinderVideoPlayersCallbackApi bizFinderVideoPlayersCallbackApi;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin = (com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin) this.f321990d.get();
        if (flutterBizFinderVideoPlayerPlugin == null || (bizFinderVideoPlayersCallbackApi = flutterBizFinderVideoPlayerPlugin.f65246f) == null) {
            return;
        }
        java.lang.Long playerId = this.f321991e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f321992f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.Boolean bool = this.f321993g;
        bizFinderVideoPlayersCallbackApi.onVideoWaiting(longValue, str2, bool != null ? bool.booleanValue() : false, lx.v0.f321975d);
    }
}
