package s92;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final s92.g f405006a = new s92.g();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a2. Please report as an issue. */
    public static void c(s92.g gVar, android.content.Context context, java.lang.String str, int i17, int i18, int i19, r45.e21 e21Var, com.tencent.mm.plugin.finder.activity.uic.y1 y1Var, int i27, java.lang.Object obj) {
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        r45.sz6 sz6Var;
        java.lang.String string;
        java.lang.String eid = (i27 & 2) != 0 ? "" : str;
        int i28 = (i27 & 4) != 0 ? 0 : i17;
        int i29 = (i27 & 8) != 0 ? 0 : i18;
        int i37 = (i27 & 16) != 0 ? 59 : i19;
        r45.e21 e21Var2 = (i27 & 32) != 0 ? null : e21Var;
        com.tencent.mm.plugin.finder.activity.uic.y1 y1Var2 = (i27 & 64) != 0 ? null : y1Var;
        gVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(eid, "eid");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str4 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (e21Var2 != null) {
            try {
                j17 = e21Var2.getLong(0);
            } catch (org.json.JSONException e17) {
                e = e17;
                str2 = valueOf;
                com.tencent.mars.xlog.Log.e("FinderActivityReporter", e.getMessage());
                com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i37);
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i28);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                g0Var.d(21875, Ri, str4, valueOf2, valueOf3, str2, eid, r26.i0.t(jSONObject2, ",", ";", false));
                return;
            }
        } else {
            j17 = 0;
        }
        java.lang.String u17 = pm0.v.u(j17);
        if (e21Var2 != null) {
            str3 = "";
            sz6Var = (r45.sz6) e21Var2.getCustom(26);
        } else {
            str3 = "";
            sz6Var = null;
        }
        str2 = valueOf;
        try {
        } catch (org.json.JSONException e18) {
            e = e18;
            com.tencent.mars.xlog.Log.e("FinderActivityReporter", e.getMessage());
            com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf22 = java.lang.Integer.valueOf(i37);
            java.lang.Integer valueOf32 = java.lang.Integer.valueOf(i28);
            java.lang.String jSONObject22 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject22, "toString(...)");
            g0Var2.d(21875, Ri, str4, valueOf22, valueOf32, str2, eid, r26.i0.t(jSONObject22, ",", ";", false));
            return;
        }
        switch (eid.hashCode()) {
            case -1387268524:
                if (eid.equals("join_activity_publish")) {
                    jSONObject.put("activityid", u17);
                    jSONObject.put("join_activity_result", y1Var2 != null ? java.lang.Integer.valueOf(y1Var2.f101975a) : null);
                    jSONObject.put("intercept_type", y1Var2 != null ? java.lang.Integer.valueOf(y1Var2.f101976b) : null);
                    if (sz6Var != null) {
                        jSONObject.put("template_type", sz6Var.getInteger(1));
                    }
                    if (sz6Var != null && (string = sz6Var.getString(2)) != null) {
                        jSONObject.put("templateid", string);
                    }
                }
                com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var22 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Integer valueOf222 = java.lang.Integer.valueOf(i37);
                java.lang.Integer valueOf322 = java.lang.Integer.valueOf(i28);
                java.lang.String jSONObject222 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject222, "toString(...)");
                g0Var22.d(21875, Ri, str4, valueOf222, valueOf322, str2, eid, r26.i0.t(jSONObject222, ",", ";", false));
                return;
            case 177080114:
                if (!eid.equals("link_h5")) {
                    com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                    com.tencent.mm.plugin.report.service.g0 g0Var222 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Integer valueOf2222 = java.lang.Integer.valueOf(i37);
                    java.lang.Integer valueOf3222 = java.lang.Integer.valueOf(i28);
                    java.lang.String jSONObject2222 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2222, "toString(...)");
                    g0Var222.d(21875, Ri, str4, valueOf2222, valueOf3222, str2, eid, r26.i0.t(jSONObject2222, ",", ";", false));
                    return;
                }
                jSONObject.put("TopicId", u17);
                if (e21Var2 != null || (r2 = e21Var2.getString(2)) == null) {
                    java.lang.String str5 = str3;
                }
                jSONObject.put("TopicName", str5);
                com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var2222 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Integer valueOf22222 = java.lang.Integer.valueOf(i37);
                java.lang.Integer valueOf32222 = java.lang.Integer.valueOf(i28);
                java.lang.String jSONObject22222 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject22222, "toString(...)");
                g0Var2222.d(21875, Ri, str4, valueOf22222, valueOf32222, str2, eid, r26.i0.t(jSONObject22222, ",", ";", false));
                return;
            case 313015585:
                if (eid.equals("link_editnote_avatar_profile")) {
                    jSONObject.put(ya.b.SOURCE, 2);
                    jSONObject.put("seat_type", i29);
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.tencent.mm.plugin.finder.activity.uic.o) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.activity.uic.o.class)).X = jSONObject;
                }
                com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var22222 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Integer valueOf222222 = java.lang.Integer.valueOf(i37);
                java.lang.Integer valueOf322222 = java.lang.Integer.valueOf(i28);
                java.lang.String jSONObject222222 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject222222, "toString(...)");
                g0Var22222.d(21875, Ri, str4, valueOf222222, valueOf322222, str2, eid, r26.i0.t(jSONObject222222, ",", ";", false));
                return;
            case 845948712:
                if (eid.equals("feed_jumpicon")) {
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
                    jSONObject.put("type", 0);
                }
                com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var222222 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Integer valueOf2222222 = java.lang.Integer.valueOf(i37);
                java.lang.Integer valueOf3222222 = java.lang.Integer.valueOf(i28);
                java.lang.String jSONObject2222222 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2222222, "toString(...)");
                g0Var222222.d(21875, Ri, str4, valueOf2222222, valueOf3222222, str2, eid, r26.i0.t(jSONObject2222222, ",", ";", false));
                return;
            case 1935057288:
                if (eid.equals("link_miniprogram")) {
                    jSONObject.put("TopicId", u17);
                    if (e21Var2 != null) {
                        break;
                    }
                    java.lang.String str52 = str3;
                    jSONObject.put("TopicName", str52);
                }
                com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var2222222 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Integer valueOf22222222 = java.lang.Integer.valueOf(i37);
                java.lang.Integer valueOf32222222 = java.lang.Integer.valueOf(i28);
                java.lang.String jSONObject22222222 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject22222222, "toString(...)");
                g0Var2222222.d(21875, Ri, str4, valueOf22222222, valueOf32222222, str2, eid, r26.i0.t(jSONObject22222222, ",", ";", false));
                return;
            default:
                com.tencent.mars.xlog.Log.i("FinderActivityReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i37 + " action:" + i28 + " eid:" + eid + " udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0 g0Var22222222 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Integer valueOf222222222 = java.lang.Integer.valueOf(i37);
                java.lang.Integer valueOf322222222 = java.lang.Integer.valueOf(i28);
                java.lang.String jSONObject222222222 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject222222222, "toString(...)");
                g0Var22222222.d(21875, Ri, str4, valueOf222222222, valueOf322222222, str2, eid, r26.i0.t(jSONObject222222222, ",", ";", false));
                return;
        }
    }

    public static void d(s92.g gVar, android.app.Activity activity, android.view.View view, java.lang.String viewId, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = 8;
        }
        gVar.getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.Map b17 = com.tencent.mm.plugin.finder.report.d2.f124994a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), null);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, viewId);
        cy1.a aVar2 = (cy1.a) aVar.ik(view, i17, 25496);
        aVar2.gk(view, b17);
        aVar2.Ai(view, new s92.f(viewId, activity));
    }

    public final void a(android.content.Context context, android.content.Intent intent, long j17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        try {
            java.lang.String str = xy2.c.e(context) + '-' + j17;
            java.lang.String stringExtra = intent.getStringExtra("key_udf_kv");
            org.json.JSONObject jSONObject = stringExtra != null ? new org.json.JSONObject(stringExtra) : new org.json.JSONObject();
            jSONObject.put("vst_id", str);
            jSONObject.put("activity_entry_type", i17);
            intent.putExtra("key_udf_kv", jSONObject.toString());
            intent.putExtra("start_time", j17);
            intent.putExtra("vst_id", str);
            intent.putExtra("activity_entry_type", i17);
        } catch (cl0.f unused) {
        }
    }

    public final java.util.Map b(android.app.Activity activity) {
        r45.sz6 sz6Var;
        r45.sz6 sz6Var2;
        r45.sz6 sz6Var3;
        r45.sz6 sz6Var4;
        r45.r03 r03Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.u uVar = pf5.u.f353936a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) uVar.b(activity).c(zy2.ra.class))).V6();
        int intExtra = activity.getIntent().getIntExtra("key_ref_comment_scene", 0);
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC = (com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC) uVar.b(activity).a(com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC.class);
        java.lang.String str = null;
        r45.e21 e21Var = (finderActivityTabUIC == null || (r03Var = (r45.r03) finderActivityTabUIC.f452711w) == null) ? null : (r45.e21) r03Var.getCustom(16);
        java.lang.String u17 = pm0.v.u(activity.getIntent().getLongExtra("key_activity_id", 0L));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getPageParams] activityId:");
        sb6.append(u17);
        sb6.append(" templateType:");
        sb6.append((e21Var == null || (sz6Var4 = (r45.sz6) e21Var.getCustom(26)) == null) ? null : java.lang.Integer.valueOf(sz6Var4.getInteger(1)));
        sb6.append(" templateId:");
        sb6.append((e21Var == null || (sz6Var3 = (r45.sz6) e21Var.getCustom(26)) == null) ? null : sz6Var3.getString(2));
        com.tencent.mars.xlog.Log.i("FinderActivityReporter", sb6.toString());
        jz5.l[] lVarArr = new jz5.l[11];
        lVarArr[0] = new jz5.l("ref_commentscene", java.lang.Integer.valueOf(intExtra));
        lVarArr[1] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
        lVarArr[2] = new jz5.l("behaviour_session_id", V6.getString(0));
        lVarArr[3] = new jz5.l("finder_context_id", V6.getString(1));
        lVarArr[4] = new jz5.l("finder_tab_context_id", V6.getString(2));
        lVarArr[5] = new jz5.l("tab_type", java.lang.Integer.valueOf(activity.getIntent().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0)));
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = (com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC) uVar.b(activity).e(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.class);
        lVarArr[6] = new jz5.l("activity_enter_source", finderActivityParticipateUIC != null ? (java.lang.String) ((jz5.n) finderActivityParticipateUIC.f101824u).getValue() : null);
        lVarArr[7] = new jz5.l("page_activityid", u17);
        lVarArr[8] = new jz5.l("template_type", (e21Var == null || (sz6Var2 = (r45.sz6) e21Var.getCustom(26)) == null) ? null : java.lang.Integer.valueOf(sz6Var2.getInteger(1)));
        if (e21Var != null && (sz6Var = (r45.sz6) e21Var.getCustom(26)) != null) {
            str = sz6Var.getString(2);
        }
        lVarArr[9] = new jz5.l("templateid", str);
        lVarArr[10] = new jz5.l("page_activityname", activity.getIntent().getStringExtra("key_activity_name"));
        return kz5.c1.k(lVarArr);
    }
}
