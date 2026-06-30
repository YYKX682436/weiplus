package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class q4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132871a;

    public q4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f132871a = finderColumnFrameLayout;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.Map map;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        r45.ey0 ey0Var;
        ey2.u uVar = this.f132871a.f130914r;
        if (uVar == null) {
            return null;
        }
        r45.en2 place_holder_info = uVar.f257525d.getFeedObject().getFinderObject().getPlace_holder_info();
        java.lang.Integer valueOf = (place_holder_info == null || (ey0Var = (r45.ey0) place_holder_info.getCustom(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var.getInteger(0));
        java.lang.String str2 = valueOf + '-' + pm0.v.u(uVar.f257538t);
        jz5.l lVar = (jz5.l) uVar.f257542x.getValue();
        if (lVar != null && (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) != null) {
            java.lang.Object obj = dataBuffer.get(uVar.f257536r);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed != null) {
                jz5.l[] lVarArr = new jz5.l[10];
                r45.qt2 qt2Var = uVar.f257527f;
                java.lang.String string = qt2Var.getString(2);
                if (string == null) {
                    string = "";
                }
                lVarArr[0] = new jz5.l("finder_tab_context_id", string);
                java.lang.String string2 = qt2Var.getString(1);
                lVarArr[1] = new jz5.l("finder_context_id", string2 != null ? string2 : "");
                lVarArr[2] = new jz5.l("comment_scene", java.lang.String.valueOf(qt2Var.getInteger(5)));
                lVarArr[3] = new jz5.l("session_buffer", baseFinderFeed.g0());
                lVarArr[4] = new jz5.l("feed_columnid", java.lang.String.valueOf(valueOf));
                lVarArr[5] = new jz5.l("column_exp_index", java.lang.Integer.valueOf(uVar.f257541w + 1));
                lVarArr[6] = new jz5.l("column_trace_id", str2);
                lVarArr[7] = new jz5.l("exp_feedid", pm0.v.u(baseFinderFeed.getItemId()));
                lVarArr[8] = new jz5.l("from_comment_scene", java.lang.Integer.valueOf(uVar.f257539u));
                lVarArr[9] = new jz5.l("to_comment_scene", java.lang.Integer.valueOf(uVar.f257540v));
                map = kz5.c1.k(lVarArr);
                return map;
            }
        }
        map = kz5.q0.f314001d;
        return map;
    }
}
