package com.tencent.mm.plugin.mv.ui.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002&5B'\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR*\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR*\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010%\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00066"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/RangeSliderView;", "Landroid/widget/FrameLayout;", "", "value", "d", "I", "getStart", "()I", "setStart", "(I)V", "start", "e", "getEnd", "setEnd", "end", "f", "getProgress", "setProgress", "progress", "g", "getMinWidth", "setMinWidth", "minWidth", "h", "getMaxEnd", "setMaxEnd", "maxEnd", "", "i", "Z", "isActive", "()Z", "setActive", "(Z)V", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "getKeepSizeOnStartChanged", "setKeepSizeOnStartChanged", "keepSizeOnStartChanged", "Lsm3/b0;", "F", "Lsm3/b0;", "getCallback", "()Lsm3/b0;", "setCallback", "(Lsm3/b0;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sm3/c0", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RangeSliderView extends android.widget.FrameLayout {
    public android.util.Range A;
    public final int[] B;
    public androidx.recyclerview.widget.RecyclerView C;
    public int D;

    /* renamed from: E, reason: from kotlin metadata */
    public boolean keepSizeOnStartChanged;

    /* renamed from: F, reason: from kotlin metadata */
    public sm3.b0 callback;
    public float G;
    public kotlinx.coroutines.r2 H;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int start;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int end;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int minWidth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int maxEnd;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isActive;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f152037m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f152038n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f152039o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f152040p;

    /* renamed from: q, reason: collision with root package name */
    public final int f152041q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f152042r;

    /* renamed from: s, reason: collision with root package name */
    public float f152043s;

    /* renamed from: t, reason: collision with root package name */
    public int f152044t;

    /* renamed from: u, reason: collision with root package name */
    public int f152045u;

    /* renamed from: v, reason: collision with root package name */
    public sm3.c0 f152046v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f152047w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Path f152048x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.RectF f152049y;

    /* renamed from: z, reason: collision with root package name */
    public final float f152050z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSliderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int a(int i17) {
        return (int) (getResources().getDisplayMetrics().density * i17);
    }

    public final boolean b(int i17, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        sm3.c0 c0Var = this.f152046v;
        if (c0Var == sm3.c0.f409839e) {
            int f17 = e06.p.f(this.f152044t + i17, 0, this.end - this.minWidth);
            int i18 = this.start;
            if (f17 != i18) {
                setStart(f17);
                sm3.b0 b0Var = this.callback;
                if (b0Var != null) {
                    sm3.m mVar = (sm3.m) b0Var;
                    sm3.o oVar = mVar.f409888a;
                    long widthPerMills = f17 / oVar.f409897e.getWidthPerMills();
                    sm3.q qVar = (sm3.q) oVar.f409896d;
                    qVar.getClass();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTrackStartChanged: index=");
                    int i19 = mVar.f409889b;
                    sb6.append(i19);
                    sb6.append(", time=");
                    sb6.append(widthPerMills);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", sb6.toString());
                    sm3.u callback = qVar.f409903a.getCallback();
                    if (callback != null) {
                        ((mm3.h) callback).b(i19, widthPerMills);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksAdapter", "onRangeStartChanged: " + f17);
                }
                this.f152047w = false;
                if (z17) {
                    c(f17 - i18);
                } else if (!this.keepSizeOnStartChanged && (recyclerView = this.C) != null) {
                    recyclerView.scrollBy(-(f17 - i18), 0);
                }
                return true;
            }
            if (!this.f152047w && (i18 == 0 || this.end - i18 <= this.minWidth)) {
                performHapticFeedback(0, 2);
                this.f152047w = true;
            }
        } else if (c0Var == sm3.c0.f409840f) {
            int f18 = e06.p.f(this.f152045u + i17, this.start + this.minWidth, this.maxEnd);
            int i27 = this.end;
            if (f18 != i27) {
                setEnd(f18);
                sm3.b0 b0Var2 = this.callback;
                if (b0Var2 != null) {
                    sm3.m mVar2 = (sm3.m) b0Var2;
                    float f19 = mVar2.f409890c.f310116d + f18;
                    sm3.o oVar2 = mVar2.f409888a;
                    long widthPerMills2 = f19 / oVar2.f409897e.getWidthPerMills();
                    sm3.q qVar2 = (sm3.q) oVar2.f409896d;
                    qVar2.getClass();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onTrackEndChanged: index=");
                    int i28 = mVar2.f409889b;
                    sb7.append(i28);
                    sb7.append(", time=");
                    sb7.append(widthPerMills2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", sb7.toString());
                    sm3.u callback2 = qVar2.f409903a.getCallback();
                    if (callback2 != null) {
                        ((mm3.h) callback2).b(i28, widthPerMills2);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksAdapter", "onRangeEndChanged: " + f18);
                }
                this.f152047w = false;
                if (z17) {
                    c(f18 - i27);
                }
                return true;
            }
            if (!this.f152047w && (i27 >= this.maxEnd || i27 - this.start <= this.minWidth)) {
                performHapticFeedback(0, 2);
                this.f152047w = true;
            }
        }
        return false;
    }

    public final void c(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
        if (recyclerView != null) {
            if (i17 < 0) {
                if (this.f152046v == sm3.c0.f409839e) {
                    recyclerView.setTranslationX(recyclerView.getTranslationX() + (-i17));
                } else {
                    recyclerView.scrollBy(i17, 0);
                }
            } else if (recyclerView.getTranslationX() > 0.0f) {
                recyclerView.setTranslationX(recyclerView.getTranslationX() + (-i17));
            } else {
                recyclerView.scrollBy(i17, 0);
            }
            this.D += i17;
        }
    }

    public final boolean d() {
        return this.f152046v == sm3.c0.f409839e && this.keepSizeOnStartChanged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.f152048x);
        if (d()) {
            canvas.translate(-this.f152044t, 0.0f);
        } else {
            canvas.translate(-this.start, 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.isActive) {
            if (this.f152046v == sm3.c0.f409838d) {
                int i17 = this.progress;
                int i18 = this.start;
                canvas.drawRect(i17 - i18, 0.0f, (i17 - i18) + this.f152041q, canvas.getHeight(), this.f152040p);
            }
            android.graphics.drawable.Drawable drawable = this.f152037m;
            float f17 = drawable.getBounds().right;
            float f18 = -this.f152042r.top;
            android.graphics.drawable.Drawable drawable2 = this.f152038n;
            float f19 = drawable2.getBounds().left;
            android.graphics.Paint paint = this.f152039o;
            canvas.drawRect(f17, f18, f19, 0.0f, paint);
            canvas.drawRect(drawable.getBounds().right, canvas.getHeight(), drawable2.getBounds().left, r7.bottom + canvas.getHeight(), paint);
            drawable.draw(canvas);
            drawable2.draw(canvas);
        }
    }

    public final sm3.b0 getCallback() {
        return this.callback;
    }

    public final int getEnd() {
        return this.end;
    }

    public final boolean getKeepSizeOnStartChanged() {
        return this.keepSizeOnStartChanged;
    }

    public final int getMaxEnd() {
        return this.maxEnd;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStart() {
        return this.start;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000f, code lost:
    
        r0 = null;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r2 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Le
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L25
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L1a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r2.C = r0
            return
        L1a:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Le
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Lf
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RangeSliderView should be used inside a RecyclerView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.widget.RangeSliderView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kotlinx.coroutines.r2 r2Var = this.H;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.H = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i27 - i18;
        boolean d17 = d();
        android.graphics.RectF rectF = this.f152049y;
        if (d17) {
            int i29 = this.start;
            int i37 = this.f152044t;
            rectF.left = i29 - i37;
            rectF.right = this.end - i37;
        } else {
            rectF.left = 0.0f;
            rectF.right = this.end - this.start;
        }
        rectF.top = 0.0f;
        rectF.bottom = i28;
        android.graphics.Path path = this.f152048x;
        path.reset();
        float f17 = this.f152050z;
        path.addRoundRect(rectF, new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, android.graphics.Path.Direction.CW);
        android.graphics.Rect rect = this.f152042r;
        float f18 = rect.top + i28 + rect.bottom;
        android.graphics.drawable.Drawable drawable = this.f152037m;
        int intrinsicHeight = (int) ((f18 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
        if (d()) {
            int i38 = this.start;
            int i39 = this.f152044t;
            drawable.setBounds((i38 - i39) - rect.left, -rect.top, (i38 - i39) + intrinsicHeight, rect.bottom + i28);
        } else {
            drawable.setBounds(-rect.left, -rect.top, intrinsicHeight, rect.bottom + i28);
        }
        android.graphics.drawable.Drawable drawable2 = this.f152038n;
        int intrinsicHeight2 = (int) ((f18 / drawable2.getIntrinsicHeight()) * drawable2.getIntrinsicWidth());
        if (d()) {
            int i47 = this.end;
            int i48 = this.f152044t;
            drawable2.setBounds((i47 - i48) - intrinsicHeight2, -rect.top, (i47 - i48) + rect.right, i28 + rect.bottom);
        } else {
            int i49 = this.end;
            int i57 = this.start;
            drawable2.setBounds((i49 - i57) - intrinsicHeight2, -rect.top, (i49 - i57) + rect.right, i28 + rect.bottom);
        }
        android.view.View childAt = getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.widget.MvFrameListView");
        com.tencent.mm.plugin.mv.ui.widget.MvFrameListView mvFrameListView = (com.tencent.mm.plugin.mv.ui.widget.MvFrameListView) childAt;
        mvFrameListView.setDrawStart(this.start);
        mvFrameListView.setDrawEnd(this.end);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (d()) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.end - this.f152044t, 1073741824), i18);
        } else {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.end - this.start, 1073741824), i18);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C;
        if (recyclerView != null) {
            recyclerView.getLocationOnScreen(this.B);
            this.A = new android.util.Range(java.lang.Float.valueOf(r5[0] + (getResources().getDisplayMetrics().density * 40.0f)), java.lang.Float.valueOf((r5[0] + recyclerView.getWidth()) - (getResources().getDisplayMetrics().density * 40.0f)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r1 != 3) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.widget.RangeSliderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setActive(boolean z17) {
        this.isActive = z17;
        invalidate();
    }

    public final void setCallback(sm3.b0 b0Var) {
        this.callback = b0Var;
    }

    public final void setEnd(int i17) {
        if (i17 < 0) {
            this.end = 0;
        } else {
            this.end = i17;
        }
        requestLayout();
    }

    public final void setKeepSizeOnStartChanged(boolean z17) {
        this.keepSizeOnStartChanged = z17;
    }

    public final void setMaxEnd(int i17) {
        this.maxEnd = i17;
    }

    public final void setMinWidth(int i17) {
        this.minWidth = i17;
    }

    public final void setProgress(int i17) {
        this.progress = e06.p.f(i17, this.start, this.end);
        postInvalidate();
    }

    public final void setStart(int i17) {
        if (i17 < 0) {
            this.start = 0;
        } else {
            this.start = i17;
        }
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f152037m = new android.graphics.drawable.BitmapDrawable(getResources(), com.tencent.mm.sdk.platformtools.x.d0(com.tencent.mm.R.raw.music_mv_slider_left_bar, getResources().getDisplayMetrics().density));
        this.f152038n = new android.graphics.drawable.BitmapDrawable(getResources(), com.tencent.mm.sdk.platformtools.x.d0(com.tencent.mm.R.raw.music_mv_slider_right_bar, getResources().getDisplayMetrics().density));
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f152039o = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(-1761607681);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f152040p = paint2;
        this.f152041q = a(2);
        this.f152042r = new android.graphics.Rect(a(2), a(2), a(2), a(2));
        this.f152043s = -1.0f;
        this.f152046v = sm3.c0.f409838d;
        this.f152048x = new android.graphics.Path();
        this.f152049y = new android.graphics.RectF();
        this.f152050z = getResources().getDisplayMetrics().density * 4.0f;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        this.A = new android.util.Range(valueOf, valueOf);
        this.B = new int[2];
        setClipToPadding(false);
        setClipChildren(false);
    }
}
