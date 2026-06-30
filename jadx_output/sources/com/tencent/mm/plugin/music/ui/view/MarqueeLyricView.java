package com.tencent.mm.plugin.music.ui.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MarqueeLyricView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lll3/h1;", "lyricObj", "Ljz5/f0;", "setLyricObj", "", "currentTime", "setCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-music_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MarqueeLyricView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Scroller f150809g;

    /* renamed from: h, reason: collision with root package name */
    public final int f150810h;

    /* renamed from: i, reason: collision with root package name */
    public ll3.h1 f150811i;

    /* renamed from: m, reason: collision with root package name */
    public int f150812m;

    /* renamed from: n, reason: collision with root package name */
    public int f150813n;

    /* renamed from: o, reason: collision with root package name */
    public int f150814o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f150815p;

    /* renamed from: q, reason: collision with root package name */
    public long f150816q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f150817r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.animation.Animation f150818s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.animation.Animation f150819t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150820u;

    /* renamed from: v, reason: collision with root package name */
    public int f150821v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarqueeLyricView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int b(java.lang.String str) {
        android.text.TextPaint paint = getPaint();
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        if (rect.width() > 0) {
            return rect.width();
        }
        return 25;
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        super.computeScroll();
        android.widget.Scroller scroller = this.f150809g;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), 0);
            invalidate();
        }
    }

    public final void e(int i17, java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        ll3.h1 h1Var = this.f150811i;
        if (h1Var != null) {
            setText(content);
            int i18 = i17 + 1;
            long j17 = i18 < h1Var.e() ? h1Var.d(i18).f319167a - h1Var.d(i17).f319167a : 5000L;
            boolean z17 = j17 > 1000;
            long j18 = (long) (j17 * 0.3d);
            if (200 <= j18) {
                j18 = 200;
            }
            this.f150816q = j18;
            int b17 = b(content);
            getWidth();
            java.lang.Runnable runnable = this.f150815p;
            removeCallbacks(runnable);
            this.f150809g.startScroll(0, 0, 0, 0, 0);
            if (this.f150820u) {
                long j19 = this.f150816q;
                android.view.animation.Animation animation = this.f150818s;
                animation.setDuration(j19);
                startAnimation(animation);
                this.f150820u = false;
            }
            if (getWidth() >= b17 || !z17) {
                return;
            }
            int b18 = b(content);
            int i19 = this.f150810h;
            int i27 = b18 - ((i19 * 3) / 4);
            if (i27 != 0) {
                this.f150814o = (int) (((i27 * 1.0f) / com.tencent.mm.ui.zk.a(getContext(), 25)) * 1000);
                this.f150812m = i19;
                this.f150813n = i27;
                postDelayed(runnable, 1000L);
            }
            if (h1Var.e() - 1 > i17) {
                postDelayed(this.f150817r, j17 - this.f150816q);
                this.f150820u = true;
            }
        }
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public final void setCurrentTime(long j17) {
        int i17;
        ll3.h1 h1Var = this.f150811i;
        if (h1Var == null || h1Var.e() <= 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MarqueeLyricView", "getLyricLine, hasNoLyric");
            i17 = -2;
        } else if (-1 == this.f150821v) {
            this.f150821v = 0;
            ll3.h1 h1Var2 = this.f150811i;
            kotlin.jvm.internal.o.d(h1Var2);
            java.lang.String content = h1Var2.d(this.f150821v).f319168b;
            kotlin.jvm.internal.o.f(content, "content");
            while (true) {
                int length = content.length() - 1;
                int i18 = 0;
                boolean z17 = false;
                while (i18 <= length) {
                    boolean z18 = kotlin.jvm.internal.o.i(content.charAt(!z17 ? i18 : length), 32) <= 0;
                    if (z17) {
                        if (!z18) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z18) {
                        i18++;
                    } else {
                        z17 = true;
                    }
                }
                if (!(content.subSequence(i18, length + 1).toString().length() == 0)) {
                    break;
                }
                this.f150821v++;
                ll3.h1 h1Var3 = this.f150811i;
                kotlin.jvm.internal.o.d(h1Var3);
                content = h1Var3.d(this.f150821v).f319168b;
                kotlin.jvm.internal.o.f(content, "content");
            }
            i17 = this.f150821v;
        } else {
            ll3.h1 h1Var4 = this.f150811i;
            kotlin.jvm.internal.o.d(h1Var4);
            int e17 = h1Var4.e();
            int i19 = 0;
            int i27 = -1;
            while (i19 < e17) {
                ll3.h1 h1Var5 = this.f150811i;
                kotlin.jvm.internal.o.d(h1Var5);
                if (h1Var5.d(i19).f319167a >= j17) {
                    break;
                }
                ll3.h1 h1Var6 = this.f150811i;
                kotlin.jvm.internal.o.d(h1Var6);
                h1Var6.d(i19).getClass();
                int i28 = i19;
                i19++;
                i27 = i28;
            }
            if (-1 == i27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MarqueeLyricView", "getLyricLine, can not found");
                i17 = -1;
            } else if (i27 == this.f150821v) {
                i17 = -3;
            } else {
                ll3.h1 h1Var7 = this.f150811i;
                kotlin.jvm.internal.o.d(h1Var7);
                if (i27 >= h1Var7.e()) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i27);
                    ll3.h1 h1Var8 = this.f150811i;
                    kotlin.jvm.internal.o.d(h1Var8);
                    com.tencent.mars.xlog.Log.e("MicroMsg.MarqueeLyricView", "getLyricLine, over range, tempHighLightIndex:%s, SentenceSize:%s", valueOf, java.lang.Integer.valueOf(h1Var8.e()));
                    i17 = -5;
                } else {
                    this.f150821v = i27;
                    ll3.h1 h1Var9 = this.f150811i;
                    kotlin.jvm.internal.o.d(h1Var9);
                    java.lang.String content2 = h1Var9.d(i27).f319168b;
                    kotlin.jvm.internal.o.f(content2, "content");
                    int length2 = content2.length() - 1;
                    int i29 = 0;
                    boolean z19 = false;
                    while (i29 <= length2) {
                        boolean z27 = kotlin.jvm.internal.o.i(content2.charAt(!z19 ? i29 : length2), 32) <= 0;
                        if (z19) {
                            if (!z27) {
                                break;
                            } else {
                                length2--;
                            }
                        } else if (z27) {
                            i29++;
                        } else {
                            z19 = true;
                        }
                    }
                    i17 = content2.subSequence(i29, length2 + 1).toString().length() == 0 ? -6 : i27;
                }
            }
        }
        ll3.h1 h1Var10 = this.f150811i;
        if (h1Var10 == null || i17 < 0 || i17 >= h1Var10.e()) {
            return;
        }
        java.lang.String str = h1Var10.d(i17).f319168b;
        kotlin.jvm.internal.o.d(str);
        e(i17, str);
    }

    public final void setLyricObj(ll3.h1 lyricObj) {
        kotlin.jvm.internal.o.g(lyricObj, "lyricObj");
        setText("");
        this.f150820u = false;
        removeCallbacks(this.f150817r);
        removeCallbacks(this.f150815p);
        this.f150809g.startScroll(0, 0, 0, 0, 0);
        this.f150811i = lyricObj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeLyricView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.Scroller scroller = new android.widget.Scroller(getContext(), new android.view.animation.LinearInterpolator());
        this.f150809g = scroller;
        this.f150810h = -getWidth();
        this.f150815p = new wl3.b(this);
        this.f150816q = 200L;
        this.f150817r = new wl3.a(this);
        this.f150818s = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc);
        this.f150819t = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477784bd);
        this.f150821v = -1;
        setScroller(scroller);
        setHorizontallyScrolling(true);
    }
}
