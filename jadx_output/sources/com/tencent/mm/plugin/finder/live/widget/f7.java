package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f7 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h7 f118319a;

    public f7(com.tencent.mm.plugin.finder.live.widget.h7 h7Var) {
        this.f118319a = h7Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        zl2.r4.f473950a.M2("FinderLiveAnchorMusicEditWidget", "clearView pos:" + viewHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView p07, androidx.recyclerview.widget.k3 p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        return androidx.recyclerview.widget.a1.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 source, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(target, "target");
        int adapterPosition = source.getAdapterPosition();
        int adapterPosition2 = target.getAdapterPosition();
        zl2.r4.f473950a.M2("FinderLiveAnchorMusicEditWidget", "onMove from:" + adapterPosition + " - to:" + adapterPosition2);
        com.tencent.mm.plugin.finder.live.widget.h7 h7Var = this.f118319a;
        bm2.t tVar = h7Var.R;
        tVar.getClass();
        if (adapterPosition2 != 0 && adapterPosition != 0) {
            try {
                java.util.Collections.swap(tVar.f22298m, adapterPosition, adapterPosition2);
                java.util.Collections.swap(tVar.f22297i, adapterPosition - 1, adapterPosition2 - 1);
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, tVar.f22296h + ",moveMusicItem:");
            }
        }
        h7Var.R.notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 p07, int i17) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
