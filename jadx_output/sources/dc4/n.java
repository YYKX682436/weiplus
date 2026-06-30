package dc4;

/* loaded from: classes4.dex */
public final class n implements z74.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.p f228782a;

    public n(dc4.p pVar) {
        this.f228782a = pVar;
    }

    @Override // z74.a
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldLoopPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$videoCallbackHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        dc4.p pVar = this.f228782a;
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        boolean z17 = pVar.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        boolean z18 = !z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldLoopPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$videoCallbackHelper$1");
        return z18;
    }
}
