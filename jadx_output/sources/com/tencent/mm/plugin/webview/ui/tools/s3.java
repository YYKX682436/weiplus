package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class s3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.x3 f186835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f186837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f186838g;

    public s3(com.tencent.mm.plugin.webview.ui.tools.x3 x3Var, int i17, java.util.List list, java.util.List list2) {
        this.f186835d = x3Var;
        this.f186836e = i17;
        this.f186837f = list;
        this.f186838g = list2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17;
        com.tencent.mm.plugin.webview.ui.tools.x3 x3Var = this.f186835d;
        com.tencent.mm.plugin.webview.ui.tools.c6 f17 = x3Var.f();
        if (!(f17 != null && f17.d()) && (i17 = this.f186836e) >= 0) {
            java.util.List list = this.f186837f;
            if (i17 >= list.size()) {
                return;
            }
            if (i17 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 0L, 1L, false);
            }
            g4Var.clear();
            java.util.List<rv.a> list2 = ((rv.b) list.get(i17)).f399826b;
            if (true ^ list2.isEmpty()) {
                for (rv.a aVar : list2) {
                    int i18 = aVar.f399812b;
                    if (i18 != 0) {
                        boolean z17 = aVar.f399820j;
                        java.lang.String str = aVar.f399813c;
                        boolean z18 = aVar.f399817g;
                        int i19 = aVar.f399814d;
                        java.lang.Integer num = aVar.f399816f;
                        if (!z17 || i19 == 0 || num == null) {
                            android.graphics.drawable.Drawable drawable = aVar.f399815e;
                            if (drawable != null) {
                                g4Var.r(i18, str, "", drawable, num != null ? num.intValue() : 0, z18);
                            } else if (i19 != 0) {
                                if (num != null) {
                                    g4Var.j(i18, str, i19, num.intValue(), z18);
                                } else {
                                    g4Var.l(i18, str, i19, z18);
                                }
                            }
                        } else {
                            g4Var.k(i18, str, i19, num.intValue(), z17, false);
                        }
                    }
                }
            }
            com.tencent.mm.plugin.webview.ui.tools.c6 f18 = x3Var.f();
            if (f18 != null) {
                f18.u(x3Var.f187642b, g4Var);
            }
            x3Var.getClass();
            int size = g4Var.size();
            for (int i27 = 0; i27 < size; i27++) {
                android.view.MenuItem item = g4Var.getItem(i27);
                kotlin.jvm.internal.o.e(item, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                ((db5.h4) item).f228362J = new com.tencent.mm.plugin.webview.ui.tools.v3(this.f186838g, x3Var);
            }
        }
    }
}
