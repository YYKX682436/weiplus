package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f6 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m6 f118317a;

    public f6(com.tencent.mm.plugin.finder.live.widget.m6 m6Var) {
        this.f118317a = m6Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            if (this.f118317a.f119043h != 1) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("element", 15);
                jSONObject.put("sub_element", 1);
                jSONObject.put("sub_type", 1);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                return;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 11);
            jSONObject2.put("sub_element", 1);
            jSONObject2.put("sub_type", 1);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c18, 37L, jSONObject2.toString(), null, 4, null);
        }
    }
}
