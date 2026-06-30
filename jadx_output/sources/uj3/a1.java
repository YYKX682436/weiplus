package uj3;

/* loaded from: classes14.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.b1 f428215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(uj3.b1 b1Var) {
        super(2);
        this.f428215d = b1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickThumb");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1538L, 10L, 1L);
        uj3.b1 b1Var = this.f428215d;
        if (intValue != b1Var.f428235m) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("thumb_flip_target_position", intValue);
            b1Var.f428224b.f(uj3.a.f428200n, bundle);
            if (b1Var.f428230h != null && intValue >= 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(intValue + 1);
                sb6.append('/');
                sb6.append(b1Var.f428236n);
                java.lang.String sb7 = sb6.toString();
                uj3.y0 y0Var = b1Var.f428232j;
                if (y0Var != null) {
                    y0Var.e(sb7);
                }
                xj3.b bVar = b1Var.f428229g;
                if (bVar != null) {
                    bVar.f454866i = intValue;
                    bVar.notifyDataSetChanged();
                }
                com.tencent.mm.plugin.multitalk.ui.widget.projector.recyclerview.ScreenThumbLayoutManager screenThumbLayoutManager = b1Var.f428227e;
                if (screenThumbLayoutManager != null) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = b1Var.f428230h;
                    kotlin.jvm.internal.o.d(recyclerView);
                    screenThumbLayoutManager.smoothScrollToPosition(recyclerView, new androidx.recyclerview.widget.h3(), intValue);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickThumbFlipPage");
                g0Var.C(1538L, 11L, 1L);
            }
        }
        return jz5.f0.f302826a;
    }
}
