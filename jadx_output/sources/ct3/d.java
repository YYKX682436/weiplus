package ct3;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ct3.d f222303a = new ct3.d();

    public final void a(com.tencent.mm.storage.f9 f9Var, ot0.q qVar, int i17, long j17) {
        if (qVar == null) {
            return;
        }
        b(f9Var, new ct3.a(qVar), i17, j17);
    }

    public final void b(com.tencent.mm.storage.f9 f9Var, ct3.c cVar, int i17, long j17) {
        java.lang.Boolean bool;
        if (f9Var == null || cVar == null) {
            bool = null;
        } else {
            com.tencent.mm.autogen.mmdata.rpt.FileMsgActionReportStruct fileMsgActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FileMsgActionReportStruct();
            fileMsgActionReportStruct.f56378g = i17;
            fileMsgActionReportStruct.f56375d = fileMsgActionReportStruct.b("FileId", cVar.c(), true);
            fileMsgActionReportStruct.f56376e = cVar.b() == 1 ? 7 : 5;
            fileMsgActionReportStruct.f56377f = cVar.d();
            java.lang.String a17 = cVar.a();
            if (a17 == null) {
                a17 = "";
            }
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            java.lang.String lowerCase = a17.toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            fileMsgActionReportStruct.f56380i = fileMsgActionReportStruct.b("FileExt", lowerCase, true);
            fileMsgActionReportStruct.f56382k = 1L;
            fileMsgActionReportStruct.f56384m = fileMsgActionReportStruct.b("MsgSvrId", java.lang.String.valueOf(j17), true);
            fileMsgActionReportStruct.f56391t = fileMsgActionReportStruct.b("FileName", com.tencent.mm.vfs.w6.q(cVar.getTitle()), true);
            f222303a.d(fileMsgActionReportStruct, f9Var);
            fileMsgActionReportStruct.o();
            bool = java.lang.Boolean.valueOf(fileMsgActionReportStruct.k());
        }
        if (bool == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgActionReporter", "msg or content is null");
        }
    }

    public final void c(com.tencent.mm.storage.f9 f9Var, r45.gp0 gp0Var, int i17, int i18) {
        java.lang.Boolean bool;
        if (f9Var == null || gp0Var == null) {
            bool = null;
        } else {
            com.tencent.mm.autogen.mmdata.rpt.FileMsgActionReportStruct fileMsgActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FileMsgActionReportStruct();
            fileMsgActionReportStruct.f56378g = i17;
            fileMsgActionReportStruct.f56375d = fileMsgActionReportStruct.b("FileId", gp0Var.f375434s, true);
            fileMsgActionReportStruct.f56376e = i18;
            fileMsgActionReportStruct.f56377f = gp0Var.R;
            java.lang.String str = gp0Var.K;
            if (str == null) {
                str = "";
            }
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            fileMsgActionReportStruct.f56380i = fileMsgActionReportStruct.b("FileExt", lowerCase, true);
            fileMsgActionReportStruct.f56382k = 2L;
            fileMsgActionReportStruct.f56383l = fileMsgActionReportStruct.b("DataId", gp0Var.T, true);
            fileMsgActionReportStruct.f56384m = fileMsgActionReportStruct.b("MsgSvrId", java.lang.String.valueOf(f9Var.I0()), true);
            fileMsgActionReportStruct.f56391t = fileMsgActionReportStruct.b("FileName", com.tencent.mm.vfs.w6.q(gp0Var.f375404d), true);
            f222303a.d(fileMsgActionReportStruct, f9Var);
            fileMsgActionReportStruct.o();
            bool = java.lang.Boolean.valueOf(fileMsgActionReportStruct.k());
        }
        if (bool == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileMsgActionReporter", "msg or dataItem is null");
        }
    }

    public final void d(com.tencent.mm.autogen.mmdata.rpt.FileMsgActionReportStruct fileMsgActionReportStruct, com.tencent.mm.storage.f9 f9Var) {
        fileMsgActionReportStruct.f56379h = (c01.id.c() - f9Var.getCreateTime()) / 1000;
        fileMsgActionReportStruct.f56381j = fileMsgActionReportStruct.b("ChatName", f9Var.Q0(), true);
        fileMsgActionReportStruct.f56385n = f9Var.getCreateTime();
        fileMsgActionReportStruct.f56386o = c01.id.c();
        fileMsgActionReportStruct.f56387p = 202502L;
        fileMsgActionReportStruct.f56388q = fileMsgActionReportStruct.b("SenderUsername", f9Var.V1(), true);
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (str == null) {
            str = "";
        }
        fileMsgActionReportStruct.f56389r = fileMsgActionReportStruct.b("ActionUsername", str, true);
        fileMsgActionReportStruct.f56390s = fileMsgActionReportStruct.b("isThisDeviceUpload", f9Var.Z1() == 0 ? "1" : "0", true);
    }
}
