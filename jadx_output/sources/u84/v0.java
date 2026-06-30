package u84;

/* loaded from: classes4.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f425678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u84.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425679e = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$initIconView$1$1");
        u84.v0 v0Var = new u84.v0(this.f425679e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$initIconView$1$1");
        return v0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$initIconView$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$initIconView$1$1");
        java.lang.Object invokeSuspend = ((u84.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$initIconView$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$initIconView$1$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$initIconView$1$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r10.f425678d
            r4 = 1
            if (r3 == 0) goto L21
            if (r3 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r11)
            goto L9b
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r11
        L21:
            kotlin.ResultKt.throwOnFailure(r11)
            boolean r11 = com.tencent.mm.ui.bk.C()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo"
            u84.m1 r5 = r10.f425679e
            if (r11 != 0) goto L4c
            u84.o1 r11 = u84.m1.y(r5)
            if (r11 == 0) goto L69
            java.lang.String r6 = "getJumpLinkIconLight"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            com.tencent.mm.plugin.sns.storage.h1 r7 = r11.f425633h
            f06.v[] r8 = u84.o1.f425625n
            r9 = 0
            r8 = r8[r9]
            com.tencent.mm.plugin.sns.storage.r0 r7 = (com.tencent.mm.plugin.sns.storage.r0) r7
            java.lang.Object r11 = r7.a(r11, r8)
            java.lang.String r11 = (java.lang.String) r11
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L6a
        L4c:
            u84.o1 r11 = u84.m1.y(r5)
            if (r11 == 0) goto L69
            java.lang.String r6 = "getJumpLinkIconDark"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            com.tencent.mm.plugin.sns.storage.h1 r7 = r11.f425634i
            f06.v[] r8 = u84.o1.f425625n
            r8 = r8[r4]
            com.tencent.mm.plugin.sns.storage.r0 r7 = (com.tencent.mm.plugin.sns.storage.r0) r7
            java.lang.Object r11 = r7.a(r11, r8)
            java.lang.String r11 = (java.lang.String) r11
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L6a
        L69:
            r11 = 0
        L6a:
            n74.r r3 = n74.r.f335421a
            if (r11 != 0) goto L70
            java.lang.String r11 = ""
        L70:
            java.lang.String r6 = "access$getMStateSettingIcon"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r5.getClass()
            java.lang.String r8 = "getMStateSettingIcon"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            jz5.g r5 = r5.f425605z
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.mm.ui.widget.imageview.WeImageView) r5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r10.f425678d = r4
            java.lang.Object r11 = r3.e(r11, r5, r10)
            if (r11 != r2) goto L9b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L9b:
            jz5.f0 r11 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u84.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
