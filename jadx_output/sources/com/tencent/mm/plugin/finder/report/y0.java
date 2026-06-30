package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f125443b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f125444c = true;

    /* renamed from: d, reason: collision with root package name */
    public static int f125445d;

    /* renamed from: e, reason: collision with root package name */
    public static int f125446e;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.y0 f125442a = new com.tencent.mm.plugin.finder.report.y0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125447f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125448g = new java.util.concurrent.ConcurrentHashMap();

    public final boolean a() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127655d7).getValue()).r()).intValue() == 0;
    }

    public final com.tencent.mm.plugin.finder.report.v0 b(int i17, int i18) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125448g;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), concurrentHashMap2);
        }
        com.tencent.mm.plugin.finder.report.v0 v0Var = (com.tencent.mm.plugin.finder.report.v0) concurrentHashMap2.get(java.lang.Integer.valueOf(i18));
        if (v0Var != null) {
            return v0Var;
        }
        com.tencent.mm.plugin.finder.report.v0 v0Var2 = new com.tencent.mm.plugin.finder.report.v0();
        concurrentHashMap2.put(java.lang.Integer.valueOf(i18), v0Var2);
        return v0Var2;
    }

    public final com.tencent.mm.plugin.finder.report.w0 c(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125447f;
        com.tencent.mm.plugin.finder.report.w0 w0Var = (com.tencent.mm.plugin.finder.report.w0) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (w0Var != null) {
            return w0Var;
        }
        com.tencent.mm.plugin.finder.report.w0 w0Var2 = new com.tencent.mm.plugin.finder.report.w0();
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), w0Var2);
        return w0Var2;
    }

    public final void d(int i17, boolean z17, boolean z18, int i18) {
        if (!a() && f125443b) {
            if (z17) {
                com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onCgiStart] tabType:" + i17 + " isAuto:" + z18 + " cgiStatus:" + i18);
                h(i17, 11, z18);
                c(i17).f125418f = i18;
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onCgiEnd] tabType:" + i17 + " isAuto:" + z18 + " cgiStatus:" + i18);
            h(i17, 12, z18);
            c(i17).f125418f = i18;
        }
    }

    public final void e(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        if (a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onEnterList] tabType:" + i17 + " curPosition:" + i18);
        f125446e = i17;
        c(i17).f125414b = i18;
        h(i17, 3, false);
        g(context, i17, new jz5.l(3, 0), false);
    }

    public final void f(android.content.Context context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        if (a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onLeaveList] tabType:" + i17 + " curPosition:" + i18);
        f125446e = i17;
        c(i17).f125414b = i18;
        h(i17, 4, false);
        g(context, i17, new jz5.l(4, 3), true);
    }

    public final long g(android.content.Context context, int i17, jz5.l lVar, boolean z17) {
        long j17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.finder.report.w0 c17 = c(i17);
        jSONObject.put("curPosition", c17.f125414b);
        jSONObject.put("itemCount", c17.f125413a);
        jSONObject.put("isExposed", c17.f125416d);
        jSONObject.put("isLoading", c17.f125415c);
        jSONObject.put("isTop", c17.f125417e);
        jSONObject.put("cgiStatus", c17.f125418f);
        com.tencent.mm.plugin.finder.report.v0 b17 = b(i17, ((java.lang.Number) lVar.f302833d).intValue());
        jSONObject.put("actionType", b17.f125390a);
        jSONObject.put("actionTime", b17.f125391b);
        jSONObject.put("isAuto", b17.f125392c);
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        java.lang.Number number = (java.lang.Number) lVar.f302834e;
        int intValue2 = number.intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(intValue);
        sb6.append('-');
        sb6.append(intValue2);
        jSONObject.put("pairType", sb6.toString());
        com.tencent.mm.plugin.finder.report.v0 b18 = b(i17, number.intValue());
        long j18 = b18.f125391b;
        long j19 = 0;
        if (j18 > 0) {
            long j27 = b17.f125391b;
            j17 = j27 > j18 ? j27 - j18 : java.lang.System.currentTimeMillis() - b18.f125391b;
        } else {
            j17 = 0;
        }
        jSONObject.put("pairTime", j17);
        if (z17) {
            com.tencent.mm.plugin.finder.report.v0 b19 = b(i17, 12);
            com.tencent.mm.plugin.finder.report.v0 b27 = b(i17, 11);
            long j28 = b27.f125391b;
            if (j28 > 0) {
                long j29 = b19.f125391b;
                if (j29 <= j28) {
                    j29 = java.lang.System.currentTimeMillis();
                    j28 = b27.f125391b;
                }
                j19 = j29 - j28;
            }
            jSONObject.put("cgiTime", j19);
        }
        jSONObject.put("tabType", i17);
        jSONObject.put("enterTabType", f125445d);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            long j37 = b17.f125391b;
            com.tencent.mars.xlog.Log.i("Finder.ActionReporter", "[report23788] sessionId:" + V6.getString(0) + ", contextId:" + V6.getString(1) + ", clickTabContextId:" + V6.getString(2) + ", commentScene:" + V6.getInteger(5) + ", changeVersion:2 reportType:1, timeStamp:" + j37 + ", actionData:" + jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23788, V6.getString(0), V6.getString(1), V6.getString(2), java.lang.Integer.valueOf(V6.getInteger(5)), 2, 1, java.lang.Integer.valueOf((int) (j37 / 1000)), jSONObject2 != null ? r26.i0.t(jSONObject2, ",", ";", false) : "");
        }
        return j17;
    }

    public final void h(int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.finder.report.v0 b17 = b(i17, i18);
        b17.f125391b = java.lang.System.currentTimeMillis();
        b17.f125390a = i18;
        b17.f125392c = z17;
    }
}
