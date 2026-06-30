package z13;

/* loaded from: classes12.dex */
public final class f extends wm3.a {

    /* renamed from: s, reason: collision with root package name */
    public static final z13.a f469397s = new z13.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final t50.e f469398d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.widget.v f469399e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f469400f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469401g;

    /* renamed from: h, reason: collision with root package name */
    public int f469402h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f469403i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f469404m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469405n;

    /* renamed from: o, reason: collision with root package name */
    public k23.r2 f469406o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f469407p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f469408q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f469409r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        android.app.Activity context = getContext();
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = context instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) context : null;
        if (fTSMainUI != null) {
            z13.d dVar = new z13.d(this);
            com.tencent.mm.plugin.fts.ui.q0 q0Var = fTSMainUI.G1;
            java.util.ArrayList arrayList = (java.util.ArrayList) q0Var.f138145b;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            z13.e eVar = new z13.e(this);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) q0Var.f138145b;
            if (!arrayList2.contains(eVar)) {
                arrayList2.add(eVar);
            }
        }
        this.f469398d = new t50.e();
        this.f469401g = "";
        this.f469405n = "";
        this.f469406o = k23.r2.f303683e;
        this.f469407p = "";
        this.f469408q = "";
        this.f469409r = jz5.h.b(z13.b.f469392d);
    }

    public static void T6(z13.f fVar, java.lang.Boolean bool, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        android.app.Activity context = fVar.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = (com.tencent.mm.plugin.fts.ui.FTSMainUI) context;
        com.tencent.mm.plugin.fts.ui.widget.v vVar = fVar.f469399e;
        android.view.View view = null;
        java.lang.Boolean valueOf = vVar != null ? java.lang.Boolean.valueOf(vVar.f138334z) : null;
        if (bool == null || valueOf == null) {
            return;
        }
        if (z19 || z27) {
            java.util.List list = fTSMainUI.L1.f138152q;
            kotlin.jvm.internal.o.d(list);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((t13.k) obj2).getType() == 256) {
                        break;
                    }
                }
            }
            j23.y yVar = obj2 instanceof j23.y ? (j23.y) obj2 : null;
            if (yVar != null) {
                z13.c cVar = new z13.c(bool, valueOf);
                yVar.f297304w = cVar;
                e23.b1 b1Var = yVar.f297303v;
                if (b1Var != null) {
                    cVar.invoke(b1Var);
                }
            }
        }
        if (!z19 || z27) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSMainUI).a(c23.c0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            c23.c0 c0Var = (c23.c0) a17;
            if (!bool.booleanValue()) {
                em.l0 l0Var = c0Var.f38018t;
                if (l0Var != null) {
                    android.widget.LinearLayout linearLayout = l0Var.f254531c;
                    android.view.View view2 = l0Var.f254529a;
                    if (linearLayout == null) {
                        l0Var.f254531c = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f486605uy4);
                    }
                    l0Var.f254531c.setVisibility(0);
                    if (l0Var.f254535g == null) {
                        l0Var.f254535g = view2.findViewById(com.tencent.mm.R.id.t4c);
                    }
                    android.view.View view3 = l0Var.f254535g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view4 = c0Var.f38016r;
                if (view4 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "showRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (!valueOf.booleanValue()) {
                em.l0 l0Var2 = c0Var.f38018t;
                if (l0Var2 != null) {
                    if (l0Var2.f254535g == null) {
                        l0Var2.f254535g = l0Var2.f254529a.findViewById(com.tencent.mm.R.id.t4c);
                    }
                    view = l0Var2.f254535g;
                }
                if (view == null) {
                    return;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                android.view.View view5 = view;
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideTopDivideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideTopDivideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            em.l0 l0Var3 = c0Var.f38018t;
            if (l0Var3 != null) {
                if (l0Var3.f254531c == null) {
                    l0Var3.f254531c = (android.widget.LinearLayout) l0Var3.f254529a.findViewById(com.tencent.mm.R.id.f486605uy4);
                }
                view = l0Var3.f254531c;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            android.view.View view6 = c0Var.f38016r;
            if (view6 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "hideRelevantSearchHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public static final z13.f Y6(android.content.Context context) {
        return f469397s.a(context);
    }

    public final void U6(org.json.JSONObject extParams) {
        java.lang.String optString;
        kotlin.jvm.internal.o.g(extParams, "extParams");
        try {
            org.json.JSONArray Z6 = Z6();
            int length = Z6.length();
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length; i19++) {
                org.json.JSONObject optJSONObject = Z6.optJSONObject(i19);
                if (optJSONObject != null && (optString = optJSONObject.optString("key")) != null) {
                    if (kotlin.jvm.internal.o.b(optString, "globalSearchDeepThink")) {
                        i17 = optJSONObject.optInt("selected", 0);
                    } else if (kotlin.jvm.internal.o.b(optString, "globalSearchAskRealPeople")) {
                        i18 = optJSONObject.optInt("selected", 0);
                    }
                }
            }
            extParams.put("isFromVoice", this.f469406o.f303687d);
            extParams.put("voiceId", this.f469408q);
            int i27 = 1;
            extParams.put("isKeyboard", this.f469403i ? 1 : 0);
            extParams.put("uiStyle", f7() ? 2 : 1);
            extParams.put("isDeepThink", i17);
            extParams.put("isAskRealPeople", i18);
            com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f469399e;
            extParams.put("changeReason", vVar != null ? vVar.getSwitchModeType() : 0);
            extParams.put("actionType", this.f469404m ? 3216 : 3013);
            xj.m mVar = (xj.m) ((jz5.n) this.f469409r).getValue();
            if (mVar == null) {
                i27 = 0;
            } else if (mVar.f454760h) {
                i27 = 2;
            }
            extParams.put("yuanbao_user_state", i27);
            extParams.put("colorStyle", ((java.lang.Number) ((jz5.n) k23.c1.f303536h.a(getContext()).f303538d.f303532e).getValue()).intValue());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final void V6(org.json.JSONObject extParams) {
        kotlin.jvm.internal.o.g(extParams, "extParams");
        try {
            g23.h hVar = this.f469398d.f415695g;
            boolean z17 = hVar.f267918b;
            boolean z18 = hVar.f267919c;
            extParams.put("AIMergeSearch", hVar.f267917a);
            W6(extParams, z17, z18);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final void W6(org.json.JSONObject jSONObject, boolean z17, boolean z18) {
        t50.e eVar = this.f469398d;
        try {
            jSONObject.put("hideSearchBar", z17);
            jSONObject.put("hideNavBar", z18);
            jSONObject.put("aiSearchPositionType", ((java.lang.Number) ((jz5.n) eVar.f415691c).getValue()).intValue());
            jSONObject.put("aiSearchStyle", ((java.lang.Number) ((jz5.n) eVar.f415690b).getValue()).intValue());
            jSONObject.put("webSearchStyle", eVar.a());
            jSONObject.put("localSearchQuery", this.f469401g);
            jSONObject.put("checkboxes", Z6());
            jSONObject.put("keyboardHeight", this.f469402h);
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.lang.String.valueOf(o13.p.f342250c));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final org.json.JSONObject X6(java.lang.String configExtParams, java.lang.String configNavBarParms) {
        kotlin.jvm.internal.o.g(configExtParams, "configExtParams");
        kotlin.jvm.internal.o.g(configNavBarParms, "configNavBarParms");
        org.json.JSONObject jSONObject = new org.json.JSONObject(configNavBarParms);
        boolean optBoolean = jSONObject.optBoolean("hideSearchBar", true);
        boolean optBoolean2 = jSONObject.optBoolean("hideNavBar", false);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(configExtParams);
        if (!jSONObject2.has("chatbot")) {
            jSONObject2.put("chatbot", 1);
        }
        W6(jSONObject2, optBoolean, optBoolean2);
        jSONObject2.put("hideSearchInput", optBoolean);
        return jSONObject2;
    }

    public final org.json.JSONArray Z6() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f469398d.f415695g.f267920d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                g23.g gVar = (g23.g) arrayList.get(i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("key", gVar.f267914a);
                jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, gVar.f267915b);
                jSONObject.put("selected", gVar.f267916c ? 1 : 0);
                jSONArray.put(jSONObject);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
        return jSONArray;
    }

    public final org.json.JSONObject a7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        U6(jSONObject);
        return jSONObject;
    }

    public final java.lang.String b7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        U6(jSONObject);
        java.lang.String b17 = fp.s0.b(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(b17, "encode(...)");
        return b17;
    }

    public final org.json.JSONObject c7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        V6(jSONObject);
        return jSONObject;
    }

    public final org.json.JSONObject d7() {
        t50.e eVar = this.f469398d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String valueOf = java.lang.String.valueOf(o13.p.f342250c);
            java.lang.String valueOf2 = java.lang.String.valueOf(o13.p.f342251d);
            java.lang.String valueOf3 = java.lang.String.valueOf(o13.p.f342251d);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("key", "webSearchStyle");
            jSONObject2.put("uintValue", eVar.a());
            jSONArray.put(jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("key", "keyboardHeight");
            jSONObject3.put("uintValue", this.f469402h);
            jSONArray.put(jSONObject3);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("key", "AIMergeSearch");
            jSONObject4.put("uintValue", eVar.f415695g.f267917a ? 1 : 0);
            jSONArray.put(jSONObject4);
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("key", "lastSessionID");
            jSONObject5.put("textValue", valueOf);
            jSONArray.put(jSONObject5);
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("key", "lastSearchId");
            jSONObject6.put("textValue", valueOf2);
            jSONArray.put(jSONObject6);
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("key", "lastRequestID");
            jSONObject7.put("textValue", valueOf3);
            jSONArray.put(jSONObject7);
            jSONObject.put("extReqParams", jSONArray);
            jSONObject.put("checkboxes", Z6());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSAISearchManagerUIC", e17, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public final boolean e7() {
        return this.f469398d.a() > 0 && com.tencent.mm.plugin.fts.ui.n3.h();
    }

    public final boolean f7() {
        if (!com.tencent.mm.plugin.fts.ui.n3.g(getActivity())) {
            return false;
        }
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f469399e;
        return vVar != null && vVar.f138334z;
    }

    public final void g7(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[aisearch] setText ".concat(text));
        this.f469404m = true;
        this.f469405n = text;
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f469399e;
        if (vVar != null) {
            vVar.setText(text);
        }
    }

    public final void h7(java.lang.String text, k23.r2 voiceTextType, java.lang.String voiceID, boolean z17) {
        com.tencent.mm.plugin.fts.ui.widget.v vVar;
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(voiceTextType, "voiceTextType");
        kotlin.jvm.internal.o.g(voiceID, "voiceID");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "nativeVoice: setVoiceText " + text + ", voiceTextType: " + voiceTextType);
        this.f469406o = voiceTextType;
        this.f469407p = text;
        this.f469408q = voiceID;
        if (!z17 || (vVar = this.f469399e) == null) {
            return;
        }
        vVar.setText(text);
    }

    public final boolean i7() {
        if (!com.tencent.mm.plugin.fts.ui.n3.g(getActivity())) {
            return false;
        }
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f469399e;
        return vVar != null && vVar.D;
    }
}
