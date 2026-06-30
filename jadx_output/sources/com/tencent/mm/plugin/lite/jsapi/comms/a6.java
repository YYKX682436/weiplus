package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class a6 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f143503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.o6 f143505e;

    public a6(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, java.lang.String str3) {
        this.f143505e = o6Var;
        this.f143501a = str;
        this.f143502b = str2;
        this.f143503c = jSONObject;
        this.f143504d = str3;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f143501a;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mm.plugin.lite.jsapi.comms.d.a(this.f143504d, str, new com.tencent.mm.plugin.lite.jsapi.comms.z5(this));
        } else {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiSaveToPhotosAlbum", "downloadCdnImage result success. path:%s", str);
            this.f143505e.F(this.f143501a, this.f143502b, bitmap, this.f143503c, bArr);
        }
    }
}
