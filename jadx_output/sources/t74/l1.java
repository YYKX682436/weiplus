package t74;

/* loaded from: classes4.dex */
public final class l1 implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f416186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f416187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f416188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f416190f;

    public l1(t74.w1 w1Var, android.view.ViewGroup viewGroup, int i17, int i18, int i19, boolean z17) {
        this.f416185a = w1Var;
        this.f416186b = viewGroup;
        this.f416187c = i17;
        this.f416188d = i18;
        this.f416189e = i19;
        this.f416190f = z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1");
        t74.w1 w1Var = this.f416185a;
        kotlinx.coroutines.y0 h17 = w1Var.h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(t74.w1.P(w1Var)), null, new t74.k1(this.f416185a, this.f416186b, this.f416187c, this.f416188d, this.f416189e, this.f416190f, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1");
    }
}
