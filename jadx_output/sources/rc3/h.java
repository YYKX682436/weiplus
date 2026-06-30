package rc3;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lc3.b0 f394000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rc3.w0 w0Var, int i17, lc3.b0 b0Var) {
        super(1);
        this.f393998d = w0Var;
        this.f393999e = i17;
        this.f394000f = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lc3.a0 result = (lc3.a0) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String a17 = result.a();
        boolean p17 = this.f394000f.p();
        rc3.w0 w0Var = this.f393998d;
        w0Var.getClass();
        w0Var.M(new rc3.z(w0Var, a17, p17, this.f393999e));
        return jz5.f0.f302826a;
    }
}
