package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.q f175713a = new com.tencent.mm.plugin.vlog.model.q();

    public final rm5.q a(r45.i70 outputConfig, boolean z17) {
        android.util.Size a17;
        kotlin.jvm.internal.o.g(outputConfig, "outputConfig");
        android.util.Size size = new android.util.Size(outputConfig.f376780i, outputConfig.f376781m);
        com.tencent.mm.plugin.vlog.model.f fVar = com.tencent.mm.plugin.vlog.model.f.f175589a;
        boolean z18 = outputConfig.f376792x;
        if (z17) {
            int width = size.getWidth();
            if (width % 8 != 0) {
                while (width % 8 != 0) {
                    width++;
                }
            }
            int height = size.getHeight();
            if (height % 4 != 0) {
                while (height % 4 != 0) {
                    height++;
                }
            }
            a17 = new android.util.Size(width, height);
        } else {
            a17 = !d11.a.a() ? fVar.a(size, 16) : fVar.b(size, z18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CompositionOutputConfigCheck", "afterAlign: videoSoft:" + z17 + " renderSize:" + size + " afterAlign:" + a17);
        if (!z17 && d11.a.a() && (a17.getWidth() != size.getWidth() || a17.getHeight() != size.getHeight())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CompositionOutputConfigCheck", "align error, renderSize:" + size + " afterAlign:" + a17);
            return null;
        }
        outputConfig.f376780i = a17.getWidth();
        outputConfig.f376781m = a17.getHeight();
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tavkit_encode_high_profile_enable, 1) == 1;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mediacodec_level_limit, true);
        android.util.Size size2 = new android.util.Size(outputConfig.f376780i, outputConfig.f376781m);
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_composition_bsf_enable, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.CompositionOutputConfigCheck", "enableBsf:" + fj7 + " videoSoft:" + z17 + " outputAlignFixResolution:" + outputConfig.B);
        rm5.q qVar = new rm5.q(size2, outputConfig.f376782n, outputConfig.f376783o, outputConfig.f376784p, outputConfig.f376785q, outputConfig.f376786r, outputConfig.f376787s, z19, fj6, false, outputConfig.f376792x, 0, (fj7 || outputConfig.B) ? size : null, 2048, null);
        qVar.f397552q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_composition_codec_check, false);
        return qVar;
    }
}
