package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class jb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI f129393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dm.pd f129394e;

    public jb(com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI, dm.pd pdVar) {
        this.f129393d = finderMsgFeedDetailUI;
        this.f129394e = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f129393d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderMsgFeedDetailUI.E;
        if (baseFinderFeed != null) {
            boolean isLiveFeed = baseFinderFeed.getFeedObject().isLiveFeed();
            dm.pd pdVar = this.f129394e;
            if (isLiveFeed) {
                com.tencent.mm.plugin.finder.feed.c9 c9Var = finderMsgFeedDetailUI.f128637w;
                if (c9Var == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = c9Var.f106974m;
                if (finderLikeDrawer == null) {
                    kotlin.jvm.internal.o.o("liveLikeDrawer");
                    throw null;
                }
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
                java.lang.String str = pdVar.field_username;
                com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(finderLikeDrawer, null, feedObject, null, 0, str == null ? "" : str, null, 40, null);
                return;
            }
            com.tencent.mm.plugin.finder.feed.c9 c9Var2 = finderMsgFeedDetailUI.f128637w;
            if (c9Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.k3 q07 = c9Var2.getRecyclerView().q0(0, false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var != null) {
                androidx.appcompat.app.AppCompatActivity context = finderMsgFeedDetailUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
                com.tencent.mm.plugin.finder.feed.c9 c9Var3 = finderMsgFeedDetailUI.f128637w;
                if (c9Var3 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                a4Var.R6(null, baseFinderFeed, s0Var, c9Var3.l());
            }
            com.tencent.mm.plugin.finder.feed.c9 c9Var4 = finderMsgFeedDetailUI.f128637w;
            if (c9Var4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer l17 = c9Var4.l();
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
            java.lang.String str2 = pdVar.field_username;
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(l17, null, feedObject2, null, 0, str2 == null ? "" : str2, null, 40, null);
        }
    }
}
