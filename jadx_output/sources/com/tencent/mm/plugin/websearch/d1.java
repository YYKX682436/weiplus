package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f181491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f181492h;

    public d1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, java.lang.String str, int i17, int i18) {
        this.f181488d = weakReference;
        this.f181489e = searchResultTLPlayerInfo;
        this.f181490f = str;
        this.f181491g = i17;
        this.f181492h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181488d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181489e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f181490f;
        if (str == null) {
            str = "";
        }
        searchResultFinderVideoPlayersCallbackApi.onGetVideoSize(longValue, str, this.f181491g, this.f181492h, com.tencent.mm.plugin.websearch.c1.f181472d);
    }
}
