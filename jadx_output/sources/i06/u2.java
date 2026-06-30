package i06;

/* loaded from: classes16.dex */
public final class u2 implements f06.o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f286757h = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.u2.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.u2.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: d, reason: collision with root package name */
    public final i06.k0 f286758d;

    /* renamed from: e, reason: collision with root package name */
    public final int f286759e;

    /* renamed from: f, reason: collision with root package name */
    public final f06.n f286760f;

    /* renamed from: g, reason: collision with root package name */
    public final i06.c4 f286761g;

    public u2(i06.k0 callable, int i17, f06.n kind, yz5.a computeDescriptor) {
        kotlin.jvm.internal.o.g(callable, "callable");
        kotlin.jvm.internal.o.g(kind, "kind");
        kotlin.jvm.internal.o.g(computeDescriptor, "computeDescriptor");
        this.f286758d = callable;
        this.f286759e = i17;
        this.f286760f = kind;
        this.f286761g = i06.f4.a(computeDescriptor);
        i06.f4.a(new i06.s2(this));
    }

    public static final java.lang.reflect.Type f(i06.u2 u2Var, java.lang.reflect.Type... typeArr) {
        u2Var.getClass();
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new i06.r2(typeArr) : (java.lang.reflect.Type) kz5.z.l0(typeArr);
        }
        throw new xz5.b("Expected at least 1 type for compound type");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof i06.u2) {
            i06.u2 u2Var = (i06.u2) obj;
            if (kotlin.jvm.internal.o.b(this.f286758d, u2Var.f286758d)) {
                if (this.f286759e == u2Var.f286759e) {
                    return true;
                }
            }
        }
        return false;
    }

    public java.lang.String getName() {
        o06.x0 h17 = h();
        o06.x0 x0Var = h17 instanceof o06.l2 ? (o06.l2) h17 : null;
        if (x0Var == null || ((r06.s1) x0Var).e().i0()) {
            return null;
        }
        n16.g name = ((r06.v) x0Var).getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        if (name.f334170e) {
            return null;
        }
        return name.h();
    }

    public final o06.l1 h() {
        f06.v vVar = f286757h[0];
        java.lang.Object invoke = this.f286761g.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (o06.l1) invoke;
    }

    public int hashCode() {
        return (this.f286758d.hashCode() * 31) + java.lang.Integer.hashCode(this.f286759e);
    }

    public f06.w i() {
        f26.o0 type = h().getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        return new i06.w3(type, new i06.t2(this));
    }

    public boolean j() {
        o06.l1 h17 = h();
        o06.l2 l2Var = h17 instanceof o06.l2 ? (o06.l2) h17 : null;
        if (l2Var != null) {
            return v16.f.a(l2Var);
        }
        return false;
    }

    public boolean k() {
        o06.l1 h17 = h();
        return (h17 instanceof o06.l2) && ((r06.s1) ((o06.l2) h17)).f368526p != null;
    }

    public java.lang.String toString() {
        java.lang.String b17;
        i06.j4 j4Var = i06.j4.f286670a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int ordinal = this.f286760f.ordinal();
        if (ordinal == 0) {
            sb6.append("instance parameter");
        } else if (ordinal == 1) {
            sb6.append("extension receiver parameter");
        } else if (ordinal == 2) {
            sb6.append("parameter #" + this.f286759e + ' ' + getName());
        }
        sb6.append(" of ");
        o06.d l17 = this.f286758d.l();
        if (l17 instanceof o06.o1) {
            b17 = j4Var.c((o06.o1) l17);
        } else {
            if (!(l17 instanceof o06.n0)) {
                throw new java.lang.IllegalStateException(("Illegal callable: " + l17).toString());
            }
            b17 = j4Var.b((o06.n0) l17);
        }
        sb6.append(b17);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
