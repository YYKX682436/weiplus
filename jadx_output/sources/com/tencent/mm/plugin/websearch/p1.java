package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181587f;

    public p1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, java.lang.String str) {
        this.f181585d = weakReference;
        this.f181586e = searchResultTLPlayerInfo;
        this.f181587f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181585d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181586e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f181587f;
        if (str == null) {
            str = "";
        }
        searchResultFinderVideoPlayersCallbackApi.onVideoPlay(longValue, str, com.tencent.mm.plugin.websearch.o1.f181579d);
    }
}
