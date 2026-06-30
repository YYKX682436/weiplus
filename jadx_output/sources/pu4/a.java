package pu4;

@j95.b
/* loaded from: classes12.dex */
public final class a extends i95.w implements qu4.e {

    /* renamed from: d, reason: collision with root package name */
    public ru4.f f358432d;

    /* renamed from: e, reason: collision with root package name */
    public ru4.d f358433e;

    /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:11:0x0011, B:15:0x002a, B:16:0x002d, B:20:0x0038, B:24:0x0043, B:25:0x004c, B:27:0x0051, B:34:0x0074, B:38:0x008b, B:40:0x0091, B:45:0x009d, B:46:0x00a9, B:48:0x00af, B:51:0x00b8, B:55:0x006f, B:56:0x00c4), top: B:10:0x0011, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:11:0x0011, B:15:0x002a, B:16:0x002d, B:20:0x0038, B:24:0x0043, B:25:0x004c, B:27:0x0051, B:34:0x0074, B:38:0x008b, B:40:0x0091, B:45:0x009d, B:46:0x00a9, B:48:0x00af, B:51:0x00b8, B:55:0x006f, B:56:0x00c4), top: B:10:0x0011, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ai(java.lang.String r18, java.lang.String r19, java.lang.String r20, long r21, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu4.a.Ai(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String):void");
    }

    public boolean Bi(java.lang.String searchId, java.lang.String chatId, java.lang.String query, long j17, java.lang.String boxJSON, java.lang.String boxFTS, java.lang.String extInfo) {
        long currentTimeMillis;
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(chatId, "chatId");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(boxJSON, "boxJSON");
        kotlin.jvm.internal.o.g(boxFTS, "boxFTS");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        ru4.f fVar = this.f358432d;
        boolean z17 = false;
        if (fVar != null) {
            if (!(searchId.length() == 0)) {
                if (j17 > 0) {
                    currentTimeMillis = j17;
                } else {
                    try {
                        currentTimeMillis = java.lang.System.currentTimeMillis();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("AIHistory.MessageStorage", "insertOrReplaceMessage failed: " + e17.getMessage());
                    }
                }
                ru4.e eVar = new ru4.e();
                eVar.field_searchId = searchId;
                eVar.field_chatId = chatId;
                eVar.field_query = query;
                eVar.field_timeStamp = currentTimeMillis;
                eVar.field_boxJSON = boxJSON;
                eVar.field_boxFTS = boxFTS;
                eVar.field_extInfo = extInfo;
                fVar.replace(eVar, false);
                z17 = true;
            }
        }
        boolean z18 = z17;
        if (z18) {
            Ai(searchId, chatId, query, j17, boxFTS);
        }
        return z18;
    }

    public final org.json.JSONObject Di(ru4.e eVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("searchId", eVar.field_searchId);
        jSONObject.put("chatId", eVar.field_chatId);
        jSONObject.put("timeStamp", eVar.field_timeStamp);
        jSONObject.put("query", eVar.field_query);
        jSONObject.put("boxJSON", eVar.field_boxJSON);
        jSONObject.put("boxFTS", eVar.field_boxFTS);
        jSONObject.put("extInfo", eVar.field_extInfo);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x016d A[Catch: Exception -> 0x01af, TryCatch #2 {Exception -> 0x01af, blocks: (B:3:0x000d, B:5:0x0011, B:8:0x0017, B:14:0x0024, B:16:0x0031, B:22:0x003e, B:25:0x0049, B:57:0x00ad, B:59:0x00b6, B:60:0x00ba, B:62:0x00c0, B:83:0x00f0, B:114:0x014c, B:115:0x015a, B:116:0x0167, B:118:0x016d, B:121:0x018a, B:128:0x0197, B:140:0x0155, B:141:0x0158, B:79:0x00ea, B:157:0x01a5, B:158:0x01a8, B:161:0x01a9, B:85:0x010b, B:87:0x0111, B:89:0x0117, B:92:0x0121, B:94:0x0127, B:96:0x012f, B:102:0x013b, B:105:0x0141, B:27:0x0060, B:30:0x006b, B:32:0x0071, B:35:0x007b, B:37:0x0081, B:39:0x0089, B:45:0x0095, B:47:0x009d, B:153:0x01a2, B:136:0x0152), top: B:2:0x000d, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[Catch: Exception -> 0x01af, TryCatch #2 {Exception -> 0x01af, blocks: (B:3:0x000d, B:5:0x0011, B:8:0x0017, B:14:0x0024, B:16:0x0031, B:22:0x003e, B:25:0x0049, B:57:0x00ad, B:59:0x00b6, B:60:0x00ba, B:62:0x00c0, B:83:0x00f0, B:114:0x014c, B:115:0x015a, B:116:0x0167, B:118:0x016d, B:121:0x018a, B:128:0x0197, B:140:0x0155, B:141:0x0158, B:79:0x00ea, B:157:0x01a5, B:158:0x01a8, B:161:0x01a9, B:85:0x010b, B:87:0x0111, B:89:0x0117, B:92:0x0121, B:94:0x0127, B:96:0x012f, B:102:0x013b, B:105:0x0141, B:27:0x0060, B:30:0x006b, B:32:0x0071, B:35:0x007b, B:37:0x0081, B:39:0x0089, B:45:0x0095, B:47:0x009d, B:153:0x01a2, B:136:0x0152), top: B:2:0x000d, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea A[Catch: Exception -> 0x01af, LOOP:1: B:60:0x00ba->B:79:0x00ea, LOOP_END, TryCatch #2 {Exception -> 0x01af, blocks: (B:3:0x000d, B:5:0x0011, B:8:0x0017, B:14:0x0024, B:16:0x0031, B:22:0x003e, B:25:0x0049, B:57:0x00ad, B:59:0x00b6, B:60:0x00ba, B:62:0x00c0, B:83:0x00f0, B:114:0x014c, B:115:0x015a, B:116:0x0167, B:118:0x016d, B:121:0x018a, B:128:0x0197, B:140:0x0155, B:141:0x0158, B:79:0x00ea, B:157:0x01a5, B:158:0x01a8, B:161:0x01a9, B:85:0x010b, B:87:0x0111, B:89:0x0117, B:92:0x0121, B:94:0x0127, B:96:0x012f, B:102:0x013b, B:105:0x0141, B:27:0x0060, B:30:0x006b, B:32:0x0071, B:35:0x007b, B:37:0x0081, B:39:0x0089, B:45:0x0095, B:47:0x009d, B:153:0x01a2, B:136:0x0152), top: B:2:0x000d, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Ni(java.lang.String r21, int r22) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu4.a.Ni(java.lang.String, int):java.lang.String");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        ru4.f fVar;
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        try {
            l75.k0 k0Var = gm0.j1.u().f273153f;
            kotlin.jvm.internal.o.d(k0Var);
            this.f358432d = new ru4.f(k0Var);
            com.tencent.mars.xlog.Log.i("AIHistory.Service", "AIHistoryService storage initialized");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AIHistory.Service", "initStorage failed: " + e17.getMessage());
        }
        o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
        if (zVar == null) {
            com.tencent.mars.xlog.Log.e("AIHistory.Service", "IPluginFTS service not available");
            return;
        }
        try {
            ru4.d dVar = new ru4.d();
            ((com.tencent.mm.plugin.fts.d0) zVar).pj(dVar);
            dVar.create();
            this.f358433e = dVar;
            com.tencent.mars.xlog.Log.i("AIHistory.Service", "AIHistory FTS5 storage registered");
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("AIHistory.Service", "initFTSStorage failed: " + e18.getMessage());
        }
        try {
            pu4.i iVar = new pu4.i();
            ((com.tencent.mm.plugin.fts.d0) zVar).qj(17, iVar);
            iVar.f();
            com.tencent.mars.xlog.Log.i("AIHistory.Service", "AIHistory NativeLogic registered");
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("AIHistory.Service", "initFTSNativeLogic failed: " + e19.getMessage());
        }
        ru4.d dVar2 = this.f358433e;
        if (dVar2 == null || !dVar2.f342196d || (fVar = this.f358432d) == null) {
            return;
        }
        try {
            java.util.List<ru4.e> D0 = fVar.D0("", "", Integer.MAX_VALUE);
            if (D0.isEmpty()) {
                com.tencent.mars.xlog.Log.i("AIHistory.Service", "rebuildFTSIndex: no messages, skip");
                return;
            }
            long s17 = dVar2.s(o13.d.f342222h);
            if (s17 >= D0.size()) {
                com.tencent.mars.xlog.Log.i("AIHistory.Service", "rebuildFTSIndex: index up to date, indexedCount=" + s17 + " msgCount=" + D0.size());
                return;
            }
            com.tencent.mars.xlog.Log.i("AIHistory.Service", "rebuildFTSIndex: indexedCount=" + s17 + " < msgCount=" + D0.size() + ", rebuilding...");
            int i17 = 0;
            for (ru4.e eVar : D0) {
                java.lang.String str = eVar.field_searchId;
                kotlin.jvm.internal.o.d(str);
                if (!(str.length() == 0)) {
                    java.lang.String field_chatId = eVar.field_chatId;
                    kotlin.jvm.internal.o.f(field_chatId, "field_chatId");
                    java.lang.String field_query = eVar.field_query;
                    kotlin.jvm.internal.o.f(field_query, "field_query");
                    long j17 = eVar.field_timeStamp;
                    java.lang.String field_boxFTS = eVar.field_boxFTS;
                    kotlin.jvm.internal.o.f(field_boxFTS, "field_boxFTS");
                    Ai(str, field_chatId, field_query, j17, field_boxFTS);
                    i17++;
                }
            }
            com.tencent.mars.xlog.Log.i("AIHistory.Service", "rebuildFTSIndex: rebuilt=" + i17);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("AIHistory.Service", "rebuildFTSIndex failed: " + e27.getMessage());
        }
    }

    public final void wi(java.lang.String str) {
        ru4.d dVar = this.f358433e;
        if (dVar != null && dVar.f342196d) {
            try {
                dVar.m0(o13.d.f342222h, str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AIHistory.Service", "deleteFTSIndex failed: " + e17.getMessage());
            }
        }
    }
}
