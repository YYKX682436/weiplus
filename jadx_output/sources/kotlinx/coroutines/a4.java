package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class a4 {
    public static final java.lang.Object a(kotlinx.coroutines.y3 y3Var, yz5.p pVar) {
        java.lang.Object e0Var;
        java.lang.Object V;
        y3Var.p(new kotlinx.coroutines.u1(kotlinx.coroutines.k1.d(y3Var.f310497f.getContext()).v(y3Var.f310706g, y3Var, y3Var.f310128e)));
        try {
            kotlin.jvm.internal.m0.e(pVar, 2);
            e0Var = pVar.invoke(y3Var, y3Var);
        } catch (java.lang.Throwable th6) {
            e0Var = new kotlinx.coroutines.e0(th6, false, 2, null);
        }
        pz5.a aVar = pz5.a.f359186d;
        if (e0Var == aVar || (V = y3Var.V(e0Var)) == kotlinx.coroutines.d3.f310162b) {
            return aVar;
        }
        if (V instanceof kotlinx.coroutines.e0) {
            java.lang.Throwable th7 = ((kotlinx.coroutines.e0) V).f310172a;
            if (((th7 instanceof kotlinx.coroutines.x3) && ((kotlinx.coroutines.x3) th7).f310700d == y3Var) ? false : true) {
                throw th7;
            }
            if (e0Var instanceof kotlinx.coroutines.e0) {
                throw ((kotlinx.coroutines.e0) e0Var).f310172a;
            }
        } else {
            e0Var = kotlinx.coroutines.d3.a(V);
        }
        return e0Var;
    }

    public static final java.lang.Object b(long j17, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        if (j17 <= 0) {
            throw new kotlinx.coroutines.x3("Timed out immediately", null);
        }
        java.lang.Object a17 = a(new kotlinx.coroutines.y3(j17, continuation), pVar);
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r7, yz5.p r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.z3
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.z3 r0 = (kotlinx.coroutines.z3) r0
            int r1 = r0.f310713g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310713g = r1
            goto L18
        L13:
            kotlinx.coroutines.z3 r0 = new kotlinx.coroutines.z3
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f310712f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310713g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r7 = r0.f310711e
            kotlin.jvm.internal.h0 r7 = (kotlin.jvm.internal.h0) r7
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: kotlinx.coroutines.x3 -> L2c
            goto L59
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L40
            return r3
        L40:
            kotlin.jvm.internal.h0 r10 = new kotlin.jvm.internal.h0
            r10.<init>()
            r0.f310710d = r9     // Catch: kotlinx.coroutines.x3 -> L5a
            r0.f310711e = r10     // Catch: kotlinx.coroutines.x3 -> L5a
            r0.f310713g = r4     // Catch: kotlinx.coroutines.x3 -> L5a
            kotlinx.coroutines.y3 r2 = new kotlinx.coroutines.y3     // Catch: kotlinx.coroutines.x3 -> L5a
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.x3 -> L5a
            r10.f310123d = r2     // Catch: kotlinx.coroutines.x3 -> L5a
            java.lang.Object r10 = a(r2, r9)     // Catch: kotlinx.coroutines.x3 -> L5a
            if (r10 != r1) goto L59
            return r1
        L59:
            return r10
        L5a:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L5d:
            kotlinx.coroutines.r2 r9 = r8.f310700d
            java.lang.Object r7 = r7.f310123d
            if (r9 != r7) goto L64
            return r3
        L64:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a4.c(long, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
