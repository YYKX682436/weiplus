package wf;

/* loaded from: classes7.dex */
public final class r implements wf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.a f445481a;

    public r(android.content.Context context) {
        this.f445481a = new wf.s(context);
    }

    @Override // wf.a
    public void a() {
        this.f445481a.a();
    }

    @Override // wf.a
    public void b() {
        this.f445481a.b();
    }

    @Override // sc1.k
    public sc1.k1 c() {
        return this.f445481a.c();
    }

    @Override // wf.a
    public sc1.k1 d() {
        return this.f445481a.d();
    }

    @Override // sc1.k
    public sc1.k1 e() {
        return this.f445481a.e();
    }

    @Override // sc1.k
    public sc1.k1 f(android.os.Bundle bundle) {
        return this.f445481a.f(bundle);
    }

    @Override // sc1.k
    public void g(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f445481a.g(iTXSnapshotListener);
    }

    @Override // sc1.k
    public void h(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f445481a.h(iTXAudioVolumeEvaluationListener);
    }

    @Override // sc1.k
    public boolean i() {
        return this.f445481a.i();
    }

    @Override // wf.a
    public boolean isMuted() {
        return this.f445481a.isMuted();
    }

    @Override // wf.a
    public boolean isPlaying() {
        return this.f445481a.isPlaying();
    }

    @Override // wf.a
    public sc1.k1 j(android.os.Bundle bundle) {
        return this.f445481a.j(bundle);
    }

    @Override // sc1.k
    public sc1.k1 k(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        return this.f445481a.k(tXCloudVideoView, bundle);
    }

    @Override // sc1.k
    public void l(boolean z17, com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f445481a.l(z17, iTXSnapshotListener);
    }

    @Override // sc1.k
    public sc1.k1 m(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.w0 pauseType) {
        kotlin.jvm.internal.o.g(pauseType, "pauseType");
        return this.f445481a.m(lVar, pauseType);
    }

    @Override // sc1.k
    public sc1.k1 n(java.lang.String str, org.json.JSONObject jSONObject) {
        return this.f445481a.n(str, jSONObject);
    }

    @Override // sc1.k
    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        this.f445481a.setPlayListener(iTXLivePlayListener);
    }

    @Override // wf.a
    public sc1.k1 setSurface(android.view.Surface surface) {
        return this.f445481a.setSurface(surface);
    }

    @Override // wf.a
    public sc1.k1 setSurfaceSize(int i17, int i18) {
        return this.f445481a.setSurfaceSize(i17, i18);
    }
}
