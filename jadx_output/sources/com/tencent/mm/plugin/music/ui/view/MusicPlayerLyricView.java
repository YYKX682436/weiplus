package com.tencent.mm.plugin.music.ui.view;

/* loaded from: classes15.dex */
public class MusicPlayerLyricView extends androidx.appcompat.widget.AppCompatTextView {
    public android.animation.ValueAnimator A;
    public android.view.GestureDetector B;
    public android.widget.Scroller C;
    public float D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f150829J;
    public int K;
    public boolean L;
    public final int M;
    public final int N;
    public int P;
    public int Q;
    public final android.view.GestureDetector.SimpleOnGestureListener R;
    public final java.lang.Runnable S;

    /* renamed from: g, reason: collision with root package name */
    public ll3.h1 f150830g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f150831h;

    /* renamed from: i, reason: collision with root package name */
    public final android.text.TextPaint f150832i;

    /* renamed from: m, reason: collision with root package name */
    public final android.text.TextPaint f150833m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint.FontMetrics f150834n;

    /* renamed from: o, reason: collision with root package name */
    public long f150835o;

    /* renamed from: p, reason: collision with root package name */
    public int f150836p;

    /* renamed from: q, reason: collision with root package name */
    public float f150837q;

    /* renamed from: r, reason: collision with root package name */
    public final int f150838r;

    /* renamed from: s, reason: collision with root package name */
    public int f150839s;

    /* renamed from: t, reason: collision with root package name */
    public float f150840t;

    /* renamed from: u, reason: collision with root package name */
    public final int f150841u;

    /* renamed from: v, reason: collision with root package name */
    public int f150842v;

    /* renamed from: w, reason: collision with root package name */
    public final int f150843w;

    /* renamed from: x, reason: collision with root package name */
    public int f150844x;

    /* renamed from: y, reason: collision with root package name */
    public int f150845y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f150846z;

