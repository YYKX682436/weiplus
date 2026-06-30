package lx;

/* loaded from: classes11.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321862f;

    public m0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, java.lang.String str) {
        this.f321860d = weakReference;
        this.f321861e = bizTLPlayerInfo;
        this.f321862f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizFinderVideoPlayersCallbackApi bizFinderVideoPlayersCallbackApi;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin flutterBizFinderVideoPlayerPlugin = (com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin) this.f321860d.get();
        if (flutterBizFinderVideoPlayerPlugin == null || (bizFinderVideoPlayersCallbackApi = flutterBizFinderVideoPlayerPlugin.f65246f) == null) {
            return;
        }
        java.lang.Long playerId = this.f321861e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f321862f;
        if (str == null) {
            str = "";
        }
        bizFinderVideoPlayersCallbackApi.onPrepared(longValue, str, lx.l0.f321844d);
    }
}
