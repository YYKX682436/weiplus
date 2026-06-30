package so2;

/* loaded from: classes10.dex */
public abstract class g0 {
    public static final void a(jv2.i iVar, android.content.Context context, java.lang.String bizUsername, int i17) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        if (i17 == 120) {
            com.tencent.mars.xlog.Log.i("FinderCommentInfoEx", "jumpBizProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((android.app.Activity) context).finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, iVar.f302223d.field_feedId, null, 0, 5, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        intent.putExtra("Contact_User", bizUsername);
        intent.putExtra("Contact_Scene", 214);
        intent.putExtra("biz_profile_enter_from_finder", true);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("biz_profile_tab_type", 1);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public static final void b(so2.y0 y0Var, android.content.Context context, java.lang.String bizUsername, int i17, com.tencent.mm.plugin.finder.storage.FinderItem currentFeed, java.lang.String bypassData) {
        kotlin.jvm.internal.o.g(y0Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(currentFeed, "currentFeed");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        if (i17 == 120) {
            com.tencent.mars.xlog.Log.i("FinderCommentInfoEx", "jumpBizProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((android.app.Activity) context).finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, yj0Var.field_feedId, null, 0, 5, false, 0, yj0Var.field_dupFlag, 192, null);
        intent.putExtra("Contact_User", bizUsername);
        intent.putExtra("Contact_Scene", 214);
        boolean z17 = true;
        intent.putExtra("biz_profile_enter_from_finder", true);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("biz_profile_tab_type", 1);
        java.lang.String sessionBuffer = currentFeed.getFeedObject().getSessionBuffer();
        if (sessionBuffer != null && sessionBuffer.length() != 0) {
            z17 = false;
        }
        java.lang.String ek6 = z17 ? ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(y0Var.getItemId(), y0Var.f410703d.field_dupFlag, i17) : currentFeed.getFeedObject().getSessionBuffer();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bypassData)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("commentAdInfo", bypassData);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                intent.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject2, ",", ";", false));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderCommentInfoEx", "jumpBizProfile build finder buffer failed, error=" + e17);
        }
        intent.putExtra("Contact_Scene_Note", ek6);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public static final void c(jv2.i iVar, java.lang.String username, android.content.Context context) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(context, "context");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            kk.l lVar = so2.f0.f410334a;
            if (com.tencent.mm.sdk.platformtools.t8.D0(so2.f0.f410335b, username) && (context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI)) {
                ((com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI) context).finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("KEY_FROM_TIMELINE", true);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, iVar.f302223d.field_feedId, null, 0, 5, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(5, iVar.f302223d.field_feedId, xy2.c.d(context), 1, username);
    }

    public static final void d(so2.y0 y0Var, java.lang.String username, android.content.Context context, java.lang.String bypassData) {
        kotlin.jvm.internal.o.g(y0Var, "<this>");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            kk.l lVar = so2.f0.f410334a;
            if (com.tencent.mm.sdk.platformtools.t8.D0(so2.f0.f410335b, username) && (context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI)) {
                ((com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI) context).finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("KEY_FROM_TIMELINE", true);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, yj0Var.field_feedId, null, 0, 5, false, 0, yj0Var.field_dupFlag, 192, null);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bypassData)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("commentAdInfo", bypassData);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                intent.putExtra("key_extra_info", r26.i0.t(jSONObject2, ",", ";", false));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderCommentInfoEx", "jumpProfile build finder buffer failed, error=" + e17);
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(5, y0Var.f410703d.field_feedId, xy2.c.d(context), 1, username);
    }

    public static final void e(r45.my0 my0Var) {
        kotlin.jvm.internal.o.g(my0Var, "<this>");
        java.lang.String string = my0Var.getString(1);
        java.lang.String string2 = my0Var.getString(4);
        if (string == null || string2 == null) {
            return;
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.o();
    }

    public static final void f(so2.y0 y0Var, boolean z17) {
        kotlin.jvm.internal.o.g(y0Var, "<this>");
        if (z17) {
            com.tencent.mm.protocal.protobuf.FinderCommentInfo u07 = y0Var.f410703d.u0();
            int extFlag = y0Var.f410703d.u0().getExtFlag();
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            u07.setExtFlag(extFlag | 2);
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderCommentInfo u08 = y0Var.f410703d.u0();
        int extFlag2 = y0Var.f410703d.u0().getExtFlag();
        java.util.regex.Pattern pattern2 = pm0.v.f356802a;
        u08.setExtFlag(extFlag2 & (-3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r8 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean g(so2.y0 r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r4, r0)
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r0 = com.tencent.mm.plugin.finder.storage.t70.Nc
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_RECOMMEND_SWITCH_INT_SYNC
            r3 = 0
            int r1 = r1.r(r2, r3)
            r2 = -1
            if (r0 == r2) goto L2e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            com.tencent.mm.plugin.finder.storage.yj0 r1 = r4.f410703d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = r1.u0()
            r45.k60 r1 = r1.getFriend_recommend_list()
            if (r1 == 0) goto L40
            java.util.LinkedList r1 = r1.getList(r3)
            goto L41
        L40:
            r1 = 0
        L41:
            r2 = 1
            if (r0 != r2) goto L58
            if (r7 != 0) goto L60
            if (r1 == 0) goto L51
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L4f
            goto L51
        L4f:
            r7 = r3
            goto L52
        L51:
            r7 = r2
        L52:
            if (r7 == 0) goto L60
            if (r6 != 0) goto L60
            if (r8 != 0) goto L60
        L58:
            r6 = 2
            if (r0 == r6) goto L60
            if (r5 == 0) goto L5e
            goto L60
        L5e:
            r5 = r3
            goto L61
        L60:
            r5 = r2
        L61:
            com.tencent.mm.plugin.finder.storage.yj0 r4 = r4.f410703d
            boolean r4 = r4.j1()
            if (r4 != 0) goto L6c
            if (r5 == 0) goto L6c
            r3 = r2
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.g0.g(so2.y0, boolean, boolean, boolean, boolean):boolean");
    }
}
