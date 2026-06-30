package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes3.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.view.View view, android.view.MotionEvent ev6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$Companion");
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = false;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$Companion");
            return false;
        }
        int rawX = (int) ev6.getRawX();
        int rawY = (int) ev6.getRawY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i17;
        if ((i18 <= rawY && rawY <= view.getMeasuredHeight() + i18) && rawX >= i17 && rawX <= measuredWidth) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$Companion");
        return z17;
    }
}
