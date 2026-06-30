package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nn0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f113664d;

    public nn0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        this.f113664d = wn0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        dm.o4 o4Var = (dm.o4) obj;
        if (o4Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "panelGiftSelect: " + o4Var);
            com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f113664d;
            com.tencent.mm.plugin.finder.live.wish.widget.t0 z17 = wn0Var.z1();
            java.lang.String field_rewardProductId = o4Var.field_rewardProductId;
            kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
            z17.getClass();
            if (!z17.f120785v.containsKey(field_rewardProductId)) {
                wn0Var.z1().y().postValue(new ln2.f(((ce2.i) o4Var).c1(), 10L, 0L));
            } else {
                android.view.ViewGroup viewGroup = wn0Var.f365323d;
                db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.eks));
            }
        }
    }
}
