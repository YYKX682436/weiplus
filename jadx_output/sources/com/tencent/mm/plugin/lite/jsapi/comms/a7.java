package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class a7 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.c7 f143509d;

    public a7(com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f143509d = c7Var;
        this.f143506a = str;
        this.f143507b = str2;
        this.f143508c = str3;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiSendFileMessage", "downloadCdnThumbImage result success");
        com.tencent.mm.plugin.lite.jsapi.comms.c7 c7Var = this.f143509d;
        java.lang.String str = c7Var.f143533p + java.lang.String.format("MMImage_%d_%d.jpg", java.lang.Long.valueOf(c7Var.f143442e.f299028e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (ra3.h0.c(bitmap, str)) {
            ra3.h0.d(str, bArr);
            c7Var.f143532o = str;
            c7Var.B(this.f143506a, this.f143507b, str, this.f143508c);
        }
    }
}
