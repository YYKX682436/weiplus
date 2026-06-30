package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class SliderSeekBar extends android.view.View {
    public int A;
    public android.graphics.Rect B;
    public android.graphics.Rect C;
    public boolean D;
    public boolean E;
    public final android.view.View.OnTouchListener F;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.k1 f148939d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f148940e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f148941f;

    /* renamed from: g, reason: collision with root package name */
    public int f148942g;

    /* renamed from: h, reason: collision with root package name */
    public int f148943h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f148944i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f148945m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f148946n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f148947o;

    /* renamed from: p, reason: collision with root package name */
    public int f148948p;

    /* renamed from: q, reason: collision with root package name */
    public int f148949q;

    /* renamed from: r, reason: collision with root package name */
    public float f148950r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f148951s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f148952t;

    /* renamed from: u, reason: collision with root package name */
    public int f148953u;

    /* renamed from: v, reason: collision with root package name */
    public float f148954v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f148955w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Paint f148956x;

    /* renamed from: y, reason: collision with root package name */
    public float f148957y;

    /* renamed from: z, reason: collision with root package name */
    public int f148958z;

    public SliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!sliderSeekBar.f148940e || (drawable = sliderSeekBar.f148946n) == null || sliderSeekBar.f148947o == null || drawable.getBounds().width() <= 0 || sliderSeekBar.f148947o.getBounds().width() <= 0) {
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.l1 l1Var = z17 ? (com.tencent.mm.plugin.mmsight.segment.l1) sliderSeekBar.f148946n : (com.tencent.mm.plugin.mmsight.segment.l1) sliderSeekBar.f148947o;
        if (l1Var.f149053a != z18) {
            l1Var.f149053a = z18;
            l1Var.f149056d.invalidate();
        }
        sliderSeekBar.postInvalidate();
    }

    public static boolean b(com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (sliderSeekBar.f148940e && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = sliderSeekBar.A;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(boolean z17) {
        return z17 ? ((com.tencent.mm.plugin.mmsight.segment.l1) this.f148946n).f149053a : ((com.tencent.mm.plugin.mmsight.segment.l1) this.f148947o).f149053a;
    }

    public void d() {
        if (this.B == null || this.C == null) {
            return;
        }
        android.graphics.Rect rect = this.B;
        android.graphics.Rect rect2 = new android.graphics.Rect(rect.left, rect.top, rect.right, rect.bottom);
        android.graphics.Rect rect3 = this.C;
        android.graphics.Rect rect4 = new android.graphics.Rect(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.f148946n.setBounds(rect2);
        this.f148947o.setBounds(rect4);
        this.f148950r = 0.0f;
        postInvalidate();
    }

    public void e() {
        android.graphics.drawable.Drawable drawable = this.f148946n;
        int i17 = this.f148958z;
        drawable.setBounds(i17 - this.f148948p, 0, i17, getHeight());
        android.graphics.drawable.Drawable drawable2 = this.f148947o;
        int i18 = this.f148958z;
        int i19 = this.f148942g;
        drawable2.setBounds(i18 + i19, 0, i19 + i18 + this.f148948p, getHeight());
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f148940e || (drawable = this.f148946n) == null || this.f148947o == null || drawable.getBounds().width() <= 0 || this.f148947o.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = this.f148947o.getBounds().left - this.f148943h;
            f18 = java.lang.Math.max(this.f148958z, this.f148947o.getBounds().left - this.f148942g);
        } else {
            f18 = this.f148946n.getBounds().right + this.f148943h;
            min = java.lang.Math.min(getWidth() - this.f148958z, this.f148946n.getBounds().right + this.f148942g);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f148946n.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f148948p), 0);
            this.f148946n.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f148947o.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max), 0);
            this.f148947o.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    public int getLeftSliderBound() {
        return this.f148946n.getBounds().right;
    }

    public int getRightSliderBound() {
        return this.f148947o.getBounds().left;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f148950r > 0.0f) {
            float width = getWidth() * this.f148950r;
            int i17 = this.f148949q;
            canvas.drawRect(width - (i17 * 0.5f), 0.0f, width + (i17 * 0.5f), getHeight(), this.f148951s);
        }
        if (this.f148940e) {
            int centerX = this.f148946n.getBounds().centerX();
            int centerX2 = this.f148947o.getBounds().centerX();
            if ((c(true) || c(false)) && this.D && this.E) {
                float f17 = this.f148958z;
                float f18 = this.f148957y;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.f148958z) - this.f148957y, getBottom() - this.f148957y, this.f148956x);
            }
            if (this.f148946n.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, centerX, getHeight(), this.f148955w);
            }
            if (this.f148947o.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth(), getHeight(), this.f148955w);
            }
            if (this.D) {
                canvas.drawLine(this.f148946n.getBounds().left, this.f148954v, this.f148947o.getBounds().right, this.f148954v, this.f148952t);
                canvas.drawLine(this.f148946n.getBounds().left, getHeight() - this.f148954v, this.f148947o.getBounds().right, getHeight() - this.f148954v, this.f148952t);
            }
            this.f148946n.draw(canvas);
            this.f148947o.draw(canvas);
        }
    }

    public void setBlackMastPaintColor(int i17) {
        this.f148955w.setColor(i17);
    }

    public void setBorderColor(int i17) {
        this.f148952t.setColor(i17);
    }

    public void setCursorColor(int i17) {
        this.f148951s.setColor(i17);
    }

    public void setCursorPos(float f17) {
        if (this.f148940e) {
            this.f148950r = f17;
            invalidate();
        }
    }

    public void setCursorWidth(int i17) {
        this.f148949q = i17;
    }

    public void setEnableHapticAtEdge(boolean z17) {
        this.f148945m = z17;
    }

    public void setEnableOldBorder(boolean z17) {
        this.E = z17;
    }

    public void setMaskColor(int i17) {
        this.f148955w.setColor(i17);
    }

    public void setOnSliderTouchListener(com.tencent.mm.plugin.mmsight.segment.k1 k1Var) {
        this.f148939d = k1Var;
    }

    public SliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f148940e = false;
        this.f148941f = false;
        this.f148944i = false;
        this.f148945m = false;
        this.f148950r = -1.0f;
        this.f148958z = 0;
        this.D = true;
        this.E = true;
        com.tencent.mm.plugin.mmsight.segment.j1 j1Var = new com.tencent.mm.plugin.mmsight.segment.j1(this);
        this.F = j1Var;
        this.f148948p = i65.a.b(getContext(), 8);
        this.A = i65.a.b(getContext(), 8);
        this.f148946n = new com.tencent.mm.plugin.mmsight.segment.l1(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.f148947o = new com.tencent.mm.plugin.mmsight.segment.l1(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.D = true;
        postInvalidate();
        this.f148949q = i65.a.b(getContext(), 1);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.ad_);
        this.f148950r = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f148951s = paint;
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f148951s.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f148955w = paint2;
        paint2.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0));
        this.f148955w.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f148952t = paint3;
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f148952t.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f148953u = round;
        this.f148952t.setStrokeWidth(round);
        this.f148954v = this.f148953u * 0.5f;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f148956x = paint4;
        paint4.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_BG_100));
        this.f148956x.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f148957y = 0.5f * round2;
        this.f148956x.setStrokeWidth(round2);
        this.f148956x.setAlpha(178);
        setOnTouchListener(j1Var);
    }
}
