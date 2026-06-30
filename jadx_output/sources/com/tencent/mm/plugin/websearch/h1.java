package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181538f;

    public h1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, java.lang.String str) {
        this.f181536d = weakReference;
        this.f181537e = searchResultTLPlayerInfo;
        this.f181538f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181536d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181537e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f181538f;
        if (str == null) {
            str = "";
        }
        searchResultFinderVideoPlayersCallbackApi.onPrepared(longValue, str, com.tencent.mm.plugin.websearch.g1.f181516d);
    }
}
