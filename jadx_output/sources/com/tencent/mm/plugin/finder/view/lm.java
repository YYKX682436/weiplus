package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class lm {
    public lm(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.ui.MMFragmentActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isInShareStatus time interval:");
        long c17 = c01.id.c();
        jz5.l lVar = com.tencent.mm.plugin.finder.view.mm.F;
        sb6.append(c17 - ((java.lang.Number) lVar.f302834e).longValue());
        com.tencent.mars.xlog.Log.i("Finder.TimelineShareDialog", sb6.toString());
        return ((java.lang.Boolean) lVar.f302833d).booleanValue() && ((java.lang.Number) lVar.f302834e).longValue() != 0 && c01.id.c() - ((java.lang.Number) lVar.f302834e).longValue() < 500;
    }
}
