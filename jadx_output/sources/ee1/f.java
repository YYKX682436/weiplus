package ee1;

/* loaded from: classes4.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ee1.e[] f251577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f251578b;

    public f(ee1.e[] eVarArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f251577a = eVarArr;
        this.f251578b = countDownLatch;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ee1.e[] eVarArr = this.f251577a;
        java.util.concurrent.CountDownLatch countDownLatch = this.f251578b;
        try {
            ee1.g gVar = ee1.g.f251579a;
            kotlin.jvm.internal.o.d(fVar);
            eVarArr[0] = ee1.g.a(gVar, fVar);
        } finally {
            try {
                countDownLatch.countDown();
                return jz5.f0.f302826a;
            } catch (java.lang.Throwable th6) {
            }
        }
        countDownLatch.countDown();
        return jz5.f0.f302826a;
    }
}
