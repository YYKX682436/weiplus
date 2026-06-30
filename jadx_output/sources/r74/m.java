package r74;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r74.a0 f393225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r74.a0 a0Var) {
        super(0);
        this.f393225d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
        android.view.ViewGroup j17 = this.f393225d.j();
        android.widget.TextView textView = j17 != null ? (android.widget.TextView) j17.findViewById(com.tencent.mm.R.id.dhd) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$mErrorTv$2");
        return textView;
    }
}
