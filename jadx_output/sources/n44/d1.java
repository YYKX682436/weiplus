package n44;

/* loaded from: classes8.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.f1 f334924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(n44.f1 f1Var) {
        super(0);
        this.f334924d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$topContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$topContainer$2");
        android.view.View h17 = this.f334924d.h();
        android.widget.FrameLayout frameLayout = h17 != null ? (android.widget.FrameLayout) h17.findViewById(com.tencent.mm.R.id.ofg) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$topContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$topContainer$2");
        return frameLayout;
    }
}
