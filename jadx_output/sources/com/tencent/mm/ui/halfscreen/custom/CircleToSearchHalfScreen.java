package com.tencent.mm.ui.halfscreen.custom;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/CircleToSearchHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CircleToSearchHalfScreen extends com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment {
    public static final /* synthetic */ int U = 0;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f208837J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public com.tencent.mm.ui.vas.VASActivity P;
    public com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout Q;
    public float R;
    public final com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen$setHeightEventListener$1 S;
    public final yz5.a T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen$setHeightEventListener$1] */
    public CircleToSearchHalfScreen(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
        hashCode();
        this.G = jz5.h.b(new ch5.n(this));
        this.H = jz5.h.b(new ch5.s(this));
        this.I = jz5.h.b(new ch5.b0(this));
        this.f208837J = jz5.h.b(new ch5.t(this));
        this.K = jz5.h.b(new ch5.a0(this));
        this.L = jz5.h.b(new ch5.r(this));
        this.M = jz5.h.b(new ch5.v(this));
        this.N = jz5.h.b(new ch5.u(this));
        this.S = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent>() { // from class: com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen$setHeightEventListener$1
            {
                super(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.this);
                this.__eventId = 1033669471;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent setMPHalfScreenHeightEvent) {
                com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent event = setMPHalfScreenHeightEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.bu buVar = event.f54767g;
                int i17 = buVar.f6285a;
                com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.this;
                if (i17 != ((java.lang.Number) ((jz5.n) circleToSearchHalfScreen.N).getValue()).intValue()) {
                    return false;
                }
                com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = circleToSearchHalfScreen.Q;
                if (circleToSearchDraggableLayout != null) {
                    circleToSearchDraggableLayout.b(buVar.f6286b, buVar.f6287c, new ch5.z(buVar, circleToSearchHalfScreen));
                }
                event.f54768h.f6404a = true;
                return true;
            }
        };
        this.T = new ch5.q(this);
    }

    public static final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        return (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) ((jz5.n) circleToSearchHalfScreen.L).getValue();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public void A0(com.tencent.mm.ui.vas.VASActivity vASActivity) {
        super.A0(vASActivity);
        this.P = vASActivity;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        if (vASActivity != null) {
            vASActivity.setVasFinishInterceptor(new ch5.x(c0Var, this, vASActivity));
        }
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.Q;
        if (circleToSearchDraggableLayout != null) {
            circleToSearchDraggableLayout.setDragFinishInterceptor(new ch5.y(this));
        }
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout2 = this.Q;
        if (circleToSearchDraggableLayout2 == null) {
            return;
        }
        circleToSearchDraggableLayout2.setDragStatusBlock((yz5.p) ((jz5.n) this.K).getValue());
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public void B0(android.view.Window window) {
        kotlin.jvm.internal.o.g(window, "window");
        window.setWindowAnimations(0);
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e0_;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public bh5.l m0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new ch5.k(context, 0, 2, null);
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public boolean n0() {
        return ((java.lang.Boolean) ((jz5.n) this.M).getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
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
            window.setNavigationBarColor(this.f208804e.o() ? 0 : -16777216);
        }
        return onCreateDialog;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflaterOri, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflaterOri, "inflaterOri");
        android.view.View onCreateView = super.onCreateView(inflaterOri, viewGroup, bundle);
        onCreateView.setOnClickListener(null);
        onCreateView.setClickable(false);
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dead();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        ((ch5.q) this.T).invoke();
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
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        if (!((java.lang.Boolean) ((jz5.n) this.H).getValue()).booleanValue() || (circleToSearchDraggableLayout = (com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout) t0().findViewById(com.tencent.mm.R.id.u19)) == null) {
            circleToSearchDraggableLayout = null;
        } else {
            circleToSearchDraggableLayout.f208829f = o0();
            int intValue = ((java.lang.Number) ((jz5.n) this.G).getValue()).intValue();
            circleToSearchDraggableLayout.f208833m = intValue - 10;
            android.view.View view2 = circleToSearchDraggableLayout.f208829f;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.height = intValue;
                android.view.View view3 = circleToSearchDraggableLayout.f208829f;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams);
                }
            }
            circleToSearchDraggableLayout.setDragTranslationListener(new ch5.l(this));
            circleToSearchDraggableLayout.setDragFullScreenListener(new ch5.m(this));
        }
        this.Q = circleToSearchDraggableLayout;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int p0() {
        return ((java.lang.Number) ((jz5.n) this.G).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public int q0() {
        return -16777216;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public float s0() {
        return 0.0f;
    }
}
