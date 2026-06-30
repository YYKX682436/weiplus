package jx0;

/* loaded from: classes3.dex */
public final class a extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, view != null ? view.getMeasuredHeight() : 0.0f);
        if (outline != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            outline.setOval(rect);
        }
    }
}
