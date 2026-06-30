package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f175701a = 0;

    static {
        boolean z17 = p05.e5.f350510a;
        boolean z18 = tq5.k.f421272a;
        tq5.k.f421273b = p05.c5.f350476d;
        com.tencent.tav.decoder.logger.Logger.setLogProxy(new p05.f2());
        com.tencent.tav.decoder.logger.Logger.setLevel(2);
        xm5.b.f455398a = new p05.g2();
        com.tencent.mm.plugin.vlog.model.d1.f175577a.a();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_tavkit_vlog_asset_extractor, 0) == 1 || z65.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionUtil", "use custom extractor");
            com.tencent.tav.extractor.AssetExtractorConfig.DOWNGRADING = true;
            com.tencent.tav.extractor.ExtractorDelegateFactory.setExtractorDelegateCreator(new com.tencent.mm.plugin.vlog.model.g1());
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_edit_use_system_extractor_api_level, 28);
        if (Ni <= 0 || !fp.h.c(Ni)) {
            com.tencent.tav.extractor.AssetExtractorConfig.DOWNGRADING = false;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionUtil", "extractor config: " + Ni);
        com.tencent.tav.extractor.AssetExtractorConfig.DOWNGRADING = true;
    }
}
