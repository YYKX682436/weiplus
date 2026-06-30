package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.model.silent_download.r f140457d = null;

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.model.silent_download.p f140458e = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f140459f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.app.s2 f140460g = new com.tencent.mm.plugin.game.model.silent_download.o();

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f140461h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f140462i;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f140461h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$2
            {
                this.__eventId = 1248113810;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent gameSilentDownloadNotifyEvent) {
                am.ye yeVar = gameSilentDownloadNotifyEvent.f54371g;
                int i17 = yeVar.f8454a;
                if (i17 == 2) {
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_SILENT_DOWNLOAD_TIME_LONG;
                    if (com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) > 600) {
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                        m43.c.b().a("game_silent_download", new com.tencent.mm.plugin.game.model.silent_download.x(com.tencent.mm.plugin.game.model.silent_download.b0.f140446a, false));
                    }
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.r0.i().u();
                } else if (i17 == 3) {
                    java.lang.String str = yeVar.f8455b;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mm.plugin.game.model.silent_download.v Zi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi();
                        Zi.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadStorage", "deleteAllItem ret:%b", java.lang.Boolean.valueOf(Zi.execSQL("GameSilentDownload", java.lang.String.format("delete from %s", "GameSilentDownload"))));
                    } else {
                        com.tencent.mm.plugin.game.model.silent_download.n nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
                        nVar.field_appId = str;
                        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().delete(nVar, new java.lang.String[0]);
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "delete silent download, appid:%s", str);
                    }
                } else if (i17 == 4) {
                    java.lang.String str2 = yeVar.f8455b;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                        h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(str2);
                        if (d17 != null) {
                            long j17 = d17.field_downloadId;
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.tencent.mm.plugin.downloader.model.r0.i().t(j17);
                            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
                            long j18 = d17.field_downloadId;
                            ((uz.p1) q1Var).getClass();
                            com.tencent.mm.plugin.downloader.model.m0.i(j18);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownload.GameDownloadHelper", "delete downloadInfo in DB. appId:%s", str2);
                        }
                    }
                }
                return false;
            }
        };
        f140462i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameSilentDownloadEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$3
            {
                this.__eventId = 1688812315;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameSilentDownloadEvent gameSilentDownloadEvent) {
                java.lang.String str = gameSilentDownloadEvent.f54370g.f8376a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "GameSilentDownloadEvent, appid is null!");
                } else {
                    com.tencent.mm.plugin.game.model.silent_download.u.c(str, 7, 0);
                    com.tencent.mm.plugin.game.model.silent_download.n nVar = new com.tencent.mm.plugin.game.model.silent_download.n();
                    nVar.field_appId = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "cancel silentDownloadTask, appid:%s, ret:%b", str, java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Zi().delete(nVar, new java.lang.String[0])));
                }
                return false;
            }
        };
    }

    public s() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent instanceof com.tencent.mm.autogen.events.GameSilentDownloadEvent) {
            f140462i.callback((com.tencent.mm.autogen.events.GameSilentDownloadEvent) iEvent);
            return false;
        }
        if (!(iEvent instanceof com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent)) {
            return false;
        }
        f140461h.callback((com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent) iEvent);
        return false;
    }
}
