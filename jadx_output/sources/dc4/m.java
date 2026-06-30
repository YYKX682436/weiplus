package dc4;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.p f228780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dc4.p pVar) {
        super(0);
        this.f228780d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoStatusIV$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoStatusIV$2");
        android.view.ViewGroup n17 = this.f228780d.n();
        android.widget.ImageView imageView = n17 != null ? (android.widget.ImageView) n17.findViewById(com.tencent.mm.R.id.nhn) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoStatusIV$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem$mVideoStatusIV$2");
        return imageView;
    }
}
