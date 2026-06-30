package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class jo extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.mo f147075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r2.f379628m != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r2.f379628m != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O6() {
        /*
            r9 = this;
            long r0 = com.tencent.mm.plugin.luckymoney.model.m5.h()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            androidx.appcompat.app.AppCompatActivity r2 = r9.getActivity()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI"
            kotlin.jvm.internal.o.e(r2, r3)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI r2 = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI) r2
            r45.lm5 r2 = r2.c7()
            java.lang.String r3 = "MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC"
            r4 = 0
            if (r2 != 0) goto L21
            java.lang.String r0 = "[shouldShowSelectSkinPlazaNewRedDot] redDotData == null"
            com.tencent.mars.xlog.Log.e(r3, r0)
            return r4
        L21:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[shouldShowSelectSkinPlazaNewRedDot] version： "
            r5.<init>(r6)
            java.lang.String r6 = r2.f379623e
            r5.append(r6)
            java.lang.String r6 = ", type："
            r5.append(r6)
            int r6 = r2.f379622d
            r5.append(r6)
            java.lang.String r6 = " , is_show："
            r5.append(r6)
            boolean r6 = r2.f379628m
            r5.append(r6)
            java.lang.String r6 = " , currentTime： "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ",  invalidateTimes： "
            r5.append(r6)
            long r6 = r2.f379630o
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r3, r5)
            int r5 = r2.f379622d
            r6 = 1
            if (r5 == r6) goto L74
            r7 = 2
            if (r5 == r7) goto L68
            java.lang.String r0 = "[shouldShowSelectSkinPlazaNewRedDot] unknown type"
            com.tencent.mars.xlog.Log.e(r3, r0)
            goto La4
        L68:
            long r7 = r2.f379630o
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto La4
            boolean r0 = r2.f379628m
            if (r0 == 0) goto La4
        L72:
            r4 = r6
            goto La4
        L74:
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r7 = com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_CLICKEDSKIN_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.m(r7, r8)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.e(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r6) goto L99
            java.lang.String r0 = "[shouldShowSelectSkinPlazaNewRedDot] user has clicked select skin entry, ignore show reddot"
            com.tencent.mars.xlog.Log.e(r3, r0)
            return r4
        L99:
            long r7 = r2.f379630o
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto La4
            boolean r0 = r2.f379628m
            if (r0 == 0) goto La4
            goto L72
        La4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[shouldShowSelectSkinPlazaNewRedDot] shouldShow："
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.jo.O6():boolean");
    }
}
