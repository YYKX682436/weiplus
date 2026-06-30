package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class j6 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.n6 f143624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.o6 f143625c;

    public j6(com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var, java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.n6 n6Var) {
        this.f143625c = o6Var;
        this.f143623a = str;
        this.f143624b = n6Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        com.tencent.mm.plugin.lite.jsapi.comms.n6 n6Var = this.f143624b;
        if (bitmap == null || bitmap.isRecycled() || bArr == null) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover cdn download fail. url:%s", this.f143623a);
            n6Var.a(null);
            return;
        }
        com.tencent.mm.plugin.lite.jsapi.comms.o6 o6Var = this.f143625c;
        java.lang.String str = o6Var.f143704g + java.lang.String.format("MMImage_live_cover_%d_%d.jpg", java.lang.Long.valueOf(o6Var.f143442e.f299028e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (ra3.h0.c(bitmap, str)) {
            ra3.h0.d(str, bArr);
            n6Var.a(str);
        } else {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live cover cdn save fail. path: %s", str);
            n6Var.a(null);
        }
    }
}
