package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class SnsCommentShowAbLayout extends android.widget.AbsoluteLayout {
    public SnsCommentShowAbLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
        super.buildDrawingCache(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
        super.destroyDrawingCache();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
    }

    public SnsCommentShowAbLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
