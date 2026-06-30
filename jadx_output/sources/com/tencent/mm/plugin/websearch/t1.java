package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181626f;

    public t1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, java.lang.String str) {
        this.f181624d = weakReference;
        this.f181625e = searchResultTLPlayerInfo;
        this.f181626f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181624d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181625e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f181626f;
        if (str == null) {
            str = "";
        }
        searchResultFinderVideoPlayersCallbackApi.onVideoWaitingEnd(longValue, str, com.tencent.mm.plugin.websearch.s1.f181620d);
    }
}
