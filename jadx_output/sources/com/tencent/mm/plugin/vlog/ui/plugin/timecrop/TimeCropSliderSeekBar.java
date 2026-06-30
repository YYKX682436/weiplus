package com.tencent.mm.plugin.vlog.ui.plugin.timecrop;

/* loaded from: classes10.dex */
public class TimeCropSliderSeekBar extends android.view.View {
    public int A;
    public android.graphics.Paint B;
    public float C;
    public int D;
    public int E;
    public android.graphics.Rect F;
    public android.graphics.Rect G;
    public final boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View.OnTouchListener f175913J;

    /* renamed from: d, reason: collision with root package name */
    public fp4.c f175914d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f175915e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f175916f;

    /* renamed from: g, reason: collision with root package name */
    public int f175917g;

    /* renamed from: h, reason: collision with root package name */
    public int f175918h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f175919i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f175920m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f175921n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f175922o;

    /* renamed from: p, reason: collision with root package name */
    public int f175923p;

    /* renamed from: q, reason: collision with root package name */
    public float f175924q;

    /* renamed from: r, reason: collision with root package name */
    public int f175925r;

    /* renamed from: s, reason: collision with root package name */
    public float f175926s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f175927t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Paint f175928u;

    /* renamed from: v, reason: collision with root package name */
    public int f175929v;

    /* renamed from: w, reason: collision with root package name */
    public float f175930w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Paint f175931x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Paint f175932y;

    /* renamed from: z, reason: collision with root package name */
    public int f175933z;

