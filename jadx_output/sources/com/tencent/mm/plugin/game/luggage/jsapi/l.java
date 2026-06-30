package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f139704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f139705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.m f139706f;

    public l(com.tencent.mm.plugin.game.luggage.jsapi.m mVar, java.util.ArrayList arrayList, android.content.Intent intent) {
        this.f139706f = mVar;
        this.f139704d = arrayList;
        this.f139705e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.jsapi.o oVar = this.f139706f.f139713f;
        java.lang.String str = com.tencent.mm.plugin.game.luggage.jsapi.o.f139718g;
        oVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f139704d.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = com.tencent.mm.plugin.game.luggage.jsapi.o.f139718g;
            sb6.append(str3);
            sb6.append("microMsg.image.");
            sb6.append(currentTimeMillis);
            sb6.append(".");
            sb6.append(str2.hashCode() & 65535);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str4 = str3 + "microMsg.thumb." + currentTimeMillis + "." + (str2.hashCode() & 65535);
            if ((com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.compatible.util.Exif.fromFile(str2).getOrientationInDegree() == 0) ? false : true) {
                int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str2).getOrientationInDegree();
                if (orientationInDegree != 0) {
                    int i17 = orientationInDegree % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                    try {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str2, options);
                        if (d17 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseHaowanMedia", "rotate image, get null bmp");
                        } else {
                            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(d17, i17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseHaowanMedia", "doRotate, dstPath : %s", sb7);
                            try {
                                com.tencent.mm.sdk.platformtools.x.D0(w07, 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                                if (je.a.d(options)) {
                                    ya1.d.b(str2, sb7);
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseHaowanMedia", "rotate image, exception occurred when saving | %s", e17);
                                com.tencent.mm.vfs.w6.h(sb7);
                            }
                        }
                    } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
                    }
                }
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e18 = com.tencent.mm.plugin.webview.model.m4.e(str2, str4);
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str2);
                e18.f182744p = n07.outWidth;
                e18.f182745q = n07.outHeight;
                ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) e18).f182751w = com.tencent.mm.sdk.platformtools.y1.c(str2);
                java.lang.String str5 = e18.f182736e;
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e18);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str5);
                arrayList.add(str5);
            } else if (com.tencent.mm.vfs.w6.d(str2, sb7, false) <= 0) {
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e182 = com.tencent.mm.plugin.webview.model.m4.e(str2, str4);
                android.graphics.BitmapFactory.Options n072 = com.tencent.mm.sdk.platformtools.x.n0(str2);
                e182.f182744p = n072.outWidth;
                e182.f182745q = n072.outHeight;
                ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) e182).f182751w = com.tencent.mm.sdk.platformtools.y1.c(str2);
                java.lang.String str52 = e182.f182736e;
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e182);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str52);
                arrayList.add(str52);
            }
            str2 = sb7;
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e1822 = com.tencent.mm.plugin.webview.model.m4.e(str2, str4);
            android.graphics.BitmapFactory.Options n0722 = com.tencent.mm.sdk.platformtools.x.n0(str2);
            e1822.f182744p = n0722.outWidth;
            e1822.f182745q = n0722.outHeight;
            ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) e1822).f182751w = com.tencent.mm.sdk.platformtools.y1.c(str2);
            java.lang.String str522 = e1822.f182736e;
            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e1822);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseHaowanMedia", "now filepath is : %s, local id is : %s", str2, str522);
            arrayList.add(str522);
        }
        java.lang.String a17 = com.tencent.mm.plugin.webview.model.o5.a(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseHaowanMedia", "after parse to json data : %s", a17);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.luggage.jsapi.k(this, a17));
    }
}
