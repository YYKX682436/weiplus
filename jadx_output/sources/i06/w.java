package i06;

/* loaded from: classes15.dex */
public final class w extends i06.y {

    /* renamed from: a, reason: collision with root package name */
    public final o06.o1 f286770a;

    /* renamed from: b, reason: collision with root package name */
    public final i16.u0 f286771b;

    /* renamed from: c, reason: collision with root package name */
    public final l16.j f286772c;

    /* renamed from: d, reason: collision with root package name */
    public final k16.g f286773d;

    /* renamed from: e, reason: collision with root package name */
    public final k16.k f286774e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f286775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o06.o1 descriptor, i16.u0 proto, l16.j signature, k16.g nameResolver, k16.k typeTable) {
        super(null);
        java.lang.String str;
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(signature, "signature");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        this.f286770a = descriptor;
        this.f286771b = proto;
        this.f286772c = signature;
        this.f286773d = nameResolver;
        this.f286774e = typeTable;
        if ((signature.f315047e & 4) == 4) {
            sb6 = nameResolver.getString(signature.f315050h.f315034f) + nameResolver.getString(signature.f315050h.f315035g);
        } else {
            m16.d b17 = m16.j.f322899a.b(proto, nameResolver, typeTable, true);
            if (b17 == null) {
                throw new i06.a4("No field signature for property: " + descriptor);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(x06.o0.a(b17.f322888a));
            o06.m e17 = descriptor.e();
            kotlin.jvm.internal.o.f(e17, "getContainingDeclaration(...)");
            if (kotlin.jvm.internal.o.b(descriptor.getVisibility(), o06.f0.f341944d) && (e17 instanceof d26.x)) {
                p16.u classModuleName = l16.r.f315100i;
                kotlin.jvm.internal.o.f(classModuleName, "classModuleName");
                java.lang.Integer num = (java.lang.Integer) k16.i.a(((d26.x) e17).f226053h, classModuleName);
                java.lang.String str2 = (num == null || (str2 = nameResolver.getString(num.intValue())) == null) ? com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM : str2;
                r26.t tVar = n16.h.f334171a;
                tVar.getClass();
                java.lang.String replaceAll = tVar.f368917d.matcher(str2).replaceAll("_");
                kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                str = "$".concat(replaceAll);
            } else {
                if (kotlin.jvm.internal.o.b(descriptor.getVisibility(), o06.f0.f341941a) && (e17 instanceof o06.d1)) {
                    d26.z zVar = ((d26.n0) descriptor).L;
                    if (zVar instanceof g16.b0) {
                        g16.b0 b0Var = (g16.b0) zVar;
                        if (b0Var.f267594c != null) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("$");
                            java.lang.String e18 = b0Var.f267593b.e();
                            kotlin.jvm.internal.o.f(e18, "getInternalName(...)");
                            sb8.append(n16.g.k(r26.n0.o0(e18, '/', e18)).h());
                            str = sb8.toString();
                        }
                    }
                }
                str = "";
            }
            sb7.append(str);
            sb7.append("()");
            sb7.append(b17.f322889b);
            sb6 = sb7.toString();
        }
        this.f286775f = sb6;
    }

    @Override // i06.y
    public java.lang.String a() {
        return this.f286775f;
    }
}
