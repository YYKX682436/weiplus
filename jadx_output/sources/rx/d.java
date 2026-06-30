package rx;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx.f f400661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rx.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400661e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rx.d(this.f400661e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f400660d
            r2 = 0
            rx.f r3 = r7.f400661e
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            kotlin.ResultKt.throwOnFailure(r8)
            goto L72
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L46
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)
            r7.f400660d = r5
            r3.getClass()
            com.tencent.mm.modelcdntran.z r8 = com.tencent.mm.modelcdntran.s1.aj()
            r8.getClass()
            oz5.n r1 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r7)
            r1.<init>(r6)
            com.tencent.mm.modelcdntran.l r6 = new com.tencent.mm.modelcdntran.l
            r6.<init>(r1, r8, r2)
            r8.c7(r6)
            java.lang.Object r8 = r1.a()
            if (r8 != r0) goto L46
            return r0
        L46:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L7c
            r7.f400660d = r4
            r3.getClass()
            com.tencent.mm.modelcdntran.z r8 = com.tencent.mm.modelcdntran.s1.aj()
            r8.getClass()
            oz5.n r1 = new oz5.n
            kotlin.coroutines.Continuation r3 = pz5.f.b(r7)
            r1.<init>(r3)
            com.tencent.mm.modelcdntran.m r3 = new com.tencent.mm.modelcdntran.m
            r3.<init>(r1, r8, r2)
            r8.c7(r3)
            java.lang.Object r8 = r1.a()
            if (r8 != r0) goto L72
            return r0
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            goto L7c
        L7b:
            r5 = 0
        L7c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
