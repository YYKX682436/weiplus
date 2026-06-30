package fm;

/* loaded from: classes7.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final fm.c0 f263975d = new fm.c0();

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int i18;
        k65.l lVar = k65.l.f304617a;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.vfs.r6 uncompressedStringsDir = j65.b.f297918g;
            kotlin.jvm.internal.o.f(uncompressedStringsDir, "uncompressedStringsDir");
            synchronized (k65.l.f304618b) {
                i17 = 0;
                try {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    i18 = 0;
                }
                if (uncompressedStringsDir.m()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.vfs.r6[] G = uncompressedStringsDir.G();
                    if (G != null) {
                        i18 = 0;
                        for (com.tencent.mm.vfs.r6 r6Var : G) {
                            try {
                                if (r6Var.y()) {
                                    k65.l lVar2 = k65.l.f304617a;
                                    long d17 = lVar2.d(r6Var);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseStringConstant", "cleanupStale remove version dir: " + r6Var.o() + ", lastUsedMs=" + d17);
                                    if (d17 >= 0 && currentTimeMillis - d17 > 2592000000L) {
                                        java.lang.String name = r6Var.getName();
                                        kotlin.jvm.internal.o.f(name, "getName(...)");
                                        com.tencent.mm.vfs.w6.f(r6Var.o());
                                        com.tencent.mm.vfs.r6 c17 = lVar2.c(name);
                                        if (c17.m()) {
                                            com.tencent.mm.vfs.w6.h(c17.o());
                                        }
                                        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(lVar2.b(), name);
                                        if (r6Var2.m()) {
                                            com.tencent.mm.vfs.w6.h(r6Var2.o());
                                        }
                                        i18++;
                                    }
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMBaseStringConstant", th, "cleanupStaleUncompressedCache", new java.lang.Object[0]);
                                i17 = i18;
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseStringConstant", "checkCleanMMStringResource: " + i17);
                            }
                        }
                        k65.l.f304617a.a(uncompressedStringsDir);
                        i17 = i18;
                    }
                } else {
                    uncompressedStringsDir.J();
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseStringConstant", "checkCleanMMStringResource: " + i17);
        }
    }
}
