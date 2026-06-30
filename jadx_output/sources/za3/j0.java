package za3;

/* loaded from: classes13.dex */
public class j0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.SimpleImageView f470967a;

    public j0(com.tencent.mm.plugin.location.ui.SimpleImageView simpleImageView) {
        this.f470967a = simpleImageView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18;
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimpleImageView", "handleMsg fail, data is null");
            return;
        }
        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.location.ui.SimpleImageView simpleImageView = this.f470967a;
        sb6.append(simpleImageView.f144663d);
        sb6.append(kk.k.g(simpleImageView.f144664e.getBytes()));
        com.tencent.mm.vfs.w6.S(sb6.toString(), bArr, 0, bArr.length);
        if (G != null && (i17 = simpleImageView.f144665f) > 0 && (i18 = simpleImageView.f144666g) > 0) {
            G = com.tencent.mm.sdk.platformtools.x.S(G, i18, i17, true, false);
        }
        simpleImageView.setImageBitmap(G);
    }
}
