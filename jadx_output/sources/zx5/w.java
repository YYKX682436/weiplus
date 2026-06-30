package zx5;

/* loaded from: classes13.dex */
public class w implements com.tencent.xweb.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final zx5.f f477278a;

    /* renamed from: b, reason: collision with root package name */
    public final zx5.x f477279b;

    public w(zx5.f fVar, zx5.x xVar) {
        this.f477278a = fVar;
        this.f477279b = xVar;
    }

    @Override // com.tencent.xweb.b2
    public void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadStarted, type:");
        sb6.append(i17);
        sb6.append(", config:");
        zx5.f fVar = this.f477278a;
        sb6.append(fVar.toString());
        by5.c4.f("XWebRuntimeDownloadListener", sb6.toString());
        if (fVar.f477231d) {
            com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
            if (n1Var != null) {
                n1Var.b(577L, 25L, 1L);
            }
        } else {
            com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
            if (n1Var2 != null) {
                n1Var2.b(577L, 9L, 1L);
            }
        }
        by5.c4.f("XWebRuntimeDownloadListener", "onXWebUpdateStarted");
        if (by5.d4.a("XWEB_USER_INFO", false).getInt("USER_ID", 0) != 0) {
            return;
        }
        by5.s0.e(1749L, 20L, 1L);
    }

    @Override // com.tencent.xweb.b2
    public void b(int i17) {
        by5.c4.b("XWebRuntimeDownloadListener", "onXWebUpdateProgress, progress:" + i17);
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateProgress, percentage:" + i17);
        zx5.i0.d("updating", i17, 0);
        yu5.c.b(new zx5.g0(i17));
    }

    @Override // com.tencent.xweb.b2
    public void c(com.tencent.xweb.c2 c2Var) {
        by5.c4.f("XWebRuntimeDownloadListener", "onDownloadFailed");
        zx5.f fVar = this.f477278a;
        if (fVar.f477231d) {
            com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
            if (n1Var != null) {
                n1Var.b(577L, 26L, 1L);
            }
        } else {
            com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
            if (n1Var2 != null) {
                n1Var2.b(577L, 10L, 1L);
            }
        }
        xx5.h.a(c2Var, fVar);
        f(-1, fVar.f477228a);
    }

    @Override // com.tencent.xweb.b2
    public void d(com.tencent.xweb.c2 c2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadCompleted, apkVersion:");
        zx5.f fVar = this.f477278a;
        sb6.append(fVar.f477235h);
        by5.c4.f("XWebRuntimeDownloadListener", sb6.toString());
        android.content.SharedPreferences sharedPreferences = by5.w3.f36610a.f36613a;
        int i17 = sharedPreferences.getInt("VERSION", 0);
        java.lang.String str = "";
        java.lang.String string = sharedPreferences.getString("DATE", "");
        int i18 = sharedPreferences.getInt("COUNT", 0);
        try {
            str = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        } catch (java.lang.Throwable unused) {
        }
        int i19 = fVar.f477235h;
        int i27 = (i17 == i19 && string.equals(str)) ? i18 + 1 : 1;
        by5.c4.f("XWebDownloadLimiter", "Count download.[mVersion:" + i17 + "][cVersion:" + i19 + "][mDate:" + string + "][cDate:" + str + "][mCount:" + i18 + "][cCount:" + i27 + "]");
        sharedPreferences.edit().putInt("VERSION", i19).putInt("COUNT", i27).putString("DATE", str).apply();
        if (fVar.f477231d) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - c2Var.f220228f;
            com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
            if (n1Var != null && currentTimeMillis > 0 && currentTimeMillis < 600000) {
                n1Var.a(nd1.a2.CTRL_INDEX, nd1.a2.CTRL_INDEX, 27, 28, 1, (int) currentTimeMillis);
            }
        } else {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - c2Var.f220228f;
            com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
            if (n1Var2 != null && currentTimeMillis2 > 0 && currentTimeMillis2 < 600000) {
                n1Var2.a(nd1.a2.CTRL_INDEX, nd1.a2.CTRL_INDEX, 11, 12, 1, (int) currentTimeMillis2);
            }
        }
        xx5.h.a(c2Var, fVar);
        new zx5.v(this).e(new java.lang.Void[0]);
    }

    @Override // com.tencent.xweb.b2
    public void e() {
        by5.c4.f("XWebRuntimeDownloadListener", "onDownloadCancelled");
        by5.c4.f("XWebRuntimeDownloadListener", "onXWebUpdateCancelled");
        zx5.j0.a();
        zx5.i0.a();
    }

    public void f(int i17, by5.l0 l0Var) {
        by5.c4.f("XWebRuntimeDownloadListener", "onXWebUpdateFailed, errorCode:" + i17);
        if (l0Var != null) {
            l0Var.P(i17);
        }
        zx5.j0.a();
        zx5.i0.c(3);
    }
}
