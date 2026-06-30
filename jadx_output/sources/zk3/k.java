package zk3;

/* loaded from: classes8.dex */
public final class k extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473473a;

    public k(zk3.g0 g0Var) {
        this.f473473a = g0Var;
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        zk3.g0 g0Var = this.f473473a;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = g0Var.f473454i;
        androidx.recyclerview.widget.n2 itemAnimator = wxRecyclerView != null ? wxRecyclerView.getItemAnimator() : null;
        if (itemAnimator != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "originItemAnimator=" + itemAnimator);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = g0Var.f473454i;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setItemAnimator(null);
            }
            android.os.Handler handler = g0Var.f473465w;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new zk3.i(g0Var, itemAnimator), itemAnimator.f12171f + 60);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        zk3.g0 g0Var = this.f473473a;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = g0Var.f473454i;
        androidx.recyclerview.widget.n2 itemAnimator = wxRecyclerView != null ? wxRecyclerView.getItemAnimator() : null;
        if (itemAnimator != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "originItemAnimator=" + itemAnimator);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = g0Var.f473454i;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setItemAnimator(null);
            }
            android.os.Handler handler = g0Var.f473465w;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new zk3.j(g0Var, itemAnimator), itemAnimator.f12171f + 60);
        }
        c(i17, i18);
    }
}
