package sq3;

/* loaded from: classes4.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PREDOWNLOAD_CHECK_DB_VERSION_INT;
        java.lang.Object m17 = c17.m(u3Var, 0);
        java.lang.String str = gm0.j1.u().h() + "PreDownloadCheck.db";
        if (!kotlin.jvm.internal.o.b(m17, 2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PreDownloadCheckDB", "diff version, delete old db;");
            com.tencent.mm.vfs.w6.h(str);
        }
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(sq3.e.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(sq3.e.class);
        }
        if (((sq3.e) a17).O6(str)) {
            gm0.j1.u().c().x(u3Var, 2);
        }
    }
}
