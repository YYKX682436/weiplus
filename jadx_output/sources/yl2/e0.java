package yl2;

/* loaded from: classes.dex */
public final class e0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f462987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f462988b;

    public e0(kotlinx.coroutines.q qVar, yl2.g1 g1Var) {
        this.f462987a = qVar;
        this.f462988b = g1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if ((!(r7.length == 0)) == true) goto L14;
     */
    @Override // j35.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestPermissionsResult(int r5, java.lang.String[] r6, int[] r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "onRequestPermissionsResult requestCode:"
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "Finder.FinderLivePostHelper"
            com.tencent.mars.xlog.Log.i(r0, r6)
            r6 = 16
            kotlinx.coroutines.q r1 = r4.f462987a
            if (r5 != r6) goto L8e
            r6 = 0
            if (r7 == 0) goto L27
            int r2 = r7.length
            r3 = 1
            if (r2 != 0) goto L22
            r2 = r3
            goto L23
        L22:
            r2 = r6
        L23:
            r2 = r2 ^ r3
            if (r2 != r3) goto L27
            goto L28
        L27:
            r3 = r6
        L28:
            if (r3 == 0) goto L3a
            r7 = r7[r6]
            if (r7 != 0) goto L3a
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)
            r1.resumeWith(r5)
            goto L99
        L3a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "FinderLive request permission "
            r7.<init>(r2)
            r7.append(r5)
            java.lang.String r5 = " failed"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.tencent.mars.xlog.Log.i(r0, r5)
            com.tencent.mm.ui.widget.dialog.u1 r5 = new com.tencent.mm.ui.widget.dialog.u1
            yl2.g1 r7 = r4.f462988b
            com.tencent.mm.ui.MMFragmentActivity r0 = r7.f463008a
            r5.<init>(r0)
            com.tencent.mm.ui.MMFragmentActivity r0 = r7.f463008a
            r2 = 2131765408(0x7f1028a0, float:1.9161977E38)
            java.lang.String r0 = r0.getString(r2)
            r5.u(r0)
            com.tencent.mm.ui.MMFragmentActivity r0 = r7.f463008a
            r2 = 2131765407(0x7f10289f, float:1.9161975E38)
            java.lang.String r0 = r0.getString(r2)
            r5.g(r0)
            com.tencent.mm.ui.MMFragmentActivity r7 = r7.f463008a
            r0 = 2131765406(0x7f10289e, float:1.9161973E38)
            java.lang.String r7 = r7.getString(r0)
            r5.n(r7)
            yl2.c0 r7 = yl2.c0.f462980a
            r5.l(r7)
            yl2.d0 r7 = new yl2.d0
            r7.<init>(r1)
            r5.e(r7)
            r5.q(r6)
            goto L99
        L8e:
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)
            r1.resumeWith(r5)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yl2.e0.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
