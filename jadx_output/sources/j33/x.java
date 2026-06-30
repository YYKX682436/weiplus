package j33;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f297467d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f297468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f297469f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f297470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f297471h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f297472i;

    /* renamed from: m, reason: collision with root package name */
    public e06.k f297473m;

    /* renamed from: n, reason: collision with root package name */
    public e06.k f297474n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f297475o;

    public x(androidx.recyclerview.widget.LinearLayoutManager layoutManager, androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f297467d = layoutManager;
        this.f297468e = recyclerView;
        this.f297469f = i17;
        this.f297470g = "MicroMsg.AlbumScrollPerformanceUIC.ResumeGalleryVisibleBindHolderTask[" + hashCode() + ']';
        this.f297475o = new java.util.LinkedHashSet();
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f297467d;
        int w17 = linearLayoutManager.w();
        int y17 = linearLayoutManager.y();
        int i17 = y17 - w17;
        int max = (java.lang.Math.max(this.f297469f, i17) - i17) / 2;
        int b17 = h3.a.b(w17 - max, 0, w17);
        int b18 = h3.a.b(max + y17, y17, linearLayoutManager.getItemCount() - 1);
        this.f297473m = new e06.k(b17, w17 - 1);
        this.f297474n = new e06.k(y17 + 1, b18);
        this.f297475o.clear();
        com.tencent.mars.xlog.Log.i(this.f297470g, "resumeAdapterBind: visible:[" + w17 + ", " + y17 + "], todo: [" + b17 + ',' + b18 + "], upRecheckPosRange=" + this.f297473m + ", downRecheckPosRange=" + this.f297474n);
        if (w17 <= y17) {
            while (!this.f297471h) {
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f297468e;
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
                if (p07 != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.onBindViewHolder(p07, w17);
                }
                if (w17 == y17) {
                    break;
                } else {
                    w17++;
                }
            }
        }
        this.f297472i = true;
    }
}
