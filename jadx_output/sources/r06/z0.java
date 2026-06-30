package r06;

/* loaded from: classes16.dex */
public abstract class z0 extends r06.w implements o06.d1 {

    /* renamed from: h, reason: collision with root package name */
    public final n16.c f368566h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(o06.v0 module, n16.c fqName) {
        super(module, p06.i.f350765a, fqName.g(), o06.x1.f342004a);
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        int i17 = p06.k.Z0;
        this.f368566h = fqName;
        this.f368567i = "package " + fqName + " of " + module;
    }

    @Override // r06.w, o06.p
    public o06.x1 getSource() {
        return o06.x1.f342004a;
    }

    @Override // r06.w, o06.m
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public o06.v0 e() {
        o06.m e17 = super.e();
        kotlin.jvm.internal.o.e(e17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (o06.v0) e17;
    }

    @Override // r06.v
    public java.lang.String toString() {
        return this.f368567i;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(visitor, "visitor");
        return visitor.b(this, obj);
    }
}
