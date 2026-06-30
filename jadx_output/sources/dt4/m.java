package dt4;

/* loaded from: classes14.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt4.p f243255a;

    public m(dt4.p pVar) {
        this.f243255a = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.lifecycle.c1 a17;
        androidx.lifecycle.c1 a18;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ((java.util.ArrayList) this.f243255a.f243270c).remove(java.lang.Integer.valueOf(fVar.f70620f.hashCode()));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "queryAAOrder errCode:%s errMsg:%s errType:%s cgiCount:%d orders:%d", java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c, java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(((java.util.ArrayList) this.f243255a.f243270c).size()), java.lang.Integer.valueOf(((r45.c) fVar.f70618d).f371186d.size()));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            java.util.LinkedList<r45.t> orders = ((r45.c) fVar.f70618d).f371186d;
            kotlin.jvm.internal.o.f(orders, "orders");
            dt4.p pVar = this.f243255a;
            for (r45.t tVar : orders) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f386039d)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDataCenter", "queryAAOrder error:bill_no is null");
                } else {
                    p75.l0 G0 = dm.ec.G0(tVar.f386039d);
                    synchronized (jm0.k.f300270i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
                    }
                    dm.ec ecVar = (dm.ec) G0.o(((xs4.b) a17).Q4(), dm.ec.class);
                    if (ecVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerDataCenter", "queryAAOrder order:" + tVar.f386039d + " record is empty");
                    } else if (ecVar.z0() == 1) {
                        java.util.LinkedList<r45.b0> payer_list = tVar.f386042g;
                        kotlin.jvm.internal.o.f(payer_list, "payer_list");
                        for (r45.b0 b0Var : payer_list) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "queryAAOrder receiver, sendId:" + tVar.f386039d + " user:" + b0Var.f370384d + " time:" + b0Var.f370386f + " msgid:" + ecVar.u0() + " amount:" + b0Var.f370385e);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(tVar.f386039d);
                            sb6.append('_');
                            sb6.append(b0Var.f370384d);
                            java.lang.String sb7 = sb6.toString();
                            p75.l0 G02 = dm.ec.G0(sb7);
                            synchronized (jm0.k.f300270i) {
                                gm0.j1.b().c();
                                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                                }
                                a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
                            }
                            dm.ec ecVar2 = (dm.ec) G02.o(((xs4.b) a18).Q4(), dm.ec.class);
                            if (ecVar2 == null || ecVar2.y0() != b0Var.f370385e) {
                                dm.ec ecVar3 = new dm.ec();
                                ecVar3.W0(sb7);
                                ecVar3.P0(pVar.f243268a);
                                ecVar3.L0(b0Var.f370386f * 1000);
                                ecVar3.I0(com.tencent.mm.wallet_core.ui.r1.t(ecVar.v0()));
                                ecVar3.J0(ecVar.u0());
                                ecVar3.U0(b0Var.f370384d);
                                ecVar3.T0(ecVar.A0());
                                ecVar3.Q0(b0Var.f370385e);
                                ecVar3.R0(1);
                                pVar.q(ecVar3, ecVar2 == null);
                            }
                        }
                        if (tVar.f386041f == 2) {
                            pVar.r(ecVar);
                        }
                    } else {
                        java.util.LinkedList<r45.b0> payer_list2 = tVar.f386042g;
                        kotlin.jvm.internal.o.f(payer_list2, "payer_list");
                        for (r45.b0 b0Var2 : payer_list2) {
                            if (c01.z1.r().equals(b0Var2.f370384d)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "queryAAOrder payer, sendId:" + tVar.f386039d + " time:" + b0Var2.f370386f + " msgid:" + ecVar.u0() + " amount:" + b0Var2.f370385e);
                                ecVar.Q0(b0Var2.f370385e);
                                ecVar.L0(((long) b0Var2.f370386f) * ((long) 1000));
                                ecVar.I0(com.tencent.mm.wallet_core.ui.r1.t(ecVar.v0()));
                                pVar.q(ecVar, false);
                            }
                        }
                    }
                }
            }
        }
        dt4.p.d(this.f243255a);
        ((kotlinx.coroutines.sync.o) this.f243255a.f243271d).c();
        return null;
    }
}
