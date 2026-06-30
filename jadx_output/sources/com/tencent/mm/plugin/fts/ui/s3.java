package com.tencent.mm.plugin.fts.ui;

@j95.b
/* loaded from: classes12.dex */
public class s3 extends i95.w implements androidx.lifecycle.m1, o13.a0 {
    public void Ai(u13.g gVar) {
        int i17 = gVar.f423758a;
        if (i17 != 4) {
            if (i17 == 9) {
                com.tencent.mm.autogen.events.SearchClickBizItemEvent searchClickBizItemEvent = new com.tencent.mm.autogen.events.SearchClickBizItemEvent();
                r45.b40 b40Var = new r45.b40();
                b40Var.f370508e = gVar.f();
                b40Var.f370507d = 19;
                b40Var.f370509f = gVar.f423766i;
                searchClickBizItemEvent.f54744g.f6866a = b40Var;
                searchClickBizItemEvent.e();
                return;
            }
            if (i17 == 17) {
                com.tencent.mm.autogen.events.SearchClickBizItemEvent searchClickBizItemEvent2 = new com.tencent.mm.autogen.events.SearchClickBizItemEvent();
                r45.b40 b40Var2 = new r45.b40();
                b40Var2.f370508e = gVar.f();
                b40Var2.f370507d = 31;
                b40Var2.f370509f = gVar.f423766i;
                searchClickBizItemEvent2.f54744g.f6866a = b40Var2;
                searchClickBizItemEvent2.e();
                return;
            }
            return;
        }
        int i18 = gVar.f423769l;
        if (i18 == 2097171) {
            com.tencent.mm.autogen.events.SearchClickBizItemEvent searchClickBizItemEvent3 = new com.tencent.mm.autogen.events.SearchClickBizItemEvent();
            r45.b40 b40Var3 = new r45.b40();
            b40Var3.f370508e = gVar.f();
            b40Var3.f370507d = 34;
            b40Var3.f370509f = gVar.f423766i;
            searchClickBizItemEvent3.f54744g.f6866a = b40Var3;
            searchClickBizItemEvent3.e();
            return;
        }
        if (i18 == 2097173) {
            com.tencent.mm.autogen.events.SearchClickBizItemEvent searchClickBizItemEvent4 = new com.tencent.mm.autogen.events.SearchClickBizItemEvent();
            r45.b40 b40Var4 = new r45.b40();
            b40Var4.f370508e = gVar.f();
            b40Var4.f370507d = 38;
            b40Var4.f370509f = gVar.f423766i;
            searchClickBizItemEvent4.f54744g.f6866a = b40Var4;
            searchClickBizItemEvent4.e();
            return;
        }
        com.tencent.mm.autogen.events.SearchClickBizItemEvent searchClickBizItemEvent5 = new com.tencent.mm.autogen.events.SearchClickBizItemEvent();
        r45.b40 b40Var5 = new r45.b40();
        b40Var5.f370508e = gVar.f();
        b40Var5.f370507d = 5;
        b40Var5.f370509f = gVar.f423766i;
        searchClickBizItemEvent5.f54744g.f6866a = b40Var5;
        searchClickBizItemEvent5.e();
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return ((s50.o0) i95.n0.c(s50.o0.class)).f403099d.f353930f;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(16);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(32);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(48);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(64);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(112);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(4112);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(4128);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(4176);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(8192);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(160);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).uj(256);
    }

    public void wi(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i17, final org.json.JSONObject jSONObject) {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.s3$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str4;
                java.lang.String jSONObject2;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str5 = str2;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str6 = str3;
                java.lang.String str7 = str6 != null ? str6 : "";
                java.lang.String username = str;
                kotlin.jvm.internal.o.g(username, "username");
                org.json.JSONObject extParmas = jSONObject;
                kotlin.jvm.internal.o.g(extParmas, "extParmas");
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jz5.g gVar = aw4.l.f14895d;
                    java.lang.String u17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) aw4.l.f14895d).getValue()).u("FTSBizClickFlow", "{}");
                    if (u17 != null) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject(u17);
                        java.util.Iterator<java.lang.String> keys = jSONObject4.keys();
                        kotlin.jvm.internal.o.f(keys, "keys(...)");
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            jSONObject3.put(next, jSONObject4.opt(next));
                        }
                    }
                    org.json.JSONArray optJSONArray = extParmas.optJSONArray("checkboxes");
                    org.json.JSONArray optJSONArray2 = extParmas.optJSONArray("extReqParams");
                    org.json.JSONObject optJSONObject = jSONObject3.optJSONObject(username);
                    int i18 = i17;
                    try {
                        if (optJSONObject != null) {
                            optJSONObject.put(dm.i4.COL_USERNAME, username).put("nickname", str5).put("headUrl", str7).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, c01.id.e()).put("type", i18);
                            if (optJSONArray != null) {
                                optJSONObject.put("checkboxes", optJSONArray);
                            }
                            if (optJSONArray2 != null) {
                                optJSONObject.put("extReqParams", optJSONArray2);
                            }
                        } else {
                            org.json.JSONObject put = new org.json.JSONObject().put(dm.i4.COL_USERNAME, username).put("nickname", str5).put("headUrl", str7).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, c01.id.e()).put("type", i18);
                            if (optJSONArray != null) {
                                put.put("checkboxes", optJSONArray);
                            }
                            if (optJSONArray2 != null) {
                                put.put("extReqParams", optJSONArray2);
                            }
                            jSONObject3.put(username, put);
                        }
                        jSONObject2 = jSONObject3.toString();
                        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                        jz5.g gVar2 = aw4.l.f14895d;
                        str4 = "MicroMsg.FTS.FTSBizClickFlow";
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str4 = "MicroMsg.FTS.FTSBizClickFlow";
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str4 = "MicroMsg.FTS.FTSBizClickFlow";
                }
                try {
                    com.tencent.mars.xlog.Log.i(str4, "encode: " + ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) aw4.l.f14895d).getValue()).D("FTSBizClickFlow", jSONObject2) + ", clickInfo: " + jSONObject2);
                } catch (java.lang.Exception e19) {
                    e = e19;
                    com.tencent.mars.xlog.Log.printErrStackTrace(str4, e, "addClickFlow", new java.lang.Object[0]);
                }
            }
        }, "FTSBizClickFlow");
    }
}
