package rp4;

/* loaded from: classes10.dex */
public final class f implements vm5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.g f398628d;

    public f(rp4.g gVar) {
        this.f398628d = gVar;
    }

    @Override // vm5.a
    public void a(long j17) {
        rp4.g gVar = this.f398628d;
        if (gVar.f398656n) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) j17);
            gVar.f398650e.w(ju3.c0.f301885l1, bundle);
        }
    }

    @Override // vm5.a
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on error");
    }

    @Override // vm5.a
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on completed");
    }

    @Override // vm5.a
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on stop");
    }

    @Override // vm5.b
    public void r() {
        rp4.g gVar = this.f398628d;
        if (gVar.f398660r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on First Frame");
            gVar.f398660r = false;
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = gVar.f398649d;
            if (videoCompositionPlayView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(videoCompositionPlayView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin$videoCallback$1", "onFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                videoCompositionPlayView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(videoCompositionPlayView, "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin$videoCallback$1", "onFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ju3.d0.k(gVar.f398650e, ju3.c0.D, null, 2, null);
        }
    }

    @Override // vm5.a
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on start");
    }

    @Override // vm5.a
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "videoView on FirstFrame");
    }
}
