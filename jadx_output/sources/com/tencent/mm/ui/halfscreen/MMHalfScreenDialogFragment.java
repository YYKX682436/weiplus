package com.tencent.mm.ui.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/x;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class MMHalfScreenDialogFragment extends androidx.fragment.app.DialogFragment implements androidx.lifecycle.x {
    public static final /* synthetic */ int F = 0;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public java.lang.Integer D;
    public final bh5.q0 E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f208803d;

    /* renamed from: e, reason: collision with root package name */
    public final dh5.a f208804e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f208805f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f208806g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f208807h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f208808i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f208809m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f208810n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f208811o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout f208812p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f208813q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f208814r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.DialogInterface.OnShowListener f208815s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f208816t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f208817u;

    /* renamed from: v, reason: collision with root package name */
    public int f208818v;

    /* renamed from: w, reason: collision with root package name */
    public final bh5.a0 f208819w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f208820x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f208821y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f208822z;

    public MMHalfScreenDialogFragment(android.content.Context activityContext, dh5.a halfScreenParam) {
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
        this.f208803d = activityContext;
        this.f208804e = halfScreenParam;
        this.f208805f = "MMHalfScreen.DialogFragment" + hashCode();
        setArguments(new android.os.Bundle());
        android.view.View view = getView();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/ui/halfscreen/param/HalfScreenStartParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/ui/halfscreen/param/HalfScreenStartParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f208806g = jz5.h.b(new bh5.b0(this));
        this.f208807h = jz5.h.b(bh5.t0.f20962d);
        this.f208808i = jz5.h.b(bh5.s0.f20960d);
        this.f208809m = jz5.h.b(new bh5.m(this));
        this.f208815s = bh5.u0.f20964d;
        this.f208816t = jz5.h.b(new bh5.r0(this));
        this.f208819w = new bh5.a0(this);
        this.f208820x = jz5.h.b(new bh5.p0(this));
        this.f208821y = jz5.h.b(new bh5.u(this));
        this.f208822z = jz5.h.b(new bh5.q(this));
        this.A = jz5.h.b(new bh5.p(this));
        this.B = jz5.h.b(new bh5.o(this));
        this.C = jz5.h.b(new bh5.n(this));
        this.E = new bh5.q0(this);
    }

    public static final boolean l0(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment, android.view.MotionEvent motionEvent) {
        boolean z17;
        mMHalfScreenDialogFragment.getClass();
        if (motionEvent.getAction() == 0) {
            android.view.View o07 = mMHalfScreenDialogFragment.o0();
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int[] iArr = new int[2];
            o07.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            int measuredWidth = o07.getMeasuredWidth() + i17;
            int measuredHeight = o07.getMeasuredHeight() + i18;
            if (i17 <= rawX && rawX <= measuredWidth) {
                if (i18 <= rawY && rawY <= measuredHeight) {
                    z17 = true;
                    mMHalfScreenDialogFragment.f208817u = z17;
                }
            }
            z17 = false;
            mMHalfScreenDialogFragment.f208817u = z17;
        }
        if (!mMHalfScreenDialogFragment.f208817u) {
            return true;
        }
        tk5.a b17 = mMHalfScreenDialogFragment.u0().b();
        if (b17 != null) {
            return b17.i();
        }
        return false;
    }

    public void A0(com.tencent.mm.ui.vas.VASActivity vASActivity) {
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = this.f208812p;
        if (halfScreenPullDownCloseLayout != null) {
            halfScreenPullDownCloseLayout.setDragEnableBlock(new bh5.l0(this));
        }
        if (this.f208804e.s() || vASActivity == null) {
            return;
        }
        vASActivity.setVasFinishInterceptor(new bh5.m0(vASActivity, this));
    }

    public void B0(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        window.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
    }

    public final android.content.Intent getIntent() {
        return (android.content.Intent) ((jz5.n) this.f208806g).getValue();
    }

    public int getLayoutId() {
        return com.tencent.mm.R.layout.bj9;
    }

    public bh5.l m0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f208805f, "onCreateView() called with: isHonor:%s isHUAWEI:%s SDK_INT:%s", java.lang.Boolean.valueOf(fp.e0.b()), java.lang.Boolean.valueOf(fp.e0.c()), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        return new bh5.l(context, com.tencent.mm.R.style.f494300jb);
    }

    public boolean n0() {
        return this instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHalfScreenDialogFragment;
    }

    public final android.view.View o0() {
        android.view.View view = this.f208811o;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("activityContainer");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.view.Window window;
        android.view.Window window2;
        android.view.View decorView;
        java.util.Objects.toString(bundle);
        bh5.l m07 = m0(this.f208803d);
        m07.f20943d = new bh5.c0(this);
        android.view.Window window3 = m07.getWindow();
        if (window3 != null) {
            B0(window3);
            android.view.WindowManager.LayoutParams attributes = window3.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window3.setAttributes(attributes);
        }
        if (n0() && (window2 = m07.getWindow()) != null && (decorView = window2.getDecorView()) != null) {
            decorView.setSystemUiVisibility(6);
        }
        if (z0() && (window = m07.getWindow()) != null) {
            window.setLayout(-1, -1);
            try {
                window.getDecorView();
                n3.h2.a(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                int i17 = android.os.Build.VERSION.SDK_INT;
                if (i17 >= 28) {
                    int i18 = i17 >= 30 ? 3 : 1;
                    android.view.WindowManager.LayoutParams attributes2 = window.getAttributes();
                    if (attributes2.layoutInDisplayCutoutMode != i18) {
                        attributes2.layoutInDisplayCutoutMode = i18;
                        window.setAttributes(attributes2);
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
        return m07;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflaterOri, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        kotlin.jvm.internal.o.g(inflaterOri, "inflaterOri");
        inflaterOri.toString();
        java.util.Objects.toString(viewGroup);
        java.util.Objects.toString(bundle);
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = null;
        android.view.View inflate = android.view.LayoutInflater.from(this.f208803d).inflate(getLayoutId(), (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.d(inflate);
        this.f208810n = inflate;
        t0().setOnClickListener(new bh5.d0(this));
        android.view.View findViewById = t0().findViewById(com.tencent.mm.R.id.gwe);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f208811o = findViewById;
        android.view.View findViewById2 = t0().findViewById(com.tencent.mm.R.id.f487530ow1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f208813q = findViewById2;
        android.view.View findViewById3 = t0().findViewById(com.tencent.mm.R.id.u1d);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f208814r = findViewById3;
        if (z0()) {
            android.app.Dialog dialog = getDialog();
            if (dialog != null && (window3 = dialog.getWindow()) != null) {
                java.lang.String simpleName = getClass().getSimpleName();
                android.view.View peekDecorView = window3.peekDecorView();
                android.view.ViewGroup viewGroup2 = peekDecorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) peekDecorView : null;
                if (viewGroup2 != null) {
                    viewGroup2.setOnHierarchyChangeListener(new com.tencent.mm.ui.w3(simpleName));
                }
            }
            y0().toString();
            y0().setBackgroundColor(q0());
            com.tencent.mm.ui.a4.f197117a.m(y0(), new bh5.r(this), this);
            android.app.Dialog dialog2 = getDialog();
            if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                new n3.m3(window2, window2.getDecorView()).b(true);
            }
        }
        dh5.a aVar = this.f208804e;
        if (aVar.k()) {
            halfScreenPullDownCloseLayout = (com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout) t0().findViewById(com.tencent.mm.R.id.gwq);
        } else {
            android.view.View findViewById4 = t0().findViewById(com.tencent.mm.R.id.gwq);
            if (findViewById4 != null) {
                findViewById4.setOnTouchListener(bh5.e0.f20929d);
            }
        }
        this.f208812p = halfScreenPullDownCloseLayout;
        if (halfScreenPullDownCloseLayout != null) {
            halfScreenPullDownCloseLayout.setRecordDragPosition(aVar.r());
        }
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout2 = this.f208812p;
        if (halfScreenPullDownCloseLayout2 != null) {
            halfScreenPullDownCloseLayout2.f208792f = o0();
        }
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout3 = this.f208812p;
        if (halfScreenPullDownCloseLayout3 != null) {
            halfScreenPullDownCloseLayout3.setPullDownCallback(this.E);
        }
        android.view.View o07 = o0();
        o07.setOutlineProvider(new zl5.a(true, false, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12)));
        o07.setClipToOutline(true);
        android.app.Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnShowListener(bh5.h0.f20937d);
        }
        android.app.Dialog dialog4 = getDialog();
        if (dialog4 != null && (window = dialog4.getWindow()) != null) {
            window.setDimAmount(s0());
        }
        return inflate;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (z0()) {
            android.view.View y07 = y0();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(y07, null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        com.tencent.mars.xlog.Log.i(this.f208805f, "onDismiss");
        super.onDismiss(dialog);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        bh5.j0 j0Var = bh5.j0.f20941d;
        bh5.i0 i0Var = new bh5.i0(ofFloat, j0Var);
        ofFloat.addUpdateListener(j0Var);
        ofFloat.addListener(i0Var);
        ofFloat.start();
        yz5.a aVar = this.f208804e.f232620f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        android.view.Window window;
        android.view.View decorView;
        super.onResume();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new bh5.k0(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        com.tencent.mars.xlog.Log.i(this.f208805f, "onStart called");
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(getX());
        }
        super.onStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        int p07 = p0();
        this.f208818v = p07;
        android.view.ViewGroup.LayoutParams layoutParams = o0().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = p07;
            o0().setLayoutParams(layoutParams);
        }
        int r07 = r0();
        android.view.ViewGroup.LayoutParams layoutParams2 = o0().getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = r07;
            o0().setLayoutParams(layoutParams2);
        }
        dh5.a aVar = this.f208804e;
        bh5.k kVar = aVar.f232621g;
        java.util.Objects.toString(kVar);
        if (kVar != null) {
            com.tencent.mm.ui.halfscreen.ViewCreatorFragment viewCreatorFragment = new com.tencent.mm.ui.halfscreen.ViewCreatorFragment(kVar);
            viewCreatorFragment.f208825f = new bh5.x(this);
            vASCommonFragment = viewCreatorFragment;
        } else {
            com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b(aVar.j(), getIntent(), false, 4, null);
            b17.q0(new bh5.z(this));
            vASCommonFragment = b17;
        }
        u0().c(vASCommonFragment, aVar.p());
    }

    public int p0() {
        return ((java.lang.Number) ((jz5.n) this.f208809m).getValue()).intValue();
    }

    public int q0() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478494f);
    }

    public int r0() {
        return -1;
    }

    public float s0() {
        return 0.5f;
    }

    public final android.view.View t0() {
        android.view.View view = this.f208810n;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("rootView");
        throw null;
    }

    public final tk5.c u0() {
        return (tk5.c) ((jz5.n) this.f208816t).getValue();
    }

    public final int w0() {
        return ((java.lang.Number) ((jz5.n) this.f208808i).getValue()).intValue();
    }

    /* renamed from: x0, reason: from getter */
    public android.content.DialogInterface.OnShowListener getX() {
        return this.f208815s;
    }

    public final android.view.View y0() {
        android.view.View view = this.f208814r;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("vNavigationBar");
        throw null;
    }

    public final boolean z0() {
        return com.tencent.mm.ui.b4.c(getContext()) && !this.f208804e.n() && ((this instanceof com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen) ^ true);
    }
}
