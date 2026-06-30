package com.tencent.mm.ui.widget;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public class RoundedCornerFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public al5.v2 f211418d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f211419e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f211420f;

    public RoundedCornerFrameLayout(android.content.Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.I, i17, i18);
        float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension4 = obtainStyledAttributes.getDimension(0, 0.0f);
        float dimension5 = obtainStyledAttributes.getDimension(1, 0.0f);
        if (dimension == 0.0f) {
            this.f211418d = new al5.v2(this, dimension2, dimension3, dimension4, dimension5);
        } else {
            this.f211418d = new al5.v2(this, dimension, dimension, dimension, dimension);
        }
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f211419e = paint;
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        setWillNotDraw(false);
    }

    public void b(float f17, float f18, float f19, float f27) {
        al5.v2 v2Var = this.f211418d;
        v2Var.f6075a = f17;
        v2Var.f6076b = f18;
        v2Var.f6077c = f19;
        v2Var.f6078d = f27;
        if (this.f211420f != null) {
            this.f211420f = null;
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (canvas.getWidth() <= 0 || canvas.getHeight() <= 0) {
            return;
        }
        int saveLayer = canvas.saveLayer(new android.graphics.RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), null, 31);
        super.draw(canvas);
        al5.v2 v2Var = this.f211418d;
        if (v2Var.f6075a > 0.0f || v2Var.f6076b > 0.0f || v2Var.f6077c > 0.0f || v2Var.f6078d > 0.0f) {
            if (this.f211420f == null) {
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ALPHA_8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/RoundedCornerFrameLayout", "createCornerBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/RoundedCornerFrameLayout", "createCornerBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
                android.graphics.Path path = new android.graphics.Path();
                android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
                al5.v2 v2Var2 = this.f211418d;
                float f17 = v2Var2.f6075a;
                float f18 = v2Var2.f6076b;
                float f19 = v2Var2.f6078d;
                float f27 = v2Var2.f6077c;
                path.addRoundRect(rectF, new float[]{f17, f17, f18, f18, f19, f19, f27, f27}, android.graphics.Path.Direction.CCW);
                path.setFillType(android.graphics.Path.FillType.WINDING);
                canvas2.drawPath(path, new android.graphics.Paint(1));
                this.f211420f = createBitmap;
            }
            canvas.drawBitmap(this.f211420f, 0.0f, 0.0f, this.f211419e);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f211420f = null;
    }

    public void setRadius(float f17) {
        b(f17, f17, f17, f17);
    }

    public RoundedCornerFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public RoundedCornerFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17, 0);
    }

    public RoundedCornerFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        a(context, attributeSet, i17, 0);
    }
}
