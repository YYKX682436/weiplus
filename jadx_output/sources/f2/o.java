package f2;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.r0 f258815a = new f2.n(kotlinx.coroutines.q0.f310567d);

    public o(f2.d asyncTypefaceCache, oz5.l injectedContext, int i17, kotlin.jvm.internal.i iVar) {
        asyncTypefaceCache = (i17 & 1) != 0 ? new f2.d() : asyncTypefaceCache;
        injectedContext = (i17 & 2) != 0 ? oz5.m.f350329d : injectedContext;
        kotlin.jvm.internal.o.g(asyncTypefaceCache, "asyncTypefaceCache");
        kotlin.jvm.internal.o.g(injectedContext, "injectedContext");
        kotlinx.coroutines.z0.a(f258815a.plus(injectedContext).plus(new kotlinx.coroutines.s3((kotlinx.coroutines.r2) injectedContext.get(kotlinx.coroutines.q2.f310571d))));
    }
}
