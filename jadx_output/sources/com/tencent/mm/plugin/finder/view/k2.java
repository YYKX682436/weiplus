package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class k2 {
    public k2(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String feedIdString, java.lang.String viewId, java.lang.String eventId) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedIdString, "feedIdString");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str2 = "";
        if (V6 == null || (str = V6.getString(2)) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (V6 != null && (string = V6.getString(1)) != null) {
            str2 = string;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
        lVarArr[3] = new jz5.l("feed_id", feedIdString);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, kz5.c1.l(lVarArr), 25496);
    }
}
