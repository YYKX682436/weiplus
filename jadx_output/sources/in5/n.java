package in5;

/* loaded from: classes2.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public long f293095a = android.os.SystemClock.elapsedRealtime();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.v f293096b;

    public n(in5.v vVar) {
        this.f293096b = vVar;
    }

    @Override // ym5.n0
    public boolean getAdditionalCondition(android.view.View target) {
        kotlin.jvm.internal.o.g(target, "target");
        return this.f293096b.a(target);
    }

    @Override // ym5.n0
    public float getExposePercent(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f293096b.b(view);
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f293096b.c(view);
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        long j19 = 0;
        if (!z17 && this.f293095a != 0) {
            j19 = android.os.SystemClock.elapsedRealtime() - this.f293095a;
        }
        long j27 = j19;
        if (z17) {
            this.f293095a = android.os.SystemClock.elapsedRealtime();
        }
        this.f293096b.d(view, j17, j18, z17, j27);
    }
}
