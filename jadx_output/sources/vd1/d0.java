package vd1;

/* loaded from: classes7.dex */
public final class d0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f435568d;

    public d0(com.tencent.mm.plugin.appbrand.y yVar) {
        this.f435568d = yVar;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        int i17 = bVar == null ? -1 : vd1.c0.f435566a[bVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            vd1.f0 f0Var = vd1.f0.f435573a;
            synchronized (f0Var) {
                long j17 = vd1.f0.f435579g;
                if (j17 > 0) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (android.os.SystemClock.elapsedRealtime() - j17 >= vd1.f0.f435575c) {
                        f0Var.d(vd1.x.f435617d);
                    }
                }
            }
            return;
        }
        vd1.f0.f435573a.d(vd1.x.f435619f);
        com.tencent.mm.plugin.appbrand.y yVar = this.f435568d;
        java.util.HashSet hashSet = vd1.f0.f435577e;
        synchronized (hashSet) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
            kotlin.jvm.internal.o.e(runtime, "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU");
            hashSet.remove((ze.n) runtime);
            if (hashSet.size() == 0) {
                vd1.f0.f435576d.d();
            }
        }
    }
}
