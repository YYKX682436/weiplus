package d84;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d84.j0 j0Var) {
        super(0);
        this.f227072d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mClickArea$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mClickArea$2");
        android.widget.LinearLayout E = d84.j0.E(this.f227072d);
        android.view.View findViewById = E != null ? E.findViewById(com.tencent.mm.R.id.f483752by4) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mClickArea$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mClickArea$2");
        return findViewById;
    }
}
