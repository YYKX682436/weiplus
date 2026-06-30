package com.tencent.mm.plugin.sns.ui.previewimageview;

/* loaded from: classes13.dex */
public class WrappingGridView extends android.widget.GridView {
    public WrappingGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void invalidate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invalidate", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        super.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invalidate", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        if (getLayoutParams().height == -2) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        super.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    public WrappingGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
