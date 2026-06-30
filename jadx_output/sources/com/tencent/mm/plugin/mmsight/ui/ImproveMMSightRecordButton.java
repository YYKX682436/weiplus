package com.tencent.mm.plugin.mmsight.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton;", "Landroid/widget/FrameLayout;", "", "enable", "Ljz5/f0;", "setTouchEnable", "Lcom/tencent/mm/plugin/mmsight/ui/r;", "callback", "setLongPressCallback", "Lcom/tencent/mm/plugin/mmsight/ui/s;", "setLongPressScrollCallback", "Lcom/tencent/mm/plugin/mmsight/ui/u3;", "setSimpleTapCallback", "Lcom/tencent/mm/plugin/mmsight/ui/c;", "setDelayCountDownCallback", "", "visible", "setProgressBarVisible", "color", "setInnerViewColor", "duration", "setRecordMaxDuration", "setEnableCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ImproveMMSightRecordButton extends android.widget.FrameLayout {
    public static final /* synthetic */ int L = 0;
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public com.tencent.mm.plugin.mmsight.ui.b2 F;
    public long G;
    public long H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f149147J;
    public int K;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f149148d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f149149e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar f149150f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularCustomProgressBar f149151g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f149152h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f149153i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f149154m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.r f149155n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.s f149156o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.u3 f149157p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.c f149158q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f149159r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f149160s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f149161t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f149162u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149163v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149164w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149165x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149166y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f149167z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveMMSightRecordButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f149159r = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f149161t = true;
        this.A = -1.0f;
        this.I = true;
        this.f149147J = true;
        this.K = 1;
        c();
    }

    public static final void a(com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton, boolean z17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator viewPropertyAnimator2 = improveMMSightRecordButton.f149164w;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator3 = null;
        improveMMSightRecordButton.f149164w = null;
        android.view.View view = improveMMSightRecordButton.f149148d;
        if (view == null || (viewPropertyAnimator = view.animate()) == null) {
            viewPropertyAnimator = null;
        } else {
            viewPropertyAnimator.scaleX(0.5f);
            viewPropertyAnimator.scaleY(0.5f);
            viewPropertyAnimator.setDuration(50L);
            viewPropertyAnimator.start();
        }
        improveMMSightRecordButton.f149164w = viewPropertyAnimator;
        android.widget.TextView textView = improveMMSightRecordButton.f149152h;
        if (textView != null && textView.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "when in record waiting and user go to longPress");
            android.widget.TextView textView2 = improveMMSightRecordButton.f149152h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        android.view.View view2 = improveMMSightRecordButton.f149149e;
        if (view2 != null && (animate = view2.animate()) != null) {
            animate.scaleX(1.35f);
            animate.scaleY(1.35f);
            animate.alpha(0.0f);
            animate.setDuration(50L);
            animate.setListener(new com.tencent.mm.plugin.mmsight.ui.h(improveMMSightRecordButton, z17, animate));
            animate.start();
            viewPropertyAnimator3 = animate;
        }
        improveMMSightRecordButton.f149165x = viewPropertyAnimator3;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "changeToRecordDelayWaiting");
        android.view.View view = this.f149153i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayWaiting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayWaiting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f149152h;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.view.View view2 = this.f149148d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayWaiting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayWaiting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.K = 3;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bkx, (android.view.ViewGroup) this, true);
        this.f149148d = findViewById(com.tencent.mm.R.id.f485343hd2);
        this.f149149e = findViewById(com.tencent.mm.R.id.kn_);
        this.f149151g = (com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularCustomProgressBar) findViewById(com.tencent.mm.R.id.bwq);
        this.f149150f = (com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar) findViewById(com.tencent.mm.R.id.bwr);
        this.f149152h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.csx);
        this.f149153i = findViewById(com.tencent.mm.R.id.csi);
        this.f149154m = findViewById(com.tencent.mm.R.id.bdy);
    }

    public final void d(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        android.view.ViewPropertyAnimator viewPropertyAnimator;
        android.view.ViewPropertyAnimator animate;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni >> " + this.f149162u);
        android.view.ViewPropertyAnimator viewPropertyAnimator2 = this.f149166y;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator3 = null;
        this.f149166y = null;
        android.view.View view = this.f149148d;
        if (view == null || (viewPropertyAnimator = view.animate()) == null) {
            viewPropertyAnimator = null;
        } else {
            viewPropertyAnimator.scaleX(1.0f);
            viewPropertyAnimator.scaleY(1.0f);
            viewPropertyAnimator.setDuration(50L);
            if (!this.f149162u) {
                viewPropertyAnimator.setListener(new com.tencent.mm.plugin.mmsight.ui.i(animatorListenerAdapter, viewPropertyAnimator));
            }
            viewPropertyAnimator.start();
        }
        this.f149166y = viewPropertyAnimator;
        android.view.ViewPropertyAnimator viewPropertyAnimator4 = this.f149167z;
        if (viewPropertyAnimator4 != null) {
            viewPropertyAnimator4.cancel();
        }
        this.f149167z = null;
        android.view.View view2 = this.f149149e;
        if (view2 != null && (animate = view2.animate()) != null) {
            animate.scaleX(1.0f);
            animate.scaleY(1.0f);
            animate.alpha(1.0f);
            if (this.f149162u) {
                animate.setListener(new com.tencent.mm.plugin.mmsight.ui.j(animatorListenerAdapter, animate));
            }
            animate.setDuration(50L);
            animate.start();
            viewPropertyAnimator3 = animate;
        }
        this.f149167z = viewPropertyAnimator3;
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "resetCircularProgressBar");
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularCustomProgressBar improveMMSightCircularCustomProgressBar = this.f149151g;
        if (improveMMSightCircularCustomProgressBar != null) {
            improveMMSightCircularCustomProgressBar.setVisibility(8);
        }
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar = this.f149150f;
        if (improveMMSightCircularProgressBar != null) {
            improveMMSightCircularProgressBar.setVisibility(8);
        }
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar2 = this.f149150f;
        if (improveMMSightCircularProgressBar2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightCircularProgressBar", "reset");
            com.tencent.mm.plugin.mmsight.ui.q qVar = improveMMSightCircularProgressBar2.f149146r;
            if (qVar != null) {
                qVar.f149402j = false;
                kotlinx.coroutines.r2 r2Var = qVar.f149396d;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                qVar.f149396d = null;
                qVar.f149399g = 0L;
                qVar.f149403k = null;
            }
            improveMMSightCircularProgressBar2.f149146r = null;
            improveMMSightCircularProgressBar2.f149143o = 100.0f;
            improveMMSightCircularProgressBar2.f149142n = 0.0f;
            improveMMSightCircularProgressBar2.f149144p = 0.0f;
            improveMMSightCircularProgressBar2.f149141m = null;
            improveMMSightCircularProgressBar2.invalidate();
        }
    }

    public final void f() {
        setVisibility(8);
        android.view.View view = this.f149148d;
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        android.view.View view2 = this.f149149e;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "resetWithoutAni", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "resetWithoutAni", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        e();
        this.f149162u = false;
    }

    public final void g(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setRecordMode >> " + i17 + ", " + i18);
        this.K = i17;
        if (i17 != 1) {
            if (i17 != 3) {
                return;
            }
            android.widget.TextView textView = this.f149152h;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(i18));
            }
            b();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "changeToRecordDelayNormal");
        this.K = 1;
        android.widget.TextView textView2 = this.f149152h;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r1 != 3) goto L131;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDelayCountDownCallback(com.tencent.mm.plugin.mmsight.ui.c callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setDelayCountDownCallback");
        this.f149158q = callback;
    }

    public final void setEnableCallback(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setEnableCallback, " + z17);
        this.f149147J = z17;
    }

    public final void setInnerViewColor(int i17) {
        android.view.View view = this.f149148d;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.mmsight.ui.k(this, i17));
        }
    }

    public final void setLongPressCallback(com.tencent.mm.plugin.mmsight.ui.r callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setLongPressCallback");
        this.f149155n = callback;
    }

    public final void setLongPressScrollCallback(com.tencent.mm.plugin.mmsight.ui.s callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setLongPressScrollCallback");
        this.f149156o = callback;
    }

    public final void setProgressBarVisible(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setProgressBarVisible >> " + i17);
        android.view.View view = this.f149154m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "setProgressBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "setProgressBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f149148d;
        if (view2 == null) {
            return;
        }
        int i18 = i17 == 0 ? 4 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "setProgressBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "setProgressBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setRecordMaxDuration(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setRecordMaxDuration >> " + i17);
        this.E = i17;
    }

    public final void setSimpleTapCallback(com.tencent.mm.plugin.mmsight.ui.u3 u3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setSingleTapCallback");
        this.f149157p = u3Var;
    }

    public final void setTouchEnable(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "setTouchEnable >> " + z17);
        this.f149161t = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveMMSightRecordButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f149159r = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f149161t = true;
        this.A = -1.0f;
        this.I = true;
        this.f149147J = true;
        this.K = 1;
        c();
    }
}
