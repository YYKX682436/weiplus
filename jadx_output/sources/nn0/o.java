package nn0;

/* loaded from: classes10.dex */
public interface o extends com.tencent.mm.sdk.platformtools.k3 {
    void B(boolean z17);

    void Bg(android.graphics.RectF[] rectFArr);

    android.graphics.SurfaceTexture Da();

    void Gg(pn0.b bVar);

    void O2(pn0.b bVar);

    void bc(ps0.a aVar);

    void d1(boolean z17);

    void f(boolean z17);

    int getVideoHeight();

    int getVideoWidth();

    void he(android.graphics.RectF rectF);

    void j4(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, nn0.c0 c0Var);

    void le(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18);

    void n7(int i17);

    com.tencent.rtmp.ui.TXCloudVideoView o1();

    nn0.a pg();

    void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener);

    void setRenderMode(int i17);

    void setRenderRotation(int i17);

    void startPlay();

    void stopPlay(boolean z17);

    void t3(android.graphics.RectF rectF);

    void u(int i17, int i18);

    void v(android.view.Surface surface, int i17, int i18);

    void v3(android.graphics.SurfaceTexture surfaceTexture);

    android.graphics.Bitmap yf(android.graphics.Bitmap.Config config);

    void z(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18);
}
