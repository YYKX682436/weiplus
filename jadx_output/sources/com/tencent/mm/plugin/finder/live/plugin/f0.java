package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f112476d;

    public f0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var) {
        this.f112476d = q0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.f0 f0Var = this;
        mm2.f fVar = (mm2.f) obj;
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = f0Var.f112476d;
        java.lang.String adVideoId = ((mm2.w) q0Var.P0(mm2.w.class)).f329502n;
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "liveAdId:" + adVideoId + " onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : com.tencent.mm.plugin.finder.live.plugin.e0.f112356a[fVar.ordinal()];
        ml2.u uVar = q0Var.f113943s;
        if (i17 == 1) {
            uVar.a(adVideoId);
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                if (i17 != 4) {
                    return;
                }
                uVar.a(adVideoId);
                return;
            } else {
                uVar.getClass();
                kotlin.jvm.internal.o.g(adVideoId, "adVideoId");
                if (android.text.TextUtils.isEmpty(adVideoId)) {
                    com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoEnter return for adVideoId:".concat(adVideoId));
                    return;
                } else {
                    uVar.f328027a = c01.id.c();
                    return;
                }
            }
        }
        uVar.getClass();
        kotlin.jvm.internal.o.g(adVideoId, "adVideoId");
        if (android.text.TextUtils.isEmpty(adVideoId)) {
            com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoExit return for adVideoId:".concat(adVideoId));
        } else if (uVar.f328027a == 0) {
            com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoExit return for startupVideoEnter:" + uVar.f328027a);
        } else {
            if (android.text.TextUtils.isEmpty(adVideoId)) {
                com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoEnterInternal return for adVideoId:".concat(adVideoId));
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put("advertise_id", adVideoId);
                jSONObject.put("advertise_type", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoEnterInternal json: " + jSONObject);
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.hj((ml2.r0) c17, ml2.b4.D1, t17, 0L, null, null, null, null, null, 252, null);
            }
            long c18 = c01.id.c() - uVar.f328027a;
            uVar.f328027a = 0L;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", 2);
            jSONObject3.put("advertise_id", adVideoId);
            jSONObject3.put("advertise_type", 1);
            jSONObject3.put("watch_duration", c18);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            java.lang.String t18 = r26.i0.t(jSONObject4, ",", ";", false);
            com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoExit json: " + jSONObject3);
            i95.m c19 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ml2.r0.hj((ml2.r0) c19, ml2.b4.D1, t18, 0L, null, null, null, null, null, 252, null);
            f0Var = this;
        }
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var2 = f0Var.f112476d;
        com.tencent.mm.plugin.finder.live.util.y.m(q0Var2, null, null, new com.tencent.mm.plugin.finder.live.plugin.d0(q0Var2, null), 3, null);
    }
}
