package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f153135d;

    public u(long j17) {
        this.f153135d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.vfs.r6 r6Var;
        com.tencent.mm.vfs.r6 r6Var2;
        com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b("hprofs");
        if (b17 != null) {
            b17.q(new android.os.CancellationSignal());
        }
        java.lang.String format = ((java.text.SimpleDateFormat) ((jz5.n) com.tencent.mm.plugin.performance.watchdogs.w.f153150g).getValue()).format(java.util.Calendar.getInstance().getTime());
        try {
            r6Var = com.tencent.mm.vfs.r6.j(xi.k.f454661e.f("MLP", false));
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.MemoryLimitPublisher", th6, "", new java.lang.Object[0]);
            r6Var = null;
        }
        if (r6Var != null) {
            if (r6Var.m()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MemoryLimitPublisher", "HPROF file exists, delete and recreate: %s", r6Var.o());
                r6Var.l();
            }
            r6Var2 = r6Var;
        } else {
            r6Var2 = null;
        }
        if (r6Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryLimitPublisher", "prepare hprof file failed, see log above");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "start fork dump heap: %s", r6Var2.o());
        byte[] bArr = com.tencent.mm.plugin.expansions.i0.f99751a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            java.lang.String u17 = r6Var2.u();
            kotlin.jvm.internal.o.f(u17, "getPath(...)");
            if (com.tencent.matrix.resource.MemoryUtil.h(u17, 600L)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "dump heap success");
                com.tencent.mm.plugin.performance.watchdogs.w wVar = com.tencent.mm.plugin.performance.watchdogs.w.f153144a;
                java.lang.String o17 = r6Var2.o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                com.tencent.mm.plugin.performance.watchdogs.s sVar = com.tencent.mm.plugin.performance.watchdogs.s.f153121e;
                long j17 = this.f153135d;
                kotlin.jvm.internal.o.d(format);
                com.tencent.mm.plugin.performance.watchdogs.w.c(wVar, o17, sVar, j17, format);
                if (com.tencent.mm.plugin.performance.watchdogs.w.f153145b) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "copy to external cache");
                    sp3.d.b(new com.tencent.mm.vfs.r6(r6Var2.o()));
                } else {
                    int hashCode = r6Var2.hashCode();
                    long j18 = this.f153135d;
                    java.lang.String o18 = r6Var2.o();
                    kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                    com.tencent.mm.plugin.performance.watchdogs.w.b(wVar, hashCode, j18, o18);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MemoryLimitPublisher", "dump heap failed");
                com.tencent.mm.plugin.performance.watchdogs.w wVar2 = com.tencent.mm.plugin.performance.watchdogs.w.f153144a;
                com.tencent.mm.plugin.performance.watchdogs.s sVar2 = com.tencent.mm.plugin.performance.watchdogs.s.f153122f;
                long j19 = this.f153135d;
                kotlin.jvm.internal.o.d(format);
                com.tencent.mm.plugin.performance.watchdogs.w.c(wVar2, "[dump failed]", sVar2, j19, format);
            }
            com.tencent.mm.plugin.performance.watchdogs.w.f153146c.set(false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MemoryLimitPublisher", e17, "dump heap failed with exception", new java.lang.Object[0]);
            com.tencent.mm.plugin.performance.watchdogs.w wVar3 = com.tencent.mm.plugin.performance.watchdogs.w.f153144a;
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            java.lang.String t17 = r26.i0.t(r26.i0.u(stackTraceString, '\n', ';', false, 4, null), "\t", "", false);
            com.tencent.mm.plugin.performance.watchdogs.s sVar3 = com.tencent.mm.plugin.performance.watchdogs.s.f153123g;
            long j27 = this.f153135d;
            kotlin.jvm.internal.o.d(format);
            com.tencent.mm.plugin.performance.watchdogs.w.c(wVar3, t17, sVar3, j27, format);
            com.tencent.mm.plugin.performance.watchdogs.w.f153146c.set(false);
        }
    }
}
