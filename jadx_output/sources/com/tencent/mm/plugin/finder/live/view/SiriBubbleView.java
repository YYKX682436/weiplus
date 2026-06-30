package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/SiriBubbleView;", "Landroid/widget/FrameLayout;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, "Ljz5/f0;", "setFlowSpeed", "", "interval", "setFrameInterval", "volume", "setVoiceVolume", "alpha", "setBubbleAlpha", "", "show", "setShowGlow", "radiusDp", "setGlowRadius", "radius", "setCornerRadiusImmediate", "color", "setInteriorBackgroundColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/view/yc", "com/tencent/mm/plugin/finder/live/view/zc", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SiriBubbleView extends android.widget.FrameLayout {
    public int A;
    public boolean B;
    public float C;
    public float D;
    public long E;
    public final com.tencent.mm.plugin.finder.live.view.zc F;
    public final com.tencent.mm.plugin.finder.live.view.zc G;
    public final com.tencent.mm.plugin.finder.live.view.zc H;
    public final com.tencent.mm.plugin.finder.live.view.zc I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.zc f116138J;
    public final com.tencent.mm.plugin.finder.live.view.zc K;
    public long L;
    public float M;
    public float N;
    public float P;
    public float Q;
    public boolean R;
    public final float S;
    public float T;
    public final android.graphics.Paint U;
    public final android.graphics.drawable.GradientDrawable V;
    public final android.graphics.Path W;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f116139d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f116140e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f116141f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f116142g;

    /* renamed from: h, reason: collision with root package name */
    public float f116143h;

    /* renamed from: i, reason: collision with root package name */
    public float f116144i;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.yc f116145l1;

    /* renamed from: m, reason: collision with root package name */
    public long f116146m;

    /* renamed from: n, reason: collision with root package name */
    public long f116147n;

    /* renamed from: o, reason: collision with root package name */
    public final long f116148o;

    /* renamed from: p, reason: collision with root package name */
    public final long f116149p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.graphics.RectF f116150p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.widget.FrameLayout f116151p1;

    /* renamed from: q, reason: collision with root package name */
    public final float f116152q;

    /* renamed from: r, reason: collision with root package name */
    public final float f116153r;

    /* renamed from: s, reason: collision with root package name */
    public float f116154s;

    /* renamed from: t, reason: collision with root package name */
    public final float f116155t;

    /* renamed from: u, reason: collision with root package name */
    public int f116156u;

    /* renamed from: v, reason: collision with root package name */
    public float f116157v;

    /* renamed from: w, reason: collision with root package name */
    public android.animation.ValueAnimator f116158w;

    /* renamed from: x, reason: collision with root package name */
    public float f116159x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.graphics.RectF f116160x0;

    /* renamed from: x1, reason: collision with root package name */
    public final boolean f116161x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f116162y;

    /* renamed from: y0, reason: collision with root package name */
    public float f116163y0;

    /* renamed from: z, reason: collision with root package name */
    public int f116164z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SiriBubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(float f17) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            if (this.f116163y0 == 0.0f) {
                return;
            }
            this.f116163y0 = 0.0f;
        } else {
            if (f17 < 0.1f) {
                f17 = 0.1f;
            }
            if (java.lang.Math.abs(f17 - this.f116163y0) < 0.5f) {
                return;
            }
            this.f116163y0 = f17;
            this.f116145l1.setRenderEffect(android.graphics.RenderEffect.createBlurEffect(f17, f17, android.graphics.Shader.TileMode.CLAMP));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.FrameLayout frameLayout;
        if (this.f116161x1 || (frameLayout = this.f116151p1) == null || view == frameLayout || view == this.f116145l1) {
            super.addView(view, i17, layoutParams);
        } else {
            frameLayout.addView(view, i17, layoutParams);
        }
    }

    public final int b(float f17) {
        int[] iArr = this.f116142g;
        int length = iArr.length;
        float f18 = f17 * length;
        int i17 = (int) f18;
        int i18 = i17 % length;
        float f19 = f18 - i17;
        int i19 = iArr[i18];
        int i27 = iArr[(i18 + 1) % length];
        return android.graphics.Color.argb((int) (android.graphics.Color.alpha(i19) + ((android.graphics.Color.alpha(i27) - android.graphics.Color.alpha(i19)) * f19)), (int) (android.graphics.Color.red(i19) + ((android.graphics.Color.red(i27) - android.graphics.Color.red(i19)) * f19)), (int) (android.graphics.Color.green(i19) + ((android.graphics.Color.green(i27) - android.graphics.Color.green(i19)) * f19)), (int) (android.graphics.Color.blue(i19) + ((android.graphics.Color.blue(i27) - android.graphics.Color.blue(i19)) * f19)));
    }

    public final void c() {
        android.graphics.Path path = this.W;
        path.reset();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        float f17 = this.P;
        android.graphics.RectF rectF = this.f116150p0;
        rectF.set(f17, f17, measuredWidth - f17, measuredHeight - f17);
        float f18 = this.f116157v;
        path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
    }

    public final void d() {
        android.animation.ValueAnimator valueAnimator = this.f116158w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.L = java.lang.System.currentTimeMillis();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(((float) 4500) / this.f116154s);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.ad(this));
        ofFloat.start();
        this.f116158w = ofFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        android.widget.FrameLayout frameLayout = this.f116151p1;
        if (frameLayout == null || frameLayout.getWidth() == 0 || frameLayout.getHeight() == 0) {
            return;
        }
        android.graphics.RectF rectF = this.f116160x0;
        rectF.set(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom());
        float f17 = this.f116157v;
        canvas.drawRoundRect(rectF, f17, f17, this.U);
    }

    public final void e() {
        if (this.f116162y) {
            this.f116162y = false;
            android.animation.ValueAnimator valueAnimator = this.f116158w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f116158w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.FrameLayout frameLayout = this.f116151p1;
        if (frameLayout == null) {
            return;
        }
        int i28 = (int) this.P;
        int left = frameLayout.getLeft();
        int top = frameLayout.getTop();
        this.f116145l1.layout(left - i28, top - i28, frameLayout.getRight() + i28, frameLayout.getBottom() + i28);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.widget.FrameLayout frameLayout = this.f116151p1;
        if (frameLayout == null) {
            super.onMeasure(i17, i18);
            return;
        }
        int i19 = (int) this.P;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i27 = layoutParams2.leftMargin + layoutParams2.rightMargin;
        int i28 = layoutParams2.topMargin + layoutParams2.bottomMargin;
        measureChildWithMargins(frameLayout, i17, paddingLeft, i18, paddingTop);
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        int i29 = i27 + measuredWidth + paddingLeft;
        int i37 = i28 + measuredHeight + paddingTop;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (i29 < suggestedMinimumWidth) {
            i29 = suggestedMinimumWidth;
        }
        int resolveSize = android.view.View.resolveSize(i29, i17);
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (i37 < suggestedMinimumHeight) {
            i37 = suggestedMinimumHeight;
        }
        setMeasuredDimension(resolveSize, android.view.View.resolveSize(i37, i18));
        int i38 = i19 * 2;
        this.f116145l1.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth + i38, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight + i38, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float f17 = this.S;
        this.P = 10.0f * f17;
        this.N = this.f116152q * f17;
        this.Q = this.f116153r * f17;
        this.U.setStrokeWidth(this.f116155t * f17);
        if (this.T == 0.0f) {
            this.f116157v = f17 * 12.0f;
        }
        int i28 = (int) this.P;
        android.widget.FrameLayout frameLayout = this.f116151p1;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null && layoutParams2.leftMargin != i28) {
            layoutParams2.setMargins(i28, i28, i28, i28);
            frameLayout.setLayoutParams(layoutParams2);
        }
        float f18 = this.N;
        com.tencent.mm.plugin.finder.live.view.zc zcVar = this.G;
        zcVar.f116863a = f18;
        zcVar.f116865c = f18;
        float f19 = this.Q;
        com.tencent.mm.plugin.finder.live.view.zc zcVar2 = this.I;
        zcVar2.f116863a = f19;
        zcVar2.f116865c = f19;
        c();
        a(this.N);
    }

    public final void setBubbleAlpha(float f17) {
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        this.M = e17;
        setAlpha(e17);
    }

    public final void setCornerRadiusImmediate(float f17) {
        this.T = f17;
        this.f116157v = f17;
        this.V.setCornerRadius(f17);
        c();
        invalidate();
        this.f116145l1.invalidate();
    }

    public final void setFlowSpeed(float f17) {
        this.f116154s = e06.p.e(f17, 0.0f, 3.0f);
        if (this.f116162y) {
            android.animation.ValueAnimator valueAnimator = this.f116158w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            d();
        }
    }

    public final void setFrameInterval(int i17) {
        this.f116164z = e06.p.f(i17, 1, 4);
        this.A = 0;
    }

    public final void setGlowRadius(float f17) {
        float f18 = f17 * this.S;
        this.N = f18;
        if (!this.B) {
            this.G.f116865c = f18;
        }
        invalidate();
    }

    public final void setInteriorBackgroundColor(int i17) {
        this.f116156u = i17;
        this.V.setColor(i17);
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        android.widget.FrameLayout frameLayout;
        if (this.f116161x1 || (frameLayout = this.f116151p1) == null) {
            super.setPadding(i17, i18, i19, i27);
        } else {
            frameLayout.setPadding(i17, i18, i19, i27);
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int i17, int i18, int i19, int i27) {
        android.widget.FrameLayout frameLayout;
        if (this.f116161x1 || (frameLayout = this.f116151p1) == null) {
            super.setPaddingRelative(i17, i18, i19, i27);
        } else {
            frameLayout.setPaddingRelative(i17, i18, i19, i27);
        }
    }

    public final void setShowGlow(boolean z17) {
        if (this.R != z17) {
            this.R = z17;
            this.f116145l1.setVisibility(z17 ? 0 : 8);
            invalidate();
        }
    }

    public final void setVoiceVolume(float f17) {
        float f18;
        float f19;
        if (this.B) {
            float e17 = e06.p.e(f17, 0.0f, 1.0f);
            float f27 = this.C;
            if (e17 > f27) {
                f18 = e17 - f27;
                f19 = 0.25f;
            } else {
                f18 = e17 - f27;
                f19 = 0.06f;
            }
            float f28 = f27 + (f18 * f19);
            this.C = f28;
            float min = java.lang.Math.min(f28, 1.0f);
            boolean z17 = min > 0.05f;
            float f29 = this.S;
            com.tencent.mm.plugin.finder.live.view.zc zcVar = this.K;
            com.tencent.mm.plugin.finder.live.view.zc zcVar2 = this.f116138J;
            com.tencent.mm.plugin.finder.live.view.zc zcVar3 = this.I;
            com.tencent.mm.plugin.finder.live.view.zc zcVar4 = this.H;
            com.tencent.mm.plugin.finder.live.view.zc zcVar5 = this.G;
            com.tencent.mm.plugin.finder.live.view.zc zcVar6 = this.F;
            if (z17) {
                this.E = 0L;
                if (java.lang.Math.abs(min - this.D) > 0.018f) {
                    this.D = min;
                    float min2 = 1.0f - java.lang.Math.min((min - 0.05f) / 0.5f, 1.0f);
                    float f37 = 1.0f - (min2 * min2);
                    zcVar6.f116865c = (0.45f * f37) + 0.5f;
                    zcVar5.f116865c = this.N + (1.6f * f29 * f37);
                    zcVar4.f116865c = (0.029999971f * f37) + 1.0f;
                    zcVar3.f116865c = this.Q + (f29 * 1.0f * f37);
                    zcVar2.f116865c = 0.5f * f37;
                    zcVar.f116865c = f37 * 0.15f;
                    return;
                }
                return;
            }
            if (this.E == 0) {
                this.E = java.lang.System.currentTimeMillis();
            }
            if (java.lang.System.currentTimeMillis() - this.E > 600) {
                zcVar6.f116865c = 0.35f;
                zcVar5.f116865c = this.N;
                zcVar4.f116865c = 1.0f;
                zcVar3.f116865c = this.Q;
                zcVar2.f116865c = 0.5f;
                zcVar.f116865c = 0.0f;
                return;
            }
            float f38 = min / 0.05f;
            zcVar6.f116865c = (0.08f * f38) + 0.35f;
            zcVar5.f116865c = this.N + (0.3f * f38 * f29);
            zcVar4.f116865c = (0.005f * f38) + 1.0f;
            float f39 = 0.1f * f38;
            zcVar3.f116865c = this.Q + (f29 * f39);
            zcVar2.f116865c = f39;
            zcVar.f116865c = f38 * 0.02f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiriBubbleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vd2.x5.f436016k, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f116139d = new float[]{0.0f, 0.35f, 1.0f};
        this.f116140e = new int[3];
        this.f116141f = new int[2];
        this.f116142g = new int[]{android.graphics.Color.parseColor("#A6FBF9"), android.graphics.Color.parseColor("#B1FBB2"), android.graphics.Color.parseColor("#F9EDB6")};
        this.f116148o = androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
        this.f116149p = 8000L;
        int color = obtainStyledAttributes.getColor(0, 1291845631);
        this.f116152q = obtainStyledAttributes.getDimension(5, android.util.TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics())) / getResources().getDisplayMetrics().density;
        this.f116153r = obtainStyledAttributes.getDimension(6, android.util.TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics())) / getResources().getDisplayMetrics().density;
        this.f116154s = obtainStyledAttributes.getFloat(2, 1.0f);
        this.f116155t = obtainStyledAttributes.getDimension(1, android.util.TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics())) / getResources().getDisplayMetrics().density;
        this.f116156u = obtainStyledAttributes.getColor(7, 855638016);
        obtainStyledAttributes.recycle();
        this.f116164z = 4;
        this.F = new com.tencent.mm.plugin.finder.live.view.zc(0.35f, 0.0f, 0.35f, 80.0f, 22.0f, 2, null);
        this.G = new com.tencent.mm.plugin.finder.live.view.zc(0.0f, 0.0f, 0.0f, 80.0f, 24.0f, 2, null);
        this.H = new com.tencent.mm.plugin.finder.live.view.zc(1.0f, 0.0f, 1.0f, 80.0f, 26.0f, 2, null);
        this.I = new com.tencent.mm.plugin.finder.live.view.zc(0.0f, 0.0f, 0.0f, 80.0f, 24.0f, 2, null);
        this.f116138J = new com.tencent.mm.plugin.finder.live.view.zc(0.5f, 0.0f, 0.5f, 75.0f, 20.0f, 2, null);
        this.K = new com.tencent.mm.plugin.finder.live.view.zc(0.0f, 0.0f, 0.0f, 70.0f, 20.0f, 2, null);
        this.M = 1.0f;
        this.R = true;
        float f17 = getResources().getDisplayMetrics().density;
        this.S = f17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(color);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.U = paint;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        this.V = gradientDrawable;
        this.W = new android.graphics.Path();
        this.f116150p0 = new android.graphics.RectF();
        this.f116160x0 = new android.graphics.RectF();
        this.f116163y0 = -1.0f;
        com.tencent.mm.plugin.finder.live.view.yc ycVar = new com.tencent.mm.plugin.finder.live.view.yc(this, context);
        this.f116145l1 = ycVar;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setBackground(gradientDrawable);
        this.f116151p1 = frameLayout;
        this.f116161x1 = true;
        setClipToOutline(false);
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        if (this.T == 0.0f) {
            this.f116157v = 12.0f * f17;
        }
        setAlpha(this.M);
        gradientDrawable.setColor(this.f116156u);
        gradientDrawable.setCornerRadius(this.f116157v);
        frameLayout.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        super.setPadding(0, 0, 0, 0);
        addView(ycVar, new android.widget.FrameLayout.LayoutParams(-2, -2));
        int i18 = (int) (f17 * 10.0f);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i18, i18, i18, i18);
        layoutParams.gravity = 80;
        addView(frameLayout, layoutParams);
        this.f116161x1 = false;
    }
}
