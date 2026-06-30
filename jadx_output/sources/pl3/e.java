package pl3;

/* loaded from: classes15.dex */
public class e implements kl3.h {

    /* renamed from: a, reason: collision with root package name */
    public final pl3.f f356703a = new pl3.f();

    /* renamed from: b, reason: collision with root package name */
    public final pl3.g f356704b = new pl3.g();

    /* renamed from: c, reason: collision with root package name */
    public final pl3.b f356705c = new pl3.b();

    /* renamed from: d, reason: collision with root package name */
    public b21.p f356706d = null;

    public final void A(b21.r rVar, long j17, long j18, long j19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fq5();
        lVar.f70665b = new r45.gq5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/reportmusic";
        lVar.f70667d = 2718;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.fq5 fq5Var = (r45.fq5) a17.f70710a.f70684a;
        r45.nr4 nr4Var = new r45.nr4();
        fq5Var.f374552d = nr4Var;
        b21.p pVar = this.f356706d;
        if (pVar != null) {
            nr4Var.f381616d = pVar.f17342a;
            fq5Var.f374553e = pVar.f17343b;
            this.f356706d = null;
        }
        nr4Var.f381617e = j18 + "";
        fq5Var.f374552d.f381618f = j17 + "";
        com.tencent.mm.modelbase.z2.d(a17, new pl3.d(this), false);
    }

