package y84;

/* loaded from: classes4.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(y84.h3 h3Var) {
        super(0);
        this.f460207d = h3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mStarImgBottom$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mStarImgBottom$2");
        android.widget.LinearLayout F = y84.h3.F(this.f460207d);
        android.widget.ImageView imageView = F != null ? (android.widget.ImageView) F.findViewById(com.tencent.mm.R.id.v_j) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mStarImgBottom$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mStarImgBottom$2");
        return imageView;
    }
}
