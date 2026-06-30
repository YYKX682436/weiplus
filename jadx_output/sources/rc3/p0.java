package rc3;

/* loaded from: classes7.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f394049e;

    public p0(rc3.w0 w0Var, yz5.a aVar) {
        this.f394048d = w0Var;
        this.f394049e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc3.w0 w0Var = this.f394048d;
        boolean z17 = w0Var.f394101v;
        yz5.a aVar = this.f394049e;
        if (z17 || w0Var.A == null) {
            w0Var.f394100u.addLast(aVar);
        } else {
            aVar.invoke();
        }
    }
}
