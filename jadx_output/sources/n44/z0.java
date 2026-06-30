package n44;

/* loaded from: classes8.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.f1 f335082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(n44.f1 f1Var) {
        super(0);
        this.f335082d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$halfScreenContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$halfScreenContainer$2");
        android.view.View h17 = this.f335082d.h();
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout halfScreenScrollableFrameLayout = h17 != null ? (com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout) h17.findViewById(com.tencent.mm.R.id.f483436au4) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$halfScreenContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI$halfScreenContainer$2");
        return halfScreenScrollableFrameLayout;
    }
}
