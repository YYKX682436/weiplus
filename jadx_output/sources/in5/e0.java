package in5;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f293028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f293031g;

    public e0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18) {
        this.f293028d = j0Var;
        this.f293029e = i17;
        this.f293030f = n0Var;
        this.f293031g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f293028d;
        int i17 = this.f293029e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f293030f;
        if (h17) {
            n0Var.notifyItemChanged(this.f293031g, java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", "[onItemRangeChanged] preItemCount=" + i17 + " but now itemCount is " + n0Var.getItemCount());
    }
}
