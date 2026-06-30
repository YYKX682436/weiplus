package x06;

/* loaded from: classes16.dex */
public final class s implements r16.l {
    @Override // r16.l
    public r16.k a(o06.b superDescriptor, o06.b subDescriptor, o06.g gVar) {
        boolean z17;
        o06.b bVar;
        kotlin.jvm.internal.o.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.o.g(subDescriptor, "subDescriptor");
        boolean z18 = subDescriptor instanceof z06.h;
        r16.k kVar = r16.k.UNKNOWN;
        if (!z18) {
            return kVar;
        }
        z06.h hVar = (z06.h) subDescriptor;
        if (!hVar.getTypeParameters().isEmpty()) {
            return kVar;
        }
        r16.w i17 = r16.x.i(superDescriptor, subDescriptor);
        if ((i17 != null ? i17.c() : null) != null) {
            return kVar;
        }
        java.util.List W = hVar.W();
        kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
        q26.n o17 = q26.h0.o(kz5.n0.J(W), x06.r.f451318d);
        f26.o0 o0Var = hVar.f368460m;
        kotlin.jvm.internal.o.d(o0Var);
        q26.n t17 = q26.h0.t(o17, o0Var);
        o06.r1 r1Var = hVar.f368462o;
        q26.j jVar = new q26.j((q26.k) q26.h0.s(t17, kz5.c0.j(r1Var != null ? ((r06.g) r1Var).getType() : null)));
        while (true) {
            if (!jVar.hasNext()) {
                z17 = false;
                break;
            }
            f26.o0 o0Var2 = (f26.o0) jVar.next();
            if ((o0Var2.u0().isEmpty() ^ true) && !(o0Var2.z0() instanceof c16.k)) {
                z17 = true;
                break;
            }
        }
        if (z17 || (bVar = (o06.b) superDescriptor.d(f26.v2.e(new c16.i(null, 1, null)))) == null) {
            return kVar;
        }
        if (bVar instanceof o06.v1) {
            o06.n0 n0Var = (o06.v1) bVar;
            if (!((r06.j0) n0Var).getTypeParameters().isEmpty()) {
                bVar = n0Var.O().g(kz5.p0.f313996d).build();
                kotlin.jvm.internal.o.d(bVar);
            }
        }
        r16.v c17 = r16.x.f368679d.n(bVar, subDescriptor, false).c();
        kotlin.jvm.internal.o.f(c17, "getResult(...)");
        return x06.q.f451301a[c17.ordinal()] == 1 ? r16.k.OVERRIDABLE : kVar;
    }

    @Override // r16.l
    public r16.j b() {
        return r16.j.SUCCESS_ONLY;
    }
}
