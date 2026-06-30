package k72;

/* loaded from: classes14.dex */
public class c0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f304709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k72.d0 f304710e;

    public c0(k72.d0 d0Var, java.lang.String str, java.lang.String str2, k72.y yVar) {
        this.f304710e = d0Var;
        this.f304709d = str;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        int i18 = hVar == null ? -1 : hVar.field_retCode;
        vz2.c.c().f56207i = i18;
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct c17 = vz2.c.c();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k72.d0 d0Var = this.f304710e;
        c17.f56209k = currentTimeMillis - d0Var.f304718h;
        vz2.c.k("rspCdn", java.lang.Integer.valueOf(i18));
        java.lang.String str2 = this.f304709d;
        if (hVar != null && hVar.field_retCode == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video done. now upload");
            java.lang.String str3 = hVar.field_fileId;
            java.lang.String str4 = hVar.field_aesKey;
            k72.b0 b0Var = d0Var.f304716f;
            if (b0Var != null) {
                byte[] bArr = d0Var.f304717g;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionMgr", "onUploadFinish, fileName: %s, fileId: %s, aesKey: %s", str2, str2, str3, str4);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 50L, 1L, false);
                k72.u uVar = ((k72.r) b0Var).f304744a.f304748g;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionMgr", "requestCheckAction, fileName: %s, fileId: %s, aesKey: %s needSignContract:%s ", str2, str3, str4, java.lang.Boolean.valueOf(uVar.f304768z));
                vz2.c.j("reqVerify");
                j72.c cVar = new j72.c(uVar.f304756n, uVar.f304757o, uVar.f304758p, str3, str4, uVar.f304751f, uVar.f304759q, uVar.f304752g, bArr, uVar.f304768z, 1, 0L, 0.0d, 0.0d, uVar.A);
                gm0.j1.d().a(2726, uVar);
                gm0.j1.d().g(cVar);
            }
        } else {
            if (hVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.tencent.mm.vfs.w6.h(str2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 51L, 1L, false);
                k72.b0 b0Var2 = d0Var.f304716f;
                if (b0Var2 != null) {
                    ((k72.r) b0Var2).a();
                }
                return 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceCheckVideoRecordMgr", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 51L, 1L, false);
                com.tencent.mm.vfs.w6.h(str2);
                k72.b0 b0Var3 = d0Var.f304716f;
                if (b0Var3 != null) {
                    ((k72.r) b0Var3).a();
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
