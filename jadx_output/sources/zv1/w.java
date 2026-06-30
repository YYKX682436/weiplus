package zv1;

/* loaded from: classes15.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final zv1.t f476387d = new zv1.t(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile zv1.w f476388e;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f476389a = jz5.h.b(zv1.u.f476380d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f476390b = jz5.h.b(zv1.v.f476383d);

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.wcdb.support.CancellationSignal f476391c;

    public w(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.util.Map r36, zv1.a0 r37, com.tencent.wcdb.support.CancellationSignal r38) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.w.a(java.util.Map, zv1.a0, com.tencent.wcdb.support.CancellationSignal):java.util.List");
    }

    public final java.util.Map b(java.util.Set set, zv1.a0 a0Var, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheClassifyType = (com.tencent.mm.plugin.clean.cache.CacheClassifyType) it.next();
            if (cacheClassifyType != com.tencent.mm.plugin.clean.cache.CacheClassifyType.NONE) {
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                zv1.d a17 = zv1.k.f476312a.a(cacheClassifyType, a0Var);
                if (a17 != null) {
                    linkedHashMap.put(cacheClassifyType, java.lang.Long.valueOf(zv1.m.a(a17, cancellationSignal)));
                }
            }
        }
        return linkedHashMap;
    }
}
