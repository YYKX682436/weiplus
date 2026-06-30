package lx;

/* loaded from: classes11.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321939f;

    public s0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, java.lang.String str) {
        this.f321937d = weakReference;
        this.f321938e = bizTLPlayerInfo;
        this.f321939f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizFinderVideoPlayersCallbackApi bizFinderVideoPlayersCallbackApi;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin = (com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin) this.f321937d.get();
        if (flutterBizFinderVideoPlayerPlugin == null || (bizFinderVideoPlayersCallbackApi = flutterBizFinderVideoPlayerPlugin.f65246f) == null) {
            return;
        }
        java.lang.Long playerId = this.f321938e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f321939f;
        if (str == null) {
            str = "";
        }
        bizFinderVideoPlayersCallbackApi.onVideoPause(longValue, str, lx.r0.f321926d);
    }
}
