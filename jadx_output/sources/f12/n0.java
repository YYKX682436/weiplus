package f12;

/* loaded from: classes4.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f258648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f258650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f258651g;

    public n0(f12.o0 o0Var, java.lang.String str, long j17, long j18) {
        this.f258648d = o0Var;
        this.f258649e = str;
        this.f258650f = j17;
        this.f258651g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f258648d.f258659g;
        kotlin.jvm.internal.o.d(h0Var);
        h0Var.f(this.f258649e, this.f258650f, this.f258651g);
    }
}
