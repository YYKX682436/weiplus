package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class v0 implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin f181682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181683e;

    public v0(com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin flutterSearchFinderLivePlayerPlugin, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo) {
        this.f181682d = flutterSearchFinderLivePlayerPlugin;
        this.f181683e = searchResultTLPlayerInfo;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        com.tencent.pigeon.websearch.SearchResultFinderLivePlayersCallbackApi searchResultFinderLivePlayersCallbackApi;
        com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo = this.f181683e;
        com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin flutterSearchFinderLivePlayerPlugin = this.f181682d;
        if (i17 == 2003) {
            com.tencent.pigeon.websearch.SearchResultFinderLivePlayersCallbackApi searchResultFinderLivePlayersCallbackApi2 = flutterSearchFinderLivePlayerPlugin.f181404e;
            if (searchResultFinderLivePlayersCallbackApi2 != null) {
                java.lang.Long playerId = searchResultTLPlayerInfo.getPlayerId();
                kotlin.jvm.internal.o.d(playerId);
                searchResultFinderLivePlayersCallbackApi2.onRecFirstFrame(playerId.longValue(), com.tencent.mm.plugin.websearch.s0.f181619d);
                return;
            }
            return;
        }
        if (i17 != 2006) {
            if (i17 == 2103 && (searchResultFinderLivePlayersCallbackApi = flutterSearchFinderLivePlayerPlugin.f181404e) != null) {
                java.lang.Long playerId2 = searchResultTLPlayerInfo.getPlayerId();
                kotlin.jvm.internal.o.d(playerId2);
                searchResultFinderLivePlayersCallbackApi.onPlayWarningReconnect(playerId2.longValue(), com.tencent.mm.plugin.websearch.u0.f181628d);
                return;
            }
            return;
        }
        com.tencent.pigeon.websearch.SearchResultFinderLivePlayersCallbackApi searchResultFinderLivePlayersCallbackApi3 = flutterSearchFinderLivePlayerPlugin.f181404e;
        if (searchResultFinderLivePlayersCallbackApi3 != null) {
            java.lang.Long playerId3 = searchResultTLPlayerInfo.getPlayerId();
            kotlin.jvm.internal.o.d(playerId3);
            searchResultFinderLivePlayersCallbackApi3.onPlayEnd(playerId3.longValue(), com.tencent.mm.plugin.websearch.t0.f181623d);
        }
    }
}
