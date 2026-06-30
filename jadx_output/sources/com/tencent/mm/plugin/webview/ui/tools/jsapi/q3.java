package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f185354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f185356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185358h;

    public q3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.util.ArrayList arrayList, java.lang.String str, java.util.ArrayList arrayList2, android.content.Intent intent) {
        this.f185358h = c1Var;
        this.f185354d = arrayList;
        this.f185355e = str;
        this.f185356f = arrayList2;
        this.f185357g = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f185354d.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = this.f185355e;
            sb6.append(str2);
            sb6.append("microMsg.image.");
            sb6.append(currentTimeMillis);
            sb6.append(".");
            sb6.append(str.hashCode() & 65535);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str3 = str2 + "microMsg.thumb." + currentTimeMillis + "." + (str.hashCode() & 65535);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185358h;
            c1Var.getClass();
            if ((com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree() == 0) ? false : true) {
                c1Var.getClass();
                int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree();
                if (orientationInDegree != 0) {
                    int i17 = orientationInDegree % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
                    try {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, options);
                        if (d17 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "rotate image, get null bmp");
                        } else {
                            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(d17, i17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doRotate, dstPath : %s", sb7);
                            try {
                                com.tencent.mm.sdk.platformtools.x.D0(w07, 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                                if (je.a.d(options)) {
                                    ya1.d.b(str, sb7);
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "rotate image, exception occurred when saving | %s", e17);
                                com.tencent.mm.vfs.w6.h(sb7);
                            }
                        }
                    } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
                    }
                }
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e18 = com.tencent.mm.plugin.webview.model.m4.e(str, str3);
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
                e18.f182744p = n07.outWidth;
                e18.f182745q = n07.outHeight;
                ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) e18).f182751w = com.tencent.mm.sdk.platformtools.y1.c(str);
                java.lang.String str4 = e18.f182736e;
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e18);
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str4);
                this.f185356f.add(str4);
            } else if (com.tencent.mm.vfs.w6.d(str, sb7, false) <= 0) {
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e182 = com.tencent.mm.plugin.webview.model.m4.e(str, str3);
                android.graphics.BitmapFactory.Options n072 = com.tencent.mm.sdk.platformtools.x.n0(str);
                e182.f182744p = n072.outWidth;
                e182.f182745q = n072.outHeight;
                ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) e182).f182751w = com.tencent.mm.sdk.platformtools.y1.c(str);
                java.lang.String str42 = e182.f182736e;
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e182);
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str42);
                this.f185356f.add(str42);
            }
            str = sb7;
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e1822 = com.tencent.mm.plugin.webview.model.m4.e(str, str3);
            android.graphics.BitmapFactory.Options n0722 = com.tencent.mm.sdk.platformtools.x.n0(str);
            e1822.f182744p = n0722.outWidth;
            e1822.f182745q = n0722.outHeight;
            ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) e1822).f182751w = com.tencent.mm.sdk.platformtools.y1.c(str);
            java.lang.String str422 = e1822.f182736e;
            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(e1822);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str422);
            this.f185356f.add(str422);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.p3(this));
    }
}
