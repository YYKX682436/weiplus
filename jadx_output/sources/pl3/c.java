package pl3;

/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f356698a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f356699b;

    /* renamed from: c, reason: collision with root package name */
    public static int f356700c;

    /* renamed from: d, reason: collision with root package name */
    public static long f356701d;

    /* renamed from: e, reason: collision with root package name */
    public static ql3.a f356702e;

    public static void a(b21.r rVar, boolean z17) {
        int i17;
        int i18;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicReportUtil", "idKeyReportMusicPlayerSum music is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
        iDKey.SetKey(0);
        iDKey.SetValue(1L);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
        iDKey2.SetValue(1L);
        com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
        iDKey3.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
        iDKey3.SetValue(1L);
        if (z17) {
            iDKey3.SetKey(10);
        } else {
            if (xl3.d.a(rVar)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14174, 2, java.lang.Integer.valueOf(rVar.f17345d));
                return;
            }
            if (xl3.d.b(rVar.f17345d)) {
                iDKey3.SetKey(2);
                int i19 = rVar.f17345d;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerSumidKeyByMusicType, musicType:" + i19);
                if (i19 == 0) {
                    i18 = 117;
                } else if (i19 != 1) {
                    switch (i19) {
                        case 4:
                            i18 = 119;
                            break;
                        case 5:
                            i18 = 120;
                            break;
                        case 6:
                            i18 = 121;
                            break;
                        case 7:
                            i18 = 122;
                            break;
                        case 8:
                            i18 = 123;
                            break;
                        case 9:
                            i18 = 124;
                            break;
                        case 10:
                            i18 = 125;
                            break;
                        case 11:
                            i18 = 126;
                            break;
                        default:
                            i18 = 127;
                            break;
                    }
                } else {
                    i18 = 118;
                }
                iDKey2.SetKey(i18);
                arrayList.add(iDKey2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14174, 1, java.lang.Integer.valueOf(rVar.f17345d));
                if (ml3.d.a(rVar.Q)) {
                    com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
                    iDKey4.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                    iDKey4.SetKey(216);
                    iDKey4.SetValue(1L);
                    arrayList.add(iDKey4);
                }
            } else {
                iDKey3.SetKey(1);
                int i27 = rVar.f17345d;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerSumidKeyByMusicType, musicType:" + i27);
                if (i27 == 0) {
                    i17 = 105;
                } else if (i27 != 1) {
                    switch (i27) {
                        case 4:
                            i17 = 107;
                            break;
                        case 5:
                            i17 = 108;
                            break;
                        case 6:
                            i17 = 109;
                            break;
                        case 7:
                            i17 = 110;
                            break;
                        case 8:
                            i17 = 111;
                            break;
                        case 9:
                            i17 = 112;
                            break;
                        default:
                            i17 = 113;
                            break;
                    }
                } else {
                    i17 = 106;
                }
                iDKey2.SetKey(i17);
                arrayList.add(iDKey2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14174, 0, java.lang.Integer.valueOf(rVar.f17345d));
                if (ml3.d.a(rVar.Q)) {
                    com.tencent.mars.smc.IDKey iDKey5 = new com.tencent.mars.smc.IDKey();
                    iDKey5.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                    iDKey5.SetKey(215);
                    iDKey5.SetValue(1L);
                    arrayList.add(iDKey5);
                }
            }
        }
        arrayList.add(iDKey);
        arrayList.add(iDKey3);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
    }

    public static final void b(int i17, int i18) {
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13232, z17.field_musicId, z17.field_songName, z17.field_songAlbum, java.lang.Integer.valueOf(z17.field_songId), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), z17.field_songSinger, z17.field_appId);
        }
    }

    public static void c(int i17, ql3.a aVar) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat music is null, err");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat scene:%d, action:%d, src:%s, title:%s, singer:%s", java.lang.Integer.valueOf(aVar.field_musicType), java.lang.Integer.valueOf(i17), aVar.field_songWifiUrl, aVar.field_songName, aVar.field_songSinger);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15106, java.lang.Integer.valueOf(aVar.field_musicType), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), aVar.field_songWifiUrl, aVar.field_songName, aVar.field_songSinger);
        }
    }

    public static final synchronized void d() {
        synchronized (pl3.c.class) {
            if (f356702e != null) {
                if (f356701d > 0) {
                    f356700c = (int) (f356700c + ((java.lang.System.currentTimeMillis() - f356701d) / 1000));
                    f356701d = 0L;
                }
                ql3.a aVar = f356702e;
                java.lang.String str = aVar.field_musicId;
                java.lang.String str2 = aVar.field_songSinger;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[11];
                ql3.a aVar2 = f356702e;
                objArr[0] = aVar2.field_musicId;
                int i17 = 1;
                objArr[1] = aVar2.field_songName;
                objArr[2] = aVar2.field_songAlbum;
                objArr[3] = java.lang.Integer.valueOf(aVar2.field_songId);
                objArr[4] = 0;
                objArr[5] = java.lang.Integer.valueOf(f356700c);
                objArr[6] = java.lang.Integer.valueOf(f356698a ? 1 : 2);
                if (!f356699b) {
                    i17 = 2;
                }
                objArr[7] = java.lang.Integer.valueOf(i17);
                objArr[8] = 0;
                ql3.a aVar3 = f356702e;
                objArr[9] = aVar3.field_songSinger;
                objArr[10] = aVar3.field_appId;
                g0Var.d(13044, objArr);
            }
            f356702e = null;
            f356698a = false;
            f356699b = false;
            f356700c = 0;
            f356701d = 0L;
        }
    }

    public static final void e(int i17) {
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicReportUtil", "ReportMusicPlayerShareStat ShareType:%d, MusicId:%s, MusicTitle:%s, Singer:%s, AppId:%s", java.lang.Integer.valueOf(i17), z17.field_musicId, z17.field_songName, z17.field_songSinger, z17.field_appId);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12836, java.lang.Integer.valueOf(i17), z17.field_musicId, z17.field_songName, z17.field_songSinger, z17.field_appId);
        }
    }

    public static final void f(int i17, int i18, int i19) {
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13042, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), z17.field_musicId, z17.field_songName, z17.field_songAlbum, java.lang.Integer.valueOf(z17.field_songId), java.lang.Integer.valueOf(i19), z17.field_songSinger, z17.field_appId);
        }
    }

    public static final void g(int i17) {
        b21.r b17;
        if (i17 != 2 || (b17 = b21.m.b()) == null) {
            return;
        }
        z30.y yVar = (z30.y) i95.n0.c(z30.y.class);
        long V = com.tencent.mm.sdk.platformtools.t8.V(b17.E, 0L);
        ((y30.w) yVar).getClass();
        o72.v2.d(V, 1, 0);
    }

    public static final void h(int i17) {
        b21.r b17;
        if (i17 != 2 || (b17 = b21.m.b()) == null) {
            return;
        }
        z30.y yVar = (z30.y) i95.n0.c(z30.y.class);
        long V = com.tencent.mm.sdk.platformtools.t8.V(b17.E, 0L);
        ((y30.w) yVar).getClass();
        o72.v2.d(V, 0, 0);
    }
}
