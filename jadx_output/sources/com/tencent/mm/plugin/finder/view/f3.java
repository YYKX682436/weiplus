package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class f3 {
    public f3(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.ui.MMFragmentActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = com.tencent.mm.plugin.finder.view.g3.f132145c;
        if (i17 < 5) {
            com.tencent.mm.plugin.finder.view.g3.f132145c = i17 + 1;
        }
        boolean z17 = ((java.lang.Boolean) com.tencent.mm.plugin.finder.view.g3.f132144b.f302833d).booleanValue() && ((java.lang.Number) com.tencent.mm.plugin.finder.view.g3.f132144b.f302834e).longValue() != 0 && c01.id.c() - ((java.lang.Number) com.tencent.mm.plugin.finder.view.g3.f132144b.f302834e).longValue() < 200 && com.tencent.mm.plugin.finder.view.g3.f132145c <= (context instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI ? 3 : 1);
        com.tencent.mars.xlog.Log.i("Finder.TimelineShareDialog", "isInShareStatus time interval:" + (c01.id.c() - ((java.lang.Number) com.tencent.mm.plugin.finder.view.g3.f132144b.f302834e).longValue()) + " blockResult:" + z17);
        return z17;
    }
}
