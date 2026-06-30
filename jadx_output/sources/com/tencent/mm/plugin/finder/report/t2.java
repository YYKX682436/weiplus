package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.t2 f125363a = new com.tencent.mm.plugin.finder.report.t2();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, java.lang.String finderUsername, boolean z17, java.lang.String str, java.lang.String str2, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        boolean z18 = true;
        java.lang.String string = V6.getString(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if ((string == null || string.length() == 0) == false) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            java.lang.String string2 = V6.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(string2).f302841d).intValue();
            int integer = V6.getInteger(8);
            jSONObject.put("enter_scene", intValue);
            jSONObject.put("enter_type", integer);
        }
        jSONObject.put("ref_commentscene", V6.getInteger(7));
        if ((finderUsername.length() > 0) != false) {
            jSONObject.put("finderusername", finderUsername);
        }
        if (j17 != 0) {
            jSONObject.put("ref_feedid", pm0.v.u(j17));
        }
        if ((str == null || str.length() == 0) == false) {
            jSONObject.put("biz_type", str);
        }
        if (str2 != null && str2.length() != 0) {
            z18 = false;
        }
        if (!z18) {
            jSONObject.put("biz_name", str2);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.finder.report.o3.ij((com.tencent.mm.plugin.finder.report.o3) c17, z17 ? 1 : 0, "finder_binding_brand", r26.i0.t(jSONObject2, ",", ";", false), V6, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.content.Context context, java.lang.String finderUsername, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        java.lang.String string = V6.getString(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if ((string == null || string.length() == 0) == false) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            java.lang.String string2 = V6.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(string2).f302841d).intValue();
            int integer = V6.getInteger(8);
            jSONObject.put("enter_scene", intValue);
            jSONObject.put("enter_type", integer);
        }
        jSONObject.put("ref_commentscene", V6.getInteger(7));
        if (finderUsername.length() > 0) {
            jSONObject.put("finderusername", finderUsername);
        }
        if (j17 != 0) {
            jSONObject.put("ref_feedid", pm0.v.u(j17));
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.finder.report.o3.ij((com.tencent.mm.plugin.finder.report.o3) c17, z17 ? 1 : 0, "finder_custom_service", r26.i0.t(jSONObject2, ",", ";", false), V6, null, 16, null);
    }

    public final void c(android.content.Context context, java.lang.String finderUsername, boolean z17, java.lang.String linkWord, boolean z18, long j17, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(linkWord, "linkWord");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String string = V6.getString(1);
        if (string == null) {
            string = "";
        }
        int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(string).f302841d).intValue();
        int integer = V6.getInteger(8);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("link_word", linkWord);
        jSONObject.put("finderusername", finderUsername);
        jSONObject.put("is_brand_label", z18 ? 1 : 0);
        jSONObject.put("feedid", pm0.v.u(j17));
        jSONObject.put("ref_feedid", pm0.v.u(j17));
        jSONObject.put("if_has_gift_tag", z19 ? 1 : 0);
        jSONObject.put("ref_commentscene", V6.getInteger(7));
        jSONObject.put("enter_scene", intValue);
        jSONObject.put("enter_type", integer);
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "profile_shopwindow_link", z17 ? 1 : 0, jSONObject, false, null, 48, null);
    }
}
