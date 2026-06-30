package u84;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(u84.m1 m1Var) {
        super(0);
        this.f425691d = m1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mClickArea$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mClickArea$2");
        android.widget.FrameLayout z17 = u84.m1.z(this.f425691d);
        android.view.ViewGroup viewGroup = z17 != null ? (android.view.ViewGroup) z17.findViewById(com.tencent.mm.R.id.f483752by4) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mClickArea$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mClickArea$2");
        return viewGroup;
    }
}
