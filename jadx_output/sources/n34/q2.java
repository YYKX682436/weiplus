package n34;

@j95.b
/* loaded from: classes4.dex */
public class q2 extends i95.w implements p94.e0 {
    public java.lang.String Ai() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.PluginSns");
        java.lang.String str = com.tencent.mm.vfs.q7.c("sns") + "/temp/";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccSnsTmpPath", "com.tencent.mm.plugin.sns.PluginSns");
        return str;
    }

    public java.lang.String Bi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdLandingPagesPath", "com.tencent.mm.plugin.sns.PluginSns");
        java.lang.String str = com.tencent.mm.vfs.q7.c("sns_ad_landingpages") + "/";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdLandingPagesPath", "com.tencent.mm.plugin.sns.PluginSns");
        return str;
    }

    public java.lang.String wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.PluginSns");
        java.lang.String str = com.tencent.mm.vfs.q7.c("sns") + "/";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.PluginSns");
        return str;
    }
}
