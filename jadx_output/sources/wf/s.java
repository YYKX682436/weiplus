package wf;

/* loaded from: classes15.dex */
public class s extends sc1.p1 implements wf.a {
    @Override // wf.a
    public void a() {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.f405712b;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE, new android.os.Bundle());
        }
    }

    @Override // wf.a
    public void b() {
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.f405712b;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(6000, new android.os.Bundle());
        }
    }

    @Override // sc1.p1, sc1.k
    public sc1.k1 c() {
        return n(com.tencent.tav.core.AssetExtension.SCENE_PLAY, null);
    }

    @Override // wf.a
    public sc1.k1 d() {
        return this.f405711a.isPlaying() ? n("stop", null) : new sc1.k1();
    }

    @Override // sc1.p1, sc1.k
    public sc1.k1 f(android.os.Bundle bundle) {
        p(bundle);
        return super.f(bundle);
    }

    @Override // wf.a
    public boolean isMuted() {
        return this.f405711a.isMuted();
    }

    @Override // wf.a
    public boolean isPlaying() {
        return this.f405711a.isPlaying();
    }

    @Override // wf.a
    public sc1.k1 j(android.os.Bundle bundle) {
        p(bundle);
        return new sc1.k1(this.f405711a.initLivePlayer(bundle));
    }

    @Override // sc1.p1, sc1.k
    public sc1.k1 k(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        p(bundle);
        return super.k(tXCloudVideoView, bundle);
    }

    public final void p(android.os.Bundle bundle) {
        if (bundle == null || bundle.containsKey(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("TXLivePlayerJSAdapterV2SameLayerSupport", "canStartPlayWorkaround, put true");
        bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY, true);
    }

    @Override // wf.a
    public sc1.k1 setSurface(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i("TXLivePlayerJSAdapterV2SameLayerSupport", "setSurface: " + surface + ", stack: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return new sc1.k1(this.f405711a.setSurface(surface));
    }

    @Override // wf.a
    public sc1.k1 setSurfaceSize(int i17, int i18) {
        return new sc1.k1(this.f405711a.setSurfaceSize(i17, i18));
    }
}
