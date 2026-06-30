package qe;

/* loaded from: classes7.dex */
public final class x extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "responseClientRequest";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        if (jSONObject == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        int optInt = jSONObject.optInt(dm.i4.COL_ID, 0);
        boolean optBoolean = jSONObject.optBoolean("support");
        com.tencent.mars.xlog.Log.i("Luggage.WXA.JsApiResponseClientRequest", "invoke requestId:" + optInt + ", support:" + optBoolean);
        xh1.g a17 = xh1.g.f454507m.a(yVar);
        java.lang.Object opt = jSONObject.opt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String str4 = a17.f454510e;
        com.tencent.mars.xlog.Log.i(str4, "handleLibServerResponse(requestId:" + optInt + ", support:" + optBoolean + ')');
        if (optBoolean) {
            xh1.b bVar = (xh1.b) a17.f454513h.remove(java.lang.Integer.valueOf(optInt));
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e(str4, "handleLibServerResponse supported but missing mario for requestId:" + optInt);
            } else if (opt instanceof java.nio.ByteBuffer) {
                try {
                    java.lang.Object newInstance = bVar.f454490b.newInstance();
                    kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                    com.tencent.mm.protobuf.f parseFrom = ((r45.js5) newInstance).parseFrom(ik1.f.a((java.nio.ByteBuffer) opt));
                    kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                    ((kotlinx.coroutines.r) bVar.f454489a).resumeWith(kotlin.Result.m521constructorimpl((r45.js5) parseFrom));
                    xh1.f fVar = a17.f454514i;
                    fVar.getClass();
                    kotlin.jvm.internal.o.e(java.lang.Integer.valueOf(optInt), "null cannot be cast to non-null type kotlin.Any");
                    fVar.removeMessages(fVar.f454505b, java.lang.Integer.valueOf(optInt));
                    com.tencent.mars.xlog.Log.i(str4, "handleLibServerResponse succeed for requestId:" + optInt);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e(str4, "handleLibServerResponse succeed but parse data failed for requestId:" + optInt + ", exception:" + e18);
                }
            } else {
                com.tencent.mars.xlog.Log.e(str4, "handleLibServerResponse succeed but responded data(" + opt + ") invalid for requestId:" + optInt);
            }
        } else {
            a17.b(optInt);
        }
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        yVar.a(i17, u(str2, jSONObject3));
    }
}
