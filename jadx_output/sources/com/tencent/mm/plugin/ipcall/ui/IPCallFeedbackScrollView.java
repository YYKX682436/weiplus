package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class IPCallFeedbackScrollView extends android.widget.ScrollView {
    public IPCallFeedbackScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            android.view.Display defaultDisplay = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay();
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels / 2, Integer.MIN_VALUE);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCallFeedbackScrollView", e17, "", new java.lang.Object[0]);
        }
        super.onMeasure(i17, i18);
    }

    public IPCallFeedbackScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
