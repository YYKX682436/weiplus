package pl2;

/* loaded from: classes3.dex */
public final class d implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356620a;

    public d(pl2.s sVar) {
        this.f356620a = sVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        pl2.m mVar;
        pl2.s sVar = this.f356620a;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = sVar.c().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int y17 = linearLayoutManager != null ? linearLayoutManager.y() : 0;
        if (y17 == sVar.f356656k.size() - 1 && (mVar = sVar.f356651f) != null) {
            int size = sVar.f356656k.size();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onLoadNextPage position:" + y17 + ", size:" + size);
            vd2.t1 t1Var = ((vd2.l4) mVar).f435804c.f111486h;
            if (t1Var != null) {
                ((vd2.v2) t1Var).s(y17, size, dk2.ef.I);
            }
        }
        return true;
    }
}
