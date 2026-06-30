package rk4;

/* loaded from: classes11.dex */
public final class e6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f396629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f396630e;

    public e6(rk4.p6 p6Var, boolean z17) {
        this.f396629d = p6Var;
        this.f396630e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396629d.wi(this.f396630e ? 1125 : 1124, null, null, null);
    }
}
