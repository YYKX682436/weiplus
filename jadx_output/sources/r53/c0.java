package r53;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r53.c0 f392646a = new r53.c0();

    public static final void a(r53.c0 c0Var, java.lang.String str) {
        c0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.pm.PackageInfo a17 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("LocalGameReportUtil", "gamelog.report32418 pkgName = " + str + "  pkgInfo is null can not get it");
            return;
        }
        android.content.pm.ApplicationInfo applicationInfo = a17.applicationInfo;
        kotlin.jvm.internal.o.d(applicationInfo);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(applicationInfo.sourceDir);
        if (r6Var.m()) {
            ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
            b(str, e02.k.a(r6Var));
        } else {
            b(str, null);
        }
        p43.e eVar = new p43.e();
        eVar.field_pkgName = str;
        eVar.field_lastReportTimeStamp = java.lang.System.currentTimeMillis();
        p43.h hVar = (p43.h) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).aj();
        l75.k0 k0Var = hVar.f351767d;
        long b17 = k0Var.b();
        try {
            hVar.f351768e.d(eVar);
            k0Var.w(java.lang.Long.valueOf(b17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdate patchInfo =");
            sb6.append("pkgName: " + eVar.field_pkgName + "; lastReportTimeStamp : " + eVar.field_lastReportTimeStamp);
            com.tencent.stubs.logger.Log.i("LocalGameReportInfoDaoImpl", sb6.toString());
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }

    public static final void b(java.lang.String pkgName, java.lang.String str) {
        kotlin.jvm.internal.o.g(pkgName, "pkgName");
        com.tencent.mars.xlog.Log.i("LocalGameReportUtil", "gamelog.report32418 pkgName = " + pkgName + ", channel = " + str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(32418, 1, pkgName, str);
    }
}
