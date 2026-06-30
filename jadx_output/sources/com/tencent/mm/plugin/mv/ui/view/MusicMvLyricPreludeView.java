package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R#\u0010\u001e\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricPreludeView;", "Landroid/widget/FrameLayout;", "", "o", "Z", "getEnableAnim", "()Z", "setEnableAnim", "(Z)V", "enableAnim", "", "p", "J", "getPreludeLen", "()J", "setPreludeLen", "(J)V", "preludeLen", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "q", "Ljz5/g;", "getDotDownAnimator", "()Landroid/animation/ValueAnimator;", "dotDownAnimator", "r", "getDotUpAnimator", "dotUpAnimator", "s", "getAlphaAnimator", "alphaAnimator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvLyricPreludeView extends android.widget.FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final float f151663u = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);

    /* renamed from: v, reason: collision with root package name */
    public static final float f151664v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f151665w;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f151666d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f151667e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f151668f;

    /* renamed from: g, reason: collision with root package name */
    public int f151669g;

    /* renamed from: h, reason: collision with root package name */
    public int f151670h;

    /* renamed from: i, reason: collision with root package name */
    public float f151671i;

    /* renamed from: m, reason: collision with root package name */
    public float f151672m;

    /* renamed from: n, reason: collision with root package name */
    public int f151673n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean enableAnim;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long preludeLen;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final jz5.g dotDownAnimator;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final jz5.g dotUpAnimator;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final jz5.g alphaAnimator;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f151679t;

    static {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24);
        f151664v = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 21);
        f151665w = "MicroMsg.MusicMvLyricPreludeView";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvLyricPreludeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f151666d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f151667e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f151668f = paint3;
        this.f151669g = 2;
        this.f151670h = 1;
        float f17 = f151663u;
        this.f151671i = f17;
        this.f151672m = f17;
        this.f151673n = 2;
        this.dotDownAnimator = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.j2.f151877d);
        this.dotUpAnimator = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.k2.f151885d);
        this.alphaAnimator = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.i2.f151871d);
        paint.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        paint2.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        paint3.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.animation.ValueAnimator getAlphaAnimator() {
        return (android.animation.ValueAnimator) this.alphaAnimator.getValue();
    }

    private final android.animation.ValueAnimator getDotDownAnimator() {
        return (android.animation.ValueAnimator) this.dotDownAnimator.getValue();
    }

    private final android.animation.ValueAnimator getDotUpAnimator() {
        return (android.animation.ValueAnimator) this.dotUpAnimator.getValue();
    }

    public final float b(int i17) {
        return i17 == this.f151670h ? this.f151672m : i17 == this.f151669g ? this.f151671i : f151663u;
    }

    public final void c() {
        android.animation.ValueAnimator valueAnimator;
        if (this.enableAnim) {
            if (getDotDownAnimator().isStarted()) {
                getDotDownAnimator().pause();
            }
            if (getDotUpAnimator().isStarted()) {
                getDotUpAnimator().pause();
            }
            android.animation.ValueAnimator valueAnimator2 = this.f151679t;
            boolean z17 = false;
            if (valueAnimator2 != null && valueAnimator2.isStarted()) {
                z17 = true;
            }
            if (z17 && (valueAnimator = this.f151679t) != null) {
                valueAnimator.pause();
            }
            if (getAlphaAnimator().isStarted()) {
                getAlphaAnimator().pause();
            }
        }
    }

    public final void d() {
        android.animation.ValueAnimator valueAnimator;
        if (this.enableAnim) {
            if (getDotDownAnimator().isPaused()) {
                getDotDownAnimator().resume();
            }
            if (getDotUpAnimator().isPaused()) {
                getDotUpAnimator().resume();
            }
            android.animation.ValueAnimator valueAnimator2 = this.f151679t;
            boolean z17 = false;
            if (valueAnimator2 != null && valueAnimator2.isPaused()) {
                z17 = true;
            }
            if (z17 && (valueAnimator = this.f151679t) != null) {
                valueAnimator.resume();
            }
            if (getAlphaAnimator().isPaused()) {
                getAlphaAnimator().resume();
            }
        }
    }

    public final void e(long j17) {
        com.tencent.mars.xlog.Log.i(f151665w, "startAlphaAnim");
        float f17 = f151663u;
        this.f151672m = f17;
        this.f151671i = f17;
        invalidate();
        if (j17 > 5000) {
            j17 = 3000;
        }
        int i17 = (int) j17;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
        this.f151679t = ofInt;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var3 = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.o.d(ofInt);
        ofInt.setDuration(i17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addListener(new com.tencent.mm.plugin.mv.ui.view.l2(this));
        ofInt.addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.m2(i17, this, c0Var3, c0Var2, c0Var));
        ofInt.cancel();
        ofInt.start();
        getAlphaAnimator().addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.n2(this));
    }

    public final void f(long j17) {
        boolean z17 = this.enableAnim;
        java.lang.String str = f151665w;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startAnim " + hashCode() + "， has startAnim");
            return;
        }
        this.enableAnim = true;
        this.f151669g = 2;
        this.f151670h = 1;
        float f17 = f151663u;
        this.f151671i = f17;
        this.f151672m = f17;
        this.f151673n = 2;
        this.f151666d.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        this.f151667e.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        this.f151668f.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        long j18 = this.preludeLen - j17;
        com.tencent.mars.xlog.Log.i(str, "startAnim " + hashCode() + "， remaining:" + j18);
        if (j18 <= 5000) {
            if (j18 >= 3000) {
                e(j18);
                return;
            } else {
                this.enableAnim = false;
                return;
            }
        }
        getDotDownAnimator().addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.o2(j18, this));
        getDotUpAnimator().addUpdateListener(new com.tencent.mm.plugin.mv.ui.view.p2(j18, this));
        getDotDownAnimator().cancel();
        getDotDownAnimator().start();
        getDotUpAnimator().cancel();
        getDotUpAnimator().start();
    }

    public final boolean getEnableAnim() {
        return this.enableAnim;
    }

    public final long getPreludeLen() {
        return this.preludeLen;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.enableAnim) {
            float f17 = f151663u;
            float b17 = b(0);
            android.graphics.Paint paint = this.f151666d;
            float f18 = f151664v;
            canvas.drawCircle((f17 * 0.2f) + f17, f18, b17, paint);
            canvas.drawCircle((4 * f17) + (f17 * 0.2f), f18, b(1), this.f151667e);
            canvas.drawCircle((7 * f17) + (f17 * 0.2f), f18, b(2), this.f151668f);
        }
    }

    public final void setEnableAnim(boolean z17) {
        this.enableAnim = z17;
    }

    public final void setPreludeLen(long j17) {
        this.preludeLen = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvLyricPreludeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f151666d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f151667e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f151668f = paint3;
        this.f151669g = 2;
        this.f151670h = 1;
        float f17 = f151663u;
        this.f151671i = f17;
        this.f151672m = f17;
        this.f151673n = 2;
        this.dotDownAnimator = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.j2.f151877d);
        this.dotUpAnimator = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.k2.f151885d);
        this.alphaAnimator = jz5.h.b(com.tencent.mm.plugin.mv.ui.view.i2.f151871d);
        paint.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        paint2.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
        paint3.setColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
    }
}
