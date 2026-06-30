package com.tencent.mm.plugin.priority.model.c2c.img;

/* loaded from: classes12.dex */
public class c implements k70.w {

    /* renamed from: e, reason: collision with root package name */
    public final int f153174e;

    /* renamed from: n, reason: collision with root package name */
    public final int f153180n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f153181o;

    /* renamed from: d, reason: collision with root package name */
    public long f153173d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f153175f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153176g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f153177h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f153178i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f153179m = 0;

    public c() {
        this.f153174e = 0;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent>(a0Var) { // from class: com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader$1
            {
                this.__eventId = -27874186;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent) {
                java.lang.String str;
                com.tencent.mm.autogen.events.PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent2 = pauseAutoGetBigImgEvent;
                if (oq3.k.f347394a.c(1, pauseAutoGetBigImgEvent2.f54607g.f6173b) == 0) {
                    am.ao aoVar = pauseAutoGetBigImgEvent2.f54607g;
                    int i17 = aoVar.f6172a ? 1 : -1;
                    com.tencent.mm.plugin.priority.model.c2c.img.c cVar = com.tencent.mm.plugin.priority.model.c2c.img.c.this;
                    int i18 = cVar.f153175f + i17;
                    cVar.f153175f = i18;
                    if (i18 < 0) {
                        cVar.f153175f = 0;
                        com.tencent.mars.xlog.Log.e("MicroMsg.Priority.C2CImgAutoDownloader", "pauseCnt < 0");
                    }
                    if (cVar.f153175f == 0) {
                        cVar.f153176g = "";
                    } else {
                        if (aoVar.f6172a) {
                            str = aoVar.f6173b;
                            java.lang.String str2 = cVar.f153176g;
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            if (str == null) {
                                str = str2;
                            }
                        } else {
                            str = cVar.f153176g;
                        }
                        cVar.f153176g = str;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "req pause: %b count: %d talker %s", java.lang.Boolean.valueOf(aoVar.f6172a), java.lang.Integer.valueOf(cVar.f153175f), cVar.f153176g);
                    cVar.d();
                }
                return false;
            }
        };
        this.f153181o = iListener;
        this.f153180n = android.os.Process.myUid();
        iListener.alive();
        this.f153174e = com.tencent.mm.R.drawable.bzt;
    }

    public void a(long j17, long j18, boolean z17) {
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "imglocalId " + j17 + " msglocalid " + j18 + " false");
            return;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
        long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c17.m(u3Var, null), 0L);
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) android.text.format.DateFormat.format("M", java.lang.System.currentTimeMillis()));
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(k17 + 1));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG, java.lang.Long.valueOf(E1));
    }

    public boolean b() {
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return false;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(11);
        return i17 == 1 ? calendar.get(12) >= java.lang.Math.abs(gm0.j1.b().h()) % 30 : i17 >= 2 && i17 <= 6;
    }

    public boolean c() {
        if (this.f153173d != 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(this.f153176g, this.f153173d);
            if (T1 != null) {
                if (((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(T1.f322633a, new com.tencent.mm.plugin.msg.MsgIdTalker(this.f153173d, this.f153176g), T1.f322640h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        if (this.f153173d != 0) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(this.f153176g, this.f153173d);
            if (T1 != null) {
                if (((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(T1.f322633a, new com.tencent.mm.plugin.msg.MsgIdTalker(this.f153173d, this.f153176g), T1.f322640h)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d", java.lang.Long.valueOf(this.f153173d));
                    return;
                }
            }
            this.f153173d = 0L;
            if (T1.f322651s == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Already Downloaded, Force Cancel curMsgId %d", 0L);
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.requireAccountInitialized();
                nVar.f265530o.f(this.f153173d, 5);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Not Downloaded, Force Cancel curMsgId %d", 0L);
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.requireAccountInitialized();
                nVar2.f265530o.f(this.f153173d, 1);
            }
        }
        fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar3.requireAccountInitialized();
        nVar3.f265536u.a(new com.tencent.mm.plugin.priority.model.c2c.img.a(this, null));
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        if (i19 == 0 && i27 == 0) {
            a(j17, j18, true);
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, true, false);
            jx3.f.INSTANCE.idkeyStat(957L, 54L, 1L, false);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Priority.C2CImgAutoDownloader", "img " + j17 + "msgLocalId " + j18 + " download failed");
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, false, false);
            jx3.f.INSTANCE.idkeyStat(957L, 53L, 1L, false);
        }
        this.f153173d = 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "normal download mode check network stat");
        this.f153177h = true;
        int i28 = this.f153180n;
        this.f153178i = android.net.TrafficStats.getUidRxBytes(i28);
        this.f153179m = android.net.TrafficStats.getUidTxBytes(i28);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        kq3.l lVar = nVar.f265536u;
        com.tencent.mm.plugin.priority.model.c2c.img.b bVar = new com.tencent.mm.plugin.priority.model.c2c.img.b(this);
        kq3.k kVar = lVar.f311279b;
        if (kVar != null) {
            lVar.f311279b.sendMessageDelayed(kVar.obtainMessage(1, bVar), 1000L);
        }
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "onImgTaskCanceled %d", java.lang.Long.valueOf(j18));
        this.f153173d = 0L;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, false, true);
        jx3.f.INSTANCE.idkeyStat(957L, 57L, 1L, false);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
