package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f185994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f185995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f185996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185997g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185998h;

    public c2(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, float f17, nw4.k kVar, nw4.y2 y2Var, long j17) {
        this.f185994d = h0Var;
        this.f185995e = h0Var2;
        this.f185996f = f17;
        this.f185997g = kVar;
        this.f185998h = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.y2 y2Var = this.f185998h;
        nw4.k kVar = this.f185997g;
        kotlin.jvm.internal.h0 h0Var = this.f185995e;
        try {
            int a17 = com.tencent.mm.sdk.platformtools.l.a((java.lang.String) this.f185994d.f310123d);
            h0Var.f310123d = com.tencent.mm.sdk.platformtools.x.w0((android.graphics.Bitmap) h0Var.f310123d, a17);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            float f17 = this.f185996f;
            int i17 = (int) (100 * f17);
            if (i17 < 10) {
                i17 = 10;
            }
            if (i17 > 99) {
                i17 = 99;
            }
            ((android.graphics.Bitmap) h0Var.f310123d).compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.lang.String encodeToString = android.util.Base64.encodeToString(byteArray, 2);
            java.util.HashMap hashMap = new java.util.HashMap();
            kotlin.jvm.internal.o.d(encodeToString);
            hashMap.put("localData", encodeToString);
            kVar.f340863d.e(y2Var.f341013c, "getLocalImgData:ok", hashMap);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetLocalImgData", "getLocalImgData rawData size = " + byteArray.length + ", base64 size = " + encodeToString.length() + ", compressionRatio=" + f17 + ", quality=" + i17 + ", degree=" + a17 + ", width=" + ((android.graphics.Bitmap) h0Var.f310123d).getWidth() + ", height=" + ((android.graphics.Bitmap) h0Var.f310123d).getHeight());
            java.lang.System.currentTimeMillis();
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Exception unused) {
            }
            ((android.graphics.Bitmap) h0Var.f310123d).recycle();
        } catch (java.lang.Exception e17) {
            kVar.f340863d.e(y2Var.f341013c, "getLocalImgData:fail", null);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLocalImgData", "getLocalImgData fail %s", e17.getMessage());
        }
    }
}
