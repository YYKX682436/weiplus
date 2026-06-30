package oq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ey2.c3 f347372a;

    public a() {
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f347372a = (ey2.c3) a17;
    }

    public final void a(int i17, long j17, long j18, long j19) {
        com.tencent.mars.xlog.Log.i("PreloadCacheManager", "storePreloadTimeStampCache lastFindPrefetchTimeStampMs:" + j17 + " lastRedDotPrefetchTimeStampMs:" + j18 + " lastTabPagesPrefetchTimeStampMs:" + j19);
        ey2.y2 P6 = this.f347372a.P6(i17);
        if (j17 != 0) {
            P6.f257584b = j17;
        }
        if (j18 != 0) {
            P6.f257585c = j18;
        }
        if (j19 != 0) {
            P6.f257586d = j19;
        }
    }
}
