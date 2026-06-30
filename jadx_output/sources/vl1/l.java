package vl1;

/* loaded from: classes9.dex */
public class l implements vl1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView f437808a;

    public l(com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView) {
        this.f437808a = mRecyclerView;
    }

    @Override // vl1.p
    public void a(android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = this.f437808a;
        vl1.n nVar = mRecyclerView.f92099c2;
        if (nVar != null) {
            nVar.a(mRecyclerView, view, i17, j17);
        }
    }
}
