package k84;

/* loaded from: classes4.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.r f305238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305239f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(mb4.r rVar, k84.d4 d4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305238e = rVar;
        this.f305239f = d4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$6$1");
        k84.s2 s2Var = new k84.s2(this.f305238e, this.f305239f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$6$1");
        return s2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$6$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$6$1");
        java.lang.Object invokeSuspend = ((k84.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$6$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$6$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$6$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r9.f305237d
            r4 = 1
            if (r3 == 0) goto L21
            if (r3 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r10)
            goto L95
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r10
        L21:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = com.tencent.mm.ui.bk.C()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo"
            mb4.r r5 = r9.f305238e
            if (r10 != 0) goto L4c
            mb4.v r10 = r5.i()
            if (r10 == 0) goto L69
            java.lang.String r5 = "getJumpLinkIconLight"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            com.tencent.mm.plugin.sns.storage.h1 r6 = r10.f325484e
            f06.v[] r7 = mb4.v.f325479i
            r8 = 0
            r7 = r7[r8]
            com.tencent.mm.plugin.sns.storage.r0 r6 = (com.tencent.mm.plugin.sns.storage.r0) r6
            java.lang.Object r10 = r6.a(r10, r7)
            java.lang.String r10 = (java.lang.String) r10
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L6a
        L4c:
            mb4.v r10 = r5.i()
            if (r10 == 0) goto L69
            java.lang.String r5 = "getJumpLinkIconDark"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            com.tencent.mm.plugin.sns.storage.h1 r6 = r10.f325485f
            f06.v[] r7 = mb4.v.f325479i
            r7 = r7[r4]
            com.tencent.mm.plugin.sns.storage.r0 r6 = (com.tencent.mm.plugin.sns.storage.r0) r6
            java.lang.Object r10 = r6.a(r10, r7)
            java.lang.String r10 = (java.lang.String) r10
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L6a
        L69:
            r10 = 0
        L6a:
            n74.r r3 = n74.r.f335421a
            if (r10 != 0) goto L70
            java.lang.String r10 = ""
        L70:
            k84.d4 r5 = r9.f305239f
            r5.getClass()
            java.lang.String r6 = "getTagIconAfterLike"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            jz5.g r5 = r5.E
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.getValue()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r9.f305237d = r4
            java.lang.Object r10 = r3.e(r10, r5, r9)
            if (r10 != r2) goto L95
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L95:
            jz5.f0 r10 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.s2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
