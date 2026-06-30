package y84;

/* loaded from: classes4.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(y84.h3 h3Var) {
        super(0);
        this.f460125d = h3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mRecyclerContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mRecyclerContainer$2");
        android.widget.LinearLayout F = y84.h3.F(this.f460125d);
        android.widget.FrameLayout frameLayout = F != null ? (android.widget.FrameLayout) F.findViewById(com.tencent.mm.R.id.ufg) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mRecyclerContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mRecyclerContainer$2");
        return frameLayout;
    }
}
