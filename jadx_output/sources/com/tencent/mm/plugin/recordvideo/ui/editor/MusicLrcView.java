package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/MusicLrcView;", "Landroid/widget/TextView;", "", "d", "Z", "isRunningShow", "()Z", "setRunningShow", "(Z)V", "", "f", "I", "getRndDuration", "()I", "setRndDuration", "(I)V", "rndDuration", "g", "getDefaultXPaused", "setDefaultXPaused", "defaultXPaused", "m", "getScrollFirstDelay", "setScrollFirstDelay", "scrollFirstDelay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "wu3/w1", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicLrcView extends android.widget.TextView {

    /* renamed from: o, reason: collision with root package name */
    public static final wu3.w1 f156056o = new wu3.w1(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isRunningShow;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Scroller f156058e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int rndDuration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int defaultXPaused;

    /* renamed from: h, reason: collision with root package name */
    public int f156061h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f156062i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int scrollFirstDelay;

    /* renamed from: n, reason: collision with root package name */
    public final int f156064n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicLrcView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int a() {
        android.text.TextPaint paint = getPaint();
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String obj = getText().toString();
        paint.getTextBounds(obj, 0, obj.length(), rect);
        return rect.width() > 0 ? rect.width() : getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L76
            boolean r0 = r5.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r5.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            wt3.h r3 = (wt3.h) r3
            java.lang.String r3 = r3.f449421a
            r0.append(r3)
            java.lang.String r3 = "  "
            r0.append(r3)
            goto L13
        L2a:
            if (r6 == 0) goto L56
            int r2 = r6.length()
            r3 = 0
            if (r2 <= 0) goto L34
            goto L35
        L34:
            r1 = r3
        L35:
            if (r1 == 0) goto L56
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            boolean r1 = r26.n0.B(r1, r6, r3)
            if (r1 == 0) goto L56
            wu3.w1 r1 = com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView.f156056o
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.o.f(r0, r2)
            int r2 = r4.f156064n
            java.lang.CharSequence r6 = r1.a(r0, r6, r2)
            goto L5a
        L56:
            java.lang.String r6 = r0.toString()
        L5a:
            r4.setText(r6)
            java.lang.Object r6 = kz5.n0.i0(r5)
            wt3.h r6 = (wt3.h) r6
            int r6 = r6.f449423c
            java.lang.Object r5 = kz5.n0.X(r5)
            wt3.h r5 = (wt3.h) r5
            int r5 = r5.f449422b
            int r6 = r6 - r5
            r4.rndDuration = r6
            if (r6 > 0) goto L76
            r5 = 10000(0x2710, float:1.4013E-41)
            r4.rndDuration = r5
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView.b(java.util.ArrayList, java.lang.String):void");
    }

    public final void c() {
        if (this.isRunningShow) {
            setHorizontallyScrolling(true);
            if (this.f156058e == null) {
                android.widget.Scroller scroller = new android.widget.Scroller(getContext(), new android.view.animation.LinearInterpolator());
                this.f156058e = scroller;
                setScroller(scroller);
            }
            int a17 = a();
            int i17 = a17 - ((this.f156061h * 3) / 4);
            if (i17 != 0) {
                int i18 = this.rndDuration;
                int i19 = (int) ((i18 * i17) / a17);
                int i27 = i19 > 0 ? i19 : i18;
                if (this.f156062i) {
                    postDelayed(new wu3.x1(this, i17, i27), this.scrollFirstDelay);
                    return;
                }
                android.widget.Scroller scroller2 = this.f156058e;
                kotlin.jvm.internal.o.d(scroller2);
                scroller2.startScroll(this.f156061h, 0, i17, 0, i27);
                invalidate();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        super.computeScroll();
        android.widget.Scroller scroller = this.f156058e;
        if (scroller == null) {
            return;
        }
        kotlin.jvm.internal.o.d(scroller);
        if (scroller.isFinished()) {
            this.f156061h = this.defaultXPaused;
            this.f156062i = false;
            c();
        }
    }

    public final void d(boolean z17, int i17) {
        this.isRunningShow = z17;
        if (!z17) {
            android.widget.Scroller scroller = this.f156058e;
            if (scroller == null) {
                return;
            }
            scroller.startScroll(0, 0, 0, 0, 0);
            return;
        }
        if (z17) {
            if (i17 == -1) {
                i17 = getWidth();
            }
            this.f156061h = i17;
            this.f156062i = true;
            c();
        }
    }

    public final int getDefaultXPaused() {
        return this.defaultXPaused;
    }

    public final int getRndDuration() {
        return this.rndDuration;
    }

    public final int getScrollFirstDelay() {
        return this.scrollFirstDelay;
    }

    public final void setDefaultXPaused(int i17) {
        this.defaultXPaused = i17;
    }

    public final void setRndDuration(int i17) {
        this.rndDuration = i17;
    }

    public final void setRunningShow(boolean z17) {
        this.isRunningShow = z17;
    }

    public final void setScrollFirstDelay(int i17) {
        this.scrollFirstDelay = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicLrcView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.rndDuration = 10000;
        int i18 = -getWidth();
        this.defaultXPaused = i18;
        this.f156061h = i18;
        this.f156062i = true;
        this.f156064n = i65.a.d(context, com.tencent.mm.R.color.a9x);
    }
}
