package f26;

/* loaded from: classes16.dex */
public final class k1 {
    public k1(kotlin.jvm.internal.i iVar) {
    }

    public final f26.l1 a(f26.l1 l1Var, o06.d2 typeAliasDescriptor, java.util.List arguments) {
        kotlin.jvm.internal.o.g(typeAliasDescriptor, "typeAliasDescriptor");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        java.util.List parameters = ((r06.l) typeAliasDescriptor).f368482n.getParameters();
        kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(parameters, 10));
        java.util.Iterator it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((o06.e2) it.next()).a());
        }
        return new f26.l1(l1Var, typeAliasDescriptor, arguments, kz5.c1.q(kz5.n0.a1(arrayList, arguments)), null);
    }
}
