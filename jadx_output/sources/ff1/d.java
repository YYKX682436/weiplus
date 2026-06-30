package ff1;

/* loaded from: classes15.dex */
public class d implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261601d;

    public d(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261601d = abstractVideoTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261601d;
        android.view.Surface surface = abstractVideoTextureView.f83658f;
        ((ku5.t0) ku5.t0.f312615d).g(new ff1.e(abstractVideoTextureView, surface));
        abstractVideoTextureView.f83658f = new android.view.Surface(surfaceTexture);
        abstractVideoTextureView.e("on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(abstractVideoTextureView.f83660h), java.lang.Integer.valueOf(abstractVideoTextureView.f83658f.hashCode()));
        ye1.e eVar = abstractVideoTextureView.f83659g;
        if (eVar == null || !abstractVideoTextureView.f83660h) {
            abstractVideoTextureView.h();
        } else {
            eVar.setSurface(abstractVideoTextureView.f83658f);
            if (abstractVideoTextureView.H) {
                abstractVideoTextureView.f83659g.start();
            } else {
                abstractVideoTextureView.I = true;
                abstractVideoTextureView.f83659g.c(0.0f, 0.0f);
                abstractVideoTextureView.f83659g.start();
            }
            abstractVideoTextureView.H = false;
        }
        ff1.c0 c0Var = abstractVideoTextureView.f83668s;
        if (c0Var != null) {
            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) c0Var;
            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "on surface available", new java.lang.Object[0]);
            abstractVideoView.p(false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261601d;
        abstractVideoTextureView.e("on texture destroyed mIsPrepared[%b]", java.lang.Boolean.valueOf(abstractVideoTextureView.f83660h));
        android.view.Surface surface = abstractVideoTextureView.f83658f;
        ((ku5.t0) ku5.t0.f312615d).g(new ff1.e(abstractVideoTextureView, surface));
        abstractVideoTextureView.f83658f = null;
        if (abstractVideoTextureView.f83659g == null || !abstractVideoTextureView.f83660h) {
            abstractVideoTextureView.j();
            abstractVideoTextureView.H = false;
        } else if (abstractVideoTextureView.c()) {
            abstractVideoTextureView.H = true;
            abstractVideoTextureView.f83659g.pause();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        int i19 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261601d;
        abstractVideoTextureView.e("on texture size changed width : " + i17 + " height : " + i18, new java.lang.Object[0]);
        ye1.e eVar = abstractVideoTextureView.f83659g;
        if (eVar != null && abstractVideoTextureView.f83660h && abstractVideoTextureView.f83661i == i17 && abstractVideoTextureView.f83662m == i18) {
            eVar.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        ff1.d0 d0Var;
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261601d;
        abstractVideoTextureView.d("on surface texture updated", new java.lang.Object[0]);
        if (abstractVideoTextureView.I) {
            ye1.e eVar = abstractVideoTextureView.f83659g;
            if (eVar != null) {
                eVar.pause();
                if (abstractVideoTextureView.L) {
                    abstractVideoTextureView.f83659g.c(0.0f, 0.0f);
                } else {
                    abstractVideoTextureView.f83659g.c(1.0f, 1.0f);
                }
            }
            abstractVideoTextureView.I = false;
        }
        if (abstractVideoTextureView.G > 0 && (d0Var = abstractVideoTextureView.f83665p) != null) {
            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) d0Var;
            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "onTextureUpdate ", new java.lang.Object[0]);
            abstractVideoView.i();
            abstractVideoTextureView.f83665p = null;
        }
        abstractVideoTextureView.G = java.lang.System.currentTimeMillis();
        if (abstractVideoTextureView.f83655J) {
            abstractVideoTextureView.e("flush surface pause now time[%d]", java.lang.Integer.valueOf(abstractVideoTextureView.getCurrentPosition()));
            ye1.e eVar2 = abstractVideoTextureView.f83659g;
            if (eVar2 != null) {
                eVar2.pause();
                abstractVideoTextureView.setMute(abstractVideoTextureView.L);
            }
            abstractVideoTextureView.f83655J = false;
        }
    }
}
