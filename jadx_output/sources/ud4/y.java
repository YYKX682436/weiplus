package ud4;

/* loaded from: classes13.dex */
public class y implements android.animation.TypeEvaluator {
    public y(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
    }

    public int a(int i17, int i18, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("interpolate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$3");
        int i19 = (int) (i17 + (f17 * (i18 - i17)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("interpolate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$3");
        return i19;
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$3");
        android.graphics.Rect rect = (android.graphics.Rect) obj;
        android.graphics.Rect rect2 = (android.graphics.Rect) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$3");
        android.graphics.Rect rect3 = new android.graphics.Rect(a(rect.left, rect2.left, f17), a(rect.top, rect2.top, f17), a(rect.right, rect2.right, f17), a(rect.bottom, rect2.bottom, f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$3");
        return rect3;
    }
}
