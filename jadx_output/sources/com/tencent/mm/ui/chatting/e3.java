package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.e3 f200454a = new com.tencent.mm.ui.chatting.e3();

    public final boolean a(java.util.List selectItems, long j17) {
        ot0.q v17;
        kotlin.jvm.internal.o.g(selectItems, "selectItems");
        java.util.Iterator it = selectItems.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null && ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
                long j18 = v17.f348682m;
                if (j18 > j17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "file is too large, %s", com.tencent.mm.sdk.platformtools.t8.f0(j18));
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(java.util.List selectItems, long j17) {
        long j18;
        int i17;
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(selectItems, "selectItems");
        java.util.Iterator it = selectItems.iterator();
        long j19 = 0;
        while (true) {
            int i27 = 0;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (f9Var.isVideo() || f9Var.Y2()) {
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = f9Var.z0();
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(z07);
                t21.v2 v2Var = null;
                if (h17 != null) {
                    i27 = h17.f415008f;
                    if (t21.d3.s()) {
                        wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                        java.lang.String str = h17.S;
                        ((vf0.y1) x1Var2).getClass();
                        v2Var = t21.d3.h(str);
                    }
                }
                j19 += i27;
                if (v2Var != null) {
                    i17 = v2Var.f415008f;
                    j18 = i17;
                }
            } else if (f9Var.J2()) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                i17 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0()).f322636d;
                j18 = i17;
            } else if (f9Var.k2()) {
                ot0.q v17 = ot0.q.v(f9Var.j());
                if (v17 != null && ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i))) {
                    j18 = v17.f348682m;
                } else if (v17 != null && ((i18 = v17.f348666i) == 24 || i18 == 19)) {
                    r45.ul5 A = bt3.g2.A(v17.f348663h0);
                    if (A != null) {
                        java.util.Iterator it6 = A.f387465f.iterator();
                        int i28 = 0;
                        while (it6.hasNext()) {
                            r45.gp0 gp0Var = (r45.gp0) it6.next();
                            if (gp0Var.I == 17) {
                                r45.ul5 A2 = bt3.g2.A(gp0Var.Z1);
                                if (A2 != null) {
                                    java.util.Iterator it7 = A2.f387465f.iterator();
                                    i19 = 0;
                                    while (it7.hasNext()) {
                                        i19 += (int) ((r45.gp0) it7.next()).R;
                                    }
                                } else {
                                    i19 = 0;
                                }
                                i28 += i19;
                            } else {
                                i28 += (int) gp0Var.R;
                            }
                        }
                        i27 = i28;
                    }
                    j18 = i27;
                }
            }
            j19 += j18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingEditModeRetransmitMsg", "sumSelectedMsgFileSize, totalSize:%s", java.lang.Long.valueOf(j19));
        return j19 > j17;
    }
}
