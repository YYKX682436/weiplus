package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.b6 f124969a = new com.tencent.mm.plugin.finder.report.b6();

    public static void d(com.tencent.mm.plugin.finder.report.b6 b6Var, r45.qt2 qt2Var, java.lang.String eid, int i17, org.json.JSONObject jSONObject, boolean z17, java.lang.String str, int i18, java.lang.Object obj) {
        java.lang.String Ri;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String jSONObject2;
        org.json.JSONObject jSONObject3 = (i18 & 8) != 0 ? null : jSONObject;
        boolean z18 = (i18 & 16) != 0 ? false : z17;
        java.lang.String sessionBuffer = (i18 & 32) != 0 ? "" : str;
        b6Var.getClass();
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(sessionBuffer, "sessionBuffer");
        b6Var.a(qt2Var, jSONObject3);
        java.lang.String t17 = (jSONObject3 == null || (jSONObject2 = jSONObject3.toString()) == null) ? "" : r26.i0.t(jSONObject2, ",", ";", false);
        if ((qt2Var == null || (Ri = qt2Var.getString(0)) == null) && (Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri()) == null) {
            Ri = "";
        }
        if (qt2Var == null || (str2 = qt2Var.getString(1)) == null) {
            str2 = "";
        }
        int integer = qt2Var != null ? qt2Var.getInteger(5) : 0;
        if (qt2Var == null || (str3 = qt2Var.getString(2)) == null) {
            str3 = "";
        }
        int integer2 = qt2Var != null ? qt2Var.getInteger(7) : 0;
        java.lang.String str4 = (qt2Var == null || (string = qt2Var.getString(16)) == null) ? "" : string;
        com.tencent.mars.xlog.Log.i("report21875", "report 21875 sessionId:" + Ri + ", contextId:" + str2 + ", commentScene:" + integer + ", eventCode:" + i17 + ", eid:" + eid + ", udf_kv:" + t17 + ", clickTabContextId:" + str3 + " jumpId=" + str4);
        if (z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.E(21875, Ri, str2, java.lang.Integer.valueOf(integer), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), eid, t17, str3, java.lang.Integer.valueOf(integer2), str4, sessionBuffer);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, Ri, str2, java.lang.Integer.valueOf(integer), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), eid, t17, str3, java.lang.Integer.valueOf(integer2), str4, sessionBuffer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (r5 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.qt2 r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            java.lang.String r0 = "enter_page_type"
            if (r5 == 0) goto Lc
            r1 = 11
            java.lang.String r5 = r5.getString(r1)     // Catch: java.lang.Exception -> L3c
            if (r5 != 0) goto Le
        Lc:
            java.lang.String r5 = ""
        Le:
            int r1 = r5.length()     // Catch: java.lang.Exception -> L3c
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L21
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r1.<init>(r5)     // Catch: java.lang.Exception -> L3c
            goto L26
        L21:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r1.<init>()     // Catch: java.lang.Exception -> L3c
        L26:
            java.lang.String r5 = r1.optString(r0)     // Catch: java.lang.Exception -> L3c
            kotlin.jvm.internal.o.d(r5)     // Catch: java.lang.Exception -> L3c
            int r1 = r5.length()     // Catch: java.lang.Exception -> L3c
            if (r1 <= 0) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            if (r2 == 0) goto L3c
            if (r6 == 0) goto L3c
            r6.put(r0, r5)     // Catch: java.lang.Exception -> L3c
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.b6.a(r45.qt2, org.json.JSONObject):void");
    }

    public final void b(r45.qt2 qt2Var, java.lang.String action, boolean z17, long j17, org.json.JSONObject jSONObject, java.lang.String sessionBuffer) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(sessionBuffer, "sessionBuffer");
        if (qt2Var != null) {
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            jSONObject.put("feedid", b52.b.q(j17));
            f124969a.a(qt2Var, jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            com.tencent.mars.xlog.Log.i("report21875", "report 21875 sessionId:" + qt2Var.getString(0) + ", contextId:" + qt2Var.getString(1) + ", commentScene:" + qt2Var.getInteger(5) + ", expose:" + z17 + ", eid:" + action + ", udf_kv:" + t17 + ", clickTabContextId:" + qt2Var.getString(2) + ", sessionBuffer:" + sessionBuffer);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, qt2Var.getString(0), qt2Var.getString(1), java.lang.Integer.valueOf(qt2Var.getInteger(5)), java.lang.Integer.valueOf(!z17 ? 1 : 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), action, t17, qt2Var.getString(2), java.lang.Integer.valueOf(qt2Var.getInteger(7)), qt2Var.getString(16), sessionBuffer);
        }
    }

    public final void c(r45.qt2 qt2Var, java.lang.String action, boolean z17, org.json.JSONObject udfKv) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        if (qt2Var != null) {
            f124969a.a(qt2Var, udfKv);
            java.lang.String jSONObject = udfKv.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            com.tencent.mars.xlog.Log.i("report21875", "report 21875 sessionId:" + qt2Var.getString(0) + ", contextId:" + qt2Var.getString(1) + ", commentScene:" + qt2Var.getInteger(5) + ", isClick:" + z17 + ", eid:" + action + ", udf_kv:" + t17 + ", clickTabContextId:" + qt2Var.getString(2) + " jumpId:" + qt2Var.getString(16));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, qt2Var.getString(0), qt2Var.getString(1), java.lang.Integer.valueOf(qt2Var.getInteger(5)), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), action, t17, qt2Var.getString(2), java.lang.Integer.valueOf(qt2Var.getInteger(7)), qt2Var.getString(16));
        }
    }
}
