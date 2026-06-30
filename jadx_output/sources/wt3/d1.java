package wt3;

/* loaded from: classes5.dex */
public final class d1 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.e1 f449391d;

    public d1(wt3.e1 e1Var) {
        this.f449391d = e1Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        wt3.e1 e1Var = this.f449391d;
        java.lang.String str = e1Var.f449408i;
        int i17 = e1Var.f449452b;
        int i18 = e1Var.f449453c;
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbFetcherFactory", "get thumb fetcher, ish265: %s", java.lang.Boolean.valueOf(com.tencent.mm.modelvideoh265toh264.j.h(str)));
        com.tencent.mm.plugin.mmsight.segment.p pVar = new com.tencent.mm.plugin.mmsight.segment.p();
        pVar.init(str, e1Var.f449412m, i17, i18);
        return pVar;
    }
}
