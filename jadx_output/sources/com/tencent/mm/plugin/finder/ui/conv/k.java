package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes9.dex */
public final class k implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.conv.l f129021d;

    public k(com.tencent.mm.plugin.finder.ui.conv.l lVar) {
        this.f129021d = lVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.ui.conv.l lVar = this.f129021d;
        new com.tencent.mm.ui.tools.s6(lVar.f129022a).a(view, new com.tencent.mm.plugin.finder.ui.conv.i(lVar), new com.tencent.mm.plugin.finder.ui.conv.j(baseFinderFeed, lVar), null);
        return true;
    }
}
