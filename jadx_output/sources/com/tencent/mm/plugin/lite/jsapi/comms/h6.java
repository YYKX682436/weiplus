package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143599h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143600i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f143601m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.o6 f143602n;

    public h6(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, org.json.JSONObject jSONObject) {
        this.f143602n = o6Var;
        this.f143595d = str;
        this.f143596e = str2;
        this.f143597f = str3;
        this.f143598g = str4;
        this.f143599h = str5;
        this.f143600i = str6;
        this.f143601m = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.jsapi.comms.g6 g6Var = new com.tencent.mm.plugin.lite.jsapi.comms.g6(this);
        com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var = this.f143602n;
        o6Var.getClass();
        java.lang.String str = this.f143598g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str2 = this.f143596e;
            boolean isEmpty = android.text.TextUtils.isEmpty(str2);
            java.lang.String str3 = this.f143595d;
            java.lang.String str4 = this.f143597f;
            if (isEmpty && !android.text.TextUtils.isEmpty(str4)) {
                g6Var.a(((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str3, o6Var.f143442e.f299024a, str4));
                return;
            }
            if (!android.text.TextUtils.isEmpty(str2) && android.text.TextUtils.isEmpty(str4) && ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str2)) {
                g6Var.a(((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str3, o6Var.f143442e.f299024a, str2));
                return;
            } else {
                if (android.text.TextUtils.isEmpty(str2)) {
                    g6Var.a(null);
                    return;
                }
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    g6Var.a(str2);
                    return;
                }
                if (!str2.startsWith("http")) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover file not found: %s", str2);
                    g6Var.a(null);
                    return;
                } else {
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str2, new com.tencent.mm.plugin.lite.jsapi.comms.j6(o6Var, str2, g6Var));
                    return;
                }
            }
        }
        int indexOf = str.indexOf(";base64,");
        if (indexOf != -1) {
            str = str.substring(indexOf + 8);
        }
        try {
            byte[] decode = android.util.Base64.decode(str, 2);
            int length = decode.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(decode);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "prepareLivePhotoCover", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum$PathReadyCallback;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum", "prepareLivePhotoCover", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSaveToPhotosAlbum$PathReadyCallback;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            if (decodeByteArray == null) {
                g6Var.a(null);
                return;
            }
            java.lang.String str5 = o6Var.f143704g + java.lang.String.format("MMImage_live_cover_%d_%d.jpg", java.lang.Long.valueOf(o6Var.f143442e.f299028e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            if (ra3.h0.c(decodeByteArray, str5)) {
                g6Var.a(str5);
            } else {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "save live cover bitmap fail. path: %s", str5);
                g6Var.a(null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover base64 decode fail %s", e17.getMessage());
            g6Var.a(null);
        }
    }
}
