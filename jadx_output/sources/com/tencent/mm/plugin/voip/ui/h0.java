package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes15.dex */
public final class h0 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI f176954a;

    public h0(com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI) {
        this.f176954a = repairerVoipQoSUI;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        return androidx.recyclerview.widget.a1.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 source, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(target, "target");
        int adapterPosition = source.getAdapterPosition();
        int adapterPosition2 = target.getAdapterPosition();
        int i17 = com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI.m;
        com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI repairerVoipQoSUI = this.f176954a;
        java.util.Collections.swap(repairerVoipQoSUI.U6(), adapterPosition, adapterPosition2);
        ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) repairerVoipQoSUI.h).getValue()).notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
