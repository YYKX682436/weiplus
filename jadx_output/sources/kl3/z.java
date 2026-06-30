package kl3;

/* loaded from: classes11.dex */
public class z extends kl3.o implements kl3.i, kl3.k {

    /* renamed from: d, reason: collision with root package name */
    public int f308855d;

    /* renamed from: i, reason: collision with root package name */
    public kl3.j f308860i;

    /* renamed from: j, reason: collision with root package name */
    public nl3.b f308861j;

    /* renamed from: k, reason: collision with root package name */
    public nl3.a f308862k;

    /* renamed from: l, reason: collision with root package name */
    public nl3.c f308863l;

    /* renamed from: m, reason: collision with root package name */
    public nl3.d f308864m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f308865n;

    /* renamed from: c, reason: collision with root package name */
    public int f308854c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f308856e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.model.notification.g f308857f = new com.tencent.mm.plugin.music.model.notification.g();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f308858g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f308859h = true;

    /* renamed from: o, reason: collision with root package name */
    public f25.m0 f308866o = null;

    public ql3.a A(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        ql3.a y07 = ll3.o2.Ai().y0(str);
        if (y07 != null) {
            ((java.util.ArrayList) this.f308856e).add(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getMusicByDBMusicId, music data exist in db , id:%s", str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "getMusicByDBMusicId, music data not exist in db , id:%s", str);
        }
        return y07;
    }

    public final kl3.g B() {
        ((ll3.o2) ((cl3.e) i95.n0.c(cl3.e.class))).requireAccountInitialized();
        return this.f308836a;
    }

    public void C() {
        if (this.f308854c == 1) {
            return;
        }
        int i17 = this.f308855d + 1;
        this.f308855d = i17;
        this.f308855d = i17 % ((java.util.ArrayList) this.f308856e).size();
        ((kl3.t) B()).m(true);
        ((kl3.t) B()).n(null);
    }

    public void D() {
        if (this.f308854c == 1) {
            return;
        }
        int i17 = this.f308855d;
        java.util.List list = this.f308856e;
        int size = (i17 + ((java.util.ArrayList) list).size()) - 1;
        this.f308855d = size;
        this.f308855d = size % ((java.util.ArrayList) list).size();
        ((kl3.t) B()).m(true);
        ((kl3.t) B()).n(null);
    }

    public void E(ql3.a aVar, boolean z17, boolean z18) {
        if (aVar == null) {
            return;
        }
        if (this.f308861j != null) {
            gm0.j1.n().f273288b.d(this.f308861j);
            this.f308861j = null;
        }
        if (aVar.field_songId > 0 || !android.text.TextUtils.isEmpty(aVar.field_songMId)) {
            this.f308861j = new nl3.b(aVar, z17, z18);
            gm0.j1.n().f273288b.g(this.f308861j);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "can't get songId and mid is empty");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10911, "1");
        }
    }

    @Override // kl3.o, kl3.e
    public void a() {
        if (!this.f308859h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "abandonFocus: not support AudioFocusService");
            super.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "abandonFocus: support AudioFocusService");
        if (this.f308866o != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f308866o);
            this.f308866o = null;
        }
    }

    @Override // kl3.o, kl3.e
    public void b(b21.r rVar) {
        if (tl3.a.f420296a == null) {
            return;
        }
        tl3.a.f420296a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f420297b, "readyToPlay", "1.0", "0"}));
        tl3.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // kl3.o, kl3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(java.lang.String r4) {
        /*
            r3 = this;
            com.tencent.mm.sdk.platformtools.r2 r0 = ml3.d.f328405a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L9
            goto L18
        L9:
            com.tencent.mm.sdk.platformtools.r2 r0 = ml3.d.f328405a
            boolean r1 = r0.k(r4)
            if (r1 == 0) goto L18
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            r4 = r0
        L1d:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r1 = "MicroMsg.Music.MusicWechatPrivateLogic"
            java.lang.String r2 = "contain shake tag playUrl:%s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            boolean r0 = ml3.d.a(r4)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "wxshakemusic"
            int r0 = r4.lastIndexOf(r0)
            r1 = 1
            if (r0 <= r1) goto L3e
            r2 = 0
            int r0 = r0 - r1
            java.lang.String r4 = r4.substring(r2, r0)
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kl3.z.c(java.lang.String):java.lang.String");
    }

    @Override // kl3.o, kl3.e
    public b21.r d(b21.r rVar) {
        boolean z17;
        java.lang.String a17 = xl3.c.a(rVar);
        synchronized (this.f308858g) {
            if (this.f308856e != null) {
                int i17 = 0;
                while (true) {
                    if (i17 >= ((java.util.ArrayList) this.f308856e).size()) {
                        z17 = false;
                        break;
                    }
                    if (a17.equals(((java.util.ArrayList) this.f308856e).get(i17))) {
                        this.f308855d = i17;
                        z17 = true;
                        break;
                    }
                    i17++;
                }
                if (((java.util.ArrayList) this.f308856e).size() > 1 && rVar.A) {
                    this.f308854c = 2;
                }
            } else {
                z17 = false;
            }
        }
        if (z17) {
            return o();
        }
        synchronized (this.f308858g) {
            ((java.util.ArrayList) this.f308856e).clear();
            ((java.util.ArrayList) this.f308856e).add(xl3.c.a(rVar));
        }
        this.f308855d = 0;
        ll3.o2.Ai().J0(rVar);
        if (this.f308854c != 2) {
            return rVar;
        }
        s75.d.b(new kl3.x(this, null), "music_get_list_task");
        return rVar;
    }

    @Override // kl3.o, kl3.e
    public void e(b21.r rVar) {
        if (pl3.c.f356701d > 0) {
            pl3.c.f356700c = (int) (pl3.c.f356700c + ((java.lang.System.currentTimeMillis() - pl3.c.f356701d) / 1000));
            pl3.c.f356701d = 0L;
        }
        if (tl3.a.f420296a == null) {
            return;
        }
        tl3.a.f420296a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f420297b, "paused", "1.0", java.lang.String.valueOf(b21.m.a().f17338b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public void f(b21.r rVar) {
        pl3.c.d();
        tl3.a.c();
    }

    @Override // kl3.o, kl3.e
    public b21.r g(b21.r rVar) {
        if (rVar == null && ((java.util.ArrayList) this.f308856e).size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper is null && musicList's size is 0");
            return null;
        }
        if (rVar == null) {
            return o();
        }
        synchronized (this.f308858g) {
            ((java.util.ArrayList) this.f308856e).clear();
            ((java.util.ArrayList) this.f308856e).add(xl3.c.a(rVar));
        }
        this.f308855d = 0;
        ll3.o2.Ai().J0(rVar);
        if (this.f308854c != 2) {
            return rVar;
        }
        s75.d.b(new kl3.x(this, null), "music_get_list_task");
        return rVar;
    }

    @Override // kl3.e
    public java.lang.String h() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i("wcf://QQMusicCache/", true);
        com.tencent.mm.vfs.w6.u("wcf://QQMusicCache/");
        return i17;
    }

    @Override // kl3.o, kl3.e
    public void i(b21.r rVar) {
        super.i(rVar);
        ll3.o2.Ai().J0(rVar);
    }

    @Override // kl3.o, kl3.e
    public void init() {
        this.f308857f.a();
    }

    @Override // kl3.o, kl3.e
    public boolean j(int i17) {
        int i18 = ol3.a.f346148a;
        return true;
    }

    @Override // kl3.o, kl3.e
    public void k(b21.r rVar) {
        if (rVar != null) {
            com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct();
            tl3.a.f420296a = musicPlayReportStruct;
            musicPlayReportStruct.f59427d = musicPlayReportStruct.b("SessionId", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct2 = tl3.a.f420296a;
            musicPlayReportStruct2.f59434k = musicPlayReportStruct2.b("Appid", rVar.f17358t, true);
            try {
                com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct3 = tl3.a.f420296a;
                java.lang.String str = rVar.f17352n;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                musicPlayReportStruct3.f59431h = musicPlayReportStruct3.b("DataUrl", fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c), true);
                com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct4 = tl3.a.f420296a;
                java.lang.String str3 = rVar.f17349h;
                if (str3 == null) {
                    str3 = "";
                }
                musicPlayReportStruct4.f59429f = musicPlayReportStruct4.b("Singer", fp.s0.b(str3, com.tencent.mapsdk.internal.rv.f51270c), true);
                com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct5 = tl3.a.f420296a;
                java.lang.String str4 = rVar.f17348g;
                if (str4 == null) {
                    str4 = "";
                }
                musicPlayReportStruct5.f59428e = musicPlayReportStruct5.b("SongName", fp.s0.b(str4, com.tencent.mapsdk.internal.rv.f51270c), true);
                com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct6 = tl3.a.f420296a;
                java.lang.String str5 = rVar.f17354p;
                if (str5 != null) {
                    str2 = str5;
                }
                musicPlayReportStruct6.f59430g = musicPlayReportStruct6.b("WebUrl", fp.s0.b(str2, com.tencent.mapsdk.internal.rv.f51270c), true);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MusicPlayerReporter", e17, "encode properties", new java.lang.Object[0]);
            }
        }
        if (tl3.a.f420296a != null) {
            tl3.a.f420296a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f420297b, "preparing", "1.0", "0"}));
            tl3.a.a();
        }
        if (tl3.a.f420296a == null) {
            return;
        }
        tl3.a.f420296a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f420297b, "buffering", "1.0", java.lang.String.valueOf(b21.m.a().f17338b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public void l(b21.r rVar) {
        if (tl3.a.f420296a == null) {
            return;
        }
        tl3.a.f420296a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f420297b, "seeking", "1.0", java.lang.String.valueOf(b21.m.a().f17338b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public void m(b21.r rVar) {
        pl3.c.d();
        tl3.a.c();
        if (this.f308854c == 2) {
            if (this.f308855d < ((java.util.ArrayList) this.f308856e).size() - 1 || rVar.A) {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
                am.jk jkVar = musicPlayerEvent.f54512g;
                jkVar.f7036b = 15;
                jkVar.f7040f = "";
                musicPlayerEvent.b(android.os.Looper.getMainLooper());
                C();
            }
        }
    }

    @Override // kl3.o, kl3.e
    public void n(b21.r rVar, int i17) {
        pl3.c.d();
    }

    @Override // kl3.o, kl3.e
    public b21.r o() {
        synchronized (this.f308858g) {
            if (((java.util.ArrayList) this.f308856e).size() == 0) {
                return null;
            }
            int size = ((java.util.ArrayList) this.f308856e).size();
            int i17 = this.f308855d;
            if (size <= i17) {
                return null;
            }
            ql3.a y07 = ll3.o2.Ai().y0((java.lang.String) ((java.util.ArrayList) this.f308856e).get(i17));
            if (y07 == null) {
                return null;
            }
            return y07.u0();
        }
    }

    @Override // kl3.o, kl3.e
    public void p(b21.r rVar) {
        pl3.c.d();
        pl3.c.f356701d = java.lang.System.currentTimeMillis();
        ql3.a z17 = z();
        synchronized (pl3.c.class) {
            pl3.c.f356702e = z17;
        }
        com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct = tl3.a.f420296a;
        if (musicPlayReportStruct == null) {
            return;
        }
        musicPlayReportStruct.f59432i = b21.m.a().f17337a;
        tl3.a.f420296a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f420297b, "playing", "1.0", "0"}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public b21.r q(java.util.List list, int i17) {
        if (list == null || list.size() == 0 || i17 >= list.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music wrapper list error");
            return null;
        }
        synchronized (this.f308858g) {
            ((java.util.ArrayList) this.f308856e).clear();
            for (int i18 = 0; i18 < list.size(); i18++) {
                b21.r rVar = (b21.r) list.get(i18);
                ((java.util.ArrayList) this.f308856e).add(xl3.c.a(rVar));
                ll3.o2.Ai().J0(rVar);
            }
        }
        this.f308855d = i17;
        this.f308854c = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "startPlayNewMusicList:%d", java.lang.Integer.valueOf(i17));
        b21.r o17 = o();
        if (o17.D > 0) {
            java.lang.String a17 = xl3.c.a(o17);
            ql3.b Ai = ll3.o2.Ai();
            Ai.getClass();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("startTime", (java.lang.Integer) 0);
            Ai.f364581e.p("Music", contentValues, "musicId=?", new java.lang.String[]{a17});
            ql3.a aVar = (ql3.a) ((lt0.f) Ai.f364580d).get(a17);
            if (aVar != null) {
                aVar.field_startTime = 0;
            }
        }
        return o17;
    }

    @Override // kl3.o, kl3.e
    public void r(b21.r rVar) {
        pl3.c.f356701d = java.lang.System.currentTimeMillis();
    }

    @Override // kl3.e
    public void release() {
        ((java.util.ArrayList) this.f308856e).clear();
        com.tencent.mm.plugin.music.model.notification.g gVar = this.f308857f;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotificationHelper", "uninitMusicPlayerService");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService.class);
        com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
        gVar.f150648a = null;
        gVar.f150650c.dead();
    }

    @Override // kl3.o, kl3.e
    public boolean requestFocus() {
        if (!this.f308859h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "requestFocus: not support AudioFocusService");
            return super.requestFocus();
        }
        if (this.f308866o != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f308866o);
            this.f308866o = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "requestFocus: support AudioFocusService");
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.v.f259114c, new kl3.w(this));
        this.f308866o = m96;
        if (m96 == null || !((g25.e) m96).f267980c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getGainFocus fail");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getGainFocus success");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f3, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013c  */
    @Override // kl3.o, kl3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s(b21.r r15) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kl3.z.s(b21.r):boolean");
    }

    @Override // kl3.o, kl3.e
    public synchronized void t(java.util.List list, boolean z17) {
        if (list != null) {
            if (list.size() != 0) {
                synchronized (this.f308858g) {
                    if (z17) {
                        ((java.util.ArrayList) this.f308856e).clear();
                    }
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        b21.r rVar = (b21.r) it.next();
                        ((java.util.ArrayList) this.f308856e).add(xl3.c.a(rVar));
                        ll3.o2.Ai().J0(rVar);
                    }
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "appendMusicList error");
    }

    @Override // kl3.o, kl3.e
    public void u(b21.r rVar) {
        if (rVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "shake music item is null");
            return;
        }
        synchronized (this.f308858g) {
            ((java.util.ArrayList) this.f308856e).clear();
            ((java.util.ArrayList) this.f308856e).add(xl3.c.a(rVar));
        }
        this.f308855d = 0;
        ll3.o2.Ai().J0(rVar);
    }

    @Override // kl3.o, kl3.e
    public java.net.URL v(java.lang.String str) {
        return new com.tencent.mm.network.m(str).f72068b;
    }

    @Override // kl3.o, kl3.e
    public void w(b21.r rVar) {
        if (tl3.a.f420296a == null) {
            return;
        }
        tl3.a.f420296a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f420297b, "seekEnd", "1.0", java.lang.String.valueOf(b21.m.a().f17338b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public boolean x(int i17) {
        if (i17 != 0 && i17 != 1 && i17 != 4 && i17 != 5 && i17 != 12 && i17 != 14) {
            switch (i17) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public boolean y() {
        return ((java.util.ArrayList) this.f308856e).size() > 0 && this.f308854c == 2;
    }

    public ql3.a z() {
        synchronized (this.f308858g) {
            if (((java.util.ArrayList) this.f308856e).size() == 0) {
                return null;
            }
            int size = ((java.util.ArrayList) this.f308856e).size();
            int i17 = this.f308855d;
            if (size <= i17) {
                return null;
            }
            return ll3.o2.Ai().y0((java.lang.String) ((java.util.ArrayList) this.f308856e).get(i17));
        }
    }
}
