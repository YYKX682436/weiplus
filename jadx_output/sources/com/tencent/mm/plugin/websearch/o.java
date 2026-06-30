package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public final class o implements com.tencent.mm.modelbase.u0 {
    public java.lang.String a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("action");
            return optString == null ? "" : optString;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public void b(java.lang.String content, java.lang.String tag) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(tag, "tag");
        ((com.tencent.mm.plugin.websearch.d2) ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).Zi()).f181432o).b(0, tag, content, com.tencent.mm.plugin.websearch.n.f181571a);
    }

    public void c(int i17, java.lang.String sessionId, int i18, int i19, java.lang.String cgiAction) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(cgiAction, "cgiAction");
        com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.f55627e = i17;
        chatImageWebSearchActionStruct.f55629g = i18;
        chatImageWebSearchActionStruct.q("");
        chatImageWebSearchActionStruct.p("");
        chatImageWebSearchActionStruct.f55632j = 0;
        chatImageWebSearchActionStruct.t(sessionId);
        chatImageWebSearchActionStruct.f55635m = java.lang.System.currentTimeMillis();
        chatImageWebSearchActionStruct.f55636n = i19;
        chatImageWebSearchActionStruct.f55637o = chatImageWebSearchActionStruct.b("CgiAction", cgiAction, true);
        chatImageWebSearchActionStruct.k();
        su4.k3.m(chatImageWebSearchActionStruct);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (m1Var instanceof su4.x1) {
            su4.x1 x1Var = (su4.x1) m1Var;
            if (android.text.TextUtils.isEmpty(x1Var.f413134n.C)) {
                str2 = x1Var.f413134n.f413085y;
                str3 = "requestId";
            } else {
                str2 = x1Var.f413134n.C;
                str3 = "content";
            }
            kotlin.jvm.internal.o.f(str2, str3);
            if (!android.text.TextUtils.isEmpty(x1Var.f413134n.C)) {
                str2 = ((com.tencent.mm.plugin.websearch.d2) ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).Zi()).f181432o).a(x1Var.f413134n.C);
                kotlin.jvm.internal.o.f(str2, "getContentKey(...)");
            }
            r45.u97 u97Var = x1Var.f413135o;
            su4.r1 r1Var = x1Var.f413134n;
            if (u97Var == null || r1Var == null) {
                return;
            }
            java.lang.String str4 = r1Var.E;
            if (!(str4 == null || str4.length() == 0)) {
                java.lang.String imageSearchSessionId = r1Var.E;
                kotlin.jvm.internal.o.f(imageSearchSessionId, "imageSearchSessionId");
                c(7, imageSearchSessionId, r1Var.f413066f, i18, a(r1Var.C));
            }
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSChatSearchLogic", "net scene fail requestId:" + x1Var.f413134n.f413085y + " reqKey:" + x1Var.f413134n.B);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("ret", -1);
                } catch (java.lang.Exception unused) {
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                b(jSONObject2, str2);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("net scene success requestId:");
            sb6.append(x1Var.f413134n.f413085y);
            sb6.append(" reqKey:");
            sb6.append(x1Var.f413134n.B);
            sb6.append(" jsonStr:");
            java.lang.String str5 = u97Var.f387163d;
            sb6.append(str5 != null ? java.lang.Integer.valueOf(str5.length()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSChatSearchLogic", sb6.toString());
            java.lang.String json_str = u97Var.f387163d;
            kotlin.jvm.internal.o.f(json_str, "json_str");
            b(json_str, str2);
        }
    }
}
