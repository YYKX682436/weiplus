package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j3 f139615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.pm.PackageInfo f139617f;

    public d3(com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, java.lang.String str, android.content.pm.PackageInfo packageInfo) {
        this.f139615d = j3Var;
        this.f139616e = str;
        this.f139617f = packageInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.pm.PackageInfo pkgInfo = this.f139617f;
        kotlin.jvm.internal.o.f(pkgInfo, "$pkgInfo");
        com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var = this.f139615d;
        java.lang.String str = this.f139616e;
        java.lang.String k17 = j3Var.k(str);
        android.content.pm.ApplicationInfo applicationInfo = pkgInfo.applicationInfo;
        if (com.tencent.mm.vfs.w6.d(applicationInfo != null ? applicationInfo.sourceDir : null, k17, false) <= 0) {
            com.tencent.mars.xlog.Log.e("patchApkChannel", "apkApplyPatch failed: COPY FILE ERROR ");
            return;
        }
        ((uz.a2) ((vz.y1) i95.n0.c(vz.y1.class))).getClass();
        try {
            e02.j.a(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(k17)), "10000145");
        } catch (e02.d | java.io.IOException unused) {
        }
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((uz.a2) y1Var).getClass();
        g02.c cVar = j3Var.f139694e;
        k02.l.b(context, k17, new k02.i(cVar));
        u43.b bVar = new u43.b();
        bVar.field_isServerPatch = false;
        bVar.field_pkgName = str;
        bVar.field_taskStatus = 2;
        bVar.field_newChannelApkPath = k17;
        bVar.field_startTime = java.lang.System.currentTimeMillis();
        j3Var.j(cVar, bVar);
        ((u43.a) i95.n0.c(u43.a.class)).ya(bVar);
    }
}
