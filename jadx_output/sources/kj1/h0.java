package kj1;

/* loaded from: classes7.dex */
public final class h0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f308335d;

    public h0(com.tencent.mm.ipcinvoker.r rVar) {
        this.f308335d = rVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.ipcinvoker.r rVar = this.f308335d;
        if (hVar == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult(false, null, 2, null));
            }
            return 0;
        }
        if (i17 != 0) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult(false, null, 2, null));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaShortLinkRiskManager", "cdn upload failed, startRet : %d", java.lang.Integer.valueOf(i17));
            return 0;
        }
        int i18 = hVar.field_retCode;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaShortLinkRiskManager", "cdn upload failed, retCode:%d sceneResult[%s]", java.lang.Integer.valueOf(i18), hVar);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult(false, null, 2, null));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaShortLinkRiskManager", "cdn upload success, media id : %s  file url=%s   thumb url=%s", str, hVar.field_fileUrl, hVar.field_thumbUrl);
            if (rVar != null) {
                java.lang.String field_fileUrl = hVar.field_fileUrl;
                kotlin.jvm.internal.o.f(field_fileUrl, "field_fileUrl");
                rVar.a(new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult(true, field_fileUrl));
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
