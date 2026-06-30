package hz3;

/* loaded from: classes12.dex */
public final class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz3.q f286319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz3.w f286320e;

    public c(hz3.q qVar, hz3.w wVar) {
        this.f286319d = qVar;
        this.f286320e = wVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage getCdnAuthInfo, mediaId = " + str);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        hz3.q qVar = this.f286319d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage AIScanImageCdnUploader upload start fail: " + i17);
            ((hz3.u) qVar).a(new hz3.x(3, 402));
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCDNImage callback, mediaId:");
        sb6.append(str);
        sb6.append(" len:");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.field_finishedLength) : null);
        sb6.append(", totalLen:");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.field_toltalLength) : null);
        sb6.append(", sceneResult.retCode: ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AIScanImageCdnUploadUtil", sb6.toString());
        if (hVar != null) {
            if (hVar.field_retCode != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage result fail: " + hVar.field_retCode);
                ((hz3.u) qVar).a(new hz3.x(3, 403));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage success");
                hz3.x xVar = new hz3.x(0, 0);
                int i18 = this.f286320e.f286372c;
                java.lang.String field_fileId = hVar.field_fileId;
                kotlin.jvm.internal.o.f(field_fileId, "field_fileId");
                xVar.f286377c = field_fileId;
                java.lang.String field_aesKey = hVar.field_aesKey;
                kotlin.jvm.internal.o.f(field_aesKey, "field_aesKey");
                xVar.f286378d = field_aesKey;
                ((hz3.u) qVar).a(xVar);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "decodePrepareResponse, mediaId = %s", str);
        return new byte[0];
    }
}
