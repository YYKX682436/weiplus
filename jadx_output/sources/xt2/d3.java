package xt2;

/* loaded from: classes3.dex */
public final class d3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f456684b;

    public d3(xt2.e3 e3Var, java.lang.Object obj) {
        this.f456683a = e3Var;
        this.f456684b = obj;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        r45.ce0 ce0Var;
        bw5.x7 x7Var;
        bw5.x7 x7Var2;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object obj = this.f456684b;
        xt2.e3 e3Var = this.f456683a;
        if (z17) {
            android.graphics.Rect r17 = pm0.v.r(e3Var.f456707i);
            boolean z18 = r17.width() > 0 && r17.height() > 0;
            if (e3Var.f456703e.getLiveRole() == 0 && z18) {
                e3Var.h((cm2.m0) obj);
            }
        }
        df2.x9 x9Var = (df2.x9) e3Var.getPlugin().U0(df2.x9.class);
        if (x9Var != null && x9Var.f231767n) {
            r45.ce0 ce0Var2 = (r45.ce0) ((cm2.m0) obj).f43368v.getCustom(9);
            if (ce0Var2 != null && (x7Var2 = (bw5.x7) ce0Var2.getCustom(10)) != null) {
                com.tencent.mars.xlog.Log.i(e3Var.f456706h, "try preload ecs full page");
                android.content.Context context = e3Var.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pq.a aVar = new pq.a(context);
                i95.m c17 = i95.n0.c(pq.q.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                pq.q.h6((pq.q) c17, aVar, x7Var2, null, null, 12, null);
            }
            r45.bd5 bd5Var = (r45.bd5) ((cm2.m0) obj).f43368v.getCustom(70);
            if (bd5Var == null || (ce0Var = (r45.ce0) bd5Var.getCustom(2)) == null || (x7Var = (bw5.x7) ce0Var.getCustom(10)) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i(e3Var.f456706h, "try preload ecs button page");
            android.content.Context context2 = e3Var.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pq.a aVar2 = new pq.a(context2);
            i95.m c18 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            pq.q.h6((pq.q) c18, aVar2, x7Var, null, null, 12, null);
        }
    }
}
