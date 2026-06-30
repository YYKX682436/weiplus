package g54;

/* loaded from: classes15.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView f268956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268956e = adThumbPlayerVideoView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        g54.v vVar = new g54.v(this.f268956e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        java.lang.Object invokeSuspend = ((g54.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002d -> B:5:0x0033). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r9.f268955d
            r4 = 1
            if (r3 == 0) goto L21
            if (r3 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            goto L33
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r10
        L21:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
        L25:
            r10.f268955d = r4
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r3 = kotlinx.coroutines.k1.b(r5, r10)
            if (r3 != r2) goto L33
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L33:
            int r3 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.I
            java.lang.String r3 = "access$getPlayer$p"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView r6 = r10.f268956e
            kk4.c r7 = r6.f163019i
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            if (r7 == 0) goto L57
            kk4.f0 r7 = (kk4.f0) r7
            long r7 = r7.getCurrentPositionMs()
            r6.getProgressListener()
            g54.u r3 = new g54.u
            r3.<init>(r7)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.o(r6, r3)
            goto L25
        L57:
            jz5.f0 r10 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g54.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
