package k72;

/* loaded from: classes14.dex */
public class z implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k72.a0 f304780a;

    public z(k72.a0 a0Var) {
        this.f304780a = a0Var;
    }

    @Override // h72.r
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "onStop filePath: %s", str);
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "face record video size:%sx%s rotate:%s", java.lang.Integer.valueOf(d17.f162384c), java.lang.Integer.valueOf(d17.f162385d), java.lang.Integer.valueOf(((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getMp4RotateVFS(str)));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 46L, 1L, false);
        k72.d0 d0Var = this.f304780a.f304703e;
        java.lang.String str2 = d0Var.f304711a;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "encryptAndUploadVideoFile: %s", str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", str, com.tencent.mm.vfs.w6.p(str));
            d0Var.a(str);
            java.lang.String str3 = str + "_encrypt";
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "encrypt video file, personId: %s", str2);
            d0Var.c(str2, str, str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", str3, com.tencent.mm.vfs.w6.p(str3));
            com.tencent.mm.vfs.w6.h(str);
            d0Var.b(str3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceCheckVideoRecordMgr", e17, "encryptAndUploadVideoFile error", new java.lang.Object[0]);
            k72.b0 b0Var = d0Var.f304716f;
            if (b0Var != null) {
                ((k72.r) b0Var).a();
            }
        }
    }
}
