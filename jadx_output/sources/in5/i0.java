package in5;

/* loaded from: classes10.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f293064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f293067g;

    public i0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18) {
        this.f293064d = j0Var;
        this.f293065e = i17;
        this.f293066f = n0Var;
        this.f293067g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f293064d;
        int i17 = this.f293065e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f293066f;
        if (h17) {
            n0Var.notifyItemRangeRemoved(this.f293067g, i17);
            return;
        }
        com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", "[notifyItemRangeRemoved] preItemCount=" + i17 + " but now itemCount is " + n0Var.getItemCount());
    }
}
