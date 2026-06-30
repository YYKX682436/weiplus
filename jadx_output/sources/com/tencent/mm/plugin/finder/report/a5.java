package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.a5 f124948a = new com.tencent.mm.plugin.finder.report.a5();

    public final void a(android.content.Context context, int i17, java.lang.String activityId, java.lang.String feedId) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(activityId, "activityId");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("activityid", activityId);
            jSONObject.put("feedid", feedId);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "link_activity", i17, jSONObject, false, null, 48, null);
    }

    public final void b(android.content.Context context, int i17, java.lang.String str, java.lang.String poiTag, double d17, java.lang.String str2) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(poiTag, "poiTag");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("poi_name", str);
            jSONObject.put("geo_distance", java.lang.String.valueOf((int) d17));
            jSONObject.put("content", str2 == null ? "" : str2);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, poiTag, i17, jSONObject, false, null, 48, null);
    }
}
