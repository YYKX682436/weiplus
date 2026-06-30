package com.tencent.mm.ui.blur;

/* loaded from: classes5.dex */
public class BlurView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public ib5.f f198005d;

    /* renamed from: e, reason: collision with root package name */
    public int f198006e;

    /* renamed from: f, reason: collision with root package name */
    public float f198007f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Path f198008g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f198009h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f198010i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f198011m;

    public BlurView(android.content.Context context) {
        super(context);
        this.f198005d = new ib5.h(this);
        this.f198007f = 0.0f;
        this.f198008g = new android.graphics.Path();
        this.f198009h = new android.graphics.RectF();
        this.f198011m = false;
        a(null, 0);
    }

    private void setBlurController(ib5.f fVar) {
        this.f198005d.destroy();
        this.f198005d = fVar;
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wm0.a.f447184b, i17, 0);
        this.f198006e = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public com.tencent.mm.ui.blur.BlurView b(int i17) {
        this.f198005d.f(i17);
        return this;
    }

    public com.tencent.mm.ui.blur.BlurView c(android.view.ViewGroup viewGroup) {
        ib5.d dVar = new ib5.d(this, viewGroup);
        setBlurController(dVar);
        if (!isHardwareAccelerated()) {
            dVar.i(false);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f198005d.b(canvas);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.f198007f != 0.0f) {
            android.graphics.Path path = this.f198008g;
            path.reset();
            if (this.f198011m) {
                float f17 = this.f198007f;
                this.f198010i = new float[]{f17, f17, f17, f17, f17, f17, f17, f17};
            } else {
                float f18 = this.f198007f;
                this.f198010i = new float[]{f18, f18, f18, f18, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            android.graphics.RectF rectF = this.f198009h;
            rectF.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            path.addRoundRect(rectF, this.f198010i, android.graphics.Path.Direction.CCW);
            canvas.clipPath(path);
        }
        if (!canvas.isHardwareAccelerated()) {
            if (isHardwareAccelerated()) {
                return;
            }
            super.draw(canvas);
        } else {
            this.f198005d.a(canvas);
            int i17 = this.f198006e;
            if (i17 != 0) {
                canvas.drawColor(i17);
            }
            super.draw(canvas);
        }
    }

    public ib5.f getBlurController() {
        return this.f198005d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f198005d.i(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f198005d.i(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f198005d.g();
    }

    public BlurView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198005d = new ib5.h(this);
        this.f198007f = 0.0f;
        this.f198008g = new android.graphics.Path();
        this.f198009h = new android.graphics.RectF();
        this.f198011m = false;
        a(attributeSet, 0);
    }

    public BlurView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f198005d = new ib5.h(this);
        this.f198007f = 0.0f;
        this.f198008g = new android.graphics.Path();
        this.f198009h = new android.graphics.RectF();
        this.f198011m = false;
        a(attributeSet, i17);
    }
}
