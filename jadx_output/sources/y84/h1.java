package y84;

/* loaded from: classes4.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(y84.h3 h3Var) {
        super(0);
        this.f460070d = h3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mNickNameTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mNickNameTv$2");
        android.view.View W = this.f460070d.W();
        com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = W != null ? (com.tencent.mm.plugin.sns.ui.AsyncTextView) W.findViewById(com.tencent.mm.R.id.kbq) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mNickNameTv$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$mNickNameTv$2");
        return asyncTextView;
    }
}
