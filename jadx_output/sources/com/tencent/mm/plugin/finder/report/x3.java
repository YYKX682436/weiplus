package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.x3 f125432a = new com.tencent.mm.plugin.finder.report.x3();

    /* renamed from: b, reason: collision with root package name */
    public static long f125433b;

    /* renamed from: c, reason: collision with root package name */
    public static org.json.JSONObject f125434c;

    public final void a(db5.g4 menu) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        kotlin.jvm.internal.o.g(menu, "menu");
        if (menu.findItem(103) != null && (jSONObject4 = f125434c) != null) {
            jSONObject4.put("button_forward_friendcircle", 1);
        }
        if (menu.findItem(102) != null && (jSONObject3 = f125434c) != null) {
            jSONObject3.put("button_forward_friend", 1);
        }
        if (menu.findItem(113) != null && (jSONObject2 = f125434c) != null) {
            jSONObject2.put("textstatus_in_menu", 1);
        }
        if (menu.findItem(114) == null || (jSONObject = f125434c) == null) {
            return;
        }
        jSONObject.put("button_set_bell", 1);
    }

    public final void b(db5.g4 menu) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        org.json.JSONObject jSONObject5;
        org.json.JSONObject jSONObject6;
        org.json.JSONObject jSONObject7;
        org.json.JSONObject jSONObject8;
        org.json.JSONObject jSONObject9;
        kotlin.jvm.internal.o.g(menu, "menu");
        if (menu.findItem(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE) != null && (jSONObject9 = f125434c) != null) {
            jSONObject9.put("button_minimize", 1);
        }
        if (menu.findItem(116) != null && (jSONObject8 = f125434c) != null) {
            jSONObject8.put("button_speedplay", 1);
        }
        if (menu.findItem(109) != null && (jSONObject7 = f125434c) != null) {
            jSONObject7.put("button_original_sound", 1);
        }
        if (menu.findItem(99) != null && (jSONObject6 = f125434c) != null) {
            jSONObject6.put("button_uninterested", 1);
        }
        if (menu.findItem(101) != null && (jSONObject5 = f125434c) != null) {
            jSONObject5.put("button_complaint", 1);
        }
        if (menu.findItem(202) != null && (jSONObject4 = f125434c) != null) {
            jSONObject4.put("launch_promotion", 1);
        }
        if (menu.findItem(207) != null && (jSONObject3 = f125434c) != null) {
            jSONObject3.put("copy_id", 1);
        }
        if (menu.findItem(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET) != null && (jSONObject2 = f125434c) != null) {
            jSONObject2.put("close_auto_slide", 1);
        }
        if (menu.findItem(305) != null && (jSONObject = f125434c) != null) {
            jSONObject.put("open_auto_slide", 1);
        }
        org.json.JSONObject jSONObject10 = f125434c;
        if (jSONObject10 != null) {
            jSONObject10.put("button_cancel", 1);
        }
    }

    public final void c(android.content.Context context, java.lang.String eid, long j17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(eid, "eid");
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("from_action", i17);
        jSONObject.put("feedid", pm0.v.u(j17));
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, eid, 1, jSONObject, false, null, 48, null);
    }

    public final void d(com.tencent.mm.ui.MMActivity context, long j17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = f125434c;
        if (jSONObject != null) {
            jSONObject.put("feedid", pm0.v.u(j17));
            jSONObject.put("from_action", i17);
        } else {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", pm0.v.u(j17));
            jSONObject.put("from_action", i17);
        }
        b6Var.c(V6, "channel_feedcard_moreActionPanel", false, jSONObject);
        f125434c = null;
    }

    public final void e(com.tencent.mm.ui.MMActivity context, java.lang.String userName, long j17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_USERNAME, userName);
        jSONObject.put("menu_exp_time", f125433b);
        jSONObject.put("from_action", i17);
        jSONObject.put("feedid", pm0.v.u(j17));
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "icon_recent_forward", 1, jSONObject, false, null, 48, null);
    }
}
