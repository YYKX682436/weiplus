package dk2;

/* loaded from: classes2.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.t f233552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f233554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f233555h;

    public h2(int i17, km2.t tVar, dk2.r4 r4Var, int i18, int i19) {
        this.f233551d = i17;
        this.f233552e = tVar;
        this.f233553f = r4Var;
        this.f233554g = i18;
        this.f233555h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        int size = (nVar == null || (arrayList = nVar.f309153e) == null) ? 0 : arrayList.size();
        int i17 = this.f233551d;
        int f17 = e06.p.f(i17, 0, size);
        km2.n nVar2 = dk2.ef.H;
        if (nVar2 != null) {
            java.util.HashMap hashMap = km2.n.f309147p;
            km2.t data = this.f233552e;
            kotlin.jvm.internal.o.g(data, "data");
            int f18 = e06.p.f(f17, 0, nVar2.f309153e.size());
            nVar2.f309153e.add(f18, data);
            com.tencent.mars.xlog.Log.i(nVar2.f309149a, "#insertGuideData position=" + f18 + ", now liveDataList.size=" + nVar2.f309153e.size());
            km2.u uVar = nVar2.f309154f;
            if (uVar != null) {
                uVar.q(f18, 1);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f233553f.f234009d, "Guide container inserted at position " + f17 + " (original: " + i17 + "), curPos=" + this.f233554g + ", readLiveCount=" + this.f233555h + ", listSize=" + size);
    }
}