    public TimeCropSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar, boolean z17, boolean z18) {
        android.graphics.drawable.Drawable drawable;
        if (!timeCropSliderSeekBar.f175915e || (drawable = timeCropSliderSeekBar.f175921n) == null || timeCropSliderSeekBar.f175922o == null || drawable.getBounds().width() <= 0 || timeCropSliderSeekBar.f175922o.getBounds().width() <= 0) {
            return;
        }
        fp4.d dVar = z17 ? (fp4.d) timeCropSliderSeekBar.f175921n : (fp4.d) timeCropSliderSeekBar.f175922o;
        if (dVar.f265355a != z18) {
            dVar.f265355a = z18;
            dVar.f265358d.invalidate();
        }
        timeCropSliderSeekBar.postInvalidate();
    }

    public static boolean b(com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar, android.graphics.drawable.Drawable drawable, float f17, float f18) {
        if (timeCropSliderSeekBar.f175915e && drawable != null) {
            int i17 = drawable.getBounds().bottom;
            int i18 = timeCropSliderSeekBar.E;
            if (f18 <= i17 + i18 && f18 >= r2.top - i18 && f17 >= r2.left - i18 && f17 <= r2.right + i18) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(boolean z17) {
        return z17 ? ((fp4.d) this.f175921n).f265355a : ((fp4.d) this.f175922o).f265355a;
    }

    public void d() {
        this.f175921n = new fp4.d(this, i65.a.i(getContext(), com.tencent.mm.R.drawable.icon_filled_clip_border), i65.a.i(getContext(), com.tencent.mm.R.drawable.icon_filled_clip_border));
        this.f175922o = new fp4.d(this, i65.a.i(getContext(), com.tencent.mm.R.drawable.icon_filled_clip_border), i65.a.i(getContext(), com.tencent.mm.R.drawable.icon_filled_clip_border));
        this.I = false;
        int b17 = i65.a.b(getContext(), 16);
        this.f175923p = b17;
        this.f175924q = b17 * 0.5f;
        this.E = i65.a.b(getContext(), 8);
        e();
        postInvalidate();
    }

    public final void e() {
        android.graphics.drawable.Drawable drawable = this.f175921n;
        int i17 = this.D;
        int i18 = this.f175923p;
        drawable.setBounds(i17 - (i18 / 2), 0, i17 + (i18 / 2), getHeight());
        android.graphics.drawable.Drawable drawable2 = this.f175922o;
        int i19 = this.D;
        int i27 = this.f175917g;
        int i28 = this.f175923p;
        drawable2.setBounds((i19 + i27) - (i28 / 2), 0, i27 + i19 + (i28 / 2), getHeight());
    }

    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float min;
        if (!this.f175915e || (drawable = this.f175921n) == null || this.f175922o == null || drawable.getBounds().width() <= 0 || this.f175922o.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            min = (this.f175922o.getBounds().right - this.f175918h) + this.f175924q;
            f18 = java.lang.Math.max(this.D, (this.f175922o.getBounds().right - this.f175917g) - this.f175924q);
        } else {
            f18 = (this.f175921n.getBounds().left + this.f175918h) - this.f175924q;
            min = java.lang.Math.min(getWidth() - this.D, this.f175921n.getBounds().left + this.f175917g + this.f175924q);
        }
        float max = java.lang.Math.max(f18, java.lang.Math.min(f17, min));
        boolean z18 = max == f18 || max == min;
        if (z17) {
            android.graphics.Rect bounds = this.f175921n.getBounds();
            bounds.offsetTo((int) java.lang.Math.ceil(max - this.f175924q), 0);
            this.f175921n.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f175922o.getBounds();
            bounds2.offsetTo((int) java.lang.Math.floor(max - this.f175924q), 0);
            this.f175922o.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    public int getLeftSliderBound() {
        return (int) (this.f175921n.getBounds().left + this.f175924q);
    }

    public int getRightSliderBound() {
        return (int) (this.f175922o.getBounds().right - this.f175924q);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f175926s > 0.0f) {
            float width = getWidth() * this.f175926s;
            int i17 = this.f175925r;
            canvas.drawRect(width - (i17 * 0.5f), this.f175933z, width + (i17 * 0.5f), r2 + (this.I ? getHeight() : this.A), this.f175927t);
        }
        if (this.f175915e) {
            int centerX = this.f175921n.getBounds().centerX();
            int centerX2 = this.f175922o.getBounds().centerX();
            if ((c(true) || c(false)) && this.I) {
                float f17 = this.D;
                float f18 = this.C;
                canvas.drawRect(f17 + f18, f18, (getWidth() - this.D) - this.C, getBottom() - this.C, this.B);
            }
            if (this.f175921n.getBounds().left > 0) {
                canvas.drawRect(0.0f, 0.0f, centerX, getHeight(), this.f175931x);
            }
            if (this.f175922o.getBounds().right < getWidth()) {
                canvas.drawRect(centerX2, 0.0f, getWidth(), getHeight(), this.f175931x);
            }
            if (this.H && this.A != 0) {
                canvas.drawRect(centerX, this.f175933z - getTop(), centerX2, (this.f175933z + this.A) - getTop(), this.f175932y);
            }
            if (this.I) {
                float f19 = centerX;
                float f27 = this.f175930w;
                float f28 = centerX2;
                canvas.drawLine(f19, f27, f28, f27, this.f175928u);
                canvas.drawLine(f19, getHeight() - this.f175930w, f28, getHeight() - this.f175930w, this.f175928u);
            }
            this.f175921n.draw(canvas);
            this.f175922o.draw(canvas);
        }
    }

    public void setContentHeight(int i17) {
        this.A = i17;
    }

    public void setContentTop(int i17) {
        this.f175933z = i17;
    }

    public void setCursorPos(float f17) {
        if (this.f175915e) {
            this.f175926s = f17;
            invalidate();
        }
    }

    public void setEnableHapticAtEdge(boolean z17) {
        this.f175920m = z17;
    }

    public void setMaskColor(int i17) {
        this.f175931x.setColor(i17);
    }

    public void setOnSliderTouchListener(fp4.c cVar) {
        this.f175914d = cVar;
    }

    public TimeCropSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175915e = false;
        this.f175916f = false;
        this.f175919i = false;
        this.f175920m = false;
        this.f175926s = -1.0f;
        this.f175933z = 0;
        this.A = 0;
        this.D = 0;
        this.H = true;
        this.I = true;
        fp4.b bVar = new fp4.b(this);
        this.f175913J = bVar;
        int b17 = i65.a.b(getContext(), 8);
        this.f175923p = b17;
        this.f175924q = b17 * 0.5f;
        this.E = i65.a.b(getContext(), 16);
        this.f175921n = new fp4.d(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.f175922o = new fp4.d(this, i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_selected), i65.a.i(getContext(), com.tencent.mm.R.raw.video_clip_slider_normal));
        this.I = true;
        postInvalidate();
        this.f175925r = i65.a.b(getContext(), 2);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.ad_);
        this.f175926s = -1.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f175927t = paint;
        paint.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478553an));
        this.f175927t.setAlpha(102);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f175931x = paint2;
        paint2.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478712f3));
        this.f175931x.setAlpha(102);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f175932y = paint3;
        paint3.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478526a7));
        this.f175932y.setAlpha(102);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f175928u = paint4;
        paint4.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.aaw));
        this.f175928u.setStyle(android.graphics.Paint.Style.STROKE);
        int round = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.f175929v = round;
        this.f175928u.setStrokeWidth(round);
        this.f175930w = this.f175929v * 0.5f;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.B = paint5;
        paint5.setColor(i65.a.d(getContext(), com.tencent.mm.R.color.aaw));
        this.B.setStyle(android.graphics.Paint.Style.STROKE);
        float round2 = java.lang.Math.round(android.util.TypedValue.applyDimension(1, 1.5f, getContext().getResources().getDisplayMetrics()));
        this.C = 0.5f * round2;
        this.B.setStrokeWidth(round2);
        this.B.setAlpha(178);
        setOnTouchListener(bVar);
    }
}
