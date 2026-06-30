package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class TimelineRefreshImageView extends android.widget.ImageView {
    public TimelineRefreshImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIfCanReuseDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        try {
            java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField(z17 ? "mDrawingCache" : "mUnscaledDrawingCache");
            declaredField.setAccessible(true);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) declaredField.get(this);
            if (bitmap != null) {
                java.lang.String.format("cache.width: %s, cache.height: %s, width: %s, height: %s", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(getWidth()), java.lang.Integer.valueOf(getHeight()));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TimelineRefreshImageView", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineRefreshImageView", "checkIfCanReuseDrawingCache error: %s", e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIfCanReuseDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        getWidth();
        getHeight();
        hashCode();
        super.buildDrawingCache(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        super.destroyDrawingCache();
        getWidth();
        getHeight();
        hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
    }

    public TimelineRefreshImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
