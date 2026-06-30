package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class s5 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "updateClientReport";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        long j17;
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("updateClientReport", "data is null");
            bVar.c("null_data", null);
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("clientReportDict");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.e("updateClientReport", "clientReportDict is null");
            bVar.c("clientReportDict is null", null);
            return;
        }
        java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
            if (optJSONObject2 != null) {
                int optInt = optJSONObject2.optInt("logId", 27792);
                com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(optInt), com.tencent.mm.plugin.game.luggage.jsapi.r5.class);
                boolean z17 = true;
                if (iPCBoolean == null ? true : iPCBoolean.f68400d) {
                    boolean optBoolean = optJSONObject2.optBoolean("reportOnExit", false);
                    java.lang.String optString = optJSONObject2.optString("reportStr", "");
                    java.lang.String optString2 = optJSONObject2.optString("timePlaceHolderKey", "");
                    long optLong = optJSONObject2.optLong("reportDuration", 0L);
                    boolean optBoolean2 = optJSONObject2.optBoolean("isTimeMillSecond", false);
                    boolean optBoolean3 = optJSONObject2.optBoolean("markTimeStart", false);
                    boolean optBoolean4 = optJSONObject2.optBoolean("isReportNow", false);
                    boolean optBoolean5 = optJSONObject2.optBoolean("recordOpenOtherPage", false);
                    if (optString == null || optString.length() == 0) {
                        com.tencent.mars.xlog.Log.e("updateClientReport", "gamelog.jsapi, updateClientReport , reportStr is null");
                    } else {
                        kotlin.jvm.internal.o.d(next);
                        kotlin.jvm.internal.o.d(optString);
                        if (optBoolean3) {
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            j17 = android.os.SystemClock.elapsedRealtime();
                        } else {
                            j17 = 0;
                        }
                        org.json.JSONObject jSONObject2 = optJSONObject;
                        java.util.Iterator<java.lang.String> it = keys;
                        e53.c cVar = new e53.c(next, optInt, optBoolean, optString, optString2, optBoolean3, optBoolean4, optLong, optBoolean2, j17, optBoolean5);
                        java.lang.String str = cVar.f249618d;
                        int i17 = cVar.f249616b;
                        if (optBoolean) {
                            e53.b bVar2 = e53.b.f249612a;
                            int hashCode = bVar.f406596a.hashCode();
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = e53.b.f249613b;
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
                            }
                            concurrentHashMap2.put(cVar.f249615a, cVar);
                            concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), concurrentHashMap2);
                            e53.b.f249614c.alive();
                            com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + i17 + ", recordReportData, reportContent = " + str);
                        } else {
                            e53.b bVar3 = e53.b.f249612a;
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) e53.b.f249613b.get(java.lang.Integer.valueOf(bVar.f406596a.hashCode()));
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new java.util.concurrent.ConcurrentHashMap();
                            }
                            if (concurrentHashMap3.containsKey(next)) {
                                concurrentHashMap3.remove(next);
                                java.lang.String str2 = cVar.f249619e;
                                if (str2 != null && str2.length() != 0) {
                                    z17 = false;
                                }
                                if (!z17) {
                                    str = r26.i0.v(cVar.f249618d, cVar.f249619e, java.lang.String.valueOf(cVar.f249622h), false, 4, null);
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + i17 + ", reportNow, reportDuration:" + cVar.f249622h + ", reportContent = " + str);
                                jx3.f.INSTANCE.f(i17, str, cVar.f249621g, false);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + i17 + ", reportNow fail: recordData is null");
                            }
                        }
                        optJSONObject = jSONObject2;
                        keys = it;
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("updateClientReport", "gamelog.jsapi, updateClientReport , logId = " + optInt + "  not exist in globalConfig FrontEndReport");
                }
            }
        }
        bVar.a();
    }
}
