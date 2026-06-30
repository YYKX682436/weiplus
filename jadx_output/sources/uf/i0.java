package uf;

/* loaded from: classes7.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f427033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f427034f;

    public i0(uf.o0 o0Var, boolean z17, boolean z18) {
        this.f427032d = o0Var;
        this.f427033e = z17;
        this.f427034f = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.o0 o0Var = this.f427032d;
        o0Var.f427063f = new uf.c2(o0Var.f427061d, ((uf.o1) o0Var.f427058a).f427075g, false, this.f427033e, o0Var.f427062e, 4, null);
        uf.c2 c2Var = o0Var.f427063f;
        if (c2Var == null) {
            kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var.f427009v = new uf.f0(o0Var);
        if (c2Var == null) {
            kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var.f427011x = new uf.g0(o0Var, this.f427033e);
        uf.c2 c2Var2 = o0Var.f427063f;
        if (c2Var2 == null) {
            kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var2.f427010w = new uf.h0(o0Var, this.f427034f);
        if (c2Var2 == null) {
            kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
            throw null;
        }
        c2Var2.f427003p = c2Var2.d();
        c2Var2.f427004q = c2Var2.c();
        if (c2Var2.f426997g != null) {
            android.view.View view = c2Var2.f426999i;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            android.content.Context context = c2Var2.f426998h;
            boolean z17 = c2Var2.f427008u;
            if (z17) {
                c2Var2.f427001n = (int) (com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f480144pj) * 6.5d);
            }
            layoutParams2.height = c2Var2.f427001n;
            boolean z18 = c2Var2.f427003p;
            android.view.View view2 = c2Var2.f427005r;
            if (z18 && view2 != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view2.getWindowVisibleDisplayFrame(rect);
                if (z17) {
                    layoutParams2.width = (int) (((rect.right * 1.0f) * 4) / 10);
                    if (com.tencent.mm.ui.bl.m(context)) {
                        layoutParams2.height = rect.bottom - com.tencent.mm.ui.bl.j(context);
                    } else {
                        layoutParams2.height = rect.bottom;
                    }
                } else {
                    layoutParams2.width = rect.right;
                }
            }
            android.view.View view3 = c2Var2.f426999i;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            view3.setLayoutParams(layoutParams2);
            android.app.Dialog dialog = c2Var2.f426997g;
            if (dialog == null) {
                kotlin.jvm.internal.o.o("mBottomSheetDialog");
                throw null;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if (com.tencent.mm.plugin.appbrand.utils.d.f90400e.isEnable() || !c2Var2.f427007t) {
                android.app.Dialog dialog2 = c2Var2.f426997g;
                if (dialog2 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window2 = dialog2.getWindow();
                if (window2 != null) {
                    window2.clearFlags(8);
                }
                android.app.Dialog dialog3 = c2Var2.f426997g;
                if (dialog3 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window3 = dialog3.getWindow();
                if (window3 != null) {
                    window3.clearFlags(131072);
                }
                android.app.Dialog dialog4 = c2Var2.f426997g;
                if (dialog4 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window4 = dialog4.getWindow();
                if (window4 != null) {
                    window4.clearFlags(128);
                }
                android.app.Dialog dialog5 = c2Var2.f426997g;
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
                android.app.Dialog dialog6 = c2Var2.f426997g;
                if (dialog6 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window6 = dialog6.getWindow();
                if (window6 != null) {
                    window6.setFlags(8, 8);
                }
                android.app.Dialog dialog7 = c2Var2.f426997g;
                if (dialog7 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheetDialog");
                    throw null;
                }
                android.view.Window window7 = dialog7.getWindow();
                if (window7 != null) {
                    window7.addFlags(131200);
                }
                android.app.Dialog dialog8 = c2Var2.f426997g;
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
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = c2Var2.f427002o;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = false;
            }
            if (view2 != null) {
                boolean z19 = c2Var2.f427006s == null;
                android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                c2Var2.f427006s = viewTreeObserver;
                if (z19) {
                    kotlin.jvm.internal.o.d(viewTreeObserver);
                    viewTreeObserver.addOnGlobalLayoutListener(c2Var2);
                }
            }
            if (context instanceof android.app.Activity) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    return;
                }
                android.app.Dialog dialog9 = c2Var2.f426997g;
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
