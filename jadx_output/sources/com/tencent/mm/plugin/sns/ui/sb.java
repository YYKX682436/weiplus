package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class sb implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f170448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f170449b;

    public sb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f170449b = snsAdNativeLandingPagesUI;
        this.f170448a = recyclerView;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170449b;
        android.widget.ImageView imageView = snsAdNativeLandingPagesUI.f166745t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        float f18 = 1.0f - f17;
        imageView.setAlpha(f18);
        android.view.View U6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.U6(snsAdNativeLandingPagesUI);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        U6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
    }

    @Override // vb4.c
    public void onAnimationEnd() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170449b;
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.W1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "sns enter anim end");
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.e7(snsAdNativeLandingPagesUI)) {
            str = "onAnimationEnd";
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            android.view.View view = snsAdNativeLandingPagesUI.M1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            str = "onAnimationEnd";
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.view.View view2 = snsAdNativeLandingPagesUI.M1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        view2.startAnimation(alphaAnimation);
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.V6(snsAdNativeLandingPagesUI)) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f170448a;
            recyclerView.setVisibility(0);
            android.view.View childAt = recyclerView.getChildAt(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.01f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(150L);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, i65.a.b(snsAdNativeLandingPagesUI, 15), 0.0f);
            translateAnimation.setDuration(150L);
            translateAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.ui.rb(this));
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            recyclerView.startAnimation(animationSet);
        } else {
            android.view.View U6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.U6(snsAdNativeLandingPagesUI);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(U6, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        snsAdNativeLandingPagesUI.b8();
        snsAdNativeLandingPagesUI.e8();
        if (!snsAdNativeLandingPagesUI.f166742r2 && snsAdNativeLandingPagesUI.getF65848t()) {
            snsAdNativeLandingPagesUI.getSwipeBackLayout().setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        vb4.f fVar = snsAdNativeLandingPagesUI.U1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (fVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            int i17 = snsAdNativeLandingPagesUI.I;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            sb6.append(i17);
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            vb4.f fVar2 = snsAdNativeLandingPagesUI.U1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            fVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportAnimUpdateCount", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            int i18 = fVar2.f434811n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportAnimUpdateCount", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            vb4.f fVar3 = snsAdNativeLandingPagesUI.U1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            fVar3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportCostTime", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            int i19 = (int) (fVar3.f434813p - fVar3.f434812o);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportCostTime", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            ca4.e0.b("landing_page_report_anim_cost", sb7, i18, i19, "snsId=" + snsAdNativeLandingPagesUI.Q);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
    }

    @Override // vb4.c
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170449b;
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "sns enter anim start");
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.V6(snsAdNativeLandingPagesUI)) {
            android.view.View U6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.U6(snsAdNativeLandingPagesUI);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f170448a.setVisibility(4);
        } else {
            android.view.View U62 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.U6(snsAdNativeLandingPagesUI);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(U62, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(U62, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
    }
}
