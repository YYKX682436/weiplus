package fl1;

/* loaded from: classes14.dex */
public final class c0 extends android.widget.RelativeLayout implements fl1.g2 {

    /* renamed from: d, reason: collision with root package name */
    public int f263712d;

    /* renamed from: e, reason: collision with root package name */
    public final fl1.d0 f263713e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f263714f;

    /* renamed from: g, reason: collision with root package name */
    public final fl1.u1 f263715g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f263716h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f263717i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f263718m;

    /* renamed from: n, reason: collision with root package name */
    public fl1.b2 f263719n;

    /* renamed from: o, reason: collision with root package name */
    public fl1.b2 f263720o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f263721p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f263722q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f263723r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f263724s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f263725t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f263726u;

    /* renamed from: v, reason: collision with root package name */
    public fl1.h2 f263727v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f263728w;

    public c0(android.content.Context context, fl1.d0 d0Var) {
        super(context);
        this.f263712d = 0;
        this.f263714f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f263715g = new fl1.u1(this);
        this.f263716h = new java.util.LinkedList();
        fl1.v vVar = new fl1.v(this);
        this.f263717i = vVar;
        this.f263718m = new fl1.w(this);
        this.f263721p = false;
        this.f263722q = new x.d(0);
        this.f263723r = new x.d(0);
        this.f263724s = new x.d(0);
        this.f263725t = false;
        this.f263726u = true;
        this.f263727v = null;
        this.f263728w = false;
        setVisibility(4);
        setBackgroundColor(0);
        setOnClickListener(vVar);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            this.f263712d = windowManager.getDefaultDisplay().getRotation();
        }
        d0Var = d0Var == null ? new fl1.d0() : d0Var;
        d0Var.getClass();
        fl1.u uVar = d0Var.f263748a;
        uVar.getClass();
        uVar.f263872b.put(this, new fl1.t(uVar, this));
        this.f263713e = d0Var;
    }

    @Override // fl1.g2
    public void a(fl1.b2 b2Var) {
        android.animation.AnimatorSet animatorSet;
        android.animation.Animator animator;
        if (b2Var == null || b2Var.getContentView() == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            this.f263714f.post(new fl1.z(this, b2Var));
            return;
        }
        if (b2Var.getContentView().getParent() == this && this.f263719n != b2Var) {
            this.f263719n = b2Var;
            if (this.f263720o == b2Var) {
                this.f263720o = null;
            }
            android.view.View contentView = b2Var.getContentView();
            contentView.animate().cancel();
            contentView.clearAnimation();
            android.view.View contentView2 = b2Var.getContentView();
            if (b2Var.q()) {
                if (b2Var.getPosition() == 2) {
                    android.view.animation.AccelerateInterpolator accelerateInterpolator = new android.view.animation.AccelerateInterpolator();
                    animatorSet = new android.animation.AnimatorSet();
                    android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(contentView2, "translationY", 0.0f, contentView2.getHeight()).setDuration(200L);
                    duration.setInterpolator(accelerateInterpolator);
                    animatorSet.playTogether(duration);
                } else {
                    android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(contentView2.getContext(), com.tencent.mm.R.anim.f477755ai);
                    android.view.animation.Interpolator loadInterpolator2 = android.view.animation.AnimationUtils.loadInterpolator(contentView2.getContext(), com.tencent.mm.R.anim.f477754ah);
                    animatorSet = new android.animation.AnimatorSet();
                    android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(contentView2, "scaleX", 1.0f, 0.9f).setDuration(220L);
                    duration2.setInterpolator(loadInterpolator);
                    android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(contentView2, "scaleY", 1.0f, 0.9f).setDuration(220L);
                    duration3.setInterpolator(loadInterpolator);
                    android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(contentView2, "alpha", 1.0f, 0.0f).setDuration(150L);
                    duration4.setInterpolator(loadInterpolator2);
                    animatorSet.playTogether(duration2, duration3, duration4);
                }
                animator = animatorSet;
            } else {
                animator = android.animation.ObjectAnimator.ofFloat(contentView2, "translationY", 0.0f, 0.0f).setDuration(1L);
            }
            animator.addListener(new fl1.b0(this, contentView, b2Var));
            animator.start();
            if (this.f263716h.size() <= 1) {
                this.f263715g.a(0, this.f263718m);
            }
            x.d dVar = (x.d) this.f263722q;
            if (!dVar.isEmpty() && this.f263721p) {
                java.util.Iterator it = dVar.iterator();
                while (true) {
                    x.h hVar = (x.h) it;
                    if (!hVar.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.page.g6 g6Var = (com.tencent.mm.plugin.appbrand.page.g6) ((fl1.d2) hVar.next());
                    g6Var.getClass();
                    g6Var.f86638a.Q(true);
                }
            }
            this.f263721p = false;
        }
    }

    @Override // fl1.g2
    public void b(fl1.c2 c2Var) {
        if (c2Var == null) {
            return;
        }
        if (this.f263725t) {
            ((x.d) this.f263724s).add(c2Var);
        } else {
            ((x.d) this.f263723r).remove(c2Var);
        }
    }

    @Override // fl1.g2
    public void c(fl1.b2 b2Var) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        android.view.animation.Animation loadAnimation;
        android.animation.ValueAnimator valueAnimator;
        if (b2Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDialogContainerLayout", "showDialog dialog[%s] tid[%d]", b2Var.getClass().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            this.f263714f.post(new fl1.x(this, b2Var));
            return;
        }
        nf.o.a(getContext());
        fl1.u1 u1Var = this.f263715g;
        android.animation.ValueAnimator valueAnimator2 = u1Var.f263877c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = u1Var.f263877c) != null) {
            valueAnimator.cancel();
        }
        android.view.View contentView = b2Var.getContentView();
        if (contentView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandDialogContainerLayout", "showDialog NULL dialogView from dialog[%s], stack=%s", b2Var, android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (contentView.getParent() != this) {
            if (contentView.getParent() != null) {
                ((android.view.ViewGroup) contentView.getParent()).removeView(contentView);
            }
            if (b2Var.getPosition() == 2) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(12);
                layoutParams.addRule(14);
            } else {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
            }
            addView(contentView, layoutParams);
            if (this.f263720o != b2Var) {
                contentView.clearAnimation();
                if (b2Var.n()) {
                    loadAnimation = b2Var.getPosition() == 2 ? android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477810c4) : android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477744a5);
                } else {
                    loadAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                    loadAnimation.setDuration(1L);
                }
                loadAnimation.setAnimationListener(new fl1.y(this, b2Var));
                contentView.startAnimation(loadAnimation);
            }
            this.f263720o = b2Var;
        }
        if (contentView.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout", "showDialog", "(Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout", "showDialog", "(Lcom/tencent/mm/plugin/appbrand/widget/dialog/IAppBrandDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        contentView.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(0L).scaleX(1.0f).scaleY(1.0f).start();
        contentView.setOnClickListener(this.f263717i);
        this.f263716h.add(b2Var);
        b2Var.v(this);
        setVisibility(0);
        if (this.f263726u) {
            bringToFront();
        }
        u1Var.a(android.graphics.Color.argb(127, 0, 0, 0), null);
        x.d dVar = (x.d) this.f263722q;
        if (!dVar.isEmpty() && !this.f263721p) {
            java.util.Iterator it = dVar.iterator();
            while (true) {
                x.h hVar = (x.h) it;
                if (!hVar.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.page.g6 g6Var = (com.tencent.mm.plugin.appbrand.page.g6) ((fl1.d2) hVar.next());
                g6Var.getClass();
                g6Var.f86638a.Q(false);
            }
        }
        this.f263721p = true;
    }

    @Override // fl1.g2
    public void d(fl1.c2 c2Var) {
        if (c2Var == null) {
            return;
        }
        ((x.d) this.f263723r).add(c2Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        fl1.b2 b2Var = (fl1.b2) this.f263716h.peekLast();
        if (b2Var == null) {
            setVisibility(8);
            return false;
        }
        if (b2Var.a() || !b2Var.j()) {
            return true;
        }
        b2Var.onCancel();
        a(b2Var);
        return true;
    }

    public void f() {
        android.animation.ValueAnimator valueAnimator;
        fl1.u1 u1Var = this.f263715g;
        android.animation.ValueAnimator valueAnimator2 = u1Var.f263877c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = u1Var.f263877c) != null) {
            valueAnimator.cancel();
        }
        java.util.LinkedList linkedList = this.f263716h;
        if (!linkedList.isEmpty()) {
            while (!linkedList.isEmpty()) {
                fl1.b2 b2Var = (fl1.b2) linkedList.pollFirst();
                if (b2Var != null && b2Var.getContentView() != null) {
                    android.view.View contentView = b2Var.getContentView();
                    contentView.animate().cancel();
                    contentView.clearAnimation();
                }
            }
        }
        this.f263719n = null;
        this.f263720o = null;
        this.f263725t = false;
        ((x.d) this.f263723r).clear();
        ((x.d) this.f263724s).clear();
        removeAllViewsInLayout();
        this.f263714f.removeCallbacksAndMessages(null);
        ((fl1.w) this.f263718m).run();
    }

    @Override // fl1.g2
    public fl1.b2 getCurrentDialog() {
        return (fl1.b2) this.f263716h.peekLast();
    }

    public fl1.d0 getShareContext() {
        return this.f263713e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int rotation;
        super.onConfigurationChanged(configuration);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (windowManager == null || this.f263712d == (rotation = windowManager.getDefaultDisplay().getRotation())) {
            return;
        }
        this.f263712d = rotation;
        java.util.Iterator it = this.f263716h.iterator();
        while (it.hasNext()) {
            ((fl1.b2) it.next()).y(this.f263712d);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (this.f263716h.size() == 0) {
            this.f263719n = null;
            this.f263720o = null;
            this.f263715g.a(0, this.f263718m);
            return;
        }
        fl1.b2 b2Var = this.f263720o;
        if (b2Var != null && b2Var.getContentView() == view) {
            this.f263720o = null;
        }
        fl1.b2 b2Var2 = this.f263719n;
        if (b2Var2 == null || b2Var2.getContentView() != view) {
            return;
        }
        this.f263719n = null;
    }

    public void setListener(fl1.h2 h2Var) {
        this.f263727v = h2Var;
    }

    public void setShouldBringSelfToFrontWhenDialogShown(boolean z17) {
        this.f263726u = z17;
    }
}
