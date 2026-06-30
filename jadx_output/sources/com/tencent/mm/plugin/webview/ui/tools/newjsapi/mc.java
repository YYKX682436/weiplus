package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/mc;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiSetWxPayTestInfo$RequestType;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes5.dex */
final class mc implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Collection collection;
        java.lang.String str;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiSetWxPayTestInfo$RequestType data = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiSetWxPayTestInfo$RequestType) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "SetWxPayTestInfoTask auto auth is empty");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
        java.lang.String str2 = data.f185920d;
        if (str2 != null && (str = data.f185921e) != null) {
            c17.l0(str, "", str2, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "set long and short, ipLong: " + str2 + "ipShort:" + str);
        }
        java.lang.String str3 = data.f185922f;
        if (str3 != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0("short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn") || !r26.n0.B("short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn", "|", false)) {
                com.tencent.mm.network.x2.c().k0("shshort.pay.weixin.qq.com", str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "setPay ip:" + str3 + "hosts:shshort.pay.weixin.qq.com");
            } else {
                java.util.List g17 = new r26.t("\\|").g("short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn", 0);
                if (!g17.isEmpty()) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = kz5.p0.f313996d;
                java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
                if (!com.tencent.mm.sdk.platformtools.t8.N0((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
                    if (!(strArr.length == 0)) {
                        for (java.lang.String str4 : strArr) {
                            com.tencent.mm.network.x2.c().k0(str4, str3);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetWxPayTestInfo", "setPay ip:" + str3 + "hosts:short.pay.weixin.qq.com|shshort.pay.weixin.qq.com|short.pay.wechatpay.cn|short.snspay.wechatpay.cn|short.mixpay.wechatpay.cn");
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCBoolean(true);
    }
}
