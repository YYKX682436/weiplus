package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class f5 extends com.tencent.mm.ui.tools.w4 {

    /* renamed from: x, reason: collision with root package name */
    public static int f210399x = 1;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.ui.tools.c5 f210400e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.ui.tools.g5 f210401f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f210402g;

    /* renamed from: m, reason: collision with root package name */
    public volatile android.view.View f210405m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.app.Activity f210406n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f210407o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f210408p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210410r;

    /* renamed from: s, reason: collision with root package name */
    public int f210411s;

    /* renamed from: t, reason: collision with root package name */
    public int f210412t;

    /* renamed from: u, reason: collision with root package name */
    public volatile int f210413u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f210414v;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f210403h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f210404i = new android.graphics.Rect();

    /* renamed from: q, reason: collision with root package name */
    public boolean f210409q = false;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f210415w = true;

    /* JADX WARN: Multi-variable type inference failed */
    public f5(android.app.Activity activity) {
        this.f210410r = true;
        this.f210406n = activity;
        this.f210873d = activity;
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        if (activity instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) activity).mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.ui.tools.KeyboardHeightProvider$1
                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onDestroy(androidx.lifecycle.y yVar) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "onDestroy: addObserver ");
                    com.tencent.mm.ui.tools.f5.this.d();
                    com.tencent.mm.ui.tools.f5.this.f210406n = null;
                }
            });
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "KeyboardHeightProvider: activity is not MMFragmentActivity:%s", activity);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if ((activity.getWindow().getAttributes().softInputMode & 240) != 48) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "activity soft input should be adjust nothing");
            this.f210410r = false;
        }
        this.f210405m = activity.findViewById(android.R.id.content);
        this.f210407o = new com.tencent.mm.ui.tools.d5(this);
        this.f210408p = new com.tencent.mm.ui.tools.e5(this);
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        if (identifier > 0) {
            this.f210413u = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f210414v = i65.a.b(activity, 96);
    }

    public static void c(com.tencent.mm.ui.tools.f5 f5Var) {
        int i17;
        android.view.DisplayCutout displayCutout;
        int safeInsetBottom;
        f5Var.f210402g.getWindowVisibleDisplayFrame(f5Var.f210403h);
        f5Var.f210405m.getWindowVisibleDisplayFrame(f5Var.f210404i);
        int i18 = f5Var.f210403h.bottom;
        if (i18 > f5Var.f210411s) {
            f5Var.f210411s = i18;
        }
        int i19 = f5Var.f210404i.bottom;
        if (i19 > f5Var.f210412t) {
            f5Var.f210412t = i19;
        }
        int i27 = f5Var.f210412t;
        int i28 = f5Var.f210411s;
        int i29 = i27 - i28;
        boolean z17 = true;
        if (f5Var.f210410r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == true, %s, %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(f5Var.f210403h.bottom));
            i17 = f5Var.f210404i.bottom - f5Var.f210403h.bottom;
            if (fp.h.c(28) && f5Var.f210405m.getRootWindowInsets() != null && (displayCutout = f5Var.f210405m.getRootWindowInsets().getDisplayCutout()) != null && (safeInsetBottom = displayCutout.getSafeInsetBottom()) == i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: has cutout bottom, %s", java.lang.Integer.valueOf(safeInsetBottom));
                i17 -= safeInsetBottom;
            }
            if (i17 == f5Var.f210413u && f5Var.f210413u != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: navigationHeight %d, %d, %d", java.lang.Integer.valueOf(f5Var.f210411s), java.lang.Integer.valueOf(f5Var.f210412t), java.lang.Integer.valueOf(f5Var.f210413u));
                i17 -= f5Var.f210413u;
                jx3.f.INSTANCE.t(1062, 5);
            }
            if (i17 == i29 && i29 > 0 && i29 < f5Var.f210414v) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: max bottom diff %d, %d, %d", java.lang.Integer.valueOf(f5Var.f210411s), java.lang.Integer.valueOf(f5Var.f210412t), java.lang.Integer.valueOf(i29));
                i17 -= i29;
                jx3.f.INSTANCE.t(1062, 6);
            }
            if (i17 != 0 || f5Var.f210412t - f5Var.f210404i.bottom <= f5Var.f210414v) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: adjust nothing not work!");
                i17 = f5Var.f210412t - f5Var.f210404i.bottom;
                jx3.f.INSTANCE.t(1062, 7);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == false, %s, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(f5Var.f210403h.bottom));
            i17 = f5Var.f210411s - f5Var.f210403h.bottom;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", f5Var.f210403h.toShortString(), f5Var.f210404i.toShortString());
        f5Var.e(i17, z17);
    }

    @Override // com.tencent.mm.ui.tools.w4
    public void b(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "onNotifyKeyBoardHeightChange() called with: height = [" + i17 + "], isShow = [" + z17 + "]");
        e(i17, this.f210410r ^ true);
        if (this.f210401f != null) {
            ((te2.y1) this.f210401f).getClass();
            gk2.e eVar = dk2.ef.I;
            if (eVar == null || (liveMutableData = ((mm2.e1) eVar.a(mm2.e1.class)).B) == null) {
                return;
            }
            liveMutableData.postValue(java.lang.Boolean.valueOf(z17));
        }
    }

    public void d() {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "close: ");
        if (this.f210406n == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "close: activity is null");
            return;
        }
        int i17 = f210399x;
        int i18 = 31;
        if (i17 != 1 && i17 == 0) {
            i18 = 30;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "close: version:%s", java.lang.Integer.valueOf(i18));
        if (fp.h.c(i18)) {
            if (fp.h.c(30)) {
                com.tencent.mm.ui.tools.b5.f210297a.b(this);
                return;
            }
            return;
        }
        if (this.f210405m != null) {
            this.f210405m.getViewTreeObserver().removeOnGlobalLayoutListener(this.f210408p);
        }
        if (this.f210409q && (view = this.f210402g) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f210407o);
            try {
                this.f210406n.getWindowManager().removeView(this.f210402g);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
            }
            this.f210402g = null;
        }
        this.f210409q = false;
    }

    public final void e(int i17, boolean z17) {
        if (this.f210400e != null) {
            this.f210400e.w2(i17, z17);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "notifyKeyboardHeightChanged: observer is null, height=%d, isResized=%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        }
    }

    public void f() {
        if (this.f210406n == null || this.f210406n.getWindow() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity or activity.getWindow() is null");
            return;
        }
        if ((this.f210406n.getWindow().getAttributes().softInputMode & 240) != 48) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
            this.f210410r = false;
        } else {
            this.f210410r = true;
        }
        if (this.f210405m == null) {
            this.f210405m = this.f210406n.findViewById(android.R.id.content);
        }
        int i17 = f210399x;
        int i18 = 31;
        if (i17 != 1 && i17 == 0) {
            i18 = 30;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "start: version:%s", java.lang.Integer.valueOf(i18));
        if (fp.h.c(i18) && this.f210415w) {
            if (fp.h.c(30)) {
                com.tencent.mm.ui.tools.b5.f210297a.a(this, this.f210406n, false);
                return;
            }
            return;
        }
        if (this.f210405m != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "start: %s, %s", java.lang.Boolean.valueOf(this.f210409q), this.f210405m.getWindowToken());
            if (this.f210409q || this.f210405m.getWindowToken() == null || this.f210406n.isFinishing()) {
                return;
            }
            this.f210409q = true;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.f210406n);
            this.f210402g = linearLayout;
            linearLayout.setBackgroundColor(0);
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(1003, 131096, 1);
            layoutParams.width = 0;
            layoutParams.height = -1;
            layoutParams.gravity = 8388659;
            layoutParams.softInputMode = 16;
            layoutParams.setTitle("KeyboardWindow@" + hashCode());
            try {
                this.f210406n.getWindowManager().addView(this.f210402g, layoutParams);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
                this.f210409q = false;
                this.f210402g = null;
            }
            if (this.f210409q) {
                this.f210402g.getViewTreeObserver().addOnGlobalLayoutListener(this.f210407o);
                this.f210405m.getViewTreeObserver().addOnGlobalLayoutListener(this.f210408p);
            }
            this.f210411s = 0;
            this.f210412t = 0;
            if ((this.f210406n.getWindow().getAttributes().softInputMode & 240) == 48) {
                this.f210410r = true;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
                this.f210410r = false;
            }
        }
    }
}
