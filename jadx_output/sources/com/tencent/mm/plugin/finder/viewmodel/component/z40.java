package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z40 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f136654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136656g;

    public z40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f136653d = f50Var;
        this.f136654e = i17;
        this.f136655f = str;
        this.f136656g = str2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        g92.b bVar = g92.b.f269769e;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136653d;
        m92.b j37 = g92.a.j3(bVar, f50Var.f134338d, false, 2, null);
        int i18 = (!(((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("PersonalCenterActionSheetPost") != null && ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("PersonalCenterActionSheetPost") != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) || (j37 != null ? j37.w0() : false)) ? 0 : 1;
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.W(p2Var.i(f50Var.getContext(), this.f136654e, false));
        p2Var.R(this.f136655f);
        if (menuItem.getItemId() == 1001) {
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalCenterPageActionSheetShootingButton", f50Var.Z6(), 0, this.f136656g, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("is_red_dot", i18);
            intent.putExtra("key_finder_post_router", 2);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            android.app.Activity context = f50Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "post_acionsheet_camera", jSONObject2, nyVar != null ? nyVar.V6() : null, null, 16, null);
            if (i18 != 0) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("PersonalCenterActionSheetPost");
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("PersonalCenterActionSheetPost");
                if (I0 != null && L0 != null) {
                    com.tencent.mm.plugin.finder.report.x2.f125429a.e("4", L0, I0, 3, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
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
            }
            p2Var.G("andr_Post_ActionSheet_Camera", null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
        } else if (menuItem.getItemId() == 1002) {
            ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalCenterPageActionSheetAlbumPickingButton", f50Var.Z6(), 0, this.f136656g, false);
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 1);
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
            android.app.Activity context2 = f50Var.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            p2Var.G("andr_Post_ActionSheet_Album", null);
        } else if (menuItem.getItemId() == 1031) {
            intent.putExtra("key_finder_post_router", 16);
        } else {
            java.util.HashMap hashMap = f50Var.f134346n;
            if (hashMap.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.i1.f460495a.a(f50Var.getActivity(), (r45.xa5) hashMap.get(java.lang.Integer.valueOf(menuItem.getItemId())));
            }
        }
        intent.putExtra("key_finder_post_from", 5);
        intent.putExtra("key_finder_post_id", this.f136656g);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", f50Var.f134338d);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(f50Var.getActivity(), intent, 132, 9);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(f50Var.getActivity(), intent);
    }
}
