package dc4;

/* loaded from: classes4.dex */
public final class o implements z74.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.p f228784a;

    public o(dc4.p pVar) {
        this.f228784a = pVar;
    }

    @Override // z74.c
    public final void a(android.view.View view, z74.b event, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$videoCallbackListener$1");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$Companion");
        com.tencent.mars.xlog.Log.i("AdDynamicViewDetailItem", "the video call back " + event + ", duration: " + i17 + ", progress: " + i18);
        s74.o2 l17 = this.f228784a.l();
        if (l17 != null) {
            l17.W(event, i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$videoCallbackListener$1");
    }
}
