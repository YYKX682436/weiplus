package k84;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.p f305039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(mb4.p pVar, k84.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305039e = pVar;
        this.f305040f = q1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        k84.g0 g0Var = new k84.g0(this.f305039e, this.f305040f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        return g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        java.lang.Object invokeSuspend = ((k84.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r9.f305038d
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
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.adsocial.TagInfo"
            r5 = 0
            mb4.p r6 = r9.f305039e
            if (r10 != 0) goto L4d
            mb4.h0 r10 = r6.c()
            if (r10 == 0) goto L6a
            java.lang.String r5 = "getJumpLinkIconLight"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            com.tencent.mm.plugin.sns.storage.h1 r6 = r10.f325420h
            f06.v[] r7 = mb4.h0.f325412l
            r8 = 0
            r7 = r7[r8]
            com.tencent.mm.plugin.sns.storage.r0 r6 = (com.tencent.mm.plugin.sns.storage.r0) r6
            java.lang.Object r10 = r6.a(r10, r7)
            java.lang.String r10 = (java.lang.String) r10
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L69
        L4d:
            mb4.h0 r10 = r6.c()
            if (r10 == 0) goto L6a
            java.lang.String r5 = "getJumpLinkIconDark"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            com.tencent.mm.plugin.sns.storage.h1 r6 = r10.f325421i
            f06.v[] r7 = mb4.h0.f325412l
            r7 = r7[r4]
            com.tencent.mm.plugin.sns.storage.r0 r6 = (com.tencent.mm.plugin.sns.storage.r0) r6
            java.lang.Object r10 = r6.a(r10, r7)
            java.lang.String r10 = (java.lang.String) r10
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L69:
            r5 = r10
        L6a:
            n74.r r10 = n74.r.f335421a
            if (r5 != 0) goto L70
            java.lang.String r5 = ""
        L70:
            k84.q1 r3 = r9.f305040f
            r3.getClass()
            java.lang.String r6 = "getTagIconAfterLike"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            jz5.g r3 = r3.K
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r9.f305038d = r4
            java.lang.Object r10 = r10.e(r5, r3, r9)
            if (r10 != r2) goto L95
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L95:
            jz5.f0 r10 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
