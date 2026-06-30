package lu4;

/* loaded from: classes7.dex */
public final class v extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(lu4.w context) {
        super("wxPrefetcherClient", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getId() {
        return ((lu4.w) this.f321430b).getId();
    }

    @android.webkit.JavascriptInterface
    public final int getUserHash() {
        return java.lang.Math.abs((gm0.m.i() + '-' + wo.w0.g(true)).hashCode() % 10000);
    }

    @android.webkit.JavascriptInterface
    public final void request(java.lang.String requestUrl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String callback) {
        kotlin.jvm.internal.o.g(requestUrl, "requestUrl");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (str == null) {
            str = "GET";
        }
        h0Var.f310123d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str4 = next;
                    java.lang.String optString = jSONObject.optString(str4);
                    kotlin.jvm.internal.o.d(optString);
                    hashMap.put(str4, optString);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mm.sdk.platformtools.Log.c(this.f321431c, "", e17);
        }
        ((ku5.t0) ku5.t0.f312615d).h(new lu4.u(h0Var, requestUrl, hashMap, str3, this, callback), "WxPrefetcherRequest");
    }

    @android.webkit.JavascriptInterface
    public final void setMinBizPkgVersion(int i17) {
        ((lu4.w) this.f321430b).m(i17);
    }
}
