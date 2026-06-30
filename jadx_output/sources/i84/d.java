package i84;

/* loaded from: classes13.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView f289653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView seekBarView, int i17) {
        super(0);
        this.f289653d = seekBarView;
        this.f289654e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView.f163296w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$get_convertToXmlPx$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        yz5.l lVar = this.f289653d.f163306p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$get_convertToXmlPx$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (lVar != null ? ((java.lang.Number) lVar.invoke(java.lang.Integer.valueOf(this.f289654e))).floatValue() : 0.0f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
        return valueOf;
    }
}
