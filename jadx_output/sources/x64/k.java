package x64;

/* loaded from: classes4.dex */
public class k implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f452305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x64.l f452307c;

    public k(x64.l lVar, long j17, android.content.Context context) {
        this.f452307c = lVar;
        this.f452305a = j17;
        this.f452306b = context;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick$1");
        com.tencent.mars.xlog.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "showLivingRoom, snsId=" + str + ", errCode=" + i18 + ", actionType=" + i17 + ", adFinderLivingProductId=" + this.f452305a);
        if (i18 != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            android.content.Context context = this.f452306b;
            this.f452307c.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick$1");
    }
}
