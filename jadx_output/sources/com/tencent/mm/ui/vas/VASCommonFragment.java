package com.tencent.mm.ui.vas;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/ui/vas/VASCommonFragment;", "Lcom/tencent/mm/ui/vas/fragment/VASBaseFragment;", "Lal5/g3;", "Llk5/b;", "Lna5/b;", "Ltk5/a;", "<init>", "()V", "lk5/a0", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class VASCommonFragment extends com.tencent.mm.ui.vas.fragment.VASBaseFragment implements al5.g3, lk5.b, na5.b, tk5.a {
    public static final lk5.a0 Q = new lk5.a0(null);
    public boolean F;
    public tk5.c G;
    public final java.util.ArrayList H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.ui.ga f211119J;
    public final jz5.g K;
    public boolean L;
    public android.widget.FrameLayout M;
    public android.widget.FrameLayout N;
    public xk5.b P;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASActivity f211121p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f211122q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f211123r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f211124s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f211125t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f211126u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f211127v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f211128w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.SwipeBackLayout f211129x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f211130y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f211131z;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f211120o = "MicroMsg.VAS.VASCommonFragment@" + hashCode();
    public android.content.Intent A = new android.content.Intent();
    public sk5.j B = sk5.f.f409011c;
    public sk5.j C = sk5.e.f409010c;
    public sk5.j D = sk5.d.f409009c;
    public sk5.j E = sk5.g.f409012c;

    public VASCommonFragment() {
        jz5.h.b(lk5.f0.f319031d);
        this.H = new java.util.ArrayList();
        this.f211119J = new lk5.g0(this);
        this.K = jz5.h.b(new lk5.b0(this));
    }

    public final boolean A0() {
        return !this.A.getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_ACTIVITY_SWIPE_BACK, false) && this.f211122q == null;
    }

    public void B0() {
        android.widget.FrameLayout frameLayout = this.f211124s;
        com.tencent.mm.ui.vas.launcher.FragmentContainerView fragmentContainerView = frameLayout instanceof com.tencent.mm.ui.vas.launcher.FragmentContainerView ? (com.tencent.mm.ui.vas.launcher.FragmentContainerView) frameLayout : null;
        if (fragmentContainerView != null) {
            java.lang.Object tag = fragmentContainerView.getTag(com.tencent.mm.R.id.s__);
            android.view.View view = tag instanceof android.view.View ? (android.view.View) tag : null;
            if (view != null) {
                fragmentContainerView.removeView(view);
            }
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            this.P = xk5.c.b(vASActivity.getWindow(), false);
            getF211132d();
            java.util.Objects.toString(this.P);
        }
    }

    public void C0() {
        android.widget.FrameLayout frameLayout = this.N;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.h(getActivity(), com.tencent.mm.R.dimen.f479623ay);
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        androidx.appcompat.app.b mActionBar = vASActivity != null ? vASActivity.getMActionBar() : null;
        lk5.e eVar = mActionBar instanceof lk5.e ? (lk5.e) mActionBar : null;
        android.view.ViewGroup viewGroup = eVar != null ? eVar.f319028b : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    @Override // tk5.a
    public void G() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.finish();
        }
    }

    @Override // tk5.a
    public void M(tk5.c router) {
        kotlin.jvm.internal.o.g(router, "router");
        this.G = router;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
        android.view.View view;
        if (f17 <= 0.0f) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f211122q;
            view = vASCommonFragment != null ? vASCommonFragment.f211123r : null;
            if (view == null) {
                return;
            }
            view.setTranslationX(0.0f);
            return;
        }
        float f18 = this.I * (1.0f - f17);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f211122q;
        view = vASCommonFragment2 != null ? vASCommonFragment2.f211123r : null;
        if (view == null) {
            return;
        }
        view.setTranslationX(f18);
    }

    @Override // tk5.a
    public boolean Z() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            return vASActivity.onClickDialogSpaceOnHalfScreenMode();
        }
        return false;
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent motionEvent) {
        getF211132d();
        android.view.MotionEvent.actionToString(motionEvent != null ? motionEvent.getAction() : -1);
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        getF211132d();
        return 1;
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // al5.g3
    public boolean d0() {
        return false;
    }

    @Override // al5.g3
    public int e() {
        return 0;
    }

    @Override // al5.g3
    public boolean enableSwipeBack() {
        return false;
    }

    @Override // tk5.a
    public void g0() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment
    public int getLayoutId() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        int curLayoutId = vASActivity != null ? vASActivity.getCurLayoutId() : -1;
        if (curLayoutId != 0) {
            return curLayoutId;
        }
        com.tencent.mm.ui.component.UIComponent uIComponent = this.f211135g;
        return uIComponent != null ? uIComponent.getLayoutId() : -1;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return ((pk5.e) ((jz5.n) this.K).getValue()).f356550f;
    }

    @Override // tk5.a
    public boolean i() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            return vASActivity.isContentAtTop();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment
    public androidx.lifecycle.c1 j0(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        kotlin.jvm.internal.o.d(vASActivity);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(vASActivity).a(modelClass);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return a17;
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment
    /* renamed from: l0, reason: from getter */
    public java.lang.String getF211132d() {
        return this.f211120o;
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment
    public java.util.Set m0() {
        return null;
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment
    public void n0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.n0(set);
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.superImportUIComponents(set);
        }
    }

    public final android.view.View o0() {
        android.view.View view = getView();
        kotlin.jvm.internal.o.d(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.callOnActivityResult(i17, i18, intent);
        }
        getF211132d();
        java.util.Objects.toString(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        getF211132d();
        activity.toString();
        super.onAttach(activity);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        uk5.f fVar = com.tencent.mm.ui.MMFragmentActivity.aReporter;
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        fVar.d(vASActivity != null ? vASActivity.getIntent() : null);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        this.f211124s = activity != null ? (android.widget.FrameLayout) activity.findViewById(com.tencent.mm.R.id.hys) : null;
        super.onCreate(bundle);
        getF211132d();
        com.tencent.mm.ui.ga gaVar = this.f211119J;
        com.tencent.mm.ui.vas.VASActivity vASActivity2 = this.f211121p;
        gaVar.e0(vASActivity2, vASActivity2);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.animation.Animation onCreateAnimation(int i17, boolean z17, int i18) {
        if (((i18 == com.tencent.mm.R.anim.f477919f7 || i18 == com.tencent.mm.R.anim.f477920f8) || i18 == com.tencent.mm.R.anim.f477921f9) || i18 == com.tencent.mm.R.anim.f_) {
            return null;
        }
        return super.onCreateAnimation(i17, z17, i18);
    }

    @Override // androidx.fragment.app.Fragment
    public android.animation.Animator onCreateAnimator(int i17, boolean z17, int i18) {
        android.animation.Animator a17;
        android.animation.Animator a18;
        android.animation.Animator animator;
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        if (!(((i18 == com.tencent.mm.R.anim.f477919f7 || i18 == com.tencent.mm.R.anim.f477920f8) || i18 == com.tencent.mm.R.anim.f477921f9) || i18 == com.tencent.mm.R.anim.f_)) {
            return super.onCreateAnimator(i17, z17, i18);
        }
        java.lang.Object parent = o0().getParent();
        android.animation.Animator animator2 = null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            java.lang.Object parent2 = o0().getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            if (view2 != null) {
                int measuredHeight = view2.getMeasuredHeight();
                if (i18 == com.tencent.mm.R.anim.f477919f7) {
                    getF211132d();
                    java.util.Objects.toString(this.B);
                    com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
                    if (vASActivity != null) {
                        vASActivity.getActionBarData();
                    }
                    sk5.k kVar = new sk5.k();
                    t0();
                    a18 = this.B.a(o0(), measuredWidth, measuredHeight, kVar);
                    if (a18 != null) {
                        if (lk5.m0.f319051c) {
                            lk5.m0.f319051c = false;
                            a18.setDuration(0L);
                        }
                        animator2 = a18;
                    }
                    animator = animator2;
                } else {
                    sk5.k kVar2 = sk5.k.f409017a;
                    if (i18 == com.tencent.mm.R.anim.f477920f8) {
                        com.tencent.mars.xlog.Log.i(getF211132d(), "createAnimForFragment() vas_anim_exit_holder exitAnim:" + this.C);
                        com.tencent.mm.ui.vas.VASActivity vASActivity2 = this.f211121p;
                        if (vASActivity2 != null) {
                            vASActivity2.getActionBarData();
                        }
                        sk5.j jVar = this.C;
                        android.view.View o07 = o0();
                        jz5.g gVar = sk5.j.f409015b;
                        a17 = jVar.a(o07, measuredWidth, measuredHeight, kVar2);
                        if (a17 != null) {
                            if (lk5.m0.f319052d) {
                                lk5.m0.f319052d = false;
                                a17.setDuration(0L);
                            }
                            animator = a17;
                        }
                        animator = animator2;
                    } else {
                        if (i18 == com.tencent.mm.R.anim.f477921f9) {
                            com.tencent.mars.xlog.Log.i(getF211132d(), "createAnimForFragment() vas_anim_pop_enter_holder popEnterAnim:" + this.D + " isPopEnterNoAnim:" + lk5.m0.f319049a);
                            com.tencent.mm.ui.vas.VASActivity vASActivity3 = this.f211121p;
                            if (vASActivity3 != null) {
                                vASActivity3.getActionBarData();
                            }
                            sk5.k kVar3 = new sk5.k();
                            t0();
                            a18 = this.D.a(o0(), measuredWidth, measuredHeight, kVar3);
                            if (a18 != null) {
                                if (lk5.m0.f319049a) {
                                    lk5.m0.f319049a = false;
                                    a18.setDuration(0L);
                                }
                                animator2 = a18;
                            }
                        } else if (i18 == com.tencent.mm.R.anim.f_) {
                            com.tencent.mm.ui.vas.VASActivity vASActivity4 = this.f211121p;
                            if (vASActivity4 != null) {
                                vASActivity4.getActionBarData();
                            }
                            getF211132d();
                            java.util.Objects.toString(this.E);
                            sk5.j jVar2 = this.E;
                            android.view.View o08 = o0();
                            jz5.g gVar2 = sk5.j.f409015b;
                            a17 = jVar2.a(o08, measuredWidth, measuredHeight, kVar2);
                            if (a17 != null) {
                                if (lk5.m0.f319050b) {
                                    lk5.m0.f319050b = false;
                                    a17.setDuration(0L);
                                }
                                animator = a17;
                            }
                        }
                        animator = animator2;
                    }
                }
                if (animator instanceof android.animation.ValueAnimator) {
                    android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) animator;
                    long duration = valueAnimator.getDuration();
                    androidx.fragment.app.FragmentActivity activity = getActivity();
                    float refreshRate = (activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0.0f : defaultDisplay.getRefreshRate();
                    int i19 = (duration <= 0 || refreshRate <= 0.0f) ? 0 : (int) (refreshRate * (((float) duration) / 1000.0f));
                    kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                    if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                        valueAnimator.addUpdateListener(new lk5.k0(f0Var));
                    }
                    valueAnimator.addListener(new lk5.l0(i18, this, i19, f0Var, duration, animator));
                }
                animator2 = animator;
            }
        }
        pk5.e eVar = (pk5.e) ((jz5.n) this.K).getValue();
        eVar.getClass();
        if (i18 == com.tencent.mm.R.anim.f477919f7) {
            if (animator2 != null) {
                animator2.addListener(new pk5.c(eVar));
            }
        } else if (i18 == com.tencent.mm.R.anim.f477921f9 && animator2 != null) {
            animator2.addListener(new pk5.d(eVar));
        }
        getF211132d();
        java.util.Objects.toString(animator2);
        if (i18 == com.tencent.mm.R.anim.f477919f7 && animator2 != null) {
            animator2.addListener(new lk5.h0());
        }
        return animator2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(inflater, "inflater");
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onCreateOptionsMenu(menu);
        }
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        com.tencent.mars.xlog.Log.i(getF211132d(), "onCreateView:" + getId());
        setHasOptionsMenu(true);
        android.view.View w17 = this.f211119J.w();
        this.f211123r = w17;
        if (w17 != null) {
            java.util.HashSet hashSet = this.f211134f;
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.component.UIComponent) it.next()).setRootView(w17);
            }
            if (!this.f211131z) {
                this.f211137i = w17;
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    ((com.tencent.mm.ui.component.UIComponent) it6.next()).onCreateBefore(bundle);
                }
                this.f211131z = true;
            }
        }
        android.view.View view = this.f211123r;
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        boolean z17 = vASActivity != null && vASActivity.getF65848t();
        boolean A0 = A0();
        boolean z18 = z17 && !A0;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = this.f211129x;
        if (swipeBackLayout2 != null) {
            this.f211123r = swipeBackLayout2;
            view = swipeBackLayout2;
        } else if (z18) {
            android.view.View view2 = this.f211137i;
            kotlin.jvm.internal.o.d(view2);
            android.view.ViewParent parent = view2.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.cxh, viewGroup2, false);
                kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.SwipeBackLayout");
                viewGroup2.removeView(view2);
                viewGroup2.addView(this.f211129x);
                swipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) inflate;
            } else {
                android.view.View inflate2 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.cxh, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.SwipeBackLayout");
                swipeBackLayout = (com.tencent.mm.ui.widget.SwipeBackLayout) inflate2;
            }
            swipeBackLayout.addView(view2);
            swipeBackLayout.setContentView(view2);
            if (swipeBackLayout.getChildCount() > 0) {
                android.view.View childAt = swipeBackLayout.getChildAt(0);
                swipeBackLayout.removeView(childAt);
                vj5.h hVar = new vj5.h(swipeBackLayout.getContext());
                hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
                swipeBackLayout.addView(hVar);
                swipeBackLayout.setContentView(hVar);
                this.f211130y = hVar;
            }
            swipeBackLayout.d(true);
            swipeBackLayout.setAutoResetToNoTranslucent(false);
            swipeBackLayout.setSwipeGestureDelegate(new lk5.e0(this));
            swipeBackLayout.setSwipeBackListener(this);
            this.f211129x = swipeBackLayout;
            getF211132d();
            this.f211123r = swipeBackLayout;
            view = swipeBackLayout;
        }
        if (z17) {
            s0(true);
        }
        java.lang.String f211132d = getF211132d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateView isNeedInitSwipeBack:");
        sb6.append(z18);
        sb6.append(" isSupportNavigationSwipeBack:");
        sb6.append(z17);
        sb6.append(" isUseActivitySwipeBack:");
        sb6.append(A0);
        sb6.append(" lastSwipeBackLayout:");
        sb6.append(swipeBackLayout2 != null);
        sb6.append(" returnView:");
        sb6.append(view);
        com.tencent.mars.xlog.Log.i(f211132d, sb6.toString());
        return view;
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getF211132d();
        super.onDestroy();
        if (this.F) {
            return;
        }
        onPagePopExitAnimBegin();
        onPagePopExitAnimEnd();
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getF211132d();
        super.onDestroyView();
    }

    @Override // na5.b
    public void onPageEnterAnimBegin() {
        if (this.A.getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            com.tencent.mm.ui.vas.launcher.VASLauncher vASLauncher = activity instanceof com.tencent.mm.ui.vas.launcher.VASLauncher ? (com.tencent.mm.ui.vas.launcher.VASLauncher) activity : null;
            if (vASLauncher != null) {
                vASLauncher.Y6();
            }
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPageEnterAnimBegin();
        }
    }

    @Override // na5.b
    public void onPageEnterAnimEnd() {
        if (this.A.getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
            com.tencent.mm.ui.base.preference.MMPreferenceFragment.l0();
        }
        getF211132d();
        x0("onPageEnterAnimEnd");
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPageEnterAnimEnd();
        }
    }

    @Override // na5.b
    public void onPageExitAnimBegin() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPageExitAnimBegin();
        }
    }

    @Override // na5.b
    public void onPageExitAnimEnd() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPageExitAnimEnd();
        }
    }

    @Override // na5.b
    public void onPagePopEnterAnimBegin() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPagePopEnterAnimBegin();
        }
    }

    @Override // na5.b
    public void onPagePopEnterAnimEnd() {
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        getF211132d();
        x0("onPagePopEnterAnimEnd");
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPagePopEnterAnimEnd();
        }
        xk5.b bVar = this.P;
        if (bVar != null) {
            com.tencent.mm.ui.vas.VASActivity vASActivity2 = this.f211121p;
            xk5.b bVar2 = null;
            xk5.b b17 = (vASActivity2 == null || (window3 = vASActivity2.getWindow()) == null) ? null : xk5.c.b(window3, false);
            com.tencent.mm.ui.vas.VASActivity vASActivity3 = this.f211121p;
            if (vASActivity3 != null && (window2 = vASActivity3.getWindow()) != null) {
                xk5.c.a(window2, bVar);
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity4 = this.f211121p;
            if (vASActivity4 != null && (window = vASActivity4.getWindow()) != null) {
                bVar2 = xk5.c.b(window, false);
            }
            getF211132d();
            java.util.Objects.toString(b17);
            java.util.Objects.toString(bVar2);
        }
    }

    @Override // na5.b
    public void onPagePopExitAnimBegin() {
        if (this.A.getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
            getF211132d();
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity instanceof com.tencent.mm.ui.vas.launcher.VASLauncher) {
                ((com.tencent.mm.ui.vas.launcher.VASLauncher) activity).X6();
            }
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPagePopExitAnimBegin();
        }
    }

    @Override // na5.b
    public void onPagePopExitAnimEnd() {
        if (this.A.getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
            getF211132d();
            com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
            if (vASActivity != null) {
                vASActivity.finish();
            }
        }
        this.F = true;
        com.tencent.mm.ui.vas.VASActivity vASActivity2 = this.f211121p;
        if (vASActivity2 != null) {
            vASActivity2.onPagePopExitAnimEnd();
        }
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        getF211132d();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(android.view.Menu menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onPrepareOptionsMenu(menu);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            vASActivity.onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        android.view.View view;
        super.onResume();
        getF211132d();
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f211122q;
        android.view.ViewParent viewParent = null;
        java.util.Objects.toString(vASCommonFragment != null ? vASCommonFragment.f211123r : null);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f211122q;
        if (vASCommonFragment2 != null && (view = vASCommonFragment2.f211123r) != null) {
            viewParent = view.getParent();
        }
        java.util.Objects.toString(viewParent);
        android.widget.FrameLayout frameLayout = this.f211124s;
        if (frameLayout != null) {
            frameLayout.getChildCount();
        }
        android.view.View view2 = this.f211123r;
        if (view2 != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.s(view2, 1);
        }
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        getF211132d();
        outState.toString();
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        outState.putInt("KEY_ACTIONBAR_COLOR", vASActivity != null ? vASActivity.getActionbarColor() : 0);
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        getF211132d();
        view.toString();
        java.util.Objects.toString(bundle);
        this.f211125t = view.findViewById(com.tencent.mm.R.id.hvf);
        this.f211126u = view.findViewById(com.tencent.mm.R.id.f482438el);
        this.f211127v = view.findViewById(com.tencent.mm.R.id.owf);
        this.f211128w = view.findViewById(com.tencent.mm.R.id.f487534ow4);
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        if (vASActivity != null) {
            mo133getLifecycle().a(vASActivity);
        }
        w0(bundle);
    }

    public final void q0(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList arrayList = this.H;
        if (arrayList.contains(callback)) {
            return;
        }
        arrayList.add(callback);
    }

    public final void r0(boolean z17) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        if (mMFragmentActivity == null || (swipeBackLayout = mMFragmentActivity.getSwipeBackLayout()) == null) {
            return;
        }
        swipeBackLayout.setEnableGesture(z17);
    }

    public final void s0(boolean z17) {
        if (A0()) {
            r0(z17);
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f211129x;
            if (swipeBackLayout != null) {
                swipeBackLayout.setEnableGesture(false);
                return;
            }
            return;
        }
        r0(false);
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = this.f211129x;
        if (swipeBackLayout2 != null) {
            swipeBackLayout2.setEnableGesture(z17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
        android.content.Intent intent = new android.content.Intent();
        this.A = intent;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        intent.putExtras(bundle);
    }

    @Override // tk5.a
    /* renamed from: t, reason: from getter */
    public tk5.c getF208824e() {
        return this.G;
    }

    public final sk5.c t0() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.ui.vas.VASCommonActivity vASCommonActivity = activity instanceof com.tencent.mm.ui.vas.VASCommonActivity ? (com.tencent.mm.ui.vas.VASCommonActivity) activity : null;
        if (vASCommonActivity != null) {
            return (sk5.c) ((jz5.n) vASCommonActivity.f211118g).getValue();
        }
        return null;
    }

    @Override // tk5.a
    public androidx.fragment.app.Fragment u() {
        return this;
    }

    public java.lang.Class u0() {
        return com.tencent.mm.ui.vas.VASCommonFragment.class;
    }

    public final void w0(android.os.Bundle bundle) {
        android.view.ViewGroup.LayoutParams layoutParams;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        boolean z17 = activity instanceof com.tencent.mm.ui.vas.VASCommonActivity;
        if (!z17) {
            com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
            if (!((vASActivity == null || vASActivity.getDisableCommonAreaControl()) ? false : true)) {
                return;
            }
        }
        if (z17) {
            ((com.tencent.mm.ui.vas.VASCommonActivity) activity).W6();
        }
        android.view.ViewGroup viewGroup = this.f211130y;
        if (viewGroup != null && (viewGroup instanceof vj5.h)) {
            ((vj5.h) viewGroup).s(true);
        }
        if (this.L) {
            android.view.View view = this.f211127v;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            int a17 = fp.j0.a(getContext(), -1);
            android.view.View view2 = this.f211127v;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f211127v;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.height = a17;
                android.view.View view4 = this.f211127v;
                if (view4 != null) {
                    view4.setLayoutParams(layoutParams);
                }
            }
            sk5.c t07 = t0();
            if (t07 != null) {
                com.tencent.mm.ui.vas.VASCommonActivity vASCommonActivity = ((lk5.v) t07).f319065a;
                android.view.ViewGroup.LayoutParams layoutParams2 = vASCommonActivity.V6().getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = a17;
                    vASCommonActivity.V6().setLayoutParams(marginLayoutParams);
                }
            }
        }
        y0();
        if (bundle == null) {
            com.tencent.mm.ui.vas.VASActivity vASActivity2 = this.f211121p;
            if (vASActivity2 != null) {
                vASActivity2.setActionbarColor(vASActivity2.getActionbarColor());
                return;
            }
            return;
        }
        if (bundle.containsKey("KEY_ACTIONBAR_COLOR")) {
            int i17 = bundle.getInt("KEY_ACTIONBAR_COLOR");
            com.tencent.mm.ui.vas.VASActivity vASActivity3 = this.f211121p;
            if (vASActivity3 == null) {
                return;
            }
            vASActivity3.setActionbarColor(i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if ((r6 != null && r6.isUseViewToSetFragmentBack()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(java.lang.String r6) {
        /*
            r5 = this;
            android.widget.FrameLayout r6 = r5.f211124s
            r0 = 0
            r1 = 2131324142(0x7f096cee, float:1.8266983E38)
            if (r6 == 0) goto Lb
            r6.setTag(r1, r0)
        Lb:
            com.tencent.mm.ui.vas.VASActivity r6 = r5.f211121p
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L19
            boolean r6 = r6.getF65848t()
            if (r6 != r2) goto L19
            r6 = r2
            goto L1a
        L19:
            r6 = r3
        L1a:
            if (r6 == 0) goto L2c
            com.tencent.mm.ui.vas.VASActivity r6 = r5.f211121p
            if (r6 == 0) goto L28
            boolean r6 = r6.isUseViewToSetFragmentBack()
            if (r6 != r2) goto L28
            r6 = r2
            goto L29
        L28:
            r6 = r3
        L29:
            if (r6 == 0) goto L2c
            goto L2d
        L2c:
            r2 = r3
        L2d:
            r5.getF211132d()
            com.tencent.mm.ui.vas.VASCommonFragment r6 = r5.f211122q
            if (r2 != 0) goto L35
            goto L73
        L35:
            if (r6 == 0) goto L39
            android.view.View r0 = r6.f211123r
        L39:
            android.widget.FrameLayout r6 = r5.f211124s
            if (r0 == 0) goto L73
            if (r6 == 0) goto L73
            android.view.ViewParent r2 = r0.getParent()
            boolean r4 = kotlin.jvm.internal.o.b(r2, r6)
            if (r4 == 0) goto L53
            r6.getChildCount()
            java.util.Objects.toString(r2)
            r0.toString()
            goto L61
        L53:
            if (r2 != 0) goto L61
            r6.addView(r0, r3)
            r6.setTag(r1, r0)
            r6.getChildCount()
            r0.toString()
        L61:
            java.util.WeakHashMap r6 = n3.l1.f334362a
            r6 = 4
            n3.u0.s(r0, r6)
            float r6 = r0.getTranslationX()
            r5.I = r6
            r5.getF211132d()
            r0.hashCode()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.vas.VASCommonFragment.x0(java.lang.String):void");
    }

    public void y0() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window;
        android.view.View decorView;
        if (com.tencent.mm.ui.b4.c(getContext())) {
            getF211132d();
            android.view.View view = this.f211128w;
            if (view != null) {
                com.tencent.mm.ui.a4.f197117a.m(view, new lk5.d0(this), this);
                return;
            }
            return;
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        boolean z17 = (((activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility()) & 2) == 0;
        getF211132d();
        if (z17) {
            android.view.View view2 = this.f211128w;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f211128w;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/vas/VASCommonFragment", "handleNavigationBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f211128w;
        if (view4 == null || (layoutParams = view4.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = com.tencent.mm.ui.bl.c(getContext());
        android.view.View view5 = this.f211128w;
        if (view5 == null) {
            return;
        }
        view5.setLayoutParams(layoutParams);
    }

    public final boolean z0() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        if (!A0()) {
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout2 = this.f211129x;
            return swipeBackLayout2 != null && swipeBackLayout2.f211430h;
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        return (mMFragmentActivity == null || (swipeBackLayout = mMFragmentActivity.getSwipeBackLayout()) == null || !swipeBackLayout.f211430h) ? false : true;
    }

    @Override // com.tencent.mm.ui.vas.fragment.VASBaseFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        androidx.fragment.app.v0 v0Var;
        kotlin.jvm.internal.o.g(context, "context");
        getF211132d();
        context.toString();
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.io.Serializable serializable = arguments.getSerializable(com.tencent.mm.ui.vas.VASActivity.KEY_CLS);
            kotlin.jvm.internal.o.e(serializable, "null cannot be cast to non-null type java.lang.Class<com.tencent.mm.ui.vas.VASActivity>");
            androidx.fragment.app.FragmentActivity activity = getActivity();
            com.tencent.mm.ui.vas.VASActivity vASActivity = (com.tencent.mm.ui.vas.VASActivity) ((java.lang.Class) serializable).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            this.f211121p = vASActivity;
            if (vASActivity != null && (v0Var = vASActivity.get_hostCallback()) != null) {
                java.lang.reflect.Field declaredField = androidx.fragment.app.FragmentManager.class.getDeclaredField("mHost");
                declaredField.setAccessible(true);
                declaredField.set(getChildFragmentManager(), v0Var);
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity2 = this.f211121p;
            if (vASActivity2 != null) {
                vASActivity2.set_childFragmentManager(getChildFragmentManager());
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity3 = this.f211121p;
            if (vASActivity3 != null) {
                vASActivity3.set_parentFragmentManager(getParentFragmentManager());
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity4 = this.f211121p;
            if (vASActivity4 != null) {
                vASActivity4.set_fragment(this);
            }
            if (activity != null) {
                com.tencent.mm.ui.vas.VASActivity vASActivity5 = this.f211121p;
                if (vASActivity5 != null) {
                    vASActivity5.set_activity(activity);
                }
                com.tencent.mm.ui.vas.VASActivity vASActivity6 = this.f211121p;
                if (vASActivity6 != null) {
                    vASActivity6.setInnerContext(activity);
                }
                try {
                    java.lang.reflect.Field declaredField2 = android.app.Activity.class.getDeclaredField("mApplication");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.f211121p, activity.getApplication());
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(getF211132d(), th6, "onAttach application err", new java.lang.Object[0]);
                }
                try {
                    java.lang.reflect.Field declaredField3 = android.app.Activity.class.getDeclaredField("mMainThread");
                    declaredField3.setAccessible(true);
                    declaredField3.set(this.f211121p, declaredField3.get(activity));
                    java.lang.reflect.Field declaredField4 = android.app.Activity.class.getDeclaredField("mInstrumentation");
                    declaredField4.setAccessible(true);
                    declaredField4.set(this.f211121p, declaredField4.get(activity));
                    java.lang.reflect.Field declaredField5 = android.app.Activity.class.getDeclaredField("mComponent");
                    declaredField5.setAccessible(true);
                    android.content.Intent intent = this.A;
                    declaredField5.set(this.f211121p, intent != null ? intent.getComponent() : null);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(getF211132d(), th7, "bindRealActivityData err", new java.lang.Object[0]);
                }
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity7 = this.f211121p;
            if (vASActivity7 != null) {
                vASActivity7.onInited();
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity8 = this.f211121p;
            if (vASActivity8 != null) {
                vASActivity8.initVasController();
            }
            com.tencent.mm.ui.vas.VASActivity vASActivity9 = this.f211121p;
            if (vASActivity9 != null) {
                vASActivity9.fixStatusbar(true);
            }
        }
        super.onAttach(context);
        java.util.Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).invoke(this.f211121p);
        }
    }
}
