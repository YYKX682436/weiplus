package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ri implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129781d;

    public ri(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f129781d = finderShareFeedRelUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129781d;
        com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
        if (w8Var != null) {
            zy2.zb.Kh(zbVar, w8Var.getRecyclerView(), ml2.x1.f328203g, java.lang.String.valueOf(finderShareFeedRelUI.getD()), ml2.y.f328240e, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
