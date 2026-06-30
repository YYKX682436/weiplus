package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class rc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.xc f124182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f124183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124184f;

    public rc(com.tencent.mm.plugin.finder.profile.uic.xc xcVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str) {
        this.f124182d = xcVar;
        this.f124183e = appCompatActivity;
        this.f124184f = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        androidx.appcompat.app.AppCompatActivity context = this.f124183e;
        com.tencent.mm.plugin.finder.profile.uic.xc xcVar = this.f124182d;
        if (itemId != 1) {
            if (itemId != 2) {
                if (itemId == 4) {
                    intent.putExtra("key_finder_post_router", 16);
                } else if (itemId != 10012) {
                    if (xcVar.f124354f.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.i1.f460495a.a(xcVar.getActivity(), (r45.xa5) xcVar.f124354f.get(java.lang.Integer.valueOf(menuItem.getItemId())));
                    }
                }
            }
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePageActionSheetAlbumPickingButton", xcVar.R6(), 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), false);
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 2);
            com.tencent.mm.plugin.finder.report.p2.f125237a.G("andr_Post_ActionSheet_Camera", null);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "post_actionsheet_album", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        } else {
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePageActionSheetShootingButton", xcVar.R6(), 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
            intent.putExtra("key_finder_post_router", 2);
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "post_acionsheet_camera", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            com.tencent.mm.plugin.finder.profile.uic.xc.O6(xcVar, "view_clk", context);
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfileActionSheetPublish");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfileActionSheetPublish");
            com.tencent.mm.plugin.finder.report.p2.f125237a.G("andr_Post_ActionSheet_Camera", null);
            if (I0 != null && L0 != null) {
                com.tencent.mm.plugin.finder.report.x2.f125429a.e("3", L0, I0, 3, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo W0 = L0.W0();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(pm0.v.u(L0.W0().getLong(0)));
                sb6.append(';');
                sb6.append(W0.getString(1));
                sb6.append(';');
                sb6.append(W0.getInteger(2));
                sb6.append(';');
                sb6.append(W0.getString(3));
                sb6.append(';');
                r45.vs2 vs2Var = L0.field_ctrInfo;
                sb6.append(vs2Var != null ? vs2Var.f388499t : null);
                java.lang.String v17 = r26.i0.v(sb6.toString(), ",", ";", false, 4, null);
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setSvrEntryExtInfo(v17);
                }
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
        }
        intent.putExtra("key_finder_post_from", 1);
        intent.putExtra("key_finder_post_id", this.f124184f);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", xcVar.getUsername());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, intent, 132, 10);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(context, intent);
    }
}
