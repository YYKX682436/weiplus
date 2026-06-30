package pt0;

/* loaded from: classes12.dex */
public interface p extends i95.m {

    /* renamed from: a1, reason: collision with root package name */
    public static final pt0.o f358218a1 = pt0.o.f358216a;

    static boolean B3(java.lang.String str) {
        return f358218a1.a(str);
    }

    static void G6(long j17, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var;
        f358218a1.getClass();
        if (j17 > 0) {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            if (e0Var.d()) {
                java.lang.String E0 = r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000);
                try {
                    f9Var = e0Var.o(str, j17, true);
                } catch (java.lang.Throwable unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DBDataClean.IDataCleanService", "checkMsgTalker error, msgLocalId: " + j17 + ", msgTalker: " + str);
                    f9Var = null;
                }
                if (f9Var == null || f9Var.getMsgId() <= 0 || kotlin.jvm.internal.o.b(f9Var.Q0(), str)) {
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.DBDataClean.IDataCleanService", "found different msgId:" + f9Var.getMsgId() + ", createTime: " + f9Var.getCreateTime() + ", talker[" + f9Var.Q0() + " -> " + str + "], stack: " + E0);
                if (c01.id.c() - f9Var.getCreateTime() > 1209600000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DBDataClean.IDataCleanService", "ignore report, createTime:" + f9Var.getCreateTime() + " msgId:" + f9Var.getMsgId());
                    return;
                }
                com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
                msgRefactorReportStruct.p("msg_check_talker");
                msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
                msgRefactorReportStruct.u(E0);
                msgRefactorReportStruct.f59279h = msgRefactorReportStruct.b("msgTalker", f9Var.Q0(), true);
                msgRefactorReportStruct.f59280i = f9Var.getMsgId();
                msgRefactorReportStruct.f59281j = f9Var.I0();
                msgRefactorReportStruct.f59278g = f9Var.getType();
                msgRefactorReportStruct.r(str);
                msgRefactorReportStruct.s(bm5.w.a(f9Var).name());
                msgRefactorReportStruct.t(java.lang.String.valueOf(f9Var.getCreateTime()));
                msgRefactorReportStruct.k();
            }
        }
    }
}
