package k23;

/* loaded from: classes12.dex */
public abstract class p2 extends k23.i1 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f303651n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f303652o;

    /* renamed from: p, reason: collision with root package name */
    public int f303653p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f303654q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.content.Context context, k23.d0 params) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f303651n = findViewById(com.tencent.mm.R.id.tyt);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.sgr);
        this.f303652o = findViewById;
        findViewById.setOnClickListener(k23.m2.f303622d);
        b();
        this.f303653p = Integer.MIN_VALUE;
        this.f303654q = jz5.h.b(new k23.o2(this));
    }

    private final java.util.List<android.view.View> getShadowViewList() {
        return (java.util.List) ((jz5.n) this.f303654q).getValue();
    }

    public final void c() {
        for (android.view.View view : getShadowViewList()) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnWithLinearShadow", "showExtentShadow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnWithLinearShadow", "showExtentShadow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // k23.i1
    public int getLayoutId() {
        return com.tencent.mm.R.layout.efb;
    }

    public final int getMarginBottomPx() {
        return this.f303652o.getLayoutParams().height;
    }

    public final int getSafeAreaHeight() {
        return this.f303651n.getHeight();
    }

    @Override // k23.i1
    public java.lang.Integer getStartButtonTopToBottomHeightPx() {
        return java.lang.Integer.valueOf(this.f303652o.getHeight() + getStartBtn().getHeight());
    }

    public final void setMarginBottomPx(int i17) {
        android.view.View backgroundMask = this.f303652o;
        kotlin.jvm.internal.o.f(backgroundMask, "backgroundMask");
        android.view.ViewGroup.LayoutParams layoutParams = backgroundMask.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i17;
        backgroundMask.setLayoutParams(layoutParams);
        if (java.lang.Math.abs(i17 - this.f303653p) >= 50) {
            this.f303653p = i17;
            backgroundMask.post(new k23.n2(this, i17));
        }
    }
}
