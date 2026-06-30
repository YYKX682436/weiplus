package zk3;

/* loaded from: classes8.dex */
public final class x implements vk3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473522a;

    public x(zk3.g0 g0Var) {
        this.f473522a = g0Var;
    }

    public void a() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        zk3.g0 g0Var = this.f473522a;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = g0Var.f473454i;
        java.lang.Object layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
        com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager minusScreenGridLayoutManager = layoutManager instanceof com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager ? (com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager) layoutManager : null;
        if (minusScreenGridLayoutManager == null || (wxRecyclerView = g0Var.f473454i) == null) {
            return;
        }
        g0Var.Z6(wxRecyclerView, minusScreenGridLayoutManager);
    }
}
