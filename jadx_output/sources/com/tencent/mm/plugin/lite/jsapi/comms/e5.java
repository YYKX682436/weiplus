package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public class e5 extends com.tencent.mm.plugin.lite.api.p {
    public android.graphics.Bitmap A(android.graphics.Bitmap bitmap, int i17, int i18, int i19, int i27, int i28) {
        int i29;
        int i37;
        int i38;
        int i39;
        com.tencent.mars.xlog.Log.i("ProcessImage", "cropImage x: %d, y: %d, width: %d, height: %d, degree: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("ProcessImage", "crop image fail, originImage is null");
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i47 = ((i28 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        if (i47 != 90) {
            if (i47 == 180) {
                i39 = width - (i17 + i19);
                i38 = height - (i18 + i27);
            } else if (i47 != 270) {
                i39 = i17;
                i38 = i18;
            } else {
                i39 = width - (i18 + i27);
                i38 = i17;
                i29 = i19;
                i37 = i27;
            }
            i37 = i19;
            i29 = i27;
        } else {
            i29 = i19;
            i37 = i27;
            i38 = height - (i17 + i19);
            i39 = i18;
        }
        int max = java.lang.Math.max(0, java.lang.Math.min(i39, width - 1));
        int max2 = java.lang.Math.max(0, java.lang.Math.min(i38, height - 1));
        if (max + i37 > width) {
            i37 = width - max;
        }
        if (max2 + i29 > height) {
            i29 = height - max2;
        }
        try {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (i47 != 0) {
                matrix.postRotate(i47);
            }
            com.tencent.mars.xlog.Log.i("ProcessImage", "realX: %d, realY: %d, realW: %d, realH: %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i29));
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Boolean.TRUE);
            aVar.c(matrix);
            aVar.c(java.lang.Integer.valueOf(i29));
            aVar.c(java.lang.Integer.valueOf(i37));
            aVar.c(java.lang.Integer.valueOf(max2));
            aVar.c(java.lang.Integer.valueOf(max));
            aVar.c(bitmap);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiProcessImage", com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, "(Landroid/graphics/Bitmap;IIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiProcessImage", com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, "(Landroid/graphics/Bitmap;IIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            return createBitmap;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ProcessImage", "create bitmap exception. %s", e17.toString());
            return null;
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int i17;
        org.json.JSONArray jSONArray;
        com.tencent.mars.xlog.Log.i("ProcessImage", "invoke processImage.");
        try {
            java.lang.String optString = jSONObject.optString("src");
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = this.f143442e;
            java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) g0Var).zj(cVar.f299025b, cVar.f299024a, optString);
            android.graphics.Bitmap c17 = com.tencent.mm.graphics.e.c(zj6);
            boolean z18 = true;
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("ProcessImage", "decode image fail. path: %s, data: %s", zj6, jSONObject.toString());
                this.f143442e.b("decode image fail");
                return;
            }
            int a17 = com.tencent.mm.sdk.platformtools.l.a(zj6);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("operations");
            android.graphics.Bitmap bitmap = null;
            if (optJSONArray != null) {
                int i18 = 0;
                while (i18 < optJSONArray.length()) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                    java.lang.String optString2 = jSONObject2.optString("type", "");
                    org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("params");
                    if (!optString2.equals("crop") || optJSONObject == null) {
                        i17 = i18;
                        jSONArray = optJSONArray;
                        if (!optString2.equals("resize") || optJSONObject == null) {
                            com.tencent.mars.xlog.Log.e("ProcessImage", "unknown or invalid operation type. data: %s", jSONObject.toString());
                            this.f143442e.b("unknown or invalid operation type");
                            return;
                        }
                    } else {
                        int optInt = optJSONObject.optInt("x", 0);
                        int optInt2 = optJSONObject.optInt("y", 0);
                        int optInt3 = optJSONObject.optInt("width", 0);
                        int optInt4 = optJSONObject.optInt("height", 0);
                        if (optInt < 0 || optInt2 < 0 || optInt3 <= 0 || optInt4 <= 0) {
                            i17 = i18;
                            jSONArray = optJSONArray;
                        } else {
                            i17 = i18;
                            jSONArray = optJSONArray;
                            bitmap = A(c17, optInt, optInt2, optInt3, optInt4, a17);
                            if (bitmap == null) {
                                com.tencent.mars.xlog.Log.e("ProcessImage", "crop image fail");
                                this.f143442e.b("crop image fail");
                                return;
                            }
                        }
                    }
                    i18 = i17 + 1;
                    optJSONArray = jSONArray;
                }
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("output");
            int optInt5 = optJSONObject2 != null ? optJSONObject2.optInt("quality", 100) : 100;
            java.lang.String str2 = com.tencent.mm.plugin.lite.logic.y2.g() + java.lang.String.format("%d_%d.jpeg", java.lang.Long.valueOf(this.f143442e.f299028e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            try {
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(str2, false);
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, optInt5, K);
                K.close();
            } catch (java.io.IOException unused) {
                z18 = false;
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.e("ProcessImage", "save image fail. path: %s", str2);
                this.f143442e.b("save image fail");
                return;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            q80.g0 g0Var2 = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar2 = this.f143442e;
            java.lang.String str3 = cVar2.f299025b;
            long j17 = cVar2.f299024a;
            ((com.tencent.mm.feature.lite.i) g0Var2).getClass();
            jSONObject3.put(dm.i4.COL_LOCALID, com.tencent.mm.plugin.lite.LiteAppCenter.generateLiteAppLocalId(j17, str3, str2));
            com.tencent.mars.xlog.Log.i("ProcessImage", "crop image success");
            this.f143442e.f(jSONObject3, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("ProcessImage", "process image exception: %s, data: %s", e17.toString(), jSONObject.toString());
            this.f143442e.b("process image json exception");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
