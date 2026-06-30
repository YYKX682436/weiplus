package z51;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f470194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.p f470195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z51.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470195e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z51.m(this.f470195e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f470194d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            z51.p r6 = r8.f470195e
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lab
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L99
        L24:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L62
        L28:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Class<z51.c> r9 = z51.c.class
            z51.x r9 = r6.a(r9)
            z51.c r9 = (z51.c) r9
            kotlinx.coroutines.r2 r9 = r9.f470175g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "first play to check parse job: "
            r1.<init>(r7)
            if (r9 == 0) goto L4a
            r7 = r9
            kotlinx.coroutines.a r7 = (kotlinx.coroutines.a) r7
            boolean r7 = r7.a()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L4b
        L4a:
            r7 = r5
        L4b:
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r6.f(r1)
            if (r9 == 0) goto L62
            r8.f470194d = r4
            kotlinx.coroutines.c3 r9 = (kotlinx.coroutines.c3) r9
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L62
            return r0
        L62:
            java.lang.Class<z51.w> r9 = z51.w.class
            z51.x r9 = r6.a(r9)
            z51.w r9 = (z51.w) r9
            kotlinx.coroutines.r2 r9 = r9.f470229g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "first play to check loadBitmapJob: "
            r1.<init>(r4)
            if (r9 == 0) goto L81
            r4 = r9
            kotlinx.coroutines.a r4 = (kotlinx.coroutines.a) r4
            boolean r4 = r4.a()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L82
        L81:
            r4 = r5
        L82:
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r6.f(r1)
            if (r9 == 0) goto L99
            r8.f470194d = r3
            kotlinx.coroutines.c3 r9 = (kotlinx.coroutines.c3) r9
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L99
            return r0
        L99:
            kotlinx.coroutines.p0 r9 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r9 = kotlinx.coroutines.internal.b0.f310484a
            z51.l r1 = new z51.l
            r1.<init>(r6, r5)
            r8.f470194d = r2
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r1, r8)
            if (r9 != r0) goto Lab
            return r0
        Lab:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z51.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
