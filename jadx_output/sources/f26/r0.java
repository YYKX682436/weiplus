package f26;

/* loaded from: classes16.dex */
public final class r0 {
    public static final f26.c3 a(f26.z0 lowerBound, f26.z0 upperBound) {
        kotlin.jvm.internal.o.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.o.g(upperBound, "upperBound");
        return kotlin.jvm.internal.o.b(lowerBound, upperBound) ? lowerBound : new f26.f0(lowerBound, upperBound);
    }

    public static final f26.z0 b(f26.r1 attributes, t16.s constructor, boolean z17) {
        kotlin.jvm.internal.o.g(attributes, "attributes");
        kotlin.jvm.internal.o.g(constructor, "constructor");
        return f(attributes, constructor, kz5.p0.f313996d, z17, h26.m.a(h26.i.f278337f, true, "unknown integer literal type"));
    }

    public static final f26.z0 c(f26.r1 attributes, o06.g descriptor, java.util.List arguments) {
        kotlin.jvm.internal.o.g(attributes, "attributes");
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        f26.c2 g17 = descriptor.g();
        kotlin.jvm.internal.o.f(g17, "getTypeConstructor(...)");
        return d(attributes, g17, arguments, false, null);
    }

    public static final f26.z0 d(f26.r1 attributes, f26.c2 constructor, java.util.List arguments, boolean z17, g26.l lVar) {
        y16.s a17;
        r06.s0 s0Var;
        kotlin.jvm.internal.o.g(attributes, "attributes");
        kotlin.jvm.internal.o.g(constructor, "constructor");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z17 && constructor.i() != null) {
            o06.j i17 = constructor.i();
            kotlin.jvm.internal.o.d(i17);
            f26.z0 k17 = i17.k();
            kotlin.jvm.internal.o.f(k17, "getDefaultType(...)");
            return k17;
        }
        o06.j i18 = constructor.i();
        if (i18 instanceof o06.e2) {
            a17 = ((o06.e2) i18).k().V();
        } else if (i18 instanceof o06.g) {
            if (lVar == null) {
                v16.f.i(v16.f.j(i18));
                lVar = g26.k.f267994a;
            }
            if (arguments.isEmpty()) {
                o06.g gVar = (o06.g) i18;
                kotlin.jvm.internal.o.g(gVar, "<this>");
                s0Var = gVar instanceof r06.s0 ? (r06.s0) gVar : null;
                if (s0Var == null || (a17 = s0Var.P(lVar)) == null) {
                    a17 = gVar.A();
                    kotlin.jvm.internal.o.f(a17, "getUnsubstitutedMemberScope(...)");
                }
            } else {
                o06.g gVar2 = (o06.g) i18;
                f26.q2 b17 = f26.f2.f259161b.b(constructor, arguments);
                kotlin.jvm.internal.o.g(gVar2, "<this>");
                s0Var = gVar2 instanceof r06.s0 ? (r06.s0) gVar2 : null;
                if (s0Var == null || (a17 = s0Var.G(b17, lVar)) == null) {
                    a17 = gVar2.F(b17);
                    kotlin.jvm.internal.o.f(a17, "getMemberScope(...)");
                }
            }
        } else if (i18 instanceof o06.d2) {
            h26.i iVar = h26.i.f278338g;
            java.lang.String str = ((r06.v) ((o06.d2) i18)).getName().f334169d;
            kotlin.jvm.internal.o.f(str, "toString(...)");
            a17 = h26.m.a(iVar, true, str);
        } else {
            if (!(constructor instanceof f26.n0)) {
                throw new java.lang.IllegalStateException("Unsupported classifier: " + i18 + " for constructor: " + constructor);
            }
            a17 = y16.h0.f458941c.a("member scope for intersection type", ((f26.n0) constructor).f259198b);
        }
        return g(attributes, constructor, arguments, z17, a17, new f26.p0(constructor, arguments, attributes, z17));
    }

    public static /* synthetic */ f26.z0 e(f26.r1 r1Var, f26.c2 c2Var, java.util.List list, boolean z17, g26.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 16) != 0) {
            lVar = null;
        }
        return d(r1Var, c2Var, list, z17, lVar);
    }

    public static final f26.z0 f(f26.r1 attributes, f26.c2 constructor, java.util.List arguments, boolean z17, y16.s memberScope) {
        kotlin.jvm.internal.o.g(attributes, "attributes");
        kotlin.jvm.internal.o.g(constructor, "constructor");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        kotlin.jvm.internal.o.g(memberScope, "memberScope");
        f26.a1 a1Var = new f26.a1(constructor, arguments, z17, memberScope, new f26.q0(constructor, arguments, attributes, z17, memberScope));
        return attributes.isEmpty() ? a1Var : new f26.b1(a1Var, attributes);
    }

    public static final f26.z0 g(f26.r1 attributes, f26.c2 constructor, java.util.List arguments, boolean z17, y16.s memberScope, yz5.l refinedTypeFactory) {
        kotlin.jvm.internal.o.g(attributes, "attributes");
        kotlin.jvm.internal.o.g(constructor, "constructor");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        kotlin.jvm.internal.o.g(memberScope, "memberScope");
        kotlin.jvm.internal.o.g(refinedTypeFactory, "refinedTypeFactory");
        f26.a1 a1Var = new f26.a1(constructor, arguments, z17, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? a1Var : new f26.b1(a1Var, attributes);
    }
}
