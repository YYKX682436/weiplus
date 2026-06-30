package d23;

/* loaded from: classes.dex */
public final class g extends aw4.b0 {

    /* renamed from: h, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f225895h;

    /* renamed from: i, reason: collision with root package name */
    public long f225896i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity, d23.h uiComponent) {
        super(uiComponent);
        j75.f stateCenter;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        this.f225895h = activity;
        if (!(activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) || (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity).getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(activity, new d23.a(this, uiComponent));
    }

    @android.webkit.JavascriptInterface
    public final void getFTSHotData(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", "getFTSHotData params:" + str);
            r45.xa1 xa1Var = new r45.xa1();
            java.lang.String optString = jSONObject.optString("requestId", "");
            xa1Var.set(1, jSONObject.optString("json", ""));
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 6289;
            lVar.f70666c = "/cgi-bin/micromsg-bin/finderglobalsearchpage";
            lVar.f70664a = xa1Var;
            lVar.f70665b = new r45.ya1();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            androidx.appcompat.app.AppCompatActivity activity = this.f225895h;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = ((um3.b) pf5.z.f353948a.a(activity).a(um3.b.class)).O6();
            v65.i.b(O6, null, new d23.d(a17, optString, O6, this, null), 1, null);
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getWebConfig(java.lang.String str) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("key");
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            org.json.JSONObject d17 = su4.o2.d(optString);
            org.json.JSONObject g17 = g();
            g17.put("configStr", d17.toString());
            pm0.v.X(new d23.e(this));
            java.lang.String jSONObject = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSHotSearchJSApi", e17, "getWebConfig", new java.lang.Object[0]);
            java.lang.String jSONObject2 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String openBizProfile(java.lang.String str) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString(dm.i4.COL_USERNAME);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", optString);
            intent.putExtra("finish_direct", true);
            intent.putExtra("specific_chat_from_scene", 3);
            intent.putExtra("preChatTYPE", 9);
            intent.putExtra("chat_from_scene", 5);
            av4.j jVar = this.f14326a;
            kotlin.jvm.internal.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchUIComponent");
            j45.l.u(((d23.h) jVar).f225897d, ".ui.chatting.ChattingUI", intent, null);
            java.lang.String jSONObject = g().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject2 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r7 == null) goto L17;
     */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String openSearchWebView(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d23.g.openSearchWebView(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String startWebSearch(java.lang.String str) {
        org.json.JSONObject optJSONObject;
        java.lang.String str2 = "";
        if (c01.id.c() - this.f225896i < 1500) {
            java.lang.String jSONObject = f().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        this.f225896i = c01.id.c();
        try {
            boolean z17 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", "startWebSearch %s", java.lang.String.valueOf(str));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            int optInt = jSONObject2.optInt("type", 0);
            java.lang.String optString = jSONObject2.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
            int optInt2 = jSONObject2.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            java.lang.String optString2 = jSONObject2.optString("query");
            java.lang.String optString3 = jSONObject2.optString("extParams", "");
            java.lang.String optString4 = jSONObject2.optString("extReqParams", "");
            java.lang.String optString5 = jSONObject2.optString("searchPlaceHolder", "");
            int optInt3 = jSONObject2.optInt("ftsNeedHideKeyBoard", 0);
            boolean optBoolean = jSONObject2.optBoolean("needPreGet", true);
            org.json.JSONObject optJSONObject2 = jSONObject2.optJSONObject("customNavBarParams");
            boolean optBoolean2 = optJSONObject2 != null ? optJSONObject2.optBoolean("hideSearchBar", false) : false;
            java.lang.String optString6 = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("nativeConfig")) == null) ? null : optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (optString6 != null) {
                str2 = optString6;
            }
            su4.j2 j2Var = new su4.j2();
            j2Var.f412961x = java.net.URLDecoder.decode(optString3, com.tencent.mapsdk.internal.rv.f51270c);
            j2Var.f412962y = optString4;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            j2Var.f412938a = context;
            j2Var.f412939b = optInt2;
            j2Var.f412941d = optString2;
            j2Var.f412940c = optInt;
            j2Var.f412942e = optString;
            j2Var.f412943f = true;
            j2Var.f412945h = true;
            j2Var.f412946i = optBoolean2;
            j2Var.f412960w = optBoolean;
            j2Var.f412954q = str2;
            if (optInt3 == 1 || optInt3 == 2) {
                if (optInt3 != 1) {
                    z17 = false;
                }
                j2Var.A = z17;
            }
            j2Var.f412958u = false;
            j2Var.f412952o = i65.a.d(context, com.tencent.mm.R.color.aaw);
            j2Var.f412953p = false;
            j2Var.f412963z = optString5;
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            java.lang.String jSONObject3 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject4 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    public final void u(java.lang.String state, java.lang.String extData) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(extData, "extData");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", "onActivityStateChanged, state %s, extData %s", state, extData);
        av4.j jVar = this.f14326a;
        kotlin.jvm.internal.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchUIComponent");
        androidx.appcompat.app.AppCompatActivity context = ((d23.h) jVar).f225897d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = ((um3.b) pf5.z.f353948a.a(context).a(um3.b.class)).O6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("state", state);
        jSONObject.put("extData", extData);
        if (O6 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new d23.f(this, jSONObject, null), 2, null);
        }
    }
}
