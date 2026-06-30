package in5;

/* loaded from: classes10.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f293049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f293052g;

    public g0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18) {
        this.f293049d = j0Var;
        this.f293050e = i17;
        this.f293051f = n0Var;
        this.f293052g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f293049d;
        int i17 = this.f293050e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f293051f;
        if (h17) {
            n0Var.notifyItemRangeInserted(this.f293052g, i17);
            return;
        }
        com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", "[onItemRangeInserted] preItemCount=" + i17 + " but now itemCount is " + n0Var.getItemCount());
    }
}
