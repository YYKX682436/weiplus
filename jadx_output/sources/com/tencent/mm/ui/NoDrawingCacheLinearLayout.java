package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class NoDrawingCacheLinearLayout extends android.widget.LinearLayout {
    public NoDrawingCacheLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.view.View
    public void buildDrawingCache() {
    }

    @Override // android.view.View
    public android.graphics.Bitmap getDrawingCache() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public NoDrawingCacheLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z17) {
    }

    @Override // android.view.View
    public android.graphics.Bitmap getDrawingCache(boolean z17) {
        return null;
    }
}
