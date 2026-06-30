package f12;

/* loaded from: classes4.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f258637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f258639f;

    public l0(f12.o0 o0Var, java.lang.String str, int i17) {
        this.f258637d = o0Var;
        this.f258638e = str;
        this.f258639f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f258637d.f258659g;
        kotlin.jvm.internal.o.d(h0Var);
        h0Var.o(this.f258638e, this.f258639f);
    }
}
