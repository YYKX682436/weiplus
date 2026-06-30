package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes3.dex */
public class MovingImageButton extends android.widget.ImageView implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f187053d;

    /* renamed from: e, reason: collision with root package name */
    public int f187054e;

    /* renamed from: f, reason: collision with root package name */
    public int f187055f;

    /* renamed from: g, reason: collision with root package name */
    public int f187056g;

    /* renamed from: h, reason: collision with root package name */
    public int f187057h;

    /* renamed from: i, reason: collision with root package name */
    public int f187058i;

    /* renamed from: m, reason: collision with root package name */
    public int f187059m;

    /* renamed from: n, reason: collision with root package name */
    public int f187060n;

    /* renamed from: o, reason: collision with root package name */
    public int f187061o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup.MarginLayoutParams f187062p;

    /* renamed from: q, reason: collision with root package name */
    public int f187063q;

    /* renamed from: r, reason: collision with root package name */
    public int f187064r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f187065s;

    public MovingImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187060n = 0;
        this.f187061o = 0;
        this.f187065s = true;
        this.f187053d = context;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.content.Context context = this.f187053d;
        this.f187063q = i65.a.b(context, 100);
        i65.a.B(context);
        i65.a.k(context);
        this.f187064r = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f187065s) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f187060n == 0 || this.f187061o == 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            getWindowVisibleDisplayFrame(rect);
            this.f187060n = rect.right - rect.left;
            this.f187061o = rect.bottom - rect.top;
        }
        this.f187054e = (int) motionEvent.getRawX();
        this.f187055f = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f187058i = this.f187054e;
            this.f187059m = this.f187055f;
        } else if (action != 1) {
            if (action == 2) {
                int i17 = this.f187054e - this.f187056g;
                int i18 = this.f187055f - this.f187057h;
                if (i17 != 0 || i18 != 0) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
                    this.f187062p = marginLayoutParams;
                    int i19 = marginLayoutParams.rightMargin + (-i17);
                    marginLayoutParams.rightMargin = i19;
                    marginLayoutParams.topMargin += i18;
                    if (i19 < 0) {
                        marginLayoutParams.rightMargin = 0;
                    } else if (i19 > this.f187060n - getWidth()) {
                        this.f187062p.rightMargin = this.f187060n - getWidth();
                    }
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = this.f187062p;
                    int i27 = marginLayoutParams2.topMargin;
                    if (i27 < 0) {
                        marginLayoutParams2.topMargin = 0;
                    } else if (i27 > this.f187061o - getHeight()) {
                        this.f187062p.topMargin = this.f187061o - getHeight();
                    }
                    requestLayout();
                }
            }
        } else if (java.lang.Math.abs(this.f187058i - this.f187054e) + java.lang.Math.abs(this.f187059m - this.f187055f) > this.f187064r) {
            int i28 = this.f187055f;
            int i29 = this.f187063q;
            if (i28 < i29) {
                this.f187062p.topMargin = 0;
            } else {
                int i37 = this.f187061o;
                if (i28 > i37 - i29) {
                    this.f187062p.topMargin = i37 - getHeight();
                } else {
                    int i38 = this.f187054e;
                    int i39 = this.f187060n;
                    if (i38 > i39 / 2) {
                        this.f187062p.rightMargin = 0;
                    } else {
                        this.f187062p.rightMargin = i39 - getWidth();
                    }
                }
            }
            requestLayout();
        } else {
            performClick();
        }
        this.f187056g = this.f187054e;
        this.f187057h = this.f187055f;
        return true;
    }

    public void setCanMove(boolean z17) {
        this.f187065s = z17;
    }

    public MovingImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f187060n = 0;
        this.f187061o = 0;
        this.f187065s = true;
        this.f187053d = context;
    }
}
