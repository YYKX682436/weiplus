package id2;

/* loaded from: classes2.dex */
public final class n5 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f290696a;

    public n5(id2.p5 p5Var) {
        this.f290696a = p5Var;
    }

    @Override // in5.p
    public float a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0.5f;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("FinderLiveSelfLotteryHistoryResultUIC", "onExposeTimeRecorded: size = " + recordsSet.size());
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        in5.c cVar = item.f293070a;
        if ((cVar instanceof so2.a3 ? (so2.a3) cVar : null) != null) {
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            java.lang.String O6 = id2.p5.O6(this.f290696a);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.a(O6, "", b52.b.b(), "lottery_page_list", "");
        }
    }
}
