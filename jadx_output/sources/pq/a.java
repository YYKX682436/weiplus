package pq;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f357551a;

    /* renamed from: b, reason: collision with root package name */
    public bw5.h8 f357552b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.p f357553c;

    /* renamed from: d, reason: collision with root package name */
    public pq.c f357554d;

    /* renamed from: e, reason: collision with root package name */
    public long f357555e;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f357551a = new java.lang.ref.WeakReference(context);
        this.f357552b = new bw5.h8();
        this.f357554d = new pq.c();
        this.f357555e = java.lang.System.currentTimeMillis();
    }

    public final org.json.JSONObject a(org.json.JSONObject extraData, java.lang.String str) {
        kotlin.jvm.internal.o.g(extraData, "extraData");
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.length() > 0) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    extraData.put(next, jSONObject.get(next));
                }
            }
        }
        return extraData;
    }

    public final void b(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new org.json.JSONObject("{}");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Context", e17, "addOrReplaceExtraData failed, extraData: " + jSONObject, new java.lang.Object[0]);
                return;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        org.json.JSONObject d17 = d();
        if (d17 != null && d17.length() > 0) {
            java.util.Iterator<java.lang.String> keys = d17.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject2.put(next, d17.get(next));
            }
        }
        g(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, jSONObject2);
    }

    public final android.content.Context c() {
        return (android.content.Context) this.f357551a.get();
    }

    public final org.json.JSONObject d() {
        org.json.JSONObject e17;
        java.lang.Object obj;
        if (!(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA.length() == 0)) {
            try {
                e17 = e();
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Context", e18, "getJsonParamByKey failed, key: extraData", new java.lang.Object[0]);
            }
            if (e17.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
                obj = e17.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
                if (obj == null && (obj instanceof org.json.JSONObject)) {
                    return (org.json.JSONObject) obj;
                }
                return null;
            }
        }
        obj = null;
        if (obj == null) {
        }
        return null;
    }

    public final org.json.JSONObject e() {
        try {
            bw5.h8 h8Var = this.f357552b;
            java.lang.String str = h8Var.f28116m[1] ? h8Var.f28110d : "";
            kotlin.jvm.internal.o.f(str, "getJsonParams(...)");
            if (!(str.length() > 0)) {
                return new org.json.JSONObject("{}");
            }
            bw5.h8 h8Var2 = this.f357552b;
            return new org.json.JSONObject(h8Var2.f28116m[1] ? h8Var2.f28110d : "");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Context", e17, "getJsonParam failed", new java.lang.Object[0]);
            return new org.json.JSONObject("{}");
        }
    }

    public final void f(org.json.JSONObject query) {
        kotlin.jvm.internal.o.g(query, "query");
        try {
            bw5.h8 h8Var = this.f357552b;
            if (!h8Var.f28116m[4]) {
                h8Var.f28113g = new bw5.d8();
                h8Var.f28116m[4] = true;
            }
            bw5.d8 b17 = this.f357552b.b();
            a(query, b17 != null ? b17.f26375f[1] ? b17.f26373d : "" : null);
            bw5.d8 b18 = this.f357552b.b();
            if (b18 == null) {
                return;
            }
            b18.f26373d = query.toString();
            b18.f26375f[1] = true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Context", e17, "liteAppAddOrReplaceQuery failed, extraParamJSONObject: " + query, new java.lang.Object[0]);
        }
    }

    public final void g(java.lang.String str, java.lang.Object obj) {
        if (str.length() == 0) {
            return;
        }
        try {
            org.json.JSONObject e17 = e();
            if (obj != null) {
                e17.put(str, obj);
            } else {
                e17.remove(str);
            }
            bw5.h8 h8Var = this.f357552b;
            h8Var.f28110d = e17.toString();
            h8Var.f28116m[1] = true;
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Context", e18, "updateJsonParamWithKey failed, key: " + str + ", value: " + obj, new java.lang.Object[0]);
        }
    }

    public final void h(org.json.JSONObject extraParam) {
        kotlin.jvm.internal.o.g(extraParam, "extraParam");
        try {
            bw5.h8 h8Var = this.f357552b;
            if (!h8Var.f28116m[3]) {
                h8Var.e(new bw5.g8());
            }
            bw5.g8 d17 = this.f357552b.d();
            a(extraParam, d17 != null ? d17.f27722r[1] ? d17.f27711d : "" : null);
            bw5.g8 d18 = this.f357552b.d();
            if (d18 == null) {
                return;
            }
            d18.f27711d = extraParam.toString();
            d18.f27722r[1] = true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Context", e17, "wxaAddOrReplaceExtraParamInfo failed, extraParamJSONObject: " + extraParam, new java.lang.Object[0]);
        }
    }
}
