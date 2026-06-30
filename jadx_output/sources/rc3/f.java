package rc3;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rc3.w0 w0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f393981d = w0Var;
        this.f393982e = str;
        this.f393983f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f393981d;
        if ((w0Var.f394099t & 1) != 0) {
            com.tencent.mars.xlog.Log.w(w0Var.f394105z, "dispatch in wrong status " + w0Var.f394099t + " , discard event");
        } else {
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.s2(this.f393982e, this.f393983f);
            }
        }
        return jz5.f0.f302826a;
    }
}
