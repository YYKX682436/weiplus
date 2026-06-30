package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView f169481d;

    public j5(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        this.f169481d = longVideoFullScreenView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "play btn onclick isPlaying[%b]", java.lang.Boolean.valueOf(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f169481d).isPlaying()));
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.a(this.f169481d, true);
            if (com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f169481d).isPlaying()) {
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = this.f169481d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView.z();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            } else {
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView2 = this.f169481d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                boolean z17 = longVideoFullScreenView2.f166373y;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                if (z17) {
                    this.f169481d.k();
                } else {
                    this.f169481d.y();
                }
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView3 = this.f169481d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView3.A();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView4 = this.f169481d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            boolean z18 = longVideoFullScreenView4.f166351J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView5 = this.f169481d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2008", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView5.N++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2008", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$3");
    }
}
