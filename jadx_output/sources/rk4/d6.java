package rk4;

/* loaded from: classes11.dex */
public final class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f396611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.yq0 f396612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.xb0 f396613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396614g;

    public d6(rk4.p6 p6Var, bw5.yq0 yq0Var, bw5.xb0 xb0Var, java.lang.String str) {
        this.f396611d = p6Var;
        this.f396612e = yq0Var;
        this.f396613f = xb0Var;
        this.f396614g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396611d.wi(this.f396612e.f35626d, this.f396613f, this.f396614g, null);
    }
}
