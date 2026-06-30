package r16;

/* loaded from: classes16.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f368667a = 0;

    static {
        n16.b.l(new n16.c("kotlin.jvm.JvmInline"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(o06.b r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r4, r0)
            boolean r0 = r4 instanceof o06.p1
            r1 = 0
            if (r0 == 0) goto L4c
            o06.p1 r4 = (o06.p1) r4
            r06.d1 r4 = (r06.d1) r4
            o06.o1 r4 = r4.s0()
            java.lang.String r0 = "getCorrespondingProperty(...)"
            kotlin.jvm.internal.o.f(r4, r0)
            o06.r1 r0 = r4.c0()
            r2 = 1
            if (r0 != 0) goto L48
            o06.m r0 = r4.e()
            boolean r3 = r0 instanceof o06.g
            if (r3 == 0) goto L29
            o06.g r0 = (o06.g) r0
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L43
            o06.j2 r0 = r0.d0()
            if (r0 == 0) goto L43
            n16.g r4 = r4.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.o.f(r4, r3)
            boolean r4 = r0.a(r4)
            if (r4 != r2) goto L43
            r4 = r2
            goto L44
        L43:
            r4 = r1
        L44:
            if (r4 == 0) goto L48
            r4 = r2
            goto L49
        L48:
            r4 = r1
        L49:
            if (r4 == 0) goto L4c
            r1 = r2
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.m.a(o06.b):boolean");
    }

    public static final boolean b(o06.m mVar) {
        kotlin.jvm.internal.o.g(mVar, "<this>");
        return (mVar instanceof o06.g) && (((o06.g) mVar).d0() instanceof o06.o0);
    }

    public static final boolean c(o06.m mVar) {
        kotlin.jvm.internal.o.g(mVar, "<this>");
        return (mVar instanceof o06.g) && (((o06.g) mVar).d0() instanceof o06.w0);
    }

    public static final boolean d(o06.m2 m2Var) {
        kotlin.jvm.internal.o.g(m2Var, "<this>");
        if (m2Var.c0() == null) {
            o06.m e17 = m2Var.e();
            n16.g gVar = null;
            o06.g gVar2 = e17 instanceof o06.g ? (o06.g) e17 : null;
            if (gVar2 != null) {
                int i17 = v16.f.f432601a;
                o06.j2 d07 = gVar2.d0();
                o06.o0 o0Var = d07 instanceof o06.o0 ? (o06.o0) d07 : null;
                if (o0Var != null) {
                    gVar = o0Var.f341975a;
                }
            }
            if (kotlin.jvm.internal.o.b(gVar, m2Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(o06.m mVar) {
        kotlin.jvm.internal.o.g(mVar, "<this>");
        return b(mVar) || c(mVar);
    }

    public static final boolean f(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        o06.j i17 = o0Var.w0().i();
        if (i17 != null) {
            return e(i17);
        }
        return false;
    }

    public static final boolean g(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        o06.j i17 = o0Var.w0().i();
        if (i17 != null) {
            return c(i17) && !f26.z2.f(o0Var);
        }
        return false;
    }

    public static final f26.o0 h(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        o06.j i17 = o0Var.w0().i();
        o06.g gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
        if (gVar == null) {
            return null;
        }
        int i18 = v16.f.f432601a;
        o06.j2 d07 = gVar.d0();
        o06.o0 o0Var2 = d07 instanceof o06.o0 ? (o06.o0) d07 : null;
        if (o0Var2 != null) {
            return (f26.z0) o0Var2.f341976b;
        }
        return null;
    }
}
