package d26;

/* loaded from: classes16.dex */
public abstract class l0 extends y16.t {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f226020f = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(d26.l0.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(d26.l0.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    public final b26.t f226021b;

    /* renamed from: c, reason: collision with root package name */
    public final d26.b0 f226022c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f226023d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.y f226024e;

    public l0(b26.t c17, java.util.List functionList, java.util.List propertyList, java.util.List typeAliasList, yz5.a classNames) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(functionList, "functionList");
        kotlin.jvm.internal.o.g(propertyList, "propertyList");
        kotlin.jvm.internal.o.g(typeAliasList, "typeAliasList");
        kotlin.jvm.internal.o.g(classNames, "classNames");
        this.f226021b = c17;
        b26.q qVar = c17.f17515a;
        qVar.f17485c.getClass();
        this.f226022c = new d26.i0(this, functionList, propertyList, typeAliasList);
        this.f226023d = ((e26.u) qVar.f17483a).b(new d26.j0(classNames));
        this.f226024e = ((e26.u) qVar.f17483a).e(new d26.k0(this));
    }

    @Override // y16.t, y16.s
    public java.util.Set a() {
        d26.i0 i0Var = (d26.i0) this.f226022c;
        return (java.util.Set) e26.b0.a(i0Var.f226009g, i0Var, d26.i0.f226002j[0]);
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return ((d26.i0) this.f226022c).a(name, location);
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return ((d26.i0) this.f226022c).b(name, location);
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        e26.y yVar = this.f226024e;
        f06.v p17 = f226020f[1];
        kotlin.jvm.internal.o.g(yVar, "<this>");
        kotlin.jvm.internal.o.g(p17, "p");
        return (java.util.Set) ((e26.m) yVar).invoke();
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        if (q(name)) {
            return this.f226021b.f17515a.b(l(name));
        }
        d26.i0 i0Var = (d26.i0) this.f226022c;
        if (!((java.util.LinkedHashMap) i0Var.f226005c).keySet().contains(name)) {
            return null;
        }
        i0Var.getClass();
        return (o06.d2) ((e26.q) i0Var.f226008f).invoke(name);
    }

    @Override // y16.t, y16.s
    public java.util.Set g() {
        d26.i0 i0Var = (d26.i0) this.f226022c;
        return (java.util.Set) e26.b0.a(i0Var.f226010h, i0Var, d26.i0.f226002j[1]);
    }

    public abstract void h(java.util.Collection collection, yz5.l lVar);

    public final java.util.Collection i(y16.i kindFilter, yz5.l nameFilter, w06.a location) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        kotlin.jvm.internal.o.g(location, "location");
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        if (kindFilter.a(y16.i.f458946f)) {
            h(arrayList, nameFilter);
        }
        d26.i0 i0Var = (d26.i0) this.f226022c;
        i0Var.getClass();
        boolean a17 = kindFilter.a(y16.i.f458950j);
        r16.n nVar = r16.n.f368668d;
        if (a17) {
            java.util.Set<n16.g> set = (java.util.Set) e26.b0.a(i0Var.f226010h, i0Var, d26.i0.f226002j[1]);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (n16.g gVar : set) {
                if (((java.lang.Boolean) nameFilter.invoke(gVar)).booleanValue()) {
                    arrayList2.addAll(i0Var.b(gVar, location));
                }
            }
            kz5.g0.t(arrayList2, nVar);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.a(y16.i.f458949i)) {
            java.util.Set<n16.g> set2 = (java.util.Set) e26.b0.a(i0Var.f226009g, i0Var, d26.i0.f226002j[0]);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (n16.g gVar2 : set2) {
                if (((java.lang.Boolean) nameFilter.invoke(gVar2)).booleanValue()) {
                    arrayList3.addAll(i0Var.a(gVar2, location));
                }
            }
            kz5.g0.t(arrayList3, nVar);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.a(y16.i.f458952l)) {
            for (n16.g gVar3 : m()) {
                if (((java.lang.Boolean) nameFilter.invoke(gVar3)).booleanValue()) {
                    o26.a.a(arrayList, this.f226021b.f17515a.b(l(gVar3)));
                }
            }
        }
        if (kindFilter.a(y16.i.f458947g)) {
            for (java.lang.Object name : ((java.util.LinkedHashMap) i0Var.f226005c).keySet()) {
                if (((java.lang.Boolean) nameFilter.invoke(name)).booleanValue()) {
                    i0Var.getClass();
                    kotlin.jvm.internal.o.g(name, "name");
                    o26.a.a(arrayList, (o06.d2) ((e26.q) i0Var.f226008f).invoke(name));
                }
            }
        }
        return o26.a.b(arrayList);
    }

    public void j(n16.g name, java.util.List functions) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(functions, "functions");
    }

    public void k(n16.g name, java.util.List descriptors) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(descriptors, "descriptors");
    }

    public abstract n16.b l(n16.g gVar);

    public final java.util.Set m() {
        return (java.util.Set) e26.b0.a(this.f226023d, this, f226020f[0]);
    }

    public abstract java.util.Set n();

    public abstract java.util.Set o();

    public abstract java.util.Set p();

    public boolean q(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        return m().contains(name);
    }

    public boolean r(o06.v1 function) {
        kotlin.jvm.internal.o.g(function, "function");
        return true;
    }
}
