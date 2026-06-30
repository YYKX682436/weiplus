package dt4;

/* loaded from: classes14.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt4.p f243265a;

    public o(dt4.p pVar) {
        this.f243265a = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.lifecycle.c1 a17;
        java.util.Iterator it;
        boolean z17;
        androidx.lifecycle.c1 a18;
        java.util.LinkedList linkedList;
        androidx.lifecycle.c1 a19;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ((java.util.ArrayList) this.f243265a.f243270c).remove(java.lang.Integer.valueOf(fVar.f70620f.hashCode()));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder errCode:%s errMsg:%s errType:%s orders:%d", java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c, java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(((r45.sf) fVar.f70618d).f385662d.size()));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            java.util.LinkedList<r45.n25> orders = ((r45.sf) fVar.f70618d).f385662d;
            kotlin.jvm.internal.o.f(orders, "orders");
            dt4.p pVar = this.f243265a;
            for (r45.n25 n25Var : orders) {
                int i17 = n25Var.f381028d;
                long j17 = 0;
                if (i17 == 1) {
                    r45.jz5 jz5Var = n25Var.f381029e;
                    if (jz5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(jz5Var.f378230d)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder order.sendOrder is empty");
                    } else {
                        p75.l0 G0 = dm.ec.G0(n25Var.f381029e.f378230d);
                        synchronized (jm0.k.f300270i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
                        }
                        dm.ec ecVar = (dm.ec) G0.o(((xs4.b) a17).Q4(), dm.ec.class);
                        if (ecVar == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder sendOrder:" + n25Var.f381029e.f378230d + " record is empty");
                        } else {
                            r45.jz5 jz5Var2 = n25Var.f381029e;
                            int i18 = jz5Var2.f378232f;
                            if (i18 == 0 || (i18 == 2 && ((linkedList = jz5Var2.f378233g) == null || linkedList.isEmpty()))) {
                                pVar.r(ecVar);
                            } else {
                                java.util.LinkedList receivers = n25Var.f381029e.f378233g;
                                kotlin.jvm.internal.o.f(receivers, "receivers");
                                java.util.Iterator it6 = receivers.iterator();
                                while (it6.hasNext()) {
                                    r45.lk5 lk5Var = (r45.lk5) it6.next();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder sendOrder, sendId:" + n25Var.f381029e.f378230d + " user:" + lk5Var.f379560d + " time:" + ecVar.v0() + " msgid:" + ecVar.u0() + " amount:" + lk5Var.f379561e);
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(lk5Var.f379560d) && lk5Var.f379561e > j17) {
                                        java.lang.String str = n25Var.f381029e.f378230d + '_' + lk5Var.f379560d;
                                        p75.l0 G02 = dm.ec.G0(str);
                                        synchronized (jm0.k.f300270i) {
                                            gm0.j1.b().c();
                                            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                                            }
                                            a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
                                        }
                                        dm.ec ecVar2 = (dm.ec) G02.o(((xs4.b) a18).Q4(), dm.ec.class);
                                        if (ecVar2 == null || ecVar2.y0() != lk5Var.f379561e) {
                                            dm.ec ecVar3 = new dm.ec();
                                            ecVar3.W0(str);
                                            ecVar3.P0(pVar.f243268a);
                                            it = it6;
                                            ecVar3.L0(lk5Var.f379562f * 1000);
                                            ecVar3.I0(com.tencent.mm.wallet_core.ui.r1.t(lk5Var.f379562f));
                                            ecVar3.J0(ecVar.u0());
                                            ecVar3.U0(lk5Var.f379560d);
                                            ecVar3.T0(ecVar.A0());
                                            ecVar3.Q0(lk5Var.f379561e);
                                            ecVar3.R0(2);
                                            pVar.q(ecVar3, ecVar2 == null);
                                            if (lk5Var.f379560d.equals(c01.z1.r())) {
                                                dm.ec ecVar4 = new dm.ec();
                                                ecVar4.W0(n25Var.f381029e.f378230d + "_my_" + lk5Var.f379560d);
                                                ecVar4.P0(pVar.f243268a);
                                                ecVar4.L0(ecVar3.v0());
                                                ecVar4.I0(ecVar3.t0());
                                                ecVar4.J0(ecVar.u0());
                                                ecVar4.U0(lk5Var.f379560d);
                                                ecVar4.T0(ecVar.A0());
                                                ecVar4.Q0(lk5Var.f379561e);
                                                z17 = true;
                                                ecVar4.R0(1);
                                                pVar.q(ecVar4, ecVar2 == null);
                                                it6 = it;
                                                j17 = 0;
                                            }
                                            z17 = true;
                                            it6 = it;
                                            j17 = 0;
                                        }
                                    }
                                    it = it6;
                                    z17 = true;
                                    it6 = it;
                                    j17 = 0;
                                }
                                if (n25Var.f381029e.f378232f == 2) {
                                    pVar.r(ecVar);
                                }
                            }
                        }
                    }
                } else if (i17 != 2) {
                    continue;
                } else {
                    r45.ik5 ik5Var = n25Var.f381030f;
                    if (ik5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(ik5Var.f377110d)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder order.receiveOrder is empty");
                    } else {
                        p75.l0 G03 = dm.ec.G0(n25Var.f381030f.f377110d);
                        synchronized (jm0.k.f300270i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a19 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
                        }
                        dm.ec ecVar5 = (dm.ec) G03.o(((xs4.b) a19).Q4(), dm.ec.class);
                        if (ecVar5 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder receiveOrder:" + n25Var.f381030f.f377110d + " record is empty");
                        } else {
                            r45.ik5 ik5Var2 = n25Var.f381030f;
                            int i19 = ik5Var2.f377115i;
                            if (i19 == 0 || (i19 == 2 && ik5Var2.f377113g <= 0)) {
                                pVar.r(ecVar5);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerDataCenter", "queryHongBaoOrder receiverOrder, sendId:" + ecVar5.F0() + " user:" + ecVar5.D0() + " time:" + n25Var.f381030f.f377114h + " msgid:" + ecVar5.u0() + " amount:" + n25Var.f381030f.f377113g);
                                ecVar5.Q0(n25Var.f381030f.f377113g);
                                ecVar5.L0(n25Var.f381030f.f377114h * ((long) 1000));
                                ecVar5.I0(com.tencent.mm.wallet_core.ui.r1.t(n25Var.f381030f.f377114h));
                                pVar.q(ecVar5, false);
                            }
                        }
                    }
                }
            }
        }
        dt4.p.d(this.f243265a);
        ((kotlinx.coroutines.sync.o) this.f243265a.f243271d).c();
        return null;
    }
}
