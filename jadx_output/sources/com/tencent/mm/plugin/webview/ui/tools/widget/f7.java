package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public class f7 extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f187223f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f187224g;

    public f7(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494143fd);
        this.f187223f = context;
        C(1);
    }

    public final void D() {
        android.content.Context context = this.f187223f;
        int c17 = (!com.tencent.mm.ui.bl.f(context) || android.os.Build.VERSION.SDK_INT >= 30) ? 0 : com.tencent.mm.ui.bl.c(context);
        if (!(context.getResources().getConfiguration().orientation == 2)) {
            android.widget.FrameLayout frameLayout = this.f187224g;
            if (frameLayout != null) {
                androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) frameLayout.getLayoutParams();
                cVar.setMargins(0, 0, 0, c17);
                this.f187224g.setLayoutParams(cVar);
                return;
            }
            return;
        }
        android.widget.FrameLayout frameLayout2 = this.f187224g;
        if (frameLayout2 != null) {
            androidx.coordinatorlayout.widget.c cVar2 = (androidx.coordinatorlayout.widget.c) frameLayout2.getLayoutParams();
            if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 1) {
                cVar2.setMargins(0, 0, c17, 0);
            } else if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 3) {
                cVar2.setMargins(c17, 0, 0, 0);
            }
            this.f187224g.setLayoutParams(cVar2);
        }
    }

    public final android.view.View E(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.view.Window window = getWindow();
        window.setWindowAnimations(com.tencent.mm.R.style.f494681z7);
        boolean z17 = false;
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        android.content.Context context = this.f187223f;
        if (context.getResources().getConfiguration().orientation == 2) {
            attributes.width = -2;
            attributes.height = -1;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ei7, (android.view.ViewGroup) null);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ohv);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, viewGroup, false);
        }
        this.f187224g = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.f487698vp0);
        D();
        this.f187224g.setVisibility(0);
        if (layoutParams == null) {
            this.f187224g.addView(view);
        } else {
            this.f187224g.addView(view, layoutParams);
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (getContext().getTheme().resolveAttribute(android.R.attr.windowCloseOnTouchOutside, typedValue, true) && typedValue.data != 0) {
            z17 = true;
        }
        if (z17) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.e7(this));
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
        getWindow().setLayout(-1, -1);
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(E(0, view, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(E(0, view, layoutParams));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(E(i17, null, null));
    }
}
