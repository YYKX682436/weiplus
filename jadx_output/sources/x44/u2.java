package x44;

/* loaded from: classes4.dex */
public final class u2 implements x54.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f451903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask f451904b;

    public u2(android.content.Context context, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask adLandingPageChattingTask) {
        this.f451903a = context;
        this.f451904b = adLandingPageChattingTask;
    }

    @Override // x54.a
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$doEnterChatting$1$2$1");
        com.tencent.mars.xlog.Log.i("SnsAdJs.ServiceChat", "the result observer is called!!");
        ((x54.b) this.f451903a).K3(i17);
        if (i17 == 1) {
            this.f451904b.x();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$doEnterChatting$1$2$1");
    }
}
