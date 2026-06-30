package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class q implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f192937d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f192938e = 0;

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.io.PrintWriter printWriter;
        java.lang.Exception e17;
        java.util.WeakHashMap weakHashMap = com.tencent.mm.sdk.platformtools.t.f192977a;
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        long j17 = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long j18 = j17 - freeMemory;
        com.tencent.mars.xlog.Log.i("MicroMsg.BitmapTracer", "Memory level: %s (+%s) / %s", com.tencent.mm.sdk.platformtools.t.a(j18), com.tencent.mm.sdk.platformtools.t.a(freeMemory), com.tencent.mm.sdk.platformtools.t.a(runtime.maxMemory()));
        if (!this.f192937d && j18 > 209715200) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f192938e > 180000) {
                java.lang.System.gc();
                this.f192938e = currentTimeMillis;
                return true;
            }
            java.io.PrintWriter printWriter2 = null;
            try {
                printWriter = new java.io.PrintWriter(new java.util.zip.GZIPOutputStream(com.tencent.mm.vfs.w6.K(lp0.b.D() + "BitmapTraces.txt.gz", false)));
                try {
                    try {
                        com.tencent.mm.sdk.platformtools.t.b(printWriter, 0L, -1);
                    } catch (java.lang.Exception e18) {
                        e17 = e18;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BitmapTracer", e17, "", new java.lang.Object[0]);
                        com.tencent.mm.sdk.platformtools.t8.v1(printWriter);
                        android.os.Debug.dumpHprofData(lp0.b.D() + "Memory.hprof");
                        this.f192937d = true;
                        return true;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    printWriter2 = printWriter;
                    com.tencent.mm.sdk.platformtools.t8.v1(printWriter2);
                    throw th;
                }
            } catch (java.lang.Exception e19) {
                printWriter = null;
                e17 = e19;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.tencent.mm.sdk.platformtools.t8.v1(printWriter2);
                throw th;
            }
            com.tencent.mm.sdk.platformtools.t8.v1(printWriter);
            try {
                android.os.Debug.dumpHprofData(lp0.b.D() + "Memory.hprof");
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BitmapTracer", e27, "", new java.lang.Object[0]);
            }
            this.f192937d = true;
        }
        return true;
    }
}
