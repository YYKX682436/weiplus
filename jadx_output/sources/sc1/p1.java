package sc1;

/* loaded from: classes15.dex */
public class p1 implements sc1.k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.live2.jsplugin.player.V2TXLivePlayerJSAdapter f405711a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.rtmp.ITXLivePlayListener f405712b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f405713c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f405714d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f405715e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405716f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405717g = false;

    public p1(android.content.Context context) {
        this.f405711a = new com.tencent.live2.jsplugin.player.V2TXLivePlayerJSAdapter(context);
    }

    @Override // sc1.k
    public sc1.k1 c() {
        return this.f405713c ? n(com.tencent.tav.core.AssetExtension.SCENE_PLAY, null) : new sc1.k1();
    }

    @Override // sc1.k
    public sc1.k1 e() {
        return new sc1.k1(this.f405711a.uninitLivePlayer());
    }

    @Override // sc1.k
    public sc1.k1 f(android.os.Bundle bundle) {
        com.tencent.live2.jsplugin.V2TXJSAdapterError updateLivePlayer = this.f405711a.updateLivePlayer(bundle);
        int i17 = updateLivePlayer.errorCode;
        if (-1 != i17 && -3 != i17) {
            o(bundle, true);
        }
        return new sc1.k1(updateLivePlayer);
    }

    @Override // sc1.k
    public void g(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f405711a.setSnapshotListener(iTXSnapshotListener);
    }

    @Override // sc1.k
    public void h(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f405711a.setAudioVolumeListener(iTXAudioVolumeEvaluationListener);
    }

    @Override // sc1.k
    public boolean i() {
        return this.f405717g;
    }

    @Override // sc1.k
    public sc1.k1 k(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePlayer = this.f405711a.initLivePlayer(tXCloudVideoView, bundle);
        if (-1 != initLivePlayer.errorCode) {
            o(bundle, true);
        }
        return new sc1.k1(initLivePlayer);
    }

    @Override // sc1.k
    public void l(boolean z17, com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.f405711a.takePhoto(z17, iTXSnapshotListener);
    }

    @Override // sc1.k
    public sc1.k1 m(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener;
        com.tencent.mars.xlog.Log.i("TXLivePlayerJSAdapterV2", "enterBackground, pauseType: %s", w0Var);
        com.tencent.mm.plugin.appbrand.jsapi.media.w1 U2 = com.tencent.mm.plugin.appbrand.jsapi.media.n.f81944e.U2(this.f405715e, this.f405716f);
        com.tencent.mars.xlog.Log.i("TXLivePlayerJSAdapterV2", "enterBackground, autoPauseStrategy: %s", U2);
        if (!U2.a(lVar, w0Var)) {
            this.f405713c = false;
            return new sc1.k1();
        }
        boolean isPlaying = this.f405711a.isPlaying();
        this.f405713c = isPlaying;
        if (!isPlaying) {
            return new sc1.k1();
        }
        if (this.f405714d && (iTXLivePlayListener = this.f405712b) != null) {
            iTXLivePlayListener.onPlayEvent(6000, new android.os.Bundle());
        }
        return n("stop", null);
    }

    @Override // sc1.k
    public sc1.k1 n(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.live2.jsplugin.V2TXJSAdapterError operateLivePlayer = this.f405711a.operateLivePlayer(str, jSONObject);
        if (operateLivePlayer.errorCode == 0) {
            if ("pause".equalsIgnoreCase(str)) {
                this.f405717g = true;
            } else if ("resume".equalsIgnoreCase(str)) {
                this.f405717g = false;
            }
        }
        return new sc1.k1(operateLivePlayer);
    }

    public final void o(android.os.Bundle bundle, boolean z17) {
        this.f405714d = bundle.getBoolean("needEvent", this.f405714d);
        this.f405715e = bundle.getBoolean("autoPauseIfNavigate", this.f405715e);
        this.f405716f = bundle.getBoolean("autoPauseIfOpenNative", this.f405716f);
    }

    @Override // sc1.k
    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        this.f405712b = iTXLivePlayListener;
        this.f405711a.setPlayListener(iTXLivePlayListener);
    }
}
