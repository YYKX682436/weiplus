package h84;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h84.h f279561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h84.h hVar) {
        super(0);
        this.f279561d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaGameGiftTagViewStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaGameGiftTagViewStub$2");
        h84.h hVar = this.f279561d;
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
        android.view.View view = hVar.f279566o;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.q1f) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaGameGiftTagViewStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaGameGiftTagViewStub$2");
        return viewStub;
    }
}
