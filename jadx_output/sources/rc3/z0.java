package rc3;

/* loaded from: classes7.dex */
public final class z0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.d0 f394119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f394120e;

    public z0(lc3.d0 d0Var, lc3.a0 a0Var) {
        this.f394119d = d0Var;
        this.f394120e = a0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return this.f394119d.r(this.f394120e);
    }
}
