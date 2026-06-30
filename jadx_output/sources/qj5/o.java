package qj5;

/* loaded from: classes5.dex */
public final class o extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f363993f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f363994g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494143fd);
        kotlin.jvm.internal.o.g(context, "context");
        this.f363993f = context;
        C(1);
    }

    public final void D() {
        android.widget.FrameLayout frameLayout = this.f363994g;
        if (frameLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) layoutParams;
            if (!I()) {
                android.content.Context context = this.f363993f;
                if (com.tencent.mm.ui.b4.c(context)) {
                    cVar.setMargins(0, 0, 0, 0);
                } else {
                    kotlin.jvm.internal.o.g(context, "context");
                    cVar.setMargins(0, 0, 0, !(android.provider.Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", 0) == 2) ? E() : 0);
                }
            } else if (F() == 1) {
                cVar.setMargins(0, 0, E(), 0);
            } else if (F() == 3) {
                cVar.setMargins(E(), 0, 0, 0);
            }
            frameLayout.setLayoutParams(cVar);
        }
    }

    public final int E() {
        android.view.Window window;
        android.view.View decorView;
        android.content.Context context = this.f363993f;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return 0;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(decorView);
        if (a17 == null) {
            return 0;
        }
        return a17.a(2).f247047d;
    }

    public final int F() {
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        android.view.Window window = getWindow();
        if (window == null || (windowManager = window.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    public final android.view.View G(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        D();
        android.view.Window window = getWindow();
        if (window != null) {
            n3.h2.a(window, false);
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -1;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 3;
            }
            window.setAttributes(attributes);
            window.addFlags(512);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(1792);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        android.content.Context context = this.f363993f;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489276ek1, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        viewGroup.findViewById(com.tencent.mm.R.id.f485315u41);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.f483445sl1);
        this.f363994g = frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            if (layoutParams == null) {
                frameLayout.addView(view);
            } else {
                frameLayout.addView(view, layoutParams);
            }
        }
        kotlin.jvm.internal.o.g(context, "context");
        if (!(android.provider.Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", 0) == 2) && !I() && !com.tencent.mm.ui.b4.c(context)) {
            android.view.View view2 = new android.view.View(context);
            view2.setBackground(view.getBackground());
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(-1, com.tencent.mm.ui.bl.d((android.app.Activity) context));
            cVar.f11008c = 80;
            viewGroup.addView(view2, cVar);
        }
        return viewGroup;
    }

    public final boolean I() {
        return this.f363993f.getResources().getConfiguration().orientation == 2;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        super.onCreate(bundle);
        if (com.tencent.mm.ui.b4.c(this.f363993f) && getWindow() != null) {
            android.view.Window window2 = getWindow();
            if (window2 != null) {
                window2.setLayout(-1, -1);
            }
            android.view.Window window3 = getWindow();
            if (window3 != null) {
                try {
                    window3.getDecorView();
                    n3.h2.a(window3, false);
                    window3.setStatusBarColor(0);
                    window3.setNavigationBarColor(0);
                    int i17 = android.os.Build.VERSION.SDK_INT;
                    if (i17 >= 28) {
                        int i18 = i17 >= 30 ? 3 : 1;
                        android.view.WindowManager.LayoutParams attributes = window3.getAttributes();
                        if (attributes.layoutInDisplayCutoutMode != i18) {
                            attributes.layoutInDisplayCutoutMode = i18;
                            window3.setAttributes(attributes);
                        }
                    }
                    if (i17 >= 29) {
                        window3.setStatusBarContrastEnforced(false);
                        window3.setNavigationBarContrastEnforced(false);
                    }
                } catch (java.lang.RuntimeException e17) {
                    e17.toString();
                }
            }
            android.view.Window window4 = getWindow();
            if (window4 != null) {
                window4.addFlags(Integer.MIN_VALUE);
            }
            android.view.Window window5 = getWindow();
            if (window5 != null) {
                window5.clearFlags(67108864);
            }
            android.view.Window window6 = getWindow();
            if (window6 != null) {
                window6.clearFlags(134217728);
            }
            android.view.Window window7 = getWindow();
            if (window7 != null) {
                window7.setStatusBarColor(0);
            }
            if (getWindow() != null) {
                android.view.Window window8 = getWindow();
                kotlin.jvm.internal.o.d(window8);
                android.view.Window window9 = getWindow();
                kotlin.jvm.internal.o.d(window9);
                n3.m3 m3Var = new n3.m3(window8, window9.getDecorView());
                m3Var.c(true);
                m3Var.b(true);
            }
            if (android.os.Build.VERSION.SDK_INT >= 29 && (window = getWindow()) != null) {
                window.setNavigationBarContrastEnforced(false);
            }
        }
        android.view.Window window10 = getWindow();
        if (window10 != null) {
            window10.setLayout(-1, -1);
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.setContentView(G(view, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.o.g(view, "view");
        super.setContentView(G(view, layoutParams));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f363993f).inflate(i17, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        super.setContentView(G(inflate, null));
    }
}
