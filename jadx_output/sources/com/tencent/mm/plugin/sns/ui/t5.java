package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class t5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.MaskImageView f170498d;

    public t5(com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView) {
        this.f170498d = maskImageView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskImageView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.MaskImageView.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f170498d;
        boolean z17 = maskImageView.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        if (!z17) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/MaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskImageView$2");
            return false;
        }
        boolean q17 = maskImageView.q(view, motionEvent);
        yj0.a.i(q17, this, "com/tencent/mm/plugin/sns/ui/MaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskImageView$2");
        return q17;
    }
}
