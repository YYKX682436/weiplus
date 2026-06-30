package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.w2 f310398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f310399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f310400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f310401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(kotlinx.coroutines.flow.w2 w2Var, kotlinx.coroutines.flow.j jVar, kotlinx.coroutines.flow.i2 i2Var, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310398e = w2Var;
        this.f310399f = jVar;
        this.f310400g = i2Var;
        this.f310401h = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kotlinx.coroutines.flow.s1(this.f310398e, this.f310399f, this.f310400g, this.f310401h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kotlinx.coroutines.flow.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f310397d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            kotlinx.coroutines.flow.j r6 = r8.f310399f
            kotlinx.coroutines.flow.i2 r7 = r8.f310400g
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L55
        L23:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7d
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            int r9 = kotlinx.coroutines.flow.w2.f310443a
            kotlinx.coroutines.flow.w2 r9 = kotlinx.coroutines.flow.v2.f310429a
            kotlinx.coroutines.flow.w2 r1 = r8.f310398e
            if (r1 != r9) goto L3b
            r8.f310397d = r5
            java.lang.Object r9 = r6.a(r7, r8)
            if (r9 != r0) goto L7d
            return r0
        L3b:
            kotlinx.coroutines.flow.w2 r9 = kotlinx.coroutines.flow.v2.f310430b
            r5 = 0
            if (r1 != r9) goto L5e
            r9 = r7
            v26.b r9 = (v26.b) r9
            kotlinx.coroutines.flow.f3 r9 = r9.i()
            kotlinx.coroutines.flow.q1 r1 = new kotlinx.coroutines.flow.q1
            r1.<init>(r5)
            r8.f310397d = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.l.l(r9, r1, r8)
            if (r9 != r0) goto L55
            return r0
        L55:
            r8.f310397d = r3
            java.lang.Object r9 = r6.a(r7, r8)
            if (r9 != r0) goto L7d
            return r0
        L5e:
            r9 = r7
            v26.b r9 = (v26.b) r9
            kotlinx.coroutines.flow.f3 r9 = r9.i()
            kotlinx.coroutines.flow.j r9 = r1.a(r9)
            kotlinx.coroutines.flow.j r9 = kotlinx.coroutines.flow.l.i(r9)
            kotlinx.coroutines.flow.r1 r1 = new kotlinx.coroutines.flow.r1
            java.lang.Object r3 = r8.f310401h
            r1.<init>(r6, r7, r3, r5)
            r8.f310397d = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.l.f(r9, r1, r8)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
