package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class hr implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderNpsSurveyView f134648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f134649f;

    public hr(in5.s0 s0Var, com.tencent.mm.plugin.finder.feed.FinderNpsSurveyView finderNpsSurveyView, com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar) {
        this.f134647d = s0Var;
        this.f134648e = finderNpsSurveyView;
        this.f134649f = hsVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 itemHolder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(itemHolder, "itemHolder");
        com.tencent.mm.plugin.finder.feed.model.e5 e5Var = (com.tencent.mm.plugin.finder.feed.model.e5) itemHolder.f293125i;
        r45.zk2 zk2Var = e5Var.f107825d;
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onItemClick wording = " + e5Var.getString(1) + " answerId = " + e5Var.getLong(0));
        android.widget.TextView textView = (android.widget.TextView) itemHolder.p(com.tencent.mm.R.id.nsm);
        if (textView != null) {
            in5.s0 s0Var = this.f134647d;
            com.tencent.mm.plugin.finder.feed.FinderNpsSurveyView finderNpsSurveyView = this.f134648e;
            com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f134649f;
            textView.setTextColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481630yi);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = finderNpsSurveyView.f106104d;
            if (wxRecyclerView != null) {
                int childCount = wxRecyclerView.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    wxRecyclerView.getChildAt(i18).setEnabled(false);
                }
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.finder.viewmodel.component.gr grVar = new com.tencent.mm.plugin.finder.viewmodel.component.gr(hsVar, s0Var, zk2Var, e5Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(grVar, 500L, false);
        }
    }
}
