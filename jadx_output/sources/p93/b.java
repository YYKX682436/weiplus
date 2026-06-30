package p93;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f352889a = new java.util.HashMap();

    public b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((j60.y) ((q80.k0) i95.n0.c(q80.k0.class))).getClass();
        nw4.d.f340815a.a();
        a("getLocalMiniGameVideo");
        a(com.tencent.mm.plugin.appbrand.jsapi.j4.NAME);
        a("cancelHaowanPublish");
        a("getGameCommInfo");
        a("operateGameCenterMsg");
        a("fetchGameCenterEntranceInfo");
        a("dispatchEvent");
        a("getGameWeakNetInfo");
        a("getOpenDeviceId");
        a("requestOverlayPermission");
        a(com.tencent.mm.plugin.appbrand.jsapi.t3.NAME);
        a("initGameLifeContact");
        a("setBlackList");
        a("switchToGameTab");
        a("interceptBack");
        a("browseEmoticonView");
        a("getStoreEmoticonImage");
        a("delMiniGameVideo");
        a("notifyAccountState");
        a("getGameChatRedInfo");
        a("openGameChatVc");
        a("shareCustomContent");
        a("patchApkChannel");
        com.tencent.mars.xlog.Log.i("LiteAppJsApiBridgeLuggageJsApiPool", "init LiteAppJsApiBridgeLuggageJsApiPool takes %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void a(java.lang.String str) {
        this.f352889a.put(str, p93.a.class);
    }
}
