package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class v5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.MaskLinearLayout f170621d;

    public v5(com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout) {
        this.f170621d = maskLinearLayout;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mars.xlog.Log.e("test", "touch: " + motionEvent.getAction());
        int i17 = com.tencent.mm.plugin.sns.ui.MaskLinearLayout.f166378h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout = this.f170621d;
        boolean z17 = maskLinearLayout.f166381f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (!z17) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout.a(maskLinearLayout);
            view.invalidate();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.tencent.mm.sdk.platformtools.n3 n3Var = maskLinearLayout.f166379d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            java.lang.Runnable runnable = maskLinearLayout.f166380e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            n3Var.removeCallbacks(runnable);
        } else if (action == 1 || action == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = maskLinearLayout.f166379d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            java.lang.Runnable runnable2 = maskLinearLayout.f166380e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            n3Var2.post(runnable2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        java.util.List<com.tencent.mm.plugin.sns.ui.MaskImageView> list = maskLinearLayout.f166382g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (list != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            for (com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView : list) {
                maskImageView.q(maskImageView, motionEvent);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
        return false;
    }
}
