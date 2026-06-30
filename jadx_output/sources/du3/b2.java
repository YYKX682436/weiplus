package du3;

/* loaded from: classes3.dex */
public final class b2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f243543d;

    public b2(du3.g2 g2Var) {
        this.f243543d = g2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.util.ArrayList r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof du3.a2
            if (r0 == 0) goto L13
            r0 = r8
            du3.a2 r0 = (du3.a2) r0
            int r1 = r0.f243510h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243510h = r1
            goto L18
        L13:
            du3.a2 r0 = new du3.a2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f243508f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f243510h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f243507e
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f243506d
            du3.g2 r2 = (du3.g2) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L41
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.Iterator r7 = r7.iterator()
            du3.g2 r8 = r6.f243543d
            r2 = r8
        L41:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6c
            java.lang.Object r8 = r7.next()
            hk0.j r8 = (hk0.j) r8
            int r8 = r8.f281752a
            r4 = 4
            if (r8 == r4) goto L55
            r4 = 7
            if (r8 != r4) goto L41
        L55:
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            du3.z1 r4 = new du3.z1
            r5 = 0
            r4.<init>(r2, r5)
            r0.f243506d = r2
            r0.f243507e = r7
            r0.f243510h = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r4, r0)
            if (r8 != r1) goto L41
            return r1
        L6c:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: du3.b2.emit(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
