package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f139776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f139777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f139778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139779g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f139780h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sd.b f139781i;

    public y0(com.tencent.mm.plugin.game.luggage.jsapi.a1 a1Var, android.graphics.Bitmap bitmap, int i17, boolean z17, java.lang.String str, org.json.JSONObject jSONObject, sd.b bVar) {
        this.f139776d = bitmap;
        this.f139777e = i17;
        this.f139778f = z17;
        this.f139779g = str;
        this.f139780h = jSONObject;
        this.f139781i = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.b bVar = this.f139781i;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
        android.graphics.Bitmap bitmap = this.f139776d;
        int i17 = this.f139777e;
        bitmap.compress(compressFormat, i17, byteArrayOutputStream);
        java.lang.String str = "data:image/jpg;base64," + android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        boolean z17 = this.f139778f;
        org.json.JSONObject jSONObject = this.f139780h;
        if (!z17) {
            java.lang.String str2 = com.tencent.mm.plugin.game.luggage.jsapi.x3.g("bundle", null) + this.f139779g;
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, i17, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str2), com.tencent.mm.plugin.game.luggage.jsapi.z0.class);
                jSONObject.put(dm.i4.COL_LOCALID, iPCString != null ? iPCString.f68406d : "");
            } catch (java.io.IOException | org.json.JSONException unused) {
            }
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        try {
            bVar.e(jSONObject.put("imgData", str));
        } catch (org.json.JSONException unused2) {
            bVar.c("fail", null);
        }
    }
}
