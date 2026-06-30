package i06;

/* loaded from: classes15.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.y1 f286767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(i06.y1 y1Var) {
        super(0);
        this.f286767d = y1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        j06.j0 b0Var;
        i06.k4 k4Var = i06.k4.f286686a;
        i06.y1 y1Var = this.f286767d;
        i06.t c17 = k4Var.c(y1Var.l());
        boolean z17 = c17 instanceof i06.r;
        i06.u1 u1Var = y1Var.f286794m;
        if (z17) {
            if (y1Var.n()) {
                java.lang.Class f17 = u1Var.f();
                java.util.List parameters = y1Var.getParameters();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(parameters, 10));
                java.util.Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    java.lang.String name = ((i06.u2) ((f06.o) it.next())).getName();
                    kotlin.jvm.internal.o.d(name);
                    arrayList.add(name);
                }
                return new j06.c(f17, arrayList, j06.a.f297037e, j06.b.f297041e, null, 16, null);
            }
            java.lang.String desc = ((i06.r) c17).f286737a.f322891b;
            u1Var.getClass();
            kotlin.jvm.internal.o.g(desc, "desc");
            java.lang.Class f18 = u1Var.f();
            try {
                java.lang.Class[] clsArr = (java.lang.Class[]) ((java.util.ArrayList) u1Var.q(desc)).toArray(new java.lang.Class[0]);
                obj = f18.getDeclaredConstructor((java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            } catch (java.lang.NoSuchMethodException unused) {
                obj = null;
            }
        } else if (c17 instanceof i06.s) {
            o06.n0 l17 = y1Var.l();
            o06.m e17 = l17.e();
            kotlin.jvm.internal.o.f(e17, "getContainingDeclaration(...)");
            if (r16.m.c(e17) && (l17 instanceof o06.l) && ((o06.l) l17).isPrimary()) {
                o06.n0 l18 = y1Var.l();
                java.lang.String str = ((i06.s) c17).f286743a.f322891b;
                java.util.List W = y1Var.l().W();
                kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
                return new j06.q0(l18, u1Var, str, W);
            }
            m16.e eVar = ((i06.s) c17).f286743a;
            obj = u1Var.j(eVar.f322890a, eVar.f322891b);
        } else if (c17 instanceof i06.q) {
            obj = ((i06.q) c17).f286725a;
        } else {
            if (!(c17 instanceof i06.p)) {
                if (!(c17 instanceof i06.n)) {
                    throw new jz5.j();
                }
                java.lang.Class f19 = u1Var.f();
                java.util.List list = ((i06.n) c17).f286697a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(((java.lang.reflect.Method) it6.next()).getName());
                }
                return new j06.c(f19, arrayList2, j06.a.f297037e, j06.b.f297040d, list);
            }
            obj = ((i06.p) c17).f286716a;
        }
        if (obj instanceof java.lang.reflect.Constructor) {
            b0Var = i06.y1.p(y1Var, (java.lang.reflect.Constructor) obj, y1Var.l(), false);
        } else {
            if (!(obj instanceof java.lang.reflect.Method)) {
                throw new i06.a4("Could not compute caller for function: " + y1Var.l() + " (member = " + obj + ')');
            }
            java.lang.reflect.Method method = (java.lang.reflect.Method) obj;
            boolean isStatic = java.lang.reflect.Modifier.isStatic(method.getModifiers());
            java.lang.Object obj2 = y1Var.f286796o;
            b0Var = !isStatic ? y1Var.o() ? new j06.b0(method, j06.s0.a(obj2, y1Var.l())) : new j06.f0(method) : ((p06.b) y1Var.l()).getAnnotations().a(i06.o4.f286715a) != null ? y1Var.o() ? new j06.c0(method) : new j06.g0(method) : y1Var.o() ? new j06.d0(method, j06.s0.a(obj2, y1Var.l())) : new j06.h0(method);
        }
        return j06.s0.b(b0Var, y1Var.l(), false);
    }
}
