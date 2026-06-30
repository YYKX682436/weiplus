package yv1;

@j95.b
/* loaded from: classes15.dex */
public final class h extends i95.w implements zv1.f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f466060d = jz5.h.b(yv1.g.f466035d);

    public void Ai(com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType, zv1.d cleaner) {
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        kotlin.jvm.internal.o.g(cleaner, "cleaner");
        zv1.k kVar = zv1.k.f476312a;
        synchronized (kVar.b()) {
            kVar.b().put(cacheType, cleaner);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(6:46|47|48|49|50|51)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04ab, code lost:
    
        r2 = "MicroMsg.CleanCache.Mgr";
        r4 = r14;
        r1 = r15;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04a6, code lost:
    
        r2 = "MicroMsg.CleanCache.Mgr";
        r4 = r14;
        r1 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04de A[Catch: all -> 0x051e, TryCatch #27 {all -> 0x051e, blocks: (B:56:0x04d0, B:58:0x04de, B:59:0x04e3, B:61:0x04e1, B:242:0x04b9, B:243:0x04c0), top: B:38:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04e1 A[Catch: all -> 0x051e, TryCatch #27 {all -> 0x051e, blocks: (B:56:0x04d0, B:58:0x04de, B:59:0x04e3, B:61:0x04e1, B:242:0x04b9, B:243:0x04c0), top: B:38:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi(com.tencent.wcdb.support.CancellationSignal r36) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.h.Bi(com.tencent.wcdb.support.CancellationSignal):void");
    }

    public long wi(zv1.r continuation, java.util.List paths, long j17) {
        jz5.l c17;
        kotlin.jvm.internal.o.g(continuation, "continuation");
        kotlin.jvm.internal.o.g(paths, "paths");
        zv1.g0 g0Var = zv1.g0.f476300a;
        zv1.d dVar = continuation.f476359a;
        com.tencent.mm.plugin.clean.cache.CacheClassifyType a17 = dVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "deleteAllForPaths: " + a17 + ", pathSize=" + paths.size() + ", beforeTime=" + zv1.i0.a().format(java.lang.Long.valueOf(j17)));
        boolean z17 = continuation.f476365g;
        java.util.ArrayList arrayList = z17 ? new java.util.ArrayList() : null;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "=== Bgn Deleted_Files_Analysis (" + a17 + ") ===");
        }
        java.util.Iterator it = paths.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.wcdb.support.CancellationSignal cancellationSignal = continuation.f476364f;
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            j18 += g0Var.b(continuation, str, j17, continuation.f476361c, continuation.f476364f, arrayList);
            dVar = dVar;
            a17 = a17;
        }
        zv1.d dVar2 = dVar;
        com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheClassifyType = a17;
        long j19 = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Expect deleted size: ");
        long j27 = continuation.f476360b;
        sb6.append(j27 > 0 ? java.lang.Long.valueOf(j27 / 1000000) : "_");
        sb6.append("MB");
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "Actual deleted size: " + (j19 / 1000000) + "MB, rateToExpect=" + g0Var.c(j19, j27) + '%');
        if (arrayList != null) {
            zv1.a1.f476259f.b(continuation, arrayList, j17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((zv1.a1) next).f476262c <= j17) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((zv1.a1) obj).f476262c > j17) {
                    arrayList3.add(obj);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                zv1.a1 a1Var = (zv1.a1) obj2;
                zv1.w0 d17 = dVar2.d();
                if ((d17 == null || (c17 = d17.c(a1Var.f476260a)) == null || !((java.lang.Boolean) c17.f302833d).booleanValue()) ? false : true) {
                    arrayList4.add(obj2);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "Actual deleted file: olderCount=" + arrayList2.size() + ", newerCount=" + arrayList3.size() + ", exemptedCount=" + arrayList4.size());
            if (!arrayList3.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CleanCache.Utils", arrayList3.size() + " files after timeThreshold being deleted!");
            }
            if (!arrayList4.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CleanCache.Utils", arrayList4.size() + " files exempted being deleted!");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "=== End Deleted_Files_Analysis (" + cacheClassifyType + ") ===\n");
        }
        return j19;
    }
}
