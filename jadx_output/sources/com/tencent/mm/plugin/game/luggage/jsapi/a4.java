package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f139589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139592h;

    public a4(com.tencent.mm.plugin.game.luggage.jsapi.x3 x3Var, java.lang.String str, sd.b bVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, java.lang.String str2, java.lang.String str3) {
        this.f139588d = str;
        this.f139589e = bVar;
        this.f139590f = q5Var;
        this.f139591g = str2;
        this.f139592h = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f139588d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str2 = this.f139591g;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
            java.lang.String str3 = this.f139592h;
            if (K0 && com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return;
            }
            com.tencent.mm.plugin.game.luggage.jsapi.z3 z3Var = new com.tencent.mm.plugin.game.luggage.jsapi.z3(this);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("url", str2);
            bundle.putString(dm.i4.COL_LOCALID, str3);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.jsapi.g4.class, z3Var);
            return;
        }
        byte[] decode = android.util.Base64.decode(str, 2);
        int length = decode.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(length));
        arrayList.add(0);
        arrayList.add(decode);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/jsapi/JsApiSaveImageToPhotosAlbum$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/game/luggage/jsapi/JsApiSaveImageToPhotosAlbum$2", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        com.tencent.mm.plugin.game.luggage.jsapi.x3.i("", "", decodeByteArray, ((com.tencent.mm.plugin.game.luggage.page.x0) this.f139589e.f406596a).f406610d, this.f139590f);
    }
}
