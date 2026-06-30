package rc3;

/* loaded from: classes7.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f394009h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(rc3.w0 w0Var, int i17, int i18, int i19, android.view.Surface surface) {
        super(0);
        this.f394005d = w0Var;
        this.f394006e = i17;
        this.f394007f = i18;
        this.f394008g = i19;
        this.f394009h = surface;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394005d;
        java.lang.String str = w0Var.f394105z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("surface ");
        int i17 = this.f394006e;
        sb6.append(i17);
        sb6.append(" post create, size = (");
        int i18 = this.f394007f;
        sb6.append(i18);
        sb6.append(", ");
        int i19 = this.f394008g;
        sb6.append(i19);
        sb6.append("), has service?");
        sb6.append(w0Var.A != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.pg(i17, this.f394009h, i18, i19);
        }
        w0Var.S(new rc3.h0(w0Var, i17));
        return jz5.f0.f302826a;
    }
}
