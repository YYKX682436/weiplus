package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class g6 extends com.tencent.mm.plugin.finder.report.d6 {

    /* renamed from: h, reason: collision with root package name */
    public qb2.i0 f125055h;

    public g6() {
        com.tencent.mm.plugin.finder.report.b bVar = new com.tencent.mm.plugin.finder.report.b();
        bVar.f124958c = new com.tencent.mm.plugin.finder.report.f6();
        this.f125002g = bVar;
    }

    public final boolean a() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f124999d;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                int w17 = linearLayoutManager.w();
                if (w17 <= 0) {
                    w17 = 0;
                }
                this.f125000e = w17;
                int y17 = linearLayoutManager.y();
                if (y17 <= 0) {
                    y17 = 0;
                }
                this.f125001f = y17;
                int i17 = this.f125000e;
                if (i17 <= y17) {
                    while (true) {
                        qb2.i0 i0Var = this.f125055h;
                        qb2.t L = i0Var != null ? (i17 < 0 || i17 >= i0Var.K()) ? (qb2.t) i0Var.f361172n.get(i17 - i0Var.K()) : i0Var.L(i17) : null;
                        if (L != null && kotlin.jvm.internal.o.b(L.field_sessionId, "finder_system_message")) {
                            return true;
                        }
                        if (i17 == y17) {
                            break;
                        }
                        i17++;
                    }
                }
            }
        }
        return false;
    }
}
