package ms4;

/* loaded from: classes8.dex */
public final class d0 implements ms4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f331007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f331008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hc5 f331009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js4.n f331010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ js4.o f331012g;

    public d0(java.lang.String str, ms4.j0 j0Var, android.app.Activity activity, r45.hc5 hc5Var, js4.n nVar, java.lang.String str2, js4.o oVar) {
        this.f331006a = str;
        this.f331007b = j0Var;
        this.f331008c = activity;
        this.f331009d = hc5Var;
        this.f331010e = nVar;
        this.f331011f = str2;
        this.f331012g = oVar;
    }

    @Override // ms4.b
    public void a(r45.ma5 ma5Var) {
        js4.o oVar = this.f331012g;
        if (ma5Var == null) {
            if (oVar != null) {
                oVar.a(4, 10000, "");
                return;
            }
            return;
        }
        if (ma5Var.f380307e == 3) {
            java.lang.String str = this.f331006a;
            if (!(str == null || str.length() == 0)) {
                this.f331007b.d(this.f331008c, this.f331009d, "release", this.f331010e, this.f331011f);
                return;
            }
        }
        if (oVar != null) {
            oVar.a(4, 10000, "");
        }
    }
}
