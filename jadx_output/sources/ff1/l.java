package ff1;

/* loaded from: classes15.dex */
public class l implements ye1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView f261621a;

    public l(com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView) {
        this.f261621a = abstractVideoTextureView;
    }

    @Override // ye1.m
    public void a(ye1.e eVar) {
        com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = this.f261621a;
        ye1.e eVar2 = abstractVideoTextureView.f83659g;
        if (eVar != eVar2 && eVar != null) {
            abstractVideoTextureView.g("another player callback, release now.[%s, %s]", eVar, eVar2);
            new ff1.g(abstractVideoTextureView, eVar).start();
            return;
        }
        abstractVideoTextureView.f83660h = true;
        abstractVideoTextureView.f83661i = eVar != null ? eVar.getVideoWidth() : 0;
        abstractVideoTextureView.f83662m = eVar != null ? eVar.getVideoHeight() : 0;
        abstractVideoTextureView.e("on prepared. size [%d, %d] mStartWhenPrepared %b ", java.lang.Integer.valueOf(abstractVideoTextureView.f83661i), java.lang.Integer.valueOf(abstractVideoTextureView.f83662m), java.lang.Boolean.valueOf(abstractVideoTextureView.f83663n));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) abstractVideoTextureView.getLayoutParams();
        layoutParams.addRule(13);
        abstractVideoTextureView.setLayoutParams(layoutParams);
        if (abstractVideoTextureView.f83661i == 0 || abstractVideoTextureView.f83662m == 0) {
            if (abstractVideoTextureView.f83663n) {
                abstractVideoTextureView.f83659g.start();
                abstractVideoTextureView.f83663n = false;
                abstractVideoTextureView.f83659g.b(abstractVideoTextureView.f83672w);
            }
        } else if (abstractVideoTextureView.f83663n) {
            abstractVideoTextureView.f83659g.start();
            abstractVideoTextureView.f83659g.b(abstractVideoTextureView.f83672w);
            abstractVideoTextureView.f83663n = false;
        }
        ff1.z zVar = abstractVideoTextureView.f83664o;
        if (zVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) zVar;
            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", java.lang.Boolean.valueOf(abstractVideoView.f83689t), java.lang.Integer.valueOf(abstractVideoView.f83690u), java.lang.Boolean.valueOf(abstractVideoView.f83692w));
            abstractVideoView.f83692w = true;
            ff1.e0 e0Var = abstractVideoView.f83684o;
            if (e0Var != null) {
                e0Var.setOneTimeVideoTextureUpdateCallback(abstractVideoView);
            }
            abstractVideoView.setVideoTotalTime(abstractVideoView.getVideoDurationSec());
            if (!abstractVideoView.f83689t) {
                int i17 = abstractVideoView.f83690u;
                if (i17 >= 0) {
                    abstractVideoView.a(i17, false);
                }
            } else if (abstractVideoView.f83690u <= -1) {
                if (abstractVideoView.play()) {
                    abstractVideoView.f83695z.c(1000L, 1000L);
                }
            } else if (((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.BaseVideoView) abstractVideoView).j()) {
                abstractVideoView.play();
            } else {
                abstractVideoView.a(abstractVideoView.f83690u, abstractVideoView.f83689t);
            }
            abstractVideoView.f83690u = -1;
            abstractVideoView.f83689t = true;
            oe1.h1 h1Var = abstractVideoView.f83686q;
            if (h1Var != null) {
                h1Var.o(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
            }
            if (abstractVideoView.f83691v > 0) {
                java.util.Objects.toString(abstractVideoView.f83693x);
                abstractVideoView.A.c(5000L, 5000L);
            }
        }
    }
}
