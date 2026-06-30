package r74;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r74.k f393207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r74.k kVar) {
        super(0);
        this.f393207d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
        android.view.ViewGroup L = this.f393207d.L();
        android.view.ViewGroup viewGroup = L != null ? (android.view.ViewGroup) L.findViewById(com.tencent.mm.R.id.f487008n64) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
        return viewGroup;
    }
}