    public MusicPlayerLyricView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        h(null);
    }

    private int getCenterLine() {
        float f17 = Float.MAX_VALUE;
        int i17 = 0;
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f150831h).size(); i18++) {
            if (java.lang.Math.abs(this.D - e(i18)) < f17) {
                f17 = java.lang.Math.abs(this.D - e(i18));
                i17 = i18;
            }
        }
        return i17;
    }

    private float getLrcWidth() {
        return this.Q - 0.0f;
    }

    public final void b() {
        j(getCenterLine(), 100L);
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        if (this.C.computeScrollOffset()) {
            this.D = this.C.getCurrY();
            invalidate();
        }
        if (this.H && this.C.isFinished()) {
            this.H = false;
            if (!g() || this.G) {
                return;
            }
            b();
            postDelayed(this.S, 1000L);
        }
    }

    public final float e(int i17) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f150831h;
        if (((wl3.p) arrayList.get(i17)).f447079f == Float.MIN_VALUE) {
            float f17 = this.N;
            for (int i18 = 1; i18 <= i17; i18++) {
                android.text.StaticLayout staticLayout = ((wl3.p) arrayList.get(i18 - 1)).f447078e;
                int i19 = 0;
                int height = staticLayout == null ? 0 : staticLayout.getHeight();
                android.text.StaticLayout staticLayout2 = ((wl3.p) arrayList.get(i18)).f447078e;
                if (staticLayout2 != null) {
                    i19 = staticLayout2.getHeight();
                }
                f17 -= ((height + i19) >> 1) + this.K;
            }
            ((wl3.p) arrayList.get(i17)).f447079f = f17;
        }
        return ((wl3.p) arrayList.get(i17)).f447079f;
    }

    public boolean g() {
        return !this.f150831h.isEmpty();
    }

    public final void h(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bl3.i.f21730a);
        this.f150840t = obtainStyledAttributes.getDimension(9, getResources().getDimension(com.tencent.mm.R.dimen.a4d));
        float dimension = obtainStyledAttributes.getDimension(5, getResources().getDimension(com.tencent.mm.R.dimen.a4d));
        this.f150837q = dimension;
        if (dimension == 0.0f) {
            this.f150837q = this.f150840t;
        }
        this.K = this.M;
        int integer = getResources().getInteger(com.tencent.mm.R.integer.f487818o);
        long j17 = obtainStyledAttributes.getInt(0, integer);
        this.f150835o = j17;
        if (j17 < 0) {
            j17 = integer;
        }
        this.f150835o = j17;
        this.f150836p = obtainStyledAttributes.getColor(4, getResources().getColor(com.tencent.mm.R.color.f479332wo));
        this.f150839s = obtainStyledAttributes.getColor(1, getResources().getColor(com.tencent.mm.R.color.f479331wn));
        this.f150842v = obtainStyledAttributes.getColor(14, getResources().getColor(com.tencent.mm.R.color.f479335wr));
        java.lang.String string = obtainStyledAttributes.getString(3);
        this.f150846z = string;
        this.f150846z = android.text.TextUtils.isEmpty(string) ? getContext().getString(com.tencent.mm.R.string.f492410gj1) : this.f150846z;
        obtainStyledAttributes.getColor(12, getResources().getColor(com.tencent.mm.R.color.f479334wq));
        float dimension2 = obtainStyledAttributes.getDimension(13, getResources().getDimension(com.tencent.mm.R.dimen.a4g));
        this.f150844x = obtainStyledAttributes.getColor(10, getResources().getColor(com.tencent.mm.R.color.f479333wp));
        float dimension3 = obtainStyledAttributes.getDimension(11, getResources().getDimension(com.tencent.mm.R.dimen.a4e));
        this.I = obtainStyledAttributes.getInteger(8, 1);
        obtainStyledAttributes.recycle();
        this.f150845y = (int) getResources().getDimension(com.tencent.mm.R.dimen.a4f);
        android.text.TextPaint textPaint = this.f150832i;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f150829J);
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        android.text.TextPaint textPaint2 = this.f150833m;
        textPaint2.setAntiAlias(true);
        textPaint2.setTextSize(dimension3);
        textPaint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        textPaint2.setStrokeWidth(dimension2);
        textPaint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f150834n = textPaint2.getFontMetrics();
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), this.R);
        this.B = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.C = new android.widget.Scroller(getContext());
        i();
    }

    public final void i() {
        if (g() || this.Q == 0 || this.L) {
            return;
        }
        if (this.f150830g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicPlayerLyricView", "null == lyricObj, maybe you not setLyricObj, check ！！！");
            return;
        }
        for (int i17 = 0; i17 < this.f150830g.e(); i17++) {
            ll3.f1 d17 = this.f150830g.d(i17);
            if (!d17.a()) {
                long j17 = d17.f319167a;
                java.lang.String str = d17.f319168b;
                wl3.p pVar = new wl3.p(this, j17, str);
                android.text.TextPaint textPaint = this.f150832i;
                int lrcWidth = (int) getLrcWidth();
                int i18 = this.I;
                android.text.Layout.Alignment alignment = i18 != 1 ? i18 != 2 ? android.text.Layout.Alignment.ALIGN_CENTER : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
                if (!android.text.TextUtils.isEmpty(null)) {
                    str = str + "\nnull";
                }
                pVar.f447078e = new android.text.StaticLayout(str, textPaint, lrcWidth, alignment, 0.0f, 0.0f, false);
                pVar.f447079f = Float.MIN_VALUE;
                this.f150831h.add(pVar);
            }
        }
        this.D = this.N;
        this.L = true;
    }

    public final void j(int i17, long j17) {
        float e17 = e(i17);
        android.animation.ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A.end();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.D, e17);
        this.A = ofFloat;
        ofFloat.setDuration(j17);
        this.A.setInterpolator(new android.view.animation.LinearInterpolator());
        this.A.addUpdateListener(new wl3.o(this));
        try {
            java.lang.reflect.Field declaredField = android.animation.ValueAnimator.class.getDeclaredField("sDurationScale");
            declaredField.setAccessible(true);
            declaredField.setFloat(null, 1.0f);
        } catch (java.lang.Exception unused) {
        }
        this.A.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.S);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.P == 0 || this.Q == 0) {
            this.P = getMeasuredHeight();
            this.Q = getMeasuredWidth();
        }
        ll3.h1 h1Var = this.f150830g;
        android.text.TextPaint textPaint = this.f150832i;
        int i17 = this.N;
        if (h1Var == null) {
            textPaint.setColor(this.f150839s);
            android.text.StaticLayout staticLayout = new android.text.StaticLayout(this.f150846z, textPaint, (int) getLrcWidth(), android.text.Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, i17 - (staticLayout.getHeight() >> 1));
            staticLayout.draw(canvas);
            canvas.restore();
            return;
        }
        i();
        int centerLine = getCenterLine();
        boolean z17 = this.F;
        java.util.List list = this.f150831h;
        if (z17) {
            android.text.TextPaint textPaint2 = this.f150833m;
            textPaint2.setColor(this.f150844x);
            long j17 = ((wl3.p) ((java.util.ArrayList) list).get(centerLine)).f447077d;
            java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf((int) (j17 / 60000))) + ":" + java.lang.String.format(java.util.Locale.getDefault(), "%02d", java.lang.Integer.valueOf((int) ((j17 / 1000) % 60)));
            float f17 = this.Q - this.f150845y;
            android.graphics.Paint.FontMetrics fontMetrics = this.f150834n;
            canvas.drawText(str, f17, i17 - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), textPaint2);
        }
        canvas.translate(0.0f, this.D);
        int i18 = 0;
        float f18 = 0.0f;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i18 >= arrayList.size()) {
                return;
            }
            if (i18 > 0) {
                android.text.StaticLayout staticLayout2 = ((wl3.p) arrayList.get(i18 - 1)).f447078e;
                int height = staticLayout2 == null ? 0 : staticLayout2.getHeight();
                f18 += ((height + (((wl3.p) arrayList.get(i18)).f447078e == null ? 0 : r8.getHeight())) >> 1) + this.K;
            }
            if (i18 == this.E) {
                textPaint.setTextSize(this.f150840t);
                textPaint.setColor(this.f150839s);
                textPaint.setFakeBoldText(true);
                textPaint.setAlpha(this.f150841u);
            } else if (this.F && i18 == centerLine) {
                textPaint.setShader(null);
                textPaint.setColor(this.f150842v);
                textPaint.setAlpha(this.f150843w);
            } else {
                textPaint.setShader(null);
                textPaint.setFakeBoldText(false);
                textPaint.setTextSize(this.f150837q);
                textPaint.setColor(this.f150836p);
                textPaint.setAlpha(this.f150838r);
            }
            android.text.StaticLayout staticLayout3 = ((wl3.p) arrayList.get(i18)).f447078e;
            canvas.save();
            canvas.translate(0.0f, f18 - (staticLayout3.getHeight() >> 1));
            staticLayout3.draw(canvas);
            canvas.restore();
            i18++;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            i();
            if (g()) {
                j(this.E, 0L);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.P = i18;
        this.Q = i17;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.G = false;
            if (g() && !this.H) {
                b();
                postDelayed(this.S, 1000L);
            }
        }
        android.view.GestureDetector gestureDetector = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    public void setCurrentTextSize(float f17) {
        this.f150840t = f17;
    }

    public void setCurrentTime(long j17) {
        wl3.l lVar = new wl3.l(this, j17);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            lVar.run();
        } else {
            post(lVar);
        }
    }

    public void setLyricObj(ll3.h1 h1Var) {
        this.f150830g = h1Var;
        invalidate();
    }

    public void setNormalTextSize(float f17) {
        this.f150837q = f17;
    }

    public void setTimeTextColor(int i17) {
        this.f150844x = i17;
        postInvalidate();
    }

    public MusicPlayerLyricView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150831h = new java.util.ArrayList();
        this.f150832i = new android.text.TextPaint();
        this.f150833m = new android.text.TextPaint();
        this.f150838r = 256;
        this.f150841u = 256;
        this.f150843w = 256;
        this.f150829J = (int) this.f150837q;
        this.K = 0;
        this.L = false;
        this.M = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24);
        this.N = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 52);
        this.R = new wl3.m(this);
        this.S = new wl3.n(this);
        h(attributeSet);
    }
}
