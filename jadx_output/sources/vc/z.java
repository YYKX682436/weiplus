package vc;

@j95.b(dependencies = {com.tencent.kinda.debug.api.IKindaReloadFeatureService.class, com.tencent.kinda.framework.app.SubCoreKinda.class})
/* loaded from: classes9.dex */
public class z extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        if (fp.h.a(23)) {
            return;
        }
        com.tencent.kinda.framework.WxCrossServices.judgeReprot();
        ((ku5.t0) ku5.t0.f312615d).B(new vc.x(this));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_close_init_getfingertype, 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxKindaApiFeatureService", "close init getfingertype");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxKindaApiFeatureService", "open init getfingertype");
            ((ku5.t0) ku5.t0.f312615d).k(new vc.y(this), 500L);
        }
    }
}
