package zk3;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n2 f473472e;

    public j(zk3.g0 g0Var, androidx.recyclerview.widget.n2 n2Var) {
        this.f473471d = g0Var;
        this.f473472e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f473471d.f473454i;
        if (wxRecyclerView == null) {
            return;
        }
        wxRecyclerView.setItemAnimator(this.f473472e);
    }
}
