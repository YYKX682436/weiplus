package com.tencent.mm.plugin.ting;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/ting/TingPlayerHalfProfileDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onFragmentViewCreate", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "Lrk4/z5;", "tingPlayerHalfProfileDialogType", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Lrk4/z5;)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TingPlayerHalfProfileDialogFragment extends androidx.fragment.app.DialogFragment implements androidx.lifecycle.x {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f174628p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f174629d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f174630e;

    /* renamed from: f, reason: collision with root package name */
    public final rk4.z5 f174631f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f174632g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f174633h;

    /* renamed from: i, reason: collision with root package name */
    public int f174634i;

    /* renamed from: m, reason: collision with root package name */
    public float f174635m;

    /* renamed from: n, reason: collision with root package name */
    public m40.p0 f174636n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f174637o;

    public TingPlayerHalfProfileDialogFragment(android.content.Context activityContext, android.content.Intent intent, rk4.z5 tingPlayerHalfProfileDialogType) {
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(tingPlayerHalfProfileDialogType, "tingPlayerHalfProfileDialogType");
        this.f174629d = activityContext;
        this.f174630e = intent;
        this.f174631f = tingPlayerHalfProfileDialogType;
        this.f174637o = new rk4.y5(this);
    }

    @Override // androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, android.R.style.Theme.Translucent);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.a4a, (android.view.ViewGroup) null);
        android.app.Dialog dialog = getDialog();
        kotlin.jvm.internal.o.d(dialog);
        dialog.requestWindowFeature(1);
        android.app.Dialog dialog2 = getDialog();
        kotlin.jvm.internal.o.d(dialog2);
        android.view.Window window = dialog2.getWindow();
        kotlin.jvm.internal.o.d(window);
        window.requestFeature(1);
        window.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        java.lang.Object systemService = activity != null ? activity.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        android.graphics.Point point = new android.graphics.Point();
        if (defaultDisplay != null) {
            defaultDisplay.getRealSize(point);
        }
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = (int) (point.y * 0.0d);
        attributes.gravity = 80;
        window.setAttributes(attributes);
        android.view.View decorView = window.getDecorView();
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        if (decorView != null) {
            decorView.setOutlineProvider(new zl5.a(true, false, b17));
        }
        if (decorView != null) {
            decorView.setClipToOutline(true);
        }
        window.setBackgroundDrawableResource(com.tencent.mm.R.color.a9e);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setBackgroundResource(com.tencent.mm.R.color.a9e);
        kotlin.jvm.internal.o.d(inflate);
        this.f174632g = inflate;
        android.app.Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnShowListener(new rk4.q5(this));
        }
        return inflate;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        android.view.View view = this.f174632g;
        if (view != null) {
            view.removeCallbacks(this.f174637o);
        } else {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        float f17 = this.f174635m;
        if (f17 >= 1.0f) {
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new rk4.r5(this));
        ofFloat.start();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void onFragmentViewCreate() {
        if (this.f174631f == rk4.z5.f397127e) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f174633h;
            if (vASCommonFragment == null) {
                kotlin.jvm.internal.o.o("profileFragment");
                throw null;
            }
            android.view.View view = vASCommonFragment.f211137i;
            com.google.android.material.appbar.AppBarLayout appBarLayout = view != null ? (com.google.android.material.appbar.AppBarLayout) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout") : null;
            if (appBarLayout != null) {
                appBarLayout.a(new rk4.s5(this));
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        super.onPause();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(0);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.view.View view = this.f174632g;
        if (view != null) {
            view.postDelayed(this.f174637o, 200L);
        } else {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
        android.view.View view3 = this.f174632g;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        layoutParams.height = -1;
        android.view.View view4 = this.f174632g;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view4.setLayoutParams(layoutParams);
        android.view.View view5 = this.f174632g;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view5.setBackgroundResource(com.tencent.mm.R.color.BW_100);
        androidx.fragment.app.i2 beginTransaction = getChildFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b(this.f174631f == rk4.z5.f397126d ? "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI" : "com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", this.f174630e, false, 4, null);
        this.f174633h = b17;
        b17.q0(new rk4.u5(this));
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f174633h;
        if (vASCommonFragment == null) {
            kotlin.jvm.internal.o.o("profileFragment");
            throw null;
        }
        vASCommonFragment.mo133getLifecycle().a(this);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f174633h;
        if (vASCommonFragment2 == null) {
            kotlin.jvm.internal.o.o("profileFragment");
            throw null;
        }
        beginTransaction.k(com.tencent.mm.R.id.l8l, vASCommonFragment2, null);
        beginTransaction.e();
        android.app.Dialog dialog2 = getDialog();
        kotlin.jvm.internal.o.d(dialog2);
        android.view.Window window = dialog2.getWindow();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            lm4.d dVar = new lm4.d(this.f174629d, viewGroup, new rk4.v5(this), new rk4.w5(this));
            dVar.setOnDragToClose(new rk4.x5(this));
            dVar.setBackgroundResource(com.tencent.mm.R.color.a9e);
            android.view.ViewGroup viewGroup2 = dVar.f319547d;
            android.view.View childAt = viewGroup2.getChildAt(0);
            dVar.f319550g = childAt;
            viewGroup2.removeView(childAt);
            dVar.addView(dVar.f319550g);
            viewGroup2.addView(dVar);
            android.view.View view6 = dVar.f319550g;
            float b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
            if (b18 > 0.0f) {
                if (view6 != null) {
                    view6.setOutlineProvider(new lm4.c(true, false, b18));
                }
                if (view6 != null) {
                    view6.setClipToOutline(true);
                }
            }
            int k17 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
            dVar.f319553m = k17;
            dVar.f319552i = k17 * 0.3f;
        }
    }
}