    public void y(b21.r rVar, int i17, int i18) {
        int i19;
        boolean z17;
        boolean z18;
        int i27;
        int i28;
        int i29;
        int i37;
        pl3.b bVar = this.f356705c;
        bVar.getClass();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
        iDKey.SetKey(3);
        iDKey.SetValue(1L);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
        int i38 = rVar.f17345d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerErrIdKeyByMusicType, musicType:" + i38);
        if (i38 == 0) {
            i19 = 60;
        } else if (i38 != 1) {
            switch (i38) {
                case 4:
                    i19 = 62;
                    break;
                case 5:
                    i19 = 63;
                    break;
                case 6:
                    i19 = 64;
                    break;
                case 7:
                    i19 = 5;
                    break;
                case 8:
                    i19 = 65;
                    break;
                case 9:
                    i19 = 66;
                    break;
                default:
                    i19 = 6;
                    break;
            }
        } else {
            i19 = 61;
        }
        iDKey2.SetKey(i19);
        iDKey2.SetValue(1L);
        com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
        iDKey3.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
        if (i17 == -1) {
            iDKey3.SetKey(12);
        } else if (i17 == 6) {
            iDKey3.SetKey(46);
        } else if (i17 == -2) {
            iDKey3.SetKey(13);
        } else if (i17 == 5) {
            iDKey3.SetKey(16);
        } else if (i17 == 4) {
            iDKey3.SetKey(14);
        } else if (i17 == 20) {
            iDKey3.SetKey(11);
        } else if (i17 == 21) {
            iDKey3.SetKey(47);
        } else if (i17 == 19) {
            iDKey3.SetKey(190);
        }
        iDKey3.SetValue(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
        iDKey4.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
        iDKey4.SetValue(1L);
        if (i17 != 19 && (bVar.a() == null || !bVar.a().contains("text/html"))) {
            if (i17 == 21) {
                int i39 = rVar.f17345d;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerPlayErrIdKeyByMusicType, musicType:" + i39);
                if (i39 == 0) {
                    i37 = com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX;
                } else if (i39 == 1) {
                    i37 = 160;
                } else if (i39 != 4) {
                    switch (i39) {
                        case 6:
                            i37 = 162;
                            break;
                        case 7:
                            i37 = 163;
                            break;
                        case 8:
                            i37 = 164;
                            break;
                        case 9:
                            i37 = 165;
                            break;
                        default:
                            i37 = 188;
                            break;
                    }
                } else {
                    i37 = 161;
                }
                iDKey4.SetKey(i37);
                arrayList.add(iDKey4);
            } else if (i17 == -1 || i17 == 6 || i17 == -2 || i17 == 5 || i17 == 4) {
                int i47 = rVar.f17345d;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerNetworkErrIdKeyByMusicType, musicType:" + i47);
                if (i47 == 0) {
                    i29 = 151;
                } else if (i47 == 1) {
                    i29 = 152;
                } else if (i47 != 4) {
                    switch (i47) {
                        case 6:
                            i29 = 154;
                            break;
                        case 7:
                            i29 = 155;
                            break;
                        case 8:
                            i29 = 156;
                            break;
                        case 9:
                            i29 = 157;
                            break;
                        default:
                            i29 = 188;
                            break;
                    }
                } else {
                    i29 = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
                }
                iDKey4.SetKey(i29);
                arrayList.add(iDKey4);
            }
        }
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        arrayList.add(iDKey3);
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "hasStatForHttpErr:%b, hasStatForUrlErr:%b, hasStatForNetworkErr:%b, hasStatForHttpRangeErr:%b, hasStatDownloadExceptionErr:%b", java.lang.Boolean.valueOf(bVar.f356688a), java.lang.Boolean.valueOf(bVar.f356690c), java.lang.Boolean.valueOf(bVar.f356693f), java.lang.Boolean.valueOf(bVar.f356689b), java.lang.Boolean.valueOf(bVar.f356691d));
        if (i17 == -1 && !bVar.f356688a) {
            bVar.f356688a = true;
            jl3.d dVar = bVar.f356697j;
            int i48 = dVar != null ? dVar.f300219o : 0;
            if (i48 == 403) {
                com.tencent.mars.smc.IDKey iDKey5 = new com.tencent.mars.smc.IDKey();
                iDKey5.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                iDKey5.SetValue(1L);
                iDKey5.SetKey(pl3.a.b(700));
                arrayList.add(iDKey5);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.j(arrayList, true, false);
            g0Var.d(14777, 0, java.lang.Integer.valueOf(rVar.f17345d), 1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i48), 0);
        }
        if (i17 == 6 && !bVar.f356689b) {
            bVar.f356689b = true;
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.j(arrayList, true, false);
            g0Var2.d(14777, 0, java.lang.Integer.valueOf(rVar.f17345d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 == -2 && !bVar.f356690c) {
            bVar.f356690c = true;
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.j(arrayList, true, false);
            g0Var3.d(14777, 0, java.lang.Integer.valueOf(rVar.f17345d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 == 5 && !bVar.f356691d) {
            bVar.f356691d = true;
            com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var4.j(arrayList, true, false);
            jl3.d dVar2 = bVar.f356697j;
            g0Var4.d(14777, 0, java.lang.Integer.valueOf(rVar.f17345d), 1, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(dVar2 != null ? dVar2.f300220p : 0));
        }
        if (i17 == 19 && !bVar.f356692e) {
            bVar.f356692e = true;
            com.tencent.mm.plugin.report.service.g0 g0Var5 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var5.j(arrayList, true, false);
            g0Var5.d(14777, 0, java.lang.Integer.valueOf(rVar.f17345d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 == 4 && !bVar.f356693f) {
            bVar.f356693f = true;
            com.tencent.mm.plugin.report.service.g0 g0Var6 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var6.j(arrayList, true, false);
            g0Var6.d(14777, 0, java.lang.Integer.valueOf(rVar.f17345d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 != 20 || bVar.f356694g) {
            z17 = true;
        } else {
            z17 = true;
            bVar.f356694g = true;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(iDKey3);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList2, true, false);
        }
        if (i17 == 21 && !bVar.f356695h && bVar.f356694g) {
            bVar.f356695h = z17;
            if (bVar.a() == null || !bVar.a().contains("text/html")) {
                com.tencent.mars.smc.IDKey iDKey6 = new com.tencent.mars.smc.IDKey();
                iDKey6.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                iDKey6.SetValue(1L);
                iDKey6.SetKey(pl3.a.b(i18));
                arrayList.add(iDKey6);
                switch (i18) {
                    case 704:
                    case 705:
                    case 706:
                        z18 = true;
                        break;
                    default:
                        z18 = false;
                        break;
                }
                if (z18) {
                    com.tencent.mars.smc.IDKey iDKey7 = new com.tencent.mars.smc.IDKey();
                    iDKey7.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                    iDKey7.SetValue(1L);
                    int i49 = rVar.f17345d;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerDecodeErrIdKeyByMusicType, musicType:" + i49);
                    if (i49 == 0) {
                        i28 = 194;
                    } else if (i49 == 1) {
                        i28 = 195;
                    } else if (i49 != 4) {
                        switch (i49) {
                            case 6:
                                i28 = 197;
                                break;
                            case 7:
                                i28 = nd1.d1.CTRL_INDEX;
                                break;
                            case 8:
                                i28 = 199;
                                break;
                            case 9:
                                i28 = 200;
                                break;
                            default:
                                i28 = 188;
                                break;
                        }
                    } else {
                        i28 = 196;
                    }
                    iDKey7.SetKey(i28);
                    arrayList.add(iDKey7);
                }
                i27 = i18;
            } else {
                com.tencent.mars.smc.IDKey iDKey8 = new com.tencent.mars.smc.IDKey();
                iDKey8.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                iDKey8.SetValue(1L);
                i27 = 701;
                iDKey8.SetKey(pl3.a.b(701));
                arrayList.add(iDKey8);
            }
            com.tencent.mm.plugin.report.service.g0 g0Var7 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var7.j(arrayList, true, false);
            g0Var7.d(14777, 0, java.lang.Integer.valueOf(rVar.f17345d), 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), 0);
        }
    }

    public void z() {
        pl3.b bVar = this.f356705c;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "initIdKeyStatDataForMusicPlayer");
        bVar.f356688a = false;
        bVar.f356689b = false;
        bVar.f356690c = false;
        bVar.f356691d = false;
        bVar.f356692e = false;
        bVar.f356693f = false;
        bVar.f356694g = false;
        bVar.f356695h = false;
        bVar.f356696i = false;
    }
}
