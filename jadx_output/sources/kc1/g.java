package kc1;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc1.f f306296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f306297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f306299g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kc1.h f306300h;

    public g(kc1.h hVar, kc1.f fVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f306300h = hVar;
        this.f306296d = fVar;
        this.f306297e = e9Var;
        this.f306298f = i17;
        this.f306299g = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        kc1.c cVar;
        java.nio.ByteBuffer byteBuffer;
        java.lang.String str;
        kc1.h hVar;
        int i17;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var;
        java.util.HashMap hashMap;
        java.nio.ByteBuffer byteBuffer2;
        java.util.List list;
        kc1.c cVar2;
        java.util.List list2;
        org.json.JSONObject jSONObject;
        java.lang.String str3;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap2;
        java.util.List list3;
        java.lang.String str4;
        java.util.ArrayList arrayList2;
        android.graphics.PointF[] pointFArr;
        java.util.HashMap hashMap3 = new java.util.HashMap(1);
        kc1.f fVar = this.f306296d;
        com.tencent.mm.xeffect.FaceTracker faceTracker = fVar.f306293a;
        kc1.h hVar2 = this.f306300h;
        int i18 = this.f306298f;
        java.lang.String str5 = "errCode";
        com.tencent.mm.plugin.appbrand.e9 e9Var2 = this.f306297e;
        if (faceTracker == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiFaceDetect", "hy: not prepared effect!");
            hashMap3.put("errCode", java.lang.Integer.valueOf(fVar.a(kc1.c.ResultInitFail)));
            e9Var2.a(i18, hVar2.p("fail: not started yet", hashMap3));
            return;
        }
        org.json.JSONObject jSONObject2 = this.f306299g;
        boolean has = jSONObject2.has("frameBuffer");
        kc1.c cVar3 = kc1.c.ResultFaceDetectedFail;
        if (!has || !jSONObject2.has("width") || !jSONObject2.has("height")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiFaceDetect", "hy: not given framebuffer");
            hashMap3.put("errCode", java.lang.Integer.valueOf(fVar.a(cVar3)));
            e9Var2.a(i18, hVar2.p("fail: not given framebuffer or size", hashMap3));
            return;
        }
        java.nio.ByteBuffer byteBuffer3 = (java.nio.ByteBuffer) jSONObject2.opt("frameBuffer");
        int optInt = jSONObject2.optInt("width");
        int optInt2 = jSONObject2.optInt("height");
        if (byteBuffer3 == null || optInt < 0 || optInt2 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiFaceDetect", "hy: invalid params when detect");
            hashMap3.put("errCode", java.lang.Integer.valueOf(fVar.a(cVar3)));
            e9Var2.a(i18, hVar2.p("fail: not valid params when detect frame buffer", hashMap3));
            return;
        }
        java.util.HashMap hashMap4 = new java.util.HashMap();
        kc1.f fVar2 = kc1.f.f306292d;
        kc1.c cVar4 = kc1.c.ResultOK;
        if (fVar2 == null || fVar2.f306293a == null) {
            cVar = cVar4;
            byteBuffer = byteBuffer3;
            str = "MicroMsg.JsApiFaceDetect";
            hVar = hVar2;
            i17 = i18;
            str2 = "errCode";
            e9Var = e9Var2;
            hashMap = hashMap4;
            hashMap.put(str2, java.lang.Integer.valueOf(fVar.a(kc1.c.ResultNotInit)));
        } else {
            if (byteBuffer3.isDirect()) {
                byteBuffer2 = byteBuffer3;
            } else {
                byteBuffer2 = com.tencent.mm.plugin.appbrand.utils.v3.a(byteBuffer3).order(java.nio.ByteOrder.nativeOrder());
                byteBuffer2.position(0);
            }
            int b17 = kc1.f.f306292d.f306293a.b(byteBuffer2, optInt, optInt2);
            java.util.List f17 = kc1.f.f306292d.f306293a.f();
            if (b17 == 0) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) f17;
                if (arrayList3.size() > 0) {
                    hashMap4.put("errCode", java.lang.Integer.valueOf(fVar.a(cVar4)));
                    java.util.ArrayList arrayList4 = fVar.f306295c;
                    arrayList4.clear();
                    java.lang.String str6 = "enablePoint";
                    java.util.List c17 = jSONObject2.optBoolean("enablePoint") ? kc1.f.f306292d.f306293a.c() : null;
                    java.lang.String str7 = "enableConf";
                    if (jSONObject2.optBoolean("enableConf")) {
                        list = kc1.f.f306292d.f306293a.e();
                        str = "MicroMsg.JsApiFaceDetect";
                    } else {
                        str = "MicroMsg.JsApiFaceDetect";
                        list = null;
                    }
                    java.lang.String str8 = "enableAngle";
                    if (jSONObject2.optBoolean("enableAngle")) {
                        cVar2 = cVar4;
                        list2 = kc1.f.f306292d.f306293a.d();
                    } else {
                        cVar2 = cVar4;
                        list2 = null;
                    }
                    java.nio.ByteBuffer byteBuffer4 = byteBuffer3;
                    i17 = i18;
                    int i19 = 0;
                    while (true) {
                        hVar = hVar2;
                        if (i19 >= arrayList3.size()) {
                            jSONObject = jSONObject2;
                            str3 = str5;
                            e9Var = e9Var2;
                            cVar = cVar2;
                            byteBuffer = byteBuffer4;
                            hashMap = hashMap4;
                            arrayList = arrayList4;
                            break;
                        }
                        java.util.ArrayList arrayList5 = arrayList4;
                        kc1.d dVar = new kc1.d(fVar, (android.graphics.RectF) arrayList3.get(i19));
                        if (!jSONObject2.optBoolean(str6) || com.tencent.mm.sdk.platformtools.t8.L0(c17) || c17.size() <= i19 || (pointFArr = (android.graphics.PointF[]) c17.get(i19)) == null) {
                            hashMap2 = hashMap4;
                            list3 = c17;
                            str4 = str6;
                            str3 = str5;
                            e9Var = e9Var2;
                            arrayList2 = null;
                        } else {
                            list3 = c17;
                            str4 = str6;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList(pointFArr.length);
                            int length = pointFArr.length;
                            e9Var = e9Var2;
                            int i27 = 0;
                            while (i27 < length) {
                                int i28 = length;
                                android.graphics.PointF pointF = pointFArr[i27];
                                android.graphics.PointF[] pointFArr2 = pointFArr;
                                java.util.HashMap hashMap5 = new java.util.HashMap(2);
                                hashMap5.put("x", java.lang.Float.valueOf(pointF.x));
                                hashMap5.put("y", java.lang.Float.valueOf(pointF.y));
                                arrayList6.add(hashMap5);
                                i27++;
                                length = i28;
                                pointFArr = pointFArr2;
                                str5 = str5;
                                hashMap4 = hashMap4;
                            }
                            hashMap2 = hashMap4;
                            str3 = str5;
                            arrayList2 = arrayList6;
                        }
                        kc1.b bVar = (!jSONObject2.optBoolean(str7) || com.tencent.mm.sdk.platformtools.t8.L0(list) || list.size() <= i19) ? null : new kc1.b(fVar, (float[]) list.get(i19));
                        kc1.a aVar = (!jSONObject2.optBoolean(str8) || com.tencent.mm.sdk.platformtools.t8.L0(list2) || list2.size() <= i19) ? null : new kc1.a(fVar, (tq5.a) list2.get(i19));
                        float centerX = ((android.graphics.RectF) arrayList3.get(i19)).centerX();
                        float centerY = ((android.graphics.RectF) arrayList3.get(i19)).centerY();
                        java.lang.String str9 = str7;
                        java.util.List list4 = list;
                        java.util.ArrayList arrayList7 = arrayList3;
                        cVar = cVar2;
                        java.util.List list5 = list2;
                        byteBuffer = byteBuffer4;
                        java.util.ArrayList arrayList8 = arrayList2;
                        arrayList = arrayList5;
                        java.lang.String str10 = str8;
                        jSONObject = jSONObject2;
                        java.util.HashMap a17 = new kc1.e(fVar, centerX, centerY, dVar, arrayList8, bVar, aVar).a();
                        if (!jSONObject.optBoolean("enableMultiFace")) {
                            hashMap = hashMap2;
                            hashMap.putAll(a17);
                            break;
                        }
                        arrayList.add(a17);
                        i19++;
                        arrayList4 = arrayList;
                        jSONObject2 = jSONObject;
                        hashMap4 = hashMap2;
                        list = list4;
                        list2 = list5;
                        str8 = str10;
                        hVar2 = hVar;
                        c17 = list3;
                        str6 = str4;
                        e9Var2 = e9Var;
                        str7 = str9;
                        str5 = str3;
                        byteBuffer4 = byteBuffer;
                        cVar2 = cVar;
                        arrayList3 = arrayList7;
                    }
                    if (jSONObject.optBoolean("enableMultiFace")) {
                        hashMap.put("faceInfo", arrayList);
                    }
                    str2 = str3;
                }
            }
            cVar = cVar4;
            byteBuffer = byteBuffer3;
            str = "MicroMsg.JsApiFaceDetect";
            hVar = hVar2;
            i17 = i18;
            e9Var = e9Var2;
            hashMap = hashMap4;
            hashMap.putAll(new kc1.e(fVar, -1.0f, -1.0f, new kc1.d(fVar, -1.0f, -1.0f, 0.0f, 0.0f), null, null, null).a());
            str2 = "errCode";
            hashMap.put(str2, java.lang.Integer.valueOf(fVar.a(cVar3)));
        }
        if (byteBuffer.isDirect()) {
            com.tencent.mm.plugin.appbrand.jsruntime.v vVar = (com.tencent.mm.plugin.appbrand.jsruntime.v) e9Var.getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class);
            if (vVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NativeBufferUtil", "hy: no buffer addon support");
            } else {
                vVar.releaseDirectByteBuffer(byteBuffer);
            }
        }
        if (java.util.Objects.equals(hashMap.get(str2), java.lang.Integer.valueOf(fVar.a(cVar)))) {
            e9Var.a(i17, hVar.p("ok", hashMap));
        } else {
            com.tencent.mars.xlog.Log.w(str, "hy: face detect failed");
            e9Var.a(i17, hVar.p("fail: face detect failed", hashMap));
        }
    }
}
