package qe5;

/* loaded from: classes12.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f362129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(qe5.m0 m0Var) {
        super(1);
        this.f362129d = m0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        oi3.g gVar;
        ot0.q qVar;
        oi3.g gVar2;
        java.lang.Object obj2;
        java.lang.String j17;
        kd5.e state = (kd5.e) obj;
        kotlin.jvm.internal.o.g(state, "state");
        kd5.f fVar = (kd5.f) state.a(kd5.f.class);
        qe5.m0 m0Var = this.f362129d;
        if (fVar != null && fVar.f306896b && m0Var.f362148g == 1) {
            m0Var.c7(false);
        }
        kd5.p pVar = (kd5.p) state.a(kd5.p.class);
        if (pVar != null) {
            m0Var.getClass();
            xg3.l0 l0Var = pVar.f306909b;
            java.util.ArrayList arrayList = l0Var != null ? l0Var.f454412c : null;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    long msgId = ((com.tencent.mm.storage.f9) obj2).getMsgId();
                    java.lang.Long X6 = m0Var.X6();
                    if (X6 != null && msgId == X6.longValue()) {
                        break;
                    }
                }
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj2;
                if (f9Var != null) {
                    kd5.e V6 = m0Var.V6();
                    if (com.tencent.mm.storage.z3.R4(V6 != null ? V6.f306880h : null) && f9Var.A0() == 0) {
                        j17 = f9Var.j();
                        if (j17 != null) {
                            j17 = c01.w9.u(j17);
                        }
                    } else {
                        j17 = f9Var.j();
                    }
                    ot0.q v17 = ot0.q.v(j17);
                    if (v17 != null) {
                        m0Var.f362148g = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var, m0Var.U6());
                        com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "update msgId:%s newType:%s newFileStatus:%s", m0Var.X6(), java.lang.Integer.valueOf(v17.f348666i), java.lang.Integer.valueOf(m0Var.f362148g));
                        if (ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
                            androidx.appcompat.app.AppCompatActivity activity = m0Var.getActivity();
                            kotlin.jvm.internal.o.g(activity, "activity");
                            j75.f Q6 = ((qe5.n1) pf5.z.f353948a.a(activity).a(qe5.n1.class)).Q6();
                            if (Q6 != null) {
                                Q6.B3(new kd5.i(false));
                            }
                        }
                    }
                }
            }
        }
        if (((kd5.c) state.a(kd5.c.class)) != null) {
            if (m0Var.e7()) {
                com.tencent.mm.storage.f9 Y6 = m0Var.Y6();
                if (m0Var.X6() == null || Y6 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "onCreate: msgInfo or msgId is null");
                } else {
                    com.tencent.mm.pluginsdk.model.app.d U6 = m0Var.U6();
                    if (U6 != null) {
                        m0Var.W6(false);
                        U6.field_status = 101;
                        U6.field_lastModifyTime = c01.id.e();
                        com.tencent.mm.pluginsdk.model.app.u5.wi().update(U6, new java.lang.String[0]);
                    }
                    bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
                    long I0 = Y6.I0();
                    java.lang.String y07 = Y6.y0();
                    kotlin.jvm.internal.o.f(y07, "getFromUsername(...)");
                    ((kq3.e) sVar).Ai(I0, y07, true, Y6.getCreateTime());
                    kotlinx.coroutines.l.d(v65.m.b(m0Var.getActivity()), null, null, new qe5.i0(Y6, m0Var, null), 3, null);
                }
            }
            m0Var.c7(false);
        }
        kd5.r rVar = (kd5.r) state.a(kd5.r.class);
        if (rVar != null) {
            m0Var.h7(rVar.f306910b);
        }
        kd5.t tVar = (kd5.t) state.a(kd5.t.class);
        if (tVar != null) {
            if (tVar.f306911b) {
                com.tencent.mm.pluginsdk.model.app.d U62 = m0Var.U6();
                if (U62 != null) {
                    long j18 = U62.field_status;
                    if (j18 != 199) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp roundProgressBar onClick but scene is null and set status[%d] paused", java.lang.Long.valueOf(j18));
                        U62.field_status = 102L;
                        U62.field_lastModifyTime = c01.id.e();
                        com.tencent.mm.pluginsdk.model.app.u5.wi().update(U62, new java.lang.String[0]);
                        kd5.e V62 = m0Var.V6();
                        if (V62 != null) {
                            V62.H = false;
                        }
                    }
                }
                kd5.e V63 = m0Var.V6();
                java.lang.String str = V63 != null ? V63.f306880h : null;
                if (str == null) {
                    str = "";
                }
                kd5.e V64 = m0Var.V6();
                ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).Zi(new h40.f(str, (V64 == null || (gVar2 = V64.f306881i) == null) ? 0L : gVar2.getLong(gVar2.f345617d + 1)));
            } else {
                kd5.e V65 = m0Var.V6();
                if (V65 == null || (gVar = V65.f306881i) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "dealUploadingPause: simpleMsgInfo is null");
                } else {
                    kd5.e V66 = m0Var.V6();
                    java.lang.String n17 = (V66 == null || (qVar = V66.f306882m) == null) ? null : qVar.n();
                    if (n17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "dealUploadingPause: appMsgContent is null");
                    } else {
                        int i17 = gVar.f345617d;
                        com.tencent.mm.pluginsdk.model.app.k0.x(gVar.getLong(i17 + 0), gVar.getString(i17 + 3), n17);
                        m0Var.c7(false);
                    }
                }
            }
        }
        if (((kd5.y) state.a(kd5.y.class)) != null) {
            m0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "start receive file");
            kd5.e V67 = m0Var.V6();
            java.lang.Integer valueOf = V67 != null ? java.lang.Integer.valueOf(V67.f306889t) : null;
            com.tencent.mm.storage.f9 Y62 = m0Var.Y6();
            if (Y62 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "msgInfo is null");
            } else {
                ez.v0 v0Var = ez.v0.f257777a;
                if (v0Var.k(valueOf)) {
                    ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y62, null, 1, true);
                } else {
                    ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y62, null, 0, true);
                }
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Y62.getMsgId(), Y62, true);
                if (v0Var.k(valueOf)) {
                    m0Var.c7(true);
                } else {
                    m0Var.c7(true);
                    if (m0Var.e7()) {
                        com.tencent.mm.storage.f9 Y63 = m0Var.Y6();
                        if (Y63 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "msgInfo is null");
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "startToDownloadFile");
                            m0Var.T6();
                            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                            com.tencent.mm.modelsimple.g1.M(Y63);
                        }
                    }
                }
                d35.h hVar = d35.h.f226344a;
                kd5.e V68 = m0Var.V6();
                hVar.d(Y62, V68 != null ? V68.f306882m : null);
            }
        }
        kd5.v vVar = (kd5.v) state.a(kd5.v.class);
        if (vVar != null) {
            m0Var.c7(vVar.f306914b);
        }
        if (((kd5.a) state.a(kd5.a.class)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "cancel receive file");
            com.tencent.mm.storage.f9 Y64 = m0Var.Y6();
            if (Y64 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "msgInfo is null");
            } else {
                ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Y64, null, 5, true);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Y64.getMsgId(), Y64, true);
                m0Var.c7(false);
            }
        }
        android.support.v4.media.f.a(state.a(kd5.x.class));
        return jz5.f0.f302826a;
    }
}
