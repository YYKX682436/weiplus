package r06;

/* loaded from: classes16.dex */
public final class r1 extends r06.s1 {

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f368518r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(o06.b containingDeclaration, o06.l2 l2Var, int i17, p06.k annotations, n16.g name, f26.o0 outType, boolean z17, boolean z18, boolean z19, f26.o0 o0Var, o06.x1 source, yz5.a destructuringVariables) {
        super(containingDeclaration, l2Var, i17, annotations, name, outType, z17, z18, z19, o0Var, source);
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(outType, "outType");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(destructuringVariables, "destructuringVariables");
        this.f368518r = jz5.h.b(destructuringVariables);
    }

    @Override // r06.s1, o06.l2
    public o06.l2 u(o06.b newOwner, n16.g newName, int i17) {
        kotlin.jvm.internal.o.g(newOwner, "newOwner");
        kotlin.jvm.internal.o.g(newName, "newName");
        p06.k annotations = getAnnotations();
        kotlin.jvm.internal.o.f(annotations, "<get-annotations>(...)");
        f26.o0 type = getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        return new r06.r1(newOwner, null, i17, annotations, newName, type, s0(), this.f368524n, this.f368525o, this.f368526p, o06.x1.f342004a, new r06.q1(this));
    }
}
