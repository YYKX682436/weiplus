package ec4;

/* loaded from: classes10.dex */
public final class a0 implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f251110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f251111b;

    public a0(ec4.d0 d0Var, boolean z17) {
        this.f251110a = d0Var;
        this.f251111b = z17;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
        jz5.k kVar = new jz5.k("An operation is not implemented: Not yet implemented");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
        throw kVar;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
        new com.tencent.mm.sdk.platformtools.n3().post(new ec4.z(this.f251110a, this.f251111b));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1");
    }
}
