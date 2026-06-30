package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f181736h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f181737i;

    public z0(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f181732d = weakReference;
        this.f181733e = searchResultTLPlayerInfo;
        this.f181734f = str;
        this.f181735g = str2;
        this.f181736h = i17;
        this.f181737i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181732d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181733e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f181734f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.f181735g;
        if (str2 == null) {
            str2 = "";
        }
        searchResultFinderVideoPlayersCallbackApi.onError(longValue, str, str2, this.f181736h, this.f181737i, com.tencent.mm.plugin.websearch.y0.f181728d);
    }
}
