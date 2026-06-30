package ir2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ir2.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294182e = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.m0(this.f294182e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f294181d
            ir2.a1 r2 = r5.f294182e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2e
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            ir2.a0 r6 = r2.f294093f
            if (r6 == 0) goto L40
            r5.f294181d = r4
            java.lang.Object r6 = r6.d(r5)
            if (r6 != r0) goto L2e
            return r0
        L2e:
            ir2.e1 r6 = (ir2.e1) r6
            if (r6 == 0) goto L40
            ir2.r r1 = new ir2.r
            r1.<init>(r6)
            r5.f294181d = r3
            java.lang.Object r6 = r2.T6(r1, r5)
            if (r6 != r0) goto L40
            return r0
        L40:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
