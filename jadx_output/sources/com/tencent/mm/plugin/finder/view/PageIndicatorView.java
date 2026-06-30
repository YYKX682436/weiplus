package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/PageIndicatorView;", "Landroid/view/View;", "", "count", "Ljz5/f0;", "setPageCount", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, "setCurrentPage", "Landroidx/recyclerview/widget/w2;", "<set-?>", org.chromium.base.BaseSwitches.V, "Landroidx/recyclerview/widget/w2;", "getOnScrollListener", "()Landroidx/recyclerview/widget/w2;", "onScrollListener", "Landroidx/recyclerview/widget/h2;", "w", "Landroidx/recyclerview/widget/h2;", "getAdapterDataObserver", "()Landroidx/recyclerview/widget/h2;", "adapterDataObserver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class PageIndicatorView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f131550d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131551e;

    /* renamed from: f, reason: collision with root package name */
    public final int f131552f;

    /* renamed from: g, reason: collision with root package name */
    public final int f131553g;

    /* renamed from: h, reason: collision with root package name */
    public final float f131554h;

    /* renamed from: i, reason: collision with root package name */
    public int f131555i;

    /* renamed from: m, reason: collision with root package name */
    public int f131556m;

    /* renamed from: n, reason: collision with root package name */
    public float f131557n;

    /* renamed from: o, reason: collision with root package name */
    public float f131558o;

    /* renamed from: p, reason: collision with root package name */
    public int f131559p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f131560q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f131561r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f131562s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f131563t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Paint f131564u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public androidx.recyclerview.widget.w2 onScrollListener;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public androidx.recyclerview.widget.h2 adapterDataObserver;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f131567x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f131568y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f131569z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(float f17) {
        android.animation.ValueAnimator valueAnimator = this.f131561r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f131557n, f17);
        ofFloat.setDuration(180L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.view.vr(this));
        ofFloat.start();
        this.f131561r = ofFloat;
    }

    public final void b(int i17, yz5.a aVar) {
        this.f131559p = i17;
        android.animation.ValueAnimator valueAnimator = this.f131560q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f131558o, i17);
        ofFloat.setDuration(180L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.view.wr(this));
        ofFloat.addListener(new com.tencent.mm.plugin.finder.view.xr(aVar));
        ofFloat.start();
        this.f131560q = ofFloat;
    }

    public final void c(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.y1 pagerSnapHelper) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(pagerSnapHelper, "pagerSnapHelper");
        if (this.f131563t) {
            return;
        }
        this.f131563t = true;
        androidx.recyclerview.widget.w2 w2Var = this.onScrollListener;
        if (w2Var != null) {
            recyclerView.V0(w2Var);
        }
        com.tencent.mm.plugin.finder.view.yr yrVar = new com.tencent.mm.plugin.finder.view.yr(this, pagerSnapHelper);
        recyclerView.i(yrVar);
        this.onScrollListener = yrVar;
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            setPageCount(adapter.getItemCount());
            androidx.recyclerview.widget.h2 h2Var = this.adapterDataObserver;
            if (h2Var != null) {
                adapter.unregisterAdapterDataObserver(h2Var);
            }
            com.tencent.mm.plugin.finder.view.zr zrVar = new com.tencent.mm.plugin.finder.view.zr(this, adapter);
            adapter.registerAdapterDataObserver(zrVar);
            this.adapterDataObserver = zrVar;
        }
    }

    public final int d(int i17) {
        int min = java.lang.Math.min(this.f131555i, 5);
        int i18 = this.f131555i;
        if (i18 <= min) {
            return 0;
        }
        int i19 = i18 - min;
        return e06.p.f(this.f131559p, e06.p.f(i17 - (min - 2), 0, i19), e06.p.f(i17 - 1, 0, i19));
    }

    public final androidx.recyclerview.widget.h2 getAdapterDataObserver() {
        return this.adapterDataObserver;
    }

    public final androidx.recyclerview.widget.w2 getOnScrollListener() {
        return this.onScrollListener;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f131560q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f131560q = null;
        android.animation.ValueAnimator valueAnimator2 = this.f131561r;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f131561r = null;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        float e17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int i17 = this.f131555i;
        if (i17 <= 0) {
            return;
        }
        int i18 = 5;
        int min = java.lang.Math.min(i17, 5);
        float height = getHeight() / 2.0f;
        float f37 = this.f131555i - min;
        float width = getWidth() / 2.0f;
        float f38 = this.f131558o + ((min - 1) / 2.0f);
        float f39 = this.f131551e;
        float f47 = width - (f38 * f39);
        float f48 = min;
        float f49 = f39 * ((f48 / 2.0f) + 0.5f);
        float f57 = width - f49;
        float f58 = width + f49;
        canvas.save();
        canvas.clipRect(f57, 0.0f, f58, getHeight());
        int i19 = this.f131555i;
        int i27 = 0;
        while (i27 < i19) {
            float f59 = (i27 * r9) + f47;
            int i28 = this.f131550d;
            float f66 = i28 * 2;
            if (f59 < f57 - f66 || f59 > f66 + f58) {
                f17 = f48;
                f18 = f57;
                f19 = f37;
                f27 = f58;
                f28 = f47;
            } else {
                float f67 = this.f131558o;
                f18 = f57;
                if (this.f131555i <= i18) {
                    f29 = 1.0f;
                    f27 = f58;
                } else {
                    float f68 = i27 - f67;
                    float f69 = this.f131554h;
                    if (f68 >= 1.0f || f67 <= 0.01f) {
                        f27 = f58;
                        float f76 = (f48 - 1.0f) - 1.0f;
                        if (f68 <= f76 || f67 >= f37 - 0.01f) {
                            f29 = 1.0f;
                        } else {
                            e17 = e06.p.e(f68 - f76, 0.0f, 1.0f) * e06.p.e(f37 - f67, 0.0f, 1.0f);
                            android.animation.TimeInterpolator timeInterpolator = w9.a.f444034a;
                        }
                    } else {
                        f27 = f58;
                        e17 = e06.p.e(1.0f - f68, 0.0f, 1.0f) * e06.p.e(f67, 0.0f, 1.0f);
                        android.animation.TimeInterpolator timeInterpolator2 = w9.a.f444034a;
                    }
                    f29 = (e17 * (f69 - 1.0f)) + 1.0f;
                }
                float e18 = e06.p.e(1.0f - java.lang.Math.abs(i27 - this.f131557n), 0.0f, 1.0f);
                int i29 = this.f131552f;
                float[] fArr = this.f131567x;
                android.graphics.Color.colorToHSV(i29, fArr);
                int i37 = this.f131553g;
                f17 = f48;
                float[] fArr2 = this.f131568y;
                android.graphics.Color.colorToHSV(i37, fArr2);
                float f77 = fArr[0];
                float f78 = fArr2[0];
                f19 = f37;
                if (f78 - f77 > 180.0f) {
                    f28 = f47;
                    f78 -= com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                } else {
                    f28 = f47;
                    if (f77 - f78 > 180.0f) {
                        f77 -= com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                    }
                }
                float f79 = com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                float f86 = fArr[1];
                float f87 = f86 + ((fArr2[1] - f86) * e18);
                float f88 = fArr[2];
                float f89 = f88 + ((fArr2[2] - f88) * e18);
                int f96 = e06.p.f(a06.d.b(((i29 >>> 24) & 255) + ((((i37 >>> 24) & 255) - r2) * e18)), 0, 255);
                float[] fArr3 = this.f131569z;
                fArr3[0] = ((f77 + ((f78 - f77) * e18)) + f79) % f79;
                fArr3[1] = f87;
                fArr3[2] = f89;
                int HSVToColor = android.graphics.Color.HSVToColor(f96, fArr3);
                android.graphics.Paint paint = this.f131564u;
                paint.setColor(HSVToColor);
                canvas.drawCircle(f59, height, i28 * f29, paint);
            }
            i27++;
            f57 = f18;
            f58 = f27;
            f48 = f17;
            f47 = f28;
            f37 = f19;
            i18 = 5;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int paddingLeft;
        int paddingRight;
        int min = java.lang.Math.min(this.f131555i, 5);
        int i19 = this.f131550d;
        if (min > 0) {
            paddingRight = (this.f131551e * (min - 1)) + (i19 * 2) + getPaddingLeft();
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        setMeasuredDimension(android.view.View.resolveSize(paddingRight + paddingLeft, i17), android.view.View.resolveSize((i19 * 2) + getPaddingTop() + getPaddingBottom(), i18));
    }

    public final void setCurrentPage(int i17) {
        int i18 = this.f131555i;
        if (i18 <= 0) {
            return;
        }
        int f17 = e06.p.f(i17, 0, i18 - 1);
        this.f131556m = f17;
        this.f131557n = f17;
        int d17 = d(f17);
        this.f131559p = d17;
        this.f131558o = d17;
        invalidate();
    }

    public final void setPageCount(int i17) {
        int max = java.lang.Math.max(0, i17);
        this.f131555i = max;
        int f17 = e06.p.f(this.f131556m, 0, java.lang.Math.max(0, max - 1));
        this.f131556m = f17;
        this.f131557n = f17;
        int d17 = d(f17);
        this.f131559p = d17;
        this.f131558o = d17;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        this.f131550d = dimensionPixelSize;
        this.f131551e = (dimensionPixelSize * 2) + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        this.f131552f = b3.l.getColor(context, com.tencent.mm.R.color.BW_100_Alpha_0_5);
        this.f131553g = b3.l.getColor(context, com.tencent.mm.R.color.f478553an);
        this.f131554h = 0.75f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f131564u = paint;
        this.f131567x = new float[3];
        this.f131568y = new float[3];
        this.f131569z = new float[3];
    }
}
