package sj3;

/* loaded from: classes13.dex */
public final class f5 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final float f408515a;

    public f5(float f17) {
        this.f408515a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view != null) {
            view.getDrawingRect(rect);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (rect.right - rect.left) - 0.0f, (rect.bottom - rect.top) - 0.0f);
        float f17 = this.f408515a;
        float[] fArr = {f17, f17, f17, f17, 0.0f, 0.0f, 0.0f, 0.0f};
        if (outline != null) {
            android.graphics.Path path = new android.graphics.Path();
            path.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CCW);
            outline.setConvexPath(path);
        }
    }
}
