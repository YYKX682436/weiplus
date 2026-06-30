package lx;

/* loaded from: classes11.dex */
public final class c0 implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderLivePlayerPlugin f321704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f321705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.FinderLivePlayInfo f321706f;

    public c0(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderLivePlayerPlugin flutterBizFinderLivePlayerPlugin, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo, com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo) {
        this.f321704d = flutterBizFinderLivePlayerPlugin;
        this.f321705e = bizTLPlayerInfo;
        this.f321706f = finderLivePlayInfo;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi bizFinderLivePlayersCallbackApi;
        com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo = this.f321705e;
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderLivePlayerPlugin flutterBizFinderLivePlayerPlugin = this.f321704d;
        if (i17 != 2003) {
            if (i17 != 2006) {
                if (i17 == 2103 && (bizFinderLivePlayersCallbackApi = flutterBizFinderLivePlayerPlugin.f65234e) != null) {
                    java.lang.Long playerId = bizTLPlayerInfo.getPlayerId();
                    kotlin.jvm.internal.o.d(playerId);
                    bizFinderLivePlayersCallbackApi.onPlayWarningReconnect(playerId.longValue(), lx.b0.f321693d);
                    return;
                }
                return;
            }
            com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi bizFinderLivePlayersCallbackApi2 = flutterBizFinderLivePlayerPlugin.f65234e;
            if (bizFinderLivePlayersCallbackApi2 != null) {
                java.lang.Long playerId2 = bizTLPlayerInfo.getPlayerId();
                kotlin.jvm.internal.o.d(playerId2);
                bizFinderLivePlayersCallbackApi2.onPlayEnd(playerId2.longValue(), lx.a0.f321681d);
                return;
            }
            return;
        }
        com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi bizFinderLivePlayersCallbackApi3 = flutterBizFinderLivePlayerPlugin.f65234e;
        if (bizFinderLivePlayersCallbackApi3 != null) {
            java.lang.Long playerId3 = bizTLPlayerInfo.getPlayerId();
            kotlin.jvm.internal.o.d(playerId3);
            bizFinderLivePlayersCallbackApi3.onRecFirstFrame(playerId3.longValue(), lx.z.f322020d);
        }
        lx.x xVar = lx.x.f322000a;
        java.lang.String finder_object_id = this.f321706f.getFinder_object_id();
        if (finder_object_id == null) {
            finder_object_id = "";
        }
        if (finder_object_id.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) lx.x.f322001b;
        if (!hashMap.containsKey(finder_object_id)) {
            hashMap.put(finder_object_id, new java.util.HashMap());
        }
        java.util.Map map = (java.util.Map) hashMap.get(finder_object_id);
        if (map != null) {
            map.put("playstatus", 1);
        }
    }
}
