package zv1;

/* loaded from: classes10.dex */
public interface d {
    com.tencent.mm.plugin.clean.cache.CacheClassifyType a();

    default java.util.Map b() {
        jz5.l lVar;
        zv1.f1 f1Var = (zv1.f1) i95.n0.c(zv1.f1.class);
        com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType = a();
        ((yv1.h) f1Var).getClass();
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        java.util.List b17 = zv1.i1.f476306a.b(cacheType);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            jz5.l lVar2 = (jz5.l) it.next();
            java.lang.Object obj = lVar2.f302834e;
            if (obj == null) {
                lVar = null;
            } else {
                lVar = new jz5.l(((com.tencent.mm.vfs.c6) obj).f212873a, kz5.b0.c(lVar2.f302833d));
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return kz5.c1.q(arrayList);
    }

    default long c(long j17, com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17) {
        return 0L;
    }

    default zv1.w0 d() {
        return null;
    }

    default java.util.List e() {
        zv1.f1 f1Var = (zv1.f1) i95.n0.c(zv1.f1.class);
        com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType = a();
        ((yv1.h) f1Var).getClass();
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        java.util.List b17 = zv1.i1.f476306a.b(cacheType);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((jz5.l) it.next()).f302833d);
        }
        return arrayList;
    }
}
