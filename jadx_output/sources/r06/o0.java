package r06;

/* loaded from: classes15.dex */
public class o0 extends r06.v implements o06.k1 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f368494n = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(r06.o0.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(r06.o0.class), "empty", "getEmpty()Z"))};

    /* renamed from: f, reason: collision with root package name */
    public final r06.x0 f368495f;

    /* renamed from: g, reason: collision with root package name */
    public final n16.c f368496g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.x f368497h;

    /* renamed from: i, reason: collision with root package name */
    public final e26.x f368498i;

    /* renamed from: m, reason: collision with root package name */
    public final y16.s f368499m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r06.x0 module, n16.c fqName, e26.c0 storageManager) {
        super(p06.i.f350765a, fqName.g());
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        int i17 = p06.k.Z0;
        this.f368495f = module;
        this.f368496g = fqName;
        e26.u uVar = (e26.u) storageManager;
        this.f368497h = uVar.b(new r06.m0(this));
        this.f368498i = uVar.b(new r06.l0(this));
        this.f368499m = new y16.o(storageManager, new r06.n0(this));
    }

    @Override // o06.m
    public o06.m e() {
        n16.c cVar = this.f368496g;
        if (cVar.d()) {
            return null;
        }
        n16.c e17 = cVar.e();
        kotlin.jvm.internal.o.f(e17, "parent(...)");
        return this.f368495f.Q(e17);
    }

    public boolean equals(java.lang.Object obj) {
        o06.k1 k1Var = obj instanceof o06.k1 ? (o06.k1) obj : null;
        if (k1Var == null) {
            return false;
        }
        r06.o0 o0Var = (r06.o0) k1Var;
        return kotlin.jvm.internal.o.b(this.f368496g, o0Var.f368496g) && kotlin.jvm.internal.o.b(this.f368495f, o0Var.f368495f);
    }

    public int hashCode() {
        return (this.f368495f.hashCode() * 31) + this.f368496g.hashCode();
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(visitor, "visitor");
        return visitor.j(this, obj);
    }
}
