package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes14.dex */
public final class w2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.x2 f143817a;

    public w2(com.tencent.mm.plugin.lite.jsapi.comms.x2 x2Var) {
        this.f143817a = x2Var;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(bitmap != null ? bitmap.getWidth() : 0);
        objArr[1] = java.lang.Integer.valueOf(bitmap != null ? bitmap.getHeight() : 0);
        com.tencent.mars.xlog.Log.i("LiteAppJsApiGetThemeColorForImage", "loadImage done size:%d,%d", objArr);
        boolean z17 = com.tencent.mm.plugin.lite.jsapi.comms.x2.f143823g.length() > 0;
        com.tencent.mm.plugin.lite.jsapi.comms.x2 x2Var = this.f143817a;
        if (z17) {
            x2Var.C(bitmap, com.tencent.mm.plugin.lite.jsapi.comms.x2.f143823g);
            return;
        }
        java.lang.String B = x2Var.B(bitmap);
        com.tencent.mars.xlog.Log.i("LiteAppJsApiGetThemeColorForImage", "color:%s", B);
        x2Var.f143443f.b(kz5.b1.e(new jz5.l("color", B)));
    }
}
