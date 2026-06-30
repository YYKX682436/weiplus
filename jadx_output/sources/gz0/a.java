package gz0;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(com.tencent.maas.instamovie.MJExportSettings mJExportSettings) {
        kotlin.jvm.internal.o.g(mJExportSettings, "<this>");
        mJExportSettings.f48116k = true;
        mJExportSettings.f48119n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_template_cover_blackness_ratio_threshold, 0.0f);
        mJExportSettings.f48118m = com.tencent.maas.model.time.MJTime.fromMilliseconds(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_sns_template_cover_frame_max_duration, 1500L));
        mJExportSettings.f48117l = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_template_cover_frame_interval, 15);
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_template_cover_clarity_threshold, -1.0f);
        mJExportSettings.f48120o = Di < 0.0f ? Float.POSITIVE_INFINITY : Di;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsMaasMovieSessionConfigProviderImpl", "provideExportSettings: Cover DetectionEnable=" + mJExportSettings.isCoverImageDetectionEnabled() + ", DarkThreshold=" + mJExportSettings.getCoverImageDetectionDarknessRatioThreshold() + ", MaxDuration=" + mJExportSettings.getCoverImageDetectionMaxDuration() + ", FrameInterval=" + mJExportSettings.getCoverImageDetectionFrameInterval() + ", ClarityThreshold=" + Di);
    }
}
