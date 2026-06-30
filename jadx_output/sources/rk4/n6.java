package rk4;

/* loaded from: classes11.dex */
public final class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f396864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.xb0 f396865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396866f;

    public n6(rk4.p6 p6Var, bw5.xb0 xb0Var, java.lang.String str) {
        this.f396864d = p6Var;
        this.f396865e = xb0Var;
        this.f396866f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396864d.wi(1119, this.f396865e, this.f396866f, null);
    }
}
