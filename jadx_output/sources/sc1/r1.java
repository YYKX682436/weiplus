package sc1;

/* loaded from: classes15.dex */
public class r1 implements sc1.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter f405726a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f405727b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f405728c = false;

    public r1(android.content.Context context) {
        this.f405726a = new com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter(context);
    }

    @Override // sc1.l
    public sc1.k1 c() {
        return this.f405727b ? this.f405728c ? h("start", null) : h("resume", null) : new sc1.k1();
    }

    @Override // sc1.l
    public void d(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        this.f405726a.sendCustomVideoFrame(v2TXLiveVideoFrame);
    }

    @Override // sc1.l
    public void e(com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.f405726a.setSnapshotListener(iTXSnapshotListener);
    }

    @Override // sc1.l
    public sc1.k1 f(boolean z17) {
        boolean isPushing = this.f405726a.isPushing();
        this.f405727b = isPushing;
        if (!isPushing) {
            return new sc1.k1();
        }
        this.f405728c = z17;
        return z17 ? h("stop", null) : h("pause", null);
    }

    @Override // sc1.l
    public sc1.k1 g(android.os.Bundle bundle) {
        return new sc1.k1(this.f405726a.updateLivePusher(bundle));
    }

    @Override // sc1.l
    public sc1.k1 h(java.lang.String str, org.json.JSONObject jSONObject) {
        return new sc1.k1(this.f405726a.operateLivePusher(str, jSONObject));
    }

    @Override // sc1.l
    public void j(com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify) {
        this.f405726a.setBGMNotifyListener(onBGMNotify);
    }

    @Override // sc1.l
    public sc1.k1 k() {
        return new sc1.k1(this.f405726a.unInitLivePusher());
    }

    @Override // sc1.l
    public void l(com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f405726a.setAudioVolumeListener(iTXAudioVolumeEvaluationListener);
    }

    @Override // sc1.l
    public void m(int i17) {
        this.f405726a.notifyOrientationChanged(i17);
    }

    @Override // sc1.l
    public sc1.k1 n(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        return new sc1.k1(this.f405726a.initLivePusher(tXCloudVideoView, bundle));
    }

    @Override // sc1.l
    public void o(boolean z17) {
        this.f405726a.enableCustomVideoCapture(z17);
    }

    @Override // sc1.l
    public void setPushListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener) {
        this.f405726a.setPushListener(iTXLivePushListener);
    }
}
