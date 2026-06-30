package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class h0 extends com.tencent.mm.plugin.finder.ui.fav.x {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.fav.z f129173o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.app.Activity context, com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment fragment, com.tencent.mm.plugin.finder.ui.fav.a presenter, android.view.View view) {
        super(context, fragment, presenter, view);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f129173o = new com.tencent.mm.plugin.finder.ui.fav.z(this.f129228l);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.x
    public com.tencent.mm.plugin.finder.storage.vj0 b() {
        return this.f129173o;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.x
    public com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavCollectionLoaderFooter(context, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.x
    public boolean h(r45.qt2 qt2Var, android.view.View view, int i17, so2.j5 feed) {
        int i18;
        so2.a0 a0Var;
        int i19;
        boolean z17;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (!(feed instanceof so2.a0)) {
            return false;
        }
        so2.a0 a0Var2 = (so2.a0) feed;
        r45.cc1 cc1Var = a0Var2.f410244d;
        r45.vx0 vx0Var = (r45.vx0) cc1Var.getCustom(2);
        long j17 = vx0Var != null ? vx0Var.getLong(0) : 0L;
        com.tencent.mars.xlog.Log.i("FinderGlobalMixFavViewCallback", "click item pos:" + i17 + " topicId " + pm0.v.u(j17) + '}');
        r45.vx0 vx0Var2 = (r45.vx0) cc1Var.getCustom(2);
        if (vx0Var2 == null) {
            return true;
        }
        if (qt2Var != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            i18 = 349;
            a0Var = a0Var2;
            i19 = 0;
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, qt2Var, a0Var2.getItemId(), null, d(), 0, null, 0L, null, 240, null);
            z17 = true;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("collection_list_card", "view_clk", kz5.c1.k(new jz5.l("comment_scene", 349), new jz5.l("finder_tab_context_id", qt2Var.getString(2)), new jz5.l("finder_context_id", qt2Var.getString(1)), new jz5.l("collection_id", pm0.v.u(j17)), new jz5.l("sub_tab_type", 2)), 1, false);
        } else {
            i18 = 349;
            a0Var = a0Var2;
            i19 = 0;
            z17 = true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("collection_info", vx0Var2.toByteArray());
        java.lang.Integer num = null;
        ya2.b2 b2Var = a0Var.f410245e;
        intent.putExtra("collection_author_username", b2Var != null ? b2Var.D0() : null);
        intent.putExtra("collection_nickname", b2Var != null ? b2Var.w0() : null);
        intent.putExtra("collection_avatar_url", b2Var != null ? b2Var.getAvatarUrl() : null);
        intent.putExtra("collection_authicon_url", (b2Var == null || (finderAuthInfo2 = b2Var.field_authInfo) == null) ? null : finderAuthInfo2.getAuthIconUrl());
        if (b2Var != null && (finderAuthInfo = b2Var.field_authInfo) != null) {
            num = java.lang.Integer.valueOf(finderAuthInfo.getAuthIconType());
        }
        intent.putExtra("collection_authicon_type", num);
        intent.putExtra("collection_ref_comment_scene", i18);
        intent.setClass(this.f129217a, com.tencent.mm.plugin.finder.feed.ui.FinderCollectionUI.class);
        wa2.x.e(intent, view, 0L, false, false, null, 30, null);
        android.app.Activity activity = this.f129217a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavViewCallback", "collectionInfoProcess", "(Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Landroid/view/View;ILcom/tencent/mm/plugin/finder/model/FinderCollectInfoFeed;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(i19));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavViewCallback", "collectionInfoProcess", "(Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Landroid/view/View;ILcom/tencent/mm/plugin/finder/model/FinderCollectInfoFeed;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return z17;
    }
}
