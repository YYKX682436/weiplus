package ud4;

/* loaded from: classes13.dex */
public abstract class u {
    public static boolean a(android.view.View view, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
        if (view == null || f17 < view.getLeft() || f17 > view.getRight() || f18 < view.getTop() || f18 > view.getBottom()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
        return true;
    }
}
