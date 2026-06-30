package v74;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f433939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v74.k0 k0Var) {
        super(0);
        this.f433939d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mItemSpace$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mItemSpace$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMActivity$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        android.app.Activity activity = this.f433939d.f433837c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMActivity$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i65.a.b(activity, 12));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mItemSpace$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mItemSpace$2");
        return valueOf;
    }
}
