package dk5;

/* loaded from: classes9.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234771d;

    public o1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI) {
        this.f234771d = msgRetransmitUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        ?? r66;
        int i17 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreateOriginCompressVideo, msgType = ");
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234771d;
        sb6.append(msgRetransmitUI.f210952e);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", sb6.toString());
        int i18 = msgRetransmitUI.f210952e;
        int i19 = 0;
        java.lang.String str2 = "";
        if (i18 == 1) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String str3 = msgRetransmitUI.f210954g;
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(str3);
            if (h17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "recreateOriginCompressVideo TYPE_VIDEO info == null, fileName = " + msgRetransmitUI.f210954g);
            } else if (h17.S != null) {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(h17.h(), h17.f415016n);
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22570r, msgRetransmitUI.f210954g, false);
                java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22571s, msgRetransmitUI.f210954g, false);
                java.lang.String str4 = h17.S;
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.v2 h18 = t21.d3.h(str4);
                if (com.tencent.mm.vfs.w6.k(rj7) == 0 && com.tencent.mm.vfs.w6.k(rj6) > 0 && h18 != null && h18.i()) {
                    jx3.f fVar = jx3.f.INSTANCE;
                    fVar.d(21019, 0, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(rj6)), 66666, "single", "" + msgRetransmitUI.f210952e);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    msgRetransmitUI.i7(rj6, rj7);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    fVar.d(21019, 1, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(rj6)), 66667, "single", "" + msgRetransmitUI.f210952e, java.lang.Long.valueOf(currentTimeMillis2));
                    i19 = 1;
                }
            }
        } else {
            boolean z17 = 21019;
            if (i18 == 12 || i18 == 13) {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui();
                java.util.List<com.tencent.mm.storage.f9> list = com.tencent.mm.ui.chatting.x3.f206228a.f206201a;
                if (list != null) {
                    int i27 = 0;
                    for (com.tencent.mm.storage.f9 f9Var : list) {
                        if (f9Var.isVideo()) {
                            wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                            java.lang.String z07 = f9Var.z0();
                            ((vf0.y1) x1Var2).getClass();
                            t21.v2 h19 = t21.d3.h(z07);
                            if (h19 == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "recreateOriginCompressVideo TYPE_MULTI info == null, fileName = " + f9Var.z0());
                            } else if (h19.S == null) {
                                continue;
                            } else {
                                if (msgRetransmitUI.isDestroyed()) {
                                    break;
                                }
                                wf0.x1 x1Var3 = (wf0.x1) i95.n0.c(wf0.x1.class);
                                java.lang.String str5 = h19.S;
                                ((vf0.y1) x1Var3).getClass();
                                t21.v2 h27 = t21.d3.h(str5);
                                java.lang.String rj8 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22570r, h19.d(), false);
                                java.lang.String rj9 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, h19.d(), false);
                                if (com.tencent.mm.vfs.w6.k(rj9) != 0 || com.tencent.mm.vfs.w6.k(rj8) <= 0 || h27 == null || !h27.i()) {
                                    str = str2;
                                    r66 = 21019;
                                } else {
                                    jx3.f fVar2 = jx3.f.INSTANCE;
                                    fVar2.d(21019, 0, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(rj8)), 66666, "multi", str2 + msgRetransmitUI.f210952e);
                                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                                    msgRetransmitUI.i7(rj8, rj9);
                                    long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
                                    str = str2;
                                    java.lang.Object[] objArr = {1, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(rj8)), 66667, "multi", str2 + msgRetransmitUI.f210952e, java.lang.Long.valueOf(currentTimeMillis4)};
                                    r66 = 21019;
                                    fVar2.d(21019, objArr);
                                    i27++;
                                }
                            }
                        } else {
                            str = str2;
                            r66 = z17;
                        }
                        z17 = r66;
                        str2 = str;
                    }
                    i19 = i27;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "recreateOriginCompressVideo done, count = " + i19);
        msgRetransmitUI.f210972x0.countDown();
    }
}
