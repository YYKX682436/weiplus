package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class EditSliderSeekBar extends android.view.View {
    public android.graphics.Rect A;
    public android.graphics.Rect B;
    public boolean C;
    public final android.view.View.OnTouchListener D;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.b f148836d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f148837e;

    /* renamed from: f, reason: collision with root package name */
    public int f148838f;

    /* renamed from: g, reason: collision with root package name */
    public int f148839g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f148840h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f148841i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f148842m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f148843n;

    /* renamed from: o, reason: collision with root package name */
    public int f148844o;

    /* renamed from: p, reason: collision with root package name */
    public int f148845p;

    /* renamed from: q, reason: collision with root package name */
    public float f148846q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f148847r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f148848s;

    /* renamed from: t, reason: collision with root package name */
    public int f148849t;

    /* renamed from: u, reason: collision with root package name */
    public float f148850u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Paint f148851v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f148852w;

    /* renamed from: x, reason: collision with root package name */
    public float f148853x;

    /* renamed from: y, reason: collision with root package name */
    public int f148854y;

    /* renamed from: z, reason: collision with root package name */
    public int f148855z;

    public EditSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean a(com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (editSliderSeekBar.f148837e && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = editSliderSeekBar.f148855z;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public static void b(com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar, boolean z17) {
        android.view.ViewParent parent;
        android.view.ViewParent parent2 = editSliderSeekBar.getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z17);
    }

    public static void c(com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!editSliderSeekBar.f148837e || (drawable = editSliderSeekBar.f148842m) == null || editSliderSeekBar.f148843n == null || drawable.getBounds().width() <= 0 || editSliderSeekBar.f148843n.getBounds().width() <= 0) {
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.c cVar = z17 ? (com.tencent.mm.plugin.mmsight.segment.c) editSliderSeekBar.f148842m : (com.tencent.mm.plugin.mmsight.segment.c) editSliderSeekBar.f148843n;
        if (cVar.f148990a != z18) {
            cVar.f148990a = z18;
            cVar.f148993d.invalidate();
        }
        editSliderSeekBar.postInvalidate();
    }

    public void d(int i17, int i18, int i19) {
        int i27 = this.f148844o;
        if (i17 <= i27 * 2) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        this.f148837e = true;
        this.f148854y = i19;
        this.f148838f = i17;
        this.f148839g = i18;
        if (this.C) {
            this.f148842m.setBounds(i19 - i27, 0, i19, getHeight());
            android.graphics.drawable.Drawable drawable = this.f148843n;
            int i28 = this.f148854y + this.f148838f;
            drawable.setBounds(i28, 0, this.f148844o + i28, getHeight());
        } else {
            this.f148842m.setBounds(i19 - i27, 0, i19, getHeight());
            android.graphics.drawable.Drawable drawable2 = this.f148843n;
            int i29 = this.f148854y + this.f148838f;
            drawable2.setBounds(i29, 0, this.f148844o + i29, getHeight());
        }
        if (this.A == null && this.B == null) {
            this.A = new android.graphics.Rect(this.f148842m.getBounds().left, this.f148842m.getBounds().top, this.f148842m.getBounds().right, this.f148842m.getBounds().bottom);
            this.B = new android.graphics.Rect(this.f148843n.getBounds().left, this.f148843n.getBounds().top, this.f148843n.getBounds().right, this.f148843n.getBounds().bottom);
        }
        invalidate();
    }

    public final boolean e(boolean z17) {
        return z17 ? ((com.tencent.mm.plugin.mmsight.segment.c) this.f148842m).f148990a : ((com.tencent.mm.plugin.mmsight.segment.c) this.f148843n).f148990a;
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f148837e || (drawable = this.f148842m) == null || this.f148843n == null || drawable.getBounds().width() <= 0 || this.f148843n.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = this.f148843n.getBounds().left - this.f148839g;
            f18 = java.lang.Math.max(this.f148854y, this.f148843n.getBounds().left - this.f148838f);
        } else {
            f18 = this.f148842m.getBounds().right + this.f148839g;
            min = java.lang.Math.min(this.f148854y + this.f148838f, this.f148842m.getBounds().right + this.f148838f);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f148842m.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f148844o), 0);
            this.f148842m.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f148843n.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max), 0);
            this.f148843n.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    public int getLeftSliderBound() {
        return this.f148842m.getBounds().right - this.f148854y;
    }

    public int getRightSliderBound() {
        return this.f148843n.getBounds().left - this.f148854y;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f148846q > 0.0f) {
            float width = getWidth() * this.f148846q;
            int i17 = this.f148845p;
            canvas.drawRect(width - (i17 * 0.5f), 0.0f, width + (i17 * 0.5f), getHeight(), this.f148847r);
        }
        if (this.f148837e) {
            int centerX = this.f148842m.getBounds().centerX();
            int centerX2 = this.f148843n.getBounds().centerX();
            if ((e(true) || e(false)) && this.C) {
                float f17 = this.f148854y;
                float f18 = this.f148853x;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.f148854y) - this.f148853x, getBottom() - this.f148853x, this.f148852w);
            }
            if (this.f148842m.getBounds().left > 0) {
                canvas.drawRect(this.f148854y, 0.0f, centerX, getHeight(), this.f148851v);
            }
            if (this.f148843n.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth() - this.f148854y, getHeight(), this.f148851v);
            }
            if (this.C) {
                float f19 = centerX;
                float f27 = this.f148850u;
                float f28 = centerX2;
                canvas.drawLine(f19, f27, f28, f27, this.f148848s);
                canvas.drawLine(f19, getHeight() - this.f148850u, f28, getHeight() - this.f148850u, this.f148848s);
            }
            this.f148842m.draw(canvas);
            this.f148843n.draw(canvas);
        }
    }

    public void setCursorPos(float f17) {
        if (this.f148837e) {
            this.f148846q = f17;
            invalidate();
        }
    }

    public void setEnableHapticAtEdge(boolean z17) {
        this.f148841i = z17;
    }

    public void setMaskColor(int i17) {
        this.f148851v.setColor(i17);
    }

    public void setOnSliderTouchListener(com.tencent.mm.plugin.mmsight.segment.b bVar) {
        this.f148836d = bVar;
    }

    public EditSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f148837e = false;
        this.f148840h = false;
        this.f148841i = false;
        this.f148846q = -1.0f;
        this.f148854y = 0;
        this.C = true;
        com.tencent.mm.plugin.mmsight.segment.a aVar = new com.tencent.mm.plugin.mmsight.segment.a(this);
        this.D = aVar;
        this.f148844o = i65.a.b(getContext(), 8);
        this.f148855z = i65.a.b(getContext(), 8);
        this.f148842m = new com.tencent.mm.plugin.mmsight.segment.c(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.f148843n = new com.tencent.mm.plugin.mmsight.segment.c(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.C = true;
        postInvalidate();
        this.f148845p = i65.a.b(getContext(), 1);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.ad_);
        this.f148846q = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f148847r = paint;
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f148847r.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f148851v = paint2;
        paint2.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0));
        this.f148851v.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f148848s = paint3;
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f148848s.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f148849t = round;
        this.f148848s.setStrokeWidth(round);
        this.f148850u = this.f148849t * 0.5f;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f148852w = paint4;
        paint4.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f148852w.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f148853x = 0.5f * round2;
        this.f148852w.setStrokeWidth(round2);
        this.f148852w.setAlpha(178);
        setOnTouchListener(aVar);
    }
}
