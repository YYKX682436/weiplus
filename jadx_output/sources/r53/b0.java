package r53;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m53.x0 f392641d;

    public b0(m53.x0 x0Var) {
        this.f392641d = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p43.e eVar;
        java.util.LinkedList PackageInfoList = this.f392641d.f324167d;
        kotlin.jvm.internal.o.f(PackageInfoList, "PackageInfoList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : PackageInfoList) {
            java.lang.String str = ((m53.b5) obj).f323586e;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(obj);
            }
        }
        for (m53.b5 b5Var : kz5.n0.F0(arrayList, new r53.a0())) {
            com.tencent.mars.xlog.Log.i("LocalGameReportUtil", "gamelog.reportLocalGameStatus pkgName = " + b5Var.f323586e + "  Priority = " + b5Var.f323585d);
            p43.f aj6 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).aj();
            java.lang.String PackageName = b5Var.f323586e;
            kotlin.jvm.internal.o.f(PackageName, "PackageName");
            p43.h hVar = (p43.h) aj6;
            hVar.getClass();
            p43.e eVar2 = null;
            android.database.Cursor f17 = hVar.f351767d.f("SELECT * FROM LocalGameReport WHERE pkgName = " + d95.b0.O(PackageName), null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        eVar = new p43.e();
                        eVar.convertFrom(f17);
                    } else {
                        eVar = null;
                    }
                    vz5.b.a(f17, null);
                    eVar2 = eVar;
                } finally {
                }
            }
            r53.c0 c0Var = r53.c0.f392646a;
            if (eVar2 == null) {
                r53.c0.a(c0Var, b5Var.f323586e);
            } else if (com.tencent.mm.sdk.platformtools.t8.T0(java.lang.System.currentTimeMillis(), eVar2.field_lastReportTimeStamp)) {
                com.tencent.mars.xlog.Log.i("LocalGameReportUtil", "gamelog.report32418 pkgName = " + b5Var.f323586e + "  Priority = " + b5Var.f323585d + " today has already reported");
            } else {
                r53.c0.a(c0Var, b5Var.f323586e);
            }
        }
    }
}
