package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class LiteAppJsApiGetBackgroundAudioState extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static long f143482g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f143483h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f143484i;

    static {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f143483h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                if (liteAppLifeCycleEvent.f54468g.f7817a != 3) {
                    return false;
                }
                com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.f143482g = 0L;
                com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.f143484i.dead();
                dead();
                return false;
            }
        };
        f143484i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.2
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
                if (com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.f143482g == 0) {
                    return false;
                }
                java.lang.String str = musicPlayerEvent2.f54512g.f7040f;
                com.tencent.mars.xlog.Log.i("LiteAppJsApiGetBackgroundAudioState", "backgroundAudioListener callback in, state:%s", str);
                am.jk jkVar = musicPlayerEvent2.f54512g;
                boolean z17 = jkVar.f7041g;
                int i17 = (int) (jkVar.f7039e / 1000);
                if (!z17) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiGetBackgroundAudioState", "is not from QQMusicPlayer, don't callback!");
                    return false;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("state", str);
                    jSONObject.put("duration", i17);
                    b21.r rVar = jkVar.f7037c;
                    if (rVar != null) {
                        jSONObject.put("src", rVar.f17352n);
                        jSONObject.put("srcId", jkVar.f7037c.E);
                    }
                    jSONObject.put("errCode", jkVar.f7045k);
                    jSONObject.put("errMsg", android.text.TextUtils.isEmpty(jkVar.f7046l) ? "" : jkVar.f7046l);
                    b21.r b17 = b21.m.b();
                    if (b17 != null) {
                        java.lang.String wi6 = ((yg0.m4) ((zg0.m3) i95.n0.c(zg0.m3.class))).wi(b17.f17346e);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                            jSONObject.put("audioId", wi6);
                        }
                    }
                    com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.f143482g, "onBackgroundAudioStateChange", jSONObject);
                    return false;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiGetBackgroundAudioState", e17.getMessage());
                    return false;
                }
            }
        };
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        b21.r b17 = b21.m.b();
        b21.o a17 = b21.m.a();
        if (b17 == null || a17 == null || a17.f17339c == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("paused", 1);
            this.f143443f.b(hashMap);
            return;
        }
        if (!android.text.TextUtils.isEmpty(b17.f17358t) && !str.equals(b17.f17358t)) {
            this.f143443f.a("appId is different");
            return;
        }
        int i17 = a17.f17337a;
        int i18 = a17.f17338b;
        if ("stop".equals(a17.f17341e) || i17 < 0 || i18 < 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiGetBackgroundAudioState", "return parameter is invalid");
            this.f143443f.a("fail");
            return;
        }
        f143482g = this.f143442e.f299024a;
        com.tencent.mm.sdk.event.IListener iListener = f143483h;
        iListener.dead();
        iListener.alive();
        com.tencent.mm.sdk.event.IListener iListener2 = f143484i;
        iListener2.dead();
        iListener2.alive();
        int i19 = i17 / 1000;
        int i27 = i18 / 1000;
        int i28 = a17.f17339c;
        int i29 = i19 > 0 ? (a17.f17340d * i19) / 100 : 0;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("duration", java.lang.Integer.valueOf(i19));
        hashMap2.put("currentTime", java.lang.Integer.valueOf(i27));
        hashMap2.put("paused", java.lang.Integer.valueOf(i28 == 1 ? 0 : 1));
        hashMap2.put("src", b17.f17352n);
        hashMap2.put("buffered", java.lang.Integer.valueOf(i29));
        hashMap2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, b17.f17348g);
        hashMap2.put("epname", b17.f17350i);
        hashMap2.put("singer", b17.f17349h);
        hashMap2.put("coverImgUrl", b17.f17351m);
        hashMap2.put("isLive", 0);
        hashMap2.put("startTime", java.lang.Integer.valueOf(b17.D / 1000));
        hashMap2.put("srcId", b17.E);
        java.lang.String str2 = b17.F;
        if (str2 == null) {
            str2 = "";
        }
        hashMap2.put("protocol", str2);
        hashMap2.put("webUrl", b17.f17354p);
        hashMap2.put("playState", a17.f17341e);
        hashMap2.put("songLyric", b17.f17355q);
        hashMap2.put("playbackRate", java.lang.Double.valueOf(b17.K));
        this.f143443f.b(hashMap2);
    }
}
