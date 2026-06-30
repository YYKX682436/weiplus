package vb1;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 373;
    public static final java.lang.String NAME = "canvasPutImageData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str = "MicroMsg.JsApiCanvasPutImageData";
        try {
            int i18 = jSONObject.getInt("canvasId");
            com.tencent.mm.plugin.appbrand.jsapi.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
            if (Q == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasPutImageData", "invoke JsApi canvasPutImageData failed, component view is null.");
                lVar.a(i17, o("fail:page is null"));
                return;
            }
            android.view.View o17 = ((com.tencent.mm.plugin.appbrand.page.ia) Q.M(jSONObject.optBoolean("independent", false))).o(i18);
            if (o17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasPutImageData", "view(%s) is null.", java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:view is null"));
                return;
            }
            if (!(o17 instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasPutImageData", "the viewId is not a canvas(%s).", java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:illegal view type"));
                return;
            }
            android.view.KeyEvent.Callback callback = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) o17).d(android.view.View.class);
            if (!(callback instanceof h91.b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasPutImageData", "the view is not a instance of CanvasView.(%s)", java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:illegal view type"));
                return;
            }
            float f17 = ik1.w.f();
            int optInt = jSONObject.optInt("x");
            int optInt2 = jSONObject.optInt("y");
            int optInt3 = jSONObject.optInt("width");
            int optInt4 = jSONObject.optInt("height");
            java.lang.Math.round(optInt * f17);
            java.lang.Math.round(optInt2 * f17);
            java.lang.Math.round(optInt3 * f17);
            java.lang.Math.round(optInt4 * f17);
            if (optInt3 == 0 || optInt4 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasPutImageData", "width(%s) or height(%s) is 0.(%s)", java.lang.Integer.valueOf(optInt3), java.lang.Integer.valueOf(optInt4), java.lang.Integer.valueOf(i18));
                lVar.a(i17, o("fail:width or height is 0"));
                return;
            }
            if (optInt3 < 0) {
                optInt += optInt3;
                optInt3 = -optInt3;
            }
            if (optInt4 < 0) {
                optInt2 += optInt4;
                optInt4 = -optInt4;
            }
            try {
                java.lang.Object obj = jSONObject.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (!(obj instanceof java.nio.ByteBuffer)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasPutImageData", "get data failed, value is not a ByteBuffer");
                    lVar.a(i17, o("fail:illegal data"));
                    return;
                }
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                byte[] a17 = ik1.f.a(byteBuffer);
                int length = a17.length / 4;
                int[] iArr = new int[length];
                int i19 = 0;
                int i27 = 0;
                while (i19 < length) {
                    int i28 = i27 + 1;
                    int i29 = (a17[i27] & 255) << 16;
                    int i37 = i28 + 1;
                    int i38 = length;
                    int i39 = ((a17[i28] & 255) << 8) | i29;
                    int i47 = i37 + 1;
                    java.lang.String str2 = str;
                    int i48 = (a17[i37] & 255) | i39;
                    i27 = i47 + 1;
                    iArr[i19] = i48 | ((a17[i47] & 255) << 24);
                    i19++;
                    length = i38;
                    str = str2;
                }
                java.lang.String str3 = str;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(optInt);
                    jSONArray2.put(optInt2);
                    jSONArray2.put(optInt3);
                    jSONArray2.put(optInt4);
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(optInt4));
                    arrayList.add(java.lang.Integer.valueOf(optInt3));
                    arrayList.add(iArr);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasPutImageData", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((int[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(3));
                    yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasPutImageData", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    jSONArray2.put(createBitmap);
                    jSONObject2.put(ya.b.METHOD, "__setPixels");
                    jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray2);
                    jSONArray.put(jSONObject2);
                    h91.b bVar = (h91.b) callback;
                    bVar.e(jSONArray, new vb1.f(this, lVar, i17));
                    bVar.a();
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.w(str3, "put json value error : %s", e17);
                    lVar.a(i17, o("fail:build action JSON error"));
                }
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasPutImageData", "get data failed, %s", android.util.Log.getStackTraceString(e18));
                lVar.a(i17, o("fail:missing data"));
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasPutImageData", "get canvas id failed, %s", android.util.Log.getStackTraceString(e19));
            lVar.a(i17, o("fail:illegal canvasId"));
        }
    }
}
