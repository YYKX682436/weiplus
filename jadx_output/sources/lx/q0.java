package lx;

/* loaded from: classes11.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321917f;

    public q0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, java.lang.String str) {
        this.f321915d = weakReference;
        this.f321916e = bizTLPlayerInfo;
        this.f321917f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizFinderVideoPlayersCallbackApi bizFinderVideoPlayersCallbackApi;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin = (com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin) this.f321915d.get();
        if (flutterBizFinderVideoPlayerPlugin == null || (bizFinderVideoPlayersCallbackApi = flutterBizFinderVideoPlayerPlugin.f65246f) == null) {
            return;
        }
        java.lang.Long playerId = this.f321916e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f321917f;
        if (str == null) {
            str = "";
        }
        bizFinderVideoPlayersCallbackApi.onVideoFirstFrameDraw(longValue, str, lx.p0.f321901d);
    }
}
