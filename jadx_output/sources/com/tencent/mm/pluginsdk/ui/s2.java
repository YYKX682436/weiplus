package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public final class s2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.SpeechInputLayout f191103d;

    public s2(com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout) {
        this.f191103d = speechInputLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r12 != 3) goto L33;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            java.lang.String r0 = "com/tencent/mm/pluginsdk/ui/SpeechInputLayout$2"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r12)
            r4.add(r13)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r11
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            int r12 = r13.getAction()
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L74
            r2 = 3
            r3 = 2
            if (r12 == r1) goto L41
            if (r12 == r3) goto L2f
            if (r12 == r2) goto L41
            goto L8f
        L2f:
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout r12 = r11.f191103d
            com.tencent.mm.pluginsdk.ui.w2 r12 = r12.f189831p
            if (r12 == 0) goto L8f
            float r0 = r13.getRawX()
            float r13 = r13.getRawY()
            r12.e(r0, r13)
            goto L8f
        L41:
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout r12 = r11.f191103d
            r12.f189833r = r0
            boolean r13 = r12.f189834s
            if (r13 == 0) goto L55
            com.tencent.mm.pluginsdk.ui.w2 r12 = r12.f189831p
            if (r12 == 0) goto L50
            r12.d()
        L50:
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout r12 = r11.f191103d
            r12.f189834s = r0
            goto L8f
        L55:
            int r13 = r12.curV2TStatus
            if (r13 < r3) goto L64
            com.tencent.mm.pluginsdk.ui.v2 r13 = r12.f189830o
            if (r13 == 0) goto L60
            r13.e(r3)
        L60:
            r12.c(r1)
            goto L8f
        L64:
            if (r13 != r1) goto L6a
            r12.c(r3)
            goto L8f
        L6a:
            if (r13 != 0) goto L8f
            com.tencent.mm.pluginsdk.ui.v2 r12 = r12.f189830o
            if (r12 == 0) goto L8f
            r12.c(r2)
            goto L8f
        L74:
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout r12 = r11.f191103d
            r12.f189833r = r1
            boolean r12 = r12.f189832q
            if (r12 == 0) goto L8f
            ku5.u0 r12 = ku5.t0.f312615d
            com.tencent.mm.pluginsdk.ui.r2 r2 = new com.tencent.mm.pluginsdk.ui.r2
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout r3 = r11.f191103d
            r2.<init>(r3, r13)
            ku5.t0 r12 = (ku5.t0) r12
            r12.getClass()
            r3 = 200(0xc8, double:9.9E-322)
            r12.z(r2, r3, r0)
        L8f:
            java.lang.String r7 = "com/tencent/mm/pluginsdk/ui/SpeechInputLayout$2"
            java.lang.String r8 = "android/view/View$OnTouchListener"
            java.lang.String r9 = "onTouch"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = 1
            r6 = r11
            yj0.a.i(r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.s2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
