package yf2;

/* loaded from: classes3.dex */
public final class g1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f461700d;

    public g1(yf2.m1 m1Var) {
        this.f461700d = m1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        in0.q liveCore;
        r45.q12 q12Var = (r45.q12) obj;
        yf2.m1 m1Var = this.f461700d;
        boolean T7 = ((mm2.c1) m1Var.business(mm2.c1.class)).T7();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (T7) {
            if (q12Var != null) {
                int integer = q12Var.getInteger(0);
                if (integer != 1) {
                    if (integer != 2) {
                        if (integer != 3) {
                            if (integer == 5) {
                                if (zl2.r4.f473950a.Y1(m1Var.O6())) {
                                    m1Var.a7();
                                }
                                mm2.n0 n0Var = (mm2.n0) m1Var.business(mm2.n0.class);
                                boolean Q6 = n0Var.Q6(xy2.c.e(m1Var.O6()));
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onModeChange] CoLive, isInvitee=");
                                sb6.append(Q6);
                                sb6.append(", invitationId=");
                                r45.f50 f50Var = (r45.f50) ((kotlinx.coroutines.flow.l2) n0Var.f329265g).getValue();
                                sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f374013d) : null);
                                com.tencent.mars.xlog.Log.i(m1Var.f461748m, sb6.toString());
                                if (Q6) {
                                    qo0.b bVar = qo0.b.f365390n5;
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    bundle.putBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", false);
                                    m1Var.X6(bVar, bundle);
                                } else {
                                    mm2.c1 c1Var = (mm2.c1) m1Var.business(mm2.c1.class);
                                    if (c1Var.l7()) {
                                        int i17 = (int) c1Var.f328866q;
                                        java.util.regex.Pattern pattern = pm0.v.f356802a;
                                        c1Var.p8(i17 & (-257));
                                        c1Var.D8(0);
                                    }
                                    qo0.b bVar2 = qo0.b.f365390n5;
                                    android.os.Bundle bundle2 = new android.os.Bundle();
                                    bundle2.putBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true);
                                    m1Var.X6(bVar2, bundle2);
                                }
                            }
                        } else if (zl2.r4.f473950a.Y1(m1Var.O6())) {
                            m1Var.a7();
                        } else {
                            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                            if (((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.g1) m1Var.getStore().business(mm2.g1.class)).f329069g).getValue()).booleanValue() && ((kotlinx.coroutines.flow.h3) ((mm2.g1) m1Var.getStore().business(mm2.g1.class)).f329070h).getValue() == null) {
                                h0Var.f310123d = com.tencent.mm.plugin.finder.live.util.y.o(m1Var, null, null, new yf2.b1(m1Var, h0Var, null), 3, null);
                            } else {
                                h0Var.f310123d = com.tencent.mm.plugin.finder.live.util.y.o(m1Var, null, null, new yf2.d1(m1Var, h0Var, null), 3, null);
                            }
                        }
                    } else if (zl2.r4.f473950a.Y1(m1Var.O6())) {
                        m1Var.a7();
                    }
                } else if (pm0.v.z(q12Var.getInteger(1), 1)) {
                    if (zl2.r4.f473950a.Y1(m1Var.O6())) {
                        m1Var.a7();
                    }
                } else if (pm0.v.z(q12Var.getInteger(1), 2) && !zl2.r4.f473950a.Y1(m1Var.O6())) {
                    df2.te teVar = (df2.te) m1Var.controller(df2.te.class);
                    if (teVar != null) {
                        teVar.Z6();
                    }
                    com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                    com.tencent.mm.plugin.finder.live.view.v1 v1Var = k0Var instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) k0Var : null;
                    if (v1Var != null && (liveCore = v1Var.getLiveCore()) != null) {
                        in0.q.d1(liveCore, null, false, 2, null);
                        r3 = f0Var;
                    }
                    if (r3 == null) {
                        com.tencent.mars.xlog.Log.e("Finder.FinderLivePostUIC", "Orientatio reset blend but pluginLayout:" + dk2.ef.f233380e + " get liveCore fail!");
                    }
                }
                ((mm2.g1) m1Var.business(mm2.g1.class)).getClass();
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_VIDEO_LIVE_ENABLE_AUDIENCE_NICKNAME_INT_SYNC;
                if (c17.r(u3Var, -1) == -1) {
                    if (pm0.v.z((int) ((mm2.c1) m1Var.business(mm2.c1.class)).f328866q, 8192)) {
                        ((mm2.g1) m1Var.business(mm2.g1.class)).W6(1);
                    } else {
                        ((mm2.g1) m1Var.business(mm2.g1.class)).W6(0);
                    }
                } else if (q12Var.getInteger(0) != 2) {
                    ((mm2.g1) m1Var.business(mm2.g1.class)).getClass();
                    if (gm0.j1.u().c().r(u3Var, -1) == 0) {
                        mm2.c1 c1Var2 = (mm2.c1) m1Var.business(mm2.c1.class);
                        int i18 = (int) ((mm2.c1) m1Var.business(mm2.c1.class)).f328866q;
                        java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                        c1Var2.p8(i18 & (-8193));
                    } else {
                        mm2.c1 c1Var3 = (mm2.c1) m1Var.business(mm2.c1.class);
                        int i19 = (int) ((mm2.c1) m1Var.business(mm2.c1.class)).f328866q;
                        java.util.regex.Pattern pattern3 = pm0.v.f356802a;
                        c1Var3.p8(i19 | 8192);
                    }
                }
            }
            yf2.m1.Z6(m1Var);
        }
        m1Var.f461751p.a(q12Var);
        return f0Var;
    }
}
