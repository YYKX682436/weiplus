package ew;

/* loaded from: classes11.dex */
public final class s implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin f256998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f256999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.FinderLivePlayInfo f257000f;

    public s(com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin flutterBrsFinderLivePlayerPlugin, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo) {
        this.f256998d = flutterBrsFinderLivePlayerPlugin;
        this.f256999e = bizTLPlayerInfo;
        this.f257000f = finderLivePlayInfo;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi bizFinderLivePlayersCallbackApi;
        com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo = this.f256999e;
        com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin flutterBrsFinderLivePlayerPlugin = this.f256998d;
        if (i17 != 2003) {
            if (i17 != 2006) {
                if (i17 == 2103 && (bizFinderLivePlayersCallbackApi = flutterBrsFinderLivePlayerPlugin.f65217e) != null) {
                    java.lang.Long playerId = bizTLPlayerInfo.getPlayerId();
                    kotlin.jvm.internal.o.d(playerId);
                    bizFinderLivePlayersCallbackApi.onPlayWarningReconnect(playerId.longValue(), ew.r.f256997d);
                    return;
                }
                return;
            }
            com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi bizFinderLivePlayersCallbackApi2 = flutterBrsFinderLivePlayerPlugin.f65217e;
            if (bizFinderLivePlayersCallbackApi2 != null) {
                java.lang.Long playerId2 = bizTLPlayerInfo.getPlayerId();
                kotlin.jvm.internal.o.d(playerId2);
                bizFinderLivePlayersCallbackApi2.onPlayEnd(playerId2.longValue(), ew.q.f256996d);
                return;
            }
            return;
        }
        com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi bizFinderLivePlayersCallbackApi3 = flutterBrsFinderLivePlayerPlugin.f65217e;
        if (bizFinderLivePlayersCallbackApi3 != null) {
            java.lang.Long playerId3 = bizTLPlayerInfo.getPlayerId();
            kotlin.jvm.internal.o.d(playerId3);
            bizFinderLivePlayersCallbackApi3.onRecFirstFrame(playerId3.longValue(), ew.p.f256995d);
        }
        java.util.Map map = ew.n.f256993a;
        java.lang.String finder_object_id = this.f257000f.getFinder_object_id();
        if (finder_object_id == null) {
            finder_object_id = "";
        }
        if (finder_object_id.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) ew.n.f256993a;
        if (!hashMap.containsKey(finder_object_id)) {
            hashMap.put(finder_object_id, new java.util.HashMap());
        }
        java.util.Map map2 = (java.util.Map) hashMap.get(finder_object_id);
        if (map2 != null) {
            map2.put("playstatus", 1);
        }
    }
}
