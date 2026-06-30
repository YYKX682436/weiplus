package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes5.dex */
public class c extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f211752f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f211753g;

    public c(android.content.Context context) {
        super(context, com.tencent.mm.ui.b4.c(context) ? com.tencent.mm.R.style.f494144yk : com.tencent.mm.R.style.f494143fd);
        this.f211752f = context;
        C(1);
    }

    public final void D() {
        android.content.Context context = this.f211752f;
        int c17 = (!com.tencent.mm.ui.bl.f(context) || android.os.Build.VERSION.SDK_INT >= 30) ? 0 : com.tencent.mm.ui.bl.c(context);
        if (!E()) {
            android.widget.FrameLayout frameLayout = this.f211753g;
            if (frameLayout != null) {
                androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) frameLayout.getLayoutParams();
                cVar.setMargins(0, 0, 0, c17);
                this.f211753g.setLayoutParams(cVar);
                return;
            }
            return;
        }
        android.widget.FrameLayout frameLayout2 = this.f211753g;
        if (frameLayout2 != null) {
            androidx.coordinatorlayout.widget.c cVar2 = (androidx.coordinatorlayout.widget.c) frameLayout2.getLayoutParams();
            if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 1) {
                cVar2.setMargins(0, 0, c17, 0);
            } else if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 3) {
                cVar2.setMargins(c17, 0, 0, 0);
            }
            this.f211753g.setLayoutParams(cVar2);
        }
    }

    public boolean E() {
        return this.f211752f.getResources().getConfiguration().orientation == 2;
    }

    public boolean F() {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return getContext().getTheme().resolveAttribute(android.R.attr.windowCloseOnTouchOutside, typedValue, true) && typedValue.data != 0;
    }

    public final android.view.View G(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.Window window = getWindow();
        if (E()) {
            window.setGravity(5);
            window.setWindowAnimations(com.tencent.mm.R.style.f494504ot);
        } else {
            window.setGravity(80);
            window.setWindowAnimations(com.tencent.mm.R.style.f494074dp);
        }
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        if (E()) {
            attributes.width = -2;
            attributes.height = -1;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this.f211752f).inflate(com.tencent.mm.R.layout.bxj, (android.view.ViewGroup) null);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ohv);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, viewGroup, false);
        }
        if (E()) {
            this.f211753g = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.jhe);
        } else {
            this.f211753g = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.jhc);
        }
        D();
        this.f211753g.setVisibility(0);
        if (layoutParams == null) {
            this.f211753g.addView(view);
        } else {
            this.f211753g.addView(view, layoutParams);
        }
        if (F()) {
            findViewById.setOnClickListener(new com.tencent.mm.ui.widget.dialog.b(this));
        }
        return viewGroup;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            if (!com.tencent.mm.ui.b4.c(this.f211752f)) {
                getWindow().setLayout(-1, -1);
                return;
            }
            window.setLayout(-1, -1);
            try {
                window.getDecorView();
                n3.h2.a(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                int i17 = android.os.Build.VERSION.SDK_INT;
                if (i17 >= 28) {
                    int i18 = i17 >= 30 ? 3 : 1;
                    android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                    if (attributes.layoutInDisplayCutoutMode != i18) {
                        attributes.layoutInDisplayCutoutMode = i18;
                        window.setAttributes(attributes);
                    }
                }
                if (i17 >= 29) {
                    window.setStatusBarContrastEnforced(false);
                    window.setNavigationBarContrastEnforced(false);
                }
            } catch (java.lang.RuntimeException e17) {
                e17.toString();
            }
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.clearFlags(134217728);
            window.setStatusBarColor(0);
            n3.m3 m3Var = new n3.m3(window, window.getDecorView());
            m3Var.c(true);
            m3Var.b(true);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(G(0, view, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(G(0, view, layoutParams));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(G(i17, null, null));
    }
}
