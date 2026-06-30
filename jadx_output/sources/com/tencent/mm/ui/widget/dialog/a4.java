package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes5.dex */
public class a4 extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f211743f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f211744g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f211745h;

    public a4(android.content.Context context) {
        super(context, com.tencent.mm.ui.b4.c(context) ? com.tencent.mm.R.style.f494144yk : com.tencent.mm.R.style.f494143fd);
        this.f211745h = true;
        this.f211743f = context;
        C(1);
    }

    public final void D() {
        if (this.f211744g == null || E()) {
            return;
        }
        android.content.Context context = this.f211743f;
        int c17 = (!com.tencent.mm.ui.bl.f(context) || android.os.Build.VERSION.SDK_INT >= 30) ? 0 : com.tencent.mm.ui.bl.c(context);
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) this.f211744g.getLayoutParams();
        cVar.setMargins(0, 0, 0, c17);
        this.f211744g.setLayoutParams(cVar);
    }

    public final boolean E() {
        return this.f211743f.getResources().getConfiguration().orientation == 2;
    }

    public final android.view.View F(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.Window window = getWindow();
        if (E()) {
            window.setGravity(1);
            window.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        } else {
            window.setGravity(80);
            window.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        boolean z17 = false;
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        if (E()) {
            attributes.width = -2;
            attributes.height = -2;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this.f211743f).inflate(com.tencent.mm.R.layout.c7o, (android.view.ViewGroup) null);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ohv);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, viewGroup, false);
        }
        if (E()) {
            this.f211744g = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.jhd);
        } else {
            this.f211744g = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.jhc);
            D();
        }
        this.f211744g.setVisibility(0);
        if (layoutParams == null) {
            this.f211744g.addView(view);
        } else {
            this.f211744g.addView(view, layoutParams);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (getContext().getTheme().resolveAttribute(android.R.attr.windowCloseOnTouchOutside, typedValue, true)) {
            z17 = typedValue.data != 0;
        }
        if (z17) {
            findViewById.setOnClickListener(new com.tencent.mm.ui.widget.dialog.z3(this));
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
            if (!com.tencent.mm.ui.b4.c(this.f211743f)) {
                window.setLayout(-1, -1);
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
        super.setContentView(F(0, view, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(F(0, view, layoutParams));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(F(i17, null, null));
    }

    public a4(android.content.Context context, int i17) {
        super(context, i17 == 0 ? com.tencent.mm.ui.b4.c(context) ? com.tencent.mm.R.style.f494144yk : com.tencent.mm.R.style.f494143fd : i17);
        this.f211745h = true;
        this.f211743f = context;
        C(1);
    }
}
