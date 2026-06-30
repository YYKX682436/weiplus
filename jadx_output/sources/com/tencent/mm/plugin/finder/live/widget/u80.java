package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class u80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ra f119962d;

    public u80(com.tencent.mm.plugin.finder.live.widget.ra raVar) {
        this.f119962d = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.tencent.mm.plugin.finder.live.widget.ra raVar = this.f119962d;
        int i17 = com.tencent.mm.ui.bl.b(raVar.f118183e).y;
        int i18 = (int) (i17 * 0.75f);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = raVar.B;
        int height = (y1Var == null || (view = y1Var.f212027f) == null) ? 0 : view.getHeight();
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = raVar.f119613b2;
        if (maxHeightWxRecyclerView == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        int height2 = height - maxHeightWxRecyclerView.getHeight();
        if (height2 < 0) {
            height2 = 0;
        }
        int i19 = i18 - height2;
        int i27 = i19 >= 0 ? i19 : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("applyMaxHeightLimit: screenH=");
        sb6.append(i17);
        sb6.append(", panelH=");
        sb6.append(height);
        sb6.append(", rvH=");
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView2 = raVar.f119613b2;
        if (maxHeightWxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("hostListRv");
            throw null;
        }
        sb6.append(maxHeightWxRecyclerView2.getHeight());
        sb6.append(", nonRvH=");
        sb6.append(height2);
        sb6.append(", maxRvH=");
        sb6.append(i27);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", sb6.toString());
        if (i27 > 0) {
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView3 = raVar.f119613b2;
            if (maxHeightWxRecyclerView3 == null) {
                kotlin.jvm.internal.o.o("hostListRv");
                throw null;
            }
            if (maxHeightWxRecyclerView3.getMaxHeight() != i27) {
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView4 = raVar.f119613b2;
                if (maxHeightWxRecyclerView4 == null) {
                    kotlin.jvm.internal.o.o("hostListRv");
                    throw null;
                }
                maxHeightWxRecyclerView4.setMaxHeight(i27);
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView5 = raVar.f119613b2;
                if (maxHeightWxRecyclerView5 != null) {
                    maxHeightWxRecyclerView5.requestLayout();
                } else {
                    kotlin.jvm.internal.o.o("hostListRv");
                    throw null;
                }
            }
        }
    }
}
