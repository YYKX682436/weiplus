package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bn extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f112052p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f112053q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f112054r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f112055s;

    /* renamed from: t, reason: collision with root package name */
    public ce2.i f112056t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f112057u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f112058v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f2t);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        ((com.tencent.mm.view.MMPAGView) findViewById).o(ae2.in.f3688a.a(ym5.f6.f463327x));
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById;
        this.f112052p = mMPAGView;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f0n);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f112053q = findViewById2;
        this.f112058v = new java.util.concurrent.ConcurrentLinkedQueue();
        findViewById2.getLayoutParams().height = ((int) (com.tencent.mm.ui.bl.b(root.getContext()).y * 0.16f)) + com.tencent.mm.ui.bl.c(root.getContext());
        findViewById2.setPadding(0, 0, 0, com.tencent.mm.ui.zk.a(root.getContext(), 48) + com.tencent.mm.ui.bl.c(root.getContext()));
        if (zl2.r4.f473950a.w1()) {
            mMPAGView.setOnClickListener(null);
            mMPAGView.setClickable(false);
        } else {
            mMPAGView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.im(this));
        }
        mMPAGView.a(new com.tencent.mm.plugin.finder.live.plugin.jm(this));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.bn bnVar) {
        bnVar.getClass();
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        boolean z17 = !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, false);
        if (z17) {
            pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.plugin.an(bnVar));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "tryShowHideTip showGiftTip:" + z17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            super.K0(8);
        } else {
            super.K0(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005e  */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.bn.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        kotlinx.coroutines.r2 r2Var;
        super.O0();
        kotlinx.coroutines.r2 r2Var2 = this.f112057u;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f112052p;
        mMPAGView.setAlpha(1.0f);
        if (!zl2.r4.f473950a.w1()) {
            mMPAGView.setClickable(true);
        }
        android.view.View view = this.f112053q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f112053q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f112054r;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var == null || (r2Var = a9Var.f229700z) == null) {
            return;
        }
        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        df2.t6 t6Var;
        kotlinx.coroutines.r2 r2Var;
        df2.s8 s8Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "hide full screen gift, id:" + this.f112055s);
        K0(8);
        kotlinx.coroutines.r2 r2Var2 = this.f112057u;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f112052p;
        mMPAGView.setVisibility(8);
        mMPAGView.n();
        mMPAGView.setAlpha(1.0f);
        if (!zl2.r4.f473950a.w1()) {
            mMPAGView.setClickable(true);
        }
        android.view.View view = this.f112053q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f112053q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f112054r;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var != null && (r2Var = a9Var.f229700z) != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "showFundingSucAnimJob isActive = " + r2Var.a());
            if (r2Var.a() && (s8Var = (df2.s8) U0(df2.s8.class)) != null) {
                s8Var.b7();
            }
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (!(in0.q.f292769b2 != null) || (t6Var = (df2.t6) U0(df2.t6.class)) == null) {
            return;
        }
        t6Var.e7();
    }

    public final void v1(java.util.LinkedList linkedList, ce2.i iVar) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, randomGifts:".concat(kz5.n0.g0(linkedList, null, null, null, 0, null, com.tencent.mm.plugin.finder.live.plugin.um.f114588d, 31, null)));
        this.f112058v.addAll(linkedList);
        this.f112057u = com.tencent.mm.plugin.finder.live.util.y.m(this, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.xm(this, iVar, null), 2, null);
    }
}
