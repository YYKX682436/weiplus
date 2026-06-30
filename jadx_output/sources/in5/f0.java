package in5;

/* loaded from: classes10.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.j0 f293039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f293042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f293043h;

    public f0(in5.j0 j0Var, int i17, in5.n0 n0Var, int i18, java.lang.Object obj) {
        this.f293039d = j0Var;
        this.f293040e = i17;
        this.f293041f = n0Var;
        this.f293042g = i18;
        this.f293043h = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.j0 j0Var = this.f293039d;
        int i17 = this.f293040e;
        boolean h17 = j0Var.h(i17);
        in5.n0 n0Var = this.f293041f;
        if (h17) {
            n0Var.notifyItemRangeChanged(this.f293042g, i17, this.f293043h);
            return;
        }
        com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", "[onItemRangeChanged] preItemCount=" + i17 + " but now itemCount is " + n0Var.getItemCount());
    }
}
