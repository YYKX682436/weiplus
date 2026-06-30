package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class cd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI f168120d;

    public cd(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f168120d = snsAdNativeLandingTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = this.f168120d;
        if (!"".equals(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).getVideoPath()) && com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).getVideoPath() != null) {
            if (snsAdNativeLandingTestUI.f166768e.getVisibility() == 0) {
                snsAdNativeLandingTestUI.f166768e.setVisibility(4);
            } else {
                snsAdNativeLandingTestUI.f166768e.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$5");
    }
}
