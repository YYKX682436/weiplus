package rc3;

/* loaded from: classes7.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(rc3.w0 w0Var, int i17, int i18, int i19) {
        super(0);
        this.f394018d = w0Var;
        this.f394019e = i17;
        this.f394020f = i18;
        this.f394021g = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394018d;
        java.lang.String str = w0Var.f394105z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("surface ");
        int i17 = this.f394019e;
        sb6.append(i17);
        sb6.append(" post update, size = (");
        int i18 = this.f394020f;
        sb6.append(i18);
        sb6.append(", ");
        int i19 = this.f394021g;
        sb6.append(i19);
        sb6.append("), has service?");
        sb6.append(w0Var.A != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.cj(i17, i18, i19);
        }
        return jz5.f0.f302826a;
    }
}
