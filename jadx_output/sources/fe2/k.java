package fe2;

/* loaded from: classes3.dex */
public final class k implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f261519d;

    public k(fe2.q qVar) {
        this.f261519d = qVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        fe2.q qVar = this.f261519d;
        boolean x07 = qVar.x0();
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "onCardVisibleLiveData, visible = " + bool + ", isLandscape = " + x07);
        if (x07 || qVar.f261529t.getChildCount() < 2) {
            return;
        }
        kotlin.jvm.internal.o.d(bool);
        int i17 = bool.booleanValue() ? qVar.A : 0;
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = (com.tencent.mm.plugin.finder.live.plugin.tb) qVar.X0(com.tencent.mm.plugin.finder.live.plugin.tb.class);
        android.view.ViewGroup viewGroup = qVar.f365323d;
        if (tbVar != null) {
            android.view.ViewGroup.LayoutParams layoutParams = tbVar.t1().getLayoutParams();
            layoutParams.width = com.tencent.mm.ui.bl.b(viewGroup.getContext()).x - i17;
            tbVar.t1().setLayoutParams(layoutParams);
            androidx.recyclerview.widget.f2 adapter = tbVar.t1().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var = (com.tencent.mm.plugin.finder.live.plugin.vk0) qVar.X0(com.tencent.mm.plugin.finder.live.plugin.vk0.class);
        if (vk0Var != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = vk0Var.u1().getLayoutParams();
            layoutParams2.width = com.tencent.mm.ui.bl.b(viewGroup.getContext()).x - i17;
            vk0Var.u1().setLayoutParams(layoutParams2);
            androidx.recyclerview.widget.f2 adapter2 = vk0Var.u1().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
    }
}
