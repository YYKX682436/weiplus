package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class d7 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.f7 f187161d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f187162e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f187163f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f187164g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f187165h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f187166i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f187167m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f187168n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f187169o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f187170p;

    /* renamed from: q, reason: collision with root package name */
    public int f187171q;

    public d7(android.content.Context context) {
        this.f187170p = false;
        this.f187162e = context;
        if (context instanceof android.app.Activity) {
            this.f187163f = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.f7 f7Var = new com.tencent.mm.plugin.webview.ui.tools.widget.f7(context);
        this.f187161d = f7Var;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.eik, null);
        this.f187164g = inflate;
        this.f187165h = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.jhc);
        this.f187166i = (android.widget.ImageView) this.f187164g.findViewById(com.tencent.mm.R.id.vk8);
        android.view.View findViewById = this.f187164g.findViewById(com.tencent.mm.R.id.uq8);
        this.f187167m = findViewById;
        findViewById.setFocusable(true);
        this.f187167m.setClickable(true);
        this.f187167m.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.y6(this));
        f7Var.setOnDismissListener(new com.tencent.mm.plugin.webview.ui.tools.widget.z6(this));
        this.f187170p = b();
        if (com.tencent.mm.ui.bk.p(context) > 0) {
            int a17 = com.tencent.mm.ui.zk.a(context, 40);
            this.f187167m.setPadding(a17, com.tencent.mm.ui.zk.a(context, 60) - com.tencent.mm.ui.bk.p(context), a17, 0);
        }
    }

    public final void a(android.view.View view, java.lang.Runnable runnable) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new com.tencent.mm.plugin.webview.ui.tools.widget.c7(this, runnable));
        ofFloat.start();
    }

    public final boolean b() {
        android.content.Context context = this.f187162e;
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public void c() {
        com.tencent.mm.plugin.webview.ui.tools.widget.f7 f7Var = this.f187161d;
        android.content.Context context = this.f187162e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebMenuContainer", "tryHide containerDialog:%s, mContext:%s", f7Var, context);
        if (f7Var != null) {
            if (!(context instanceof android.app.Activity)) {
                a(this.f187164g, new com.tencent.mm.plugin.webview.ui.tools.widget.b7(this));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMenuContainer", " cannot dismiss !");
            if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            a(this.f187164g, new com.tencent.mm.plugin.webview.ui.tools.widget.a7(this));
        }
    }

    public void d() {
        this.f187170p = b();
        java.lang.Object obj = this.f187162e;
        this.f187171q = obj instanceof android.app.Activity ? ((android.app.Activity) obj).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (this.f187170p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebMenuContainer", "not tryShow for Landscape");
        }
        android.view.View view = this.f187163f;
        if (view != null) {
            boolean z17 = this.f187168n == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f187168n = viewTreeObserver;
            if (z17) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                if (obj instanceof androidx.lifecycle.y) {
                    ((androidx.lifecycle.y) obj).mo133getLifecycle().a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.webview.ui.tools.widget.WebMenuContainer$3
                        @Override // androidx.lifecycle.v
                        public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
                            if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                                com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var = com.tencent.mm.plugin.webview.ui.tools.widget.d7.this;
                                android.view.ViewTreeObserver viewTreeObserver2 = d7Var.f187168n;
                                if (viewTreeObserver2 != null) {
                                    if (!viewTreeObserver2.isAlive()) {
                                        d7Var.f187168n = d7Var.f187163f.getViewTreeObserver();
                                    }
                                    d7Var.f187168n.removeGlobalOnLayoutListener(d7Var);
                                    d7Var.f187168n = null;
                                }
                                yVar.mo133getLifecycle().c(this);
                            }
                        }
                    });
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.f7 f7Var = this.f187161d;
        if (f7Var != null) {
            f7Var.getWindow().addFlags(Integer.MIN_VALUE);
            f7Var.getWindow().clearFlags(8);
            f7Var.getWindow().clearFlags(131072);
            f7Var.getWindow().clearFlags(128);
            f7Var.getWindow().getDecorView().setSystemUiVisibility(0);
            if (!(obj instanceof android.app.Activity) || ((android.app.Activity) obj).isFinishing()) {
                return;
            }
            android.widget.ImageView imageView = this.f187166i;
            if (imageView != null) {
                if (this.f187170p) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
            }
            f7Var.show();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f187164g, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.webview.ui.tools.widget.f7 f7Var = this.f187161d;
        if (f7Var != null && f7Var.isShowing()) {
            android.view.View view = this.f187163f;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                c();
                return;
            }
            if (f7Var != null && f7Var.isShowing()) {
                if (this.f187170p == b()) {
                    int i17 = this.f187171q;
                    android.content.Context context = this.f187162e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                c();
            }
        }
    }
}
