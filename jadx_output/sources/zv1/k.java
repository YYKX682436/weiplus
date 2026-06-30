package zv1;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final zv1.k f476312a = new zv1.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f476313b = jz5.h.b(zv1.i.f476304d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f476314c = jz5.h.b(zv1.j.f476307d);

    public static zv1.q0 a(zv1.k kVar, com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType, zv1.j0 policy, java.util.List additionalPaths, zv1.w0 w0Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            additionalPaths = kz5.p0.f313996d;
        }
        if ((i17 & 8) != 0) {
            w0Var = null;
        }
        kVar.getClass();
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        kotlin.jvm.internal.o.g(policy, "policy");
        kotlin.jvm.internal.o.g(additionalPaths, "additionalPaths");
        return new zv1.q0(cacheType, policy, additionalPaths, w0Var);
    }

    public final java.util.Map b() {
        return (java.util.Map) ((jz5.n) f476313b).getValue();
    }

    public final zv1.d a(com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType, zv1.a0 a0Var) {
        zv1.s sVar;
        zv1.s sVar2;
        zv1.s sVar3;
        zv1.s sVar4;
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        synchronized (b()) {
            zv1.k kVar = f476312a;
            if (kVar.b().containsKey(cacheType)) {
                return (zv1.d) kVar.b().get(cacheType);
            }
            int i17 = 3;
            switch (zv1.h.f476301a[cacheType.ordinal()]) {
                case 1:
                    com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType2 = com.tencent.mm.plugin.clean.cache.CacheClassifyType.MISC_LOG;
                    zv1.j0 j0Var = zv1.j0.f476308d;
                    kz5.p0 p0Var = kz5.p0.f313996d;
                    if (a0Var != null && (sVar = a0Var.f476257f) != null) {
                        i17 = sVar.f476375e;
                    }
                    zv1.l lVar = new zv1.l(i17);
                    kotlin.jvm.internal.o.g(cacheType2, "cacheType");
                    return new zv1.q0(cacheType2, j0Var, p0Var, lVar);
                case 2:
                    return a(kVar, com.tencent.mm.plugin.clean.cache.CacheClassifyType.MISC_MATRIX, zv1.j0.f476308d, null, null, 12, null);
                case 3:
                    return new zv1.e();
                case 4:
                    return new zv1.g();
                case 5:
                    return zv1.m.a(cacheType, a0Var);
                case 6:
                    return zv1.m.a(cacheType, a0Var);
                case 7:
                    return zv1.m.a(cacheType, a0Var);
                case 8:
                    return zv1.m.a(cacheType, a0Var);
                case 9:
                    return zv1.m.a(cacheType, a0Var);
                case 10:
                    return zv1.m.a(cacheType, a0Var);
                case 11:
                    return zv1.m.a(cacheType, a0Var);
                case 12:
                    return zv1.m.a(cacheType, a0Var);
                case 13:
                    return zv1.m.a(cacheType, a0Var);
                case 14:
                    int i18 = 0;
                    if (((a0Var == null || (sVar4 = a0Var.f476257f) == null) ? 0 : sVar4.f476377k) > 0) {
                        com.tencent.mm.plugin.clean.cache.CacheClassifyType type = com.tencent.mm.plugin.clean.cache.CacheClassifyType.OTHER;
                        zv1.j0 j0Var2 = zv1.j0.f476311g;
                        java.util.List b17 = kz5.b0.b();
                        com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType3 = com.tencent.mm.plugin.clean.cache.CacheClassifyType.MISC_LOG;
                        zv1.j0 j0Var3 = zv1.j0.f476308d;
                        kz5.p0 p0Var2 = kz5.p0.f313996d;
                        if (a0Var != null && (sVar3 = a0Var.f476257f) != null) {
                            i17 = sVar3.f476375e;
                        }
                        zv1.l lVar2 = new zv1.l(i17);
                        kotlin.jvm.internal.o.g(cacheType3, "cacheType");
                        lz5.e eVar = (lz5.e) b17;
                        eVar.add(new zv1.q0(cacheType3, j0Var3, p0Var2, lVar2));
                        eVar.add(a(kVar, com.tencent.mm.plugin.clean.cache.CacheClassifyType.MISC_MATRIX, j0Var3, null, null, 12, null));
                        if (a0Var != null && (sVar2 = a0Var.f476257f) != null) {
                            i18 = sVar2.f476378l;
                        }
                        if (i18 > 0) {
                            kotlin.jvm.internal.o.g(type, "type");
                            eVar.add(a(kVar, type, zv1.j0.f476310f, null, null, 12, null));
                        }
                        return new zv1.m0(type, j0Var2, kz5.b0.a(b17));
                    }
                    com.tencent.mm.plugin.clean.cache.CacheClassifyType type2 = com.tencent.mm.plugin.clean.cache.CacheClassifyType.OTHER;
                    kotlin.jvm.internal.o.g(type2, "type");
                    return new zv1.f(type2);
                default:
                    return null;
            }
        }
    }
}
