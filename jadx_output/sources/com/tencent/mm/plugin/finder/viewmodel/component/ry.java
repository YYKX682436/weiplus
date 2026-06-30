package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class ry implements qj5.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ty f135840a;

    public ry(com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar) {
        this.f135840a = tyVar;
    }

    public void a(java.util.List toUsers) {
        kotlin.jvm.internal.o.g(toUsers, "toUsers");
        java.util.Iterator it = toUsers.iterator();
        while (it.hasNext()) {
            qj5.r rVar = (qj5.r) it.next();
            c(rVar.f363998a, rVar.f363999b ? 3 : 2);
        }
    }

    public void b() {
        ya2.b2 contact;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar = this.f135840a;
        android.app.Activity context = tyVar.getContext();
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = tyVar.f136068e;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u((baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject3.getId()));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = tyVar.f136068e;
        java.lang.String str = null;
        lVarArr[1] = new jz5.l("session_buffer", (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.getSessionBuffer());
        lVarArr[2] = new jz5.l("screenshot_type", java.lang.Integer.valueOf(tyVar.Q6()));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = tyVar.f136068e;
        if (baseFinderFeed3 != null && (contact = baseFinderFeed3.getContact()) != null) {
            str = contact.D0();
        }
        lVarArr[3] = new jz5.l("finder_username", str);
        com.tencent.mm.plugin.finder.report.d2.i(d2Var, context, "share_screenshot", "view_clk", false, kz5.c1.k(lVarArr), 8, null);
    }

    public final void c(java.lang.String str, int i17) {
        ya2.b2 contact;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.plugin.finder.viewmodel.component.ty tyVar = this.f135840a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = tyVar.f136068e;
        java.lang.String u17 = pm0.v.u((baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject3.getId());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = tyVar.f136068e;
        java.lang.String str2 = null;
        java.lang.String sessionBuffer = (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.getSessionBuffer();
        int Q6 = tyVar.Q6();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = tyVar.f136068e;
        if (baseFinderFeed3 != null && (contact = baseFinderFeed3.getContact()) != null) {
            str2 = contact.D0();
        }
        gm0.j1.b().k();
        com.tencent.mm.plugin.finder.report.d2.g(com.tencent.mm.plugin.finder.report.d2.f124994a, tyVar.getContext(), "svr_screenshot_share", false, kz5.c1.k(new jz5.l("feed_id", u17), new jz5.l("session_buffer", sessionBuffer), new jz5.l("screenshot_type", java.lang.Integer.valueOf(Q6)), new jz5.l("finder_username", str2), new jz5.l("share_username", gm0.j1.b().k()), new jz5.l("receive_username", str), new jz5.l("share_dst_scene", java.lang.Integer.valueOf(i17))), 4, null);
    }
}
