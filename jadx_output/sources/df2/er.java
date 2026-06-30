package df2;

/* loaded from: classes3.dex */
public final class er implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.gr f230080a;

    public er(df2.gr grVar) {
        this.f230080a = grVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.String str2;
        df2.gr grVar = this.f230080a;
        grVar.getClass();
        java.lang.String str3 = grVar.f230240m;
        com.tencent.mars.xlog.Log.i(str3, "handleLiteAppAction:" + str + ", data:" + obj);
        try {
            try {
                if (kotlin.jvm.internal.o.b(str, "foldStatusChange")) {
                    org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                    if (jSONObject != null) {
                        int i18 = jSONObject.getBoolean("foldStatus") ? 1 : 2;
                        if (!grVar.f230244q) {
                            grVar.f230244q = true;
                            if (zl2.r4.f473950a.w1()) {
                                i95.m c17 = i95.n0.c(ml2.j0.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                zy2.zb zbVar = (zy2.zb) c17;
                                ml2.z4 z4Var = ml2.z4.f328366o;
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("type", 30);
                                r45.y23 y23Var = grVar.f230242o;
                                jSONObject2.put("productid", pm0.v.u(y23Var != null ? y23Var.getLong(0) : 0L));
                                jSONObject2.put("banner_status", i18);
                                r45.y23 y23Var2 = grVar.f230242o;
                                jSONObject2.put("param_assistant_type", y23Var2 != null ? y23Var2.getInteger(58) : 0);
                                java.lang.String jSONObject3 = jSONObject2.toString();
                                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                                zy2.zb.y6(zbVar, z4Var, r26.i0.t(jSONObject3, ",", ";", false), null, 4, null);
                            } else {
                                i95.m c18 = i95.n0.c(ml2.r0.class);
                                kotlin.jvm.internal.o.f(c18, "getService(...)");
                                ml2.r0 r0Var = (ml2.r0) c18;
                                ml2.b4 b4Var = ml2.b4.f327264s;
                                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                jSONObject4.put("commerceAction", com.tencent.mm.plugin.appbrand.jsapi.za.CTRL_INDEX);
                                r45.y23 y23Var3 = grVar.f230242o;
                                jSONObject4.put("productid", pm0.v.u(y23Var3 != null ? y23Var3.getLong(0) : 0L));
                                jSONObject4.put("banner_status", i18);
                                jSONObject4.put("is_assistant", ((mm2.c1) grVar.business(mm2.c1.class)).T ? 1 : 0);
                                r45.y23 y23Var4 = grVar.f230242o;
                                jSONObject4.put("is_chart", y23Var4 != null && y23Var4.getInteger(58) == 1 ? 1 : 0);
                                r45.y23 y23Var5 = grVar.f230242o;
                                jSONObject4.put("param_assistant_type", y23Var5 != null ? y23Var5.getInteger(58) : 0);
                                java.lang.String jSONObject5 = jSONObject4.toString();
                                kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
                                ml2.r0.hj(r0Var, b4Var, r26.i0.t(jSONObject5, ",", ";", false), 0L, null, null, null, null, null, 252, null);
                            }
                        } else if (zl2.r4.f473950a.w1()) {
                            i95.m c19 = i95.n0.c(ml2.j0.class);
                            kotlin.jvm.internal.o.f(c19, "getService(...)");
                            zy2.zb zbVar2 = (zy2.zb) c19;
                            ml2.z4 z4Var2 = ml2.z4.f328366o;
                            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                            jSONObject6.put("type", 31);
                            r45.y23 y23Var6 = grVar.f230242o;
                            jSONObject6.put("productid", pm0.v.u(y23Var6 != null ? y23Var6.getLong(0) : 0L));
                            jSONObject6.put("banner_status", i18);
                            r45.y23 y23Var7 = grVar.f230242o;
                            jSONObject6.put("param_assistant_type", y23Var7 != null ? y23Var7.getInteger(58) : 0);
                            java.lang.String jSONObject7 = jSONObject6.toString();
                            kotlin.jvm.internal.o.f(jSONObject7, "toString(...)");
                            zy2.zb.y6(zbVar2, z4Var2, r26.i0.t(jSONObject7, ",", ";", false), null, 4, null);
                        } else {
                            i95.m c27 = i95.n0.c(ml2.r0.class);
                            kotlin.jvm.internal.o.f(c27, "getService(...)");
                            ml2.r0 r0Var2 = (ml2.r0) c27;
                            ml2.b4 b4Var2 = ml2.b4.f327264s;
                            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                            jSONObject8.put("commerceAction", 1051);
                            r45.y23 y23Var8 = grVar.f230242o;
                            jSONObject8.put("productid", pm0.v.u(y23Var8 != null ? y23Var8.getLong(0) : 0L));
                            jSONObject8.put("banner_status", i18);
                            jSONObject8.put("is_assistant", ((mm2.c1) grVar.business(mm2.c1.class)).T ? 1 : 0);
                            r45.y23 y23Var9 = grVar.f230242o;
                            jSONObject8.put("is_chart", y23Var9 != null && y23Var9.getInteger(58) == 1 ? 1 : 0);
                            r45.y23 y23Var10 = grVar.f230242o;
                            jSONObject8.put("param_assistant_type", y23Var10 != null ? y23Var10.getInteger(58) : 0);
                            java.lang.String jSONObject9 = jSONObject8.toString();
                            kotlin.jvm.internal.o.f(jSONObject9, "toString(...)");
                            ml2.r0.hj(r0Var2, b4Var2, r26.i0.t(jSONObject9, ",", ";", false), 0L, null, null, null, null, null, 252, null);
                        }
                    }
                } else if (kotlin.jvm.internal.o.b(str, "openProductDetail")) {
                    org.json.JSONObject jSONObject10 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                    java.lang.String string = jSONObject10 != null ? jSONObject10.getString("productId") : null;
                    if (string != null) {
                        long Z = pm0.v.Z(string);
                        org.json.JSONObject jSONObject11 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                        java.lang.String string2 = jSONObject11 != null ? jSONObject11.getString("requestId") : null;
                        if (string2 != null) {
                            if (zl2.r4.f473950a.w1()) {
                                i95.m c28 = i95.n0.c(ml2.j0.class);
                                kotlin.jvm.internal.o.f(c28, "getService(...)");
                                zy2.zb zbVar3 = (zy2.zb) c28;
                                ml2.z4 z4Var3 = ml2.z4.f328366o;
                                org.json.JSONObject jSONObject12 = new org.json.JSONObject();
                                jSONObject12.put("type", 32);
                                r45.y23 y23Var11 = grVar.f230242o;
                                jSONObject12.put("productid", pm0.v.u(y23Var11 != null ? y23Var11.getLong(0) : 0L));
                                r45.y23 y23Var12 = grVar.f230242o;
                                jSONObject12.put("param_assistant_type", y23Var12 != null ? y23Var12.getInteger(58) : 0);
                                java.lang.String jSONObject13 = jSONObject12.toString();
                                kotlin.jvm.internal.o.f(jSONObject13, "toString(...)");
                                zy2.zb.y6(zbVar3, z4Var3, r26.i0.t(jSONObject13, ",", ";", false), null, 4, null);
                            } else {
                                i95.m c29 = i95.n0.c(ml2.r0.class);
                                kotlin.jvm.internal.o.f(c29, "getService(...)");
                                ml2.r0 r0Var3 = (ml2.r0) c29;
                                ml2.b4 b4Var3 = ml2.b4.f327264s;
                                org.json.JSONObject jSONObject14 = new org.json.JSONObject();
                                jSONObject14.put("commerceAction", 1052);
                                r45.y23 y23Var13 = grVar.f230242o;
                                jSONObject14.put("productid", pm0.v.u(y23Var13 != null ? y23Var13.getLong(0) : 0L));
                                jSONObject14.put("is_assistant", ((mm2.c1) grVar.business(mm2.c1.class)).T ? 1 : 0);
                                r45.y23 y23Var14 = grVar.f230242o;
                                jSONObject14.put("is_chart", y23Var14 != null && y23Var14.getInteger(58) == 1 ? 1 : 0);
                                r45.y23 y23Var15 = grVar.f230242o;
                                jSONObject14.put("param_assistant_type", y23Var15 != null ? y23Var15.getInteger(58) : 0);
                                java.lang.String jSONObject15 = jSONObject14.toString();
                                kotlin.jvm.internal.o.f(jSONObject15, "toString(...)");
                                ml2.r0.hj(r0Var3, b4Var3, r26.i0.t(jSONObject15, ",", ";", false), 0L, null, null, null, null, null, 252, null);
                            }
                            str2 = str3;
                            try {
                                com.tencent.mars.xlog.Log.i(str2, "productId:" + Z + ", requestId:" + string2);
                                com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = (com.tencent.mm.plugin.finder.live.plugin.ea0) grVar.R6(com.tencent.mm.plugin.finder.live.plugin.ea0.class);
                                if (ea0Var != null) {
                                    ea0Var.B1(false, true);
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                com.tencent.mars.xlog.Log.printErrStackTrace(str2, th, "", new java.lang.Object[0]);
                                return false;
                            }
                        }
                    }
                }
                return false;
            } catch (java.lang.Throwable th7) {
                th = th7;
                str2 = str3;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str2 = str3;
        }
    }
}
