package qy1;

/* loaded from: classes8.dex */
public final class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f367722e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f367723d;

    static {
        java.lang.String createSQLs = l75.n0.getCreateSQLs(qy1.e.f367724v, "CgiReportLocalItemDataCache");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f367722e = new java.lang.String[]{createSQLs};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, qy1.e.f367724v, "CgiReportLocalItemDataCache", dm.v1.f240449m);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = qy1.e.f367724v;
        this.f367723d = db6;
    }

    public final int y0(java.util.List list) {
        int i17 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        l75.k0 k0Var = this.f367723d;
        long b17 = k0Var.b();
        try {
            try {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (z0(((java.lang.Number) it.next()).longValue())) {
                        i17++;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CgiLocalDataStorage", "deleteByLocalId err info = " + e17);
            }
            return i17;
        } finally {
            k0Var.w(java.lang.Long.valueOf(b17));
        }
    }

    public final boolean z0(long j17) {
        int i17;
        try {
            i17 = this.f367723d.delete("CgiReportLocalItemDataCache", "localItemReportId=?", new java.lang.String[]{"" + j17});
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiLocalDataStorage", "cur localId = " + j17 + ", delete err info = " + e17);
            i17 = 0;
        }
        return i17 > 0;
    }
}
