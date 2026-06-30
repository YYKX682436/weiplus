package iy4;

/* loaded from: classes11.dex */
public class r0 implements wf0.u1, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.x9 f295989d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f295990e = new java.util.HashMap();

    public r0() {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: iy4.r0$$b
            @Override // java.lang.Runnable
            public final void run() {
                iy4.r0 r0Var = iy4.r0.this;
                r0Var.getClass();
                r0Var.f295989d = new com.tencent.mm.storage.x9();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append(gm0.j1.u().h());
                sb6.append("syncmsgid.ini");
                byte[] N = com.tencent.mm.vfs.w6.N(sb6.toString(), 0, -1);
                if (com.tencent.mm.sdk.platformtools.t8.M0(N)) {
                    return;
                }
                try {
                    r0Var.f295989d.parseFrom(N);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MultiTerminalSyncMgr", "task parse Error");
                }
            }
        }, "MultiTerminalSyncMgr");
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(this, android.os.Looper.getMainLooper());
        gm0.j1.d().a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
    }

    public final boolean a(long j17) {
        return !(j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerFileAutoDownloadConfigOpt()) == 1) && j17 > 26214400;
    }

    public void b() {
        ((ku5.t0) ku5.t0.f312615d).l(new java.lang.Runnable() { // from class: iy4.r0$$d
            @Override // java.lang.Runnable
            public final void run() {
                char c17;
                iy4.r0 r0Var = iy4.r0.this;
                for (int i17 = 0; i17 < r0Var.f295989d.f196336d.size(); i17++) {
                    com.tencent.mm.storage.y9 y9Var = (com.tencent.mm.storage.y9) r0Var.f295989d.f196336d.get(i17);
                    if (com.tencent.mm.sdk.platformtools.t8.H1(y9Var.f196386f) > 1209600) {
                        r0Var.f295989d.f196336d.remove(y9Var);
                        r0Var.d();
                        r0Var.b();
                        return;
                    }
                    long j17 = y9Var.f196385e;
                    if (j17 == 0 || com.tencent.mm.sdk.platformtools.t8.H1(j17) >= 900) {
                        com.tencent.mm.storage.f9 wg6 = pt0.f0.wg(y9Var.f196387g, y9Var.f196384d, true);
                        if (wg6 == null || wg6.I0() == 0 || wg6.z2()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "msg not exit or cleaned, msgLocalId:%d, talker:%s", java.lang.Long.valueOf(y9Var.f196384d), y9Var.f196387g);
                            r0Var.f295989d.f196336d.remove(y9Var);
                            r0Var.d();
                            r0Var.b();
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "statusNotify sendCommand DownloadFile user:%s, msgSvrId:%d, msgLocalId:%d, path:%s", wg6.Q0(), java.lang.Long.valueOf(wg6.I0()), java.lang.Long.valueOf(wg6.getMsgId()), wg6.z0());
                        if (wg6.J2()) {
                            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                            m11.b0 b27 = m11.b1.Di().b2(wg6.Q0(), wg6.I0());
                            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(wg6.j(), "msg", null);
                            int P = d17 == null ? 0 : com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$length"), 0);
                            if (b27.f322633a <= 0 || b27.k() || P == 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "statusNotify sendCommand DownloadFile image not ready, msgLocalId:%d, talker:%s", java.lang.Long.valueOf(wg6.getMsgId()), wg6.Q0());
                            } else if (r0Var.a(P)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "statusNotify sendCommand DownloadFile image too big, msgLocalId:%d, talker:%s", java.lang.Long.valueOf(wg6.getMsgId()), wg6.Q0());
                            } else if (P <= (j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerFileAutoDownloadConfigOpt()) == 1 ? 26214400 : 1048576) || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                ((ku5.t0) ku5.t0.f312615d).B(new iy4.t0(r0Var, wg6, P, b27));
                                c17 = 2;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload image too big, totalLen:%d", java.lang.Integer.valueOf(P));
                                c17 = 3;
                            }
                            c17 = 1;
                        } else if (wg6.getType() == 43 || wg6.getType() == 44 || wg6.getType() == 62) {
                            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                            java.lang.String z07 = wg6.z0();
                            ((vf0.y1) x1Var).getClass();
                            t21.v2 h17 = t21.d3.h(z07);
                            if (h17 == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTerminalSyncMgr", "autoDownload failed cause video info not found! The path is " + wg6.z0());
                            } else {
                                int i18 = h17.f415008f;
                                if (h17.f415011i == 199 || i18 == 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.MultiTerminalSyncMgr", "autoDownload failed cause video info not finish proc! The path is " + wg6.z0());
                                } else if (r0Var.a(i18)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload video too big, totalLen:%d", java.lang.Integer.valueOf(i18));
                                } else if (i18 <= (j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerFileAutoDownloadConfigOpt()) == 1 ? 26214400 : 1048576) || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                    ((ku5.t0) ku5.t0.f312615d).B(new iy4.u0(r0Var, wg6, i18));
                                    c17 = 2;
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload video too big, totalLen:%d", java.lang.Integer.valueOf(i18));
                                    c17 = 3;
                                }
                            }
                            c17 = 1;
                        } else {
                            if (wg6.k2()) {
                                ot0.q v17 = ot0.q.v(wg6.j());
                                if (v17 != null) {
                                    ez.v0 v0Var = ez.v0.f257777a;
                                    if (v0Var.i(java.lang.Integer.valueOf(v17.f348666i))) {
                                        if (v0Var.k(java.lang.Integer.valueOf(v17.f348666i))) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "appMsg is uploading");
                                        } else {
                                            long j18 = v17.f348682m;
                                            if (r0Var.a(j18)) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload attach too big, totalLen:%d", java.lang.Long.valueOf(j18));
                                            } else if (j18 <= (j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerFileAutoDownloadConfigOpt()) == 1 ? 26214400 : 1048576) || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                                com.tencent.mm.pluginsdk.model.app.d j19 = com.tencent.mm.pluginsdk.model.app.k0.j(wg6);
                                                if (j19 == null) {
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "attachInfo is null");
                                                } else if (!j19.t0() && j18 != 0) {
                                                    te5.h hVar = te5.h.f418649a;
                                                    if (hVar.b(wg6)) {
                                                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "msg is expired");
                                                    } else {
                                                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload attach, totalLen:%d", java.lang.Long.valueOf(j18));
                                                        if (!hVar.c()) {
                                                            com.tencent.mm.pluginsdk.model.app.k0.d(wg6, null);
                                                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(wg6.Q0())) {
                                                            h40.f fVar = new h40.f(wg6.Q0(), wg6.I0());
                                                            fVar.f278746g = true;
                                                            fVar.f278742c = new iy4.v0(r0Var, wg6);
                                                            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).aj(fVar);
                                                        }
                                                        c17 = 2;
                                                    }
                                                }
                                            } else {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload attach too big, totalLen:%d", java.lang.Long.valueOf(j18));
                                            }
                                        }
                                        c17 = 3;
                                    }
                                }
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                objArr[0] = java.lang.Integer.valueOf(v17 == null ? 0 : v17.f348666i);
                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "appMsg not support, subType:%d", objArr);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "msgType not support:%d", java.lang.Integer.valueOf(wg6.getType()));
                            }
                            c17 = 1;
                        }
                        if (c17 == 1) {
                            r0Var.f295989d.f196336d.remove(y9Var);
                            r0Var.d();
                        } else {
                            y9Var.f196385e = com.tencent.mm.sdk.platformtools.t8.i1();
                            r0Var.d();
                        }
                        r0Var.b();
                        return;
                    }
                }
            }
        }, 500L, "MultiTerminalSyncMgr");
    }

    public void c(final long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: iy4.r0$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = 0;
                while (true) {
                    iy4.r0 r0Var = iy4.r0.this;
                    if (i17 >= r0Var.f295989d.f196336d.size()) {
                        return;
                    }
                    com.tencent.mm.storage.y9 y9Var = (com.tencent.mm.storage.y9) r0Var.f295989d.f196336d.get(i17);
                    if (y9Var.f196384d == j17) {
                        r0Var.f295989d.f196336d.remove(y9Var);
                        r0Var.d();
                        return;
                    }
                    i17++;
                }
            }
        }, "MultiTerminalSyncMgr");
    }

    public final void d() {
        try {
            byte[] byteArray = this.f295989d.toByteArray();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().h());
            sb6.append("syncmsgid.ini");
            com.tencent.mm.vfs.w6.S(sb6.toString(), byteArray, 0, byteArray.length);
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTerminalSyncMgr", "task to file Error");
        }
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.util.HashMap hashMap = this.f295990e;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) hashMap.get(r1Var.f445529a);
        if (f9Var == null) {
            return;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            return;
        }
        if (f9Var.z2() || h17.f415011i == 199) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "download video end: %d, status:%d", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(h17.f415011i));
            c(f9Var.getMsgId());
            hashMap.remove(f9Var.z0());
        } else if (f9Var.P0() == 198) {
            hashMap.remove(f9Var.z0());
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof bt3.l0)) {
            long j17 = ((bt3.l0) m1Var).f24318m;
            c(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "download attach end: %d", java.lang.Long.valueOf(j17));
        }
    }
}
