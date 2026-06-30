package jx0;

/* loaded from: classes3.dex */
public final class b extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f302363a;

    public b(int i17) {
        this.f302363a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, view != null ? view.getMeasuredHeight() : 0.0f);
        if (outline != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            outline.setRoundRect(rect, this.f302363a);
        }
    }
}
