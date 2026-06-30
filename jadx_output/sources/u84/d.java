package u84;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.k f425511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u84.k kVar) {
        super(0);
        this.f425511d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$mHighLightTitle$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$mHighLightTitle$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMHighlightTagView$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        android.widget.FrameLayout frameLayout = this.f425511d.f425566s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMHighlightTagView$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
        android.widget.TextView textView = frameLayout != null ? (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.s6i) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$mHighLightTitle$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$mHighLightTitle$2");
        return textView;
    }
}
