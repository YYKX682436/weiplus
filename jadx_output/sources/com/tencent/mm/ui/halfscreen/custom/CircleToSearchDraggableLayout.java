package com.tencent.mm.ui.halfscreen.custom;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00013B\u001d\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102R8\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/CircleToSearchDraggableLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function2;", "", "Ljz5/f0;", "d", "Lyz5/p;", "getDragStatusBlock", "()Lyz5/p;", "setDragStatusBlock", "(Lyz5/p;)V", "dragStatusBlock", "", "e", "F", "getCurVisiblePercent", "()F", "setCurVisiblePercent", "(F)V", "curVisiblePercent", "Lkotlin/Function0;", "", "n", "Lyz5/a;", "getDragFinishInterceptor", "()Lyz5/a;", "setDragFinishInterceptor", "(Lyz5/a;)V", "dragFinishInterceptor", "Lkotlin/Function1;", "o", "Lyz5/l;", "getDragTranslationListener", "()Lyz5/l;", "setDragTranslationListener", "(Lyz5/l;)V", "dragTranslationListener", "p", "getDragFullScreenListener", "setDragFullScreenListener", "dragFullScreenListener", "", "getMDialogHeight", "()I", "mDialogHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ch5/f", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CircleToSearchDraggableLayout extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f208826q = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.p dragStatusBlock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float curVisiblePercent;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f208829f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f208830g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.customview.widget.l f208831h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f208832i;

    /* renamed from: m, reason: collision with root package name */
    public int f208833m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.a dragFinishInterceptor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public yz5.l dragTranslationListener;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public yz5.a dragFullScreenListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleToSearchDraggableLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f208830g = (android.app.Activity) context;
        this.f208831h = new androidx.customview.widget.l(getContext(), this, new ch5.f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMDialogHeight() {
        return getHeight();
    }

    public final void b(float f17, float f18, yz5.a aVar) {
        yz5.p pVar = this.dragStatusBlock;
        if (pVar != null) {
            pVar.invoke("STATE_WILL_CHANGE_HEIGHT", java.lang.String.valueOf(this.curVisiblePercent));
        }
        int b17 = a06.d.b(getMDialogHeight() * f17);
        android.view.View view = this.f208829f;
        if (view != null) {
            pm0.v.X(new ch5.j(view.getTop(), getMDialogHeight() - b17, a06.d.c(f18 * 1000), this, null, new ch5.g(this, f17, aVar)));
        }
    }

    public final boolean c(android.view.View view, int i17, int i18) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i19 = iArr[0];
        int i27 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i19;
        int measuredHeight = view.getMeasuredHeight() + i27;
        if (i19 <= i17 && i17 <= measuredWidth) {
            if (i27 <= i18 && i18 <= measuredHeight) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        androidx.customview.widget.l lVar = this.f208831h;
        boolean z17 = false;
        if (lVar != null && lVar.h(true)) {
            z17 = true;
        }
        if (z17) {
            invalidate();
        }
    }

    public final float getCurVisiblePercent() {
        return this.curVisiblePercent;
    }

    public final yz5.a getDragFinishInterceptor() {
        return this.dragFinishInterceptor;
    }

    public final yz5.a getDragFullScreenListener() {
        return this.dragFullScreenListener;
    }

    public final yz5.p getDragStatusBlock() {
        return this.dragStatusBlock;
    }

    public final yz5.l getDragTranslationListener() {
        return this.dragTranslationListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        androidx.customview.widget.l lVar;
        kotlin.jvm.internal.o.g(event, "event");
        if (!c(this.f208829f, (int) event.getRawX(), (int) event.getRawY())) {
            return true;
        }
        if ((this.curVisiblePercent <= 0.9d || event.getY() < ym5.x.a(getContext(), 168.0f)) && (lVar = this.f208831h) != null) {
            return lVar.t(event);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View view = this.f208829f;
        if (view != null) {
            view.offsetTopAndBottom(this.f208833m);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (c(this.f208829f, (int) event.getRawX(), (int) event.getRawY())) {
            try {
                androidx.customview.widget.l lVar = this.f208831h;
                if (lVar == null) {
                    return true;
                }
                lVar.m(event);
                return true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("CircleToSearchDraggableLayout", th6, "", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public final void setCurVisiblePercent(float f17) {
        this.curVisiblePercent = f17;
    }

    public final void setDragFinishInterceptor(yz5.a aVar) {
        this.dragFinishInterceptor = aVar;
    }

    public final void setDragFullScreenListener(yz5.a aVar) {
        this.dragFullScreenListener = aVar;
    }

    public final void setDragStatusBlock(yz5.p pVar) {
        this.dragStatusBlock = pVar;
    }

    public final void setDragTranslationListener(yz5.l lVar) {
        this.dragTranslationListener = lVar;
    }
}
