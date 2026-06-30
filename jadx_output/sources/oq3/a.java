package oq3;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f347373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f347374e;

    public a(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        this.f347373d = f9Var;
        this.f347374e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.tencent.mm.storage.f9 f9Var = this.f347373d;
        m11.b0 b27 = Di.b2(f9Var.y0(), f9Var.I0());
        java.lang.String format = java.lang.String.format("%s_%s", java.lang.Long.valueOf(f9Var.I0()), 1);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        nVar.A.Z6(format);
        boolean z17 = false;
        if (com.tencent.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f22550a.d(b27.l()), b27.f322637e, "", ""))) {
            if (b27.j()) {
                ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                m11.b0 d17 = m11.c0.d(b27);
                i17 = 4;
                i18 = 3;
                java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22562g, d17.f322637e, "", "");
                if (d17.f322633a > 0 && d17.k() && com.tencent.mm.vfs.w6.j(aj6)) {
                    format = java.lang.String.format("%s_%s", java.lang.Long.valueOf(f9Var.I0()), 2);
                    z17 = true;
                }
            } else {
                i17 = 4;
                i18 = 3;
            }
            i27 = i18;
            i19 = 1;
        } else {
            i17 = 4;
            i18 = 3;
            ((com.tencent.mm.pluginsdk.model.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
            if (com.tencent.mm.ui.chatting.component.z4.h(f9Var) < c01.id.a() - f9Var.getCreateTime()) {
                i19 = 4;
                i27 = 4;
            } else {
                i19 = 1;
                i27 = 1;
            }
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        sq3.a Y6 = nVar2.A.Y6(format);
        if (Y6 != null) {
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            nVar3.A.Z6(format);
            int a17 = Y6.z0() == Y6.J0() ? kq3.i.a(Y6.I0()) : 2;
            i28 = a17 == i17 ? i17 : i27;
            if (i28 == i18 && a17 != i18) {
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.requireAccountInitialized();
                nVar4.A.b7(format, 5);
            }
            i19 = a17;
        } else {
            i28 = i27;
        }
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long I0 = f9Var.I0();
        java.lang.String fromUser = f9Var.y0();
        long j17 = i19;
        long j18 = i28;
        long createTime = f9Var.getCreateTime();
        ((kq3.e) sVar).getClass();
        kotlin.jvm.internal.o.g(fromUser, "fromUser");
        com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct preloadClientReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct();
        preloadClientReportStruct.f59850d = this.f347374e ? 4L : 1L;
        preloadClientReportStruct.f59851e = z17 ? 2L : 1L;
        preloadClientReportStruct.p(fromUser);
        preloadClientReportStruct.q(java.lang.String.valueOf(I0));
        preloadClientReportStruct.f59855i = j17;
        preloadClientReportStruct.f59858l = j18;
        preloadClientReportStruct.f59859m = createTime / 1000;
        java.lang.String m17 = preloadClientReportStruct.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C image click:%s", m17);
        jx3.f.INSTANCE.kvStat(27004, m17);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: image msg open, msgId:" + f9Var.getMsgId());
    }
}
