package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameIndexListView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView implements xn5.a0 {

    /* renamed from: t2, reason: collision with root package name */
    public static int f140850t2 = 0;

    /* renamed from: u2, reason: collision with root package name */
    public static boolean f140851u2 = true;

    /* renamed from: v2, reason: collision with root package name */
    public static int f140852v2;

    /* renamed from: w2, reason: collision with root package name */
    public static int f140853w2;

    /* renamed from: x2, reason: collision with root package name */
    public static boolean f140854x2;

    /* renamed from: i2, reason: collision with root package name */
    public final android.content.Context f140855i2;

    /* renamed from: j2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.u3 f140856j2;

    /* renamed from: k2, reason: collision with root package name */
    public m53.y1 f140857k2;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f140858l2;

    /* renamed from: m2, reason: collision with root package name */
    public android.widget.Scroller f140859m2;

    /* renamed from: n2, reason: collision with root package name */
    public android.widget.ImageView f140860n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.widget.ImageView f140861o2;

    /* renamed from: p2, reason: collision with root package name */
    public android.view.View f140862p2;

    /* renamed from: q2, reason: collision with root package name */
    public float f140863q2;

    /* renamed from: r2, reason: collision with root package name */
    public int f140864r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f140865s2;

    public GameIndexListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140858l2 = true;
        this.f140855i2 = context;
    }

    public static int getSourceScene() {
        return f140850t2;
    }

    public static void setCanPulldown(boolean z17) {
        f140854x2 = z17;
    }

    public static void setDefaultPadding(int i17) {
        f140852v2 = i17;
    }

    public static void setInitPadding(int i17) {
        f140853w2 = i17;
        f140851u2 = true;
    }

    public static void setSourceScene(int i17) {
        f140850t2 = i17;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f140862p2 != null && this.f140859m2.computeScrollOffset()) {
            this.f140862p2.setPadding(0, this.f140859m2.getCurrY(), 0, 0);
            int i17 = (int) (((r1 - r0) / f140852v2) * 255.0f);
            this.f140861o2.setAlpha(255 - i17);
            this.f140860n2.setAlpha(i17);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        if (!f140854x2 || this.f140862p2 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        boolean z17 = false;
        if (action == 0) {
            this.f140865s2 = false;
            this.f140863q2 = motionEvent.getRawY();
        } else if (action == 2) {
            if (((androidx.recyclerview.widget.LinearLayoutManager) getLayoutManager()).w() == 0 && (view = this.f140862p2) != null && view.getTop() == 0) {
                z17 = true;
            }
            if (z17) {
                if (this.f140865s2) {
                    return true;
                }
                int rawY = (int) (motionEvent.getRawY() - this.f140863q2);
                if (this.f140862p2.getPaddingTop() <= f140852v2 + this.f140864r2) {
                    if (rawY > 0 && java.lang.Math.abs(rawY) >= this.f140864r2) {
                        this.f140865s2 = true;
                        this.f140859m2.startScroll(0, this.f140862p2.getPaddingTop(), 0, -this.f140862p2.getPaddingTop(), 500);
                        this.f140860n2.setClickable(true);
                        invalidate();
                        motionEvent.setAction(3);
                        super.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                } else if (this.f140862p2.getPaddingTop() >= (-this.f140864r2) && rawY < 0 && java.lang.Math.abs(rawY) >= this.f140864r2) {
                    this.f140865s2 = true;
                    this.f140859m2.startScroll(0, 0, 0, f140852v2, 500);
                    invalidate();
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n1() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        m53.x1 x1Var = new m53.x1();
        m53.y1 y1Var = this.f140857k2;
        x1Var.f324168d = y1Var != null ? y1Var.f324201e : null;
        lVar.f70664a = x1Var;
        lVar.f70665b = new m53.y1();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getgameindex4feedslist";
        lVar.f70667d = 2943;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.plugin.game.ui.r3 r3Var = new com.tencent.mm.plugin.game.ui.r3(this);
        java.lang.Object obj = this.f140855i2;
        com.tencent.mm.modelbase.z2.e(a17, r3Var, false, obj instanceof im5.b ? (im5.b) obj : null);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.content.Context context = this.f140855i2;
        this.f140864r2 = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f140859m2 = new android.widget.Scroller(context);
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        com.tencent.mm.plugin.game.ui.u3 u3Var = new com.tencent.mm.plugin.game.ui.u3(this);
        this.f140856j2 = u3Var;
        setAdapter(u3Var);
        N(new com.tencent.mm.plugin.game.ui.s3(this, getResources(), com.tencent.mm.R.color.f479168rs));
        setLoadingView(com.tencent.mm.R.layout.bfv);
        setOnLoadingStateChangedListener(new com.tencent.mm.plugin.game.ui.q3(this));
        m1(true);
        n1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (f140851u2 || this.f140862p2 == null || this.f140861o2 == null || this.f140860n2 == null) {
            android.view.View childAt = getChildAt(0);
            this.f140862p2 = childAt;
            if (childAt != null) {
                childAt.setPadding(0, f140853w2, 0, 0);
                this.f140861o2 = (android.widget.ImageView) this.f140862p2.findViewById(com.tencent.mm.R.id.n0h);
                this.f140860n2 = (android.widget.ImageView) this.f140862p2.findViewById(com.tencent.mm.R.id.ahg);
            }
            f140851u2 = false;
        }
    }
}
