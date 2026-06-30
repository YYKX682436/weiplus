package mj1;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.m implements yz5.a {
    public a(java.lang.Object obj) {
        super(0, obj, mj1.b.class, "buildSkylinePerformanceMonitorConfig", "buildSkylinePerformanceMonitorConfig()Lcom/tencent/skyline/SkylinePerformanceMonitorConfig;", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((mj1.b) this.receiver).getClass();
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        boolean z17 = dVar.Ni(e42.c0.clicfg_skyline_enable_slow_frame_detect, 0) == 1;
        int Ni = dVar.Ni(e42.c0.clicfg_skyline_slow_frame_detect_ui_threshold, 0);
        int Ni2 = dVar.Ni(e42.c0.clicfg_skyline_slow_frame_detect_raster_threshold, 0);
        com.tencent.skyline.SlowFrameStackConfig slowFrameStackConfig = new com.tencent.skyline.SlowFrameStackConfig(z17, Ni, Ni2);
        boolean z18 = dVar.Ni(e42.c0.clicfg_skyline_enable_frame_kit, 0) == 1;
        boolean z19 = dVar.Ni(e42.c0.clicfg_skyline_enable_frame_kit_stacktrace, 0) == 1;
        boolean z27 = dVar.Ni(e42.c0.clicfg_skyline_enable_frame_kit_trace_layout_detail, 0) == 1;
        com.tencent.skyline.SlowDisplayFrameConfig slowDisplayFrameConfig = new com.tencent.skyline.SlowDisplayFrameConfig(z18, z19, z27);
        boolean z28 = dVar.Ni(e42.c0.clicfg_skyline_enable_page_monitor_detect, 0) == 1;
        com.tencent.skyline.PageMonitorConfig pageMonitorConfig = new com.tencent.skyline.PageMonitorConfig(z28);
        com.tencent.mars.xlog.Log.i("MicroMsg.SkylineABTest", "buildSkylinePerformanceMonitorConfig, [ slowFrameStackConfig  slowFrameMonitorEnable: %b, slowFrameDetectUIThreshold: %d, slowFrameDetectRasterThreshold: %d ], [ slowDisplayFrameConfig  frameKitEnable: %b, frameKitTraceEnable: %b, frameKitTraceLayoutDetailEnable: %b ], [ pageMonitorConfig  pageMonitorDetectEnable: %b ]", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z28));
        return new com.tencent.skyline.SkylinePerformanceMonitorConfig(slowFrameStackConfig, slowDisplayFrameConfig, pageMonitorConfig);
    }
}
