package qt2;

/* loaded from: classes2.dex */
public final class h0 extends qt2.f0 {
    public final int A;
    public com.tencent.mm.plugin.finder.ui.o6 B;
    public boolean C;
    public boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.A = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
        this.D = true;
    }

    @Override // qt2.j
    public void O6(int i17, long j17, float f17) {
        android.view.animation.LinearInterpolator linearInterpolator;
        android.view.View view = this.f366588e;
        if (view != null && view.getVisibility() == 8) {
            return;
        }
        int i18 = -i17;
        if (this.C) {
            i18 += com.tencent.mm.ui.bh.a(getActivity()).f197136b;
            linearInterpolator = null;
        } else {
            linearInterpolator = new android.view.animation.LinearInterpolator();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
        if (recyclerView != null) {
            recyclerView.b1(0, i18, linearInterpolator);
        }
        android.view.View view2 = this.f366588e;
        if (view2 != null) {
            view2.removeCallbacks(this.f366574t);
        }
        android.view.View view3 = this.f366588e;
        if (view3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.D) {
            g7("setupCallbacks");
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f366590g;
            if (recyclerView2 != null) {
                recyclerView2.postDelayed(new qt2.g0(this), 260L);
            }
        }
        this.f366578x = false;
    }

    @Override // qt2.f0, qt2.j
    public int Q6() {
        return com.tencent.mm.R.id.mcg;
    }

    @Override // qt2.f0, qt2.j
    public void S6(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        android.view.View view = this.f366588e;
        if (view != null) {
            view.setPadding(0, 0, 0, this.A);
        }
        android.view.View view2 = this.f366588e;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.drawable.d4d);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f366590g;
        androidx.recyclerview.widget.u2 onFlingListener = recyclerView2 != null ? recyclerView2.getOnFlingListener() : null;
        this.B = onFlingListener instanceof com.tencent.mm.plugin.finder.ui.o6 ? (com.tencent.mm.plugin.finder.ui.o6) onFlingListener : null;
    }

    @Override // qt2.j
    public void W6(float f17, long j17) {
        if (!g7("destroyCallbacks")) {
            com.tencent.mm.plugin.finder.ui.o6 o6Var = this.B;
            if (o6Var != null) {
                o6Var.b(null);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
            if (recyclerView != null) {
                recyclerView.setOnFlingListener(null);
            }
            this.D = false;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f366590g;
        if (recyclerView2 != null) {
            recyclerView2.b1(0, c7(), new android.view.animation.LinearInterpolator());
        }
    }

    @Override // qt2.f0, qt2.j
    public boolean X6() {
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.W3).getValue()).r()).intValue() != 1 && !((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f39226d && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127689f3).getValue()).r()).intValue() == 0 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127632c3).getValue()).r()).intValue() == 1 && hc2.e.a() && ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.D1().r()).booleanValue();
    }

    @Override // qt2.f0
    public boolean Z6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Me).getValue()).r()).booleanValue();
    }

    @Override // qt2.f0
    public void b7(android.view.MotionEvent event) {
        com.tencent.mm.plugin.finder.video.FinderInterceptHorizontalLinearLayout newSeekBarTouchArea;
        androidx.recyclerview.widget.k3 p07;
        kotlin.jvm.internal.o.g(event, "event");
        android.view.View view = this.f366588e;
        if (view != null && view.getVisibility() == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
            android.view.View view2 = (recyclerView == null || (p07 = recyclerView.p0(0)) == null) ? null : p07.itemView;
            android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.r8c) : null;
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = view2 != null ? (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) view2.findViewById(com.tencent.mm.R.id.ghd) : null;
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                this.f366579y = event.getY();
                return;
            }
            if (actionMasked == 1) {
                float y17 = event.getY() - this.f366579y;
                if (y17 <= 0.0f || y17 <= this.f366580z) {
                    if (!(findViewById != null && f7(findViewById, event))) {
                        return;
                    }
                }
                a7();
                return;
            }
            if (actionMasked != 2) {
                if (actionMasked == 5 && event.getPointerCount() >= 2) {
                    a7();
                    return;
                }
                return;
            }
            if (findViewById != null && f7(findViewById, event)) {
                if ((finderFullSeekBarLayout == null || (newSeekBarTouchArea = finderFullSeekBarLayout.getNewSeekBarTouchArea()) == null || !newSeekBarTouchArea.isHorizontalEvent) ? false : true) {
                    a7();
                }
            }
        }
    }

    @Override // qt2.f0
    public void d7() {
        this.C = true;
        qt2.j.P6(this, c7(), 260L, 0.0f, 4, null);
    }

    public final boolean f7(android.view.View view, android.view.MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX < iArr[0] || rawX > r3 + view.getWidth()) {
            return false;
        }
        int i17 = iArr[1];
        return rawY >= ((float) i17) && rawY <= ((float) (i17 + view.getHeight()));
    }

    public final boolean g7(java.lang.String str) {
        java.lang.Class superclass;
        java.lang.Class superclass2;
        java.lang.reflect.Method declaredMethod;
        try {
            if (this.B != null && (superclass = com.tencent.mm.plugin.finder.ui.o6.class.getSuperclass()) != null && (superclass2 = superclass.getSuperclass()) != null && (declaredMethod = superclass2.getDeclaredMethod(str, new java.lang.Class[0])) != null) {
                declaredMethod.setAccessible(true);
                com.tencent.mm.plugin.finder.ui.o6 o6Var = this.B;
                kotlin.jvm.internal.o.e(o6Var, "null cannot be cast to non-null type androidx.recyclerview.widget.SnapHelper");
                declaredMethod.invoke(o6Var, new java.lang.Object[0]);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderShareGuideScrollTipUIC", e17.getMessage());
            return false;
        }
    }

    @Override // qt2.j
    public int getIndex() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.A = getActivity().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
        this.D = true;
    }
}
