package no4;

/* loaded from: classes5.dex */
public class c implements com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a, iv3.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f338770a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.i0 f338771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f338772c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f338773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f338774e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f338775f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f338776g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f338777h;

    public c(android.os.Bundle extra, com.tencent.mm.plugin.vlog.model.i0 scene) {
        kotlin.jvm.internal.o.g(extra, "extra");
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f338770a = extra;
        this.f338771b = scene;
        if (!com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a.class.getClassLoader(), new java.lang.Class[]{com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.AudioCallback");
        }
        this.f338772c = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a) newProxyInstance;
        this.f338776g = jz5.h.b(new no4.b(this));
        this.f338777h = jz5.h.b(new no4.a(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void a() {
        this.f338772c.a();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f338772c.b(info);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
        this.f338772c.c(z17, lyricsInfos);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void d() {
        this.f338772c.d();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void e(android.view.View favBtn, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(favBtn, "favBtn");
        kotlin.jvm.internal.o.g(info, "info");
        oo4.d dVar = oo4.d.f347197a;
        java.util.Map m17 = kz5.c1.m(dVar.d(this.f338770a), dVar.e("bgm_panel_collect", info));
        cy1.a aVar = (cy1.a) dVar.f();
        aVar.pk(favBtn, "bgm_panel_collect");
        aVar.Tj(favBtn, 40, 1, false);
        aVar.gk(favBtn, m17);
        aVar.Ai(favBtn, new oo4.b(info));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void f(java.lang.String searchWord) {
        kotlin.jvm.internal.o.g(searchWord, "searchWord");
        this.f338774e = searchWord;
        oo4.d dVar = oo4.d.f347197a;
        java.lang.String str = this.f338775f;
        java.util.Map d17 = dVar.d(this.f338770a);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("search_word", searchWord);
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("search_sessionid", str);
        lVarArr[2] = new jz5.l("bgm_panel_tab", 1000);
        java.util.Map m17 = kz5.c1.m(d17, kz5.c1.k(lVarArr));
        ((cy1.a) dVar.f()).Tj(null, 8, 1, false);
        ((cy1.a) dVar.f()).Hj("bgm_panel_search_song", "search_trigger", m17, 25496);
        ((cy1.a) dVar.f()).Bj("bgm_panel_search_song", "search_trigger", m17, 1, false);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void g(boolean z17) {
        u("toggleOrigin", this.f338773d, "remove:" + z17);
        oo4.d dVar = oo4.d.f347197a;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f338773d;
        android.os.Bundle bundle = this.f338770a;
        int i17 = !z17 ? 1 : 0;
        bw5.jr reportInfoScene = t();
        kotlin.jvm.internal.o.g(reportInfoScene, "reportInfoScene");
        java.util.Map e17 = dVar.e("bgm_panel_acoustic", audioCacheInfo);
        e17.put("status", java.lang.Integer.valueOf(i17));
        dVar.j(25496, "bgm_panel_acoustic", bundle, (r17 & 8) != 0 ? kz5.q0.f314001d : e17, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
        r45.ej2 c17 = dVar.c(reportInfoScene);
        c17.set(6, java.lang.Integer.valueOf(i17 ^ 1));
        dVar.l(reportInfoScene, c17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void h(java.lang.String searchWord, int i17, long j17) {
        kotlin.jvm.internal.o.g(searchWord, "searchWord");
        oo4.d dVar = oo4.d.f347197a;
        java.lang.String str = this.f338775f;
        java.util.Map d17 = dVar.d(this.f338770a);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("search_word", searchWord);
        lVarArr[1] = new jz5.l("search_bgm_cnt", java.lang.Integer.valueOf(i17));
        lVarArr[2] = new jz5.l("search_time", java.lang.Long.valueOf(j17));
        if (str == null) {
            str = "";
        }
        lVarArr[3] = new jz5.l("search_sessionid", str);
        lVarArr[4] = new jz5.l("bgm_panel_tab", 1000);
        java.util.Map m17 = kz5.c1.m(d17, kz5.c1.k(lVarArr));
        ((cy1.a) dVar.f()).Tj(null, 8, 1, false);
        ((cy1.a) dVar.f()).Bj("bgm_panel_search_song", "search_result", m17, 1, false);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void i(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        oo4.d dVar = oo4.d.f347197a;
        ((cy1.a) dVar.f()).Bj("bgm_panel_remove_collect", z17 ? "view_exp" : "view_clk", kz5.c1.m(kz5.c1.m(dVar.d(this.f338770a), dVar.e("bgm_panel_remove_collect", info)), kz5.b1.e(new jz5.l("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(info.f155719p))))), 1, false);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void j(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17, long j17) {
        oo4.d dVar = oo4.d.f347197a;
        java.lang.String str = this.f338774e;
        java.lang.String str2 = this.f338775f;
        if (audioCacheInfo == null) {
            return;
        }
        if (!kz5.n0.O(oo4.d.f347198b, java.lang.Integer.valueOf(audioCacheInfo.f155719p))) {
            str = "";
        }
        java.util.Map m17 = kz5.c1.m(dVar.d(this.f338770a), dVar.e("bgm_panel_song", audioCacheInfo));
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(audioCacheInfo.f155719p)));
        lVarArr[1] = new jz5.l("bgm_play_time", java.lang.Long.valueOf(j17));
        lVarArr[2] = new jz5.l("search_word", str);
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[3] = new jz5.l("search_sessionid", str2);
        ((cy1.a) dVar.f()).Bj("bgm_panel_song", "bgm_play_end", kz5.c1.m(m17, kz5.c1.k(lVarArr)), 1, false);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.lang.String sourceTabID, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(sourceTabID, "sourceTabID");
        u("onAudioItemViewBehaviorReport", audioCacheInfo, null);
        oo4.d dVar = oo4.d.f347197a;
        android.os.Bundle bundle2 = this.f338770a;
        java.lang.String str = this.f338774e;
        java.lang.String str2 = this.f338775f;
        if (audioCacheInfo == null) {
            return;
        }
        int i17 = audioCacheInfo.f155719p;
        java.lang.String str3 = i17 == 15 || i17 == 16 ? "bgm_panel_soundtrack" : "bgm_panel_song";
        java.util.Map e17 = dVar.e(str3, audioCacheInfo);
        e17.put("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(audioCacheInfo.f155719p)));
        int i18 = audioCacheInfo.f155719p;
        if (i18 == 15 || i18 == 16) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = audioCacheInfo.f155728y;
            e17.put("soundtrack_feedid", pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
            e17.put("soundtrack_scene", java.lang.Integer.valueOf(audioCacheInfo.f155719p == 16 ? 2 : 1));
            e17.put("card_index", java.lang.Integer.valueOf(audioCacheInfo.f155726w + 1));
            dVar.j(25496, str3, bundle2, e17, view, z18, z17);
            return;
        }
        e17.put("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(i18)));
        if (kotlin.jvm.internal.o.b(ya.a.SEARCH, sourceTabID)) {
            if (str == null) {
                str = "";
            }
            e17.put("search_word", str);
            if (str2 == null) {
                str2 = "";
            }
            e17.put("search_sessionid", str2);
        }
        dVar.j(25496, str3, bundle2, e17, view, z18, z17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void l(android.view.View view) {
        oo4.d.f347197a.j(0, "bgm_panel_search_half_screen", this.f338770a, (r17 & 8) != 0 ? kz5.q0.f314001d : null, (r17 & 16) != 0 ? null : view, (r17 & 32) != 0 ? false : false, (r17 & 64) != 0 ? false : true);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void m(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        u("onAudioSelected", audioCacheInfo, null);
        this.f338773d = audioCacheInfo;
        if (audioCacheInfo == null) {
            nu3.i iVar = nu3.i.f340218a;
            iVar.f("KEY_MUSIC_ID_STRING");
            iVar.f("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING");
            iVar.f("KEY_SOUND_TRACK_TYPE");
            iVar.f("KEY_MUSIC_SESSION_BUFFER");
        } else {
            nu3.i iVar2 = nu3.i.f340218a;
            iVar2.n("KEY_MUSIC_ID_STRING", audioCacheInfo.e());
            r45.pg4 pg4Var = audioCacheInfo.A;
            java.lang.String str = pg4Var != null ? pg4Var.f383024m : null;
            if (str == null) {
                str = "";
            }
            iVar2.n("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", str);
            iVar2.n("KEY_SOUND_TRACK_TYPE", java.lang.Integer.valueOf(audioCacheInfo.f155719p));
            java.lang.String str2 = audioCacheInfo.D;
            iVar2.n("KEY_MUSIC_SESSION_BUFFER", str2 != null ? str2 : "");
            int i17 = audioCacheInfo.f155719p;
            int i18 = 1;
            if (i17 != 7) {
                if (i17 == 8) {
                    i18 = 2;
                } else if (i17 == 18) {
                    i18 = 3;
                } else if (i17 == 12) {
                    i18 = 4;
                } else if (i17 == 13) {
                    i18 = 5;
                } else {
                    if (i17 != 1 && i17 != 2) {
                        i18 = 0;
                    }
                    i18 = i18 != 0 ? 6 : 0;
                }
            }
            iVar2.n("KEY_MUSIC_TYPE_INT", java.lang.Integer.valueOf(i18));
            pv3.n nVar = pv3.n.f358619a;
            com.tencent.mm.plugin.vlog.model.i0 scene = this.f338771b;
            kotlin.jvm.internal.o.g(scene, "scene");
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayFirstFrameEventManager", "subscribeEvent " + scene);
            pv3.n.f358620b.put(scene, this);
            ((nv3.l) ((jz5.n) this.f338777h).getValue()).b((long) audioCacheInfo.f155711e);
        }
        oo4.d.f347197a.g(audioCacheInfo, t(), this.f338774e);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void n(int i17, int i18, long j17) {
        oo4.d dVar = oo4.d.f347197a;
        ((cy1.a) dVar.f()).Bj("bgm_panel", "bgm_panel_request", kz5.c1.m(dVar.d(this.f338770a), kz5.c1.k(new jz5.l("bgm_cnt", java.lang.Integer.valueOf(i18)), new jz5.l("bgm_request_duration", java.lang.Long.valueOf(j17)), new jz5.l("bgm_panel_tab", java.lang.Integer.valueOf(dVar.b(i17))))), 1, false);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void o() {
        this.f338775f = null;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public java.lang.String p() {
        return this.f338775f;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void q(java.lang.String str) {
        this.f338775f = str;
        oo4.d dVar = oo4.d.f347197a;
        android.os.Bundle bundle = this.f338770a;
        if (str == null) {
            str = "";
        }
        dVar.j(25496, "bgm_panel_search_song", bundle, (r17 & 8) != 0 ? kz5.q0.f314001d : kz5.b1.e(new jz5.l("search_sessionid", str)), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void r(int i17) {
        oo4.d.f347197a.i(i17, this.f338770a);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void s(boolean z17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        u("toggleMusic", audioCacheInfo, "isSelected:" + z17);
        this.f338773d = audioCacheInfo;
        oo4.d dVar = oo4.d.f347197a;
        android.os.Bundle bundle = this.f338770a;
        bw5.jr reportInfoScene = t();
        kotlin.jvm.internal.o.g(reportInfoScene, "reportInfoScene");
        java.util.Map e17 = dVar.e("bgm_panel_music", audioCacheInfo);
        e17.put("status", java.lang.Integer.valueOf(audioCacheInfo != null ? 1 : 0));
        dVar.j(25496, "bgm_panel_music", bundle, (r17 & 8) != 0 ? kz5.q0.f314001d : e17, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
        r45.ej2 c17 = dVar.c(reportInfoScene);
        c17.set(4, java.lang.Integer.valueOf(z17 ? 1 : 0));
        dVar.l(reportInfoScene, c17);
    }

    public final bw5.jr t() {
        return (bw5.jr) ((jz5.n) this.f338776g).getValue();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void toggleLyrics(boolean z17) {
        u("toggleLyrics", this.f338773d, "isSelected:" + z17);
        oo4.d dVar = oo4.d.f347197a;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f338773d;
        android.os.Bundle bundle = this.f338770a;
        bw5.jr reportInfoScene = t();
        kotlin.jvm.internal.o.g(reportInfoScene, "reportInfoScene");
        java.util.Map e17 = dVar.e("bgm_panel_lyric", audioCacheInfo);
        e17.put("status", java.lang.Integer.valueOf(z17 ? 1 : 0));
        dVar.j(25496, "bgm_panel_lyric", bundle, (r17 & 8) != 0 ? kz5.q0.f314001d : e17, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
        r45.ej2 c17 = dVar.c(reportInfoScene);
        c17.set(5, java.lang.Integer.valueOf(z17 ? 1 : 0));
        dVar.l(reportInfoScene, c17);
    }

    public final void u(java.lang.String str, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, java.lang.String str2) {
        r45.pg4 pg4Var;
        r45.mh4 mh4Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(str);
        sb6.append("] selected:");
        sb6.append(audioCacheInfo != null);
        sb6.append(" reportInfoScene:");
        sb6.append(t());
        sb6.append(" itemType:");
        sb6.append(audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.I) : null);
        sb6.append(" index:");
        sb6.append(audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155726w) : null);
        sb6.append(" songId:");
        sb6.append(audioCacheInfo != null ? audioCacheInfo.e() : null);
        sb6.append(" musicId=");
        sb6.append(audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155711e) : null);
        sb6.append(" listenId:");
        sb6.append(pm0.v.u((audioCacheInfo == null || (mh4Var = audioCacheInfo.f155710d) == null) ? 0L : mh4Var.f380524w));
        sb6.append(" mjMusicId=");
        sb6.append(audioCacheInfo != null ? audioCacheInfo.C : null);
        sb6.append(" finderFeedId=");
        sb6.append((audioCacheInfo == null || (pg4Var = audioCacheInfo.A) == null) ? null : pg4Var.f383024m);
        sb6.append(" source=");
        sb6.append(audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155719p) : null);
        sb6.append(' ');
        if (str2 == null) {
            str2 = null;
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MusicPickerReportCallback", sb6.toString());
    }
}
