package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class b9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f167904d;

    public b9(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        this.f167904d = sightVideoFullScreenView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.g(this.f167904d, true);
            if (com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(this.f167904d).h()) {
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f167904d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.A();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            } else {
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView2 = this.f167904d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                boolean z17 = sightVideoFullScreenView2.G;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                if (z17) {
                    this.f167904d.m();
                } else {
                    this.f167904d.y();
                }
                this.f167904d.B();
            }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView3 = this.f167904d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            boolean z18 = sightVideoFullScreenView3.f166671z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView4 = this.f167904d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2308", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView4.P++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2308", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$6");
    }
}
