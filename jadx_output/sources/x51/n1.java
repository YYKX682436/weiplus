package x51;

/* loaded from: classes11.dex */
public class n1 {

    /* renamed from: b, reason: collision with root package name */
    public static final x51.n1 f452038b = new x51.n1();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f452039c = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: a, reason: collision with root package name */
    public l75.k0 f452040a;

    public final boolean a(l75.k0 k0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("TableIndexFixer", "[createIndex] rightTblName is wrong.");
            return false;
        }
        java.lang.String replaceAll = str3.replaceAll(str2, str);
        try {
            k0Var.A(str, replaceAll);
            e = null;
        } catch (java.lang.Exception e17) {
            e = e17;
            com.tencent.mars.xlog.Log.e("TableIndexFixer", "CREATE INDEX, failure! sql=%s %s", replaceAll, e);
            jx3.f.INSTANCE.idkeyStat(1457L, 5L, 1L, true);
            jx3.f.INSTANCE.d(20708, "1", 4, e.getMessage() + "sql=" + replaceAll);
        }
        if (e == null) {
            com.tencent.mars.xlog.Log.i("TableIndexFixer", "CREATE INDEX, successfully! %s => %s", str3, replaceAll);
        }
        return e == null;
    }

    public final boolean b(l75.k0 k0Var, java.lang.String str, java.lang.String str2) {
        try {
            k0Var.A(str2, "DROP INDEX " + str);
            e = null;
        } catch (java.lang.Exception e17) {
            e = e17;
            com.tencent.mars.xlog.Log.e("TableIndexFixer", "DROP INDEX, failure! indexName=%s %s", str, e);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1457L, 0L, 1L, true);
            fVar.d(20708, "1", 0, e.getMessage() + " indexName=" + str);
        }
        if (e == null) {
            com.tencent.mars.xlog.Log.i("TableIndexFixer", "DROP INDEX, successfully! indexName=%s, tblName=%s", str, str2);
        }
        return e == null;
    }

    public final int c(l75.k0 k0Var) {
        android.database.Cursor B = k0Var.B("select count(id) from ImgInfo2", null);
        try {
            B.moveToFirst();
            int i17 = B.getInt(0);
            B.close();
            return i17;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                try {
                    B.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public final int d(l75.k0 k0Var) {
        android.database.Cursor B = k0Var.B("select count(filename) from videoinfo2", null);
        try {
            B.moveToFirst();
            int i17 = B.getInt(0);
            B.close();
            return i17;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                try {
                    B.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
