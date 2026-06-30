package xu4;

/* loaded from: classes8.dex */
public final class d extends aw4.b0 {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.a f457283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yu4.p uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
    }

    @Override // av4.q
    public java.lang.String c(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.reflect.Method method = xu4.d.class.getMethod(jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME), java.lang.String.class);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(this, jSONObject.getJSONObject("params").toString());
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.String");
            return (java.lang.String) invoke;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject2 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String createEmoticonStream(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "emoticonRecentSend: " + str);
        java.lang.String jSONObject = f().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        if (str == null) {
            return jSONObject;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.String str2 = null;
            try {
                boolean z17 = true;
                if (!jSONObject2.has("key")) {
                    z17 = false;
                }
                if (z17) {
                    str2 = jSONObject2.getString("key");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
            }
            if (str2 == null) {
                str2 = "default";
            }
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            com.tencent.mm.vfs.r6 h07 = lp0.b.h0("SearchEmoji");
            if (!h07.m()) {
                h07.J();
            }
            java.lang.String outputPath = h07.o() + '/' + str2 + ".gif";
            long j17 = jSONObject2.getLong("duration");
            int i17 = jSONObject2.getInt("width");
            int i18 = jSONObject2.getInt("height");
            ((com.tencent.mm.feature.emoji.z) ((com.tencent.mm.feature.emoji.api.p5) i95.n0.c(com.tencent.mm.feature.emoji.api.p5.class))).getClass();
            kotlin.jvm.internal.o.g(outputPath, "outputPath");
            com.tencent.mm.plugin.gif.p pVar = new com.tencent.mm.plugin.gif.p(outputPath, i17, i18, j17);
            this.f457283h = pVar;
            if (pVar.init()) {
                return g().toString();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", "init gifEncoder failed");
            return jSONObject;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", jz5.a.b(e18));
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #0 {Exception -> 0x006e, blocks: (B:6:0x001b, B:8:0x002e, B:13:0x003a), top: B:5:0x001b }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String emoticonImg(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "weixin://fts/emoji?path="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "emoticonImg: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WebSearch.BaseWebSearchJSApi"
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.String r1 = "emoticonImg:failed"
            if (r6 != 0) goto L1b
            return r1
        L1b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6e
            r2.<init>(r6)     // Catch: java.lang.Exception -> L6e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6e
            r6.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = "md5"
            java.lang.String r2 = r2.optString(r3)     // Catch: java.lang.Exception -> L6e
            r3 = 0
            if (r2 == 0) goto L37
            int r4 = r2.length()     // Catch: java.lang.Exception -> L6e
            if (r4 != 0) goto L35
            goto L37
        L35:
            r4 = r3
            goto L38
        L37:
            r4 = 1
        L38:
            if (r4 != 0) goto L6e
            java.lang.Class<com.tencent.mm.feature.emoji.api.r6> r4 = com.tencent.mm.feature.emoji.api.r6.class
            i95.m r4 = i95.n0.c(r4)     // Catch: java.lang.Exception -> L6e
            com.tencent.mm.feature.emoji.api.r6 r4 = (com.tencent.mm.feature.emoji.api.r6) r4     // Catch: java.lang.Exception -> L6e
            kotlin.jvm.internal.o.d(r2)     // Catch: java.lang.Exception -> L6e
            com.tencent.mm.feature.emoji.l4 r4 = (com.tencent.mm.feature.emoji.l4) r4     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = r4.wi(r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = com.tencent.mm.vfs.w6.i(r2, r3)     // Catch: java.lang.Exception -> L6e
            java.lang.String r4 = "retCode"
            org.json.JSONObject r6 = r6.put(r4, r3)     // Catch: java.lang.Exception -> L6e
            java.lang.String r3 = "url"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e
            r4.<init>(r0)     // Catch: java.lang.Exception -> L6e
            r4.append(r2)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L6e
            org.json.JSONObject r6 = r6.put(r3, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L6e
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xu4.d.emoticonImg(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String emoticonRecentSend(java.lang.String str) {
        java.util.LinkedList Ai;
        java.util.LinkedList Ai2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "emoticonRecentSend: " + str);
        if (str == null) {
            return "emoticonRecentSend:failed";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("operation", 0);
            com.tencent.mm.feature.emoji.api.r6 r6Var = (com.tencent.mm.feature.emoji.api.r6) i95.n0.c(com.tencent.mm.feature.emoji.api.r6.class);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (optInt == 1) {
                java.lang.String optString = jSONObject.optString("md5");
                if (optString == null || optString.length() == 0) {
                    return "emoticonRecentSend:failed";
                }
                kotlin.jvm.internal.o.d(optString);
                com.tencent.mm.feature.emoji.l4 l4Var = (com.tencent.mm.feature.emoji.l4) r6Var;
                l4Var.getClass();
                synchronized (l4Var.Ai()) {
                    Ai = l4Var.Ai();
                }
                return jSONObject2.put("isInList", Ai.contains(optString) ? 1 : 0).toString();
            }
            if (optInt == 2) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                com.tencent.mm.feature.emoji.l4 l4Var2 = (com.tencent.mm.feature.emoji.l4) r6Var;
                synchronized (l4Var2.Ai()) {
                    Ai2 = l4Var2.Ai();
                }
                java.util.Iterator it = Ai2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((java.lang.String) it.next());
                }
                return g().put("md5InOrder", jSONArray.toString()).toString();
            }
            if (optInt != 3) {
                if (optInt != 4) {
                    return "emoticonRecentSend:ok";
                }
                com.tencent.mm.feature.emoji.l4 l4Var3 = (com.tencent.mm.feature.emoji.l4) r6Var;
                synchronized (l4Var3.Ai()) {
                    l4Var3.Ai().clear();
                    com.tencent.mm.storage.n5.f().e().f470828d.delete("GetEmotionListCache", "reqType=?", new java.lang.String[]{"cache_type_send_list"});
                }
                return "emoticonRecentSend:ok";
            }
            java.lang.String optString2 = jSONObject.optString("md5");
            if (optString2 == null || optString2.length() == 0) {
                return "emoticonRecentSend:failed";
            }
            kotlin.jvm.internal.o.d(optString2);
            com.tencent.mm.feature.emoji.l4 l4Var4 = (com.tencent.mm.feature.emoji.l4) r6Var;
            l4Var4.getClass();
            synchronized (l4Var4.Ai()) {
                l4Var4.Ai().remove(optString2);
                l4Var4.Bi(l4Var4.Ai());
            }
            return "emoticonRecentSend:ok";
        } catch (java.lang.Exception unused) {
            return "emoticonRecentSend:failed";
        }
        return "emoticonRecentSend:failed";
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String endEmoticonStream(java.lang.String str) {
        com.tencent.mm.plugin.gif.a aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "endEmoticonStream: " + str);
        java.lang.String jSONObject = f().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        if (str == null || (aVar = this.f457283h) == null) {
            return jSONObject;
        }
        try {
            kotlin.jvm.internal.o.d(aVar);
            if (!((com.tencent.mm.plugin.gif.p) aVar).b()) {
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.String str2 = null;
            try {
                boolean z17 = true;
                if (!jSONObject2.has("key")) {
                    z17 = false;
                }
                if (z17) {
                    str2 = jSONObject2.getString("key");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
            }
            if (str2 == null) {
                str2 = "default";
            }
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            java.lang.String str3 = lp0.b.h0("SearchEmoji").o() + '/' + str2 + ".gif";
            byte[] N = com.tencent.mm.vfs.w6.N(str3, 0, -1);
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(N);
            kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
            org.json.JSONObject g17 = g();
            int length = N.length;
            g17.put("md5", b17);
            g17.put("size", length);
            g17.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str3);
            return g17.toString();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", jz5.a.b(e18));
            return jSONObject;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String enterEmojiStore(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("searchScene", 24);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "searchScene = %s, requestObj = %s.", java.lang.Integer.valueOf(optInt), jSONObject);
            qk.z zVar = new qk.z();
            zVar.f364112h = optInt;
            zVar.f364155a = 13;
            zVar.f364113i = 17;
            java.lang.String optString = jSONObject.optString("talker");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                kotlin.jvm.internal.o.d(optString);
                zVar.f364114j = optString;
            }
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", "unable to get emoticon liteapp feature service");
            } else {
                yu4.p u17 = u();
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(u17 != null ? u17.H() : null, zVar);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12065, 9);
            java.lang.String jSONObject2 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject3 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    public final java.lang.String enterKeyboardPlugin(java.lang.String str) {
        xu4.m b17;
        java.lang.String str2;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "enterKeyboardPlugin onClick");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 5);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                android.util.Pair c17 = rn3.i.Di().c(new vn3.c(48));
                if (c17.first == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                    jSONObject.put("redDot", 1);
                }
                xu4.n nVar = xu4.n.f457297a;
                nVar.c();
                b17 = nVar.b();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchJSApi", e17, "", new java.lang.Object[0]);
            }
            if (b17 != null) {
                str2 = b17.f457292a;
                if (str2 == null) {
                }
                jSONObject.put("wording", str2);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("wetype", jSONObject);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "query:%s", jSONObject2.toString());
                wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String jSONObject3 = jSONObject2.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                ((vd0.o3) z1Var).bj(context, jSONObject3);
                ((vd0.g2) ((wd0.n1) i95.n0.c(wd0.n1.class))).wi(7, str2, java.lang.Integer.valueOf((!com.tencent.mm.sdk.platformtools.t8.K0(str) || kotlin.jvm.internal.o.b(str, "{}")) ? 0 : new org.json.JSONObject(str).optBoolean("hasRedDot")), 1);
                com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putBoolean("mmkv_key_scene_emoji_search_config_has_click", true);
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(48);
                java.lang.String jSONObject4 = g().toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                return jSONObject4;
            }
            str2 = "";
            jSONObject.put("wording", str2);
            org.json.JSONObject jSONObject22 = new org.json.JSONObject();
            jSONObject22.put("wetype", jSONObject);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "query:%s", jSONObject22.toString());
            wd0.z1 z1Var2 = (wd0.z1) i95.n0.c(wd0.z1.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            java.lang.String jSONObject32 = jSONObject22.toString();
            kotlin.jvm.internal.o.f(jSONObject32, "toString(...)");
            ((vd0.o3) z1Var2).bj(context2, jSONObject32);
            ((vd0.g2) ((wd0.n1) i95.n0.c(wd0.n1.class))).wi(7, str2, java.lang.Integer.valueOf((!com.tencent.mm.sdk.platformtools.t8.K0(str) || kotlin.jvm.internal.o.b(str, "{}")) ? 0 : new org.json.JSONObject(str).optBoolean("hasRedDot")), 1);
            com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putBoolean("mmkv_key_scene_emoji_search_config_has_click", true);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(48);
            java.lang.String jSONObject42 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject42, "toString(...)");
            return jSONObject42;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject5 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getCurrentSearchInputQuery(java.lang.String str) {
        java.lang.String a47;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "getCurrentSearchInputQuery: " + str);
        try {
            yu4.p u17 = u();
            if (u17 != null && (a47 = u17.a4()) != null) {
                org.json.JSONObject g17 = g();
                g17.put("query", a47);
                java.lang.String jSONObject = g17.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String jSONObject2 = f().toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String openSearchWebView(java.lang.String str) {
        r45.xi0 xi0Var;
        java.lang.String str2;
        java.lang.String str3 = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "openSearchWebView " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("query");
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
            int optInt4 = jSONObject.optInt("actionType", 0);
            java.lang.String optString4 = jSONObject.optString("extParams", "");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("nativeConfig");
            if (optJSONObject != null) {
                optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            }
            if (optInt4 == 3) {
                java.util.Map c17 = su4.r2.c(optInt, false, optInt2, optString4);
                java.util.HashMap hashMap = (java.util.HashMap) c17;
                hashMap.put("query", optString);
                hashMap.put("searchId", optString2);
                hashMap.put("subType", java.lang.String.valueOf(optInt3));
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString3);
                hashMap.put("subSessionId", su4.r2.f(optInt));
                r45.xi0 xi0Var2 = new r45.xi0();
                yu4.p u17 = u();
                if (u17 != null && (xi0Var = (r45.xi0) u17.m4()) != null && (str2 = xi0Var.f390123o) != null) {
                    str3 = str2;
                }
                xi0Var2.f390123o = str3;
                xi0Var2.f390118g = xu4.g.f457287a.a(c17);
                xi0Var2.f390120i = optString;
                xi0Var2.f390117f = optInt;
                xi0Var2.f390115d = optString2;
                xi0Var2.f390116e = optString3;
                xi0Var2.f390119h = su4.r2.f(optInt);
                yu4.p u18 = u();
                if (u18 != null) {
                    u18.g5(xi0Var2);
                }
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String sendEmoticonStream(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "sendEmoticonStream: " + str);
        java.lang.String jSONObject = f().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        if (str != null && this.f457283h != null) {
            try {
                java.lang.String optString = new org.json.JSONObject(str).optString("images");
                kotlin.jvm.internal.o.d(optString);
                q26.h hVar = new q26.h((q26.i) q26.h0.i(q26.h0.o(q26.h0.i(r26.n0.h0(optString, new java.lang.String[]{","}, false, 0, 6, null), xu4.a.f457280d), xu4.b.f457281d), xu4.c.f457282d));
                while (hVar.hasNext()) {
                    byte[] bArr = (byte[]) hVar.next();
                    com.tencent.mm.plugin.gif.a aVar = this.f457283h;
                    kotlin.jvm.internal.o.d(aVar);
                    ((com.tencent.mm.plugin.gif.p) aVar).a(bArr, 500L);
                }
                return g().toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseWebSearchJSApi", jz5.a.b(e17));
            }
        }
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String setRecommendSearchHint(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "setRecommendSearchHint: ".concat(params));
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(params) || kotlin.jvm.internal.o.b(params, "{}")) {
                java.lang.String jSONObject = f().toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(params);
            yu4.p u17 = u();
            if (u17 != null) {
                java.lang.String optString = jSONObject2.optString("recommendSearchHint");
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                u17.W1(optString);
            }
            java.lang.String jSONObject3 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject4 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[Catch: Exception -> 0x0165, TryCatch #1 {Exception -> 0x0165, blocks: (B:9:0x002b, B:11:0x0030, B:12:0x0039, B:17:0x0145, B:18:0x0095, B:20:0x009d, B:22:0x00a3, B:31:0x0110, B:32:0x0116, B:36:0x0128, B:41:0x0139, B:44:0x013d, B:50:0x0103, B:25:0x00f2, B:29:0x00fd), top: B:8:0x002b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139 A[Catch: Exception -> 0x0165, TRY_ENTER, TryCatch #1 {Exception -> 0x0165, blocks: (B:9:0x002b, B:11:0x0030, B:12:0x0039, B:17:0x0145, B:18:0x0095, B:20:0x009d, B:22:0x00a3, B:31:0x0110, B:32:0x0116, B:36:0x0128, B:41:0x0139, B:44:0x013d, B:50:0x0103, B:25:0x00f2, B:29:0x00fd), top: B:8:0x002b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String setSearchTagResult(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu4.d.setSearchTagResult(java.lang.String):java.lang.String");
    }

    public final yu4.p u() {
        av4.j jVar = this.f14326a;
        if (jVar instanceof yu4.p) {
            return (yu4.p) jVar;
        }
        return null;
    }
}
