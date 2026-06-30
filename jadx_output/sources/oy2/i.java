package oy2;

/* loaded from: classes8.dex */
public abstract class i extends com.tencent.mm.ui.widget.dialog.k2 implements oy2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f349956d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f349957e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout f349958f;

    /* renamed from: g, reason: collision with root package name */
    public final int f349959g;

    /* renamed from: h, reason: collision with root package name */
    public final int f349960h;

    /* renamed from: i, reason: collision with root package name */
    public final int f349961i;

    /* renamed from: m, reason: collision with root package name */
    public final int f349962m;

    /* renamed from: n, reason: collision with root package name */
    public int f349963n;

    /* renamed from: o, reason: collision with root package name */
    public int f349964o;

    /* renamed from: p, reason: collision with root package name */
    public int f349965p;

    /* renamed from: q, reason: collision with root package name */
    public int f349966q;

    /* renamed from: r, reason: collision with root package name */
    public int f349967r;

    /* renamed from: s, reason: collision with root package name */
    public int f349968s;

    /* renamed from: t, reason: collision with root package name */
    public int f349969t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494100e7);
        kotlin.jvm.internal.o.g(context, "context");
        this.f349956d = context;
        com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
        this.f349959g = e8Var.b(context);
        this.f349960h = e8Var.c(null);
        this.f349961i = com.tencent.mm.ui.bl.c(context);
        com.tencent.mm.ui.bl.h(context);
        this.f349962m = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        this.f349969t = 80;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488781ae2, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f349957e = viewGroup;
        viewGroup.setOnClickListener(new oy2.h(this));
        oy2.g gVar = (oy2.g) this;
        gVar.f349963n = gVar.f349960h;
        int i18 = gVar.f349959g;
        int i19 = (i18 - gVar.f349961i) - gVar.f349962m;
        gVar.f349964o = i19;
        int i27 = (int) (i18 * 0.75d);
        gVar.f349965p = i27;
        gVar.f349966q = i27;
        gVar.f349967r = i19 - i27;
        gVar.f349968s = (int) (i19 * 0.3d);
        gVar.f349969t = 80;
        android.view.View inflate2 = android.view.LayoutInflater.from(gVar.getContext()).inflate(com.tencent.mm.R.layout.b5x, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout");
        gVar.f349958f = (com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout) inflate2;
        gVar.c().setScrollDownLimit(gVar.f349968s);
        gVar.c().setScrollUpLimit(0);
        ((com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout) gVar.c()).setPeekHeight(gVar.f349965p);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.f349966q);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = this.f349967r;
        layoutParams.bottomMargin = 0;
        android.view.ViewGroup viewGroup2 = this.f349957e;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
        viewGroup2.addView(c(), layoutParams);
        setCanceledOnTouchOutside(true);
    }

    public final com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout c() {
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = this.f349958f;
        if (scrollFrameLayout != null) {
            return scrollFrameLayout;
        }
        kotlin.jvm.internal.o.o("mContentView");
        throw null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (c().isAnimating) {
            com.tencent.mars.xlog.Log.w("Finder.FinderScrollDialog", "cancel return isAnimating.");
        } else {
            super.cancel();
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // oy2.m
    public android.content.Context g() {
        return this.f349956d;
    }

    @Override // oy2.m
    public com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout l() {
        return c();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout centerScrollFrameLayout = (com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout) ((oy2.g) this).c();
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(centerScrollFrameLayout, centerScrollFrameLayout.peekHeight, false, 0, new oy2.a(centerScrollFrameLayout), 4, null);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.ViewGroup viewGroup = this.f349957e;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
        setContentView(viewGroup);
        android.view.Window window = getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = this.f349963n;
            attributes.height = this.f349964o;
            attributes.gravity = this.f349969t;
            window.setAttributes(attributes);
            window.setWindowAnimations(0);
        }
    }
}
