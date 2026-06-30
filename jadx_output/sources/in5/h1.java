package in5;

/* loaded from: classes10.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f293063e;

    public h1(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f293062d = wxRecyclerAdapter;
        this.f293063e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.b1 b1Var = this.f293062d.G;
        if (b1Var != null) {
            b1Var.onScrollStateChanged(this.f293063e, 8);
        }
    }
}
