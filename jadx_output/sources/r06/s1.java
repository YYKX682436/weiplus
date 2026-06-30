package r06;

/* loaded from: classes16.dex */
public class s1 extends r06.t1 implements o06.l2 {

    /* renamed from: i, reason: collision with root package name */
    public final int f368522i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f368523m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f368524n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f368525o;

    /* renamed from: p, reason: collision with root package name */
    public final f26.o0 f368526p;

    /* renamed from: q, reason: collision with root package name */
    public final o06.l2 f368527q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(o06.b containingDeclaration, o06.l2 l2Var, int i17, p06.k annotations, n16.g name, f26.o0 outType, boolean z17, boolean z18, boolean z19, f26.o0 o0Var, o06.x1 source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(outType, "outType");
        kotlin.jvm.internal.o.g(source, "source");
        this.f368522i = i17;
        this.f368523m = z17;
        this.f368524n = z18;
        this.f368525o = z19;
        this.f368526p = o0Var;
        this.f368527q = l2Var == null ? this : l2Var;
    }

    @Override // o06.a2
    public o06.n d(f26.v2 substitutor) {
        kotlin.jvm.internal.o.g(substitutor, "substitutor");
        if (substitutor.h()) {
            return this;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o06.q, o06.r0
    public o06.g0 getVisibility() {
        o06.g0 LOCAL = o06.f0.f341946f;
        kotlin.jvm.internal.o.f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // o06.b
    public java.util.Collection i() {
        java.util.Collection i17 = e().i();
        kotlin.jvm.internal.o.f(i17, "getOverriddenDescriptors(...)");
        java.util.Collection collection = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((o06.l2) ((o06.b) it.next()).W().get(this.f368522i));
        }
        return arrayList;
    }

    @Override // o06.m2
    public /* bridge */ /* synthetic */ t16.g n0() {
        return null;
    }

    public boolean s0() {
        if (!this.f368523m) {
            return false;
        }
        o06.c j17 = ((o06.d) e()).j();
        j17.getClass();
        return j17 != o06.c.FAKE_OVERRIDE;
    }

    public o06.l2 u(o06.b newOwner, n16.g newName, int i17) {
        kotlin.jvm.internal.o.g(newOwner, "newOwner");
        kotlin.jvm.internal.o.g(newName, "newName");
        p06.k annotations = getAnnotations();
        kotlin.jvm.internal.o.f(annotations, "<get-annotations>(...)");
        f26.o0 type = getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        return new r06.s1(newOwner, null, i17, annotations, newName, type, s0(), this.f368524n, this.f368525o, this.f368526p, o06.x1.f342004a);
    }

    @Override // r06.w, o06.m
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public o06.b e() {
        o06.m e17 = super.e();
        kotlin.jvm.internal.o.e(e17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (o06.b) e17;
    }

    @Override // o06.m2
    public boolean v() {
        return false;
    }

    @Override // r06.w
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public o06.l2 a() {
        o06.l2 l2Var = this.f368527q;
        return l2Var == this ? this : ((r06.s1) l2Var).a();
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(visitor, "visitor");
        return visitor.a(this, obj);
    }
}
