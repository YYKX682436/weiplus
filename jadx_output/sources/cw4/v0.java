package cw4;

@j95.b
/* loaded from: classes8.dex */
public class v0 extends i95.w implements qk.j9 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f224286d;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f224286d = hashSet;
        hashSet.add("preVerifyJSAPI");
        hashSet.add("openUrlWithExtraWebview");
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.NAME);
        hashSet.add("launchApplication");
        hashSet.add("getBrandWCPayRequest");
        hashSet.add("geoLocation");
        hashSet.add(com.google.android.gms.common.Scopes.PROFILE);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.pc.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.NAME);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.NAME);
        hashSet.add("addContact");
        hashSet.add("quicklyAddBrandContact");
        hashSet.add("requestBindPhoneNumber");
        hashSet.add("openWeApp");
        hashSet.add("checkJsApi");
        hashSet.add(be1.z.NAME);
        hashSet.add("launchAppByScheme");
        hashSet.add("jumpToBizProfile");
        hashSet.add("openCustomerServiceChat");
        hashSet.add("showOpenIMContactProfile");
    }

    public java.lang.String wi(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse == null || !com.tencent.mm.sdk.platformtools.t8.D0(parse.getHost(), a17)) {
            return null;
        }
        java.lang.String queryParameter = parse.getQueryParameter("__biz");
        if (queryParameter == null) {
            queryParameter = "";
        }
        java.lang.String queryParameter2 = parse.getQueryParameter("mid");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        java.lang.String queryParameter3 = parse.getQueryParameter("idx");
        java.lang.String str2 = queryParameter3 != null ? queryParameter3 : "";
        if (queryParameter.length() <= 0 || queryParameter2.length() <= 0 || str2.length() <= 0) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.t8.z1("id://local/i.html?__biz=%s&mid=%s&idx=%s", queryParameter, queryParameter2, str2);
    }
}
