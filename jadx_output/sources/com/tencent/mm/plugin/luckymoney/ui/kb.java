package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class kb implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147102d;

    public kb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147102d = luckyMoneyNewPrepareUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.F1) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c  */
    @Override // com.tencent.mm.sdk.platformtools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTimerExpired() {
        /*
            r10 = this;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI r0 = r10.f147102d
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f146253h
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L11
            int r1 = r1.c()
            if (r1 != r2) goto L11
            r1 = r3
            goto L12
        L11:
            r1 = r4
        L12:
            r5 = 0
            if (r1 != 0) goto L4a
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f146251g
            if (r1 == 0) goto L22
            int r1 = r1.c()
            if (r1 != r2) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r1 != 0) goto L4a
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f146251g
            if (r1 == 0) goto L2e
            int r1 = r1.getInput()
            goto L2f
        L2e:
            r1 = r4
        L2f:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r7 = r0.f146253h
            if (r7 == 0) goto L38
            double r7 = r7.getInput()
            goto L39
        L38:
            r7 = r5
        L39:
            int r9 = r0.T
            if (r9 != 0) goto L40
            double r1 = (double) r1
            double r7 = r7 * r1
            goto L4b
        L40:
            if (r9 != r2) goto L4b
            java.lang.String r1 = r0.F1
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 == 0) goto L4b
        L4a:
            r7 = r5
        L4b:
            int r1 = r0.Y
            boolean r1 = com.tencent.mm.plugin.luckymoney.model.m5.r(r1)
            if (r1 == 0) goto L5c
            com.tencent.mm.plugin.luckymoney.model.c1 r1 = r0.Z
            if (r1 == 0) goto L5a
            double r1 = r1.A
            goto L62
        L5a:
            r1 = r5
            goto L62
        L5c:
            com.tencent.mm.plugin.luckymoney.model.c1 r1 = r0.Z
            if (r1 == 0) goto L5a
            double r1 = r1.f145183e
        L62:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L68
            r5 = r3
            goto L69
        L68:
            r5 = r4
        L69:
            if (r5 != 0) goto L88
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L88
            com.tencent.mm.plugin.luckymoney.ui.c6 r1 = r0.S
            boolean r1 = r1.c()
            if (r1 == 0) goto L78
            goto L88
        L78:
            android.widget.Button r1 = r0.f146263n
            if (r1 != 0) goto L7d
            goto L80
        L7d:
            r1.setClickable(r3)
        L80:
            android.widget.Button r1 = r0.f146263n
            if (r1 != 0) goto L85
            goto L88
        L85:
            r1.setEnabled(r3)
        L88:
            java.lang.ref.WeakReference r1 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onTimeExpired & check: amount="
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = ", hasErr="
            r1.append(r2)
            com.tencent.mm.plugin.luckymoney.ui.c6 r2 = r0.S
            boolean r2 = r2.c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.LuckyMoneyNewPrepareUI"
            com.tencent.mars.xlog.Log.i(r2, r1)
            com.tencent.mm.sdk.platformtools.b4 r0 = r0.f146259l1
            if (r0 == 0) goto Lb2
            r0.e()
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.kb.onTimerExpired():boolean");
    }
}
