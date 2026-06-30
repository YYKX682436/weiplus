package i06;

/* loaded from: classes16.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static final i06.j4 f286670a = new i06.j4();

    /* renamed from: b, reason: collision with root package name */
    public static final q16.s f286671b = q16.s.f359780a;

    public final void a(java.lang.StringBuilder sb6, o06.b bVar) {
        o06.r1 g17 = i06.o4.g(bVar);
        o06.r1 c07 = bVar.c0();
        if (g17 != null) {
            f26.o0 type = ((r06.g) g17).getType();
            kotlin.jvm.internal.o.f(type, "getType(...)");
            sb6.append(d(type));
            sb6.append(".");
        }
        boolean z17 = (g17 == null || c07 == null) ? false : true;
        if (z17) {
            sb6.append("(");
        }
        if (c07 != null) {
            f26.o0 type2 = ((r06.g) c07).getType();
            kotlin.jvm.internal.o.f(type2, "getType(...)");
            sb6.append(d(type2));
            sb6.append(".");
        }
        if (z17) {
            sb6.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String b(o06.n0 descriptor) {
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("fun ");
        i06.j4 j4Var = f286670a;
        j4Var.a(sb6, descriptor);
        q16.s sVar = f286671b;
        n16.g name = ((r06.v) descriptor).getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        sb6.append(sVar.u(name, true));
        java.util.List W = descriptor.W();
        kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
        kz5.n0.f0(W, sb6, ", ", "(", ")", 0, null, i06.h4.f286656d, 48, null);
        sb6.append(": ");
        f26.o0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.o.d(returnType);
        sb6.append(j4Var.d(returnType));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String c(o06.o1 descriptor) {
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(descriptor.v() ? "var " : "val ");
        i06.j4 j4Var = f286670a;
        j4Var.a(sb6, descriptor);
        q16.s sVar = f286671b;
        n16.g name = descriptor.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        sb6.append(sVar.u(name, true));
        sb6.append(": ");
        f26.o0 type = descriptor.getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        sb6.append(j4Var.d(type));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String d(f26.o0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        return f286671b.v(type);
    }
}
