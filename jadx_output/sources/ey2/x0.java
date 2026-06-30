package ey2;

/* loaded from: classes2.dex */
public final class x0 implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f257564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f257565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f257566c;

    public x0(ey2.b1 b1Var, int i17, int i18) {
        this.f257564a = b1Var;
        this.f257565b = i17;
        this.f257566c = i18;
    }

    @Override // db2.d3
    public boolean isBeginHistory() {
        return false;
    }

    @Override // db2.d3
    public boolean isResultConsume(int i17, int i18, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        return false;
    }

    @Override // db2.d3
    public void onBuildRequest(db2.b3 request) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed[] O6 = this.f257564a.O6(this.f257565b, hc2.d0.b(this.f257566c), 32767);
        boolean z17 = true;
        if (O6 != null) {
            arrayList = new java.util.ArrayList(O6.length);
            for (com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed : O6) {
                r45.vw2 vw2Var = new r45.vw2();
                vw2Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getFeedObject().getId()));
                vw2Var.set(1, baseFinderFeed.g0());
                arrayList.add(vw2Var);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z17 = false;
        }
        request.set(35, z17 ? null : new java.util.LinkedList(arrayList));
    }

    @Override // db2.d3
    public void onLoadFinish() {
    }
}
