package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes14.dex */
public final class oc extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113739p;

    /* renamed from: q, reason: collision with root package name */
    public te2.b2 f113740q;

    /* renamed from: r, reason: collision with root package name */
    public te2.d2 f113741r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113739p = statusMonitor;
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        qo0.c.a(this.f113739p, qo0.b.f365356g4, null, 2, null);
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (status.ordinal() != 188) {
            return;
        }
        K0(0);
        te2.d2 d2Var = this.f113741r;
        if (d2Var != null) {
            d2Var.w();
            com.tencent.mars.xlog.Log.i("FinderLiveCastScreenPanelWidget", "onPanelOpen");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        te2.b2 b2Var = this.f113740q;
        if (b2Var != null) {
            ((te2.l2) b2Var).onDetach();
        }
        te2.d2 d2Var = this.f113741r;
        if (d2Var != null) {
            d2Var.y();
        }
        this.f113741r = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        super.z0();
        if (this.f113740q == null || this.f113741r == null) {
            gk2.e S0 = S0();
            qo0.c cVar = this.f113739p;
            this.f113740q = new te2.l2(S0, cVar);
            android.view.ViewGroup viewGroup = this.f365323d;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            te2.d2 d2Var = new te2.d2(context, cVar, (com.tencent.mm.ui.MMActivity) context2, this.f113740q);
            this.f113741r = d2Var;
            android.view.View view = d2Var.f417945o;
            if (view != null) {
                qo0.c cVar2 = d2Var.f417941h;
                com.tencent.mm.ui.MMActivity mMActivity = d2Var.f417942i;
                te2.b2 b2Var = d2Var.f417943m;
                d2Var.f417944n = new te2.a3(view, cVar2, mMActivity, b2Var);
                te2.a3 y17 = d2Var.y();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(y17.f417856d.getContext());
                androidx.recyclerview.widget.RecyclerView recyclerView = y17.f417869t;
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(y17.f417873x);
                y17.f417872w.setOnClickListener(new te2.q2(y17));
                if (b2Var != null) {
                    ((te2.l2) b2Var).onAttach(d2Var.y());
                }
                wd2.g gVar = d2Var.f118384g;
                com.tencent.mm.ui.fk.a(gVar.f444844k);
                com.tencent.mm.ui.fk.a(gVar.f444843j);
            }
            if (!x0()) {
                te2.d2 d2Var2 = this.f113741r;
                if (d2Var2 != null) {
                    te2.a3 y18 = d2Var2.y();
                    int b17 = i65.a.b(y18.f417856d.getContext(), com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC);
                    android.view.ViewGroup.LayoutParams layoutParams2 = y18.f417866q.getLayoutParams();
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 != null) {
                        layoutParams3.topMargin = (int) (b17 * 0.3d);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams4 = y18.f417865p.getLayoutParams();
                    layoutParams = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                    if (layoutParams == null) {
                        return;
                    }
                    layoutParams.topMargin = (int) (b17 * 0.3d);
                    return;
                }
                return;
            }
            te2.d2 d2Var3 = this.f113741r;
            if (d2Var3 != null) {
                te2.a3 y19 = d2Var3.y();
                android.view.View view2 = y19.f417856d;
                int dimension = ((int) (com.tencent.mm.ui.bl.b(view2.getContext()).y - view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz))) - ((int) view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn));
                android.view.ViewGroup.LayoutParams layoutParams5 = y19.f417866q.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.topMargin = (int) (dimension * 0.3d);
                }
                android.view.ViewGroup.LayoutParams layoutParams7 = y19.f417865p.getLayoutParams();
                layoutParams = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
                if (layoutParams == null) {
                    return;
                }
                layoutParams.topMargin = (int) (dimension * 0.3d);
            }
        }
    }
}
