package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes15.dex */
public class SliderSeekBar extends android.view.View {
    public android.graphics.Rect A;
    public android.graphics.Rect B;
    public boolean C;
    public final android.view.View.OnTouchListener D;

    /* renamed from: d, reason: collision with root package name */
    public boolean f151735d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f151736e;

    /* renamed from: f, reason: collision with root package name */
    public int f151737f;

    /* renamed from: g, reason: collision with root package name */
    public int f151738g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f151739h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f151740i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f151741m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f151742n;

    /* renamed from: o, reason: collision with root package name */
    public int f151743o;

    /* renamed from: p, reason: collision with root package name */
    public int f151744p;

    /* renamed from: q, reason: collision with root package name */
    public float f151745q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f151746r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f151747s;

    /* renamed from: t, reason: collision with root package name */
    public int f151748t;

    /* renamed from: u, reason: collision with root package name */
    public float f151749u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Paint f151750v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f151751w;

    /* renamed from: x, reason: collision with root package name */
    public float f151752x;

    /* renamed from: y, reason: collision with root package name */
    public int f151753y;

    /* renamed from: z, reason: collision with root package name */
    public int f151754z;

    public SliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.mv.ui.view.SliderSeekBar sliderSeekBar, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!sliderSeekBar.f151735d || (drawable = sliderSeekBar.f151741m) == null || sliderSeekBar.f151742n == null || drawable.getBounds().width() <= 0 || sliderSeekBar.f151742n.getBounds().width() <= 0) {
            return;
        }
        com.tencent.mm.plugin.mv.ui.view.j4 j4Var = z17 ? (com.tencent.mm.plugin.mv.ui.view.j4) sliderSeekBar.f151741m : (com.tencent.mm.plugin.mv.ui.view.j4) sliderSeekBar.f151742n;
        if (j4Var.f151878a != z18) {
            j4Var.f151878a = z18;
            j4Var.f151881d.invalidate();
        }
        sliderSeekBar.postInvalidate();
    }

    public static boolean b(com.tencent.mm.plugin.mv.ui.view.SliderSeekBar sliderSeekBar, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (sliderSeekBar.f151735d && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = sliderSeekBar.f151754z;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        this.f151741m = new com.tencent.mm.plugin.mv.ui.view.j4(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.f151742n = new com.tencent.mm.plugin.mv.ui.view.j4(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.C = true;
        postInvalidate();
    }

    public void d() {
        this.f151743o = i65.a.b(getContext(), 8);
        this.f151754z = i65.a.b(getContext(), 8);
        c();
        this.f151744p = i65.a.b(getContext(), 1);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.a76);
        this.f151745q = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f151746r = paint;
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f151746r.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f151750v = paint2;
        paint2.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0));
        this.f151750v.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f151747s = paint3;
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f151747s.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f151748t = round;
        this.f151747s.setStrokeWidth(round);
        this.f151749u = this.f151748t * 0.5f;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f151751w = paint4;
        paint4.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f151751w.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f151752x = 0.5f * round2;
        this.f151751w.setStrokeWidth(round2);
        this.f151751w.setAlpha(178);
        setOnTouchListener(this.D);
    }

    public final boolean e(boolean z17) {
        return z17 ? ((com.tencent.mm.plugin.mv.ui.view.j4) this.f151741m).f151878a : ((com.tencent.mm.plugin.mv.ui.view.j4) this.f151742n).f151878a;
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f151735d || (drawable = this.f151741m) == null || this.f151742n == null || drawable.getBounds().width() <= 0 || this.f151742n.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = this.f151742n.getBounds().left - this.f151738g;
            f18 = java.lang.Math.max(this.f151753y, this.f151742n.getBounds().left - this.f151737f);
        } else {
            f18 = this.f151741m.getBounds().right + this.f151738g;
            min = java.lang.Math.min(getWidth() - this.f151753y, this.f151741m.getBounds().right + this.f151737f);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f151741m.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f151743o), 0);
            this.f151741m.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f151742n.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max), 0);
            this.f151742n.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    public int getLeftSliderBound() {
        return this.f151741m.getBounds().right;
    }

    public int getRightSliderBound() {
        return this.f151742n.getBounds().left;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f151745q > 0.0f) {
            float width = getWidth() * this.f151745q;
            int i17 = this.f151744p;
            canvas.drawRect(width - (i17 * 0.5f), 0.0f, width + (i17 * 0.5f), getHeight(), this.f151746r);
        }
        if (this.f151735d) {
            int centerX = this.f151741m.getBounds().centerX();
            int centerX2 = this.f151742n.getBounds().centerX();
            if ((e(true) || e(false)) && this.C) {
                float f17 = this.f151753y;
                float f18 = this.f151752x;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.f151753y) - this.f151752x, getBottom() - this.f151752x, this.f151751w);
            }
            if (this.f151741m.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, centerX, getHeight(), this.f151750v);
            }
            if (this.f151742n.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth(), getHeight(), this.f151750v);
            }
            if (this.C) {
                float f19 = centerX;
                float f27 = this.f151749u;
                float f28 = centerX2;
                canvas.drawLine(f19, f27, f28, f27, this.f151747s);
                canvas.drawLine(f19, getHeight() - this.f151749u, f28, getHeight() - this.f151749u, this.f151747s);
            }
            this.f151741m.draw(canvas);
            this.f151742n.draw(canvas);
        }
    }

    public void setCursorColor(int i17) {
        this.f151746r.setColor(i17);
    }

    public void setCursorPos(float f17) {
        if (this.f151735d) {
            this.f151745q = f17;
            invalidate();
        }
    }

    public void setCursorWidth(int i17) {
        this.f151744p = i17;
    }

    public void setEnableHapticAtEdge(boolean z17) {
        this.f151740i = z17;
    }

    public void setMaskColor(int i17) {
        this.f151750v.setColor(i17);
    }

    public void setOnSliderTouchListener(com.tencent.mm.plugin.mv.ui.view.i4 i4Var) {
    }

    public SliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f151735d = false;
        this.f151736e = false;
        this.f151739h = false;
        this.f151740i = false;
        this.f151745q = -1.0f;
        this.f151753y = 0;
        this.C = true;
        this.D = new com.tencent.mm.plugin.mv.ui.view.h4(this);
        d();
    }
}
