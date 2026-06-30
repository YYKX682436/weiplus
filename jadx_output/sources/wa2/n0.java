package wa2;

/* loaded from: classes3.dex */
public final class n0 extends android.widget.FrameLayout implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f444152d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f444153e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f444154f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f444155g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f444156h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f444157i;

    /* renamed from: m, reason: collision with root package name */
    public wa2.b0 f444158m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f444159n;

    /* renamed from: o, reason: collision with root package name */
    public int f444160o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setBackgroundColor(0);
        this.f444152d = jz5.h.b(new wa2.m0(context, this));
        wa2.j0 j0Var = new wa2.j0(context);
        j0Var.setBackgroundColor(-16777216);
        j0Var.setAlpha(0.0f);
        addView(j0Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f444153e = j0Var;
        jz5.g b17 = jz5.h.b(new wa2.k0(context));
        this.f444156h = b17;
        setTag("GestureFrameLayout");
        if (((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue()) {
            post(new wa2.i0(this));
        }
    }

    private final android.view.GestureDetector getTouchDetector() {
        return (android.view.GestureDetector) ((jz5.n) this.f444152d).getValue();
    }

    public final com.tencent.mm.view.HeadFooterLayout a(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof com.tencent.mm.view.HeadFooterLayout)) {
                com.tencent.mm.view.HeadFooterLayout a17 = a((android.view.ViewGroup) childAt);
                if (a17 != null) {
                    return a17;
                }
            } else if (childAt instanceof com.tencent.mm.view.HeadFooterLayout) {
                com.tencent.mm.view.HeadFooterLayout headFooterLayout = (com.tencent.mm.view.HeadFooterLayout) childAt;
                if (viewGroup.getHeight() <= headFooterLayout.getHeight()) {
                    return headFooterLayout;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout b(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof com.tencent.mm.view.refreshLayout.WxRefreshLayout)) {
                com.tencent.mm.view.refreshLayout.WxRefreshLayout b17 = b((android.view.ViewGroup) childAt);
                if (b17 != null) {
                    return b17;
                }
            } else if (childAt instanceof com.tencent.mm.view.refreshLayout.WxRefreshLayout) {
                com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) childAt;
                if (viewGroup.getHeight() <= wxRefreshLayout.getHeight()) {
                    return wxRefreshLayout;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        boolean z17;
        kotlin.jvm.internal.o.g(ev6, "ev");
        int i17 = this.f444160o;
        if (i17 == -1) {
            if (ev6.getAction() == 3 || ev6.getAction() == 1) {
                com.tencent.mars.xlog.Log.i("GestureFrameLayout", "dispatchTouchEvent: isInterceptTouchEvent=-1, reset to 0");
                this.f444160o = 0;
            }
            return super.dispatchTouchEvent(ev6);
        }
        if (i17 == 0) {
            return super.dispatchTouchEvent(ev6);
        }
        if (i17 == 1) {
            int i18 = (getContext().getResources().getDisplayMetrics().heightPixels * 3) / 4;
            com.tencent.mars.xlog.Log.i("GestureFrameLayout", "dispatchTouchEvent: isInterceptTouchEvent=1, rawY=" + ev6.getRawY() + ", threshold=" + i18 + ", isEnableDragExit=" + ((java.lang.Boolean) ((jz5.n) this.f444156h).getValue()).booleanValue());
            if (ev6.getRawY() >= i18) {
                com.tencent.mars.xlog.Log.i("GestureFrameLayout", "dispatchTouchEvent: rawY >= threshold, 放弃拦截, isInterceptTouchEvent → -1");
                this.f444160o = -1;
                return super.dispatchTouchEvent(ev6);
            }
            com.tencent.mars.xlog.Log.i("GestureFrameLayout", "dispatchTouchEvent: rawY < threshold, 进入拖拽模式, isInterceptTouchEvent → 2");
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(ev6);
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
            android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(ev6);
            obtain2.setAction(0);
            android.view.GestureDetector touchDetector = getTouchDetector();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(obtain2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(touchDetector, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(touchDetector, touchDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            this.f444160o = 2;
        }
        android.view.GestureDetector touchDetector2 = getTouchDetector();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(ev6);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(touchDetector2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(touchDetector2, touchDetector2.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (ev6.getAction() == 3 || ev6.getAction() == 1) {
            com.tencent.mars.xlog.Log.i("GestureFrameLayout", "dispatchTouchEvent: 手势结束, isInterceptTouchEvent → 0, 调用 onTouchCancel");
            this.f444160o = 0;
            float a17 = h3.a.a(1.0f - ((getContentView().getTranslationY() * 1.0f) / getContentView().getHeight()), 0.0f, 1.0f);
            com.tencent.mars.xlog.Log.i("GestureFrameLayout", "[onTouchCancel] scale=" + a17);
            if (a17 > 0.8f) {
                android.view.View contentView = getContentView();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(contentView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", if1.n.NAME, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                contentView.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(contentView, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", if1.n.NAME, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                this.f444157i = false;
                wa2.b0 b0Var = this.f444158m;
                if (b0Var != null) {
                    ((im2.f) b0Var).a(false);
                }
                getContentView().animate().setListener(null).setUpdateListener(new wa2.l0(this)).translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(280L).start();
                com.tencent.mm.view.HeadFooterLayout a18 = a(this);
                if (a18 != null) {
                    a18.setTranslationY(0.0f);
                }
                z17 = true;
            } else {
                z17 = true;
                this.f444157i = true;
                wa2.b0 b0Var2 = this.f444158m;
                if (b0Var2 != null) {
                    ((im2.f) b0Var2).a(true);
                }
                android.content.Context context = getContentView().getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).finish();
            }
        } else {
            z17 = true;
        }
        return z17;
    }

    public final android.view.View getBgView() {
        return this.f444153e;
    }

    public final android.view.View getContentView() {
        android.view.View view = this.f444154f;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("contentView");
        throw null;
    }

    public final boolean getDisabled() {
        return this.f444159n;
    }

    public final wa2.b0 getDragListener() {
        return this.f444158m;
    }

    public final android.view.View getSourceView() {
        return this.f444155g;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        wa2.b0 b0Var = this.f444158m;
        if (b0Var == null) {
            return true;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = ((im2.f) b0Var).f292311a;
        com.tencent.mars.xlog.Log.i(finderLiveExitAnimateOpUIC.f116981d, "onDragDown");
        finderLiveExitAnimateOpUIC.getActivity().getWindow().getDecorView().setBackgroundColor(0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        wa2.u.f444181d.getClass();
        android.view.View contentView = getContentView();
        contentView.setTranslationY(contentView.getTranslationY() - f18);
        android.view.View contentView2 = getContentView();
        contentView2.setTranslationX(contentView2.getTranslationX() - f17);
        float a17 = h3.a.a(1.0f - ((getContentView().getTranslationY() * 1.0f) / getContentView().getHeight()), 0.0f, 1.0f);
        wa2.b0 b0Var = this.f444158m;
        if (b0Var != null) {
            float translationX = getContentView().getTranslationX();
            float translationY = getContentView().getTranslationY();
            java.lang.String str = ((im2.f) b0Var).f292311a.f116981d;
            com.tencent.mm.autogen.events.FinderLiveBgPositionChangeEvent finderLiveBgPositionChangeEvent = new com.tencent.mm.autogen.events.FinderLiveBgPositionChangeEvent();
            am.nb nbVar = finderLiveBgPositionChangeEvent.f54283g;
            nbVar.f7416a = (int) translationX;
            nbVar.f7417b = (int) translationY;
            nbVar.f7418c = a17;
            finderLiveBgPositionChangeEvent.e();
        }
        android.view.View view = this.f444153e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(a17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        getContentView().setScaleX(a17);
        getContentView().setScaleY(a17);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public final void setContentView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.f444154f = view;
    }

    public final void setDisabled(boolean z17) {
        this.f444159n = z17;
    }

    public final void setDragListener(wa2.b0 b0Var) {
        this.f444158m = b0Var;
    }

    public final void setDragToClose(boolean z17) {
        this.f444157i = z17;
    }

    public final void setSourceView(android.view.View view) {
        this.f444155g = view;
    }
}
