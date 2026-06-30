package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f146856d;

    public e1(com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        this.f146856d = e1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0028, B:5:0x002c, B:7:0x0030, B:8:0x0034, B:10:0x003a, B:13:0x0041, B:17:0x0048), top: B:2:0x0028 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailAmountInfoUIC$renderDetailAmountInfoView$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "amount_info route_info click"
            java.lang.String r0 = "MicroMsg.LuckyMoneyDetailAmountInfoUIC"
            com.tencent.mars.xlog.Log.i(r0, r7)
            r45.yt5 r7 = new r45.yt5
            r7.<init>()
            r1 = 0
            com.tencent.mm.plugin.luckymoney.model.e1 r2 = r6.f146856d     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L33
            com.tencent.mm.plugin.luckymoney.model.r0 r2 = r2.f145244p0     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L33
            java.lang.String r2 = r2.f145568e     // Catch: java.lang.Exception -> L68
            goto L34
        L33:
            r2 = 0
        L34:
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L45
            int r3 = r2.length     // Catch: java.lang.Exception -> L68
            r4 = 1
            if (r3 != 0) goto L40
            r3 = r4
            goto L41
        L40:
            r3 = r1
        L41:
            r3 = r3 ^ r4
            if (r3 != r4) goto L45
            goto L46
        L45:
            r4 = r1
        L46:
            if (r4 == 0) goto L70
            r7.parseFrom(r2)     // Catch: java.lang.Exception -> L68
            com.tencent.kinda.gen.ITransmitKvData r2 = com.tencent.kinda.gen.ITransmitKvData.create()     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "route_info"
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.Exception -> L68
            r2.putBinary(r3, r7)     // Catch: java.lang.Exception -> L68
            java.lang.Class<h45.q> r7 = h45.q.class
            i95.m r7 = i95.n0.c(r7)     // Catch: java.lang.Exception -> L68
            h45.q r7 = (h45.q) r7     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "commonRoute"
            com.tencent.mm.plugin.luckymoney.ui.d1 r4 = com.tencent.mm.plugin.luckymoney.ui.d1.f146830a     // Catch: java.lang.Exception -> L68
            r7.startUseCase(r3, r2, r4)     // Catch: java.lang.Exception -> L68
            goto L70
        L68:
            r7 = move-exception
            java.lang.String r2 = "parse route_info error"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r7, r2, r1)
        L70:
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailAmountInfoUIC$renderDetailAmountInfoView$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.e1.onClick(android.view.View):void");
    }
}
