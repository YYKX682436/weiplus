package zl3;

/* loaded from: classes11.dex */
public class n implements com.tencent.pigeon.mm_foundation.MusicPlayerApi, io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.pigeon.mm_foundation.MusicCallbackApi f474070d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f474071e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$musicPlayerListener$1 f474072f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.player.base.k f474073g;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$musicPlayerListener$1] */
    public n() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f474072f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$musicPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.pigeon.mm_foundation.FlutterMusicInfo a17;
                com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi;
                com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi2;
                com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi3;
                com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi4;
                com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi5;
                com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi6;
                com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi7;
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.jk jkVar = event.f54512g;
                if (jkVar == null) {
                    return false;
                }
                zl3.n nVar = zl3.n.this;
                nVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "callback: player " + jkVar.f7036b);
                int i17 = jkVar.f7036b;
                if (i17 == 0) {
                    b21.r rVar = jkVar.f7037c;
                    a17 = rVar != null ? nVar.a(rVar) : null;
                    if (a17 == null || (musicCallbackApi = nVar.f474070d) == null) {
                        return false;
                    }
                    musicCallbackApi.onStartPlay(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 1) {
                    b21.r rVar2 = jkVar.f7037c;
                    a17 = rVar2 != null ? nVar.a(rVar2) : null;
                    if (a17 == null || (musicCallbackApi2 = nVar.f474070d) == null) {
                        return false;
                    }
                    musicCallbackApi2.onResumePlay(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 2) {
                    b21.r rVar3 = jkVar.f7037c;
                    a17 = rVar3 != null ? nVar.a(rVar3) : null;
                    if (a17 == null || (musicCallbackApi3 = nVar.f474070d) == null) {
                        return false;
                    }
                    musicCallbackApi3.onStopPlay(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 3) {
                    b21.r rVar4 = jkVar.f7037c;
                    a17 = rVar4 != null ? nVar.a(rVar4) : null;
                    if (a17 == null || (musicCallbackApi4 = nVar.f474070d) == null) {
                        return false;
                    }
                    musicCallbackApi4.onPausePlay(a17, zl3.l.f474068d);
                    return false;
                }
                if (i17 == 7) {
                    b21.r rVar5 = jkVar.f7037c;
                    a17 = rVar5 != null ? nVar.a(rVar5) : null;
                    if (a17 == null || (musicCallbackApi5 = nVar.f474070d) == null) {
                        return false;
                    }
                    musicCallbackApi5.onEndedPlay(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 8) {
                    b21.r rVar6 = jkVar.f7037c;
                    a17 = rVar6 != null ? nVar.a(rVar6) : null;
                    if (a17 == null || (musicCallbackApi6 = nVar.f474070d) == null) {
                        return false;
                    }
                    musicCallbackApi6.onSeeked(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 != 12) {
                    return false;
                }
                b21.r rVar7 = jkVar.f7037c;
                a17 = rVar7 != null ? nVar.a(rVar7) : null;
                if (a17 == null || (musicCallbackApi7 = nVar.f474070d) == null) {
                    return false;
                }
                musicCallbackApi7.onSeeking(a17, new zl3.j(nVar));
                return false;
            }
        };
        this.f474073g = new zl3.m(this);
    }

    public final com.tencent.pigeon.mm_foundation.FlutterMusicInfo a(b21.r rVar) {
        java.lang.String str = rVar.P;
        java.lang.String str2 = rVar.f17349h;
        java.lang.String str3 = rVar.f17358t;
        java.lang.String str4 = rVar.f17354p;
        java.lang.String str5 = rVar.f17351m;
        java.lang.String str6 = rVar.f17355q;
        return new com.tencent.pigeon.mm_foundation.FlutterMusicInfo(rVar.f17346e, null, str2, null, str3, str4, str5, getDuration(), str, str6, null, null, null, null, null, null, 64522, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public boolean canPlayMusic() {
        java.lang.String string;
        boolean z17;
        if (((o95.k) ((ve0.e) i95.n0.c(ve0.e.class))).Ai()) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492319g14);
        } else if (iq.b.a()) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g17);
        } else {
            ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
            if (!vq4.p0.d()) {
                ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
                if (!vq4.p0.c() && !iq.b.H() && !iq.b.d()) {
                    if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
                        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).Bi()).iterator();
                        while (it.hasNext()) {
                            if (((((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next()).f76923f & 1) << 2) > 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "isAnyAppInVOIP, already exist wxa using VOIP");
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g17);
                    } else {
                        string = null;
                        if (iq.b.l(null, false)) {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492316g11);
                        } else {
                            iq.b.r();
                        }
                    }
                }
            }
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g18);
        }
        if (string == null || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return true;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new zl3.k(string));
        return false;
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void clearHistory() {
        com.tencent.mm.sdk.platformtools.o4.M("musicHistory_config" + gm0.j1.b().j()).putString("musicHistory", "");
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public com.tencent.pigeon.mm_foundation.FlutterMusicInfo getCurrentMusic() {
        b21.r b17 = b21.m.b();
        return (b17 == null || !b21.m.c()) ? new com.tencent.pigeon.mm_foundation.FlutterMusicInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : a(b17);
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public com.tencent.pigeon.mm_foundation.FLMusicIntType getCurrentPosition() {
        return new com.tencent.pigeon.mm_foundation.FLMusicIntType(java.lang.Long.valueOf(b21.m.a().f17338b));
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public com.tencent.pigeon.mm_foundation.FLMusicIntType getDuration() {
        return new com.tencent.pigeon.mm_foundation.FLMusicIntType(java.lang.Long.valueOf(b21.m.a().f17337a));
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public java.lang.String getHistory() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("musicHistory_config" + gm0.j1.b().j()).getString("musicHistory", "");
        return string != null ? string : "";
    }

    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion companion = com.tencent.pigeon.mm_foundation.MusicPlayerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        alive();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f474070d = new com.tencent.pigeon.mm_foundation.MusicCallbackApi(binaryMessenger2, null, 2, null);
        com.tencent.mm.plugin.music.player.base.l a17 = kl3.t.g().a();
        com.tencent.mm.plugin.music.player.base.k kVar = this.f474073g;
        rl3.b bVar = (rl3.b) a17;
        if (kVar == null) {
            bVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = bVar.f397235j;
        if (linkedList.contains(kVar)) {
            return;
        }
        linkedList.add(kVar);
    }

    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion companion = com.tencent.pigeon.mm_foundation.MusicPlayerApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.MusicPlayerApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        dead();
        ((rl3.b) kl3.t.g().a()).u(this.f474073g);
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "pause: ");
        b21.m.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r0 == null) goto L17;
     */
    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void play(com.tencent.pigeon.mm_foundation.FlutterMusicInfo r15) {
        /*
            r14 = this;
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.Class<c21.i> r0 = c21.i.class
            i95.m r0 = i95.n0.c(r0)
            c21.i r0 = (c21.i) r0
            ll3.j1 r0 = (ll3.j1) r0
            r0.getClass()
            ll3.b1 r0 = ll3.b1.f319140a
            ll3.e1 r0 = ll3.b1.f319141b
            boolean r0 = r0.u()
            r1 = 1
            if (r0 == 0) goto L20
            ll3.q0.b(r1)
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "play "
            r0.<init>(r2)
            java.lang.String r2 = r15.getMusicId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.FlutterMusicPlayerPlugin"
            com.tencent.mars.xlog.Log.i(r2, r0)
            java.lang.String r0 = r15.getMusicId()
            if (r0 == 0) goto L51
            java.lang.String r2 = r15.getMusicId()
            if (r2 == 0) goto L4b
            int r2 = r2.length()
            if (r2 <= 0) goto L4a
            goto L4b
        L4a:
            r1 = 0
        L4b:
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r0 != 0) goto L66
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r15.getMid()
            r0.append(r1)
            java.lang.String r1 = "_send_music_in_chat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L66:
            r8 = r0
            r45.xs4 r0 = new r45.xs4
            r0.<init>()
            java.lang.String r1 = r15.getCoverUrl()
            r2 = 13
            r0.set(r2, r1)
            java.lang.String r1 = r15.getCoverUrl()
            r2 = 16
            r0.set(r2, r1)
            java.lang.String r1 = r15.getSongName()
            r2 = 14
            r0.set(r2, r1)
            java.lang.String r1 = r15.getLyric()
            r2 = 15
            r0.set(r2, r1)
            java.lang.String r1 = r15.getMid()
            r2 = 11
            r0.set(r2, r1)
            java.lang.String r1 = r15.getCoverUrl()
            r2 = 2
            r0.set(r2, r1)
            b21.t r13 = b21.t.a(r8, r0)
            r1 = 15
            java.lang.String r2 = r15.getCoverUrl()
            java.lang.String r3 = r15.getSongName()
            java.lang.String r0 = r15.getSinger()
            java.lang.String r4 = ""
            if (r0 != 0) goto Lb8
            r0 = r4
        Lb8:
            java.lang.String r5 = r15.getWebUrl()
            if (r5 != 0) goto Lbf
            r5 = r4
        Lbf:
            java.lang.String r6 = ""
            java.lang.String r7 = r15.getDataUrl()
            gm0.b0 r4 = gm0.j1.u()
            java.lang.String r9 = r4.d()
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = r15.getAppid()
            r4 = r0
            b21.r r15 = b21.u.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r14.f474071e
            r15.N = r0
            b21.m.i(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zl3.n.play(com.tencent.pigeon.mm_foundation.FlutterMusicInfo):void");
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void resume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "resume: ");
        b21.m.g();
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void seek(com.tencent.pigeon.mm_foundation.FLMusicIntType time) {
        kotlin.jvm.internal.o.g(time, "time");
        java.lang.Long value = time.getValue();
        b21.m.h(value != null ? (int) value.longValue() : 0);
    }

    @Override // com.tencent.pigeon.mm_foundation.MusicPlayerApi
    public void stop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "stop: ");
        b21.m.j();
    }
}
