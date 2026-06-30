package r35;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.applet.CdnImageView f369133a;

    public i0(com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView) {
        this.f369133a = cdnImageView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18;
        java.lang.String string = message.getData().getString("k_url");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f369133a;
        java.lang.String str = cdnImageView.f189891d;
        java.lang.String str2 = str != null ? str : "";
        cdnImageView.f189891d = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            cdnImageView.setImageBitmap(null);
            cdnImageView.setImageBitmapCompleted(null);
            return;
        }
        if (cdnImageView.f189891d.equals(string)) {
            byte[] byteArray = message.getData().getByteArray("k_data");
            if (byteArray == null || byteArray.length == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnImageView", "handleMsg fail, data is null");
                return;
            }
            android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(byteArray);
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(cdnImageView.f189891d, G);
            if (cdnImageView.f189897m) {
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView.a(cdnImageView, G);
            }
            if (G != null && (i17 = cdnImageView.f189892e) > 0 && (i18 = cdnImageView.f189893f) > 0) {
                G = com.tencent.mm.sdk.platformtools.x.S(G, i18, i17, true, false);
            }
            if (cdnImageView.f189896i && G != null) {
                G = cdnImageView.f189898n > 0.0f ? com.tencent.mm.sdk.platformtools.x.s0(G, false, G.getWidth() * cdnImageView.f189898n) : com.tencent.mm.sdk.platformtools.x.s0(G, false, G.getWidth() * 0.5f);
            }
            if (G != null) {
                cdnImageView.setImageBitmap(G);
            }
            cdnImageView.setImageBitmapCompleted(G);
        }
    }
}
