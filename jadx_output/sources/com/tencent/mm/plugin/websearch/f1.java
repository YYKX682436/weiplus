package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f181503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f181504g;

    public f1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, int i17, int i18) {
        this.f181501d = weakReference;
        this.f181502e = searchResultTLPlayerInfo;
        this.f181503f = i17;
        this.f181504g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181501d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181502e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        searchResultFinderVideoPlayersCallbackApi.onPlayProgress(playerId.longValue(), this.f181503f, this.f181504g, com.tencent.mm.plugin.websearch.e1.f181497d);
    }
}
