package f72;

/* loaded from: classes12.dex */
public abstract class j implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final long f260047d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f260048e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f260049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService f260050g;

    public j(com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService faceUploadVideoService, android.content.Intent intent, f72.i iVar) {
        this.f260050g = faceUploadVideoService;
        this.f260047d = -1L;
        this.f260048e = null;
        this.f260049f = null;
        this.f260049f = intent.getStringExtra("key_video_file_name");
        this.f260047d = intent.getLongExtra("k_bio_id", -1L);
        this.f260048e = intent.getStringExtra("key_app_id");
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public abstract com.tencent.mm.modelbase.m1 a(dn.h hVar);

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceUploadVideoService", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        long j17 = this.f260047d;
        com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService faceUploadVideoService = this.f260050g;
        if (hVar == null || hVar.field_retCode != 0) {
            java.lang.String str2 = this.f260049f;
            if (hVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceUploadVideoService", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.tencent.mm.vfs.w6.h(str2);
                vz2.c.i(faceUploadVideoService.f100047i, hVar.field_retCode, "cdn error retCode");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 24L, 1L, false);
                com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.d(j17, 1, hVar.field_retCode);
                return 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceUploadVideoService", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.tencent.mm.vfs.w6.h(str2);
                vz2.c.i(faceUploadVideoService.f100047i, i17, "cdn error startRet");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 24L, 1L, false);
                com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.d(j17, 1, i17);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceUploadVideoService", "hy: upload video done. now upload");
            vz2.c.i(faceUploadVideoService.f100047i, 0, ya.b.SUCCESS);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 23L, 1L, false);
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.d(j17, 0, 0);
            com.tencent.mm.modelbase.m1 a17 = a(hVar);
            gm0.j1.d().a(a17.getType(), faceUploadVideoService);
            gm0.j1.d().g(a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceUploadVideoService", "hy: upload video request send: " + a17.getType());
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
