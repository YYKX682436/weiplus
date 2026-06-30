package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0017&\u0011B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvMarqueeTextView;", "Landroid/view/View;", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "Ljz5/f0;", "setText", "", "textSize", "setTextSize", "", "textColor", "setTextColor", "", "bold", "setTextBold", "getLeftFadingEdgeStrength", "getRightFadingEdgeStrength", "Lcom/tencent/mm/plugin/mv/ui/view/m3;", "o", "Lcom/tencent/mm/plugin/mv/ui/view/m3;", "getViewProvider", "()Lcom/tencent/mm/plugin/mv/ui/view/m3;", "viewProvider", "Lcom/tencent/mm/plugin/mv/ui/view/j3;", "p", "Lcom/tencent/mm/plugin/mv/ui/view/j3;", "getEffect", "()Lcom/tencent/mm/plugin/mv/ui/view/j3;", "setEffect", "(Lcom/tencent/mm/plugin/mv/ui/view/j3;)V", "effect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/mv/ui/view/l3", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MusicMvMarqueeTextView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f151701d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f151702e;

    /* renamed from: f, reason: collision with root package name */
    public float f151703f;

    /* renamed from: g, reason: collision with root package name */
    public float f151704g;

    /* renamed from: h, reason: collision with root package name */
    public final float f151705h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Scroller f151706i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f151707m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f151708n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.mv.ui.view.m3 viewProvider;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.mv.ui.view.j3 effect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvMarqueeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        android.graphics.Paint paint = this.f151701d;
        float measureText = paint.measureText(this.f151702e);
        float f17 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        if (this.f151703f == measureText) {
            if (this.f151704g == f17) {
                return;
            }
        }
        this.f151703f = measureText;
        this.f151704g = f17;
        requestLayout();
    }

    public final void b() {
        if (getWidth() >= this.f151703f) {
            this.f151707m = false;
            ((com.tencent.mm.plugin.mv.ui.view.l3) this.effect).a();
            scrollTo(0, 0);
            return;
        }
        this.f151707m = true;
        if (this.f151708n) {
            com.tencent.mm.plugin.mv.ui.view.l3 l3Var = (com.tencent.mm.plugin.mv.ui.view.l3) this.effect;
            if (l3Var.f151894d == 0) {
                l3Var.f151894d = 1;
                com.tencent.mm.plugin.mv.ui.view.n3 n3Var = (com.tencent.mm.plugin.mv.ui.view.n3) l3Var.f151891a;
                com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView musicMvMarqueeTextView = n3Var.f151910a;
                java.lang.Runnable runnable = l3Var.f151895e;
                musicMvMarqueeTextView.removeCallbacks(runnable);
                n3Var.f151910a.postDelayed(runnable, l3Var.f151893c);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f151706i;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }

    public final com.tencent.mm.plugin.mv.ui.view.j3 getEffect() {
        return this.effect;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.f151707m) {
            if (!(((com.tencent.mm.plugin.mv.ui.view.n3) ((com.tencent.mm.plugin.mv.ui.view.l3) this.effect).f151891a).f151910a.getScrollX() == 0)) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (!this.f151707m) {
            return 0.0f;
        }
        this.effect.getClass();
        return 1.0f;
    }

    public final com.tencent.mm.plugin.mv.ui.view.m3 getViewProvider() {
        return this.viewProvider;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int save = canvas.save();
        float paddingTop = getPaddingTop();
        android.graphics.Paint paint = this.f151701d;
        canvas.translate(0.0f, paddingTop - paint.getFontMetrics().top);
        canvas.drawText(this.f151702e, 0.0f, 0.0f, paint);
        if (this.f151707m) {
            canvas.translate(this.f151703f + this.f151705h, 0.0f);
            canvas.drawText(this.f151702e, 0.0f, 0.0f, paint);
        }
        canvas.restoreToCount(save);
        if (this.f151707m) {
            com.tencent.mm.plugin.mv.ui.view.l3 l3Var = (com.tencent.mm.plugin.mv.ui.view.l3) this.effect;
            com.tencent.mm.plugin.mv.ui.view.n3 n3Var = (com.tencent.mm.plugin.mv.ui.view.n3) l3Var.f151891a;
            if (n3Var.f151910a.f151706i.isFinished()) {
                n3Var.f151910a.scrollTo(0, 0);
                if (l3Var.f151894d == 2) {
                    l3Var.f151894d = 1;
                    com.tencent.mm.plugin.mv.ui.view.MusicMvMarqueeTextView musicMvMarqueeTextView = n3Var.f151910a;
                    java.lang.Runnable runnable = l3Var.f151895e;
                    musicMvMarqueeTextView.removeCallbacks(runnable);
                    n3Var.f151910a.postDelayed(runnable, l3Var.f151893c);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int paddingTop = ((int) this.f151704g) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            float f17 = size;
            float f18 = this.f151703f;
            if (f17 >= f18) {
                size = (int) f18;
            }
        }
        setMeasuredDimension(size, paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        b();
    }

    public final void setEffect(com.tencent.mm.plugin.mv.ui.view.j3 j3Var) {
        kotlin.jvm.internal.o.g(j3Var, "<set-?>");
        this.effect = j3Var;
    }

    public final void setText(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(this.f151702e, str)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f151702e = str;
        a();
        ((com.tencent.mm.plugin.mv.ui.view.l3) this.effect).a();
        scrollTo(0, 0);
        b();
    }

    public final void setTextBold(boolean z17) {
        this.f151701d.setFakeBoldText(z17);
    }

    public final void setTextColor(int i17) {
        android.graphics.Paint paint = this.f151701d;
        if (paint.getColor() != i17) {
            paint.setColor(i17);
            invalidate();
        }
    }

    public final void setTextSize(float f17) {
        android.graphics.Paint paint = this.f151701d;
        if (paint.getTextSize() == f17) {
            return;
        }
        paint.setTextSize(f17);
        a();
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvMarqueeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f151701d = new android.graphics.Paint(1);
        this.f151702e = "";
        this.f151706i = new android.widget.Scroller(context, new android.view.animation.LinearInterpolator());
        this.f151708n = true;
        com.tencent.mm.plugin.mv.ui.view.n3 n3Var = new com.tencent.mm.plugin.mv.ui.view.n3(this);
        this.viewProvider = n3Var;
        this.effect = new com.tencent.mm.plugin.mv.ui.view.l3(n3Var);
        this.f151705h = 4 * i65.a.b(context, 8);
    }
}
