package hu0;

/* loaded from: classes5.dex */
public final class a0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f285008d;

    /* renamed from: e, reason: collision with root package name */
    public io.clipworks.displaysys.DSRenderView f285009e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f285010f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f285011g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f285012h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f285013i;

    /* renamed from: m, reason: collision with root package name */
    public hu0.p f285014m;

    /* renamed from: n, reason: collision with root package name */
    public int f285015n;

    /* renamed from: o, reason: collision with root package name */
    public float f285016o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f285008d = jz5.h.b(hu0.y.f285064d);
        this.f285014m = hu0.p.f285045d;
    }

    public final void O6(int i17, float f17) {
        android.widget.FrameLayout frameLayout = this.f285010f;
        if (frameLayout == null) {
            return;
        }
        java.lang.Object parent = frameLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null && frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0 && view.getWidth() > 0 && view.getHeight() > 0) {
            float e17 = e06.p.e(f17, 0.0f, 1.0f);
            this.f285016o = e17;
            float paddingTop = view.getPaddingTop();
            float f18 = paddingTop >= 0.0f ? paddingTop : 0.0f;
            float height = (view.getHeight() - i17) - f18;
            float f19 = (int) (80 * getActivity().getResources().getDisplayMetrics().density);
            if (height < f19) {
                height = f19;
            }
            float e18 = ((e06.p.e(height / frameLayout.getHeight(), 0.1f, 1.0f) - 1.0f) * e17) + 1.0f;
            frameLayout.setPivotX(frameLayout.getWidth() / 2.0f);
            frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
            frameLayout.setScaleX(e18);
            frameLayout.setScaleY(e18);
            frameLayout.setTranslationX(((view.getWidth() / 2.0f) - (frameLayout.getLeft() + (frameLayout.getWidth() / 2.0f))) * e17);
            frameLayout.setTranslationY(((f18 + (height / 2.0f)) - (frameLayout.getTop() + (frameLayout.getHeight() / 2.0f))) * e17);
            android.view.View view2 = this.f285012h;
            if (view2 != null) {
                if (e17 < 1.0f) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                view2.setTranslationY((-view2.getHeight()) * e17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f - e17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                if (e17 >= 1.0f) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.widget.FrameLayout frameLayout2 = this.f285011g;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setAlpha(1.0f - e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu0.a0.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Q6() {
        android.animation.ValueAnimator valueAnimator = this.f285013i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f285013i = null;
    }

    public final int R6() {
        int intValue;
        android.view.View rootView;
        android.view.Display defaultDisplay;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = getActivity().getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(displayMetrics.heightPixels);
        java.lang.Integer num = null;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            android.widget.FrameLayout frameLayout = this.f285010f;
            if (frameLayout != null && (rootView = frameLayout.getRootView()) != null) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(rootView.getHeight());
                if (valueOf2.intValue() > 0) {
                    num = valueOf2;
                }
            }
            intValue = num != null ? num.intValue() : getActivity().getResources().getDisplayMetrics().heightPixels;
        }
        return (int) (intValue * 0.65d);
    }

    public final gu0.k2 S6() {
        return (gu0.k2) ((jz5.n) this.f285008d).getValue();
    }

    public final void T6() {
        android.view.ViewTreeObserver viewTreeObserver;
        eu0.b bVar;
        com.tencent.mars.xlog.Log.i("MJCC.RenderUIC", "onEditPanelCloseEnd");
        this.f285014m = hu0.p.f285045d;
        Q6();
        this.f285016o = 0.0f;
        this.f285015n = 0;
        android.widget.FrameLayout frameLayout = this.f285010f;
        if (frameLayout != null) {
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
            frameLayout.setTranslationX(0.0f);
            frameLayout.setTranslationY(0.0f);
        }
        android.view.View view = this.f285012h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationY(0.0f);
            view.setEnabled(true);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gu0.k2 S6 = S6();
        boolean b17 = kotlin.jvm.internal.o.b((S6 == null || (bVar = S6.f275725a) == null) ? null : bVar.f256695a, "reedit");
        android.widget.FrameLayout frameLayout2 = this.f285011g;
        if (frameLayout2 != null) {
            frameLayout2.setAlpha(1.0f);
            frameLayout2.setVisibility(b17 ? 8 : 0);
        }
        android.widget.FrameLayout frameLayout3 = this.f285010f;
        if (frameLayout3 == null || (viewTreeObserver = frameLayout3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new hu0.q(frameLayout3));
    }

    public final void U6(boolean z17) {
        android.widget.FrameLayout frameLayout;
        eu0.b bVar;
        gu0.k2 S6 = S6();
        if (kotlin.jvm.internal.o.b((S6 == null || (bVar = S6.f275725a) == null) ? null : bVar.f256695a, "reedit") || (frameLayout = this.f285011g) == null) {
            return;
        }
        frameLayout.setEnabled(z17);
        if (this.f285014m == hu0.p.f285045d) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(z17 ? 1.0f : 0.5f);
        }
    }

    public final void V6(float f17, float f18, int i17) {
        Q6();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(e06.p.e(f17, 0.0f, 1.0f), e06.p.e(f18, 0.0f, 1.0f));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new hu0.z(f18, this, i17));
        ofFloat.start();
        this.f285013i = ofFloat;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MJCC.RenderUIC", "onDestroy");
        Q6();
        io.clipworks.displaysys.DSRenderView dSRenderView = this.f285009e;
        if (dSRenderView != null) {
            android.view.ViewParent parent = dSRenderView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(dSRenderView);
            }
        }
        this.f285009e = null;
        this.f285010f = null;
        this.f285011g = null;
        this.f285012h = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        eu0.b bVar;
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f285010f = (android.widget.FrameLayout) contentView.findViewById(com.tencent.mm.R.id.sxg);
        this.f285012h = contentView.findViewById(com.tencent.mm.R.id.sok);
        android.widget.FrameLayout frameLayout = this.f285010f;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new hu0.q(frameLayout));
        }
        gu0.k2 S6 = S6();
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = null;
        boolean b17 = kotlin.jvm.internal.o.b((S6 == null || (bVar = S6.f275725a) == null) ? null : bVar.f256695a, "reedit");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout2 = (com.tencent.mm.ui.widget.RoundCornerFrameLayout) contentView.findViewById(com.tencent.mm.R.id.sxd);
        if (roundCornerFrameLayout2 != null) {
            roundCornerFrameLayout2.setOnClickListener(new hu0.x(this));
            if (b17) {
                roundCornerFrameLayout2.setVisibility(8);
            }
            roundCornerFrameLayout = roundCornerFrameLayout2;
        }
        this.f285011g = roundCornerFrameLayout;
        com.tencent.mars.xlog.Log.i("MJCC.RenderUIC", "onViewCreated: renderContainer=" + this.f285010f + ", isReedit=" + b17);
    }
}
