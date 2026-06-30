package py0;

/* loaded from: classes5.dex */
public final class a implements dz0.e {

    /* renamed from: a, reason: collision with root package name */
    public static final py0.a f358965a = new py0.a();

    @Override // dz0.e
    public java.lang.Object a(java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.modelcontrol.VideoTransPara hj6 = d11.s.fj().hj();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_maas_export_video_fps, 30);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_maas_export_video_bitrate, 0);
        int i17 = (Ni2 == 0 ? hj6.f71194g : Ni2) / Ni;
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_maas_export_dimension_level, 0);
        if (Ni3 == 0) {
            Ni3 = hj6.f71191d;
        }
        rg.c cVar = Ni3 > 1080 ? rg.c.DIMENSION_LEVEL_1440 : Ni3 > 720 ? rg.c.DIMENSION_LEVEL_1080 : Ni3 > 540 ? rg.c.DIMENSION_LEVEL_720 : rg.c.DIMENSION_LEVEL_540;
        com.tencent.mars.xlog.Log.i("FinderMaasMovieSessionConfigProviderImpl", "provideExportSettings: fps: " + Ni + ", iframeInterval: " + (hj6.f71197m * Ni) + ", videoBitrate: " + i17 + ", xVideoBitrate:" + Ni2 + ", configBitrate:" + hj6.f71194g + ", audioBitrate: " + hj6.f71198n + ", dimension: " + Ni3);
        return new com.tencent.maas.instamovie.MJExportSettings(Ni == 60 ? com.tencent.maas.instamovie.mediafoundation.FrameRate.f48199h : com.tencent.maas.instamovie.mediafoundation.FrameRate.f48196e, i17, hj6.f71198n, rg.e.H264, rg.a.MPEG4AAC, rg.d.MP4, cVar, hj6.f71197m * Ni);
    }
}
