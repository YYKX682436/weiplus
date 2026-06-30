package m44;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDecodeFailInfo", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDecodeFailInfo", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(2001L, 16L);
        com.tencent.mars.xlog.Log.w("AdAvifReporter", "reportDecodeFailDeviceInfo, isSuccess=false, imgUrl=".concat(str));
        ca4.e0.b("ad_avif_decode_fail", str, 0, 0, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDecodeFailInfo", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
    }

    public static final void b(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDecodeResult", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(2001L, z17 ? 12 : 13);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDecodeResult", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
    }

    public static final void c(boolean z17, java.lang.String str, java.lang.String scene) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDecodeResultByKV", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        kotlin.jvm.internal.o.g(scene, "scene");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDecodeResultByKV", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
            return;
        }
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.w("AdAvifReporter", "reportDecodeResultByKV, isSuc=false, scene=" + scene + ", url=" + str);
        ca4.e0.b("ad_avif_decode_fail", str, 0, 0, scene);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDecodeResultByKV", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
    }

    public static final void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportFileAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        if (str3 == null || str3.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFileAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new m44.c(str3, str, str2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportFileAvif", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter");
        }
    }
}
