package k84;

/* loaded from: classes4.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(k84.c6 c6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305331e = c6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        k84.x4 x4Var = new k84.x4(this.f305331e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        return x4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        java.lang.Object invokeSuspend = ((k84.x4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            pz5.a r2 = pz5.a.f359186d
            int r3 = r8.f305330d
            r4 = 1
            if (r3 == 0) goto L21
            if (r3 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L21:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = com.tencent.mm.ui.bk.C()
            r3 = 0
            k84.c6 r5 = r8.f305331e
            if (r9 != 0) goto L3e
            mb4.a r9 = k84.c6.z(r5)
            if (r9 == 0) goto L4f
            mb4.m r9 = r9.a()
            if (r9 == 0) goto L4f
            java.lang.String r9 = r9.b()
            goto L50
        L3e:
            mb4.a r9 = k84.c6.z(r5)
            if (r9 == 0) goto L4f
            mb4.l r9 = r9.b()
            if (r9 == 0) goto L4f
            java.lang.String r9 = r9.b()
            goto L50
        L4f:
            r9 = r3
        L50:
            java.lang.String r6 = ""
            if (r9 != 0) goto L55
            r9 = r6
        L55:
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r9)
            if (r7 != 0) goto L5d
            r3 = r9
            goto L74
        L5d:
            boolean r9 = com.tencent.mm.ui.bk.C()
            if (r9 != 0) goto L6c
            mb4.c r9 = k84.c6.A(r5)
            if (r9 == 0) goto L74
            java.lang.String r3 = r9.cheerIcon
            goto L74
        L6c:
            mb4.c r9 = k84.c6.A(r5)
            if (r9 == 0) goto L74
            java.lang.String r3 = r9.cheerIconDark
        L74:
            if (r3 != 0) goto L77
            goto L78
        L77:
            r6 = r3
        L78:
            n74.r r9 = n74.r.f335421a
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = k84.c6.C(r5)
            r8.f305330d = r4
            java.lang.Object r9 = r9.e(r6, r3, r8)
            if (r9 != r2) goto L8a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L8a:
            jz5.f0 r9 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.x4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
