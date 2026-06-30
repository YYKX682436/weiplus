package tz2;

/* loaded from: classes14.dex */
public class k implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f423300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tz2.j f423301b;

    public k(tz2.j jVar, long j17) {
        this.f423301b = jVar;
        this.f423300a = j17;
    }

    @Override // h72.r
    public void a(java.lang.String str) {
        long j17 = this.f423301b.f423286c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", "hy: video release done. using: %d ms. file path: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17), str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
            return;
        }
        this.f423301b.f423290g = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService.class);
        this.f423301b.f423290g.putExtra("key_video_file_name", str);
        this.f423301b.f423290g.putExtra("k_bio_id", this.f423300a);
        tz2.j jVar = this.f423301b;
        jVar.f423290g.putExtra("key_face_type", jVar.f423295l);
        tz2.j jVar2 = this.f423301b;
        jVar2.f423290g.putExtra("key_app_id", jVar2.f423287d);
        tz2.j jVar3 = this.f423301b;
        jVar3.f423290g.putExtra("k_ticket", jVar3.f423288e);
        tz2.j jVar4 = this.f423301b;
        jVar4.f423290g.putExtra("request_verify_pre_info", jVar4.f423289f);
        tz2.j jVar5 = this.f423301b;
        jVar5.f423290g.putExtra("key_video_upload_type", jVar5.f423296m);
        synchronized (this) {
            tz2.j jVar6 = this.f423301b;
            jVar6.f423285b = false;
            java.lang.Runnable runnable = jVar6.f423292i;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f423301b.f423292i = null;
        }
    }
}
