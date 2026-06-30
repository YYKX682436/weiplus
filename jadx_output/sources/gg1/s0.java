package gg1;

/* loaded from: classes7.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f271626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f271627f;

    public s0(gg1.c1 c1Var, boolean z17, boolean z18) {
        this.f271625d = c1Var;
        this.f271626e = z17;
        this.f271627f = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.c1 c1Var = this.f271625d;
        android.content.Context context = c1Var.f271535a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gg1.w wVar = new gg1.w(context, false, c1Var.f271537c, c1Var.f271539e, this.f271626e, 2, null);
        c1Var.f271540f = wVar;
        wVar.f271651x = new gg1.o0(c1Var);
        wVar.f271650w = new gg1.p0(this.f271626e, c1Var);
        wVar.f271649v = new gg1.r0(c1Var, this.f271627f);
        wVar.f271643p = wVar.c();
        wVar.f271644q = wVar.b();
        if (wVar.f271637g != null) {
            android.view.View view = wVar.f271639i;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            android.content.Context context2 = wVar.f271638h;
            boolean z17 = wVar.f271648u;
            if (z17) {
                wVar.f271641n = (int) (com.tencent.mm.ui.zk.e(context2, com.tencent.mm.R.dimen.f480144pj) * 6.5d);
            }
            layoutParams2.height = wVar.f271641n;
            boolean z18 = wVar.f271643p;
            android.view.View view2 = wVar.f271645r;
            if (z18 && view2 != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                if (z17) {
                    layoutParams2.width = (int) (((rect.right * 1.0f) * 4) / 10);
                    if (com.tencent.mm.ui.bl.m(context2)) {
                        layoutParams2.height = rect.bottom - com.tencent.mm.ui.bl.j(context2);
                    } else {
                        layoutParams2.height = rect.bottom;
                    }
                } else {
                    layoutParams2.width = rect.right;
                }
            }
            android.view.View view3 = wVar.f271639i;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            view3.setLayoutParams(layoutParams2);
            android.app.Dialog dialog = wVar.f271637g;
            if (dialog == null) {
                kotlin.jvm.internal.o.o("mBottomSheetDialog");
                throw null;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if (com.tencent.mm.plugin.appbrand.utils.d.f90400e.isEnable() || !wVar.f271647t) {
                android.app.Dialog dialog2 = wVar.f271637g;
                if (dialog2 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window2 = dialog2.getWindow();
                if (window2 != null) {
                    window2.clearFlags(8);
                }
                android.app.Dialog dialog3 = wVar.f271637g;
                if (dialog3 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window3 = dialog3.getWindow();
                if (window3 != null) {
                    window3.clearFlags(131072);
                }
                android.app.Dialog dialog4 = wVar.f271637g;
                if (dialog4 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window4 = dialog4.getWindow();
                if (window4 != null) {
                    window4.clearFlags(128);
                }
                android.app.Dialog dialog5 = wVar.f271637g;
                if (dialog5 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window5 = dialog5.getWindow();
                android.view.View decorView = window5 != null ? window5.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(0);
                }
            } else {
                android.app.Dialog dialog6 = wVar.f271637g;
                if (dialog6 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window6 = dialog6.getWindow();
                if (window6 != null) {
                    window6.setFlags(8, 8);
                }
                android.app.Dialog dialog7 = wVar.f271637g;
                if (dialog7 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window7 = dialog7.getWindow();
                if (window7 != null) {
                    window7.addFlags(131200);
                }
                android.app.Dialog dialog8 = wVar.f271637g;
                if (dialog8 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window8 = dialog8.getWindow();
                android.view.View decorView2 = window8 != null ? window8.getDecorView() : null;
                if (decorView2 != null) {
                    decorView2.setSystemUiVisibility(6);
                }
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = wVar.f271642o;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = false;
            }
            if (view2 != null) {
                boolean z19 = wVar.f271646s == null;
                android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                wVar.f271646s = viewTreeObserver;
                if (z19) {
                    kotlin.jvm.internal.o.d(viewTreeObserver);
                    viewTreeObserver.addOnGlobalLayoutListener(wVar);
                }
            }
            if (context2 instanceof android.app.Activity) {
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context2).isFinishing()) {
                    return;
                }
                android.app.Dialog dialog9 = wVar.f271637g;
                if (dialog9 != null) {
                    dialog9.show();
                } else {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
            }
        }
    }
}
