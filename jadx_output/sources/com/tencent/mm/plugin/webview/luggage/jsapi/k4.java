package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class k4 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.p4 f182381a;

    public k4(com.tencent.mm.plugin.webview.luggage.jsapi.p4 p4Var) {
        this.f182381a = p4Var;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.webview.luggage.jsapi.p4 p4Var = this.f182381a;
        if (!booleanValue) {
            p4Var.f182435d.c("share fail:system permission denied", null);
            return;
        }
        java.lang.String optString = p4Var.f182435d.f406597b.f344506c.optString("base64DataImg");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(optString);
        sd.b bVar = p4Var.f182435d;
        com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var = p4Var.f182436e;
        if (!K0) {
            byte[] decode = android.util.Base64.decode(optString, 2);
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent$1$1", "accept", "(Ljava/lang/Boolean;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent$1$1", "accept", "(Ljava/lang/Boolean;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            bVar.f406597b.f344506c.remove("base64DataImg");
            j4Var.f182361f = j4Var.m("", decodeByteArray);
            try {
                bVar.f406597b.f344506c.put("imgPath", j4Var.f182361f);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "err:" + e17.getMessage());
            }
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.j4.f(j4Var, bVar);
    }
}
