package xn1;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xn1.b f455454a = new xn1.b();

    public static void c(xn1.b bVar, int i17, int i18, java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num, java.lang.Long l19, java.lang.Long l27, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            str = null;
        }
        if ((i19 & 8) != 0) {
            l17 = null;
        }
        if ((i19 & 16) != 0) {
            l18 = null;
        }
        if ((i19 & 32) != 0) {
            num = null;
        }
        if ((i19 & 64) != 0) {
            l19 = null;
        }
        if ((i19 & 128) != 0) {
            l27 = null;
        }
        bVar.getClass();
        com.tencent.mm.autogen.mmdata.rpt.BackUpMigrationOneReportStruct backUpMigrationOneReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BackUpMigrationOneReportStruct();
        backUpMigrationOneReportStruct.f55359d = i17;
        backUpMigrationOneReportStruct.f55360e = i18;
        backUpMigrationOneReportStruct.f55361f = num != null ? num.intValue() : 0;
        backUpMigrationOneReportStruct.f55362g = l17 != null ? l17.longValue() : 0L;
        if (str == null) {
            str = "";
        }
        backUpMigrationOneReportStruct.f55364i = backUpMigrationOneReportStruct.b("SessionID", str, true);
        backUpMigrationOneReportStruct.f55363h = l18 != null ? l18.longValue() : 0L;
        backUpMigrationOneReportStruct.f55365j = l19 != null ? l19.longValue() : 0L;
        backUpMigrationOneReportStruct.f55366k = l27 != null ? l27.longValue() : 0L;
        backUpMigrationOneReportStruct.k();
        java.lang.String n17 = backUpMigrationOneReportStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.BackUpReportHelper", "report%s %s", 26824, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }

    public final void a(int i17, int i18, java.lang.String str) {
        c(this, i17, i18, str, null, null, null, null, null, 248, null);
    }

    public final void b(int i17, int i18, java.lang.String str, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num) {
        c(this, i17, i18, str, l17, l18, num, null, null, 192, null);
    }
}
