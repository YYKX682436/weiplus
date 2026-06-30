package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public final class y4 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f210921d;

    public y4(android.app.Activity activity) {
        this.f210921d = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r7 != 4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if ((r7 && r3 <= 0) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0 A[LOOP:0: B:30:0x00ca->B:32:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    @Override // android.view.View.OnApplyWindowInsetsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r12, android.view.WindowInsets r13) {
        /*
            r11 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.o.g(r13, r0)
            int r0 = android.view.WindowInsets.Type.ime()
            boolean r0 = r13.isVisible(r0)
            int r1 = android.view.WindowInsets.Type.ime()
            android.graphics.Insets r1 = r13.getInsets(r1)
            java.lang.String r2 = "getInsets(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            boolean r3 = fp.e0.h()
            java.lang.String r4 = "max(...)"
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L45
            r3 = 256(0x100, float:3.59E-43)
            android.graphics.Insets r7 = r13.getInsets(r3)
            kotlin.jvm.internal.o.f(r7, r2)
            android.graphics.Insets r1 = android.graphics.Insets.max(r1, r7)
            kotlin.jvm.internal.o.f(r1, r4)
            if (r0 != 0) goto L44
            boolean r0 = r13.isVisible(r3)
            if (r0 == 0) goto L42
            goto L44
        L42:
            r0 = r5
            goto L45
        L44:
            r0 = r6
        L45:
            android.app.Activity r3 = r11.f210921d
            java.lang.Class r7 = r3.getClass()
            al5.q r7 = db5.f.d(r7)
            boolean r8 = com.tencent.mm.ui.b4.c(r3)
            java.lang.String r9 = "KeyBoardHeightProviderUtil"
            if (r8 == 0) goto L93
            if (r7 != 0) goto L5b
            r7 = -1
            goto L63
        L5b:
            int[] r8 = com.tencent.mm.ui.tools.x4.f210903a
            int r7 = r7.ordinal()
            r7 = r8[r7]
        L63:
            if (r7 == r6) goto L94
            r8 = 2
            if (r7 == r8) goto L93
            r8 = 3
            if (r7 == r8) goto L6f
            r3 = 4
            if (r7 == r3) goto L94
            goto L93
        L6f:
            com.tencent.mm.ui.tools.b5 r7 = com.tencent.mm.ui.tools.b5.f210297a
            boolean r7 = com.tencent.mm.ui.bl.f(r3)
            int r3 = com.tencent.mm.ui.cl.c(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r10}
            java.lang.String r10 = "swipeNvaBarMode tap=%s navVisible=%s"
            com.tencent.mars.xlog.Log.i(r9, r10, r8)
            if (r7 == 0) goto L90
            if (r3 > 0) goto L90
            r3 = r6
            goto L91
        L90:
            r3 = r5
        L91:
            if (r3 != 0) goto L94
        L93:
            r5 = r6
        L94:
            int r3 = android.view.WindowInsets.Type.navigationBars()
            android.graphics.Insets r3 = r13.getInsets(r3)
            kotlin.jvm.internal.o.f(r3, r2)
            if (r5 == 0) goto Laf
            android.graphics.Insets r2 = android.graphics.Insets.subtract(r1, r3)
            android.graphics.Insets r7 = android.graphics.Insets.NONE
            android.graphics.Insets r2 = android.graphics.Insets.max(r2, r7)
            kotlin.jvm.internal.o.f(r2, r4)
            goto Lb0
        Laf:
            r2 = r1
        Lb0:
            int r4 = r2.bottom
            int r2 = r2.top
            int r4 = r4 - r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r3}
            java.lang.String r2 = "onApplyWindowInsets needDeleDiff=%s imeInsets=%s navigationBarsInsets=%s"
            com.tencent.mars.xlog.Log.i(r9, r2, r1)
            com.tencent.mm.ui.tools.b5 r1 = com.tencent.mm.ui.tools.b5.f210297a
            java.util.Set r1 = com.tencent.mm.ui.tools.b5.f210299c
            java.util.Iterator r1 = r1.iterator()
        Lca:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lda
            java.lang.Object r2 = r1.next()
            com.tencent.mm.ui.tools.w4 r2 = (com.tencent.mm.ui.tools.w4) r2
            r2.b(r4, r0)
            goto Lca
        Lda:
            int r0 = com.tencent.mm.ui.tools.b5.f210298b
            if (r0 != r6) goto Le3
            android.view.WindowInsets r12 = r12.onApplyWindowInsets(r13)
            return r12
        Le3:
            android.view.WindowInsets r12 = android.view.WindowInsets.CONSUMED
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.y4.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }
}
