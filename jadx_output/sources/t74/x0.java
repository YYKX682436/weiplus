package t74;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(t74.w1 w1Var) {
        super(0);
        this.f416299d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFlipIntroduceFrontIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFlipIntroduceFrontIcon$2");
        t74.b2 t07 = this.f416299d.t0();
        android.widget.ImageView imageView = (t07 == null || (b17 = t07.b()) == null) ? null : (android.widget.ImageView) b17.findViewById(com.tencent.mm.R.id.f485018tx5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFlipIntroduceFrontIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$mFlipIntroduceFrontIcon$2");
        return imageView;
    }
}
