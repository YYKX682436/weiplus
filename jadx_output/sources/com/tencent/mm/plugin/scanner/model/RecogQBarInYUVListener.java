package com.tencent.mm.plugin.scanner.model;

@java.lang.Deprecated
/* loaded from: classes12.dex */
public class RecogQBarInYUVListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RequestRecogQBarInYuvEvent> {

    /* renamed from: d, reason: collision with root package name */
    public boolean f158771d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.model.u0 f158772e;

    public RecogQBarInYUVListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.f158771d = false;
        this.f158772e = null;
        this.__eventId = 1252797776;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.RequestRecogQBarInYuvEvent requestRecogQBarInYuvEvent) {
        am.nr nrVar = requestRecogQBarInYuvEvent.f54698g;
        com.tencent.mm.plugin.facedetect.model.u0 u0Var = nrVar.f7450d;
        if (!this.f158771d || u0Var == null) {
            this.f158772e = u0Var;
            this.f158771d = true;
            int i17 = nrVar.f7448b;
            int i18 = nrVar.f7449c;
            byte[] bArr = nrVar.f7447a;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(i18);
            objArr[2] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecogQBarInYUVListener", "hy: request scanning width: %d, height: %d, yuvLen: %d", objArr);
            android.graphics.Bitmap I = com.tencent.mm.sdk.platformtools.x.I(bArr, i17, i18, null);
            if (I != null) {
                zs5.c0 b17 = bt5.a.b(I, new int[2]);
                if (b17 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecogQBarInYUVListener", "decode success");
                    com.tencent.mm.plugin.facedetect.model.u0 u0Var2 = this.f158772e;
                    if (u0Var2 != null) {
                        ((v62.k) u0Var2).a(b17.f475332f, com.tencent.mm.plugin.scanner.j1.a(b17.f475331e), -1);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecogQBarInYUVListener", "decode failed");
                    ((v62.k) this.f158772e).a("", -2, -1);
                }
            }
            this.f158771d = false;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecogQBarInYUVListener", "hy: is decoding. direct return");
            ((v62.k) u0Var).a("", -1, -1);
        }
        return false;
    }
}
