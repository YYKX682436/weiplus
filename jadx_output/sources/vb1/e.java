package vb1;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 372;
    public static final java.lang.String NAME = "canvasGetImageData";

    public static java.util.Map C(int[] iArr, int i17, int i18) {
        byte[] bArr = new byte[iArr.length * 4];
        int i19 = 0;
        for (int i27 : iArr) {
            int i28 = i19 + 1;
            bArr[i19] = (byte) ((i27 >> 16) & 255);
            int i29 = i28 + 1;
            bArr[i28] = (byte) ((i27 >> 8) & 255);
            int i37 = i29 + 1;
            bArr[i29] = (byte) (i27 & 255);
            i19 = i37 + 1;
            bArr[i37] = (byte) ((i27 >> 24) & 255);
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, wrap);
        hashMap.put("width", java.lang.Integer.valueOf(i17));
        hashMap.put("height", java.lang.Integer.valueOf(i18));
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        int i19;
        android.view.View view;
        int i27;
        int i28;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        int i29 = i17;
        try {
            int i37 = jSONObject.getInt("canvasId");
            com.tencent.mm.plugin.appbrand.jsapi.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
            if (Q == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasGetImageData", "invoke JsApi canvasGetImageData failed, component view is null.");
                lVar.a(i29, o("fail:page is null"));
                return;
            }
            android.view.View o17 = ((com.tencent.mm.plugin.appbrand.page.ia) Q.M(jSONObject.optBoolean("independent", false))).o(i37);
            if (o17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasGetImageData", "view(%s) is null.", java.lang.Integer.valueOf(i37));
                lVar.a(i29, o("fail:view is null"));
                return;
            }
            if (!(o17 instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasGetImageData", "the viewId is not a canvas(%s).", java.lang.Integer.valueOf(i37));
                lVar.a(i29, o("fail:illegal view type"));
                return;
            }
            android.view.View view2 = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) o17).d(android.view.View.class);
            if (!(view2 instanceof h91.b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasGetImageData", "the view is not a instance of CanvasView.(%s)", java.lang.Integer.valueOf(i37));
                lVar.a(i29, o("fail:illegal view type"));
                return;
            }
            float f17 = ik1.w.f();
            int optInt = jSONObject.optInt("x");
            int optInt2 = jSONObject.optInt("y");
            int optInt3 = jSONObject.optInt("width");
            int optInt4 = jSONObject.optInt("height");
            if (optInt3 == 0 || optInt4 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasGetImageData", "width(%s) or height(%s) is 0.(%s)", java.lang.Integer.valueOf(optInt3), java.lang.Integer.valueOf(optInt4), java.lang.Integer.valueOf(i37));
                lVar.a(i29, o("fail:width or height is 0"));
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
            int round = java.lang.Math.round(optInt * f17);
            int round2 = java.lang.Math.round(optInt2 * f17);
            int round3 = java.lang.Math.round(optInt3 * f17);
            int round4 = java.lang.Math.round(optInt4 * f17);
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = view2.getMeasuredHeight();
            if (round < 0) {
                i18 = optInt;
                i19 = 0;
            } else if (round >= measuredWidth) {
                lVar.a(i29, w(lVar, "ok", C(new int[optInt3 * optInt4], optInt3, optInt4)));
                return;
            } else {
                i18 = optInt;
                i19 = round;
            }
            if (round2 < 0) {
                view = view2;
                i27 = optInt2;
                i28 = 0;
            } else if (round2 >= measuredHeight) {
                lVar.a(i29, w(lVar, "ok", C(new int[optInt3 * optInt4], optInt3, optInt4)));
                return;
            } else {
                view = view2;
                i27 = optInt2;
                i28 = round2;
            }
            int i38 = round + round3;
            if (i38 > measuredWidth) {
                round3 = measuredWidth - i19;
            } else if (i38 <= 0) {
                lVar.a(i29, w(lVar, "ok", C(new int[optInt3 * optInt4], optInt3, optInt4)));
                return;
            } else if (round < 0) {
                round3 = i38;
            }
            int i39 = round2 + round4;
            if (i39 > measuredHeight) {
                round4 = measuredHeight - i28;
            } else if (i39 <= 0) {
                lVar.a(i29, w(lVar, "ok", C(new int[optInt3 * optInt4], optInt3, optInt4)));
                return;
            } else if (round2 < 0) {
                round4 = i39;
            }
            int round5 = java.lang.Math.round(i19 / f17);
            int round6 = java.lang.Math.round(i28 / f17);
            int round7 = java.lang.Math.round(round3 / f17);
            int round8 = java.lang.Math.round(round4 / f17);
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(round4));
                arrayList.add(java.lang.Integer.valueOf(round3));
                obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasGetImageData", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/canvas/JsApiCanvasGetImageData", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;Lorg/json/JSONObject;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                z81.l lVar2 = new z81.l(createBitmap);
                lVar2.save();
                lVar2.translate(-i19, -i28);
                ((h91.b) view).d(lVar2);
                lVar2.restore();
                int[] iArr = new int[optInt3 * optInt4];
                try {
                    android.graphics.Bitmap.createScaledBitmap(createBitmap, round7, round8, false).getPixels(iArr, ((round6 - i27) * optInt3) + (round5 - i18), optInt3, 0, 0, round7, round8);
                    lVar.a(i17, w(lVar, "ok", C(iArr, optInt3, optInt4)));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasGetImageData", "getPixels failed, viewId(%s). Exception: %s", java.lang.Integer.valueOf(i37), e18);
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasGetImageData", "getPixels failed. finalXDp:%d finalYDp:%d finalWidthDp:%d finalHeightDp:%d wDp:%d data:%s", java.lang.Integer.valueOf(round5), java.lang.Integer.valueOf(round6), java.lang.Integer.valueOf(round7), java.lang.Integer.valueOf(round8), java.lang.Integer.valueOf(optInt3), jSONObject);
                    lVar.a(i17, o("fail: getPixels failed"));
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                i29 = i17;
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCanvasGetImageData", "create bitmap failed, viewId(%s). Exception : %s", java.lang.Integer.valueOf(i37), e);
                lVar.a(i29, o("fail:create bitmap failed"));
            }
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCanvasGetImageData", "get canvas id failed, %s", android.util.Log.getStackTraceString(e27));
            lVar.a(i29, o("fail:illegal canvasId"));
        }
    }
}
