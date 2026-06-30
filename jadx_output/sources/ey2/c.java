package ey2;

/* loaded from: classes2.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.f f257328d;

    public c(ey2.f fVar) {
        this.f257328d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            byte[] N = com.tencent.mm.vfs.w6.N(new com.tencent.mm.vfs.r6(((cq.k) i95.n0.c(cq.k.class)).Di(9)).o() + "/18054.ext", 0, -1);
            jz5.f0 f0Var = null;
            if (N != null) {
                java.lang.Object a17 = u46.j.a(N);
                java.util.List<ey2.a> list = a17 instanceof java.util.List ? (java.util.List) a17 : null;
                ey2.f fVar = this.f257328d;
                if (list != null) {
                    for (ey2.a aVar : list) {
                        fVar.f257364h.put(fVar.N6(aVar.f257310d, aVar.f257313g), aVar);
                    }
                }
                com.tencent.mars.xlog.Log.i("Finder.18054CacheVM", "[restoreCache] cacheSize=" + fVar.f257364h.size());
                f0Var = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.18054CacheVM", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
    }
}
