package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class nc extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI f174127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f174128b;

    public nc(com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f174127a = textStatusHistoryUI;
        this.f174128b = wxRecyclerAdapter;
    }

    @Override // ym5.q3
    public void b(int i17) {
        pm0.v.X(new com.tencent.mm.plugin.textstatus.ui.kc(this.f174127a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHistoryUI", "onLoadMoreEnd");
        com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI = this.f174127a;
        bk4.d dVar = textStatusHistoryUI.f173635g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        if (!dVar.f21447g) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = textStatusHistoryUI.f173632d;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout, null, 1, null);
            if (this.f174128b.Z() == 0) {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusHistoryUI.f173633e;
                if (wxRecyclerView == null) {
                    kotlin.jvm.internal.o.o("rvSelfHistory");
                    throw null;
                }
                android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(wxRecyclerView.getContext());
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = textStatusHistoryUI.f173633e;
                if (wxRecyclerView2 == null) {
                    kotlin.jvm.internal.o.o("rvSelfHistory");
                    throw null;
                }
                android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.d0e, (android.view.ViewGroup) wxRecyclerView2, false);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f174128b;
                kotlin.jvm.internal.o.d(inflate);
                in5.n0.P(wxRecyclerAdapter, inflate, Integer.MAX_VALUE, false, 4, null);
                inflate.findViewById(com.tencent.mm.R.id.hy8).setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.lc(textStatusHistoryUI));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHistoryUI", "hasMoreData true");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = textStatusHistoryUI.f173633e;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView3.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = textStatusHistoryUI.f173633e;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.post(new com.tencent.mm.plugin.textstatus.ui.mc(textStatusHistoryUI));
        } else {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
    }
}
