package rk4;

/* loaded from: classes11.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f396848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.yq0 f396849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.xb0 f396850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396851g;

    public m6(rk4.p6 p6Var, bw5.yq0 yq0Var, bw5.xb0 xb0Var, java.lang.String str) {
        this.f396848d = p6Var;
        this.f396849e = yq0Var;
        this.f396850f = xb0Var;
        this.f396851g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396848d.wi(this.f396849e.f35626d, this.f396850f, this.f396851g, null);
    }
}
