package mv2;

/* loaded from: classes8.dex */
public final class h0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.i0 f331574d;

    public h0(mv2.i0 i0Var) {
        this.f331574d = i0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.toString()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i("Finder.UploadActivityCoverTask", "on cdn callback mediaId = %s, startRet = %d, sceneResult %s", objArr);
        mv2.i0 i0Var = this.f331574d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("Finder.UploadActivityCoverTask", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            if (i17 != -21005) {
                i0Var.b(fp0.u.f265291g);
            }
            return 0;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && hVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.UploadActivityCoverTask", "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_fileId, hVar.field_fileUrl);
            if (hVar.field_retCode != 0) {
                i0Var.b(fp0.u.f265291g);
                return 0;
            }
            java.lang.String field_fileUrl = hVar.field_fileUrl;
            kotlin.jvm.internal.o.f(field_fileUrl, "field_fileUrl");
            i0Var.getClass();
            i0Var.f331577g = field_fileUrl;
            i0Var.b(fp0.u.f265290f);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
