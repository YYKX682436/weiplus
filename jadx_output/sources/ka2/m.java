package ka2;

/* loaded from: classes10.dex */
public final class m extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306039J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI, in5.s sVar) {
        super(sVar, arrayList, false);
        this.I = arrayList;
        this.f306039J = finderPoiNormalLbsListUI;
    }

    @Override // in5.n0, com.tencent.mm.ui.recyclerview.SynchronizedAdapter, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        boolean z17;
        r45.hd1 hd1Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        super.onBindViewHolder(holder, i17, payloads);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.qvk);
        if (imageView != null) {
            com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306039J;
            if (finderPoiNormalLbsListUI.f101793t) {
                ha2.a aVar = finderPoiNormalLbsListUI.f101794u;
                z17 = kotlin.jvm.internal.o.b((aVar == null || (hd1Var = aVar.f279791d) == null) ? null : hd1Var.getString(0), ((ha2.a) this.I.get(i17)).f279791d.getString(0));
            } else {
                z17 = finderPoiNormalLbsListUI.f101795v == i17;
            }
            imageView.setVisibility(z17 ? 0 : 8);
        }
    }
}
