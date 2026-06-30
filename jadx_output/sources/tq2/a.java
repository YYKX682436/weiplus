package tq2;

/* loaded from: classes2.dex */
public final class a extends kz2.c {

    /* renamed from: e, reason: collision with root package name */
    public int f421219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String traceName) {
        super(traceName);
        kotlin.jvm.internal.o.g(traceName, "traceName");
    }

    @Override // kz2.c
    public void b(java.lang.String node) {
        kotlin.jvm.internal.o.g(node, "node");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.b(node);
        com.tencent.mm.plugin.finder.report.j0 j0Var = com.tencent.mm.plugin.finder.report.j0.f125083a;
        j0Var.e(this.f421219e);
        int i17 = this.f421219e;
        org.json.JSONObject d17 = d();
        com.tencent.mm.plugin.finder.report.g0 c17 = j0Var.c(i17, false);
        if (c17 != null) {
            c17.f125041g = d17;
        }
        com.tencent.mars.xlog.Log.i("NearbyHomeTimeConsumingTrace", "time:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
