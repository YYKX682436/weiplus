package i06;

/* loaded from: classes15.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.y1 f286777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(i06.y1 y1Var) {
        super(0);
        this.f286777d = y1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.reflect.GenericDeclaration declaredConstructor;
        j06.j0 j0Var;
        j06.j0 d0Var;
        i06.k4 k4Var = i06.k4.f286686a;
        i06.y1 y1Var = this.f286777d;
        i06.t c17 = k4Var.c(y1Var.l());
        boolean z17 = c17 instanceof i06.s;
        i06.u1 u1Var = y1Var.f286794m;
        if (z17) {
            o06.n0 l17 = y1Var.l();
            o06.m e17 = l17.e();
            kotlin.jvm.internal.o.f(e17, "getContainingDeclaration(...)");
            if (r16.m.c(e17) && (l17 instanceof o06.l) && ((o06.l) l17).isPrimary()) {
                throw new i06.a4(y1Var.l().e() + " cannot have default arguments");
            }
            m16.e eVar = ((i06.s) c17).f286743a;
            java.lang.String name = eVar.f322890a;
            java.lang.reflect.Member b17 = y1Var.i().b();
            kotlin.jvm.internal.o.d(b17);
            boolean z18 = !java.lang.reflect.Modifier.isStatic(b17.getModifiers());
            u1Var.getClass();
            kotlin.jvm.internal.o.g(name, "name");
            java.lang.String desc = eVar.f322891b;
            kotlin.jvm.internal.o.g(desc, "desc");
            if (!kotlin.jvm.internal.o.b(name, "<init>")) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (z18) {
                    arrayList.add(u1Var.f());
                }
                u1Var.i(arrayList, desc, false);
                declaredConstructor = u1Var.r(u1Var.o(), name.concat("$default"), (java.lang.Class[]) arrayList.toArray(new java.lang.Class[0]), u1Var.s(desc, r26.n0.K(desc, ')', 0, false, 6, null) + 1, desc.length()), z18);
            }
            declaredConstructor = null;
        } else {
            if (c17 instanceof i06.r) {
                if (y1Var.n()) {
                    java.lang.Class f17 = u1Var.f();
                    java.util.List parameters = y1Var.getParameters();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(parameters, 10));
                    java.util.Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        java.lang.String name2 = ((i06.u2) ((f06.o) it.next())).getName();
                        kotlin.jvm.internal.o.d(name2);
                        arrayList2.add(name2);
                    }
                    return new j06.c(f17, arrayList2, j06.a.f297036d, j06.b.f297041e, null, 16, null);
                }
                java.lang.String desc2 = ((i06.r) c17).f286737a.f322891b;
                u1Var.getClass();
                kotlin.jvm.internal.o.g(desc2, "desc");
                java.lang.Class f18 = u1Var.f();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                u1Var.i(arrayList3, desc2, true);
                try {
                    java.lang.Class[] clsArr = (java.lang.Class[]) arrayList3.toArray(new java.lang.Class[0]);
                    declaredConstructor = f18.getDeclaredConstructor((java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
                } catch (java.lang.NoSuchMethodException unused) {
                }
            } else if (c17 instanceof i06.n) {
                java.lang.Class f19 = u1Var.f();
                java.util.List list = ((i06.n) c17).f286697a;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((java.lang.reflect.Method) it6.next()).getName());
                }
                return new j06.c(f19, arrayList4, j06.a.f297036d, j06.b.f297040d, list);
            }
            declaredConstructor = null;
        }
        if (declaredConstructor instanceof java.lang.reflect.Constructor) {
            j0Var = i06.y1.p(y1Var, (java.lang.reflect.Constructor) declaredConstructor, y1Var.l(), true);
        } else if (declaredConstructor instanceof java.lang.reflect.Method) {
            if (((p06.b) y1Var.l()).getAnnotations().a(i06.o4.f286715a) != null) {
                o06.m e18 = y1Var.l().e();
                kotlin.jvm.internal.o.e(e18, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((o06.g) e18).g0()) {
                    java.lang.reflect.Method method = (java.lang.reflect.Method) declaredConstructor;
                    d0Var = y1Var.o() ? new j06.c0(method) : new j06.g0(method);
                    j0Var = d0Var;
                }
            }
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) declaredConstructor;
            d0Var = y1Var.o() ? new j06.d0(method2, j06.s0.a(y1Var.f286796o, y1Var.l())) : new j06.h0(method2);
            j0Var = d0Var;
        } else {
            j0Var = null;
        }
        return j0Var != null ? j06.s0.b(j0Var, y1Var.l(), true) : null;
    }
}
