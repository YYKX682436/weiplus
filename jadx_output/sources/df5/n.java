package df5;

/* loaded from: classes14.dex */
public class n extends android.widget.HorizontalScrollView {

    /* renamed from: d, reason: collision with root package name */
    public final int f232168d;

    /* renamed from: e, reason: collision with root package name */
    public float f232169e;

    /* renamed from: f, reason: collision with root package name */
    public float f232170f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f232171g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f232172h;

    /* renamed from: i, reason: collision with root package name */
    public final int f232173i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f232174m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f232175n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f232176o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.LinearGradient f232177p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.LinearGradient f232178q;

    /* renamed from: r, reason: collision with root package name */
    public int f232179r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f232168d = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        android.view.ViewConfiguration.getLongPressTimeout();
        this.f232172h = new df5.m(this);
        this.f232173i = i65.a.b(context, 16);
        this.f232174m = new android.graphics.Paint(1);
        this.f232175n = new android.graphics.RectF();
        this.f232176o = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT);
        setHorizontalFadingEdgeEnabled(false);
        setWillNotDraw(false);
    }

    public final boolean a() {
        android.view.View childAt = getChildAt(0);
        return childAt != null && childAt.getWidth() > (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (!a()) {
            super.dispatchDraw(canvas);
            return;
        }
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int width = (childAt.getWidth() - getWidth()) + getPaddingLeft() + getPaddingRight();
        if (width <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        int i17 = this.f232179r;
        int i18 = this.f232173i;
        if (i17 != i18 || this.f232177p == null) {
            this.f232179r = i18;
            float f17 = i18;
            this.f232177p = new android.graphics.LinearGradient(0.0f, 0.0f, f17, 0.0f, -16777216, 0, android.graphics.Shader.TileMode.CLAMP);
            this.f232178q = new android.graphics.LinearGradient(0.0f, 0.0f, f17, 0.0f, 0, -16777216, android.graphics.Shader.TileMode.CLAMP);
        }
        int scrollX = getScrollX();
        boolean z17 = scrollX > 0;
        boolean z18 = scrollX < width;
        if (!z17 && !z18) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.RectF rectF = this.f232175n;
        float f18 = scrollX;
        rectF.set(f18, 0.0f, getWidth() + scrollX, getHeight());
        int saveLayer = canvas.saveLayer(rectF, null);
        super.dispatchDraw(canvas);
        android.graphics.Paint paint = this.f232174m;
        paint.setXfermode(this.f232176o);
        if (z17) {
            int save = canvas.save();
            canvas.translate(f18, 0.0f);
            paint.setShader(this.f232177p);
            canvas.drawRect(0.0f, 0.0f, i18, getHeight(), paint);
            canvas.restoreToCount(save);
        }
        if (z18) {
            int save2 = canvas.save();
            canvas.translate((scrollX + getWidth()) - i18, 0.0f);
            paint.setShader(this.f232178q);
            canvas.drawRect(0.0f, 0.0f, i18, getHeight(), paint);
            canvas.restoreToCount(save2);
        }
        paint.setXfermode(null);
        paint.setShader(null);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (!a()) {
            return false;
        }
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f232169e = ev6.getX();
            this.f232170f = ev6.getY();
            this.f232171g = false;
            super.onInterceptTouchEvent(ev6);
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        float abs = java.lang.Math.abs(ev6.getX() - this.f232169e);
        float abs2 = java.lang.Math.abs(ev6.getY() - this.f232170f);
        if (abs <= this.f232168d || abs <= abs2) {
            return false;
        }
        this.f232171g = true;
        android.os.Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f232172h);
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(ev6.getDownTime(), ev6.getEventTime(), 0, this.f232169e, this.f232170f, 0);
        super.onTouchEvent(obtain);
        obtain.recycle();
        return true;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout;
        super.onScrollChanged(i17, i18, i19, i27);
        java.lang.Object parent = getParent();
        while (true) {
            if (!(parent instanceof android.view.View)) {
                nativeSelectableLayout = null;
                break;
            } else {
                if (parent instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout) {
                    nativeSelectableLayout = (com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout) parent;
                    break;
                }
                parent = ((android.view.View) parent).getParent();
            }
        }
        if (nativeSelectableLayout != null && nativeSelectableLayout.f204669p) {
            nativeSelectableLayout.removeCallbacks(nativeSelectableLayout.H);
            if (nativeSelectableLayout.f204673t == null) {
                nativeSelectableLayout.G = true;
                nativeSelectableLayout.k();
                java.lang.Runnable runnable = nativeSelectableLayout.V;
                nativeSelectableLayout.removeCallbacks(runnable);
                nativeSelectableLayout.postDelayed(runnable, 120L);
            }
            nativeSelectableLayout.v();
        }
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (a()) {
            return super.onTouchEvent(ev6);
        }
        return false;
    }
}
