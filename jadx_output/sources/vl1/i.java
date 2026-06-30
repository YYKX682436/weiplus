package vl1;

/* loaded from: classes11.dex */
public class i extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f437805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f437806b;

    public i(com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f437806b = loadMoreRecyclerView;
        this.f437805a = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        vl1.j jVar;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f437806b;
        if (loadMoreRecyclerView.f92097h2 && this.f437805a.y() == loadMoreRecyclerView.f92098b2.getItemCount() - 1 && (jVar = loadMoreRecyclerView.f92096g2) != null) {
            jVar.a(loadMoreRecyclerView, loadMoreRecyclerView.f92098b2.f437794d);
        }
    }
}
