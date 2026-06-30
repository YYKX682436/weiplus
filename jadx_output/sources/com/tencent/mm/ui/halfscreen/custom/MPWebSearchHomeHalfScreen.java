package com.tencent.mm.ui.halfscreen.custom;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/MPWebSearchHomeHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MPWebSearchHomeHalfScreen extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    public static final /* synthetic */ int Z = 0;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f208839J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout P;
    public float Q;
    public final jz5.g R;
    public final double S;
    public float T;
    public float U;
    public final com.tencent.mm.sdk.event.IListener V;
    public final com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen$setHeightEventListener$1 W;
    public final android.content.DialogInterface.OnShowListener X;
    public final yz5.a Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen$setHeightEventListener$1] */
    public MPWebSearchHomeHalfScreen(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new ch5.h0(this));
        this.H = jz5.h.b(new ch5.m0(this));
        this.I = jz5.h.b(new ch5.a1(this));
        this.f208839J = jz5.h.b(new ch5.n0(this));
        this.K = jz5.h.b(new ch5.z0(this));
        this.L = jz5.h.b(new ch5.l0(this));
        this.M = jz5.h.b(new ch5.o0(this));
        this.N = jz5.h.b(new ch5.p0(this));
        this.R = jz5.h.b(new ch5.v0(activityContext));
        this.S = getIntent().getDoubleExtra("INTENT_KEY_HALFSCREEN_HEIGHT_RATIO", 0.75d);
        this.V = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SetMPHalfScreenNotAnimEvent>() { // from class: com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen$eventListener$1
            {
                super(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.this);
                this.__eventId = 1560711498;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SetMPHalfScreenNotAnimEvent setMPHalfScreenNotAnimEvent) {
                android.view.Window window;
                com.tencent.mm.autogen.events.SetMPHalfScreenNotAnimEvent event = setMPHalfScreenNotAnimEvent;
                kotlin.jvm.internal.o.g(event, "event");
                android.app.Dialog dialog = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.this.getDialog();
                if (dialog != null && (window = dialog.getWindow()) != null) {
                    window.setWindowAnimations(0);
                }
                return false;
            }
        };
        this.W = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent>() { // from class: com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen$setHeightEventListener$1
            {
                super(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.this);
                this.__eventId = 1033669471;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent setMPHalfScreenHeightEvent) {
                com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent event = setMPHalfScreenHeightEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.bu buVar = event.f54767g;
                int i17 = buVar.f6285a;
                com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.this;
                if (i17 != ((java.lang.Number) ((jz5.n) mPWebSearchHomeHalfScreen.M).getValue()).intValue()) {
                    return false;
                }
                com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = mPWebSearchHomeHalfScreen.P;
                if (wSHalfScreenDraggableLayout != null) {
                    float f17 = buVar.f6288d;
                    float f18 = buVar.f6286b;
                    float f19 = buVar.f6287c;
                    wSHalfScreenDraggableLayout.f208851p = buVar.f6289e;
                    if (f17 >= 0.0f || f18 > 0.0f) {
                        pm0.v.X(new ch5.l1(f17, wSHalfScreenDraggableLayout, f18, f19));
                    }
                    event.f54768h.f6404a = true;
                }
                return true;
            }
        };
        this.X = new ch5.y0(this);
        this.Y = new ch5.k0(this);
    }

    public static final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        return (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) ((jz5.n) mPWebSearchHomeHalfScreen.L).getValue();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public void A0(com.tencent.mm.ui.vas.VASActivity vASActivity) {
        super.A0(vASActivity);
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.P;
        if (wSHalfScreenDraggableLayout != null) {
            wSHalfScreenDraggableLayout.setDragEnableBlock(new ch5.q0(this));
        }
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout2 = this.P;
        if (wSHalfScreenDraggableLayout2 == null) {
            return;
        }
        wSHalfScreenDraggableLayout2.setDragStatusBlock(new ch5.r0(this));
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public void B0(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        window.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        super.dismiss();
        android.view.View view = (android.view.View) ((jz5.n) this.R).getValue();
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.0f)) == null) {
            return;
        }
        alpha.setInterpolator(ta5.h.f416879a.a());
        alpha.setDuration(300L);
        alpha.start();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.efe;
    }

    @Override // androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.V.alive();
        alive();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog onCreateDialog = super.onCreateDialog(bundle);
        android.view.Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(q0());
        }
        return onCreateDialog;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.V.dead();
        dead();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.P;
        if (wSHalfScreenDraggableLayout != null) {
            wSHalfScreenDraggableLayout.setOnClickCallback(null);
        }
        ((ch5.k0) this.Y).invoke();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        yz5.l lVar = (yz5.l) ((jz5.n) this.I).getValue();
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        yz5.l lVar = (yz5.l) ((jz5.n) this.I).getValue();
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout;
        int c17;
        int c18;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        n3.m0.a(view, new ch5.s0(this));
        if (!((java.lang.Boolean) ((jz5.n) this.H).getValue()).booleanValue() || (wSHalfScreenDraggableLayout = (com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout) t0().findViewById(com.tencent.mm.R.id.u19)) == null) {
            wSHalfScreenDraggableLayout = null;
        } else {
            int p07 = p0();
            android.content.Context context = getContext();
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            if (com.tencent.mm.ui.b4.c(context)) {
                kotlin.jvm.internal.o.d(context);
                c17 = com.tencent.mm.ui.cl.c(context);
            } else {
                c17 = com.tencent.mm.ui.bl.c(context);
            }
            int w07 = (int) ((w0() - c17) * this.S);
            wSHalfScreenDraggableLayout.f208842d = p07 - w07;
            wSHalfScreenDraggableLayout.f208843e = w07;
            wSHalfScreenDraggableLayout.f208846h = o0();
            wSHalfScreenDraggableLayout.f208850o = p07;
            wSHalfScreenDraggableLayout.f208851p = true;
            wSHalfScreenDraggableLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ch5.f1(wSHalfScreenDraggableLayout));
            android.view.View o07 = o0();
            android.content.Context context2 = getContext();
            if (context2 == null) {
                context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            if (com.tencent.mm.ui.b4.c(context2)) {
                kotlin.jvm.internal.o.d(context2);
                c18 = com.tencent.mm.ui.cl.c(context2);
            } else {
                c18 = com.tencent.mm.ui.bl.c(context2);
            }
            o07.setTranslationY(p07 - ((int) ((w0() - c18) * r3)));
            wSHalfScreenDraggableLayout.setDragTranslationListener(new ch5.e0(this));
            wSHalfScreenDraggableLayout.setDragFullScreenListener(new ch5.f0(this));
        }
        this.P = wSHalfScreenDraggableLayout;
        if (wSHalfScreenDraggableLayout != null) {
            wSHalfScreenDraggableLayout.setOnClickCallback(new ch5.g0(this));
        }
        tk5.a b17 = u0().b();
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = b17 instanceof com.tencent.mm.ui.vas.VASCommonFragment ? (com.tencent.mm.ui.vas.VASCommonFragment) b17 : null;
        if (vASCommonFragment != null) {
            vASCommonFragment.q0(new ch5.u0(this));
        }
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int p0() {
        int c17;
        android.content.Context context = getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (com.tencent.mm.ui.b4.c(context)) {
            kotlin.jvm.internal.o.d(context);
            c17 = com.tencent.mm.ui.cl.c(context);
        } else {
            c17 = com.tencent.mm.ui.bl.c(context);
        }
        return w0() - c17;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public float s0() {
        return 0.0f;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    /* renamed from: x0, reason: from getter */
    public android.content.DialogInterface.OnShowListener getX() {
        return this.X;
    }
}
