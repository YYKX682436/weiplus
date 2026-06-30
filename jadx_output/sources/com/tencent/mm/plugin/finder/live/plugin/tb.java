package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tb extends com.tencent.mm.plugin.finder.live.plugin.l implements he2.b {
    public static final jz5.g B;
    public boolean A;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114368p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f114369q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f114370r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f114371s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f114372t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f114373u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f114374v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f114375w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f114376x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f114377y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f114378z;

    static {
        new com.tencent.mm.plugin.finder.live.plugin.jb(null);
        B = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.ib.f112953d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        int i17;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114368p = statusMonitor;
        this.f114369q = "";
        this.f114372t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ob(this));
        this.f114373u = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.sb(this));
        this.f114374v = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.lb(root, this));
        this.f114376x = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.pb(root, this));
        this.f114377y = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.mb(root, this));
        this.f114378z = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.qb(this));
        this.A = true;
        if (x0()) {
            i17 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 0.22d);
            com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else {
            i17 = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 0.25d);
            com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout finderMaxSizeLayout = (com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout) root.findViewById(com.tencent.mm.R.id.awg);
        finderMaxSizeLayout.b(i17, false);
        finderMaxSizeLayout.setForbidHorizontalScroll(true);
        com.tencent.mm.view.recyclerview.WxRecyclerView t17 = t1();
        t17.setLayoutManager(new com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin$2$1(t17.getRootView().getContext()));
        t17.N(new com.tencent.mm.plugin.finder.live.plugin.hb(root));
    }

    public final void A1(boolean z17) {
        if (z17 != this.f114370r) {
            com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", "isFirstPageCommentData from " + this.f114370r + " to " + z17);
        }
        this.f114370r = z17;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.kb.f113211a[status.ordinal()] == 1) {
            this.A = !(bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", "unMount " + hashCode() + " commentListVisible:" + this.f114371s);
        z1(false);
        y1("");
        this.A = true;
        android.view.ViewTreeObserver viewTreeObserver = t1().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) this.f114372t).getValue());
        }
        t1().V0((com.tencent.mm.plugin.finder.live.plugin.rb) ((jz5.n) this.f114373u).getValue());
        com.tencent.mars.xlog.Log.i("BoxCommentListPresenter", "isFinished:" + v1().f406832a.a1());
    }

    @Override // he2.b
    public android.view.View W() {
        return this.f365323d;
    }

    @Override // he2.b
    public void j(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return x0() || this.A;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView t1() {
        java.lang.Object value = this.f114374v.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final int u1() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f114375w;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.getItemCount();
        }
        return 0;
    }

    public final se2.a0 v1() {
        return (se2.a0) ((jz5.n) this.f114376x).getValue();
    }

    @Override // he2.b
    public void w(int i17) {
        ((com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout) this.f365323d.findViewById(com.tencent.mm.R.id.awg)).b(i17, false);
    }

    public final void w1() {
        com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", "pauseBoxComment " + hashCode() + " id:" + this.f114369q);
        android.view.ViewTreeObserver viewTreeObserver = t1().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((android.view.ViewTreeObserver.OnGlobalLayoutListener) ((jz5.n) this.f114372t).getValue());
        }
        t1().V0((com.tencent.mm.plugin.finder.live.plugin.rb) ((jz5.n) this.f114373u).getValue());
        z1(false);
    }

    public final void x1(java.lang.String prefix, lm2.t notifyMsg) {
        lm2.c cVar;
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(notifyMsg, "notifyMsg");
        if (zl2.q4.f473933a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(prefix.concat(":"));
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f114375w;
            java.util.List data = wxRecyclerAdapter != null ? wxRecyclerAdapter.getData() : null;
            int i17 = notifyMsg.f319449a;
            int i18 = notifyMsg.f319450b + i17;
            while (i17 < i18) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
                sb7.append(i17);
                sb7.append(',');
                sb7.append((data == null || (cVar = (lm2.c) kz5.n0.a0(data, i17)) == null) ? null : cVar.g());
                sb7.append(']');
                sb6.append(sb7.toString());
                i17++;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", java.lang.String.valueOf(sb6));
        }
    }

    public final void y1(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (!kotlin.jvm.internal.o.b(value, this.f114369q)) {
            com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", "attachBoxId from:" + this.f114369q + " to " + value);
        }
        this.f114369q = value;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", "mount " + hashCode());
    }

    public final void z1(boolean z17) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        if (z17 != this.f114371s) {
            com.tencent.mars.xlog.Log.i("FinderLiveBoxCommentPlugin", "commentListVisible " + hashCode() + " from " + this.f114371s + " to " + z17);
            if (z17) {
                se2.a0 v17 = v1();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyAllData commentListVisible:");
                com.tencent.mm.plugin.finder.live.plugin.tb tbVar = v17.f406832a;
                sb6.append(tbVar.f114371s);
                sb6.append(" size:");
                sb6.append(tbVar.u1());
                com.tencent.mars.xlog.Log.i("BoxCommentListPresenter", sb6.toString());
                if (tbVar.f114371s && (wxRecyclerAdapter = tbVar.f114375w) != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                se2.a0 v18 = v1();
                int u17 = u1();
                if (u17 > 0) {
                    v18.f406832a.t1().post(new se2.z(v18, u17));
                } else {
                    com.tencent.mars.xlog.Log.i("BoxCommentListPresenter", "[updateMessagesOnViewAttach] curVisiableFirstPosition:" + ((mm2.e0) v18.b(mm2.e0.class)).f328972o);
                }
            } else {
                se2.a0 v19 = v1();
                com.tencent.mm.plugin.finder.live.plugin.tb tbVar2 = v19.f406832a;
                if (tbVar2.v1().f406833b > 0) {
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = tbVar2.t1().getLayoutManager();
                    kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                    ((mm2.e0) v19.b(mm2.e0.class)).f328972o = linearLayoutManager.y();
                    linearLayoutManager.w();
                    ((mm2.e0) v19.b(mm2.e0.class)).U6(((mm2.e0) v19.b(mm2.e0.class)).f328972o == tbVar2.u1() - 1);
                    mm2.e0 e0Var = (mm2.e0) v19.b(mm2.e0.class);
                    long j17 = ((mm2.e0) v19.b(mm2.e0.class)).f328974q;
                    long j18 = tbVar2.v1().f406833b;
                    if (j17 < j18) {
                        j17 = j18;
                    }
                    e0Var.f328974q = j17;
                }
            }
        }
        this.f114371s = z17;
    }
}
