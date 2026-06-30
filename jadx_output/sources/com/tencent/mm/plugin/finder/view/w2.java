package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class w2 extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final int f133279d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f133280e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f133281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494770z8);
        kotlin.jvm.internal.o.g(context, "context");
        this.f133279d = i17;
        this.f133281f = true;
    }

    public final void b(boolean z17) {
        jz5.f0 f0Var;
        if (this.f133281f == z17) {
            return;
        }
        this.f133281f = z17;
        if (isShowing()) {
            if (z17) {
                if (!c()) {
                    e(false);
                    return;
                }
                android.view.Window window = getWindow();
                if (window != null) {
                    window.addFlags(4);
                }
                e(true);
                return;
            }
            if (this.f133280e && android.os.Build.VERSION.SDK_INT >= 31) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    android.view.Window window2 = getWindow();
                    if (window2 != null) {
                        window2.setBackgroundBlurRadius(0);
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                this.f133280e = false;
            }
            android.view.Window window3 = getWindow();
            if (window3 != null) {
                window3.clearFlags(4);
            }
            android.view.Window window4 = getWindow();
            if (window4 != null) {
                window4.setBackgroundDrawableResource(com.tencent.mm.R.drawable.d0u);
            }
        }
    }

    public final boolean c() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127774jd).getValue()).r()).booleanValue()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("FinderBlurToast", "supportBlur=false by FinderConfig.FINDER_BLUR_TOAST_ENABLE");
        return false;
    }

    public final void e(boolean z17) {
        jz5.f0 f0Var;
        android.view.View decorView;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        android.view.Window window = getWindow();
        boolean z18 = (window == null || (decorView = window.getDecorView()) == null || !decorView.isHardwareAccelerated()) ? false : true;
        boolean z19 = z17 && z18 && android.os.Build.VERSION.SDK_INT >= 31 && this.f133281f;
        com.tencent.mars.xlog.Log.i("FinderBlurToast", "updateWindowForBlurs blursEnabled=" + z17 + " hwAccelerated=" + z18 + " userEnabled=" + this.f133281f + " canBlur=" + z19);
        if (z19) {
            try {
                android.view.Window window2 = getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawableResource(com.tencent.mm.R.drawable.d0u);
                }
                android.view.Window window3 = getWindow();
                if (window3 != null) {
                    window3.setBackgroundBlurRadius(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479724dg));
                }
                this.f133280e = true;
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderBlurToast", "setBackgroundBlurRadius fail, fallback. err=" + th6.getMessage());
                this.f133280e = false;
                android.view.Window window4 = getWindow();
                if (window4 != null) {
                    window4.clearFlags(4);
                }
                android.view.Window window5 = getWindow();
                if (window5 != null) {
                    window5.setBackgroundDrawableResource(com.tencent.mm.R.drawable.d0v);
                    return;
                }
                return;
            }
        }
        if (this.f133280e && android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                android.view.Window window6 = getWindow();
                if (window6 != null) {
                    window6.setBackgroundBlurRadius(0);
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            this.f133280e = false;
        }
        android.view.Window window7 = getWindow();
        if (window7 != null) {
            window7.clearFlags(4);
        }
        if (this.f133281f) {
            android.view.Window window8 = getWindow();
            if (window8 != null) {
                window8.setBackgroundDrawableResource(com.tencent.mm.R.drawable.d0v);
                return;
            }
            return;
        }
        android.view.Window window9 = getWindow();
        if (window9 != null) {
            window9.setBackgroundDrawable(null);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.View decorView;
        android.view.WindowManager.LayoutParams attributes;
        requestWindowFeature(1);
        android.view.Window window = getWindow();
        android.view.WindowManager.LayoutParams attributes2 = window != null ? window.getAttributes() : null;
        if (attributes2 != null) {
            attributes2.gravity = 48;
        }
        int i17 = com.tencent.mm.ui.bl.i(getContext(), 0);
        android.view.Window window2 = getWindow();
        android.view.WindowManager.LayoutParams attributes3 = window2 != null ? window2.getAttributes() : null;
        if (attributes3 != null) {
            attributes3.y = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479658bv) - i17;
        }
        android.view.Window window3 = getWindow();
        android.view.WindowManager.LayoutParams attributes4 = window3 != null ? window3.getAttributes() : null;
        if (attributes4 != null) {
            android.view.Window window4 = getWindow();
            attributes4.flags = ((window4 == null || (attributes = window4.getAttributes()) == null) ? 0 : attributes.flags) | 8 | 16;
        }
        android.view.Window window5 = getWindow();
        if (window5 != null) {
            window5.clearFlags(2);
        }
        android.view.Window window6 = getWindow();
        if (window6 != null) {
            window6.addFlags(67108864);
        }
        if (c()) {
            android.view.Window window7 = getWindow();
            if (window7 != null) {
                window7.addFlags(4);
            }
            android.view.Window window8 = getWindow();
            if (window8 != null) {
                window8.setBackgroundDrawableResource(com.tencent.mm.R.drawable.d0v);
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                com.tencent.mm.plugin.finder.view.v2 v2Var = new com.tencent.mm.plugin.finder.view.v2(this);
                android.view.Window window9 = getWindow();
                if (window9 != null && (decorView = window9.getDecorView()) != null) {
                    decorView.addOnAttachStateChangeListener(new com.tencent.mm.plugin.finder.view.u2(this, v2Var));
                }
            }
        } else {
            e(false);
        }
        super.onCreate(bundle);
        setContentView(this.f133279d);
        setTitle((java.lang.CharSequence) null);
    }
}
