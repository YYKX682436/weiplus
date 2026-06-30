package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ot0.q f202044d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f202045e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f202046f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f202047g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f202048h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f202049i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f202050m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f202051n;

    public o0(com.tencent.mm.ui.chatting.j0 j0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap f17;
        byte[] bArr;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f202046f)) {
            f17 = l01.d0.f314761a.f(this.f202047g, null);
        } else {
            f17 = l01.d0.f314761a.f("file://" + this.f202046f, null);
            if (f17 == null || f17.isRecycled()) {
                f17 = com.tencent.mm.sdk.platformtools.x.i0(this.f202047g);
                if (this.f202050m) {
                    com.tencent.mm.vfs.w6.h(this.f202046f);
                }
            }
        }
        if (f17 == null || f17.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f202051n != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceChattingUI", "thumb image is null sendMessageDefaultImg:%b", objArr);
            bArr = this.f202051n;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceChattingUI", "thumb image is not null ");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        com.tencent.mm.pluginsdk.model.app.k0.I(this.f202044d, this.f202045e, this.f202049i, this.f202048h, null, bArr);
    }
}
