package iu0;

/* loaded from: classes5.dex */
public final class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu0.d f294796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu0.a f294798f;

    public b(iu0.d dVar, java.lang.String str, iu0.a aVar) {
        this.f294796d = dVar;
        this.f294797e = str;
        this.f294798f = aVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MJCC.CdnUpload", "cdnCallback: mediaId=" + str + ", startRet=" + i17 + ", sceneResult=" + hVar + ", retryCount=" + this.f294796d.f294803b);
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MJCC.CdnUpload", "cdnCallback: start failed, ret=" + i17);
            if (i17 != -21005) {
                iu0.d.a(this.f294796d, this.f294797e, this.f294798f, 0, i17, "CDN start failed");
            }
            return 0;
        }
        if (str != null && hVar != null) {
            if (hVar.field_retCode != 0) {
                com.tencent.mars.xlog.Log.e("MJCC.CdnUpload", "cdnCallback: upload failed, retCode=" + hVar.field_retCode);
                iu0.d.a(this.f294796d, this.f294797e, this.f294798f, 0, hVar.field_retCode, "CDN upload failed");
                return 0;
            }
            java.lang.String str2 = hVar.field_fileUrl;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = hVar.field_filemd5;
            java.lang.String str4 = str3 != null ? str3 : "";
            com.tencent.mars.xlog.Log.i("MJCC.CdnUpload", "cdnCallback: success, cdnUrl=" + str2 + ", md5=" + str4 + ", fileLength=" + hVar.field_fileLength);
            this.f294796d.f294802a = null;
            gu0.i2 i2Var = (gu0.i2) this.f294798f;
            i2Var.getClass();
            ((kotlinx.coroutines.r) i2Var.f275703a).s(new jz5.l(str2, str4), gu0.h2.f275691d);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
