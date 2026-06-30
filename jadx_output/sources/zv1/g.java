package zv1;

/* loaded from: classes10.dex */
public final class g implements zv1.d {
    @Override // zv1.d
    public com.tencent.mm.plugin.clean.cache.CacheClassifyType a() {
        return com.tencent.mm.plugin.clean.cache.CacheClassifyType.FINDER;
    }

    @Override // zv1.d
    public java.util.Map b() {
        boolean z17;
        boolean z18;
        c50.o0 o0Var = (c50.o0) i95.n0.c(c50.o0.class);
        kz5.q0 q0Var = kz5.q0.f314001d;
        if (o0Var == null) {
            return q0Var;
        }
        c61.z1 z1Var = (c61.z1) o0Var;
        if (!z1Var.wi() || !z1Var.wi()) {
            return q0Var;
        }
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.w("Finder.FinderCacheCleanerService", "getTaggedCachePaths skipped: on main thread");
                return q0Var;
            }
        }
        com.tencent.mm.plugin.finder.assist.v2 v2Var = com.tencent.mm.plugin.finder.assist.v2.f102615a;
        if (!(com.tencent.mm.plugin.finder.assist.v2.f102618d > 0)) {
            return kz5.c1.k(new jz5.l("video", kz5.b0.c(com.tencent.mm.plugin.finder.assist.e9.f102140i)), new jz5.l("image", kz5.b0.c(com.tencent.mm.plugin.finder.assist.e9.f102139h)), new jz5.l("avatar", kz5.b0.c(com.tencent.mm.plugin.finder.assist.e9.f102141j)), new jz5.l("tmp", kz5.b0.c(com.tencent.mm.plugin.finder.assist.e9.f102143l)), new jz5.l("posting", kz5.c0.i(com.tencent.mm.plugin.finder.assist.e9.f102147p, com.tencent.mm.plugin.finder.assist.e9.f102146o)), new jz5.l("live", kz5.b0.c(com.tencent.mm.plugin.finder.assist.e9.f102135d)));
        }
        com.tencent.mars.xlog.Log.w("Finder.FinderCacheCleanerService", "getTaggedCachePaths skipped: finder UI is on screen");
        return q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zv1.d
    public long c(long j17, com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        if (z17) {
            return j17;
        }
        c50.o0 o0Var = (c50.o0) i95.n0.c(c50.o0.class);
        if (o0Var != null) {
            c61.z1 z1Var = (c61.z1) o0Var;
            if (z1Var.wi()) {
                if (!z1Var.wi()) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner skipped: switch off");
                } else {
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner dryRun expect=" + j17);
                        return j17;
                    }
                    if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                            objArr = true;
                        } else {
                            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                            objArr = false;
                        }
                        if (objArr == true || z65.c.a()) {
                            objArr2 = true;
                        } else {
                            kb2.b bVar = kb2.b.f306225a;
                            objArr2 = false;
                        }
                        if (objArr2 == false) {
                            com.tencent.mars.xlog.Log.w("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner skipped: on main thread, refuse to do IO here");
                        }
                    }
                    com.tencent.mm.plugin.finder.assist.v2 v2Var = com.tencent.mm.plugin.finder.assist.v2.f102615a;
                    if (com.tencent.mm.plugin.finder.assist.v2.f102618d > 0) {
                        com.tencent.mars.xlog.Log.w("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner skipped: finder UI is on screen, defer to next trigger");
                    } else {
                        long c17 = v2Var.c(cancellationSignal);
                        com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "runOnceForGlobalCleaner begin");
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (cancellationSignal != null) {
                            cancellationSignal.throwIfCanceled();
                        }
                        v2Var.a();
                        if (cancellationSignal != null) {
                            cancellationSignal.throwIfCanceled();
                        }
                        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
                        if (eVar != null) {
                            ((qs2.q) eVar).Bi();
                        }
                        if (cancellationSignal != null) {
                            cancellationSignal.throwIfCanceled();
                        }
                        v2Var.d();
                        for (com.tencent.mm.plugin.finder.assist.r2 r2Var : com.tencent.mm.plugin.finder.assist.e9.f102151t) {
                            com.tencent.mm.vfs.w6.u(r2Var.f102496a);
                        }
                        com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "runOnceForGlobalCleaner end cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                        long c18 = com.tencent.mm.plugin.finder.assist.v2.f102615a.c(cancellationSignal);
                        long j18 = c17 - c18;
                        r3 = j18 >= 0 ? j18 : 0L;
                        com.tencent.mars.xlog.Log.i("Finder.FinderCacheCleanerService", "cleanForGlobalCleaner expect=" + j17 + " before=" + c17 + " after=" + c18 + " cleaned=" + r3);
                    }
                }
                return r3;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCleanForSize skipped: service=");
        sb6.append(o0Var != null);
        sb6.append(", switch off");
        com.tencent.mars.xlog.Log.w("MicroMsg.CleanCache.FinderCacheCleaner", sb6.toString());
        return 0L;
    }

    @Override // zv1.d
    public java.util.List e() {
        return super.e();
    }
}
