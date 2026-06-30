package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class v2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI f174360d;

    public v2(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI) {
        this.f174360d = statusAlbumUI;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, int i17, androidx.recyclerview.widget.RecyclerView parent) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI = this.f174360d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = statusAlbumUI.f173464e;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("rvSelfHistory");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
        if (i17 == (adapter != null ? adapter.getItemCount() : 1) - 1) {
            outRect.bottom = i65.a.b(statusAlbumUI.getContext(), 16);
        } else {
            outRect.bottom = i65.a.b(statusAlbumUI.getContext(), 8);
        }
    }
}
