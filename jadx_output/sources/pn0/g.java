package pn0;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn0.h f356954d;

    public g(pn0.h hVar) {
        this.f356954d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pn0.h hVar = this.f356954d;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = hVar.f356947k;
        if (tXCloudVideoView != null) {
            android.view.TextureView videoView = tXCloudVideoView.getVideoView();
            com.tencent.mars.xlog.Log.i(hVar.f356955l, "release oldView: " + videoView);
            if (videoView != null) {
                com.tencent.mars.xlog.Log.i(hVar.f356955l, "release reset");
                tXCloudVideoView.removeVideoView();
                videoView.setSurfaceTextureListener(null);
            }
        }
    }
}
