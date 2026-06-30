package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class md {
    public md(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        ((wx2.i) ((m40.n0) i95.n0.c(m40.n0.class))).getClass();
        if (!gm0.j1.a()) {
            int i17 = com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget.G;
            com.tencent.mars.xlog.Log.e("Finder.LiveOnliveWidget", "loadPagLib account is not ready");
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1279L, 200L, 1L);
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("pag");
            g0Var.C(1279L, 201L, 1L);
        }
    }
}
