package ub4;

/* loaded from: classes4.dex */
public class p extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f426194d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public ub4.l f426195e = null;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        int size = ((java.util.ArrayList) this.f426194d).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        ub4.n nVar = (ub4.n) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        nVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        ub4.p pVar = nVar.f426191f;
        java.util.List list = pVar.f426194d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        r45.jj4 jj4Var = ((ub4.e) ((java.util.ArrayList) list).get(i17)).f426157b;
        int i18 = jj4Var.f377856e;
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        android.view.View view = nVar.f426189d;
        hj6.d0(jj4Var, view, view.getContext().hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, com.tencent.mm.storage.s7.a());
        ub4.o oVar = new ub4.o(pVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        java.util.List list2 = pVar.f426194d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        oVar.f426192a = ((ub4.e) ((java.util.ArrayList) list2).get(i17)).f426156a;
        oVar.f426193b = jj4Var.f377855d;
        view.setTag(oVar);
        nVar.f426190e.setVisibility(jj4Var.f377856e == 6 ? 0 : 8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        ub4.n nVar = new ub4.n(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cqm, viewGroup, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        return nVar;
    }
}
