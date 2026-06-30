package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vb implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f170628a;

    public vb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f170628a = snsAdNativeLandingPagesUI;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170628a;
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.V6(snsAdNativeLandingPagesUI)) {
            float f18 = 1.0f - (f17 * 4.0f);
            if (f18 < 0.0f) {
                f18 = 0.0f;
            }
            android.view.View U6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.U6(snsAdNativeLandingPagesUI);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            U6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            android.widget.ImageView imageView = snsAdNativeLandingPagesUI.f166745t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            imageView.setAlpha(1.0f - f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
    }

    @Override // vb4.c
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170628a;
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.W1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "sns exit anim end");
        snsAdNativeLandingPagesUI.finish();
        snsAdNativeLandingPagesUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        if (!snsAdNativeLandingPagesUI.f166742r2 && snsAdNativeLandingPagesUI.getF65848t()) {
            snsAdNativeLandingPagesUI.getSwipeBackLayout().setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
    }

    @Override // vb4.c
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170628a;
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "sns exit anim start");
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.V6(snsAdNativeLandingPagesUI)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            android.widget.ImageView imageView = snsAdNativeLandingPagesUI.f166745t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            imageView.setAlpha(0.0f);
        } else {
            android.view.View U6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.U6(snsAdNativeLandingPagesUI);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
    }
}
