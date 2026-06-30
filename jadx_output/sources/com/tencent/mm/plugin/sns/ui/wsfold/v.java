package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f171441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.w f171442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.f1 f171443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.sns.ui.wsfold.w wVar, com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171442e = wVar;
        this.f171443f = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        com.tencent.mm.plugin.sns.ui.wsfold.v vVar = new com.tencent.mm.plugin.sns.ui.wsfold.v(this.f171442e, this.f171443f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.wsfold.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        return invokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (((java.util.List) r7).isEmpty() != false) goto L18;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r6.f171441d
            com.tencent.mm.plugin.sns.ui.wsfold.w r4 = r6.f171442e
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 != r5) goto L17
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3d
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.plugin.mvvmlist.MvvmList r7 = r4.T6()
            java.util.ArrayList r7 = r7.f152065o
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L46
            r6.f171441d = r5
            java.lang.Object r7 = com.tencent.mm.plugin.sns.ui.wsfold.w.S6(r4, r6)
            if (r7 != r2) goto L3d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L3d:
            java.util.List r7 = (java.util.List) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L46
            goto L47
        L46:
            r5 = 0
        L47:
            if (r5 == 0) goto L55
            android.app.Activity r7 = r4.getContext()
            r2 = 2131776865(0x7f105561, float:1.9185214E38)
            java.lang.String r7 = i65.a.r(r7, r2)
            goto L57
        L55:
            java.lang.String r7 = ""
        L57:
            com.tencent.mm.plugin.sns.ui.wsfold.f1 r2 = r6.f171443f
            r2.getClass()
            java.lang.String r3 = "setLoadAllFinish"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView r2 = r2.T6()
            r2.a(r7)
            java.lang.String r7 = "MicroMsg.SnsWsFoldMainUIC"
            com.tencent.mars.xlog.Log.i(r7, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            jz5.f0 r7 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.wsfold.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
