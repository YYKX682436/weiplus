package rk4;

/* loaded from: classes11.dex */
public final class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f396678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f396680f;

    public g6(rk4.p6 p6Var, int i17, bw5.o50 o50Var) {
        this.f396678d = p6Var;
        this.f396679e = i17;
        this.f396680f = o50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f396678d.wi(this.f396679e, null, null, this.f396680f);
    }
}
