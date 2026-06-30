package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes8.dex */
public abstract class m0 extends androidx.appcompat.app.i0 implements androidx.lifecycle.y {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f138294f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f138295g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f138296h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f138297i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f138298m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f138299n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f138300o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context selfContext) {
        super(selfContext, com.tencent.mm.R.style.f494232yo);
        kotlin.jvm.internal.o.g(selfContext, "selfContext");
        this.f138294f = selfContext;
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.l0(this));
        this.f138299n = b17;
        ((androidx.lifecycle.b0) ((jz5.n) b17).getValue()).g(androidx.lifecycle.n.INITIALIZED);
    }

    public void D() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        int i17 = 0;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bj8, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f138295g = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.f484220df2) : null;
        this.f138296h = findViewById;
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            com.tencent.mm.plugin.fts.ui.widget.w0 w0Var = (com.tencent.mm.plugin.fts.ui.widget.w0) this;
            if (com.tencent.mm.ui.b4.c(w0Var.getContext())) {
                android.content.Context context = w0Var.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (w0Var.getContext() instanceof android.view.ContextThemeWrapper) {
                    android.content.Context context2 = w0Var.getContext();
                    kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.view.ContextThemeWrapper");
                    context = ((android.view.ContextThemeWrapper) context2).getBaseContext();
                    kotlin.jvm.internal.o.f(context, "getBaseContext(...)");
                }
                i17 = com.tencent.mm.ui.bl.c(context);
            }
            layoutParams.height = (i65.a.k(w0Var.getContext()) - i65.a.b(w0Var.getContext(), com.tencent.mapsdk.internal.km.f50100e)) - i17;
            android.view.View view = this.f138296h;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        android.view.View view2 = this.f138296h;
        if (view2 != null) {
            view2.setOnTouchListener(new com.tencent.mm.plugin.fts.ui.widget.j0(this));
        }
        android.view.View view3 = this.f138295g;
        this.f138298m = view3 != null ? view3.findViewById(com.tencent.mm.R.id.ci6) : null;
        android.view.View inflate2 = android.view.LayoutInflater.from(((com.tencent.mm.plugin.fts.ui.widget.w0) this).getContext()).inflate(com.tencent.mm.R.layout.bd7, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        this.f138297i = inflate2;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, com.tencent.mm.R.id.f484220df2);
        android.view.View view4 = this.f138295g;
        android.view.ViewGroup viewGroup = view4 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view4 : null;
        if (viewGroup != null) {
            viewGroup.addView(this.f138297i, layoutParams2);
        }
        setCancelable(true);
        super.setOnDismissListener(new com.tencent.mm.plugin.fts.ui.widget.k0(this));
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return (androidx.lifecycle.b0) ((jz5.n) this.f138299n).getValue();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f138297i != null) {
            int i17 = 0;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.content.Context context = this.f138294f;
                if (com.tencent.mm.ui.bl.f(context)) {
                    if (!(getContext().getResources().getConfiguration().orientation == 2)) {
                        i17 = com.tencent.mm.ui.bl.c(context);
                    }
                }
            }
            android.view.View view = this.f138297i;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
            }
            android.view.View view2 = this.f138297i;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((androidx.lifecycle.b0) ((jz5.n) this.f138299n).getValue()).g(androidx.lifecycle.n.CREATED);
        D();
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f138300o = onDismissListener;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        com.tencent.mm.ui.bk.C();
        ((androidx.lifecycle.b0) ((jz5.n) this.f138299n).getValue()).g(androidx.lifecycle.n.RESUMED);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
