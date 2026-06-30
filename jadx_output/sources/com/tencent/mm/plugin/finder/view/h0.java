package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class h0 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.y0 f132201a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f132202b;

    public h0(so2.y0 commentItem, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(context, "context");
        this.f132201a = commentItem;
        this.f132202b = context;
    }

    @Override // db5.r4
    public void a(android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        java.lang.Object obj;
        java.util.Map l17;
        char c17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        java.util.Map k17 = kz5.c1.k(new jz5.l(1, "comment_delete"), new jz5.l(3, "comment_blacklisted"), new jz5.l(9, "comment_blacklisted_movein"), new jz5.l(10, "comment_blacklisted_and_delete"));
        so2.y0 commentItem = this.f132201a;
        boolean z17 = commentItem instanceof so2.z0;
        java.util.Map k18 = kz5.c1.k(new jz5.l(0, "comment_copy"), new jz5.l(6, "comment_topup"), new jz5.l(2, "comment_complaint"), new jz5.l(13, "comment_all_translate"), new jz5.l(14, "comment_all_cancel_translate"), new jz5.l(17, "share_comment"));
        boolean containsKey = k17.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()));
        android.content.Context context = this.f132202b;
        if (containsKey) {
            java.lang.String viewId = (java.lang.String) k17.get(java.lang.Integer.valueOf(menuItem.getItemId()));
            if (viewId == null || r26.n0.N(viewId)) {
                return;
            }
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(viewId, "viewId");
            kotlin.jvm.internal.o.g(commentItem, "commentItem");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(menuView, viewId);
            dy1.r ik6 = aVar.ik(menuView, 40, 25496);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", viewId);
            lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
            lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
            lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
            lVarArr[4] = new jz5.l("comment_id", pm0.v.u(commentItem.f410703d.t0()));
            lVarArr[5] = new jz5.l("feed_id", pm0.v.u(commentItem.f410703d.field_feedId));
            ((cy1.a) ik6).gk(menuView, kz5.c1.l(lVarArr));
            return;
        }
        if (k18.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
            java.lang.String viewId2 = (java.lang.String) k18.get(java.lang.Integer.valueOf(menuItem.getItemId()));
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
            int itemId = menuItem.getItemId();
            if (itemId == 13 || itemId == 14) {
                obj = "finder_context_id";
                l17 = kz5.c1.l(new jz5.l("translate_to_language", com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a)), new jz5.l("session_buffer", b(z17, V6)));
            } else {
                obj = "finder_context_id";
                l17 = itemId == 17 ? kz5.c1.l(new jz5.l("session_buffer", b(z17, V6))) : null;
            }
            if (viewId2 == null || r26.n0.N(viewId2)) {
                return;
            }
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(viewId2, "viewId");
            kotlin.jvm.internal.o.g(commentItem, "commentItem");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V62 = nyVar3 != null ? nyVar3.V6() : null;
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(menuView, viewId2);
            aVar2.Tj(menuView, 40, 1, false);
            jz5.l[] lVarArr2 = new jz5.l[5];
            lVarArr2[0] = new jz5.l("comment_id", pm0.v.u(commentItem.getItemId()));
            boolean z18 = true;
            lVarArr2[1] = new jz5.l("feed_id", pm0.v.u(commentItem instanceof so2.z0 ? ((so2.z0) commentItem).E.getId() : commentItem.f410703d.field_feedId));
            if (V62 != null) {
                c17 = 2;
                str = V62.getString(2);
            } else {
                c17 = 2;
                str = null;
            }
            lVarArr2[c17] = new jz5.l("finder_tab_context_id", str);
            lVarArr2[3] = new jz5.l(obj, V62 != null ? V62.getString(1) : null);
            lVarArr2[4] = new jz5.l("comment_scene", V62 != null ? java.lang.Integer.valueOf(V62.getInteger(5)) : null);
            java.util.Map l18 = kz5.c1.l(lVarArr2);
            if (l17 != null && !l17.isEmpty()) {
                z18 = false;
            }
            if (!z18) {
                l18.putAll(l17);
            }
            aVar2.gk(menuView, l18);
        }
    }

    public final java.lang.String b(boolean z17, r45.qt2 qt2Var) {
        long j17;
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        so2.y0 y0Var = this.f132201a;
        if (z17) {
            kotlin.jvm.internal.o.e(y0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedCommentHeaderContent");
            j17 = ((so2.z0) y0Var).E.getId();
        } else {
            j17 = y0Var.f410703d.field_feedId;
        }
        return o3Var.ek(j17, y0Var.f410703d.field_dupFlag, qt2Var != null ? qt2Var.getInteger(5) : 0);
    }
}
