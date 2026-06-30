package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class lq implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI f169873d;

    public lq(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        this.f169873d = snsSingleTextViewUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r5 != 3) goto L24;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            java.lang.String r0 = "onTouch"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$6"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsSingleTextViewUI$6"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r14)
            r6.add(r15)
            java.lang.Object[] r7 = r6.toArray()
            r6.clear()
            r6 = r13
            yj0.a.b(r2, r3, r4, r5, r6, r7)
            int r14 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.G
            java.lang.String r14 = "access$900"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r2)
            com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI r3 = r13.f169873d
            r3.getClass()
            java.lang.String r4 = "handleTextSelectionScrollEvent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            bd4.f2 r5 = r3.f167405q
            r6 = 0
            if (r5 != 0) goto L44
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            goto L93
        L44:
            int r5 = r15.getActionMasked()
            if (r5 == 0) goto L7f
            r7 = 1
            if (r5 == r7) goto L75
            r8 = 2
            if (r5 == r8) goto L54
            r15 = 3
            if (r5 == r15) goto L75
            goto L90
        L54:
            boolean r5 = r3.f167411w
            if (r5 != 0) goto L90
            float r5 = r15.getRawX()
            float r8 = r3.f167409u
            float r5 = r5 - r8
            float r15 = r15.getRawY()
            float r8 = r3.f167410v
            float r15 = r15 - r8
            float r5 = r5 * r5
            float r15 = r15 * r15
            float r5 = r5 + r15
            r15 = 1137180672(0x43c80000, float:400.0)
            int r15 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r15 <= 0) goto L90
            r3.f167411w = r7
            r3.c7()
            goto L90
        L75:
            boolean r15 = r3.f167411w
            if (r15 == 0) goto L7c
            r3.d7()
        L7c:
            r3.f167411w = r6
            goto L90
        L7f:
            float r5 = r15.getRawX()
            r3.f167409u = r5
            float r15 = r15.getRawY()
            r3.f167410v = r15
            r3.f167411w = r6
            r3.a7()
        L90:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
        L93:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r2)
            java.lang.String r9 = "com/tencent/mm/plugin/sns/ui/SnsSingleTextViewUI$6"
            java.lang.String r10 = "android/view/View$OnTouchListener"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r7 = 0
            r8 = r13
            yj0.a.i(r7, r8, r9, r10, r11, r12)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.lq.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
