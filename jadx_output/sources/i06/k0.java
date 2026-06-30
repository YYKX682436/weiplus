package i06;

/* loaded from: classes16.dex */
public abstract class k0 implements f06.c, i06.z3 {

    /* renamed from: d, reason: collision with root package name */
    public final i06.c4 f286673d = i06.f4.a(new i06.a0(this));

    /* renamed from: e, reason: collision with root package name */
    public final i06.c4 f286674e = i06.f4.a(new i06.f0(this));

    /* renamed from: f, reason: collision with root package name */
    public final i06.c4 f286675f = i06.f4.a(new i06.h0(this));

    /* renamed from: g, reason: collision with root package name */
    public final i06.c4 f286676g = i06.f4.a(new i06.i0(this));

    /* renamed from: h, reason: collision with root package name */
    public final i06.c4 f286677h = i06.f4.a(new i06.z(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f286678i = jz5.h.a(jz5.i.f302830e, new i06.j0(this));

    @Override // f06.c
    public java.lang.Object call(java.lang.Object... args) {
        kotlin.jvm.internal.o.g(args, "args");
        try {
            return i().call(args);
        } catch (java.lang.IllegalAccessException e17) {
            throw new g06.a(e17);
        }
    }

    @Override // f06.c
    public java.lang.Object callBy(java.util.Map args) {
        int i17;
        java.lang.Object h17;
        kotlin.jvm.internal.o.g(args, "args");
        int i18 = 0;
        if (n()) {
            java.util.List<f06.o> parameters = getParameters();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(parameters, 10));
            for (f06.o oVar : parameters) {
                if (args.containsKey(oVar)) {
                    h17 = args.get(oVar);
                    if (h17 == null) {
                        throw new java.lang.IllegalArgumentException("Annotation argument value cannot be null (" + oVar + ')');
                    }
                } else {
                    i06.u2 u2Var = (i06.u2) oVar;
                    if (u2Var.j()) {
                        h17 = null;
                    } else {
                        if (!u2Var.k()) {
                            throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + u2Var);
                        }
                        h17 = h(u2Var.i());
                    }
                }
                arrayList.add(h17);
            }
            j06.k k17 = k();
            if (k17 != null) {
                try {
                    return k17.call(arrayList.toArray(new java.lang.Object[0]));
                } catch (java.lang.IllegalAccessException e17) {
                    throw new g06.a(e17);
                }
            }
            throw new i06.a4("This callable does not support a default call: " + l());
        }
        java.util.List<f06.o> parameters2 = getParameters();
        int i19 = 1;
        if (parameters2.isEmpty()) {
            try {
                return i().call(isSuspend() ? new kotlin.coroutines.Continuation[]{null} : new kotlin.coroutines.Continuation[0]);
            } catch (java.lang.IllegalAccessException e18) {
                throw new g06.a(e18);
            }
        }
        int size = parameters2.size() + (isSuspend() ? 1 : 0);
        java.lang.Object[] objArr = (java.lang.Object[]) ((java.lang.Object[]) this.f286677h.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean booleanValue = ((java.lang.Boolean) this.f286678i.getValue()).booleanValue();
        int i27 = 0;
        for (f06.o oVar2 : parameters2) {
            int m17 = booleanValue ? m(oVar2) : i19;
            if (args.containsKey(oVar2)) {
                objArr[((i06.u2) oVar2).f286759e] = args.get(oVar2);
                i17 = i19;
            } else {
                i06.u2 u2Var2 = (i06.u2) oVar2;
                if (u2Var2.j()) {
                    if (booleanValue) {
                        int i28 = i27 + m17;
                        int i29 = i27;
                        while (i29 < i28) {
                            int i37 = (i29 / 32) + size;
                            java.lang.Object obj = objArr[i37];
                            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i37] = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() | (1 << (i29 % 32)));
                            i29++;
                            i19 = 1;
                        }
                        i17 = i19;
                    } else {
                        int i38 = (i27 / 32) + size;
                        java.lang.Object obj2 = objArr[i38];
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                        i17 = 1;
                        objArr[i38] = java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue() | (1 << (i27 % 32)));
                    }
                    i18 = i17;
                } else {
                    i17 = i19;
                    if (!u2Var2.k()) {
                        throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + u2Var2);
                    }
                }
            }
            if (((i06.u2) oVar2).f286760f == f06.n.f258456f) {
                i27 += m17;
            }
            i19 = i17;
        }
        if (i18 == 0) {
            try {
                j06.k i39 = i();
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, size);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                return i39.call(copyOf);
            } catch (java.lang.IllegalAccessException e19) {
                throw new g06.a(e19);
            }
        }
        j06.k k18 = k();
        if (k18 != null) {
            try {
                return k18.call(objArr);
            } catch (java.lang.IllegalAccessException e27) {
                throw new g06.a(e27);
            }
        }
        throw new i06.a4("This callable does not support a default call: " + l());
    }

    @Override // f06.b
    public java.util.List getAnnotations() {
        java.lang.Object invoke = this.f286673d.invoke();
        kotlin.jvm.internal.o.f(invoke, "invoke(...)");
        return (java.util.List) invoke;
    }

    @Override // f06.c
    public java.util.List getParameters() {
        java.lang.Object invoke = this.f286674e.invoke();
        kotlin.jvm.internal.o.f(invoke, "invoke(...)");
        return (java.util.List) invoke;
    }

    @Override // f06.c
    public f06.w getReturnType() {
        java.lang.Object invoke = this.f286675f.invoke();
        kotlin.jvm.internal.o.f(invoke, "invoke(...)");
        return (f06.w) invoke;
    }

    @Override // f06.c
    public java.util.List getTypeParameters() {
        java.lang.Object invoke = this.f286676g.invoke();
        kotlin.jvm.internal.o.f(invoke, "invoke(...)");
        return (java.util.List) invoke;
    }

    @Override // f06.c
    public f06.b0 getVisibility() {
        o06.g0 visibility = l().getVisibility();
        kotlin.jvm.internal.o.f(visibility, "getVisibility(...)");
        n16.c cVar = i06.o4.f286715a;
        if (kotlin.jvm.internal.o.b(visibility, o06.f0.f341945e)) {
            return f06.b0.f258439d;
        }
        if (kotlin.jvm.internal.o.b(visibility, o06.f0.f341943c)) {
            return f06.b0.f258440e;
        }
        if (kotlin.jvm.internal.o.b(visibility, o06.f0.f341944d)) {
            return f06.b0.f258441f;
        }
        if (kotlin.jvm.internal.o.b(visibility, o06.f0.f341941a) ? true : kotlin.jvm.internal.o.b(visibility, o06.f0.f341942b)) {
            return f06.b0.f258442g;
        }
        return null;
    }

    public final java.lang.Object h(f06.w wVar) {
        java.lang.Class b17 = xz5.a.b(h06.b.b(wVar));
        if (b17.isArray()) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(b17.getComponentType(), 0);
            kotlin.jvm.internal.o.f(newInstance, "run(...)");
            return newInstance;
        }
        throw new i06.a4("Cannot instantiate the default empty array of type " + b17.getSimpleName() + ", because it is not an array type");
    }

    public abstract j06.k i();

    @Override // f06.c
    public boolean isAbstract() {
        return l().f() == o06.t0.f341988h;
    }

    @Override // f06.c
    public boolean isFinal() {
        return l().f() == o06.t0.f341985e;
    }

    @Override // f06.c
    public boolean isOpen() {
        return l().f() == o06.t0.f341987g;
    }

    public abstract i06.u1 j();

    public abstract j06.k k();

    public abstract o06.d l();

    public final int m(f06.o oVar) {
        if (!((java.lang.Boolean) this.f286678i.getValue()).booleanValue()) {
            throw new java.lang.IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
        }
        i06.u2 u2Var = (i06.u2) oVar;
        if (!i06.o4.h(u2Var.i())) {
            return 1;
        }
        java.util.List e17 = j06.s0.e(f26.r2.a(((i06.w3) u2Var.i()).f286780d));
        kotlin.jvm.internal.o.d(e17);
        return ((java.util.ArrayList) e17).size();
    }

    public final boolean n() {
        return kotlin.jvm.internal.o.b(getName(), "<init>") && j().f().isAnnotation();
    }

    public abstract boolean o();
}
