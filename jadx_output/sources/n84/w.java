package n84;

/* loaded from: classes4.dex */
public abstract class w {
    public static void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("d", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("d", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        com.tencent.mars.xlog.Log.e("AlphaPlayer_" + str, java.lang.String.valueOf(str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        com.tencent.mars.xlog.Log.e("AlphaPlayer_" + str, java.lang.String.valueOf(str2), th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    public static void d(java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        com.tencent.mars.xlog.Log.e("AlphaPlayer_", java.lang.String.valueOf(str), th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("i", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        com.tencent.mars.xlog.Log.i("AlphaPlayer_" + str, java.lang.String.valueOf(str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("i", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }
}
