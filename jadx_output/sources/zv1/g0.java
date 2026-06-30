package zv1;

/* loaded from: classes15.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zv1.g0 f476300a = new zv1.g0();

    public static long d(zv1.g0 g0Var, zv1.r continuation, java.util.List paths, boolean z17, int i17, java.lang.Object obj) {
        boolean z18;
        long j17;
        if ((i17 & 4) != 0) {
            int i18 = zv1.f1.f476299w1;
            ((yv1.h) ((zv1.f1) i95.n0.c(zv1.f1.class))).getClass();
            boolean z19 = zv1.s.f476367f;
            z18 = kotlin.jvm.internal.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_auto_clean_cache_fast_list", "1"), "1");
        } else {
            z18 = z17;
        }
        g0Var.getClass();
        kotlin.jvm.internal.o.g(continuation, "continuation");
        kotlin.jvm.internal.o.g(paths, "paths");
        com.tencent.mm.plugin.clean.cache.CacheClassifyType a17 = continuation.f476359a.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "scanSizeForPaths: " + a17 + ", pathSize=" + paths.size() + ", useFastList=" + z18);
        if (paths.isEmpty()) {
            return 0L;
        }
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = continuation.f476364f;
        boolean z27 = continuation.f476365g;
        try {
            if (z18 && !z27) {
                long e17 = com.tencent.mm.vfs.FastList.e(paths);
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                return e17;
            }
            java.util.ArrayList arrayList = z27 ? new java.util.ArrayList() : null;
            java.util.Iterator it = paths.iterator();
            long j18 = 0;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                j18 += g0Var.e(continuation, str, arrayList);
            }
            if (arrayList != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "=== Bgn Scan_Files_Analysis (" + a17 + ") ===");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("Scanned files: count=");
                sb6.append(arrayList.size());
                sb6.append(", totalSize=");
                long j19 = 1000000;
                sb6.append(j18 / j19);
                sb6.append(" MB, sumSize=");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList) {
                    if (!((zv1.a1) obj2).f476263d) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                long j27 = 0;
                while (it6.hasNext()) {
                    j27 += ((zv1.a1) it6.next()).f476261b;
                }
                sb6.append(j27 / j19);
                sb6.append(" MB");
                com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", sb6.toString());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj3 : arrayList) {
                    zv1.a1 a1Var = (zv1.a1) obj3;
                    boolean z28 = false;
                    if (!a1Var.f476263d) {
                        jz5.l lVar = a1Var.f476264e;
                        if (lVar != null && ((java.lang.Boolean) lVar.f302833d).booleanValue()) {
                            z28 = true;
                        }
                    }
                    if (z28) {
                        arrayList3.add(obj3);
                    }
                }
                java.util.Iterator it7 = arrayList3.iterator();
                long j28 = 0;
                while (it7.hasNext()) {
                    j28 += ((zv1.a1) it7.next()).f476261b;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "Exempted files: exemptedCount=" + arrayList3.size() + ", exemptedSize=" + (j28 / j19) + " MB, rate=" + f476300a.c(j28, j18) + '%');
                j17 = 0;
                try {
                    zv1.a1.f476259f.b(continuation, arrayList, 0L);
                    com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "=== End Scan_Files_Analysis (" + a17 + ") ===\n");
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.e("MicroMsg.CleanCache.Utils", "scanSizeForPaths error: " + paths + ", error=" + e);
                    return j17;
                }
            }
            return j18;
        } catch (java.lang.Exception e19) {
            e = e19;
            j17 = 0;
        }
    }

    public final java.util.List a(zv1.r rVar, java.lang.String str) {
        java.lang.Object next;
        kz5.p0 p0Var = kz5.p0.f313996d;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                return p0Var;
            }
            if (r6Var.A()) {
                com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(str);
                if (m17 == null) {
                    return p0Var;
                }
                long j17 = m17.f213234d;
                long j18 = m17.f213235e;
                zv1.w0 d17 = rVar.f476359a.d();
                return kz5.b0.c(new zv1.e1(str, j17, j18, false, d17 != null ? d17.c(str) : null));
            }
            if (!r6Var.y()) {
                return p0Var;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.vfs.r6[] G = r6Var.G();
            if (G != null) {
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    com.tencent.wcdb.support.CancellationSignal cancellationSignal = rVar.f476364f;
                    if (cancellationSignal != null) {
                        cancellationSignal.throwIfCanceled();
                    }
                    zv1.g0 g0Var = f476300a;
                    java.lang.String o17 = r6Var2.o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    arrayList.addAll(g0Var.a(rVar, o17));
                }
            }
            if (rVar.f476361c) {
                com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = rVar.f476364f;
                if (cancellationSignal2 != null) {
                    cancellationSignal2.throwIfCanceled();
                }
                com.tencent.mm.vfs.x1 m18 = com.tencent.mm.vfs.w6.m(str);
                if (m18 != null) {
                    java.util.Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            long j19 = ((zv1.e1) next).f476295c;
                            do {
                                java.lang.Object next2 = it.next();
                                long j27 = ((zv1.e1) next2).f476295c;
                                if (j19 < j27) {
                                    next = next2;
                                    j19 = j27;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    zv1.e1 e1Var = (zv1.e1) next;
                    long j28 = e1Var != null ? e1Var.f476295c : 0L;
                    long j29 = m18.f213234d;
                    long j37 = m18.f213235e;
                    if (j37 >= j28) {
                        j28 = j37;
                    }
                    zv1.w0 d18 = rVar.f476359a.d();
                    arrayList.add(new zv1.e1(str, j29, j28, true, d18 != null ? d18.c(str) : null));
                }
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CleanCache.Utils", "collectFilesForTimeThreshold error: " + str + ", error=" + e17);
            return p0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x007b A[Catch: Exception -> 0x0063, TryCatch #7 {Exception -> 0x0063, blocks: (B:148:0x0056, B:112:0x006c, B:116:0x007b, B:118:0x0082, B:133:0x00b6, B:134:0x00fb), top: B:147:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0201 A[Catch: Exception -> 0x029b, TRY_LEAVE, TryCatch #2 {Exception -> 0x029b, blocks: (B:22:0x01ab, B:24:0x01b1, B:31:0x01c0, B:32:0x01c3, B:34:0x01c9, B:40:0x01df, B:42:0x01f2, B:46:0x0201, B:63:0x0237, B:64:0x0285, B:68:0x0297), top: B:21:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(zv1.r r31, java.lang.String r32, long r33, boolean r35, com.tencent.wcdb.support.CancellationSignal r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.g0.b(zv1.r, java.lang.String, long, boolean, com.tencent.wcdb.support.CancellationSignal, java.util.List):long");
    }

    public final java.lang.Float c(long j17, long j18) {
        if (j18 == 0) {
            return null;
        }
        return java.lang.Float.valueOf(ri.b0.f((((float) j17) * 100.0f) / ((float) j18), 0, 1, null));
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0050: MOVE (r1 I:??[long, double]) = (r10 I:??[long, double]), block:B:56:0x0050 */
    public final long e(zv1.r rVar, java.lang.String str, java.util.List list) {
        long j17;
        long j18;
        long j19 = 0;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                return 0L;
            }
            try {
                if (r6Var.A()) {
                    com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(str);
                    if (m17 == null) {
                        return 0L;
                    }
                    j18 = m17.f213234d;
                    if (j18 > 0 && list != null) {
                        long j27 = m17.f213235e;
                        zv1.w0 d17 = rVar.f476359a.d();
                        list.add(new zv1.a1(str, j18, j27, false, d17 != null ? d17.c(str) : null));
                    }
                } else {
                    if (!r6Var.y()) {
                        return 0L;
                    }
                    com.tencent.mm.vfs.r6[] G = r6Var.G();
                    if (G != null) {
                        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                            com.tencent.wcdb.support.CancellationSignal cancellationSignal = rVar.f476364f;
                            if (cancellationSignal != null) {
                                cancellationSignal.throwIfCanceled();
                            }
                            zv1.g0 g0Var = f476300a;
                            java.lang.String o17 = r6Var2.o();
                            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                            j19 += g0Var.e(rVar, o17, list);
                        }
                    }
                    if (!rVar.f476361c) {
                        return j19;
                    }
                    com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = rVar.f476364f;
                    if (cancellationSignal2 != null) {
                        cancellationSignal2.throwIfCanceled();
                    }
                    com.tencent.mm.vfs.x1 m18 = com.tencent.mm.vfs.w6.m(str);
                    if (m18 == null) {
                        return j19;
                    }
                    j18 = j19 + m18.f213234d;
                    if (list != null) {
                        long j28 = m18.f213235e;
                        zv1.w0 d18 = rVar.f476359a.d();
                        list.add(new zv1.a1(str, j18, j28, true, d18 != null ? d18.c(str) : null));
                    }
                }
                return j18;
            } catch (java.lang.Exception e17) {
                e = e17;
                j19 = j17;
                com.tencent.mars.xlog.Log.e("MicroMsg.CleanCache.Utils", "scanSizeRecursive error: " + str + ", error=" + e);
                return j19;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }
}
