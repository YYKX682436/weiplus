package i06;

/* loaded from: classes15.dex */
public final class y3 implements f06.x, i06.l1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f286801g = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.y3.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: d, reason: collision with root package name */
    public final o06.e2 f286802d;

    /* renamed from: e, reason: collision with root package name */
    public final i06.c4 f286803e;

    /* renamed from: f, reason: collision with root package name */
    public final i06.z3 f286804f;

    public y3(i06.z3 z3Var, o06.e2 descriptor) {
        java.lang.Class cls;
        i06.k1 k1Var;
        java.lang.Object w17;
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        this.f286802d = descriptor;
        this.f286803e = i06.f4.a(new i06.x3(this));
        if (z3Var == null) {
            o06.m e17 = descriptor.e();
            kotlin.jvm.internal.o.f(e17, "getContainingDeclaration(...)");
            if (e17 instanceof o06.g) {
                w17 = c((o06.g) e17);
            } else {
                if (!(e17 instanceof o06.d)) {
                    throw new i06.a4("Unknown type parameter container: " + e17);
                }
                o06.m e18 = ((o06.d) e17).e();
                kotlin.jvm.internal.o.f(e18, "getContainingDeclaration(...)");
                if (e18 instanceof o06.g) {
                    k1Var = c((o06.g) e18);
                } else {
                    d26.a0 a0Var = e17 instanceof d26.a0 ? (d26.a0) e17 : null;
                    if (a0Var == null) {
                        throw new i06.a4("Non-class callable descriptor must be deserialized: " + e17);
                    }
                    d26.z Y = a0Var.Y();
                    g16.b0 b0Var = Y instanceof g16.b0 ? (g16.b0) Y : null;
                    java.lang.Object obj = b0Var != null ? b0Var.f267595d : null;
                    t06.g gVar = obj instanceof t06.g ? (t06.g) obj : null;
                    if (gVar == null || (cls = gVar.f414536a) == null) {
                        throw new i06.a4("Container of deserialized member is not resolved: " + a0Var);
                    }
                    f06.d a17 = kotlin.jvm.internal.i0.a(cls);
                    kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    k1Var = (i06.k1) a17;
                }
                w17 = e17.w(new i06.j(k1Var), jz5.f0.f302826a);
            }
            kotlin.jvm.internal.o.d(w17);
            z3Var = (i06.z3) w17;
        }
        this.f286804f = z3Var;
    }

    public java.lang.String b() {
        java.lang.String h17 = this.f286802d.getName().h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        return h17;
    }

    public final i06.k1 c(o06.g gVar) {
        java.lang.Class k17 = i06.o4.k(gVar);
        i06.k1 k1Var = (i06.k1) (k17 != null ? kotlin.jvm.internal.i0.a(k17) : null);
        if (k1Var != null) {
            return k1Var;
        }
        throw new i06.a4("Type parameter container is not resolved: " + gVar.e());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof i06.y3) {
            i06.y3 y3Var = (i06.y3) obj;
            if (kotlin.jvm.internal.o.b(this.f286804f, y3Var.f286804f) && kotlin.jvm.internal.o.b(b(), y3Var.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // i06.l1
    public o06.j h() {
        return this.f286802d;
    }

    public int hashCode() {
        return (this.f286804f.hashCode() * 31) + b().hashCode();
    }

    public java.lang.String toString() {
        f06.a0 a0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int ordinal = this.f286802d.q().ordinal();
        if (ordinal == 0) {
            a0Var = f06.a0.f258435d;
        } else if (ordinal == 1) {
            a0Var = f06.a0.f258436e;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            a0Var = f06.a0.f258437f;
        }
        int ordinal2 = a0Var.ordinal();
        if (ordinal2 == 1) {
            sb6.append("in ");
        } else if (ordinal2 == 2) {
            sb6.append("out ");
        }
        sb6.append(b());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
