package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f181613g;

    public r1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, java.lang.String str, java.lang.Boolean bool) {
        this.f181610d = weakReference;
        this.f181611e = searchResultTLPlayerInfo;
        this.f181612f = str;
        this.f181613g = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181610d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181611e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f181612f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.Boolean bool = this.f181613g;
        searchResultFinderVideoPlayersCallbackApi.onVideoWaiting(longValue, str2, bool != null ? bool.booleanValue() : false, com.tencent.mm.plugin.websearch.q1.f181604d);
    }
}
