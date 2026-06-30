package dl4;

/* loaded from: classes3.dex */
public final class f0 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f235396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.x f235397d;

    public f0(android.view.View view, java.lang.String str, dl4.m0 m0Var, ff0.x xVar) {
        this.f235394a = view;
        this.f235395b = str;
        this.f235396c = m0Var;
        this.f235397d = xVar;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        android.view.View view = this.f235394a;
        boolean b17 = kotlin.jvm.internal.o.b(view != null ? view.getTag(com.tencent.mm.R.id.o9n) : null, this.f235395b);
        ff0.x xVar = this.f235397d;
        if (!b17) {
            if (xVar != null) {
                xVar.a(null);
            }
        } else {
            dl4.m0 m0Var = this.f235396c;
            m0Var.getClass();
            pm0.v.X(new dl4.k0(zVar, view, m0Var));
            if (xVar != null) {
                xVar.a(zVar);
            }
        }
    }
}
