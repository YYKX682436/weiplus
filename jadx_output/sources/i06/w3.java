package i06;

/* loaded from: classes15.dex */
public final class w3 implements kotlin.jvm.internal.p {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f286779h = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.w3.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.w3.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: d, reason: collision with root package name */
    public final f26.o0 f286780d;

    /* renamed from: e, reason: collision with root package name */
    public final i06.c4 f286781e;

    /* renamed from: f, reason: collision with root package name */
    public final i06.c4 f286782f;

    /* renamed from: g, reason: collision with root package name */
    public final i06.c4 f286783g;

    public w3(f26.o0 type, yz5.a aVar) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f286780d = type;
        i06.c4 c4Var = null;
        i06.c4 c4Var2 = aVar instanceof i06.c4 ? (i06.c4) aVar : null;
        if (c4Var2 != null) {
            c4Var = c4Var2;
        } else if (aVar != null) {
            c4Var = i06.f4.a(aVar);
        }
        this.f286781e = c4Var;
        this.f286782f = i06.f4.a(new i06.v3(this));
        this.f286783g = i06.f4.a(new i06.u3(this, aVar));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof i06.w3) {
            i06.w3 w3Var = (i06.w3) obj;
            if (kotlin.jvm.internal.o.b(this.f286780d, w3Var.f286780d) && kotlin.jvm.internal.o.b(i(), w3Var.i()) && kotlin.jvm.internal.o.b(h(), w3Var.h())) {
                return true;
            }
        }
        return false;
    }

    public final f06.e f(f26.o0 o0Var) {
        f26.o0 type;
        o06.j i17 = o0Var.w0().i();
        if (!(i17 instanceof o06.g)) {
            if (i17 instanceof o06.e2) {
                return new i06.y3(null, (o06.e2) i17);
            }
            if (i17 instanceof o06.d2) {
                throw new jz5.k("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        java.lang.Class k17 = i06.o4.k((o06.g) i17);
        if (k17 == null) {
            return null;
        }
        if (!k17.isArray()) {
            if (f26.z2.f(o0Var)) {
                return new i06.k1(k17);
            }
            java.lang.Class cls = (java.lang.Class) u06.i.f423506b.get(k17);
            if (cls != null) {
                k17 = cls;
            }
            return new i06.k1(k17);
        }
        f26.l2 l2Var = (f26.l2) kz5.n0.B0(o0Var.u0());
        if (l2Var == null || (type = l2Var.getType()) == null) {
            return new i06.k1(k17);
        }
        f06.e f17 = f(type);
        if (f17 != null) {
            return new i06.k1(java.lang.reflect.Array.newInstance((java.lang.Class<?>) xz5.a.b(h06.b.a(f17)), 0).getClass());
        }
        throw new i06.a4("Cannot determine classifier for array element type: " + this);
    }

    public java.util.List h() {
        f06.v vVar = f286779h[1];
        java.lang.Object invoke = this.f286783g.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (java.util.List) invoke;
    }

    public int hashCode() {
        int hashCode = this.f286780d.hashCode() * 31;
        f06.e i17 = i();
        return ((hashCode + (i17 != null ? i17.hashCode() : 0)) * 31) + h().hashCode();
    }

    public f06.e i() {
        f06.v vVar = f286779h[0];
        return (f06.e) this.f286782f.invoke();
    }

    public java.lang.reflect.Type j() {
        i06.c4 c4Var = this.f286781e;
        if (c4Var != null) {
            return (java.lang.reflect.Type) c4Var.invoke();
        }
        return null;
    }

    public java.lang.String toString() {
        return i06.j4.f286670a.d(this.f286780d);
    }

    public /* synthetic */ w3(f26.o0 o0Var, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this(o0Var, (i17 & 2) != 0 ? null : aVar);
    }
}
