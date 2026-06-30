package dc4;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.p f228768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dc4.p pVar) {
        super(0);
        this.f228768d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoContainer$2");
        android.view.ViewGroup n17 = this.f228768d.n();
        android.view.ViewGroup viewGroup = n17 != null ? (android.view.ViewGroup) n17.findViewById(com.tencent.mm.R.id.f487008n64) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoContainer$2");
        return viewGroup;
    }
}
