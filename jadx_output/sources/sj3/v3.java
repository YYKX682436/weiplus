package sj3;

/* loaded from: classes14.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f408784e;

    public v3(sj3.d4 d4Var, boolean z17) {
        this.f408783d = d4Var;
        this.f408784e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ku5.t0) ku5.t0.f312615d).B(new sj3.u3(this.f408783d, this.f408784e));
    }
}
