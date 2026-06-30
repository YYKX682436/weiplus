package z51;

/* loaded from: classes10.dex */
public final class c extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public a61.c f470174f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f470175g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470176h;

    /* renamed from: i, reason: collision with root package name */
    public aq.u0 f470177i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y51.a pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoLocalSourcePc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        kotlin.jvm.internal.o.g(config, "config");
        super.d(config);
        a61.c cVar = config.f1718b;
        this.f470174f = cVar;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("sourceConfig");
            throw null;
        }
        this.f470176h = cVar.f1720b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isParsed: ");
        a61.c cVar2 = this.f470174f;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("sourceConfig");
            throw null;
        }
        sb6.append(cVar2.f1720b);
        sb6.append(" mediaId: ");
        a61.c cVar3 = this.f470174f;
        if (cVar3 == null) {
            kotlin.jvm.internal.o.o("sourceConfig");
            throw null;
        }
        sb6.append(cVar3.f1722d);
        f(sb6.toString());
    }

    @Override // z51.x
    public void j() {
        kotlinx.coroutines.r2 r2Var = this.f470175g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        super.j();
    }
}
