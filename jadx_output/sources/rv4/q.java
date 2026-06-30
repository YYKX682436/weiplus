package rv4;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final rv4.q f400544a = new rv4.q();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f400545b = null;

    /* renamed from: c, reason: collision with root package name */
    public static long f400546c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f400547d = false;

    /* renamed from: e, reason: collision with root package name */
    public static int f400548e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f400549f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f400550g = "";

    public final void a() {
        f400545b = null;
        f400546c = 0L;
        f400550g = "";
        f400547d = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "[ftshotsearch] data reference and request state cleared, isRequesting set to false");
    }

    public final void b(org.json.JSONObject jSONObject, android.content.Context context, java.lang.String str, boolean z17) {
        org.json.JSONObject optJSONObject;
        boolean z18;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "";
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                return;
            }
            int optInt = optJSONObject.optInt("client_expire_time", 600);
            java.lang.String optString = optJSONObject.optString("ctx", "");
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("guessInfo");
            if (optJSONObject2 == null) {
                return;
            }
            int optInt2 = optJSONObject2.optInt("showCount", 4);
            org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("refresh");
            if (optJSONObject3 == null) {
                return;
            }
            boolean optBoolean = optJSONObject3.optBoolean("canShow", false);
            java.lang.String optString2 = optJSONObject3.optString("docInfo", "");
            java.lang.String optString3 = optJSONObject3.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
            org.json.JSONObject optJSONObject4 = optJSONObject2.optJSONObject("config");
            if (optJSONObject4 != null) {
                str2 = optString3;
                z18 = optBoolean;
                str3 = optJSONObject4.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getResources().getString(com.tencent.mm.R.string.o4i));
            } else {
                z18 = optBoolean;
                str2 = optString3;
                str3 = null;
            }
            if (str3 == null) {
                str3 = context.getResources().getString(com.tencent.mm.R.string.o4i);
                kotlin.jvm.internal.o.f(str3, "getString(...)");
            }
            java.lang.String optString4 = jSONObject.optString("searchID", "");
            if (z17) {
                str5 = f400550g;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "extractAndSaveConfigInfo: refreshCacheKey=true, using currentSessionId: " + str5);
            } else {
                java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:hotsearch:config", "");
                com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getHotSearchConfig: " + u17);
                kotlin.jvm.internal.o.d(u17);
                org.json.JSONObject f17 = pv4.a.f(u17);
                java.lang.String optString5 = f17 != null ? f17.optString("cache_key", "") : null;
                if (optString5 != null) {
                    str5 = optString5;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "extractAndSaveConfigInfo: refreshCacheKey=false, keeping existing cache_key: ".concat(str5));
            }
            rv4.c cVar = rv4.c.f400446a;
            org.json.JSONObject a17 = cVar.a();
            if (a17 == null || (str4 = a17.toString()) == null) {
                str4 = "{}";
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str4);
            jSONObject2.put("client_expire_time", optInt);
            jSONObject2.put("ctx", optString);
            jSONObject2.put("guessTitle", str3);
            jSONObject2.put("searchID", optString4);
            jSONObject2.put("requestId", str);
            jSONObject2.put("lastUpdateTime", java.lang.System.currentTimeMillis());
            jSONObject2.put("showCount", optInt2);
            jSONObject2.put("refreshCanShow", z18);
            jSONObject2.put("refreshDocInfo", optString2);
            jSONObject2.put("refreshText", str2);
            jSONObject2.put("cache_key", str5);
            cVar.c(jSONObject2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "extractAndSaveConfigInfo: clientExpireTime=" + optInt + ", ctx=" + optString + ", guessTitle=" + str3 + ", searchId=" + optString4 + ", requestId=" + str + ", cacheKey=" + str5 + ", refreshCacheKey=" + z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSGlobalTeachHotSearchDataSource", "extractAndSaveConfigInfo error", e17);
        }
    }

    public final void c(java.lang.String json) {
        rv4.p pVar;
        kotlin.jvm.internal.o.g(json, "json");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "[ftshotsearch] handleNetworkResponse: jsonLength=" + json.length() + ", responseTime=" + currentTimeMillis + ", requestTime=" + f400546c);
        try {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "[ftshotsearch] handleNetworkResponse: json=".concat(json));
                e(json);
                java.lang.ref.WeakReference weakReference = f400545b;
                rv4.p pVar2 = weakReference != null ? (rv4.p) weakReference.get() : null;
                if (pVar2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "[ftshotsearch] handleNetworkResponse: data object found, calling callback");
                    pVar2.i(json, f400546c, currentTimeMillis);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FTSGlobalTeachHotSearchDataSource", "[ftshotsearch] handleNetworkResponse: data object has been recycled");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchDataSource", "[ftshotsearch] handleNetworkResponse: success");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSGlobalTeachHotSearchDataSource", "[ftshotsearch] handleNetworkResponse error", e17);
                java.lang.ref.WeakReference weakReference2 = f400545b;
                if (weakReference2 != null && (pVar = (rv4.p) weakReference2.get()) != null) {
                    pVar.i("", f400546c, currentTimeMillis);
                }
            }
        } finally {
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f A[Catch: Exception -> 0x018d, TRY_LEAVE, TryCatch #0 {Exception -> 0x018d, blocks: (B:3:0x0015, B:7:0x001e, B:10:0x0026, B:13:0x002f, B:16:0x0036, B:18:0x003d, B:23:0x004b, B:25:0x0074, B:28:0x007f, B:30:0x0088, B:33:0x0095, B:34:0x00bc, B:36:0x00c5, B:38:0x00cb, B:40:0x00d1, B:41:0x00de, B:43:0x00e6, B:45:0x00ef, B:47:0x00f7, B:49:0x00fd, B:51:0x010e, B:53:0x0114, B:57:0x0133, B:58:0x0136, B:62:0x0144, B:64:0x014c, B:72:0x0161, B:76:0x016f), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.q.d(org.json.JSONObject):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002a A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:10:0x0016, B:12:0x001d, B:18:0x0052, B:21:0x005a, B:25:0x002a), top: B:9:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            java.lang.String r3 = "MicroMsg.FTSGlobalTeachHotSearchDataSource"
            if (r0 == 0) goto L16
            java.lang.String r7 = "saveSearchGuideResponse: json is empty"
            com.tencent.mars.xlog.Log.e(r3, r7)
            return
        L16:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6b
            r0.<init>(r7)     // Catch: java.lang.Exception -> L6b
            if (r7 == 0) goto L26
            int r4 = r7.length()     // Catch: java.lang.Exception -> L6b
            if (r4 != 0) goto L24
            goto L26
        L24:
            r4 = r2
            goto L27
        L26:
            r4 = r1
        L27:
            if (r4 == 0) goto L2a
            goto L52
        L2a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6b
            java.lang.String r5 = "saveHotSearchData: "
            r4.<init>(r5)     // Catch: java.lang.Exception -> L6b
            r4.append(r7)     // Catch: java.lang.Exception -> L6b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L6b
            java.lang.String r5 = "[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr"
            com.tencent.mars.xlog.Log.i(r5, r4)     // Catch: java.lang.Exception -> L6b
            java.lang.Class<su4.e1> r4 = su4.e1.class
            i95.m r4 = i95.n0.c(r4)     // Catch: java.lang.Exception -> L6b
            su4.e1 r4 = (su4.e1) r4     // Catch: java.lang.Exception -> L6b
            sg0.a3 r4 = (sg0.a3) r4     // Catch: java.lang.Exception -> L6b
            com.tencent.mm.sdk.platformtools.o4 r4 = r4.wi()     // Catch: java.lang.Exception -> L6b
            java.lang.String r5 = "websearch:hotsearch:data"
            r4.D(r5, r7)     // Catch: java.lang.Exception -> L6b
        L52:
            java.lang.String r7 = rv4.q.f400549f     // Catch: java.lang.Exception -> L6b
            int r4 = rv4.q.f400548e     // Catch: java.lang.Exception -> L6b
            if (r4 != 0) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L6b
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r4)     // Catch: java.lang.Exception -> L6b
            r6.b(r0, r2, r7, r1)     // Catch: java.lang.Exception -> L6b
            java.lang.String r7 = "saveSearchGuideResponse: saved successfully"
            com.tencent.mars.xlog.Log.i(r3, r7)     // Catch: java.lang.Exception -> L6b
            goto L76
        L6b:
            r7 = move-exception
            java.lang.String r0 = "saveSearchGuideResponse error"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.tencent.mars.xlog.Log.e(r3, r0, r7)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.q.e(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[Catch: Exception -> 0x006c, TryCatch #0 {Exception -> 0x006c, blocks: (B:21:0x003f, B:25:0x004b, B:30:0x0057, B:32:0x0067), top: B:20:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(int r15) {
        /*
            r14 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.FTSGlobalTeachHotSearchDataSource"
            r2 = 1
            if (r15 == r2) goto L99
            rv4.c r15 = rv4.c.f400446a
            org.json.JSONObject r3 = r15.a()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            if (r3 == 0) goto L1a
            java.lang.String r8 = "lastUpdateTime"
            long r6 = r3.optLong(r8, r6)
        L1a:
            r8 = 600(0x258, float:8.41E-43)
            if (r3 == 0) goto L24
            java.lang.String r9 = "client_expire_time"
            int r8 = r3.optInt(r9, r8)
        L24:
            r9 = 4
            if (r3 == 0) goto L2e
            java.lang.String r10 = "showCount"
            int r9 = r3.optInt(r10, r9)
        L2e:
            long r10 = (long) r8
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            long r4 = r4 - r6
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            kz5.p0 r4 = kz5.p0.f313996d
            if (r3 <= 0) goto L3f
            java.lang.String r15 = "[ftshotsearch] cache expired, need refresh"
            com.tencent.mars.xlog.Log.i(r1, r15)
            goto L77
        L3f:
            java.lang.String r15 = r15.b()     // Catch: java.lang.Exception -> L6c
            boolean r3 = r15 instanceof java.lang.String     // Catch: java.lang.Exception -> L6c
            if (r3 == 0) goto L48
            goto L49
        L48:
            r15 = r0
        L49:
            if (r15 == 0) goto L54
            int r3 = r15.length()     // Catch: java.lang.Exception -> L6c
            if (r3 != 0) goto L52
            goto L54
        L52:
            r3 = 0
            goto L55
        L54:
            r3 = r2
        L55:
            if (r3 != 0) goto L77
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            r3.<init>(r15)     // Catch: java.lang.Exception -> L6c
            java.util.List r15 = r14.d(r3)     // Catch: java.lang.Exception -> L6c
            boolean r3 = r15.isEmpty()     // Catch: java.lang.Exception -> L6c
            r3 = r3 ^ r2
            if (r3 == 0) goto L77
            java.util.List r4 = kz5.n0.K0(r15, r9)     // Catch: java.lang.Exception -> L6c
            goto L77
        L6c:
            r15 = move-exception
            java.lang.String r3 = "tryGetFromMMKV parse json error"
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            com.tencent.mars.xlog.Log.e(r1, r3, r15)
        L77:
            boolean r15 = r4.isEmpty()
            r15 = r15 ^ r2
            if (r15 == 0) goto L99
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "[ftshotsearch] tryGetFromCache: hit MMKV cache, returning "
            r15.<init>(r0)
            int r0 = r4.size()
            r15.append(r0)
            java.lang.String r0 = " items"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.tencent.mars.xlog.Log.i(r1, r15)
            return r4
        L99:
            java.lang.String r15 = "[ftshotsearch] tryGetFromCache: cache miss or actionType=1"
            com.tencent.mars.xlog.Log.i(r1, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.q.f(int):java.util.List");
    }
}
