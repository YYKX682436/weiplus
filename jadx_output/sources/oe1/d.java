package oe1;

@j95.b
/* loaded from: classes15.dex */
public final class d extends i95.w implements oe1.p1 {
    @Override // oe1.p1
    public oe1.o1 Td(android.content.Context context, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, playerHint: %d", java.lang.Integer.valueOf(i17));
        if ((i17 & 1) == 0) {
            int d17 = com.tencent.mm.plugin.appbrand.utils.p.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, playerType: " + d17);
            if (d17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use SystemVideoViewWrapper");
                return new hf1.c(context);
            }
            if (d17 != 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandExoVideoViewWrapper");
                return new gf1.c(context);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandThumbVideoViewWrapper");
            return new qk1.c(context);
        }
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        boolean z17 = true;
        if (e0Var != null) {
            z17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_wxa_reward_video_enable_tp2, true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandAVABTests", "canRewardVideoUseThumbPlayer, " + z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, canRewardVideoUseThumbPlayer: %b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandExoVideoViewWrapper");
            return new gf1.c(context);
        }
        if ((i17 & 2) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use Mp4OnlyThumbVideoViewWrapper");
            return new qk1.f(context);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandThumbVideoViewWrapper");
        return new qk1.c(context);
    }

    @Override // oe1.p1
    public java.lang.String getName() {
        return "Factory#AppBrandVideoNonSameLayerStrategy";
    }
}
