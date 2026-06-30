package u84;

/* loaded from: classes4.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(u84.m1 m1Var) {
        super(0);
        this.f425510d = m1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mStateSettingIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mStateSettingIcon$2");
        android.widget.FrameLayout z17 = u84.m1.z(this.f425510d);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = z17 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) z17.findViewById(com.tencent.mm.R.id.s6m) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mStateSettingIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$mStateSettingIcon$2");
        return weImageView;
    }
}
