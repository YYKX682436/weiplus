package ec3;

/* loaded from: classes9.dex */
public final class o0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251070d;

    public o0(ec3.g1 g1Var) {
        this.f251070d = g1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterTextChanged(android.text.Editable r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L8
            java.lang.String r10 = r10.toString()
            goto L9
        L8:
            r10 = r0
        L9:
            ec3.g1 r1 = r9.f251070d
            androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
            boolean r3 = r2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI
            if (r3 == 0) goto L16
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI r2 = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) r2
            goto L17
        L16:
            r2 = r0
        L17:
            r3 = 0
            if (r2 == 0) goto L1d
            boolean r2 = r2.f146256i2
            goto L1e
        L1d:
            r2 = r3
        L1e:
            r4 = 1
            if (r2 == 0) goto L3a
            if (r10 == 0) goto L2c
            int r5 = r10.length()
            if (r5 != 0) goto L2a
            goto L2c
        L2a:
            r5 = r3
            goto L2d
        L2c:
            r5 = r4
        L2d:
            if (r5 != 0) goto L3a
            boolean r5 = r1.f251015i
            if (r5 == 0) goto L3a
            com.tencent.mm.plugin.luckymoney.model.j r5 = r1.f251017n
            if (r5 != 0) goto L38
            goto L3a
        L38:
            r5 = r3
            goto L3b
        L3a:
            r5 = r4
        L3b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[afterTextChanged] interruptRecommend: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r7 = "，text："
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = "，isNewStyle:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = "，needRecommendCoverInfo："
            r6.append(r2)
            boolean r2 = r1.f251015i
            r6.append(r2)
            java.lang.String r2 = "，recommendCoverInfoInterval："
            r6.append(r2)
            long r7 = r1.f251016m
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC"
            com.tencent.mars.xlog.Log.i(r6, r2)
            if (r5 == 0) goto L84
            java.lang.String r10 = "[afterTextChanged] no need RecommendCoverInfo，doHideRecommendStyle"
            com.tencent.mars.xlog.Log.i(r6, r10)
            ec3.g1.d7(r1, r3, r4, r0)
            r1.S6()
            return
        L84:
            com.tencent.mm.sdk.platformtools.b4 r2 = r1.f251018o
            if (r2 == 0) goto L8f
            if (r2 == 0) goto L8d
            r2.d()
        L8d:
            r1.f251018o = r0
        L8f:
            com.tencent.mm.sdk.platformtools.b4 r0 = new com.tencent.mm.sdk.platformtools.b4
            ec3.n0 r2 = new ec3.n0
            r2.<init>(r10, r5, r1)
            r0.<init>(r2, r3)
            r1.f251018o = r0
            com.tencent.mm.sdk.platformtools.b4 r10 = r1.f251018o
            if (r10 == 0) goto La8
            r0 = 150(0x96, float:2.1E-43)
            long r2 = (long) r0
            long r0 = r1.f251016m
            long r2 = r2 + r0
            r10.c(r2, r2)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.o0.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
