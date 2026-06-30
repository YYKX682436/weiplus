package rk4;

/* loaded from: classes11.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f396651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396652e;

    public f6(rk4.p6 p6Var, int i17) {
        this.f396651d = p6Var;
        this.f396652e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396651d.wi(this.f396652e, null, null, null);
    }
}
