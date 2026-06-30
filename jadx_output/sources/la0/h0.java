package la0;

/* loaded from: classes10.dex */
public class h0 implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        kl3.j jVar;
        kl3.e l17 = kl3.t.l();
        if (l17 instanceof kl3.z) {
            kl3.z zVar = (kl3.z) l17;
            zVar.getClass();
            if (m1Var instanceof nl3.a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd errCode:%d", java.lang.Integer.valueOf(i18));
                if (!(i17 == 4 && i18 == -24)) {
                    if (i17 == 0 && i18 == 0) {
                        ll3.o2.Ai().D0(((nl3.a) m1Var).f338180f.f380058d, false);
                        return;
                    }
                    return;
                }
                r45.m10 m10Var = ((nl3.a) m1Var).f338180f;
                if (zVar.z() != null && m10Var.f380058d.equals(zVar.z().field_musicId)) {
                    ((kl3.t) zVar.B()).o();
                }
                ll3.o2.Ai().D0(m10Var.f380058d, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd music is block %s", zVar.z().field_musicId);
                com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent = new com.tencent.mm.autogen.events.MusicCheckErrorEvent();
                am.ik ikVar = musicCheckErrorEvent.f54511g;
                ikVar.f6956a = i18;
                ikVar.f6957b = str;
                musicCheckErrorEvent.e();
                return;
            }
            if (m1Var instanceof nl3.b) {
                if (i17 == 0 && i18 == 0) {
                    nl3.b bVar = (nl3.b) m1Var;
                    r45.bm3 bm3Var = bVar.f338183f;
                    java.lang.String str2 = bVar.f338184g.field_musicId;
                    if (bm3Var == null || str2 == null) {
                        return;
                    }
                    java.util.Iterator it = ((java.util.ArrayList) zVar.f308856e).iterator();
                    while (it.hasNext()) {
                        java.lang.String str3 = (java.lang.String) it.next();
                        if (str3.equals(str2)) {
                            java.lang.String f17 = x51.j1.f(bm3Var.f370870e);
                            java.lang.String f18 = x51.j1.f(bm3Var.f370871f);
                            java.lang.String f19 = x51.j1.f(bm3Var.f370869d);
                            ((ku5.t0) ku5.t0.f312615d).g(new kl3.v(zVar, str3, f17, f18, f19, bVar));
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "get response %s %s %s", f17, f18, f19);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(f18)) {
                                return;
                            }
                            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
                            am.jk jkVar = musicPlayerEvent.f54512g;
                            jkVar.f7036b = 6;
                            jkVar.f7038d = bVar.f338184g.field_musicId;
                            musicPlayerEvent.b(android.os.Looper.getMainLooper());
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (m1Var instanceof nl3.c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetShakeMusicUrl onSceneEnd errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                nl3.c cVar = (nl3.c) m1Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getShakeMusicUrlScene callback, playUrl:%s, tempPlayUrl:%s", cVar.f338190g, cVar.f338189f);
                if (i17 == 0 && i18 == 0) {
                    java.lang.String str4 = cVar.f338190g;
                    java.lang.String str5 = cVar.f338189f;
                    com.tencent.mm.sdk.platformtools.r2 r2Var = ml3.d.f328405a;
                    if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str5)) {
                        ml3.d.f328405a.put(str4, str5);
                        ml3.d.f328406b.put(str4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    }
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(558L, 214L, 1L, true);
                }
                ql3.a z17 = zVar.z();
                if (z17 != null && !android.text.TextUtils.isEmpty(z17.f364573h2) && z17.f364573h2.equalsIgnoreCase(cVar.f338190g)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is same, start to play shake music");
                    ((kl3.q) zVar.B()).d(z17.u0());
                    return;
                } else {
                    if (z17 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is diff, don't play, current playUrl is %s, netscene playUrl is %s", z17.f364573h2, cVar.f338190g);
                        return;
                    }
                    return;
                }
            }
            if (m1Var instanceof nl3.d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "MusicLiveGetLink onSceneEnd errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                nl3.d dVar = (nl3.d) m1Var;
                if (i17 == 0 && i18 == 0) {
                    ml3.c.f328399a.a(dVar.H());
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(558L, 221L, 1L, true);
                }
                ql3.a z18 = zVar.z();
                ml3.c cVar2 = ml3.c.f328399a;
                java.lang.String str6 = z18.field_mid;
                java.lang.String str7 = str6 == null ? null : (java.lang.String) ml3.c.f328400b.get(str6);
                if (str7 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "why cacheUrl is null after get new url.");
                }
                java.lang.String str8 = z18.f364573h2;
                java.lang.String str9 = str7 != null ? str7 : str8;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "change music url: old Url:%s, new url:%s", str8, str9);
                z18.f364573h2 = str9;
                if (dVar.H() != null && dVar.H().size() > 0) {
                    r45.cs4 cs4Var = (r45.cs4) dVar.H().get(0);
                    if (cs4Var == null) {
                        return;
                    }
                    java.lang.String str10 = cs4Var.f371814m;
                    if (str10 != null && str10.length() > 0 && (jVar = zVar.f308860i) != null) {
                        java.lang.String str11 = cs4Var.f371814m;
                        com.tencent.mm.plugin.mv.ui.uic.m0 m0Var = (com.tencent.mm.plugin.mv.ui.uic.m0) jVar;
                        m0Var.f151287a.f151310i.set(6, str11);
                        m0Var.f151287a.S6();
                        androidx.appcompat.app.AppCompatActivity activity = m0Var.f151287a.getActivity();
                        kotlin.jvm.internal.o.g(activity, "activity");
                        com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = (com.tencent.mm.plugin.mv.ui.uic.s1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.s1.class);
                        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = m0Var.f151287a;
                        s1Var.V6(n0Var.f151310i, n0Var.f151311m, false);
                        com.tencent.mars.xlog.Log.i(m0Var.f151287a.f151306e, "get lyric from MidLink " + str11);
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.mv.ui.uic.l0(m0Var.f151287a, str11));
                        kl3.z zVar2 = (kl3.z) ((kl3.k) m0Var.f151288b);
                        if (zVar2.f308860i != null) {
                            zVar2.f308860i = null;
                        }
                    }
                }
                ((kl3.q) zVar.B()).d(z18.u0());
                if (com.tencent.mm.sdk.platformtools.t8.K0(str9) || !str9.equals(str8)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is diff, don't play, current playUrl is %s, netscene playUrl is %s", z18.f364573h2, str7);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is same, url:%s", z18.f364573h2);
                }
            }
        }
    }
}
