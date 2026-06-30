package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class x2 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f143823g = "";

    /* renamed from: h, reason: collision with root package name */
    public static final jm4.u5 f143824h;

    static {
        int i17 = jm4.w5.f300437d;
        jm4.u5 u5Var = (jm4.u5) urgen.ur_0025.UR_87ED.UR_1332();
        kotlin.jvm.internal.o.d(u5Var);
        f143824h = u5Var;
    }

    public static final java.lang.String A(com.tencent.mm.plugin.lite.jsapi.comms.x2 x2Var, bw5.rq0 rq0Var) {
        x2Var.getClass();
        int i17 = (int) ((rq0Var.f32656g * 255.0f) + 0.5f);
        java.lang.String format = java.lang.String.format("#%02X%02X%02X%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) ((rq0Var.f32653d * 255.0f) + 0.5f)), java.lang.Integer.valueOf((int) ((rq0Var.f32654e * 255.0f) + 0.5f)), java.lang.Integer.valueOf((int) ((rq0Var.f32655f * 255.0f) + 0.5f)), java.lang.Integer.valueOf(i17)}, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public final java.lang.String B(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return "#00000000";
        }
        if (bitmap.getWidth() * bitmap.getHeight() > 500000) {
            double width = 500000.0d / (bitmap.getWidth() * bitmap.getHeight());
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * width), (int) (bitmap.getHeight() * width), true);
        }
        int width2 = bitmap.getWidth() * bitmap.getHeight();
        int width3 = bitmap.getWidth();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < width3; i27++) {
            int height = bitmap.getHeight();
            for (int i28 = 0; i28 < height; i28++) {
                int pixel = bitmap.getPixel(i27, i28);
                i17 += android.graphics.Color.red(pixel);
                i18 += android.graphics.Color.green(pixel);
                i19 += android.graphics.Color.blue(pixel);
            }
        }
        java.lang.String format = java.lang.String.format("#%02X%02X%02XFF", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / width2), java.lang.Integer.valueOf(i18 / width2), java.lang.Integer.valueOf(i19 / width2)}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.graphics.Bitmap r7, java.lang.String r8) {
        /*
            r6 = this;
            kotlin.jvm.internal.h0 r0 = new kotlin.jvm.internal.h0
            r0.<init>()
            java.lang.String r1 = "#00000000"
            r0.f310123d = r1
            java.lang.String r1 = "color"
            if (r7 == 0) goto La9
            int r2 = r7.getWidth()
            if (r2 == 0) goto La9
            int r2 = r7.getHeight()
            if (r2 != 0) goto L1b
            goto La9
        L1b:
            boolean r2 = r7.isRecycled()
            java.lang.String r3 = "LiteAppJsApiGetThemeColorForImage"
            if (r2 == 0) goto L29
            java.lang.String r7 = "bitmap2ByteArray in bitmap is null"
            com.tencent.mars.xlog.Log.e(r3, r7)
            goto L3a
        L29:
            android.graphics.Bitmap$Config r2 = r7.getConfig()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r2 == r4) goto L3c
            java.lang.String r7 = "bitmap2ByteArray bitmap config invalid: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.e(r3, r7, r2)
        L3a:
            r7 = 0
            goto L81
        L3c:
            int r2 = r7.getByteCount()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            r7.copyPixelsToBuffer(r2)
            byte[] r3 = r2.array()
            int r2 = r2.arrayOffset()
            if (r2 <= 0) goto L5d
            kotlin.jvm.internal.o.d(r3)
            int r4 = r3.length
            e06.k r2 = e06.p.m(r2, r4)
            byte[] r3 = kz5.z.o0(r3, r2)
        L5d:
            bw5.tq0 r2 = new bw5.tq0
            r2.<init>()
            int r4 = r7.getWidth()
            r2.f33580d = r4
            boolean[] r4 = r2.f33583g
            r5 = 1
            r4[r5] = r5
            int r7 = r7.getHeight()
            r2.f33581e = r7
            r7 = 2
            r4[r7] = r5
            r7 = 4
            r2.f33582f = r7
            r7 = 3
            r4[r7] = r5
            jz5.l r7 = new jz5.l
            r7.<init>(r3, r2)
        L81:
            if (r7 != 0) goto L94
            com.tencent.mm.plugin.lite.api.o r7 = r6.f143443f
            java.lang.Object r8 = r0.f310123d
            jz5.l r0 = new jz5.l
            r0.<init>(r1, r8)
            java.util.Map r8 = kz5.b1.e(r0)
            r7.b(r8)
            return
        L94:
            java.lang.Object r1 = r7.f302833d
            byte[] r1 = (byte[]) r1
            java.lang.Object r7 = r7.f302834e
            bw5.tq0 r7 = (bw5.tq0) r7
            com.tencent.mm.plugin.lite.jsapi.comms.v2 r2 = new com.tencent.mm.plugin.lite.jsapi.comms.v2
            r2.<init>(r6, r0, r8)
            jm4.u5 r8 = com.tencent.mm.plugin.lite.jsapi.comms.x2.f143824h
            jm4.w5 r8 = (jm4.w5) r8
            r8.a(r1, r7, r2)
            return
        La9:
            com.tencent.mm.plugin.lite.api.o r7 = r6.f143443f
            java.lang.Object r8 = r0.f310123d
            jz5.l r0 = new jz5.l
            r0.<init>(r1, r8)
            java.util.Map r8 = kz5.b1.e(r0)
            r7.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.x2.C(android.graphics.Bitmap, java.lang.String):void");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("fail_no param");
            return;
        }
        f143823g = "";
        java.lang.String optString = jSONObject.optString("type");
        boolean z18 = true;
        if (!(optString == null || optString.length() == 0)) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiGetThemeColorForImage", "Invoke type:%s", optString);
            if (kotlin.jvm.internal.o.b(optString, "ting")) {
                java.lang.String optString2 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                f143823g = optString2;
            }
        }
        java.lang.String optString3 = jSONObject.optString(dm.i4.COL_LOCALID);
        if (!(optString3 == null || optString3.length() == 0)) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiGetThemeColorForImage", "Invoke localId:%s", optString3);
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = this.f143442e;
            java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) g0Var).zj(cVar.f299025b, cVar.f299024a, optString3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(zj6)) {
                this.f143443f.a("path or localID not exist");
                com.tencent.mars.xlog.Log.e("LiteAppJsApiGetThemeColorForImage", "cannot find localPath");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(zj6);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetThemeColorForImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetThemeColorForImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            if (!(f143823g.length() > 0)) {
                java.lang.String B = B(decodeFile);
                com.tencent.mars.xlog.Log.i("LiteAppJsApiGetThemeColorForImage", "color:%s", B);
                this.f143443f.b(kz5.b1.e(new jz5.l("color", B)));
                return;
            }
            C(decodeFile, f143823g);
        }
        java.lang.String optString4 = jSONObject.optString("url");
        if (optString4 != null && optString4.length() != 0) {
            z18 = false;
        }
        if (z18) {
            this.f143443f.a("fail_no url");
        } else {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiGetThemeColorForImage", "Invoke url:%s", optString4);
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString4, new com.tencent.mm.plugin.lite.jsapi.comms.w2(this));
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
