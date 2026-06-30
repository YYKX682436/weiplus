package f12;

/* loaded from: classes4.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f258632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f258634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f258635g;

    public k0(f12.o0 o0Var, java.lang.String str, long j17, long j18) {
        this.f258632d = o0Var;
        this.f258633e = str;
        this.f258634f = j17;
        this.f258635g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f258632d.f258659g;
        kotlin.jvm.internal.o.d(h0Var);
        h0Var.onDataAvailable(this.f258633e, this.f258634f, this.f258635g);
    }
}
