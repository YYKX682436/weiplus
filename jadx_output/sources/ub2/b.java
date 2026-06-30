package ub2;

/* loaded from: classes14.dex */
public final class b extends kotlinx.coroutines.p0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.os.HandlerThread f426039e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f426040f;

    public b() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("FinderPostWatermarkCheck", -2);
        this.f426039e = a17;
        this.f426040f = jz5.h.b(new ub2.a(this));
        a17.start();
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        try {
            ((android.os.Handler) ((jz5.n) this.f426040f).getValue()).post(block);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            kotlinx.coroutines.v2.b(context, kotlinx.coroutines.e2.a("The task was rejected", e17));
        }
    }
}
