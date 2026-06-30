package com.tencent.mm.plugin.lite.jsapi.bridge.webview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/bridge/webview/LiteAppTingAudioStateApi;", "Lq93/a;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LiteAppTingAudioStateApi extends q93.a {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashSet f143477m = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public long f143478g;

    /* renamed from: h, reason: collision with root package name */
    public final rk4.o5 f143479h = new q93.i(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f143480i;

    public LiteAppTingAudioStateApi() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f143480i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi$liteAppCloseWindowEvent$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3) {
                    return false;
                }
                java.lang.String str = riVar.f7819c;
                com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi liteAppTingAudioStateApi = com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi.this;
                if (!com.tencent.mm.sdk.platformtools.t8.D0(str, liteAppTingAudioStateApi.f143442e.f299025b)) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("LiteAppSetTingAudioStateApi", "unregisterPlayerEventListener appId %s, %d", riVar.f7819c, java.lang.Long.valueOf(liteAppTingAudioStateApi.f143478g));
                com.tencent.mm.plugin.lite.jsapi.bridge.webview.LiteAppTingAudioStateApi.f143477m.remove(java.lang.Long.valueOf(liteAppTingAudioStateApi.f143478g));
                ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).Ai(liteAppTingAudioStateApi.f143479h);
                dead();
                return false;
            }
        };
    }

    @Override // q93.a, jd.b
    public void a(java.lang.String appId, org.json.JSONObject data, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(data, "data");
        super.a(appId, data, z17);
        long j17 = this.f143442e.f299024a;
        this.f143478g = j17;
        java.util.HashSet hashSet = f143477m;
        if (hashSet.contains(java.lang.Long.valueOf(j17))) {
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppSetTingAudioStateApi", "registerPlayerEventListener %d", java.lang.Long.valueOf(this.f143478g));
        hashSet.add(java.lang.Long.valueOf(this.f143478g));
        this.f143480i.alive();
        ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).wi(this.f143479h);
    }
}
