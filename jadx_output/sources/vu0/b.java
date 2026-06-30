package vu0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.r0 f440052a;

    /* renamed from: b, reason: collision with root package name */
    public final xu0.a f440053b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f440054c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f440055d;

    public b(pp0.r0 r0Var, xu0.a requestListener) {
        kotlin.jvm.internal.o.g(requestListener, "requestListener");
        this.f440052a = r0Var;
        this.f440053b = requestListener;
        this.f440054c = new java.util.concurrent.ConcurrentHashMap();
        this.f440055d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public static final java.lang.String a(vu0.b bVar, java.lang.String str, java.lang.String str2, com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[] equalizerPeakingFilterParamsArr) {
        bVar.getClass();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A() || r6Var.C() <= 0 || equalizerPeakingFilterParamsArr == null) {
            return str;
        }
        java.lang.String a17 = uu0.l.a("wav", bVar.b(str, str2));
        boolean bj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).bj();
        com.tencent.maas.moviecomposing.VocalEnhancementParams vocalEnhancementParams = new com.tencent.maas.moviecomposing.VocalEnhancementParams();
        vocalEnhancementParams.f48435a = true;
        vocalEnhancementParams.f48436b = com.tencent.maas.moviecomposing.h.Peaking;
        vocalEnhancementParams.f48437c = equalizerPeakingFilterParamsArr;
        vocalEnhancementParams.f48439e = false;
        vocalEnhancementParams.f48443i = false;
        vocalEnhancementParams.f48451q = false;
        vocalEnhancementParams.f48454t = false;
        vocalEnhancementParams.f48455u = bj6;
        vocalEnhancementParams.f48456v = -18.0f;
        vocalEnhancementParams.f48457w = -40.0f;
        vocalEnhancementParams.f48458x = -10.0f;
        com.tencent.maas.moviecomposing.VocalEnhancementProcessor.b(str, a17, vocalEnhancementParams);
        kotlin.jvm.internal.o.d(a17);
        return a17;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        byte[] bytes = (str + '_' + str2).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
        return g17;
    }
}
