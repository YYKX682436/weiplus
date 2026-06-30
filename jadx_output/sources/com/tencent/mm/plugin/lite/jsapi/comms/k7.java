package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/k7;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class k7 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f143640h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f143641i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f143639g = true;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f143642m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f143643n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f143644o = "";

    public final java.lang.String A(java.lang.String str, boolean z17) {
        java.lang.String str2 = str;
        this.f143641i = false;
        if (str2 == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiShareMediaToTimeline", "uri is empty");
            return null;
        }
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str2)) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = this.f143442e;
            java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) g0Var).zj(cVar.f299025b, cVar.f299024a, str2);
            kotlin.jvm.internal.o.d(zj6);
            if (!(zj6.length() == 0)) {
                return zj6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiShareMediaToTimeline", "getFilePathByBothLocalId return empty result");
            return null;
        }
        if (r26.i0.y(str2, "http", false)) {
            this.f143641i = true;
            if (z17) {
                ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str2, new com.tencent.mm.plugin.lite.jsapi.comms.h7(str2, this));
            } else {
                com.tencent.mm.plugin.lite.jsapi.comms.d.a(this.f143442e.f299025b, str2, new com.tencent.mm.plugin.lite.jsapi.comms.i7(this));
            }
            return null;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiShareMediaToTimeline", "unsupported uri: ".concat(str2));
            return null;
        }
        int L = r26.n0.L(str, ";base64,", 0, false, 6, null);
        if (L != -1) {
            str2 = str2.substring(L + 8);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        try {
            byte[] decode = android.util.Base64.decode(str2, 2);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiShareMediaToTimeline", "loadBase64Image", "(Ljava/lang/String;)Ljava/lang/String;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiShareMediaToTimeline", "loadBase64Image", "(Ljava/lang/String;)Ljava/lang/String;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "bitmap decode error");
                return null;
            }
            java.lang.String str3 = this.f143642m + ("MMImage_" + com.tencent.mm.sdk.platformtools.w2.a(str2) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
            if (ra3.h0.c(decodeByteArray, str3)) {
                ra3.h0.d(str3, decode);
                return str3;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "saveBitmapToFile fail, filePath: " + str3);
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "error base64, decode failed %s", e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:28|(3:29|30|31)|(5:32|33|34|35|36)|(1:38)(2:49|(6:51|52|53|54|41|(2:43|44)(1:45))(1:57))|39|40|41|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.k7.B(java.lang.String, java.lang.String):void");
    }

    public final void C(java.lang.String str) {
        this.f143644o = str;
        boolean z17 = true;
        java.lang.String A = A(this.f143643n, true);
        if (A != null && A.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            B(str, A);
        } else if (this.f143641i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "wait thumb cdn download ...");
        } else {
            this.f143443f.a("load thumb media fail");
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("params is null");
            return;
        }
        java.lang.String f17 = com.tencent.mm.plugin.lite.logic.y2.f(str, "bundle", null);
        kotlin.jvm.internal.o.f(f17, "getLiteAppTempPath(...)");
        this.f143642m = f17;
        java.lang.String optString = jSONObject.optString("type", "");
        if (!optString.equals("image") && !optString.equals("video")) {
            this.f143443f.a("only support image | video");
        }
        this.f143639g = optString.equals("image");
        java.lang.String optString2 = jSONObject.optString("thumbUri", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f143643n = optString2;
        this.f143640h = jSONObject.optJSONObject("tailInfo");
        java.lang.String A = A(jSONObject.optString("uri"), this.f143639g);
        if (A == null || A.length() == 0) {
            if (this.f143641i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "wait cdn download ...");
                return;
            } else {
                this.f143443f.a("load media fail");
                return;
            }
        }
        if (!this.f143639g) {
            if (!(this.f143643n.length() == 0)) {
                C(A);
                return;
            }
        }
        B(A, "");
    }
}
