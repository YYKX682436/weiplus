package g16;

/* loaded from: classes15.dex */
public final class s extends g16.r {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f267655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g16.t f267656c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.g f267657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n16.b f267658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f267659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o06.x1 f267660g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g16.t tVar, o06.g gVar, n16.b bVar, java.util.List list, o06.x1 x1Var) {
        super(tVar);
        this.f267656c = tVar;
        this.f267657d = gVar;
        this.f267658e = bVar;
        this.f267659f = list;
        this.f267660g = x1Var;
        this.f267655b = new java.util.HashMap();
    }

    @Override // g16.m0
    public void a() {
        java.util.HashMap arguments = this.f267655b;
        g16.t tVar = this.f267656c;
        tVar.getClass();
        n16.b annotationClassId = this.f267658e;
        kotlin.jvm.internal.o.g(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        boolean z17 = false;
        if (kotlin.jvm.internal.o.b(annotationClassId, k06.a.f303161b)) {
            java.lang.Object obj = arguments.get(n16.g.k("value"));
            t16.x xVar = obj instanceof t16.x ? (t16.x) obj : null;
            if (xVar != null) {
                java.lang.Object obj2 = xVar.f414613a;
                t16.v vVar = obj2 instanceof t16.v ? (t16.v) obj2 : null;
                if (vVar != null) {
                    z17 = tVar.p(vVar.f414628a.f414611a);
                }
            }
        }
        if (z17 || tVar.p(annotationClassId)) {
            return;
        }
        this.f267659f.add(new p06.d(this.f267657d.k(), arguments, this.f267660g));
    }

    @Override // g16.r
    public void g(n16.g gVar, t16.g value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (gVar != null) {
            this.f267655b.put(gVar, value);
        }
    }
}
