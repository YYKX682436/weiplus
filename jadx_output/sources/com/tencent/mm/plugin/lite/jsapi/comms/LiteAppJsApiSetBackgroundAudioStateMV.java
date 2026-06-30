package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class LiteAppJsApiSetBackgroundAudioStateMV extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static long f143490g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f143491h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f143492i;

    static {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f143491h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                if (liteAppLifeCycleEvent.f54468g.f7817a != 3) {
                    return false;
                }
                com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.f143490g = 0L;
                com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.f143492i.dead();
                dead();
                return false;
            }
        };
        f143492i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.2
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
                if (com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.f143490g == 0) {
                    return false;
                }
                java.lang.String str = musicPlayerEvent2.f54512g.f7040f;
                com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "backgroundAudioListener callback in, state:%s", str);
                am.jk jkVar = musicPlayerEvent2.f54512g;
                boolean z17 = jkVar.f7041g;
                int i17 = (int) (jkVar.f7039e / 1000);
                if (!z17) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "is not from QQMusicPlayer, don't callback!");
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
                    com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.f143490g, "onBackgroundAudioStateChange", jSONObject);
                    return false;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", e17.getMessage());
                    return false;
                }
            }
        };
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (jSONObject == null) {
            this.f143443f.a("param is null");
            return;
        }
        f143490g = this.f143442e.f299024a;
        com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "appUuid: " + f143490g);
        com.tencent.mm.sdk.event.IListener iListener = f143492i;
        iListener.dead();
        iListener.alive();
        com.tencent.mm.sdk.event.IListener iListener2 = f143491h;
        iListener2.dead();
        iListener2.alive();
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            str2 = null;
        } else {
            ((yg0.s3) ((zg0.b3) i95.n0.c(zg0.b3.class))).getClass();
            str2 = xw4.b.c(optString);
        }
        java.lang.String optString2 = jSONObject.optString("src");
        java.lang.String optString3 = jSONObject.optString("lowbandSrc");
        java.lang.String optString4 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString5 = jSONObject.optString("epname");
        java.lang.String optString6 = jSONObject.optString("singer");
        java.lang.String optString7 = jSONObject.optString("coverImgUrl");
        java.lang.String optString8 = jSONObject.optString("webUrl");
        int P = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("startTime"), 0);
        java.lang.String optString9 = jSONObject.optString("srcId");
        java.lang.String optString10 = jSONObject.optString("protocol");
        java.lang.String optString11 = jSONObject.optString("musicbar_url");
        java.lang.String optString12 = jSONObject.optString("songLyric");
        java.lang.String optString13 = jSONObject.optString("src_username");
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("needStartMusicUI"), 0);
        double d17 = 1.0d;
        double F = com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("playbackRate"), 1.0d);
        double F2 = com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("volume"), 1.0d);
        if (F >= 0.5d && F <= 2.0d) {
            d17 = F;
        }
        if (android.text.TextUtils.isEmpty(optString12)) {
            str3 = optString9;
            com.tencent.mars.xlog.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "songLyric is empty");
            str4 = optString5;
        } else {
            str3 = optString9;
            str4 = optString5;
            com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "songLyric: %s", optString12);
        }
        java.lang.String str5 = optString7 == null ? "" : optString7;
        java.lang.String optString14 = jSONObject.optString("mid");
        java.lang.String optString15 = jSONObject.optString("mvMusicGenre");
        java.lang.String optString16 = jSONObject.optString("mvIdentification");
        java.lang.String str6 = str2;
        long V = com.tencent.mm.sdk.platformtools.t8.V(jSONObject.optString("mvIssueDate"), 0L);
        long V2 = com.tencent.mm.sdk.platformtools.t8.V(jSONObject.optString("mvDuration"), 0L);
        java.lang.String optString17 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
        java.lang.String optString18 = jSONObject.optString("mvObjectId");
        java.lang.String optString19 = jSONObject.optString("mvNonceId");
        java.lang.String optString20 = jSONObject.optString("mvCoverUrl");
        java.lang.String optString21 = jSONObject.optString("mvMakerFinderNickname");
        java.lang.String optString22 = jSONObject.optString("musicOperationUrl");
        java.lang.String optString23 = jSONObject.optString("sceneNote");
        java.lang.String optString24 = jSONObject.optString("musicAppId");
        double d18 = d17;
        java.lang.String str7 = str3;
        java.lang.String str8 = str5;
        java.lang.String str9 = str4;
        com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "src : %s, title : %s, singer : %s, coverImgUrl : %s, webUrl : %s, startTime:%d, protocol:%s, musicbar_url:%s, playbackRate:%f, volume:%f", optString2, optString4, optString6, str5, optString8, java.lang.Integer.valueOf(P), optString10, optString11, java.lang.Double.valueOf(d17), java.lang.Double.valueOf(F2));
        com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "genre:%s, identification:%s, issueDate:%d, duration:%d, extraInfo:%s, mvObjectId:%s, mvNonceId:%s, mvCoverUrl:%s, mvMakerFinderNickname:%s, sceneNote:%s, musicAppId:%s", optString15, optString16, java.lang.Long.valueOf(V), java.lang.Long.valueOf(V2), optString17, optString18, optString19, optString20, optString21, optString23, optString24);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2) || com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "setBackgroundAudioStateMv fail, src or title is null");
            this.f143443f.a("setBackgroundAudioStateMv:fail, src or title is null");
            return;
        }
        if (optString12 != null && optString12.length() > 32768) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "setBackgroundAudioState fail, songLyric is too long");
            this.f143443f.a("setBackgroundAudioStateMv:fail, songLyric is too long");
            return;
        }
        java.lang.String str10 = "" + optString2.hashCode();
        b21.r a17 = b21.s.a(10, str8, optString4, optString6, optString8, optString3, optString2, "" + optString2.hashCode(), lp0.b.D(), g83.a.a() + str8.hashCode(), str9, str);
        a17.C = str6;
        a17.D = P * 1000;
        a17.E = str7;
        a17.F = optString10;
        a17.H = optString11;
        a17.f17355q = optString12;
        a17.I = optString13;
        a17.K = d18;
        a17.L = (float) F2;
        a17.P = optString14;
        r45.xs4 xs4Var = new r45.xs4();
        xs4Var.set(0, optString18);
        xs4Var.set(1, optString19);
        xs4Var.set(2, optString20);
        xs4Var.set(3, optString21);
        xs4Var.set(14, optString4);
        xs4Var.set(4, optString6);
        xs4Var.set(16, str8);
        xs4Var.set(5, str9);
        xs4Var.set(8, java.lang.Long.valueOf(V));
        int i17 = (int) V2;
        xs4Var.set(10, java.lang.Integer.valueOf(i17));
        xs4Var.set(9, optString16);
        xs4Var.set(6, optString17);
        xs4Var.set(15, optString12);
        xs4Var.set(7, optString15);
        xs4Var.set(11, optString14);
        xs4Var.set(13, str8);
        b21.t a18 = b21.t.a(str10, xs4Var);
        ((s90.e) ((t90.e) i95.n0.c(t90.e.class))).getClass();
        b21.u.d(a17, a18);
        boolean z18 = a17.b(b21.m.b()) && b21.m.c();
        com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "needStartMusicUI :%d", java.lang.Integer.valueOf(P2));
        if (z18) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "The same music is playing");
            b21.m.k(a17);
        } else {
            com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "play the music");
            b21.m.i(a17);
            if (P2 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_scene", 8);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "music", ".ui.MusicMainUI", intent, null);
            } else if (P2 == 2) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_mv_song_name", optString4);
                intent2.putExtra("key_mv_song_lyric", optString12);
                intent2.putExtra("key_mv_album_cover_url", str8);
                intent2.putExtra("key_mv_feed_id", optString18);
                intent2.putExtra("key_mv_nonce_id", optString19);
                intent2.putExtra("key_mv_cover_url", optString20);
                intent2.putExtra("key_mv_poster", optString21);
                intent2.putExtra("key_mv_singer_name", optString6);
                intent2.putExtra("key_mv_album_name", str9);
                intent2.putExtra("key_mv_music_genre", optString15);
                intent2.putExtra("key_mv_issue_date", V + "");
                intent2.putExtra("key_mv_identification", optString16);
                intent2.putExtra("key_mv_extra_info", optString17);
                intent2.putExtra("key_mv_music_duration", i17);
                intent2.putExtra("key_mv_music_operation_url", optString22);
                intent2.putExtra("key_mv_song_mid", optString14);
                intent2.putExtra("key_mv_scene_note", optString23);
                intent2.setFlags(268435456);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "mv", ".ui.MusicMvMainUI", intent2, null);
            }
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "setBackgroundAudioStateMV ok");
        this.f143443f.d(false);
    }
}
