package l44;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ad.helper.AdExpConfig");
        int u07 = ca4.m0.u0(e42.c0.clicfg_ad_load_big_image, 0);
        boolean z17 = u07 > 0;
        com.tencent.mars.xlog.Log.i("AdExpConfig", "isAdLoadBigImage, value=" + u07 + ", ret=" + z17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.q.CTRL_INDEX, z17 ? 15 : 16);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ad.helper.AdExpConfig");
        return z17;
    }

    public static final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDisableNinePicLoadBigImage", "com.tencent.mm.plugin.sns.ad.helper.AdExpConfig");
        int u07 = ca4.m0.u0(e42.c0.clicfg_disable_nine_pic_load_big_image, 0);
        boolean z17 = u07 > 0;
        com.tencent.mars.xlog.Log.i("AdExpConfig", "isDisableNinePicLoadBigImage, value=" + u07 + ", ret=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisableNinePicLoadBigImage", "com.tencent.mm.plugin.sns.ad.helper.AdExpConfig");
        return z17;
    }
}
