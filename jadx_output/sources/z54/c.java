package z54;

/* loaded from: classes4.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final void a(float f17, android.view.View view, android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHandExpandAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHandExpandAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
            return;
        }
        if (marginLayoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHandExpandAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHandExpandAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
            return;
        }
        float f18 = i37 - ((i37 - i19) * f17);
        float f19 = i38 - ((i38 - i27) * f17);
        int i39 = ((int) ((i17 - i28) * f17)) + i28;
        layoutParams2.leftMargin = i39;
        int i47 = ((int) ((i18 - i29) * f17)) + i29;
        layoutParams2.topMargin = i47;
        layoutParams2.rightMargin = (int) ((marginLayoutParams.width - f18) - i39);
        layoutParams2.bottomMargin = (int) ((marginLayoutParams.height - f19) - i47);
        layoutParams2.width = (int) f18;
        layoutParams2.height = (int) f19;
        view.setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHandExpandAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
    }

    public final android.view.ViewGroup.MarginLayoutParams b(float f17, android.widget.FrameLayout frameLayout, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHandleExpandAnimationParentView", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHandleExpandAnimationParentView", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
            return null;
        }
        marginLayoutParams.height = (int) (i17 - ((i17 - i18) * f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHandleExpandAnimationParentView", "com.tencent.mm.plugin.sns.ad.landingpage.ui.animation.AdHalfScreenExpandAnimation$Companion");
        return marginLayoutParams;
    }
}
