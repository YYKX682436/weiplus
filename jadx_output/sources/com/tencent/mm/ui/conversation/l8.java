package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ot0.q f207848d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f207849e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f207850f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f207851g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f207852h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f207853i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f207854m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f207855n;

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap f17;
        byte[] bArr;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f207850f)) {
            f17 = l01.d0.f314761a.f(this.f207851g, null);
        } else {
            f17 = l01.d0.f314761a.f("file://" + this.f207850f, null);
            if (f17 == null || f17.isRecycled()) {
                f17 = com.tencent.mm.sdk.platformtools.x.i0(this.f207851g);
                if (this.f207854m) {
                    com.tencent.mm.vfs.w6.h(this.f207850f);
                }
            }
        }
        if (f17 == null || f17.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f207855n != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is null sendMessageDefaultImg:%b", objArr);
            bArr = this.f207855n;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is not null ");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        com.tencent.mm.pluginsdk.model.app.k0.I(this.f207848d, this.f207849e, this.f207853i, this.f207852h, null, bArr);
    }
}
