package d26;

/* loaded from: classes16.dex */
public final class n0 extends r06.f1 implements d26.b {
    public final i16.u0 H;
    public final k16.g I;

    /* renamed from: J, reason: collision with root package name */
    public final k16.k f226033J;
    public final k16.m K;
    public final d26.z L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o06.m containingDeclaration, o06.o1 o1Var, p06.k annotations, o06.t0 modality, o06.g0 visibility, boolean z17, n16.g name, o06.c kind, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, i16.u0 proto, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, d26.z zVar) {
        super(containingDeclaration, o1Var, annotations, modality, visibility, z17, name, kind, o06.x1.f342004a, z18, z19, z29, false, z27, z28);
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        kotlin.jvm.internal.o.g(modality, "modality");
        kotlin.jvm.internal.o.g(visibility, "visibility");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(kind, "kind");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        kotlin.jvm.internal.o.g(versionRequirementTable, "versionRequirementTable");
        this.H = proto;
        this.I = nameResolver;
        this.f226033J = typeTable;
        this.K = versionRequirementTable;
        this.L = zVar;
    }

    @Override // d26.a0
    public p16.h0 E() {
        return this.H;
    }

    @Override // d26.a0
    public k16.g X() {
        return this.I;
    }

    @Override // d26.a0
    public d26.z Y() {
        return this.L;
    }

    @Override // r06.f1, o06.r0
    public boolean isExternal() {
        java.lang.Boolean c17 = k16.f.E.c(this.H.f287763g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // d26.a0
    public k16.k t() {
        return this.f226033J;
    }

    @Override // r06.f1
    public r06.f1 w0(o06.m newOwner, o06.t0 newModality, o06.g0 newVisibility, o06.o1 o1Var, o06.c kind, n16.g newName, o06.x1 source) {
        kotlin.jvm.internal.o.g(newOwner, "newOwner");
        kotlin.jvm.internal.o.g(newModality, "newModality");
        kotlin.jvm.internal.o.g(newVisibility, "newVisibility");
        kotlin.jvm.internal.o.g(kind, "kind");
        kotlin.jvm.internal.o.g(newName, "newName");
        kotlin.jvm.internal.o.g(source, "source");
        return new d26.n0(newOwner, o1Var, getAnnotations(), newModality, newVisibility, this.f368540i, newName, kind, this.f368414t, this.f368415u, isExternal(), this.f368419y, this.f368416v, this.H, this.I, this.f226033J, this.K, this.L);
    }
}
