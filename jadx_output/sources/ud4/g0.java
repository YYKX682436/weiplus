package ud4;

/* loaded from: classes13.dex */
public class g0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f426700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f426701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud4.h0 f426702f;

    public g0(ud4.h0 h0Var, int i17, int i18) {
        this.f426702f = h0Var;
        this.f426700d = i17;
        this.f426701e = i18;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
        ud4.h0 h0Var = this.f426702f;
        h0Var.f426714c.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        int i17 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.f170255y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$712", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = h0Var.f426714c;
        dynamicGridView.f170263m += h0Var.f426712a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$712", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$812", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.f170264n += h0Var.f426713b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$812", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.c(dynamicGridView, this.f426700d, this.f426701e);
        com.tencent.mars.xlog.Log.i("DynamicGridView", "id " + dynamicGridView.n(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView)));
        if (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.h(dynamicGridView) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
            return true;
        }
        if (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.h(dynamicGridView) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
            return true;
        }
        android.view.View h17 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.h(dynamicGridView);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View o17 = dynamicGridView.o(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.b(dynamicGridView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.Q = o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.h(dynamicGridView) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
            return true;
        }
        android.view.View h18 = com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.h(dynamicGridView);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(h18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(h18, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
        return true;
    }
}
