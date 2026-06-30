package com.tencent.mm.plugin.voip.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class NewVoipMgr$4 implements ve0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d0 f176304a;

    public NewVoipMgr$4(com.tencent.mm.plugin.voip.model.d0 d0Var) {
        this.f176304a = d0Var;
    }

    @Override // ve0.f
    public void a(final int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$4$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String string;
                java.lang.String str;
                int i18 = i17;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                final com.tencent.mm.plugin.voip.model.d0 d0Var = com.tencent.mm.plugin.voip.model.NewVoipMgr$4.this.f176304a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "onCallStateChanged :%d, isStartVoip: %b,oldState:%d", valueOf, java.lang.Boolean.valueOf(d0Var.H), java.lang.Integer.valueOf(d0Var.S));
                if (d0Var.H) {
                    int i19 = d0Var.S;
                    if ((i19 == 0 && i18 == 1) || (i19 == 0 && i18 == 2)) {
                        d0Var.P++;
                    }
                    vq4.z zVar = d0Var.f176373d;
                    if (i18 == 1) {
                        d0Var.f176372J = true;
                        if (i19 == 0) {
                            d0Var.M = java.lang.System.currentTimeMillis();
                        }
                        d0Var.S = 1;
                        gq4.v.Bi().A(1, 1);
                        d0Var.U = true;
                    } else if (i18 == 2) {
                        d0Var.f176372J = false;
                        if (i19 == 1) {
                            d0Var.N = java.lang.System.currentTimeMillis();
                        }
                        d0Var.S = 2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "phone call coming now!");
                        if (vq4.n0.h(d0Var.f176374e.f439369a)) {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kab, d0Var.q0(com.tencent.mm.sdk.platformtools.t8.H1(d0Var.B)));
                        } else {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(d0Var.f176387r ? com.tencent.mm.R.string.f493458ka3 : com.tencent.mm.R.string.kad);
                        }
                        java.lang.String str2 = string;
                        java.lang.String d17 = d0Var.f176386q.d1();
                        if (d0Var.f176388s) {
                            int i27 = com.tencent.mm.storage.f9.f193926r2;
                            str = "voip_content_video";
                        } else {
                            int i28 = com.tencent.mm.storage.f9.f193926r2;
                            str = "voip_content_voice";
                        }
                        com.tencent.mm.plugin.voip.model.b2.e(d17, str, d0Var.f176387r ? 1 : 0, 6, str2, false, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$9
                            @Override // yz5.l
                            public java.lang.Object invoke(java.lang.Object obj) {
                                com.tencent.mm.plugin.voip.model.d0.this.v0(1);
                                return null;
                            }
                        });
                        if (d0Var.f176387r && !vq4.n0.h(d0Var.f176374e.f439369a)) {
                            gq4.v.Bi().c();
                        }
                        gq4.v.Bi().s(4);
                        d0Var.E0(4107);
                        d0Var.m0();
                        d0Var.R = true;
                        gq4.v.Bi().A(2, 1);
                        d0Var.U = false;
                    } else if (i18 == 0) {
                        if (i19 == 1 || i19 == 2) {
                            d0Var.N = java.lang.System.currentTimeMillis();
                        }
                        d0Var.S = 0;
                        gq4.v.Bi().A(2, 1);
                        if (d0Var.f176372J) {
                            if (d0Var.A != null && vq4.n0.h(d0Var.f176374e.f439369a)) {
                                cv.v0 info = d0Var.A;
                                vq4.m0 m0Var = (vq4.m0) zVar;
                                m0Var.getClass();
                                kotlin.jvm.internal.o.g(info, "info");
                                m0Var.m(info);
                            } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                                cv.v0 v0Var = new cv.v0(4, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m), 3);
                                vq4.m0 m0Var2 = (vq4.m0) zVar;
                                m0Var2.getClass();
                                m0Var2.m(v0Var);
                            } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                                cv.v0 v0Var2 = new cv.v0(3, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o), 3);
                                vq4.m0 m0Var3 = (vq4.m0) zVar;
                                m0Var3.getClass();
                                m0Var3.m(v0Var2);
                            }
                            d0Var.f176372J = false;
                            d0Var.U = false;
                        }
                    }
                    ((vq4.m0) zVar).f439358v = d0Var.U;
                }
            }
        });
    }

    @Override // ve0.f
    public void b(android.content.Intent intent) {
    }

    @Override // ve0.f
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
    }
}
