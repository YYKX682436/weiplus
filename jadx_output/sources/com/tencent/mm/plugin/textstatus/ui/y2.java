package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class y2 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI f174444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f174445b;

    public y2(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f174444a = statusAlbumUI;
        this.f174445b = wxRecyclerAdapter;
    }

    @Override // ym5.q3
    public void b(int i17) {
        pm0.v.X(new com.tencent.mm.plugin.textstatus.ui.w2(this.f174444a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "onLoadMoreEnd");
        com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI = this.f174444a;
        bk4.d dVar = statusAlbumUI.f173466g;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        if (!dVar.f21447g) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = statusAlbumUI.f173463d;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout, null, 1, null);
            if (this.f174445b.Z() == 0) {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = statusAlbumUI.f173464e;
                if (wxRecyclerView == null) {
                    kotlin.jvm.internal.o.o("rvSelfHistory");
                    throw null;
                }
                android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(wxRecyclerView.getContext());
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = statusAlbumUI.f173464e;
                if (wxRecyclerView2 == null) {
                    kotlin.jvm.internal.o.o("rvSelfHistory");
                    throw null;
                }
                android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.d0d, (android.view.ViewGroup) wxRecyclerView2, false);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f174445b;
                kotlin.jvm.internal.o.d(inflate);
                in5.n0.P(wxRecyclerAdapter, inflate, Integer.MAX_VALUE, false, 4, null);
                inflate.findViewById(com.tencent.mm.R.id.hy8).setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.x2(statusAlbumUI));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusAlbumUI", "hasMoreData true");
        }
        statusAlbumUI.l0();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = statusAlbumUI.f173464e;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView3.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
