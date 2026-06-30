package dc4;

/* loaded from: classes4.dex */
public class e0 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dc4.l0 f228745e;

    public e0(dc4.l0 l0Var) {
        this.f228745e = l0Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        dc4.l0 l0Var = this.f228745e;
        u74.f fVar = l0Var.f228774u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        if (fVar.f425173h != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            l0Var.f228774u.f425173h.c(0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$1");
    }
}
