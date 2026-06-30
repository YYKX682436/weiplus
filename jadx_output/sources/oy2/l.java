package oy2;

/* loaded from: classes8.dex */
public final class l extends android.widget.FrameLayout implements oy2.m {
    public int A;
    public int B;
    public int C;
    public int D;
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a E;
    public oy2.n F;

    /* renamed from: d, reason: collision with root package name */
    public final oy2.p f349972d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f349973e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f349974f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout f349975g;

    /* renamed from: h, reason: collision with root package name */
    public final int f349976h;

    /* renamed from: i, reason: collision with root package name */
    public final int f349977i;

    /* renamed from: m, reason: collision with root package name */
    public final int f349978m;

    /* renamed from: n, reason: collision with root package name */
    public final int f349979n;

    /* renamed from: o, reason: collision with root package name */
    public final int f349980o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f349981p;

    /* renamed from: q, reason: collision with root package name */
    public final int f349982q;

    /* renamed from: r, reason: collision with root package name */
    public int f349983r;

    /* renamed from: s, reason: collision with root package name */
    public int f349984s;

    /* renamed from: t, reason: collision with root package name */
    public float f349985t;

    /* renamed from: u, reason: collision with root package name */
    public int f349986u;

    /* renamed from: v, reason: collision with root package name */
    public int f349987v;

    /* renamed from: w, reason: collision with root package name */
    public int f349988w;

    /* renamed from: x, reason: collision with root package name */
    public int f349989x;

    /* renamed from: y, reason: collision with root package name */
    public int f349990y;

