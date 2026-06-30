package t74;

/* loaded from: classes4.dex */
public final class s1 implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f416243b;

    public s1(t74.w1 w1Var, boolean z17) {
        this.f416242a = w1Var;
        this.f416243b = z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1");
        t74.w1 w1Var = this.f416242a;
        kotlinx.coroutines.y0 h17 = w1Var.h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(t74.w1.P(w1Var)), null, new t74.r1(w1Var, this.f416243b, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1");
    }
}
