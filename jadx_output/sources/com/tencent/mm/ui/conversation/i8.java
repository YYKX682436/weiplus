package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ot0.q f207749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f207750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f207751f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f207752g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f207753h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f207754i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f207755m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f207756n;

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap f17;
        byte[] bArr;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f207751f)) {
            f17 = l01.d0.f314761a.f(this.f207752g, null);
        } else {
            f17 = l01.d0.f314761a.f("file://" + this.f207751f, null);
            if (f17 == null || f17.isRecycled()) {
                f17 = com.tencent.mm.sdk.platformtools.x.i0(this.f207752g);
                if (this.f207755m) {
                    com.tencent.mm.vfs.w6.h(this.f207751f);
                }
            }
        }
        if (f17 == null || f17.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f207756n != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is null sendMessageDefaultImg:%b", objArr);
            bArr = this.f207756n;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is not null ");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        com.tencent.mm.pluginsdk.model.app.k0.I(this.f207749d, this.f207750e, this.f207754i, this.f207753h, null, bArr);
    }
}
