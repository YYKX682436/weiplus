package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class jc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f169506d;

    public jc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f169506d = snsAdNativeLandingPagesUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$36");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f169506d;
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "mOnBackClickListener, onClick");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1667, 13);
        if (snsAdNativeLandingPagesUI.keyboardState() == 1) {
            snsAdNativeLandingPagesUI.hideVKB();
        }
        snsAdNativeLandingPagesUI.l8();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.m7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$36");
    }
}
