package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class GameCenterListView extends android.widget.ListView implements xn5.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f140706q;

    /* renamed from: r, reason: collision with root package name */
    public static int f140707r;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140708d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f140709e;

    /* renamed from: f, reason: collision with root package name */
    public float f140710f;

    /* renamed from: g, reason: collision with root package name */
    public int f140711g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f140712h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f140713i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Scroller f140714m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f140715n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f140716o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f140717p;

    public GameCenterListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140708d = context;
    }

    public static void setCanPulldown(boolean z17) {
        f140706q = z17;
    }

    public static void setDefaultPadding(int i17) {
        f140707r = i17;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f140717p != null && this.f140714m.computeScrollOffset()) {
            this.f140717p.setPadding(0, this.f140714m.getCurrY(), 0, 0);
            int i17 = (int) (((r1 - r0) / f140707r) * 255.0f);
            this.f140716o.setAlpha(255 - i17);
            this.f140715n.setAlpha(i17);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (!f140706q || this.f140717p == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f140713i = false;
            this.f140710f = motionEvent.getRawY();
        } else if (action == 2 && this.f140712h) {
            if (this.f140713i) {
                return true;
            }
            int rawY = (int) (motionEvent.getRawY() - this.f140710f);
            if (this.f140717p.getPaddingTop() <= f140707r + this.f140711g) {
                if (rawY > 0 && java.lang.Math.abs(rawY) >= this.f140711g) {
                    this.f140713i = true;
                    this.f140714m.startScroll(0, this.f140717p.getPaddingTop(), 0, -this.f140717p.getPaddingTop(), 500);
                    this.f140715n.setClickable(true);
                    invalidate();
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            } else if (this.f140717p.getPaddingTop() >= (-this.f140711g) && rawY < 0 && java.lang.Math.abs(rawY) >= this.f140711g) {
                this.f140713i = true;
                this.f140714m.startScroll(0, 0, 0, f140707r, 500);
                invalidate();
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.content.Context context = this.f140708d;
        this.f140711g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f140714m = new android.widget.Scroller(context);
        super.setOnScrollListener(new com.tencent.mm.plugin.game.ui.i0(this));
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (!z17 || this.f140709e) {
            return;
        }
        android.view.View childAt = getChildAt(0);
        this.f140717p = childAt;
        this.f140716o = (android.widget.ImageView) childAt.findViewById(com.tencent.mm.R.id.n0h);
        this.f140715n = (android.widget.ImageView) this.f140717p.findViewById(com.tencent.mm.R.id.ahg);
        this.f140709e = true;
    }
}
