package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class hb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129323d;

    public hb(com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        this.f129323d = finderMsgFeedDetailUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f129323d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderMsgFeedDetailUI.E;
        if (baseFinderFeed != null) {
            com.tencent.mm.plugin.finder.feed.c9 c9Var = finderMsgFeedDetailUI.f128637w;
            if (c9Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.k3 q07 = c9Var.getRecyclerView().q0(0, false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var != null) {
                androidx.appcompat.app.AppCompatActivity context = finderMsgFeedDetailUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
                com.tencent.mm.plugin.finder.feed.c9 c9Var2 = finderMsgFeedDetailUI.f128637w;
                if (c9Var2 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer = c9Var2.f106973i;
                if (finderFavDrawer == null) {
                    kotlin.jvm.internal.o.o("favDrawer");
                    throw null;
                }
                a4Var.getClass();
                com.tencent.mm.plugin.finder.viewmodel.component.a4.Z6(a4Var, null, baseFinderFeed, s0Var, new com.tencent.mm.plugin.finder.viewmodel.component.s2(finderFavDrawer), new com.tencent.mm.plugin.finder.viewmodel.component.t2(finderFavDrawer), false, 32, null);
                android.app.Activity context2 = a4Var.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
                com.tencent.mm.plugin.finder.viewmodel.component.u2 u2Var = new com.tencent.mm.plugin.finder.viewmodel.component.u2(finderFavDrawer);
                haVar.getClass();
                finderFavDrawer.h(new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, 7, u2Var, null));
            }
            com.tencent.mm.plugin.finder.feed.c9 c9Var3 = finderMsgFeedDetailUI.f128637w;
            if (c9Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer2 = c9Var3.f106973i;
            if (finderFavDrawer2 == null) {
                kotlin.jvm.internal.o.o("favDrawer");
                throw null;
            }
            com.tencent.mm.plugin.finder.storage.FinderItem feedObj = baseFinderFeed.getFeedObject();
            kotlin.jvm.internal.o.g(feedObj, "feedObj");
            if (finderFavDrawer2.q()) {
                return;
            }
            finderFavDrawer2.feedObj = feedObj;
            finderFavDrawer2.r(true, true, 0);
        }
    }
}
