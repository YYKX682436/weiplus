package ec4;

/* loaded from: classes10.dex */
public final class y implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f251191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s4 f251192e;

    public y(ec4.d0 d0Var, com.tencent.mm.ui.tools.s4 s4Var) {
        this.f251191d = d0Var;
        this.f251192e = s4Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1");
        ec4.d0 d0Var = this.f251191d;
        ec4.d0.R6(d0Var).getViewTreeObserver().removeOnPreDrawListener(this);
        android.view.View R6 = ec4.d0.R6(d0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object value = ((jz5.n) d0Var.f251122e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        ec4.x xVar = new ec4.x(d0Var);
        this.f251192e.c(R6, (android.view.View) value, xVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1");
        return true;
    }
}
