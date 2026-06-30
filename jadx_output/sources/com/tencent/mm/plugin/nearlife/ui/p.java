package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes13.dex */
public class p extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.LogoImageView f152342a;

    public p(com.tencent.mm.plugin.nearlife.ui.LogoImageView logoImageView) {
        this.f152342a = logoImageView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18;
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LogoImageView", "handleMsg fail, data is null");
            return;
        }
        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.nearlife.ui.LogoImageView logoImageView = this.f152342a;
        sb6.append(logoImageView.f152260d);
        sb6.append(kk.k.g(logoImageView.f152261e.getBytes()));
        com.tencent.mm.vfs.w6.S(sb6.toString(), bArr, 0, bArr.length);
        if (G != null && (i17 = logoImageView.f152262f) > 0 && (i18 = logoImageView.f152263g) > 0) {
            G = com.tencent.mm.sdk.platformtools.x.S(G, i18, i17, true, false);
        }
        logoImageView.setImageBitmap(G);
    }
}
