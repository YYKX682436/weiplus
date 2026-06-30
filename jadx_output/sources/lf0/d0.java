package lf0;

@j95.b
/* loaded from: classes8.dex */
public final class d0 extends i95.w implements pm4.t {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f318201e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f318202f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f318203d = "";

    public static final void wi(lf0.d0 d0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i("TopStoryLiteAppJsApiFeatureService", "[TopStoryLiteApp]did dispatch preloadK1KData: " + jSONObject);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.lite.i) g0Var).rj(str, "preloadK1KData", jSONObject);
        }
    }

    public void Ai(android.content.Context context, java.lang.String liteAppId, int i17, java.lang.String tabInfo, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        kotlin.jvm.internal.o.g(tabInfo, "tabInfo");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        org.json.JSONObject Bi = Bi(context);
        Bi.put("category", i17);
        Bi.put("tabInfo", tabInfo);
        Bi.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, sessionId);
        if (!((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(liteAppId)) {
            com.tencent.mars.xlog.Log.i("TopStoryLiteAppJsApiFeatureService", "[TopStoryLiteApp] does not dispatch enterTopStory because store is not alive");
            return;
        }
        com.tencent.mars.xlog.Log.i("TopStoryLiteAppJsApiFeatureService", "[TopStoryLiteApp]did dispatch enterTopStory: " + Bi);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.lite.i) g0Var).rj(liteAppId, "enterTopStory", Bi);
        }
    }

    public final org.json.JSONObject Bi(android.content.Context context) {
        com.tencent.mm.protobuf.g byteString;
        org.json.JSONObject jSONObject = new org.json.JSONObject(pm4.w.d(context));
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 21);
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
        if (L0 != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.String str = L0.field_tipsId;
            if (str == null) {
                str = "";
            }
            jSONObject2.putOpt("redPointMsgId", str);
            r45.ez2 D0 = L0.D0();
            java.lang.String i17 = (D0 == null || (byteString = D0.getByteString(4)) == null) ? null : byteString.i();
            jSONObject2.putOpt("byPassInfo", i17 != null ? i17 : "");
            ((wm4.z) ((pm4.v) i95.n0.c(pm4.v.class))).getClass();
            jSONObject2.putOpt("category", java.lang.Integer.valueOf(wm4.u.h(L0)));
            jSONObject.put("reddotParams", jSONObject2.toString());
        }
        java.lang.String f17 = su4.r2.f(21);
        kotlin.jvm.internal.o.f(f17, "genSessionId(...)");
        this.f318203d = f17;
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r7.put("tabInfo", r6.getString("tabInfo"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(android.content.Context r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r15 = this;
            r8 = r17
            java.lang.String r0 = "tabInfo"
            java.lang.String r1 = "context"
            r2 = r16
            kotlin.jvm.internal.o.g(r2, r1)
            java.lang.String r1 = "liteAppId"
            kotlin.jvm.internal.o.g(r8, r1)
            java.lang.String r1 = "liteAppPath"
            r3 = r18
            kotlin.jvm.internal.o.g(r3, r1)
            java.lang.String r3 = r17.concat(r18)
            org.json.JSONObject r7 = r15.Bi(r16)
            r1 = 0
            java.lang.String r2 = "topstoryTopTabParam"
            org.json.JSONObject r2 = su4.o2.d(r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = "tabs"
            org.json.JSONArray r2 = r2.optJSONArray(r4)     // Catch: java.lang.Exception -> L53
            if (r2 == 0) goto L63
            int r4 = r2.length()     // Catch: java.lang.Exception -> L53
            r5 = r1
        L36:
            if (r5 >= r4) goto L63
            org.json.JSONObject r6 = r2.getJSONObject(r5)     // Catch: java.lang.Exception -> L53
            java.lang.String r9 = "category"
            int r9 = r6.getInt(r9)     // Catch: java.lang.Exception -> L53
            boolean r9 = pm4.w.n(r9)     // Catch: java.lang.Exception -> L53
            if (r9 == 0) goto L50
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Exception -> L53
            r7.put(r0, r2)     // Catch: java.lang.Exception -> L53
            goto L63
        L50:
            int r5 = r5 + 1
            goto L36
        L53:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "TopStoryLiteAppJsApiFeatureService"
            java.lang.String r4 = "Failed to load tabInfo %s"
            com.tencent.mars.xlog.Log.e(r2, r4, r0)
        L63:
            java.util.concurrent.ConcurrentHashMap r0 = lf0.d0.f318202f
            java.lang.Object r2 = r0.get(r3)
            wu5.c r2 = (wu5.c) r2
            if (r2 == 0) goto L70
            r2.cancel(r1)
        L70:
            if (r19 == 0) goto L75
            r4 = 0
            goto L77
        L75:
            r4 = 1000(0x3e8, double:4.94E-321)
        L77:
            java.lang.Class<q80.g0> r2 = q80.g0.class
            i95.m r6 = i95.n0.c(r2)
            q80.g0 r6 = (q80.g0) r6
            com.tencent.mm.feature.lite.i r6 = (com.tencent.mm.feature.lite.i) r6
            boolean r6 = r6.tk(r8)
            if (r6 == 0) goto La2
            ku5.u0 r2 = ku5.t0.f312615d
            lf0.y r6 = new lf0.y
            r9 = r15
            r6.<init>(r15, r8, r7)
            ku5.t0 r2 = (ku5.t0) r2
            r2.getClass()
            wu5.c r1 = r2.z(r6, r4, r1)
            java.lang.String r2 = "uiDelay(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r0.put(r3, r1)
            goto Lc1
        La2:
            r9 = r15
            i95.m r0 = i95.n0.c(r2)
            q80.g0 r0 = (q80.g0) r0
            r10 = 300(0x12c, float:4.2E-43)
            r11 = 1
            r12 = 10
            lf0.a0 r14 = new lf0.a0
            r1 = r14
            r2 = r17
            r6 = r15
            r1.<init>(r2, r3, r4, r6, r7)
            r1 = r0
            com.tencent.mm.feature.lite.i r1 = (com.tencent.mm.feature.lite.i) r1
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r1.qj(r2, r3, r4, r5, r7)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lf0.d0.Di(android.content.Context, java.lang.String, java.lang.String, boolean):void");
    }
}
