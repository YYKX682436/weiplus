package zv1;

/* loaded from: classes15.dex */
public abstract class m {
    public static final long a(zv1.d dVar, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        return zv1.g0.d(zv1.g0.f476300a, new zv1.r(dVar, 0L, false, 0L, null, cancellationSignal, false, false, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, null), dVar.e(), false, 4, null);
    }

    public static final long b(zv1.d dVar, java.util.List taggedPaths, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        kotlin.jvm.internal.o.g(taggedPaths, "taggedPaths");
        return zv1.g0.d(zv1.g0.f476300a, new zv1.r(dVar, 0L, false, 0L, null, cancellationSignal, false, false, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, null), taggedPaths, false, 4, null);
    }

    public static final long c(zv1.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        if (!(dVar instanceof zv1.q)) {
            return 0L;
        }
        zv1.r rVar = ((zv1.c) ((zv1.q) dVar)).f476278a;
        java.lang.Long valueOf = rVar != null ? java.lang.Long.valueOf(rVar.f476362d) : null;
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    public static final zv1.d a(com.tencent.mm.plugin.clean.cache.CacheClassifyType type, zv1.a0 a0Var) {
        zv1.s sVar;
        if (((a0Var == null || (sVar = a0Var.f476257f) == null) ? 0 : sVar.f476378l) > 0) {
            kotlin.jvm.internal.o.g(type, "type");
            return zv1.k.a(zv1.k.f476312a, type, zv1.j0.f476310f, null, null, 12, null);
        }
        kotlin.jvm.internal.o.g(type, "type");
        return new zv1.f(type);
    }
}
