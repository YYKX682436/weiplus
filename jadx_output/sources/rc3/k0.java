package rc3;

/* loaded from: classes7.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(rc3.w0 w0Var, int i17) {
        super(0);
        this.f394015d = w0Var;
        this.f394016e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394015d;
        java.lang.String str = w0Var.f394105z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("surface ");
        int i17 = this.f394016e;
        sb6.append(i17);
        sb6.append(" post destroy, has service?");
        sb6.append(w0Var.A != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.yd(i17);
        }
        w0Var.S(new rc3.j0(w0Var, i17));
        return jz5.f0.f302826a;
    }
}
