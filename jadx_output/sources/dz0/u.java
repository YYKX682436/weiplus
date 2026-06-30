package dz0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f245018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f245019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245017e = maasSdkUIC;
        this.f245018f = mJTime;
        this.f245019g = mJTimeRange;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.u(this.f245017e, this.f245018f, this.f245019g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f245016d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r2 = r5.f245017e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.throwOnFailure(r6)
            goto L46
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
            az0.n7 r6 = r2.f69783d
            if (r6 == 0) goto L30
            r5.f245016d = r4
            java.lang.Object r6 = r6.q(r5)
            if (r6 != r0) goto L2e
            return r0
        L2e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L30:
            az0.n7 r6 = r2.f69783d
            if (r6 == 0) goto L48
            java.lang.String r1 = "$startPlayTime"
            com.tencent.maas.model.time.MJTime r2 = r5.f245018f
            kotlin.jvm.internal.o.f(r2, r1)
            r5.f245016d = r3
            com.tencent.maas.model.time.MJTimeRange r1 = r5.f245019g
            java.lang.Object r6 = r6.o(r2, r1, r5)
            if (r6 != r0) goto L46
            return r0
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L48:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
