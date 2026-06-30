package rc3;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rc3.w0 w0Var) {
        super(0);
        this.f393972d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393972d;
        if (w0Var.A == null) {
            com.tencent.mars.xlog.Log.i(w0Var.f394105z, "destroy when server is not initialized");
            rc3.w0.e(w0Var);
        } else {
            w0Var.M(new rc3.d(w0Var));
        }
        return jz5.f0.f302826a;
    }
}
