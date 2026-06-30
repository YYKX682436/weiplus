package f72;

/* loaded from: classes14.dex */
public class g implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f260043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f72.h f260044b;

    public g(f72.h hVar, long j17) {
        this.f260044b = hVar;
        this.f260043a = j17;
    }

    @Override // h72.r
    public void a(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectServiceControllerMp", "hy: video release done. using: %d ms. file path: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f260043a), str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService.class);
        intent.putExtra("key_video_file_name", str);
        f72.h hVar = this.f260044b;
        intent.putExtra("k_bio_id", hVar.f260045a);
        intent.putExtra("key_app_id", hVar.f260046b);
        j45.l.A(intent);
    }
}
