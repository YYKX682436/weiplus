package in5;

/* loaded from: classes10.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293082d;

    public k1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        this.f293082d = wxRecyclerAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f293082d;
        in5.b1 b1Var = wxRecyclerAdapter.G;
        if (b1Var != null) {
            b1Var.onScrollStateChanged(wxRecyclerAdapter.b0(), 7);
        }
    }
}
