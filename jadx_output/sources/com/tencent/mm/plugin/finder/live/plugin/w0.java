package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f114834p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f114835q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f114836r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ProgressBar f114837s;

    /* renamed from: t, reason: collision with root package name */
    public volatile int f114838t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f114839u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ValueAnimator f114840v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114834p = rootView;
        this.f114835q = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.eiw);
        this.f114836r = rootView.findViewById(com.tencent.mm.R.id.eiy);
        this.f114837s = (android.widget.ProgressBar) rootView.findViewById(com.tencent.mm.R.id.eix);
        this.f114839u = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.plugin.s0(this));
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.r0.f114067a[status.ordinal()] == 1) {
            ((mm2.w) P0(mm2.w.class)).f329499h.observe(this, new com.tencent.mm.plugin.finder.live.plugin.t0(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f114838t = 0;
        this.f114839u.removeMessages(1);
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoTimerPlugin", "showProgressTimerTv");
        this.f114835q.setVisibility(0);
        android.view.View view = this.f114836r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "showProgressTimerTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "showProgressTimerTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        K0(0);
    }
}
