package g16;

/* loaded from: classes15.dex */
public final class b0 implements d26.z {

    /* renamed from: b, reason: collision with root package name */
    public final w16.d f267593b;

    /* renamed from: c, reason: collision with root package name */
    public final w16.d f267594c;

    /* renamed from: d, reason: collision with root package name */
    public final g16.q0 f267595d;

    public b0(g16.q0 kotlinClass, i16.o0 packageProto, k16.g nameResolver, b26.f0 f0Var, boolean z17, d26.y abiStability) {
        kotlin.jvm.internal.o.g(kotlinClass, "kotlinClass");
        kotlin.jvm.internal.o.g(packageProto, "packageProto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(abiStability, "abiStability");
        t06.g gVar = (t06.g) kotlinClass;
        w16.d b17 = w16.d.b(gVar.a());
        h16.c cVar = gVar.f414537b;
        cVar.getClass();
        w16.d dVar = null;
        java.lang.String str = cVar.f278229a == h16.b.f278226o ? cVar.f278234f : null;
        if (str != null) {
            if (str.length() > 0) {
                dVar = w16.d.d(str);
            }
        }
        this.f267593b = b17;
        this.f267594c = dVar;
        this.f267595d = kotlinClass;
        p16.u packageModuleName = l16.r.f315104m;
        kotlin.jvm.internal.o.f(packageModuleName, "packageModuleName");
        java.lang.Integer num = (java.lang.Integer) k16.i.a(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @Override // d26.z
    public java.lang.String a() {
        return "Class '" + c().b().b() + '\'';
    }

    @Override // o06.x1
    public o06.z1 b() {
        return o06.z1.f342013a;
    }

    public final n16.b c() {
        n16.c cVar;
        w16.d dVar = this.f267593b;
        java.lang.String str = dVar.f442252a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = n16.c.f334159c;
            if (cVar == null) {
                w16.d.a(7);
                throw null;
            }
        } else {
            cVar = new n16.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        java.lang.String e17 = dVar.e();
        kotlin.jvm.internal.o.f(e17, "getInternalName(...)");
        return new n16.b(cVar, n16.g.k(r26.n0.o0(e17, '/', e17)));
    }

    public java.lang.String toString() {
        return g16.b0.class.getSimpleName() + ": " + this.f267593b;
    }
}
