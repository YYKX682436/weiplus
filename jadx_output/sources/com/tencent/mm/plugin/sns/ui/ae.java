package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ae implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI f167754d;

    public ae(com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
        this.f167754d = snsAdStreamVideoPlayUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = this.f167754d;
        com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.T6(snsAdStreamVideoPlayUI).setIsShowBasicControls(true);
        if (com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.T6(snsAdStreamVideoPlayUI).isPlaying()) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView T6 = com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.T6(snsAdStreamVideoPlayUI);
            T6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            T6.O1.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.T6(snsAdStreamVideoPlayUI).k0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$6");
    }
}
