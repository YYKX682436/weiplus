package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class k1 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.coroutines.Continuation r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.j1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.j1 r0 = (kotlinx.coroutines.j1) r0
            int r1 = r0.f310546e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310546e = r1
            goto L18
        L13:
            kotlinx.coroutines.j1 r0 = new kotlinx.coroutines.j1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f310545d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f310546e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            kotlin.ResultKt.throwOnFailure(r4)
            goto L47
        L2f:
            kotlin.ResultKt.throwOnFailure(r4)
            r0.f310546e = r3
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r4.<init>(r0, r3)
            r4.k()
            java.lang.Object r4 = r4.j()
            if (r4 != r1) goto L47
            return r1
        L47:
            jz5.d r4 = new jz5.d
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.k1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object b(long j17, kotlin.coroutines.Continuation continuation) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (j17 <= 0) {
            return f0Var;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (j17 < com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            d(rVar.f310577e).w(j17, rVar);
        }
        java.lang.Object j18 = rVar.j();
        return j18 == pz5.a.f359186d ? j18 : f0Var;
    }

    public static final java.lang.Object c(long j17, kotlin.coroutines.Continuation continuation) {
        long j18 = 0;
        if (s26.a.d(j17, 0L) > 0) {
            j18 = s26.a.e(j17);
            if (j18 < 1) {
                j18 = 1;
            }
        }
        java.lang.Object b17 = b(j18, continuation);
        return b17 == pz5.a.f359186d ? b17 : jz5.f0.f302826a;
    }

    public static final kotlinx.coroutines.i1 d(oz5.l lVar) {
        int i17 = oz5.f.Y0;
        oz5.i iVar = lVar.get(oz5.e.f350327d);
        kotlinx.coroutines.i1 i1Var = iVar instanceof kotlinx.coroutines.i1 ? (kotlinx.coroutines.i1) iVar : null;
        return i1Var == null ? kotlinx.coroutines.e1.f310173a : i1Var;
    }
}
