package vq4;

/* loaded from: classes14.dex */
public final class e0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f439293a;

    public e0(vq4.m0 m0Var) {
        this.f439293a = m0Var;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        cv.v0 v0Var = (cv.v0) obj;
        vq4.m0 m0Var = this.f439293a;
        if (m0Var.f439358v) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIP.VoIPAudioManager", "current running system telecom ，wechat should not response audio changed");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioRouteConsumer ");
        sb6.append(v0Var.f222518c);
        sb6.append(" ==== ");
        int i17 = v0Var.f222516a;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", sb6.toString());
        int i18 = v0Var.f222518c;
        xm1.o oVar = m0Var.f439357u;
        if (i18 == 1) {
            if (i17 == 1) {
                gq4.v.Bi().Q(true);
                com.tencent.mm.plugin.voip.ui.f fVar = m0Var.B;
                if (fVar != null) {
                    fVar.i2(v0Var);
                }
                gq4.v.Bi().K(false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11080, 2, 1, 0);
            } else if (i17 == 2) {
                gq4.v.Bi().Q(false);
                com.tencent.mm.plugin.voip.ui.f fVar2 = m0Var.B;
                if (fVar2 != null) {
                    fVar2.i2(v0Var);
                }
                gq4.v.Bi().K(false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11080, 2, 2, 0);
            } else if (i17 == 3) {
                gq4.v.Bi().Q(false);
                gq4.v.Bi().K(true);
                com.tencent.mm.plugin.voip.ui.f fVar3 = m0Var.B;
                if (fVar3 != null) {
                    fVar3.i2(v0Var);
                }
            } else if (i17 == 4) {
                gq4.v.Bi().Q(false);
                com.tencent.mm.plugin.voip.ui.f fVar4 = m0Var.B;
                if (fVar4 != null) {
                    fVar4.i2(v0Var);
                }
                gq4.v.Bi().K(true);
            }
            if (mx3.f0.h()) {
                if (m0Var.C) {
                    m0Var.f439354r = v0Var;
                } else {
                    m0Var.f439355s = v0Var;
                }
            }
            m0Var.f439356t = v0Var;
            com.tencent.mm.plugin.voip.ui.f fVar5 = m0Var.B;
            if (fVar5 != null) {
                fVar5.q2(oVar.a());
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 == 4 && i17 == 4) {
                    m0Var.g();
                    return;
                }
                return;
            }
            if (i17 == 3) {
                m0Var.l(3, false);
            } else if (i17 == 4) {
                vq4.o0 o0Var = m0Var.f439349m;
                if (o0Var != null) {
                    int i19 = o0Var.f439369a;
                    boolean contains = ((java.util.ArrayList) ((com.tencent.mm.modelsimple.t) ((com.tencent.mm.plugin.appbrand.service.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.b6.class))).wi()).contains(6);
                    if (vq4.n0.e(i19) && (contains || !m0Var.f439353q)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoIP.VoIPAudioManager", "current is car online ,and we not allow to response start bt");
                        return;
                    }
                }
                m0Var.h();
                m0Var.l(4, false);
            }
            com.tencent.mm.plugin.voip.ui.f fVar6 = m0Var.B;
            if (fVar6 != null) {
                fVar6.q2(oVar.a());
                return;
            }
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                if (mx3.f0.h()) {
                    if (m0Var.a() == 4 || m0Var.a() == -1) {
                        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                            m0Var.l(3, false);
                        } else {
                            int i27 = m0Var.f439348l;
                            if (i27 != -1) {
                                m0Var.l(i27, false);
                            } else {
                                vq4.b0 b0Var = vq4.b0.f439270a;
                                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_fix_xiaomi_watch_error_t2, false)) {
                                    vq4.o0 o0Var2 = m0Var.f439349m;
                                    if (o0Var2 == null || vq4.n0.e(o0Var2.f439369a)) {
                                        m0Var.l(1, false);
                                    } else {
                                        m0Var.l(m0Var.f439360x ? 1 : 2, false);
                                    }
                                } else if (m0Var.f439360x) {
                                    m0Var.l(1, false);
                                } else {
                                    m0Var.l(2, false);
                                }
                            }
                        }
                    }
                } else if (m0Var.a() == 4) {
                    if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                        m0Var.l(3, false);
                    } else {
                        int i28 = m0Var.f439348l;
                        if (i28 != -1) {
                            m0Var.l(i28, false);
                        } else if (m0Var.f439360x) {
                            m0Var.l(1, false);
                        } else {
                            m0Var.l(2, false);
                        }
                    }
                }
                vq4.o0 o0Var3 = m0Var.f439349m;
                if (o0Var3 != null) {
                    if (m0Var.A && vq4.n0.e(o0Var3.f439369a)) {
                        m0Var.A = false;
                        if (!m0Var.f439359w) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.VoIP.VoIPAudioManager", "direct play ringtone nor tts cause not support tts");
                        }
                        java.lang.String str = gq4.v.Bi().f176558a.f176431u;
                        if (str != null) {
                            m0Var.e(str, gq4.v.Bi().f176558a.f176432v, gq4.v.Bi().f176558a.f176433w);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoIP.VoIPAudioManager", "not allow to play tts cause " + m0Var.A + " && " + vq4.n0.e(o0Var3.f439369a));
                    }
                }
            }
        } else if (m0Var.a() == 3) {
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                m0Var.l(4, false);
            } else {
                int i29 = m0Var.f439348l;
                if (i29 != -1) {
                    m0Var.l(i29, false);
                } else {
                    vq4.o0 o0Var4 = m0Var.f439349m;
                    if (o0Var4 == null || vq4.n0.e(o0Var4.f439369a)) {
                        m0Var.l(1, false);
                    } else {
                        m0Var.l(m0Var.f439360x ? 1 : 2, false);
                    }
                }
            }
        }
        com.tencent.mm.plugin.voip.ui.f fVar7 = m0Var.B;
        if (fVar7 != null) {
            fVar7.q2(oVar.a());
        }
    }
}
