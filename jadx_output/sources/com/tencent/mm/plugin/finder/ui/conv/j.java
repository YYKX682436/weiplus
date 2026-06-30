package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes9.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f129019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.conv.l f129020e;

    public j(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.ui.conv.l lVar) {
        this.f129019d = baseFinderFeed;
        this.f129020e = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f129019d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(baseFinderFeed.getFeedObject().getMsgTalker(), baseFinderFeed.getFeedObject().getMsgId());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f129019d;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.ui.conv.l lVar = this.f129020e;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.ConvSearchFeedViewCallback", "[handleSelectedItem] index:%s", java.lang.Integer.valueOf(itemId));
        android.app.Activity context = lVar.f129022a;
        java.lang.String str = lVar.f129026e;
        if (itemId == 1) {
            ot0.q v17 = ot0.q.v(n17.j());
            if (v17 == null || (!(51 == (i18 = v17.f348666i) || 129 == i18) || com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(context, null))) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 19L, 1L, true);
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                boolean n18 = r26.i0.n(lowerCase, "@chatroom", false);
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(n17);
                rd0.v0 v0Var = (rd0.v0) i95.n0.c(rd0.v0.class);
                com.tencent.mm.plugin.finder.ui.conv.f fVar = new com.tencent.mm.plugin.finder.ui.conv.f();
                qg5.p0 p0Var = (qg5.p0) v0Var;
                p0Var.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.ui.chatting.x3.d(context, arrayList, n18, str, new qg5.o0(fVar, p0Var));
                return;
            }
            return;
        }
        if (itemId == 2) {
            so2.v0.b(so2.v0.f410644a, baseFinderFeed2, context, null, null, 12, null);
            return;
        }
        if (itemId != 3) {
            return;
        }
        long msgId = n17.getMsgId();
        com.tencent.mars.xlog.Log.i("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(msgId));
        if (!com.tencent.mm.storage.z3.R4(str)) {
            com.tencent.mm.storage.z3 n19 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n19 == null || !n19.r2()) {
                if (n19 == null) {
                    com.tencent.mars.xlog.Log.w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                }
                db5.e1.t(context, context.getString(com.tencent.mm.R.string.f2o), context.getString(com.tencent.mm.R.string.f2p), null);
                return;
            }
        } else if (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str) == null) {
            com.tencent.mars.xlog.Log.w("Finder.ConvSearchFeedViewCallback", "[gotoChattingUIWithPosition] member is null! username:%s", str);
            db5.e1.t(context, context.getString(com.tencent.mm.R.string.f2o), context.getString(com.tencent.mm.R.string.f2p), null);
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        j45.l.u(context, ".ui.chatting.ChattingUI", putExtra, null);
    }
}
