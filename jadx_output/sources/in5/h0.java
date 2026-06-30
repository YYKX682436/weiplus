package in5;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f293057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f293060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f293061h;

    public h0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18, int i19) {
        this.f293057d = j0Var;
        this.f293058e = i17;
        this.f293059f = n0Var;
        this.f293060g = i18;
        this.f293061h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f293057d;
        int i17 = this.f293058e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f293059f;
        if (h17) {
            n0Var.notifyItemMoved(this.f293060g, this.f293061h);
            return;
        }
        com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", "[onItemRangeMoved] preItemCount=" + i17 + " but now itemCount is " + n0Var.getItemCount());
    }
}
