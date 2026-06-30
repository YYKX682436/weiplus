package sc1;

/* loaded from: classes7.dex */
public final class o1 implements sc1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc1.k f405706a;

    public o1(android.content.Context context) {
        this.f405706a = new sc1.p1(context);
    }

    @Override // sc1.k
    public sc1.k1 c() {
        return this.f405706a.c();
    }

    @Override // sc1.k
    public sc1.k1 e() {
        return this.f405706a.e();
    }

    @Override // sc1.k
    public sc1.k1 f(android.os.Bundle bundle) {
        return this.f405706a.f(bundle);
    }

    @Override // sc1.k
    public void g(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f405706a.g(iTXSnapshotListener);
    }

    @Override // sc1.k
    public void h(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f405706a.h(iTXAudioVolumeEvaluationListener);
    }

    @Override // sc1.k
    public sc1.k1 k(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        return this.f405706a.k(tXCloudVideoView, bundle);
    }

    @Override // sc1.k
    public sc1.k1 m(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.w0 pauseType) {
        kotlin.jvm.internal.o.g(pauseType, "pauseType");
        return this.f405706a.m(lVar, pauseType);
    }

    @Override // sc1.k
    public sc1.k1 n(java.lang.String str, org.json.JSONObject jSONObject) {
        return this.f405706a.n(str, jSONObject);
    }

    @Override // sc1.k
    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        this.f405706a.setPlayListener(iTXLivePlayListener);
    }
}
