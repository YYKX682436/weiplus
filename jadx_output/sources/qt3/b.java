package qt3;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f366631d;

    public b(com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        this.f366631d = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a17 = q75.c.a("jpg");
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = this.f366631d;
        com.tencent.mm.vfs.w6.c(captureDataManager$CaptureVideoNormalModel.f155662f, a17);
        com.tencent.mm.vfs.w6.h(captureDataManager$CaptureVideoNormalModel.f155662f);
        q75.c.f(a17, com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
