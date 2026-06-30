package yk;

/* loaded from: classes12.dex */
public final class b extends yk.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // yk.v
    public boolean a() {
        long j17;
        long j18;
        boolean z17;
        long j19;
        long j27;
        long j28;
        long j29;
        jz5.f0 f0Var;
        com.tencent.mm.storage.f9 f9Var;
        if (!gm0.j1.a()) {
            return false;
        }
        if (pt0.p.f358218a1.a("appattach")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "clean is already done");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "start doWork");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
        yk.a aVar = new yk.a(cancellationSignal);
        com.tencent.mm.sdk.platformtools.u3.i(aVar, 5000L);
        try {
            android.database.Cursor L0 = com.tencent.mm.pluginsdk.model.app.u5.wi().L0(com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53698m.a(), cancellationSignal);
            if (L0 != null) {
                j17 = L0.getCount();
                int i17 = 0;
                z17 = true;
                j18 = 0;
                j19 = 0;
                j27 = 0;
                j28 = 0;
                j29 = 0;
                while (L0.moveToNext()) {
                    try {
                        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
                        dVar.convertFrom(L0);
                        dVar.field_msgInfoTalker = "";
                        try {
                            f9Var = pt0.f0.f358209b1.n("talker-ignore", dVar.field_msgInfoId);
                        } catch (java.lang.Throwable unused) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "getMsgById error, msgId: " + dVar.field_msgInfoId);
                            f9Var = null;
                        }
                        j18++;
                        if (f9Var == null || f9Var.getMsgId() <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "get error msg, " + dVar.field_msgInfoId);
                            j28++;
                            boolean update = com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
                            if (update) {
                                j27++;
                            } else {
                                j19++;
                            }
                            z17 = z17 && update;
                        } else {
                            dVar.field_msgInfoTalker = f9Var.Q0();
                            if (com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0])) {
                                j27++;
                            } else {
                                j19++;
                                z17 = false;
                            }
                        }
                        if (i17 == 0) {
                            j29 = dVar.systemRowid;
                        }
                        i17++;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        try {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", th, "", new java.lang.Object[0]);
                            com.tencent.mm.sdk.platformtools.u3.l(aVar);
                            long j37 = j18;
                            long j38 = j19;
                            long j39 = j27;
                            long j47 = j28;
                            long j48 = j29;
                            if (z17) {
                            }
                            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                            pt0.p.f358218a1.b("appattach", r15, currentTimeMillis3, java.lang.Long.valueOf(currentTimeMillis2), j17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "doWork done, time cost: " + currentTimeMillis3 + ", result:" + j17 + '-' + j37 + '-' + j39 + '-' + j38 + '-' + j47 + '-' + r15 + ", firstSystemRowId:" + j48);
                            return j17 > 0 ? true : true;
                        } catch (java.lang.Throwable th7) {
                            com.tencent.mm.sdk.platformtools.u3.l(aVar);
                            throw th7;
                        }
                    }
                }
                L0.close();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
                j17 = 0;
                j18 = 0;
                z17 = true;
                j19 = 0;
                j27 = 0;
                j28 = 0;
                j29 = 0;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "cursor error");
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            j17 = 0;
            j18 = 0;
            z17 = true;
            j19 = 0;
            j27 = 0;
            j28 = 0;
            j29 = 0;
        }
        com.tencent.mm.sdk.platformtools.u3.l(aVar);
        long j372 = j18;
        long j382 = j19;
        long j392 = j27;
        long j472 = j28;
        long j482 = j29;
        boolean z18 = !z17 && j17 <= 0;
        long currentTimeMillis32 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        pt0.p.f358218a1.b("appattach", z18, currentTimeMillis32, java.lang.Long.valueOf(currentTimeMillis2), j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "doWork done, time cost: " + currentTimeMillis32 + ", result:" + j17 + '-' + j372 + '-' + j392 + '-' + j382 + '-' + j472 + '-' + z18 + ", firstSystemRowId:" + j482);
        if (j17 > 0 || j372 == j392 || !pt0.f0.f358209b1.d()) {
            return true;
        }
        com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
        msgRefactorReportStruct.p("appmsg_dataclean_error");
        msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
        msgRefactorReportStruct.f59285n = (int) currentTimeMillis32;
        msgRefactorReportStruct.f59286o = (int) j372;
        msgRefactorReportStruct.f59287p = (int) (j382 + j472);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('-');
        sb6.append(j372);
        sb6.append('-');
        sb6.append(j392);
        sb6.append('-');
        sb6.append(j382);
        sb6.append('-');
        sb6.append(j472);
        msgRefactorReportStruct.r(sb6.toString());
        msgRefactorReportStruct.s(java.lang.String.valueOf(j382));
        msgRefactorReportStruct.t(java.lang.String.valueOf(j472));
        msgRefactorReportStruct.k();
        return true;
    }

    @Override // yk.v
    public java.util.List b() {
        return kz5.b0.c("appattach");
    }
}
