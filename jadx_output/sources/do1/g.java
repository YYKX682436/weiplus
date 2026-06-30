package do1;

/* loaded from: classes12.dex */
public final class g implements do1.b {
    @Override // do1.b
    public boolean a(com.tencent.mm.storage.f9 msg, long j17) {
        java.lang.String str;
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(msg, "msg");
        m11.b0 h17 = h(msg);
        java.lang.String str2 = "";
        if (msg.A0() == 1) {
            java.lang.String j18 = j(msg, h17);
            str = j18 == null ? "" : j18;
            if (h17.j()) {
                m11.b0 C1 = i().C1(java.lang.Long.valueOf(h17.f322649q));
                i17 = C1.f322640h;
                if (C1.f322633a > 0) {
                    str2 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(msg, bm5.f0.f22562g, C1.f322637e, "", "");
                }
            }
            i17 = 0;
        } else if (h17.k()) {
            str = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(msg, bm5.c0.f22550a.d(h17.l()), h17.f322637e, "", "");
            if (h17.j()) {
                m11.b0 C12 = i().C1(java.lang.Long.valueOf(h17.f322649q));
                int i19 = C12.f322640h;
                if (kotlin.jvm.internal.o.b(C12, h17) || !C12.k() || C12.f322633a <= 0 || C12.f322640h != 1) {
                    i18 = i19;
                } else {
                    i18 = i19;
                    str2 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(msg, bm5.f0.f22562g, C12.f322637e, "", "");
                }
                i17 = i18;
            }
            i17 = 0;
        } else if (h17.j()) {
            i17 = i().C1(java.lang.Long.valueOf(h17.f322649q)).f322640h;
            str = "";
        } else {
            str = "";
            i17 = 0;
        }
        if (i17 == 1 && com.tencent.mm.vfs.w6.l(str2) >= j17) {
            co1.i.b("MicroMsg.RoamBackupItemImage", msg, "HdImg", str2);
            return true;
        }
        if ((i17 != 1 || msg.A0() != 1 || !com.tencent.mm.vfs.w6.j(str2)) && !kotlin.jvm.internal.o.b(str, str2) && com.tencent.mm.vfs.w6.l(str) >= j17) {
            co1.i.b("MicroMsg.RoamBackupItemImage", msg, "Img", str);
            return true;
        }
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String ga6 = tg3.u0.ga((tg3.u0) c17, msg, msg.z0(), false, 4, null);
        if (com.tencent.mm.vfs.w6.l(ga6) < j17) {
            return false;
        }
        co1.i.b("MicroMsg.RoamBackupItemImage", msg, "thumb", ga6);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202  */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(bw5.u0 r24, bw5.t0 r25, com.tencent.mm.storage.f9 r26) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.g.b(bw5.u0, bw5.t0, com.tencent.mm.storage.f9):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0227  */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(com.tencent.mm.storage.f9 r38, bw5.u0 r39, bw5.t0 r40, co1.c r41) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.g.d(com.tencent.mm.storage.f9, bw5.u0, bw5.t0, co1.c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0409  */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co1.h e(long r31, com.tencent.mm.storage.f9 r33, do1.a r34) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.g.e(long, com.tencent.mm.storage.f9, do1.a):co1.h");
    }

    @Override // do1.b
    public long g(com.tencent.mm.storage.f9 msg, java.lang.String mediaId, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        m11.b0 h17 = h(msg);
        if (1 == i17) {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            return com.tencent.mm.vfs.w6.k(tg3.u0.ga((tg3.u0) c17, msg, msg.z0(), false, 4, null));
        }
        if (msg.A0() == 1) {
            if (3 == i17) {
                if (!h17.j()) {
                    return 0L;
                }
                m11.b0 C1 = i().C1(java.lang.Long.valueOf(h17.f322649q));
                if (C1.f322633a > 0) {
                    return com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(msg, bm5.f0.f22562g, C1.f322637e, "", ""));
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupItemImage", "hasHd(send) but no hd info!!! msgId:" + msg.getMsgId());
                return 0L;
            }
            if (2 == i17) {
                return com.tencent.mm.vfs.w6.k(j(msg, h17));
            }
        } else {
            if (3 == i17) {
                if (h17.j()) {
                    m11.b0 C12 = i().C1(java.lang.Long.valueOf(h17.f322649q));
                    if (C12.f322633a > 0 && C12.f322640h == 1 && !kotlin.jvm.internal.o.b(C12, h17) && C12.k()) {
                        return com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(msg, bm5.f0.f22562g, C12.f322637e, "", ""));
                    }
                }
                return 0L;
            }
            if (2 == i17) {
                return com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(msg, bm5.c0.f22550a.d(h17.l()), h17.f322637e, "", ""));
            }
        }
        return 0L;
    }

    public final m11.b0 h(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.A0() != 1) {
            return i().b2(f9Var.Q0(), f9Var.I0());
        }
        m11.b0 T1 = i().T1(f9Var.Q0(), f9Var.getMsgId());
        kotlin.jvm.internal.o.f(T1, "getByMsgLocalId(...)");
        return T1.f322633a == 0 ? i().b2(f9Var.Q0(), f9Var.I0()) : T1;
    }

    public final m11.l0 i() {
        m11.l0 f17 = tn1.f.f().e().f();
        kotlin.jvm.internal.o.f(f17, "getImgInfoStorage(...)");
        return f17;
    }

    public final java.lang.String j(com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(b0Var.f322638f)) {
            return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f22550a.d(b0Var.l()), b0Var.f322637e, "", "");
        }
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22563h, b0Var.f322638f, "", "");
    }
}
