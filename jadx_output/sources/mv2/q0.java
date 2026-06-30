package mv2;

/* loaded from: classes8.dex */
public final class q0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.r0 f331622d;

    public q0(mv2.r0 r0Var) {
        this.f331622d = r0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        mv2.r0 r0Var = this.f331622d;
        java.lang.String str3 = r0Var.f331625g;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.toString()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i(str3, "on cdn callback mediaId = %s, startRet = %d, sceneResult %s", objArr);
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e(r0Var.f331625g, "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            if (i17 != -21005) {
                r0Var.b(fp0.u.f265291g);
            }
            return 0;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && hVar != null) {
            com.tencent.mars.xlog.Log.i(r0Var.f331625g, "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_fileId, hVar.field_fileUrl);
            if (hVar.field_retCode != 0) {
                r0Var.b(fp0.u.f265291g);
                return 0;
            }
            java.lang.String field_fileUrl = hVar.field_fileUrl;
            kotlin.jvm.internal.o.f(field_fileUrl, "field_fileUrl");
            r0Var.getClass();
            r0Var.f331626h = field_fileUrl;
            r0Var.b(fp0.u.f265290f);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
