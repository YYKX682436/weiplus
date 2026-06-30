package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes14.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f162966d;

    /* renamed from: e, reason: collision with root package name */
    public int f162967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f162968f = j3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v2 v2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v2(this.f162968f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        return v2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1");
        return invokeSuspend;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0033 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBufferingMonitor$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r10.f162967e
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 != r5) goto L19
            int r3 = r10.f162966d
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
            goto L39
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r11
        L24:
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r10
            r3 = r4
        L29:
            r11.f162966d = r3
            r11.f162967e = r5
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = kotlinx.coroutines.k1.b(r6, r11)
            if (r6 != r2) goto L39
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L39:
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 r6 = r11.f162968f
            boolean r7 = r6.b0()
            if (r7 == 0) goto L29
            r6.getClass()
            java.lang.String r7 = "getLifecycle"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            androidx.lifecycle.o r7 = r6.G
            if (r7 == 0) goto L57
            androidx.lifecycle.n r7 = r7.b()
            goto L58
        L57:
            r7 = 0
        L58:
            androidx.lifecycle.n r8 = androidx.lifecycle.n.RESUMED
            if (r7 != r8) goto L29
            java.lang.String r7 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.R(r6)
            n01.d r7 = n01.c.d(r7)
            if (r7 != 0) goto L67
            goto L29
        L67:
            int r8 = r7.f333866e
            if (r8 <= 0) goto L9d
            int r9 = r7.f333862a
            if (r9 <= 0) goto L9d
            if (r8 < r9) goto L9d
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r11 = r6.V()
            r11.setShowLoading(r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "all data buffered! "
            r11.<init>(r2)
            int r2 = r7.f333866e
            r11.append(r2)
            r2 = 32
            r11.append(r2)
            int r2 = r7.f333862a
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            java.lang.String r2 = "MicroMsg.Sns.AdLandingMusicComponent"
            com.tencent.mars.xlog.Log.i(r2, r11)
            jz5.f0 r11 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r11
        L9d:
            int r8 = r7.f333863b
            if (r3 == r8) goto Laa
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r3 = r6.V()
            r3.setShowLoading(r4)
            r3 = r8
            goto Lb1
        Laa:
            com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton r6 = r6.V()
            r6.setShowLoading(r5)
        Lb1:
            int r6 = r7.f333866e
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r6)
            int r6 = r7.f333863b
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r6)
            int r6 = r7.f333862a
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.v2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
