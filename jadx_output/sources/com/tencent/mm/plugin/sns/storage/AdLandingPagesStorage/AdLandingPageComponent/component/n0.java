package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class n0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 f165362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var, android.os.Looper looper) {
        super(looper);
        this.f165362a = q0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        android.view.animation.TranslateAnimation translateAnimation;
        android.view.animation.TranslateAnimation translateAnimation2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$2");
        int i17 = message.what;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var = this.f165362a;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            int i18 = q0Var.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            if (i18 == 0) {
                boolean booleanValue = ((java.lang.Boolean) message.obj).booleanValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                if (q0Var.f165419u.getVisibility() != 0) {
                    android.view.View view = q0Var.f165419u;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    q0Var.K();
                    q0Var.f165419u.clearAnimation();
                    if (booleanValue) {
                        android.view.animation.TranslateAnimation translateAnimation3 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
                        translateAnimation3.setInterpolator(new android.view.animation.OvershootInterpolator(1.0f));
                        translateAnimation3.setDuration(700L);
                        q0Var.f165419u.startAnimation(translateAnimation3);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            } else {
                boolean booleanValue2 = ((java.lang.Boolean) message.obj).booleanValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                int i19 = q0Var.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                if (q0Var.f165419u.getVisibility() != 0) {
                    android.view.View view2 = q0Var.f165419u;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    q0Var.K();
                    q0Var.f165419u.clearAnimation();
                    if (booleanValue2) {
                        float height = (q0Var.f165419u.getHeight() * 1.5f) / q0Var.f165419u.getWidth();
                        if (i19 == 0) {
                            translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
                        } else {
                            translateAnimation2 = i19 == 90 ? new android.view.animation.TranslateAnimation(1, -height, 1, 0.0f, 1, 0.0f, 1, 0.0f) : new android.view.animation.TranslateAnimation(1, height, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                        }
                        translateAnimation2.setInterpolator(new android.view.animation.OvershootInterpolator(1.0f));
                        translateAnimation2.setDuration(700L);
                        q0Var.f165419u.startAnimation(translateAnimation2);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            }
        } else if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            int i27 = q0Var.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            if (i27 == 0) {
                boolean booleanValue3 = ((java.lang.Boolean) message.obj).booleanValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                if (q0Var.f165419u.getVisibility() == 0) {
                    android.view.View view3 = q0Var.f165419u;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    q0Var.M();
                    q0Var.f165419u.clearAnimation();
                    if (booleanValue3) {
                        android.view.animation.TranslateAnimation translateAnimation4 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
                        translateAnimation4.setDuration(400L);
                        q0Var.f165419u.startAnimation(translateAnimation4);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            } else {
                boolean booleanValue4 = ((java.lang.Boolean) message.obj).booleanValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                int i28 = q0Var.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                if (q0Var.f165419u.getVisibility() == 0) {
                    android.view.View view4 = q0Var.f165419u;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    q0Var.M();
                    q0Var.f165419u.clearAnimation();
                    if (booleanValue4) {
                        float height2 = (q0Var.f165419u.getHeight() * 1.5f) / q0Var.f165419u.getWidth();
                        if (i28 == 0) {
                            translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
                        } else {
                            translateAnimation = i28 == 90 ? new android.view.animation.TranslateAnimation(1, 0.0f, 1, -height2, 1, 0.0f, 1, 0.0f) : new android.view.animation.TranslateAnimation(1, 0.0f, 1, height2, 1, 0.0f, 1, 0.0f);
                        }
                        translateAnimation.setDuration(400L);
                        q0Var.f165419u.startAnimation(translateAnimation);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$2");
    }
}
