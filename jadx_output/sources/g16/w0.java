package g16;

/* loaded from: classes15.dex */
public abstract class w0 {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if ((r2 instanceof o06.p1) == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(o06.n0 r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            r0 = 1
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.o.g(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r4 == 0) goto L31
            boolean r4 = r2 instanceof o06.l
            if (r4 == 0) goto L1e
            java.lang.String r4 = "<init>"
            goto L2e
        L1e:
            r4 = r2
            r06.v r4 = (r06.v) r4
            n16.g r4 = r4.getName()
            java.lang.String r4 = r4.h()
            java.lang.String r6 = "asString(...)"
            kotlin.jvm.internal.o.f(r4, r6)
        L2e:
            r5.append(r4)
        L31:
            java.lang.String r4 = "("
            r5.append(r4)
            o06.r1 r4 = r2.c0()
            java.lang.String r6 = "getType(...)"
            if (r4 == 0) goto L4e
            r06.g r4 = (r06.g) r4
            f26.o0 r4 = r4.getType()
            kotlin.jvm.internal.o.f(r4, r6)
            g16.f0 r4 = c(r4)
            r5.append(r4)
        L4e:
            java.util.List r4 = r2.W()
            java.util.Iterator r4 = r4.iterator()
        L56:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r4.next()
            o06.l2 r1 = (o06.l2) r1
            r06.t1 r1 = (r06.t1) r1
            f26.o0 r1 = r1.getType()
            kotlin.jvm.internal.o.f(r1, r6)
            g16.f0 r1 = c(r1)
            r5.append(r1)
            goto L56
        L73:
            java.lang.String r4 = ")"
            r5.append(r4)
            if (r3 == 0) goto Lb9
            boolean r3 = r2 instanceof o06.l
            if (r3 == 0) goto L7f
            goto La3
        L7f:
            f26.o0 r3 = r2.getReturnType()
            kotlin.jvm.internal.o.d(r3)
            n16.g r4 = l06.o.f314888e
            n16.e r4 = l06.w.f314924e
            boolean r3 = l06.o.E(r3, r4)
            if (r3 == 0) goto La2
            f26.o0 r3 = r2.getReturnType()
            kotlin.jvm.internal.o.d(r3)
            boolean r3 = f26.z2.f(r3)
            if (r3 != 0) goto La2
            boolean r3 = r2 instanceof o06.p1
            if (r3 != 0) goto La2
            goto La3
        La2:
            r0 = 0
        La3:
            if (r0 == 0) goto Lab
            java.lang.String r2 = "V"
            r5.append(r2)
            goto Lb9
        Lab:
            f26.o0 r2 = r2.getReturnType()
            kotlin.jvm.internal.o.d(r2)
            g16.f0 r2 = c(r2)
            r5.append(r2)
        Lb9:
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g16.w0.a(o06.n0, boolean, boolean, int, java.lang.Object):java.lang.String");
    }

    public static final java.lang.String b(o06.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        g16.a1 a1Var = g16.a1.f267591a;
        if (r16.i.p(bVar)) {
            return null;
        }
        o06.m e17 = bVar.e();
        o06.g gVar = e17 instanceof o06.g ? (o06.g) e17 : null;
        if (gVar == null || gVar.getName().f334170e) {
            return null;
        }
        o06.b a17 = bVar.a();
        o06.v1 v1Var = a17 instanceof o06.v1 ? (o06.v1) a17 : null;
        if (v1Var == null) {
            return null;
        }
        return g16.v0.a(a1Var, gVar, a(v1Var, false, false, 3, null));
    }

    public static final g16.f0 c(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        g16.h0 h0Var = g16.h0.f267627a;
        g16.d1 d1Var = g16.d1.f267604k;
        g16.c1 c1Var = g16.c1.f267600a;
        int i17 = o26.l.f342604a;
        return (g16.f0) g16.u.b(o0Var, h0Var, d1Var, c1Var, null, o26.k.f342603d);
    }
}