    /* renamed from: z, reason: collision with root package name */
    public int f349991z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, oy2.p scConfig) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scConfig, "scConfig");
        this.f349972d = scConfig;
        this.f349973e = context;
        com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
        int a17 = e8Var.a();
        this.f349976h = a17;
        int c17 = e8Var.c(null);
        this.f349977i = c17;
        int c18 = com.tencent.mm.ui.bl.c(context);
        this.f349978m = c18;
        this.f349979n = com.tencent.mm.ui.bl.h(context);
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        this.f349980o = dimension;
        int i17 = scConfig.f349992a;
        this.f349982q = i17;
        this.f349985t = scConfig.f349993b;
        this.D = 80;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488781ae2, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f349974f = viewGroup;
        viewGroup.setOnClickListener(new oy2.j(this));
        if (i17 == 1) {
            this.f349983r = c17;
            this.f349988w = c17;
            int i18 = (int) (a17 * this.f349985t);
            this.f349986u = i18;
            this.f349984s = scConfig.f349994c ? a17 - dimension : i18;
            com.tencent.mars.xlog.Log.i("Finder.FinderScrollDialog", "screenH=" + a17 + ", navH=" + c18);
            int i19 = this.f349984s;
            this.f349987v = i19;
            int i27 = i19 - this.f349986u;
            this.f349991z = i27;
            this.B = i27;
            this.C = i27;
            this.D = 80;
        } else if (i17 == 2) {
            this.f349983r = e8Var.c(null);
            int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
            this.f349989x = dimension2;
            this.f349990y = dimension2;
            this.f349988w = this.f349983r - (dimension2 + dimension2);
            int a18 = e8Var.a() - com.tencent.mm.ui.bl.h(context);
            this.f349984s = a18;
            int i28 = (int) (this.f349988w * 1.6666666666666667d);
            this.f349987v = i28;
            if (i28 > a18) {
                this.f349987v = a18 - ((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7));
            }
            int i29 = this.f349987v;
            int i37 = (this.f349984s - i29) - ((a17 - i29) / 2);
            this.f349991z = i37;
            if (i37 < 0) {
                this.f349991z = 0;
            }
            this.B = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479649bo);
            this.D = 80;
        }
        if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aeq, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            setMContentView((com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) inflate2);
            getMContentView().setScrollDownLimit(this.B);
            getMContentView().setScrollUpLimit(this.C);
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout mContentView = getMContentView();
            kotlin.jvm.internal.o.e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            ((com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) mContentView).setPeekHeight(this.f349986u);
        } else if (i17 == 2) {
            android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488782ae3, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout");
            setMContentView((com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout) inflate3);
            getMContentView().setScrollDownLimit(this.B);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.f349987v);
        layoutParams.leftMargin = this.f349989x;
        layoutParams.rightMargin = this.f349990y;
        layoutParams.topMargin = this.f349991z;
        layoutParams.bottomMargin = this.A;
        android.view.ViewGroup viewGroup2 = this.f349974f;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
        viewGroup2.addView(getMContentView(), layoutParams);
        setCanceledOnTouchOutside(true);
    }

    private final void setCanceledOnTouchOutside(boolean z17) {
        if (z17) {
            setOnClickListener(new oy2.k(this));
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.FinderScrollDialog", "animateDismiss");
        if (this.f349982q != 1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderScrollDialog", "tobe full_fill");
            return;
        }
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout mContentView = getMContentView();
        kotlin.jvm.internal.o.e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
        ((com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) mContentView).m();
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout mContentView = getMContentView();
        kotlin.jvm.internal.o.e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout");
        if (mContentView.isAnimating) {
            com.tencent.mars.xlog.Log.w("Finder.FinderScrollDialog", "cancel return isAnimating.");
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        android.view.Window window;
        com.tencent.mars.xlog.Log.i("Finder.FinderScrollDialog", "dismiss");
        android.content.Context context = getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        android.view.KeyEvent.Callback decorView = (mMActivity == null || (window = mMActivity.getWindow()) == null) ? null : window.getDecorView();
        android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
        if (frameLayout != null) {
            frameLayout.removeView(this);
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f349981p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
    }

    @Override // oy2.m
    public android.content.Context g() {
        return this.f349973e;
    }

    public final int getBottomMargin() {
        return this.A;
    }

    public final oy2.n getCurScrollHeightListener() {
        return this.F;
    }

    public final int getDialogHeight() {
        return this.f349984s;
    }

    public final int getDialogTopMargin() {
        return this.f349980o;
    }

    public final int getDialogWidth() {
        return this.f349983r;
    }

    public final android.content.DialogInterface.OnDismissListener getDismissListener() {
        return this.f349981p;
    }

    public final int getGravity() {
        return this.D;
    }

    public final int getLeftMargin() {
        return this.f349989x;
    }

    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a getListener() {
        return this.E;
    }

    public final com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout getMContentView() {
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = this.f349975g;
        if (scrollFrameLayout != null) {
            return scrollFrameLayout;
        }
        kotlin.jvm.internal.o.o("mContentView");
        throw null;
    }

    public final int getNavigationBarHeight() {
        return this.f349978m;
    }

    public final int getPeekHeight() {
        return this.f349986u;
    }

    public final float getPeekRatio() {
        return this.f349985t;
    }

    public final int getRightMargin() {
        return this.f349990y;
    }

    public final oy2.p getScConfig() {
        return this.f349972d;
    }

    public final int getScreenHeight() {
        return this.f349976h;
    }

    public final int getScreenWidth() {
        return this.f349977i;
    }

    public final int getScrollContainerHeight() {
        return this.f349987v;
    }

    public final int getScrollContainerWidth() {
        return this.f349988w;
    }

    public final int getScrollDownLimit() {
        return this.B;
    }

    public final int getScrollUpLimit() {
        return this.C;
    }

    public final int getStatusBarHeight() {
        return this.f349979n;
    }

    public final int getStyle() {
        return this.f349982q;
    }

    public final int getTopMargin() {
        return this.f349991z;
    }

    public final android.view.Window getWindow() {
        android.content.Context context = getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            return mMActivity.getWindow();
        }
        return null;
    }

    @Override // oy2.m
    public com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout l() {
        return getMContentView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.f349984s);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = com.tencent.mm.ui.bl.g(getContext());
        android.view.View view = this.f349974f;
        if (view != null) {
            addView(view, layoutParams);
        } else {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
    }

    public final void setBottomMargin(int i17) {
        this.A = i17;
    }

    public final void setCurScrollHeightListener(oy2.n nVar) {
        if (this.f349982q == 1) {
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout mContentView = getMContentView();
            com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout expandableScrollFrameLayout = mContentView instanceof com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout ? (com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) mContentView : null;
            if (expandableScrollFrameLayout != null) {
                expandableScrollFrameLayout.setCurScrollHeightListener(nVar);
            }
        }
        this.F = nVar;
    }

    public final void setDialogHeight(int i17) {
        this.f349984s = i17;
    }

    public final void setDialogWidth(int i17) {
        this.f349983r = i17;
    }

    public final void setDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f349981p = onDismissListener;
    }

    public final void setGravity(int i17) {
        this.D = i17;
    }

    public final void setLeftMargin(int i17) {
        this.f349989x = i17;
    }

    public final void setListener(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        if (this.f349982q == 1) {
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout mContentView = getMContentView();
            kotlin.jvm.internal.o.e(mContentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            ((com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) mContentView).setDrawerListener(aVar);
        }
        this.E = aVar;
    }

    public final void setMContentView(com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout) {
        kotlin.jvm.internal.o.g(scrollFrameLayout, "<set-?>");
        this.f349975g = scrollFrameLayout;
    }

    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f349981p = onDismissListener;
    }

    public final void setPeekHeight(int i17) {
        this.f349986u = i17;
    }

    public final void setPeekRatio(float f17) {
        this.f349985t = f17;
    }

    public final void setRightMargin(int i17) {
        this.f349990y = i17;
    }

    public final void setScrollContainerHeight(int i17) {
        this.f349987v = i17;
    }

    public final void setScrollContainerWidth(int i17) {
        this.f349988w = i17;
    }

    public final void setScrollDownLimit(int i17) {
        this.B = i17;
    }

    public final void setScrollUpLimit(int i17) {
        this.C = i17;
    }

    public final void setTopMargin(int i17) {
        this.f349991z = i17;
    }
}
