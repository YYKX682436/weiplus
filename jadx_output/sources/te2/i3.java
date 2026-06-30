package te2;

/* loaded from: classes10.dex */
public final class i3 implements te2.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.ww f418103d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418104e;

    /* renamed from: f, reason: collision with root package name */
    public final te2.w3 f418105f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f418106g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f418107h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f418108i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f418109m;

    /* renamed from: n, reason: collision with root package name */
    public te2.d3 f418110n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f418111o;

    /* renamed from: p, reason: collision with root package name */
    public int f418112p;

    public i3(com.tencent.mm.plugin.finder.live.plugin.ww plugin, com.tencent.mm.ui.MMActivity activity, te2.w3 w3Var, gk2.e eVar, android.view.View rootView) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f418103d = plugin;
        this.f418104e = activity;
        this.f418105f = w3Var;
        this.f418106g = rootView;
        this.f418107h = "CommonLuckyMoneyView_" + hashCode();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f418111o = true;
        zl2.q4.f473933a.R("FinderLiveLuckyMoneyBubbleViewCallback");
    }

    public void a() {
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f418109m;
        boolean z17 = false;
        if (mMPAGView2 != null && mMPAGView2.f()) {
            z17 = true;
        }
        if (z17 && (mMPAGView = this.f418109m) != null) {
            mMPAGView.n();
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = this.f418109m;
        if (mMPAGView3 != null) {
            mMPAGView3.i(this.f418110n);
        }
    }

    @Override // te2.x3
    public void b() {
        android.view.View view = this.f418106g;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483768c03);
        this.f418108i = textView;
        if (textView != null) {
            zl2.r4.f473950a.b3(textView);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) view.findViewById(com.tencent.mm.R.id.iy7);
        if (mMPAGView != null) {
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.Y));
        } else {
            mMPAGView = null;
        }
        this.f418109m = mMPAGView;
        te2.d3 d3Var = new te2.d3(this, this);
        this.f418110n = d3Var;
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f418109m;
        if (mMPAGView2 != null) {
            mMPAGView2.a(d3Var);
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = this.f418109m;
        if (mMPAGView3 != null) {
            mMPAGView3.setOnClickListener(new te2.e3(this));
        }
        if (view != null) {
            view.setOnClickListener(new te2.f3(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f418109m, "finder_live_red_packet");
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f418109m, 40, 25561);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f418109m, new te2.g3(this));
    }

    @Override // te2.x3
    public void destroy() {
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418104e;
    }

    @Override // te2.x3
    public android.view.View h() {
        return this.f418106g;
    }

    @Override // te2.x3
    public void p(int i17) {
        com.tencent.mars.xlog.Log.i(this.f418107h, "updateLuckyMoneyCount: count:" + i17 + ", currentCnt=" + this.f418112p + ", pagView:" + this.f418109m + ", isPagEnable:" + this.f418111o);
        a();
        if (i17 >= 1) {
            com.tencent.mm.plugin.finder.live.plugin.ww wwVar = this.f418103d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.m(wwVar, kotlinx.coroutines.internal.b0.f310484a, null, new te2.h3(i17, this, null), 2, null);
            return;
        }
        android.view.View view = this.f418106g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // te2.x3
    public void release() {
        android.view.View view = this.f418106g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a();
    }
}
