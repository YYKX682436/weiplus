package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public class a1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    public static int f(double d17) {
        return (int) (d17 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
    }

    @Override // sd.c
    public java.lang.String b() {
        return "getWebViewSnapShot";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject == null) {
            bVar.c("invalid_params", null);
            return;
        }
        double optDouble = jSONObject.optDouble("compressionRatio", 0.9d);
        double optDouble2 = jSONObject.optDouble("x", 0.0d);
        double optDouble3 = jSONObject.optDouble("y", 0.0d);
        double optDouble4 = jSONObject.optDouble("width", 0.0d);
        double optDouble5 = jSONObject.optDouble("height", 0.0d);
        double optDouble6 = jSONObject.optDouble("snapshotWidth", 0.0d);
        boolean optBoolean = jSONObject.optBoolean("noLocalId", false);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a;
        int f17 = f(optDouble2);
        int f18 = f(optDouble3);
        int f19 = f(optDouble4);
        int f27 = f(optDouble5);
        int f28 = f(optDouble6);
        android.graphics.Bitmap f29 = x0Var.f406655i.f406633i.f();
        if (f17 < 0 || f17 >= f29.getWidth()) {
            f17 = 0;
        }
        if (f18 < 0 || f18 >= f29.getWidth()) {
            f18 = 0;
        }
        if (f19 <= 0 || f19 >= f29.getWidth() - f17) {
            f19 = f29.getWidth() - f17;
        }
        if (f27 <= 0 || f27 >= f29.getHeight() - f18) {
            f27 = f29.getHeight() - f18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(f27));
        arrayList.add(java.lang.Integer.valueOf(f19));
        arrayList.add(java.lang.Integer.valueOf(f18));
        arrayList.add(java.lang.Integer.valueOf(f17));
        arrayList.add(f29);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/luggage/container/LuggageWebPage", "takeScreenShot", "(IIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
        yj0.a.e(obj, createBitmap, "com/tencent/luggage/container/LuggageWebPage", "takeScreenShot", "(IIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        if (f28 == 0) {
            f28 = f19;
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap, f28, (f28 / f19) * f27, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMImage_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b("screenshot".getBytes()));
        sb6.append(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        java.lang.String sb7 = sb6.toString();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.y0(this, createScaledBitmap, java.lang.Math.min(java.lang.Math.max((int) (optDouble * 100.0d), 10), 99), optBoolean, sb7, jSONObject2, bVar));
    }
}
