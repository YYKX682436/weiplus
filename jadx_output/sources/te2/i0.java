package te2;

/* loaded from: classes10.dex */
public final class i0 extends ie2.a implements te2.x3 {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.ww f418090g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418091h;

    /* renamed from: i, reason: collision with root package name */
    public final te2.w3 f418092i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f418093m;

    /* renamed from: n, reason: collision with root package name */
    public te2.c0 f418094n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f418095o;

    /* renamed from: p, reason: collision with root package name */
    public int f418096p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f418097q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.live.plugin.ww plugin, com.tencent.mm.ui.MMActivity activity, te2.w3 w3Var, gk2.e eVar, android.view.View rootView, com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout) {
        super(rootView, frameBubbleContentLayout);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f418090g = plugin;
        this.f418091h = activity;
        this.f418092i = w3Var;
        this.f418093m = "AnchorLuckyMoneyView_" + hashCode();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f418095o = true;
        zl2.q4.f473933a.R("FinderLiveAnchorLuckyMoneyBubbleViewCallback");
    }

    public final void A(android.os.Bundle bundle) {
        if (this.f418097q) {
            p(this.f418096p);
            android.view.View B = B();
            if (B != null) {
                B.setOnClickListener(new te2.d0(this));
            }
            android.view.View B2 = B();
            if (B2 == null) {
                return;
            }
            B2.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.dsl));
        }
    }

    public final android.view.View B() {
        android.view.View t17 = t(com.tencent.mm.R.id.agx);
        if (t17 instanceof android.view.View) {
            return t17;
        }
        return null;
    }

    public final android.widget.TextView C() {
        android.view.View t17 = t(com.tencent.mm.R.id.f483768c03);
        if (t17 instanceof android.widget.TextView) {
            return (android.widget.TextView) t17;
        }
        return null;
    }

    public final com.tencent.mm.view.MMPAGView D() {
        android.view.View t17 = t(com.tencent.mm.R.id.iy7);
        com.tencent.mm.view.MMPAGView mMPAGView = t17 instanceof com.tencent.mm.view.MMPAGView ? (com.tencent.mm.view.MMPAGView) t17 : null;
        if (mMPAGView == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.Z));
        return mMPAGView;
    }

    public void E() {
        com.tencent.mm.view.MMPAGView D;
        com.tencent.mm.view.MMPAGView D2 = D();
        boolean z17 = false;
        if (D2 != null && D2.f()) {
            z17 = true;
        }
        if (z17 && (D = D()) != null) {
            D.n();
        }
        com.tencent.mm.view.MMPAGView D3 = D();
        if (D3 != null) {
            D3.i(this.f418094n);
        }
    }

    @Override // te2.x3
    public void b() {
        android.widget.TextView C = C();
        if (C != null) {
            zl2.r4.f473950a.b3(C);
        }
        this.f418094n = new te2.c0(this, this);
        com.tencent.mm.view.MMPAGView D = D();
        if (D != null) {
            D.a(this.f418094n);
        }
        android.view.View u17 = u();
        if (u17 != null) {
            u17.setOnClickListener(new te2.e0(this));
        }
        android.view.View B = B();
        if (B != null) {
            B.setOnClickListener(new te2.f0(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(D(), "finder_live_red_packet");
        if (!zl2.r4.f473950a.w1()) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(D(), 40, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(D(), new te2.g0(this));
        }
        android.view.View B2 = B();
        if (B2 != null) {
            B2.setContentDescription(this.f418091h.getString(com.tencent.mm.R.string.dsl));
        }
        this.f418097q = true;
    }

    @Override // te2.x3
    public void destroy() {
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418091h;
    }

    @Override // ie2.h
    public void l(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.h
    public android.os.Bundle o() {
        com.tencent.mm.view.MMPAGView D = D();
        if (D != null) {
            D.setProgress(0.5d);
        }
        E();
        return null;
    }

    @Override // te2.x3
    public void p(int i17) {
        com.tencent.mars.xlog.Log.i(this.f418093m, "updateLuckyMoneyCount: count:" + i17 + ", currentCnt=" + this.f418096p + ", pagView:" + D() + ", isPagEnable:" + this.f418095o);
        if (i17 >= 1) {
            com.tencent.mm.plugin.finder.live.plugin.ww wwVar = this.f418090g;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.m(wwVar, kotlinx.coroutines.internal.b0.f310484a, null, new te2.h0(this, i17, null), 2, null);
            return;
        }
        android.view.View u17 = u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        y();
    }

    @Override // te2.x3
    public void release() {
        this.f418097q = false;
        android.view.View u17 = u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        E();
        y();
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.a
    public java.lang.String v() {
        return this.f418093m;
    }
}
