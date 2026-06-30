package dz0;

/* loaded from: classes5.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245000e = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.r2(this.f245000e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f244999d
            r2 = 0
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r3 = r5.f245000e
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            kotlin.ResultKt.throwOnFailure(r6)
            goto L28
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.throwOnFailure(r6)
            az0.n7 r6 = r3.f69783d
            if (r6 == 0) goto L31
            r5.f244999d = r4
            java.lang.Object r6 = r6.r(r4, r4, r5)
            if (r6 != r0) goto L28
            return r0
        L28:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r4) goto L31
            r2 = r4
        L31:
            if (r2 == 0) goto L36
            r3.t7()
        L36:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.r2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
