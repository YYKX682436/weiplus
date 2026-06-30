package wf;

/* loaded from: classes7.dex */
public class d implements tf.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f445464a;

    public d(wf.b bVar) {
        this.f445464a = bVar;
    }

    @Override // tf.v
    public void a(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onSetPlaybackSurface surface:%d", java.lang.Integer.valueOf(surface.hashCode()));
        this.f445464a.N(surface);
    }

    @Override // tf.v
    public float b() {
        int i17 = this.f445464a.f445425r;
        if (i17 > 0) {
            return r0.f445424q / i17;
        }
        return 1.0f;
    }

    @Override // tf.v
    public void c(java.lang.String str) {
        boolean equalsIgnoreCase = com.tencent.tav.core.AssetExtension.SCENE_PLAY.equalsIgnoreCase(str);
        wf.b bVar = this.f445464a;
        if (equalsIgnoreCase) {
            com.tencent.mars.xlog.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, play");
            bVar.H();
            return;
        }
        if ("stop".equalsIgnoreCase(str)) {
            com.tencent.mars.xlog.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, stop");
            bVar.C("stop", null);
            return;
        }
        if ("pause".equalsIgnoreCase(str)) {
            com.tencent.mars.xlog.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, pause");
            bVar.C("pause", null);
        } else if ("resume".equalsIgnoreCase(str)) {
            com.tencent.mars.xlog.Log.i(bVar.w(), "IVideoPlayerAddOnVideoController operate, resume");
            bVar.C("resume", null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "IVideoPlayerAddOnVideoController not support: " + str);
        }
    }

    @Override // tf.v
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "onBackgroundPlaybackChange playInBackground:%b", java.lang.Boolean.valueOf(z17));
        wf.b bVar = this.f445464a;
        xf.b bVar2 = bVar.f445420n;
        if (bVar2 != null) {
            ((yf1.k) bVar2).b(bVar.f252497d, z17);
        }
    }

    @Override // tf.v
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "resetPlayer");
    }

    @Override // tf.v
    public boolean isPlaying() {
        return this.f445464a.z();
    }

    @Override // tf.v
    public void pause() {
        tf1.f a17;
        wf.b bVar = this.f445464a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "pause");
        bVar.C("stop", null);
        sf.f fVar = bVar.f445422p;
        if (fVar == null || (a17 = tf.k.a(fVar)) == null || !a17.f418867p) {
            return;
        }
        com.tencent.mars.xlog.Log.i(bVar.w(), "setPlayingWhenEnterBackground");
        bVar.I = null;
    }

    @Override // tf.v
    public void start() {
        wf.b bVar = this.f445464a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "start");
        bVar.H();
        if (bVar.z()) {
            bVar.C("resume", null);
        }
    }
}
