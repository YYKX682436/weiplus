package dc4;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.i f228723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dc4.i iVar) {
        super(0);
        this.f228723d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
        dc4.i iVar = this.f228723d;
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        android.view.ViewGroup viewGroup = iVar.f228758v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        android.view.ViewGroup viewGroup2 = viewGroup != null ? (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f487008n64) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
        return viewGroup2;
    }
}
