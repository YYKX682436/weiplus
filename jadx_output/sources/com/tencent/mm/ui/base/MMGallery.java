package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class MMGallery extends android.widget.Gallery {
    public MMGallery(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setStaticTransformationsEnabled(true);
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (f17 > 0.0f) {
            onKeyDown(21, null);
            return true;
        }
        onKeyDown(22, null);
        return true;
    }

    public MMGallery(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setStaticTransformationsEnabled(true);
    }
}
