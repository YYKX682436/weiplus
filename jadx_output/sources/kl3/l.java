package kl3;

/* loaded from: classes16.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        b21.r rVar;
        b21.o a17;
        b21.r rVar2;
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = (com.tencent.mm.autogen.events.MusicActionEvent) iEvent;
        ((gm0.c) ((c01.w7) i95.n0.c(c01.w7.class))).getClass();
        if (gm0.j1.a()) {
            if (kl3.t.f308843g != null) {
                am.gk gkVar = musicActionEvent.f54509g;
                int i17 = gkVar.f6770a;
                if (i17 == 13) {
                    kl3.h hVar = (kl3.h) sl3.b.b(kl3.h.class);
                    if (hVar != null) {
                        b21.p pVar = gkVar.f6777h;
                        pl3.e eVar = (pl3.e) hVar;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatReportService", "reportMusicPlayerTime");
                        if (pVar != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatReportService", "MusicReportInfo h5CurrentMusicIDOfReport:%s, h5ReportListIDOfReport:%s", pVar.f17342a, pVar.f17343b);
                        }
                        b21.r j17 = kl3.t.g().j();
                        if (kl3.t.g().a().i() && j17 != null && j17.f17345d == 10) {
                            eVar.f356706d = pVar;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatReportService", "H5 music is playing, not report first");
                        } else {
                            eVar.f356706d = pVar;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatReportService", "report music info");
                            eVar.A(null, 0L, 0L, 0L);
                        }
                    }
                } else if (i17 != 16) {
                    am.hk hkVar = musicActionEvent.f54510h;
                    switch (i17) {
                        case -3:
                            hkVar.f6838b = kl3.t.g().a().i();
                            break;
                        case -2:
                            hkVar.f6837a = kl3.t.g().j();
                            break;
                        case -1:
                            kl3.t.g().o();
                            break;
                        case 0:
                            kl3.t.g().n(gkVar.f6771b);
                            break;
                        case 1:
                            kl3.t.g().a().d();
                            break;
                        case 2:
                            kl3.t.g().a().resume();
                            break;
                        case 3:
                            kl3.t.g().f308844e.u(gkVar.f6771b);
                            break;
                        case 4:
                            kl3.t g17 = kl3.t.g();
                            java.util.List list = gkVar.f6772c;
                            int i18 = gkVar.f6773d;
                            g17.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusicList");
                            b21.r j18 = g17.j();
                            b21.r q17 = g17.f308844e.q(list, i18);
                            if (j18 != null && q17 != null && com.tencent.mm.sdk.platformtools.t8.D0(j18.f17346e, q17.f17346e) && (a17 = b21.m.a()) != null && com.tencent.tav.core.AssetExtension.SCENE_PLAY.equals(a17.f17341e)) {
                                g17.f308839a.i();
                                rl3.t tVar = g17.f308840b;
                                if (tVar.i() && (rVar2 = tVar.f397277k) != null && rVar2.a(q17)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "updateCurrentMusicWrapper src:%s", tVar.f397283q);
                                    double d17 = q17.K;
                                    if (d17 > 0.0d && d17 != tVar.f397277k.K) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "setPlaybackRate playbackRate:%f", java.lang.Double.valueOf(d17));
                                        tVar.B((float) q17.K);
                                        tVar.f397277k.K = q17.K;
                                    }
                                    float f17 = q17.L;
                                    if (f17 >= 0.0f && f17 != tVar.f397277k.L) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "setVolume volume:%f", java.lang.Float.valueOf(f17));
                                        float f18 = q17.L;
                                        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = tVar.f397278l;
                                        if (commonPlayer != null && f18 >= 0.0f) {
                                            commonPlayer.setVolume(f18, f18);
                                        }
                                        tVar.f397277k.L = q17.L;
                                    }
                                }
                                g17.f308841c.i();
                                g17.f308844e.i(q17);
                                break;
                            } else {
                                g17.h(q17);
                                break;
                            }
                            break;
                        case 5:
                            kl3.t.g().f308844e.t(gkVar.f6772c, gkVar.f6774e);
                            break;
                        case 6:
                            kl3.t g18 = kl3.t.g();
                            b21.r rVar3 = gkVar.f6771b;
                            g18.getClass();
                            if (rVar3 != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerManager", "startMusicInList");
                                g18.h(g18.f308844e.d(rVar3));
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerManager", "musicWrapper is null");
                                break;
                            }
                        case 7:
                            hkVar.f6838b = kl3.t.g().a().c(gkVar.f6775f);
                            break;
                        case 8:
                            hkVar.f6840d = kl3.t.g().a().f();
                            break;
                        case 9:
                            hkVar.f6838b = kl3.t.g().a().g();
                            break;
                        case 10:
                            hkVar.f6838b = kl3.t.g().a().h();
                            break;
                        case 11:
                            kl3.t.g().p(600000);
                            break;
                    }
                } else {
                    kl3.t g19 = kl3.t.g();
                    b21.r rVar4 = gkVar.f6771b;
                    g19.f308839a.i();
                    rl3.t tVar2 = g19.f308840b;
                    if (tVar2.i() && (rVar = tVar2.f397277k) != null && rVar.a(rVar4)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "updateCurrentMusicWrapper src:%s", tVar2.f397283q);
                        double d18 = rVar4.K;
                        if (d18 > 0.0d && d18 != tVar2.f397277k.K) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "setPlaybackRate playbackRate:%f", java.lang.Double.valueOf(d18));
                            tVar2.B((float) rVar4.K);
                            tVar2.f397277k.K = rVar4.K;
                        }
                        float f19 = rVar4.L;
                        if (f19 >= 0.0f && f19 != tVar2.f397277k.L) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "setVolume volume:%f", java.lang.Float.valueOf(f19));
                            float f27 = rVar4.L;
                            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer2 = tVar2.f397278l;
                            if (commonPlayer2 != null && f27 >= 0.0f) {
                                commonPlayer2.setVolume(f27, f27);
                            }
                            tVar2.f397277k.L = rVar4.L;
                        }
                    }
                    g19.f308841c.i();
                    g19.f308844e.i(rVar4);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicActionListener", "don't anything, must init MusicPlayerManager first with MusicLogic before!");
            }
        }
        return false;
    }
}
