package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class m3 extends com.tencent.mm.plugin.lite.api.p {
    public java.lang.String A(java.lang.String str) {
        try {
            java.net.URI uri = new java.net.URI(str);
            java.lang.String fragment = uri.getFragment();
            return new java.net.URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), (fragment == null || fragment.isEmpty()) ? "wechat_pay" : fragment.concat("&wechat_pay")).toString();
        } catch (java.net.URISyntaxException e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiLogin", "url parse error, URISyntaxException: ", e17);
            return str;
        }
    }

    public boolean B(java.lang.String str) {
        try {
            java.lang.String fragment = new java.net.URI(str).getFragment();
            if (fragment != null) {
                for (java.lang.String str2 : fragment.split("&")) {
                    if (str2.equals("wechat_pay")) {
                        com.tencent.mars.xlog.Log.w("LiteAppJsApiLogin", "url has pay fragment");
                        return true;
                    }
                }
            }
            return false;
        } catch (java.net.URISyntaxException e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiLogin", "url parse error, URISyntaxException: ", e17);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r20, org.json.JSONObject r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.m3.a(java.lang.String, org.json.JSONObject, boolean):void");
    }
}
