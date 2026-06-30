package sc2;

/* loaded from: classes2.dex */
public final class o1 implements com.tencent.mm.pluginsdk.ui.span.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.z0 f406116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f406117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406118e;

    public o1(in5.s0 s0Var, xc2.p0 p0Var, com.tencent.mm.pluginsdk.ui.span.z0 z0Var, sc2.f2 f2Var, android.view.View view) {
        this.f406114a = s0Var;
        this.f406115b = p0Var;
        this.f406116c = z0Var;
        this.f406117d = f2Var;
        this.f406118e = view;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.t
    public void a(android.view.View view, int i17, com.tencent.mm.pluginsdk.ui.span.u obj) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(obj, "obj");
        xc2.y2 y2Var = xc2.y2.f453343a;
        in5.s0 s0Var = this.f406114a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = this.f406116c.getHrefInfo().e();
        xc2.p0 p0Var = this.f406115b;
        y2Var.J(context, p0Var, e17, s0Var);
        xc2.z2 z2Var = this.f406117d.f3151o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar != null) {
            int i18 = 144;
            if (i17 != 0) {
                if (i17 == 1) {
                    i18 = 145;
                } else if (i17 == 2) {
                    i18 = 146;
                }
            }
            bVar.B(s0Var, this.f406118e, p0Var, i18);
        }
    }
}
