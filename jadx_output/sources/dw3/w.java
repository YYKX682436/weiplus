package dw3;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f244290d;

    public w(com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        this.f244290d = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String b17 = q75.c.b("mp4");
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = this.f244290d;
        ((yb0.g) b0Var).Ai(context, captureDataManager$CaptureVideoNormalModel.f155661e, b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "handleRemuxVideo save video" + captureDataManager$CaptureVideoNormalModel.f155661e + " exist:" + com.tencent.mm.vfs.w6.j(captureDataManager$CaptureVideoNormalModel.f155661e) + " to:" + b17);
        q75.c.f(b17, com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
