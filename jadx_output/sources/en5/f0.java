package en5;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f255398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f255400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f255402h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f255403i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f255405n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f255406o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255407p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlin.jvm.internal.h0 h0Var, fn5.n0 n0Var, n0.e5 e5Var, yz5.l lVar, int i17, n0.e5 e5Var2, java.lang.String str, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2, yz5.l lVar2) {
        super(1);
        this.f255398d = h0Var;
        this.f255399e = n0Var;
        this.f255400f = e5Var;
        this.f255401g = lVar;
        this.f255402h = i17;
        this.f255403i = e5Var2;
        this.f255404m = str;
        this.f255405n = e0Var;
        this.f255406o = e0Var2;
        this.f255407p = lVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fn5.p0 p0Var;
        fn5.p0 p0Var2;
        e0.u0 LazyColumn = (e0.u0) obj;
        kotlin.jvm.internal.o.g(LazyColumn, "$this$LazyColumn");
        java.util.ArrayList<aq.d> arrayList = (java.util.ArrayList) this.f255398d.f310123d;
        if (arrayList != null) {
            for (aq.d dVar : arrayList) {
                boolean b17 = kotlin.jvm.internal.o.b(dVar.f12849a, "TOP");
                java.lang.String str = null;
                fn5.n0 n0Var = this.f255399e;
                if (b17) {
                    if (n0Var != null) {
                        n0.e5 e5Var = this.f255400f;
                        if (kotlin.jvm.internal.o.b((e5Var == null || (p0Var2 = (fn5.p0) e5Var.getValue()) == null) ? null : p0Var2.name(), "PERSON") && n0Var.B) {
                            e0.r0.a(LazyColumn, null, null, u0.j.c(-1515207373, true, new en5.y(n0Var, this.f255401g)), 3, null);
                        } else {
                            if (e5Var != null && (p0Var = (fn5.p0) e5Var.getValue()) != null) {
                                str = p0Var.name();
                            }
                            if (kotlin.jvm.internal.o.b(str, "NORMAL")) {
                                e0.r0.a(LazyColumn, null, null, u0.j.c(-2055083620, true, new en5.z(n0Var)), 3, null);
                            }
                        }
                    } else {
                        e0.r0.a(LazyColumn, null, null, u0.j.c(-37512479, true, new en5.a0(this.f255402h)), 3, null);
                    }
                } else if (kotlin.jvm.internal.o.b(dVar.f12849a, "BOTTOM")) {
                    e0.r0.a(LazyColumn, null, null, u0.j.c(1522667302, true, new en5.b0(this.f255403i, n0Var, this.f255404m)), 3, null);
                } else {
                    u0.a c17 = u0.j.c(-1942636727, true, new en5.c0(dVar));
                    e0.y0 y0Var = (e0.y0) LazyColumn;
                    java.util.List list = y0Var.f245725c;
                    if (list == null) {
                        list = new java.util.ArrayList();
                        y0Var.f245725c = list;
                    }
                    list.add(java.lang.Integer.valueOf(y0Var.f245723a.f10393c));
                    y0Var.a(null, null, c17);
                    e0.r0.a(LazyColumn, null, null, u0.j.c(-416341306, true, new en5.e0(dVar, this.f255405n, this.f255406o, this.f255407p)), 3, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
