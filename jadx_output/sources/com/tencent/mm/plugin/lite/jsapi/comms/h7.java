package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class h7 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.k7 f143604b;

    public h7(java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.k7 k7Var) {
        this.f143603a = str;
        this.f143604b = k7Var;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f143603a;
        com.tencent.mm.plugin.lite.jsapi.comms.k7 k7Var = this.f143604b;
        if (bitmap == null || bitmap.isRecycled()) {
            k7Var.f143443f.a("download " + str + " fail");
            return;
        }
        java.lang.String str2 = k7Var.f143642m + ("MMImage_" + com.tencent.mm.sdk.platformtools.w2.a(str) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        if (!ra3.h0.c(bitmap, str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiShareMediaToTimeline", "saveBitmapToFile fail, filePath: " + str2);
            k7Var.f143443f.a("saveBitmapToFile fail");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "saveBitmapToFile success, filePath: " + str2);
        if (!k7Var.f143639g) {
            k7Var.B(k7Var.f143644o, str2);
        } else {
            ra3.h0.d(str2, bArr);
            k7Var.B(str2, "");
        }
    }
}
