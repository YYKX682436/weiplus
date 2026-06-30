package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.r2 f143723f;

    public q2(com.tencent.mm.plugin.lite.jsapi.comms.r2 r2Var, java.lang.String str, java.lang.String str2) {
        this.f143723f = r2Var;
        this.f143721d = str;
        this.f143722e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f143721d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.lite.jsapi.comms.r2 r2Var = this.f143723f;
        if (K0) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = r2Var.f143442e;
            str = ((com.tencent.mm.feature.lite.i) g0Var).zj(cVar.f299025b, cVar.f299024a, this.f143722e);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                r2Var.f143443f.a("path or localID not exist");
                com.tencent.mars.xlog.Log.e("LiteAppJsApiGetAccountInfo", "cannot find localPath");
                return;
            }
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetImageInfo$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetImageInfo$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            r2Var.f143443f.a("image not found");
            com.tencent.mars.xlog.Log.e("LiteAppJsApiGetAccountInfo", "cannot find image");
            return;
        }
        java.lang.String c17 = je.a.c(options);
        java.lang.String b17 = je.a.d(options) ? je.a.b(je.a.a(str)) : "up";
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("width", java.lang.Integer.valueOf(options.outWidth));
        hashMap.put("height", java.lang.Integer.valueOf(options.outHeight));
        hashMap.put("orientation", b17);
        hashMap.put("type", c17);
        r2Var.f143443f.b(hashMap);
        com.tencent.mars.xlog.Log.i("LiteAppJsApiGetAccountInfo", "getImageInfo w=%d h=%d", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
    }
}
