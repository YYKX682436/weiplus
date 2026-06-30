package j94;

/* loaded from: classes4.dex */
public final class e implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f298548a;

    public e(android.content.Context context) {
        this.f298548a = context;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper$jumpFinderLive$1");
        com.tencent.mars.xlog.Log.i("WsFoldJumpFinderLiveHelper", "showLivingRoom, snsId=%s, actionType=%d, errCode=%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != 0) {
            android.content.Context context = this.f298548a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("WsFoldJumpFinderLiveHelper", "showErrorToast exp=%s", th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper$jumpFinderLive$1");
    }
}
