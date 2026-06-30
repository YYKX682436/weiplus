package o63;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o63.i f343202a = new o63.i();

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        int n17 = j62.e.g().n();
        if (n17 == 0) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.o4.M(n17 + "_FinderReportInfoMap");
    }

    public final r45.ld6 b(java.lang.String processName) {
        byte[] j17;
        kotlin.jvm.internal.o.g(processName, "processName");
        try {
            com.tencent.mm.sdk.platformtools.o4 a17 = a();
            if (a17 == null || (j17 = a17.j(processName.concat("_finderReportStartActivityKey"))) == null) {
                return null;
            }
            r45.ld6 ld6Var = new r45.ld6();
            ld6Var.parseFrom(j17);
            return ld6Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderReportUtils", "getStartActivityInfo err " + e17.getMessage());
            return null;
        }
    }

    public final void c(java.lang.String processName) {
        kotlin.jvm.internal.o.g(processName, "processName");
        try {
            com.tencent.mm.sdk.platformtools.o4 a17 = a();
            if (a17 != null) {
                a17.remove(processName.concat("_finderReportStartActivityKey"));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderReportUtils", "resetStartActivityInfo err " + e17.getMessage());
        }
    }
}
