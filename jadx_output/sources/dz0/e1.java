package dz0;

/* loaded from: classes5.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244830e = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.e1(this.f244830e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f244829d
            r2 = 3
            r3 = 2
            r4 = 1
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r5 = r6.f244830e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3e
        L21:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L35
        L25:
            kotlin.ResultKt.throwOnFailure(r7)
            dz0.k r7 = r5.f69785f
            if (r7 == 0) goto L35
            r6.f244829d = r4
            java.lang.Object r7 = r7.H6(r6)
            if (r7 != r0) goto L35
            return r0
        L35:
            r6.f244829d = r3
            java.lang.Object r7 = com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.Q6(r5, r6)
            if (r7 != r0) goto L3e
            return r0
        L3e:
            dz0.k r7 = r5.f69785f
            if (r7 == 0) goto L4b
            r6.f244829d = r2
            java.lang.Object r7 = r7.R1(r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
