package in5;

/* loaded from: classes10.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293078d;

    public j1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f293078d = wxRecyclerAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause visibleExposeMap.size:");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293078d;
        sb6.append(wxRecyclerAdapter.E.size());
        sb6.append(" sessionExposeMap.size:");
        sb6.append(wxRecyclerAdapter.D.size());
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", sb6.toString());
        wxRecyclerAdapter.E.clear();
        wxRecyclerAdapter.D.clear();
    }
}
