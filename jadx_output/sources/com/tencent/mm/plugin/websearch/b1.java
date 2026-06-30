package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f181462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f181463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f181464i;

    public b1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, java.lang.String str, int i17, int i18, int i19) {
        this.f181459d = weakReference;
        this.f181460e = searchResultTLPlayerInfo;
        this.f181461f = str;
        this.f181462g = i17;
        this.f181463h = i18;
        this.f181464i = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.websearch.SearchResultFinderVideoPlayersCallbackApi searchResultFinderVideoPlayersCallbackApi;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin flutterSearchFinderVideoPlayerPlugin = (com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin) this.f181459d.get();
        if (flutterSearchFinderVideoPlayerPlugin == null || (searchResultFinderVideoPlayersCallbackApi = flutterSearchFinderVideoPlayerPlugin.f181415f) == null) {
            return;
        }
        java.lang.Long playerId = this.f181460e.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        long longValue = playerId.longValue();
        java.lang.String str = this.f181461f;
        if (str == null) {
            str = "";
        }
        searchResultFinderVideoPlayersCallbackApi.onGetVideoPlayFps(longValue, str, this.f181462g, this.f181463h, this.f181464i, com.tencent.mm.plugin.websearch.a1.f181438d);
    }
}
