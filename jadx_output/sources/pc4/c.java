package pc4;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final pc4.c f353409d = new pc4.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_support_hdr_video, true)) {
            ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
            yr2.e eVar = yr2.e.f464664a;
            boolean b17 = eVar.b();
            ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
            boolean c17 = eVar.c();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "codecHdr10Support:" + b17 + " codecHdrHlgSupport:" + c17);
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.Display.HdrCapabilities hdrCapabilities = ((android.view.WindowManager) systemService).getDefaultDisplay().getHdrCapabilities();
            if (hdrCapabilities == null) {
                valueOf = java.lang.Boolean.FALSE;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
            } else {
                int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                kotlin.jvm.internal.o.f(supportedHdrTypes, "getSupportedHdrTypes(...)");
                boolean F = kz5.z.F(supportedHdrTypes, 2);
                int[] supportedHdrTypes2 = hdrCapabilities.getSupportedHdrTypes();
                kotlin.jvm.internal.o.f(supportedHdrTypes2, "getSupportedHdrTypes(...)");
                boolean F2 = kz5.z.F(supportedHdrTypes2, 3);
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "screenHdr10Support:" + F + " screenHdrHlgSupport:" + F2);
                valueOf = java.lang.Boolean.valueOf(b17 && c17 && F && F2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "supportHdr config false");
            valueOf = java.lang.Boolean.FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig$supportHdr$2");
        return valueOf;
    }
}
