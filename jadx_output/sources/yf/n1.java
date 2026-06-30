package yf;

/* loaded from: classes7.dex */
public final class n1 implements yf.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf.o f461426a;

    public n1(android.content.Context context) {
        this.f461426a = new yf.o1(context);
    }

    @Override // yf.o
    public void a() {
        this.f461426a.a();
    }

    @Override // yf.o
    public void b() {
        this.f461426a.b();
    }

    @Override // sc1.l
    public sc1.k1 c() {
        return this.f461426a.c();
    }

    @Override // sc1.l
    public void d(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame videoFrame) {
        kotlin.jvm.internal.o.g(videoFrame, "videoFrame");
        this.f461426a.d(videoFrame);
    }

    @Override // sc1.l
    public void e(com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.f461426a.e(iTXSnapshotListener);
    }

    @Override // sc1.l
    public sc1.k1 f(boolean z17) {
        return this.f461426a.f(z17);
    }

    @Override // sc1.l
    public sc1.k1 g(android.os.Bundle bundle) {
        return this.f461426a.g(bundle);
    }

    @Override // yf.o
    public int getMaxZoom() {
        return this.f461426a.getMaxZoom();
    }

    @Override // sc1.l
    public sc1.k1 h(java.lang.String str, org.json.JSONObject jSONObject) {
        return this.f461426a.h(str, jSONObject);
    }

    @Override // yf.o
    public sc1.k1 i(android.os.Bundle bundle) {
        return this.f461426a.i(bundle);
    }

    @Override // yf.o
    public boolean isPushing() {
        return this.f461426a.isPushing();
    }

    @Override // sc1.l
    public void j(com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify) {
        this.f461426a.j(onBGMNotify);
    }

    @Override // sc1.l
    public sc1.k1 k() {
        return this.f461426a.k();
    }

    @Override // sc1.l
    public void l(com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f461426a.l(iTXAudioVolumeEvaluationListener);
    }

    @Override // sc1.l
    public void m(int i17) {
        this.f461426a.m(i17);
    }

    @Override // sc1.l
    public sc1.k1 n(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        return this.f461426a.n(tXCloudVideoView, bundle);
    }

    @Override // sc1.l
    public void o(boolean z17) {
        this.f461426a.o(z17);
    }

    @Override // yf.o
    public sc1.k1 setFocusPosition(float f17, float f18) {
        return this.f461426a.setFocusPosition(f17, f18);
    }

    @Override // sc1.l
    public void setPushListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener) {
        this.f461426a.setPushListener(iTXLivePushListener);
    }

    @Override // yf.o
    public sc1.k1 setSurface(android.view.Surface surface) {
        return this.f461426a.setSurface(surface);
    }

    @Override // yf.o
    public sc1.k1 setSurfaceSize(int i17, int i18) {
        return this.f461426a.setSurfaceSize(i17, i18);
    }

    @Override // yf.o
    public sc1.k1 setZoom(int i17) {
        return this.f461426a.setZoom(i17);
    }
}
