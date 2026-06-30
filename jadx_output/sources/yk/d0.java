package yk;

/* loaded from: classes12.dex */
public final class d0 extends yk.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // yk.v
    public boolean a() {
        long j17;
        java.lang.String str;
        boolean z17;
        boolean z18;
        int i17;
        int i18;
        int i19;
        int i27;
        boolean z19;
        java.lang.Throwable th6;
        com.tencent.mm.storage.f9 f9Var;
        jz5.f0 f0Var;
        java.lang.String Q0;
        com.tencent.mm.storage.f9 f9Var2;
        jz5.f0 f0Var2;
        java.lang.String Q02;
        int i28 = 0;
        if (!gm0.j1.a()) {
            return false;
        }
        if (pt0.p.f358218a1.a("videoinfo2")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "clean is already done");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "start doWork");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
        yk.c0 c0Var = new yk.c0(cancellationSignal);
        com.tencent.mm.sdk.platformtools.u3.i(c0Var, 5000L);
        try {
            try {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                android.database.Cursor w17 = t21.o2.Ui().w(com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53698m.a(), cancellationSignal);
                str = "";
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i27 = 0;
                int i29 = 0;
                z17 = true;
                z18 = true;
                while (w17.moveToNext()) {
                    try {
                        try {
                            try {
                                t21.v2 v2Var = new t21.v2();
                                v2Var.f415000a = w17.getString(i28);
                                j17 = currentTimeMillis;
                                try {
                                    v2Var.K = w17.getLong(1);
                                    v2Var.V = true;
                                    v2Var.f415016n = w17.getLong(2);
                                    v2Var.f415004c = w17.getLong(3);
                                    v2Var.n("");
                                    v2Var.U = i28;
                                    v2Var.l(new com.tencent.mm.plugin.msg.MsgIdTalker(v2Var.K, ""));
                                    if (i29 == 0) {
                                        java.lang.String d17 = v2Var.d();
                                        kotlin.jvm.internal.o.f(d17, "getFileName(...)");
                                        str = d17;
                                    }
                                    long j18 = v2Var.f415016n;
                                    jz5.f0 f0Var3 = jz5.f0.f302826a;
                                    if (j18 > 0) {
                                        try {
                                            f9Var = pt0.f0.f358209b1.n("talker-ignore", j18);
                                        } catch (java.lang.Throwable unused) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "getMsgById error, msgLocalId: " + v2Var.f415016n);
                                            f9Var = null;
                                        }
                                        if (f9Var != null && (Q0 = f9Var.Q0()) != null) {
                                            if (!(Q0.length() > 0)) {
                                                Q0 = null;
                                            }
                                            if (Q0 != null) {
                                                v2Var.n(Q0);
                                                f0Var = f0Var3;
                                                if (f0Var == null && pt0.f0.f358209b1.d()) {
                                                    i18++;
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "update talker failed, msgLocalId:" + v2Var.f415016n + ", msgSvrId: " + v2Var.f415004c + '}');
                                                }
                                            }
                                        }
                                        f0Var = null;
                                        if (f0Var == null) {
                                            i18++;
                                            com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "update talker failed, msgLocalId:" + v2Var.f415016n + ", msgSvrId: " + v2Var.f415004c + '}');
                                        }
                                    }
                                    long j19 = v2Var.K;
                                    if (j19 > 0) {
                                        try {
                                            f9Var2 = pt0.f0.f358209b1.n("talker-ignore", j19);
                                        } catch (java.lang.Throwable unused2) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "getMsgByForwardMsgLocalId error, msgLocalId: " + v2Var.K);
                                            f9Var2 = null;
                                        }
                                        if (f9Var2 != null && (Q02 = f9Var2.Q0()) != null) {
                                            if (!(Q02.length() > 0)) {
                                                Q02 = null;
                                            }
                                            if (Q02 != null) {
                                                v2Var.l(tg3.l1.a(f9Var2));
                                                f0Var2 = f0Var3;
                                                if (f0Var2 == null && pt0.f0.f358209b1.d()) {
                                                    i19++;
                                                    com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "update talker failed, forwardMsgLocalId:" + v2Var.K);
                                                }
                                            }
                                        }
                                        f0Var2 = null;
                                        if (f0Var2 == null) {
                                            i19++;
                                            com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "update talker failed, forwardMsgLocalId:" + v2Var.K);
                                        }
                                    }
                                    ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                                    boolean C = t21.o2.Ui().C(v2Var);
                                    if (C) {
                                        i27++;
                                    } else {
                                        i17++;
                                    }
                                    z18 = z18 && C;
                                    i29++;
                                    currentTimeMillis = j17;
                                    i28 = 0;
                                    z17 = false;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    th6 = th;
                                    try {
                                        throw th6;
                                    } catch (java.lang.Throwable th8) {
                                        vz5.b.a(w17, th6);
                                        throw th8;
                                    }
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            z19 = false;
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", e, "", new java.lang.Object[0]);
                            if (z18) {
                            }
                            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
                            pt0.p.f358218a1.b("videoinfo2", r3, currentTimeMillis2, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? 0L : i27 + i17);
                            if (pt0.f0.f358209b1.d()) {
                                com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                                msgRefactorReportStruct.p("videomsg_dataclean_error");
                                msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                                msgRefactorReportStruct.f59285n = i17;
                                msgRefactorReportStruct.f59286o = i18;
                                msgRefactorReportStruct.k();
                                com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                                msgRefactorReportStruct2.p("videomsg_forward_dataclean_error");
                                msgRefactorReportStruct2.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                                msgRefactorReportStruct2.f59285n = i17;
                                msgRefactorReportStruct2.f59286o = i19;
                                msgRefactorReportStruct2.k();
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "doWork done, time cost: " + currentTimeMillis2 + ", success: " + r3 + ", failCount: " + i17 + ", forwardErrorCount: " + i19 + ", successCount: " + i27 + ", isDataEmpty:" + z17 + ", firstFileName:" + str);
                            return true;
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                    }
                }
                j17 = currentTimeMillis;
                try {
                    w17.close();
                    vz5.b.a(w17, null);
                    com.tencent.mm.sdk.platformtools.u3.l(c0Var);
                    z19 = false;
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    th6 = th;
                    throw th6;
                }
            } finally {
                com.tencent.mm.sdk.platformtools.u3.l(c0Var);
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            j17 = currentTimeMillis;
            str = "";
            z17 = true;
            z18 = true;
            i17 = 0;
            i18 = 0;
            i19 = 0;
            i27 = 0;
        }
        boolean z27 = (z18 || !z17) ? z19 : true;
        long currentTimeMillis22 = java.lang.System.currentTimeMillis() - j17;
        pt0.p.f358218a1.b("videoinfo2", z27, currentTimeMillis22, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? 0L : i27 + i17);
        if (pt0.f0.f358209b1.d() && i17 > 0) {
            com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
            msgRefactorReportStruct3.p("videomsg_dataclean_error");
            msgRefactorReportStruct3.q(com.tencent.mm.sdk.platformtools.z.f193109e);
            msgRefactorReportStruct3.f59285n = i17;
            msgRefactorReportStruct3.f59286o = i18;
            msgRefactorReportStruct3.k();
            com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct22 = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
            msgRefactorReportStruct22.p("videomsg_forward_dataclean_error");
            msgRefactorReportStruct22.q(com.tencent.mm.sdk.platformtools.z.f193109e);
            msgRefactorReportStruct22.f59285n = i17;
            msgRefactorReportStruct22.f59286o = i19;
            msgRefactorReportStruct22.k();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.VideoInfoDataCleanWorkManager", "doWork done, time cost: " + currentTimeMillis22 + ", success: " + z27 + ", failCount: " + i17 + ", forwardErrorCount: " + i19 + ", successCount: " + i27 + ", isDataEmpty:" + z17 + ", firstFileName:" + str);
        return true;
    }

    @Override // yk.v
    public java.util.List b() {
        return kz5.b0.c("videoinfo2");
    }
}
